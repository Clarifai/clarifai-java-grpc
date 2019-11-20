package com.clarifai;

import com.clarifai.channel.ClarifaiChannel;
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.clarifai.grpc.api.*;
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
}
