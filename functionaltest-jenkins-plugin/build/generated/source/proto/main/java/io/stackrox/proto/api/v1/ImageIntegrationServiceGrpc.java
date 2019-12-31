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
 * ImageIntegrationService APIs manage image registry and image scanner integration.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/image_integration_service.proto")
public final class ImageIntegrationServiceGrpc {

  private ImageIntegrationServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ImageIntegrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getGetImageIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageIntegration",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getGetImageIntegrationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getGetImageIntegrationMethod;
    if ((getGetImageIntegrationMethod = ImageIntegrationServiceGrpc.getGetImageIntegrationMethod) == null) {
      synchronized (ImageIntegrationServiceGrpc.class) {
        if ((getGetImageIntegrationMethod = ImageIntegrationServiceGrpc.getGetImageIntegrationMethod) == null) {
          ImageIntegrationServiceGrpc.getGetImageIntegrationMethod = getGetImageIntegrationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageIntegrationService", "GetImageIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageIntegrationServiceMethodDescriptorSupplier("GetImageIntegration"))
                  .build();
          }
        }
     }
     return getGetImageIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest,
      io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse> getGetImageIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageIntegrations",
      requestType = io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest.class,
      responseType = io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest,
      io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse> getGetImageIntegrationsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest, io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse> getGetImageIntegrationsMethod;
    if ((getGetImageIntegrationsMethod = ImageIntegrationServiceGrpc.getGetImageIntegrationsMethod) == null) {
      synchronized (ImageIntegrationServiceGrpc.class) {
        if ((getGetImageIntegrationsMethod = ImageIntegrationServiceGrpc.getGetImageIntegrationsMethod) == null) {
          ImageIntegrationServiceGrpc.getGetImageIntegrationsMethod = getGetImageIntegrationsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest, io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageIntegrationService", "GetImageIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageIntegrationServiceMethodDescriptorSupplier("GetImageIntegrations"))
                  .build();
          }
        }
     }
     return getGetImageIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
      io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getPostImageIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostImageIntegration",
      requestType = io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.class,
      responseType = io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
      io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getPostImageIntegrationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration, io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getPostImageIntegrationMethod;
    if ((getPostImageIntegrationMethod = ImageIntegrationServiceGrpc.getPostImageIntegrationMethod) == null) {
      synchronized (ImageIntegrationServiceGrpc.class) {
        if ((getPostImageIntegrationMethod = ImageIntegrationServiceGrpc.getPostImageIntegrationMethod) == null) {
          ImageIntegrationServiceGrpc.getPostImageIntegrationMethod = getPostImageIntegrationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration, io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageIntegrationService", "PostImageIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageIntegrationServiceMethodDescriptorSupplier("PostImageIntegration"))
                  .build();
          }
        }
     }
     return getPostImageIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutImageIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutImageIntegration",
      requestType = io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutImageIntegrationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutImageIntegrationMethod;
    if ((getPutImageIntegrationMethod = ImageIntegrationServiceGrpc.getPutImageIntegrationMethod) == null) {
      synchronized (ImageIntegrationServiceGrpc.class) {
        if ((getPutImageIntegrationMethod = ImageIntegrationServiceGrpc.getPutImageIntegrationMethod) == null) {
          ImageIntegrationServiceGrpc.getPutImageIntegrationMethod = getPutImageIntegrationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageIntegrationService", "PutImageIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageIntegrationServiceMethodDescriptorSupplier("PutImageIntegration"))
                  .build();
          }
        }
     }
     return getPutImageIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestImageIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestImageIntegration",
      requestType = io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestImageIntegrationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestImageIntegrationMethod;
    if ((getTestImageIntegrationMethod = ImageIntegrationServiceGrpc.getTestImageIntegrationMethod) == null) {
      synchronized (ImageIntegrationServiceGrpc.class) {
        if ((getTestImageIntegrationMethod = ImageIntegrationServiceGrpc.getTestImageIntegrationMethod) == null) {
          ImageIntegrationServiceGrpc.getTestImageIntegrationMethod = getTestImageIntegrationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageIntegrationService", "TestImageIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageIntegrationServiceMethodDescriptorSupplier("TestImageIntegration"))
                  .build();
          }
        }
     }
     return getTestImageIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteImageIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImageIntegration",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteImageIntegrationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteImageIntegrationMethod;
    if ((getDeleteImageIntegrationMethod = ImageIntegrationServiceGrpc.getDeleteImageIntegrationMethod) == null) {
      synchronized (ImageIntegrationServiceGrpc.class) {
        if ((getDeleteImageIntegrationMethod = ImageIntegrationServiceGrpc.getDeleteImageIntegrationMethod) == null) {
          ImageIntegrationServiceGrpc.getDeleteImageIntegrationMethod = getDeleteImageIntegrationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageIntegrationService", "DeleteImageIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageIntegrationServiceMethodDescriptorSupplier("DeleteImageIntegration"))
                  .build();
          }
        }
     }
     return getDeleteImageIntegrationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageIntegrationServiceStub newStub(io.grpc.Channel channel) {
    return new ImageIntegrationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageIntegrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageIntegrationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageIntegrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageIntegrationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ImageIntegrationService APIs manage image registry and image scanner integration.
   * </pre>
   */
  public static abstract class ImageIntegrationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetImageIntegration returns the image integration given its ID.
     * </pre>
     */
    public void getImageIntegration(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageIntegrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetImageIntegrations returns all image integrations.
     * </pre>
     */
    public void getImageIntegrations(io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageIntegrationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostImageIntegration creates a image integraton.
     * </pre>
     */
    public void postImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> responseObserver) {
      asyncUnimplementedUnaryCall(getPostImageIntegrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * PutImageIntegration modifies a given image integration.
     * </pre>
     */
    public void putImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPutImageIntegrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * TestImageIntegration checks if the given image integration is correctly configured.
     * </pre>
     */
    public void testImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTestImageIntegrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteImageIntegration removes a image integration given its ID.
     * </pre>
     */
    public void deleteImageIntegration(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteImageIntegrationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetImageIntegrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration>(
                  this, METHODID_GET_IMAGE_INTEGRATION)))
          .addMethod(
            getGetImageIntegrationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest,
                io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse>(
                  this, METHODID_GET_IMAGE_INTEGRATIONS)))
          .addMethod(
            getPostImageIntegrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
                io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration>(
                  this, METHODID_POST_IMAGE_INTEGRATION)))
          .addMethod(
            getPutImageIntegrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_PUT_IMAGE_INTEGRATION)))
          .addMethod(
            getTestImageIntegrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_TEST_IMAGE_INTEGRATION)))
          .addMethod(
            getDeleteImageIntegrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_IMAGE_INTEGRATION)))
          .build();
    }
  }

  /**
   * <pre>
   * ImageIntegrationService APIs manage image registry and image scanner integration.
   * </pre>
   */
  public static final class ImageIntegrationServiceStub extends io.grpc.stub.AbstractStub<ImageIntegrationServiceStub> {
    private ImageIntegrationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageIntegrationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageIntegrationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageIntegrationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetImageIntegration returns the image integration given its ID.
     * </pre>
     */
    public void getImageIntegration(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetImageIntegrations returns all image integrations.
     * </pre>
     */
    public void getImageIntegrations(io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostImageIntegration creates a image integraton.
     * </pre>
     */
    public void postImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostImageIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PutImageIntegration modifies a given image integration.
     * </pre>
     */
    public void putImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutImageIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TestImageIntegration checks if the given image integration is correctly configured.
     * </pre>
     */
    public void testImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestImageIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteImageIntegration removes a image integration given its ID.
     * </pre>
     */
    public void deleteImageIntegration(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteImageIntegrationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ImageIntegrationService APIs manage image registry and image scanner integration.
   * </pre>
   */
  public static final class ImageIntegrationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImageIntegrationServiceBlockingStub> {
    private ImageIntegrationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageIntegrationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageIntegrationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageIntegrationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetImageIntegration returns the image integration given its ID.
     * </pre>
     */
    public io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration getImageIntegration(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetImageIntegrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetImageIntegrations returns all image integrations.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse getImageIntegrations(io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImageIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostImageIntegration creates a image integraton.
     * </pre>
     */
    public io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration postImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request) {
      return blockingUnaryCall(
          getChannel(), getPostImageIntegrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PutImageIntegration modifies a given image integration.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty putImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request) {
      return blockingUnaryCall(
          getChannel(), getPutImageIntegrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TestImageIntegration checks if the given image integration is correctly configured.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty testImageIntegration(io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request) {
      return blockingUnaryCall(
          getChannel(), getTestImageIntegrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteImageIntegration removes a image integration given its ID.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteImageIntegration(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteImageIntegrationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ImageIntegrationService APIs manage image registry and image scanner integration.
   * </pre>
   */
  public static final class ImageIntegrationServiceFutureStub extends io.grpc.stub.AbstractStub<ImageIntegrationServiceFutureStub> {
    private ImageIntegrationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageIntegrationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageIntegrationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageIntegrationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetImageIntegration returns the image integration given its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> getImageIntegration(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageIntegrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetImageIntegrations returns all image integrations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse> getImageIntegrations(
        io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostImageIntegration creates a image integraton.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration> postImageIntegration(
        io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request) {
      return futureUnaryCall(
          getChannel().newCall(getPostImageIntegrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PutImageIntegration modifies a given image integration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> putImageIntegration(
        io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request) {
      return futureUnaryCall(
          getChannel().newCall(getPutImageIntegrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TestImageIntegration checks if the given image integration is correctly configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> testImageIntegration(
        io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration request) {
      return futureUnaryCall(
          getChannel().newCall(getTestImageIntegrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteImageIntegration removes a image integration given its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteImageIntegration(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteImageIntegrationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_IMAGE_INTEGRATION = 0;
  private static final int METHODID_GET_IMAGE_INTEGRATIONS = 1;
  private static final int METHODID_POST_IMAGE_INTEGRATION = 2;
  private static final int METHODID_PUT_IMAGE_INTEGRATION = 3;
  private static final int METHODID_TEST_IMAGE_INTEGRATION = 4;
  private static final int METHODID_DELETE_IMAGE_INTEGRATION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageIntegrationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageIntegrationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_IMAGE_INTEGRATION:
          serviceImpl.getImageIntegration((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration>) responseObserver);
          break;
        case METHODID_GET_IMAGE_INTEGRATIONS:
          serviceImpl.getImageIntegrations((io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.GetImageIntegrationsResponse>) responseObserver);
          break;
        case METHODID_POST_IMAGE_INTEGRATION:
          serviceImpl.postImageIntegration((io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration>) responseObserver);
          break;
        case METHODID_PUT_IMAGE_INTEGRATION:
          serviceImpl.putImageIntegration((io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_TEST_IMAGE_INTEGRATION:
          serviceImpl.testImageIntegration((io.stackrox.proto.storage.ImageIntegrationOuterClass.ImageIntegration) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE_INTEGRATION:
          serviceImpl.deleteImageIntegration((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
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

  private static abstract class ImageIntegrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageIntegrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ImageIntegrationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageIntegrationService");
    }
  }

  private static final class ImageIntegrationServiceFileDescriptorSupplier
      extends ImageIntegrationServiceBaseDescriptorSupplier {
    ImageIntegrationServiceFileDescriptorSupplier() {}
  }

  private static final class ImageIntegrationServiceMethodDescriptorSupplier
      extends ImageIntegrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageIntegrationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageIntegrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageIntegrationServiceFileDescriptorSupplier())
              .addMethod(getGetImageIntegrationMethod())
              .addMethod(getGetImageIntegrationsMethod())
              .addMethod(getPostImageIntegrationMethod())
              .addMethod(getPutImageIntegrationMethod())
              .addMethod(getTestImageIntegrationMethod())
              .addMethod(getDeleteImageIntegrationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
