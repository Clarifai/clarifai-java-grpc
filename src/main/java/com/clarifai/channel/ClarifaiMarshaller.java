package com.clarifai.channel;

import com.google.protobuf.Message;
import io.grpc.MethodDescriptor;

public final class ClarifaiMarshaller {

    private ClarifaiMarshaller() {}

    /**
     * Create a {@code Marshaller} for json protos of the same type as {@code defaultInstance}.
     *
     * <p>This is an unstable API and has not been optimized yet for performance.
     */
    public static <T extends Message> MethodDescriptor.Marshaller<T> marshaller(final T defaultInstance) {
        if (true) {
            return JsonMarshaller.jsonMarshaller(defaultInstance);
        } else {
            return io.grpc.protobuf.ProtoUtils.marshaller(defaultInstance);
        }
    }
}
