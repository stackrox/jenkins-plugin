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
 * <pre>
 * FeatureFlagService retrieves information about feature flags.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/feature_flag_service.proto")
public final class FeatureFlagServiceGrpc {

  private FeatureFlagServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.FeatureFlagService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse> getGetFeatureFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeatureFlags",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse> getGetFeatureFlagsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse> getGetFeatureFlagsMethod;
    if ((getGetFeatureFlagsMethod = FeatureFlagServiceGrpc.getGetFeatureFlagsMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getGetFeatureFlagsMethod = FeatureFlagServiceGrpc.getGetFeatureFlagsMethod) == null) {
          FeatureFlagServiceGrpc.getGetFeatureFlagsMethod = getGetFeatureFlagsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.FeatureFlagService", "GetFeatureFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("GetFeatureFlags"))
                  .build();
          }
        }
     }
     return getGetFeatureFlagsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeatureFlagServiceStub newStub(io.grpc.Channel channel) {
    return new FeatureFlagServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeatureFlagServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeatureFlagServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeatureFlagServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeatureFlagServiceFutureStub(channel);
  }

  /**
   * <pre>
   * FeatureFlagService retrieves information about feature flags.
   * </pre>
   */
  public static abstract class FeatureFlagServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFeatureFlags(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeatureFlagsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeatureFlagsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse>(
                  this, METHODID_GET_FEATURE_FLAGS)))
          .build();
    }
  }

  /**
   * <pre>
   * FeatureFlagService retrieves information about feature flags.
   * </pre>
   */
  public static final class FeatureFlagServiceStub extends io.grpc.stub.AbstractStub<FeatureFlagServiceStub> {
    private FeatureFlagServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeatureFlagServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFeatureFlags(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeatureFlagsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * FeatureFlagService retrieves information about feature flags.
   * </pre>
   */
  public static final class FeatureFlagServiceBlockingStub extends io.grpc.stub.AbstractStub<FeatureFlagServiceBlockingStub> {
    private FeatureFlagServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeatureFlagServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse getFeatureFlags(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetFeatureFlagsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * FeatureFlagService retrieves information about feature flags.
   * </pre>
   */
  public static final class FeatureFlagServiceFutureStub extends io.grpc.stub.AbstractStub<FeatureFlagServiceFutureStub> {
    private FeatureFlagServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeatureFlagServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse> getFeatureFlags(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeatureFlagsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE_FLAGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeatureFlagServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeatureFlagServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE_FLAGS:
          serviceImpl.getFeatureFlags((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.GetFeatureFlagsResponse>) responseObserver);
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

  private static abstract class FeatureFlagServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeatureFlagServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.FeatureFlagServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeatureFlagService");
    }
  }

  private static final class FeatureFlagServiceFileDescriptorSupplier
      extends FeatureFlagServiceBaseDescriptorSupplier {
    FeatureFlagServiceFileDescriptorSupplier() {}
  }

  private static final class FeatureFlagServiceMethodDescriptorSupplier
      extends FeatureFlagServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeatureFlagServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeatureFlagServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeatureFlagServiceFileDescriptorSupplier())
              .addMethod(getGetFeatureFlagsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
