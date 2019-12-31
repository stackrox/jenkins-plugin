package io.stackrox.proto.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/metadata_service.proto")
public final class MetadataServiceGrpc {

  private MetadataServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.MetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata> getGetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetadata",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata> getGetMetadataMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata> getGetMetadataMethod;
    if ((getGetMetadataMethod = MetadataServiceGrpc.getGetMetadataMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetMetadataMethod = MetadataServiceGrpc.getGetMetadataMethod) == null) {
          MetadataServiceGrpc.getGetMetadataMethod = getGetMetadataMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.MetadataService", "GetMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetMetadata"))
                  .build();
          }
        }
     }
     return getGetMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataServiceStub newStub(io.grpc.Channel channel) {
    return new MetadataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetadataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetadataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MetadataServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMetadata(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMetadataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata>(
                  this, METHODID_GET_METADATA)))
          .build();
    }
  }

  /**
   */
  public static final class MetadataServiceStub extends io.grpc.stub.AbstractStub<MetadataServiceStub> {
    private MetadataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMetadata(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetadataServiceBlockingStub extends io.grpc.stub.AbstractStub<MetadataServiceBlockingStub> {
    private MetadataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata getMetadata(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetadataServiceFutureStub extends io.grpc.stub.AbstractStub<MetadataServiceFutureStub> {
    private MetadataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata> getMetadata(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_METADATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetadataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_METADATA:
          serviceImpl.getMetadata((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetadataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.MetadataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetadataService");
    }
  }

  private static final class MetadataServiceFileDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier {
    MetadataServiceFileDescriptorSupplier() {}
  }

  private static final class MetadataServiceMethodDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetadataServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetadataServiceFileDescriptorSupplier())
              .addMethod(getGetMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
