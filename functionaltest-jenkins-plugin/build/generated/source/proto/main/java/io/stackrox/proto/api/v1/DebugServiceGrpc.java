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
 * APIs for debugging.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/debug_service.proto")
public final class DebugServiceGrpc {

  private DebugServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.DebugService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest,
      io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse> getGetLogLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogLevel",
      requestType = io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest.class,
      responseType = io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest,
      io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse> getGetLogLevelMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest, io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse> getGetLogLevelMethod;
    if ((getGetLogLevelMethod = DebugServiceGrpc.getGetLogLevelMethod) == null) {
      synchronized (DebugServiceGrpc.class) {
        if ((getGetLogLevelMethod = DebugServiceGrpc.getGetLogLevelMethod) == null) {
          DebugServiceGrpc.getGetLogLevelMethod = getGetLogLevelMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest, io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DebugService", "GetLogLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DebugServiceMethodDescriptorSupplier("GetLogLevel"))
                  .build();
          }
        }
     }
     return getGetLogLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest,
      com.google.protobuf.Empty> getSetLogLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLogLevel",
      requestType = io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest,
      com.google.protobuf.Empty> getSetLogLevelMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest, com.google.protobuf.Empty> getSetLogLevelMethod;
    if ((getSetLogLevelMethod = DebugServiceGrpc.getSetLogLevelMethod) == null) {
      synchronized (DebugServiceGrpc.class) {
        if ((getSetLogLevelMethod = DebugServiceGrpc.getSetLogLevelMethod) == null) {
          DebugServiceGrpc.getSetLogLevelMethod = getSetLogLevelMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DebugService", "SetLogLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DebugServiceMethodDescriptorSupplier("SetLogLevel"))
                  .build();
          }
        }
     }
     return getSetLogLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DebugServiceStub newStub(io.grpc.Channel channel) {
    return new DebugServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DebugServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DebugServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DebugServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DebugServiceFutureStub(channel);
  }

  /**
   * <pre>
   * APIs for debugging.
   * </pre>
   */
  public static abstract class DebugServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the current logging level for StackRox services.
     * </pre>
     */
    public void getLogLevel(io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLogLevelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set logging level for StackRox services.
     * </pre>
     */
    public void setLogLevel(io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetLogLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLogLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest,
                io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse>(
                  this, METHODID_GET_LOG_LEVEL)))
          .addMethod(
            getSetLogLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_LOG_LEVEL)))
          .build();
    }
  }

  /**
   * <pre>
   * APIs for debugging.
   * </pre>
   */
  public static final class DebugServiceStub extends io.grpc.stub.AbstractStub<DebugServiceStub> {
    private DebugServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DebugServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DebugServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current logging level for StackRox services.
     * </pre>
     */
    public void getLogLevel(io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLogLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set logging level for StackRox services.
     * </pre>
     */
    public void setLogLevel(io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetLogLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * APIs for debugging.
   * </pre>
   */
  public static final class DebugServiceBlockingStub extends io.grpc.stub.AbstractStub<DebugServiceBlockingStub> {
    private DebugServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DebugServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DebugServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current logging level for StackRox services.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse getLogLevel(io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLogLevelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set logging level for StackRox services.
     * </pre>
     */
    public com.google.protobuf.Empty setLogLevel(io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetLogLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * APIs for debugging.
   * </pre>
   */
  public static final class DebugServiceFutureStub extends io.grpc.stub.AbstractStub<DebugServiceFutureStub> {
    private DebugServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DebugServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DebugServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current logging level for StackRox services.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse> getLogLevel(
        io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLogLevelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set logging level for StackRox services.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setLogLevel(
        io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetLogLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOG_LEVEL = 0;
  private static final int METHODID_SET_LOG_LEVEL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DebugServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DebugServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOG_LEVEL:
          serviceImpl.getLogLevel((io.stackrox.proto.api.v1.DebugServiceOuterClass.GetLogLevelRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelResponse>) responseObserver);
          break;
        case METHODID_SET_LOG_LEVEL:
          serviceImpl.setLogLevel((io.stackrox.proto.api.v1.DebugServiceOuterClass.LogLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class DebugServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DebugServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.DebugServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DebugService");
    }
  }

  private static final class DebugServiceFileDescriptorSupplier
      extends DebugServiceBaseDescriptorSupplier {
    DebugServiceFileDescriptorSupplier() {}
  }

  private static final class DebugServiceMethodDescriptorSupplier
      extends DebugServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DebugServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DebugServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DebugServiceFileDescriptorSupplier())
              .addMethod(getGetLogLevelMethod())
              .addMethod(getSetLogLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
