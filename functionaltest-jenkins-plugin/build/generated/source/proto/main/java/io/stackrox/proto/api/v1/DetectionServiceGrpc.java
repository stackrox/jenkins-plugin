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
 * DetectionService APIs can be used to check for build and deploy time policy violations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/detection_service.proto")
public final class DetectionServiceGrpc {

  private DetectionServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.DetectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest,
      io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse> getDetectBuildTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectBuildTime",
      requestType = io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest.class,
      responseType = io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest,
      io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse> getDetectBuildTimeMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest, io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse> getDetectBuildTimeMethod;
    if ((getDetectBuildTimeMethod = DetectionServiceGrpc.getDetectBuildTimeMethod) == null) {
      synchronized (DetectionServiceGrpc.class) {
        if ((getDetectBuildTimeMethod = DetectionServiceGrpc.getDetectBuildTimeMethod) == null) {
          DetectionServiceGrpc.getDetectBuildTimeMethod = getDetectBuildTimeMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest, io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DetectionService", "DetectBuildTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DetectionServiceMethodDescriptorSupplier("DetectBuildTime"))
                  .build();
          }
        }
     }
     return getDetectBuildTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest,
      io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> getDetectDeployTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectDeployTime",
      requestType = io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest.class,
      responseType = io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest,
      io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> getDetectDeployTimeMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest, io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> getDetectDeployTimeMethod;
    if ((getDetectDeployTimeMethod = DetectionServiceGrpc.getDetectDeployTimeMethod) == null) {
      synchronized (DetectionServiceGrpc.class) {
        if ((getDetectDeployTimeMethod = DetectionServiceGrpc.getDetectDeployTimeMethod) == null) {
          DetectionServiceGrpc.getDetectDeployTimeMethod = getDetectDeployTimeMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest, io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DetectionService", "DetectDeployTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DetectionServiceMethodDescriptorSupplier("DetectDeployTime"))
                  .build();
          }
        }
     }
     return getDetectDeployTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest,
      io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> getDetectDeployTimeFromYAMLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectDeployTimeFromYAML",
      requestType = io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest.class,
      responseType = io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest,
      io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> getDetectDeployTimeFromYAMLMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest, io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> getDetectDeployTimeFromYAMLMethod;
    if ((getDetectDeployTimeFromYAMLMethod = DetectionServiceGrpc.getDetectDeployTimeFromYAMLMethod) == null) {
      synchronized (DetectionServiceGrpc.class) {
        if ((getDetectDeployTimeFromYAMLMethod = DetectionServiceGrpc.getDetectDeployTimeFromYAMLMethod) == null) {
          DetectionServiceGrpc.getDetectDeployTimeFromYAMLMethod = getDetectDeployTimeFromYAMLMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest, io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DetectionService", "DetectDeployTimeFromYAML"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DetectionServiceMethodDescriptorSupplier("DetectDeployTimeFromYAML"))
                  .build();
          }
        }
     }
     return getDetectDeployTimeFromYAMLMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DetectionServiceStub newStub(io.grpc.Channel channel) {
    return new DetectionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DetectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DetectionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DetectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DetectionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * DetectionService APIs can be used to check for build and deploy time policy violations.
   * </pre>
   */
  public static abstract class DetectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DetectBuildTime checks if any images violate build time policies.
     * </pre>
     */
    public void detectBuildTime(io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectBuildTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DetectDeployTime checks if any deployments violate deploy time policies.
     * </pre>
     */
    public void detectDeployTime(io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectDeployTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DetectDeployTimeFromYAML checks if the given deployment yaml violates any deploy time policies.
     * </pre>
     */
    public void detectDeployTimeFromYAML(io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectDeployTimeFromYAMLMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectBuildTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest,
                io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse>(
                  this, METHODID_DETECT_BUILD_TIME)))
          .addMethod(
            getDetectDeployTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest,
                io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse>(
                  this, METHODID_DETECT_DEPLOY_TIME)))
          .addMethod(
            getDetectDeployTimeFromYAMLMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest,
                io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse>(
                  this, METHODID_DETECT_DEPLOY_TIME_FROM_YAML)))
          .build();
    }
  }

  /**
   * <pre>
   * DetectionService APIs can be used to check for build and deploy time policy violations.
   * </pre>
   */
  public static final class DetectionServiceStub extends io.grpc.stub.AbstractStub<DetectionServiceStub> {
    private DetectionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DetectionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetectionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DetectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * DetectBuildTime checks if any images violate build time policies.
     * </pre>
     */
    public void detectBuildTime(io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectBuildTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DetectDeployTime checks if any deployments violate deploy time policies.
     * </pre>
     */
    public void detectDeployTime(io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectDeployTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DetectDeployTimeFromYAML checks if the given deployment yaml violates any deploy time policies.
     * </pre>
     */
    public void detectDeployTimeFromYAML(io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectDeployTimeFromYAMLMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DetectionService APIs can be used to check for build and deploy time policy violations.
   * </pre>
   */
  public static final class DetectionServiceBlockingStub extends io.grpc.stub.AbstractStub<DetectionServiceBlockingStub> {
    private DetectionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DetectionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetectionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DetectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DetectBuildTime checks if any images violate build time policies.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse detectBuildTime(io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectBuildTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DetectDeployTime checks if any deployments violate deploy time policies.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse detectDeployTime(io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectDeployTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DetectDeployTimeFromYAML checks if the given deployment yaml violates any deploy time policies.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse detectDeployTimeFromYAML(io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectDeployTimeFromYAMLMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DetectionService APIs can be used to check for build and deploy time policy violations.
   * </pre>
   */
  public static final class DetectionServiceFutureStub extends io.grpc.stub.AbstractStub<DetectionServiceFutureStub> {
    private DetectionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DetectionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetectionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DetectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DetectBuildTime checks if any images violate build time policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse> detectBuildTime(
        io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectBuildTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DetectDeployTime checks if any deployments violate deploy time policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> detectDeployTime(
        io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectDeployTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DetectDeployTimeFromYAML checks if the given deployment yaml violates any deploy time policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse> detectDeployTimeFromYAML(
        io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectDeployTimeFromYAMLMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_BUILD_TIME = 0;
  private static final int METHODID_DETECT_DEPLOY_TIME = 1;
  private static final int METHODID_DETECT_DEPLOY_TIME_FROM_YAML = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DetectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DetectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT_BUILD_TIME:
          serviceImpl.detectBuildTime((io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.BuildDetectionResponse>) responseObserver);
          break;
        case METHODID_DETECT_DEPLOY_TIME:
          serviceImpl.detectDeployTime((io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse>) responseObserver);
          break;
        case METHODID_DETECT_DEPLOY_TIME_FROM_YAML:
          serviceImpl.detectDeployTimeFromYAML((io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployYAMLDetectionRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DetectionServiceOuterClass.DeployDetectionResponse>) responseObserver);
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

  private static abstract class DetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DetectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.DetectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DetectionService");
    }
  }

  private static final class DetectionServiceFileDescriptorSupplier
      extends DetectionServiceBaseDescriptorSupplier {
    DetectionServiceFileDescriptorSupplier() {}
  }

  private static final class DetectionServiceMethodDescriptorSupplier
      extends DetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DetectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DetectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DetectionServiceFileDescriptorSupplier())
              .addMethod(getDetectBuildTimeMethod())
              .addMethod(getDetectDeployTimeMethod())
              .addMethod(getDetectDeployTimeFromYAMLMethod())
              .build();
        }
      }
    }
    return result;
  }
}
