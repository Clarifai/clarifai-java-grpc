package com.clarifai;

import com.clarifai.channel.ClarifaiChannel;
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.clarifai.grpc.api.*;
import com.clarifai.grpc.api.status.BaseResponse;
import com.clarifai.grpc.api.status.StatusCode;
import io.grpc.ManagedChannel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class GrpcIntTest {

  private V2Grpc.V2BlockingStub stub;
  private ManagedChannel channel;

  @Before
  public void before() {
    channel = ClarifaiChannel.INSTANCE.getGrpcChannel();
    stub = V2Grpc.newBlockingStub(channel)
        .withCallCredentials(new ClarifaiCallCredentials());
  }

  @After
  public void after() throws InterruptedException {
    // If we don't shutdown the channel, it complains to the logs.
    channel.shutdown();
    channel.awaitTermination(5, TimeUnit.SECONDS);
  }

  @Test
  public void getModel() {
    SingleModelResponse response = stub.getModel(
        GetModelRequest.newBuilder()
            .setModelId("aaa03c23b3724a16a56b629203edc62c")
            .build()
    );

    Assert.assertEquals("general", response.getModel().getName());
  }

  @Test
  public void listModelsWithPagination() {
    MultiModelResponse twoModelsResponse = stub.listModels(
        ListModelsRequest.newBuilder()
            .setPerPage(2)
            .build()
    );

    Assert.assertEquals(2, twoModelsResponse.getModelsList().size());

    // We shouldn't have 1000*500 number of models, so the
    // result should be empty.
    MultiModelResponse emptyResponse = stub.listModels(
        ListModelsRequest.newBuilder()
            .setPage(1000)
            .setPerPage(500)
            .build()
    );

    Assert.assertEquals(0, emptyResponse.getModelsList().size());
  }

  @Test
  public void postModelOutputs() {
    MultiOutputResponse response = stub.postModelOutputs(
        PostModelOutputsRequest.newBuilder()
            .setModelId("aaa03c23b3724a16a56b629203edc62c")
            .addInputs(
                Input.newBuilder().setData(
                    Data.newBuilder().setImage(
                        Image.newBuilder().setUrl(
                            "https://samples.clarifai.com/dog2.jpeg"
                        )
                    )
                )
            )
            .build()
    );

    Assert.assertNotEquals(0, response.getOutputs(0).getData().getConceptsList().size());

    for (Concept c : response.getOutputs(0).getData().getConceptsList()) {
      System.out.println(c);
    }
  }

  @Test public void addModifyGetAndDeleteInput() throws InterruptedException {
    String truckUrl = "https://s3.amazonaws.com/samples.clarifai.com/red-truck.png";

    MultiInputResponse addResponse = stub.postInputs(
        PostInputsRequest.newBuilder()
            .addInputs(
                Input.newBuilder()
                    .setData(
                        Data.newBuilder()
                            .setImage(
                                Image.newBuilder()
                                    .setUrl(truckUrl)
                                    .setAllowDuplicateUrl(true)
                                    .build()
                            )
                            .addConcepts(Concept.newBuilder().setId("some-concept").build())
                            .build()
                    ).build()
            ).build()
    );
    Assert.assertEquals(StatusCode.SUCCESS, addResponse.getStatus().getCode());

    String inputId = addResponse.getInputs(0).getId();

    try {
      while (true) {
        SingleInputResponse inputResponse = stub.getInput(GetInputRequest.newBuilder().setInputId(inputId).build());

        StatusCode code = inputResponse.getInput().getStatus().getCode();
        if (code == StatusCode.INPUT_DOWNLOAD_SUCCESS) {
          break;
        } else if (!(code == StatusCode.INPUT_DOWNLOAD_PENDING ||
            code == StatusCode.INPUT_DOWNLOAD_IN_PROGRESS)) {
          throw new RuntimeException(String.format(
              "Input %s download was not successful: %s", inputId, code
          ));
        }

        Thread.sleep(200);
      }

      MultiInputResponse patchResponse = stub.patchInputs(
          PatchInputsRequest.newBuilder()
              .setAction("overwrite")
              .addInputs(
                  Input.newBuilder()
                      .setId(inputId)
                      .setData(
                          Data.newBuilder()
                              .addConcepts(Concept.newBuilder().setId("some-new-concept"))
                              .build()
                      ).build()
              ).build()
      );

      Assert.assertEquals(StatusCode.SUCCESS, patchResponse.getStatus().getCode());

      SingleInputResponse getResponse = stub.getInput(
          GetInputRequest.newBuilder()
              .setInputId(inputId)
              .build()
      );
      Assert.assertEquals("some-new-concept", getResponse.getInput().getData().getConcepts(0).getId());
    } finally {
      BaseResponse deleteResponse = stub.deleteInput(
          DeleteInputRequest.newBuilder()
              .setInputId(inputId)
              .build()
      );
      Assert.assertEquals(StatusCode.SUCCESS, deleteResponse.getStatus().getCode());
    }
  }

  @Test
  public void listCollaborators() {
    V2Grpc.V2BlockingStub stubWithPat = V2Grpc.newBlockingStub(channel)
        .withCallCredentials(new ClarifaiCallCredentials(System.getenv("CLARIFAI_PAT_KEY")));

    MultiAppResponse listAppsResponse = stubWithPat.listApps(
      ListAppsRequest.newBuilder()
      .build()
    );
    Assert.assertEquals(StatusCode.SUCCESS, listAppsResponse.getStatus().getCode());

    String appId = listAppsResponse.getApps(0).getId();

    MultiCollaboratorsResponse listCollaboratorsResponse = stubWithPat.listCollaborators(
      ListCollaboratorsRequest.newBuilder()
        .setUserAppId(
          UserAppIDSet.newBuilder()
            .setAppId(appId)
            .setUserId("me")
        )
        .build()
    );
    Assert.assertEquals(StatusCode.SUCCESS, listCollaboratorsResponse.getStatus().getCode());
  }
}
