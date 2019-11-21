package com.clarifai;

import com.clarifai.channel.ClarifaiChannel;
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.clarifai.grpc.api.*;
import com.clarifai.grpc.api.status.BaseResponse;
import com.clarifai.grpc.api.status.StatusCode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrpcIntTest {

  private V2Grpc.V2BlockingStub stub;

  @Before
  public void before() {
    stub = V2Grpc.newBlockingStub(
        ClarifaiChannel.INSTANCE.getInsecureGrpcChannel()
    ).withCallCredentials(new ClarifaiCallCredentials());
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
        SingleInputCountResponse inputCount = stub.getInputCount(
            GetInputCountRequest.newBuilder().build()
        );
        if (inputCount.getCounts().getToProcess() == 0 &&
            inputCount.getCounts().getProcessing() == 0) {
          break;
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
}
