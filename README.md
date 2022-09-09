![Clarifai logo](docs/logo.png)

# Clarifai Java gRPC Client

This is the official Clarifai gRPC Java client for interacting with our powerful recognition
[API](https://docs.clarifai.com).
Clarifai provides a platform for data scientists, developers, researchers and enterprises to master the entire
artificial intelligence lifecycle. Gather valuable business insights from images, video and text using computer vision
and natural language processing.

* Try the Clarifai demo at: https://clarifai.com/demo
* Sign up for a free account at: https://portal.clarifai.com/signup
* Read the documentation at: https://docs.clarifai.com/


[ ![Download](https://api.bintray.com/packages/clarifai/Clarifai/ClarifaiGrpc/images/download.svg) ](https://bintray.com/clarifai/Clarifai/ClarifaiGrpc)
[![Build](https://github.com/Clarifai/clarifai-java-grpc/workflows/Run%20tests/badge.svg)](https://github.com/Clarifai/clarifai-java-grpc/actions)

## Installation

Via Gradle:

```
repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.clarifai:clarifai-grpc:LATEST_VERSION'
}
```

Via Maven:

```
<repositories>
    <repository>
        <id>mavenCentral</id>
        <name>mavenCentral</name>
        <url>http://repo1.maven.org/maven2</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.clarifai</groupId>
        <artifactId>clarifai-grpc</artifactId>
        <version>LATEST_VERSION</version>
    </dependency>
</dependencies>
```

## Versioning

This library doesn't use semantic versioning. The first two version numbers (`X.Y` out of `X.Y.Z`) follow the API (backend) versioning, and
whenever the API gets updated, this library follows it.

The third version number (`Z` out of `X.Y.Z`) is used by this library for any independent releases of library-specific improvements and bug fixes.

## Getting started

Construct the *Stub* object using which you'll access all the Clarifai API functionality:

```java
import com.clarifai.channel.ClarifaiChannel;
import io.grpc.Channel;

...

V2Grpc.V2BlockingStub stub = V2Grpc.newBlockingStub(ClarifaiChannel.INSTANCE.getGrpcChannel())
    .withCallCredentials(new ClarifaiCallCredentials("YOUR_CLARIFAI_API_KEY"));
```

> Alternatives to the encrypted gRPC channel (`ClarifaiChannel.INSTANCE.getGrpcChannel()`) are:
> - the HTTPS+JSON channel (`ClarifaiChannel.INSTANCE.getJsonChannel()`), and
> - the unencrypted gRPC channel (`ClarifaiChannel.INSTANCE.getInsecureGrpcChannel()`).
>
> We only recommend them in special cases.


Predict concepts in an image:

```java
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.clarifai.grpc.api.*;
import com.clarifai.grpc.api.status.StatusCode;

...

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
