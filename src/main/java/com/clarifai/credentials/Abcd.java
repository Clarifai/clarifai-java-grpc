package com.clarifai.credentials;

import io.grpc.CallCredentials;

import java.util.concurrent.Executor;

public class Abcd extends CallCredentials {
    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor appExecutor, MetadataApplier applier) {

    }

    @Override
    public void thisUsesUnstableApi() {

    }
}
