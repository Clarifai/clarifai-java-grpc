![Clarifai logo](docs/logo.png)

# Clarifai Java gRPC Client

This is the official Clarifai Java gRPC client.

In addition to the actual gRPC channel, it is also possible to use a JSON channel, which uses 
JSON & HTTP/REST, while using the same request / response handling code.

![Build](https://github.com/Clarifai/clarifai-java-grpc/workflows/Run%20tests/badge.svg)
[ ![Download](https://api.bintray.com/packages/clarifai/Clarifai/ClarifaiGrpc/images/download.svg) ](https://bintray.com/clarifai/Clarifai/ClarifaiGrpc)

## Installation

Via Gradle:

```
repositories {
    jcenter()
}

dependencies {
    implementation 'com.clarifai:clarifai-grpc:LATEST_VERSION'
}
```

## Getting started

```java
import com.clarifai.channel.ClarifaiChannel;
import io.grpc.Channel;

...

// Construct one of the channels you want to use
Channel channel = ClarifaiChannel.INSTANCE.getJsonChannel();
Channel channel = ClarifaiChannel.INSTANCE.getInsecureGrpcChannel();

// Note: You can also use a secure (encrypted) ClarifaiChannel.INSTANCE.getGrpcChannel() however
// it is currently not supported in the latest gRPC version.
```

Predict concepts in an image:

```java
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.clarifai.grpc.api.*;
import com.clarifai.grpc.api.status.StatusCode;

...

V2Grpc.V2BlockingStub stub = V2Grpc.newBlockingStub(channel)
    .withCallCredentials(new ClarifaiCallCredentials("YOUR_CLARIFAI_API_KEY"));

MultiOutputResponse response = stub.postModelOutputs(
    PostModelOutputsRequest.newBuilder()
        .setModelId("aaa03c23b3724a16a56b629203edc62c")
        .addInputs(
            Input.newBuilder().setData(
                Data.newBuilder().setImage(
                    Image.newBuilder().setUrl("YOUR_IMAGE_URL")
                )
            )
        )
        .build()
);

if (response.getStatus().getCode() != StatusCode.SUCCESS) {
  throw new RuntimeException("Request failed, status: " + response.getStatus());
}

for (Concept c : response.getOutputs(0).getData().getConceptsList()) {
  System.out.println(String.format("%12s: %,.2f", c.getName(), c.getValue()));
}
```
