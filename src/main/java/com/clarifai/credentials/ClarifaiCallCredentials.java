package com.clarifai.credentials;


import io.grpc.Attributes;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

import java.util.concurrent.Executor;

public class ClarifaiCallCredentials implements CallCredentials {

    private final String apiKey;

    public ClarifaiCallCredentials() {
        this(System.getenv("CLARIFAI_API_KEY"));
    }

    public ClarifaiCallCredentials(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void applyRequestMetadata(MethodDescriptor<?, ?> method, Attributes attrs, Executor appExecutor, MetadataApplier applier) {
        appExecutor.execute(() -> {
            Metadata headers = new Metadata();
            Metadata.Key<String> authorization = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
            headers.put(authorization, "Key " + this.apiKey);
                applier.apply(headers);
            });
        }

    @Override
    public void thisUsesUnstableApi() {
    }
}
