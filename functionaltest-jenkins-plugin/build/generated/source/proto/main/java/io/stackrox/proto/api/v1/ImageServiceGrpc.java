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
 * ImageService APIs manages image metadata.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/image_service.proto")
public final class ImageServiceGrpc {

  private ImageServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ImageOuterClass.Image> getGetImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImage",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.ImageOuterClass.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ImageOuterClass.Image> getGetImageMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ImageOuterClass.Image> getGetImageMethod;
    if ((getGetImageMethod = ImageServiceGrpc.getGetImageMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getGetImageMethod = ImageServiceGrpc.getGetImageMethod) == null) {
          ImageServiceGrpc.getGetImageMethod = getGetImageMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ImageOuterClass.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageService", "GetImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageOuterClass.Image.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("GetImage"))
                  .build();
          }
        }
     }
     return getGetImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse> getCountImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountImages",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse> getCountImagesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse> getCountImagesMethod;
    if ((getCountImagesMethod = ImageServiceGrpc.getCountImagesMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getCountImagesMethod = ImageServiceGrpc.getCountImagesMethod) == null) {
          ImageServiceGrpc.getCountImagesMethod = getCountImagesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageService", "CountImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("CountImages"))
                  .build();
          }
        }
     }
     return getCountImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse> getListImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImages",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse> getListImagesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse> getListImagesMethod;
    if ((getListImagesMethod = ImageServiceGrpc.getListImagesMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getListImagesMethod = ImageServiceGrpc.getListImagesMethod) == null) {
          ImageServiceGrpc.getListImagesMethod = getListImagesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageService", "ListImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("ListImages"))
                  .build();
          }
        }
     }
     return getListImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest,
      io.stackrox.proto.storage.ImageOuterClass.Image> getScanImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanImage",
      requestType = io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest.class,
      responseType = io.stackrox.proto.storage.ImageOuterClass.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest,
      io.stackrox.proto.storage.ImageOuterClass.Image> getScanImageMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest, io.stackrox.proto.storage.ImageOuterClass.Image> getScanImageMethod;
    if ((getScanImageMethod = ImageServiceGrpc.getScanImageMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getScanImageMethod = ImageServiceGrpc.getScanImageMethod) == null) {
          ImageServiceGrpc.getScanImageMethod = getScanImageMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest, io.stackrox.proto.storage.ImageOuterClass.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageService", "ScanImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ImageOuterClass.Image.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("ScanImage"))
                  .build();
          }
        }
     }
     return getScanImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getInvalidateScanAndRegistryCachesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvalidateScanAndRegistryCaches",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getInvalidateScanAndRegistryCachesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getInvalidateScanAndRegistryCachesMethod;
    if ((getInvalidateScanAndRegistryCachesMethod = ImageServiceGrpc.getInvalidateScanAndRegistryCachesMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getInvalidateScanAndRegistryCachesMethod = ImageServiceGrpc.getInvalidateScanAndRegistryCachesMethod) == null) {
          ImageServiceGrpc.getInvalidateScanAndRegistryCachesMethod = getInvalidateScanAndRegistryCachesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageService", "InvalidateScanAndRegistryCaches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("InvalidateScanAndRegistryCaches"))
                  .build();
          }
        }
     }
     return getInvalidateScanAndRegistryCachesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest,
      io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse> getDeleteImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImages",
      requestType = io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest.class,
      responseType = io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest,
      io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse> getDeleteImagesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest, io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse> getDeleteImagesMethod;
    if ((getDeleteImagesMethod = ImageServiceGrpc.getDeleteImagesMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getDeleteImagesMethod = ImageServiceGrpc.getDeleteImagesMethod) == null) {
          ImageServiceGrpc.getDeleteImagesMethod = getDeleteImagesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest, io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ImageService", "DeleteImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("DeleteImages"))
                  .build();
          }
        }
     }
     return getDeleteImagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageServiceStub newStub(io.grpc.Channel channel) {
    return new ImageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ImageService APIs manages image metadata.
   * </pre>
   */
  public static abstract class ImageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetImage returns the image given its ID.
     * </pre>
     */
    public void getImage(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageOuterClass.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public void countImages(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public void listImages(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScanImage scans a single image and returns the result
     * </pre>
     */
    public void scanImage(io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageOuterClass.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getScanImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * InvalidateScanAndRegistryCaches removes the image metadata cache.
     * </pre>
     */
    public void invalidateScanAndRegistryCaches(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getInvalidateScanAndRegistryCachesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteImage removes the images based on a query
     * </pre>
     */
    public void deleteImages(io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteImagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.ImageOuterClass.Image>(
                  this, METHODID_GET_IMAGE)))
          .addMethod(
            getCountImagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse>(
                  this, METHODID_COUNT_IMAGES)))
          .addMethod(
            getListImagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse>(
                  this, METHODID_LIST_IMAGES)))
          .addMethod(
            getScanImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest,
                io.stackrox.proto.storage.ImageOuterClass.Image>(
                  this, METHODID_SCAN_IMAGE)))
          .addMethod(
            getInvalidateScanAndRegistryCachesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_INVALIDATE_SCAN_AND_REGISTRY_CACHES)))
          .addMethod(
            getDeleteImagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest,
                io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse>(
                  this, METHODID_DELETE_IMAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * ImageService APIs manages image metadata.
   * </pre>
   */
  public static final class ImageServiceStub extends io.grpc.stub.AbstractStub<ImageServiceStub> {
    private ImageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetImage returns the image given its ID.
     * </pre>
     */
    public void getImage(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageOuterClass.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public void countImages(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public void listImages(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScanImage scans a single image and returns the result
     * </pre>
     */
    public void scanImage(io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageOuterClass.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InvalidateScanAndRegistryCaches removes the image metadata cache.
     * </pre>
     */
    public void invalidateScanAndRegistryCaches(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInvalidateScanAndRegistryCachesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteImage removes the images based on a query
     * </pre>
     */
    public void deleteImages(io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteImagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ImageService APIs manages image metadata.
   * </pre>
   */
  public static final class ImageServiceBlockingStub extends io.grpc.stub.AbstractStub<ImageServiceBlockingStub> {
    private ImageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetImage returns the image given its ID.
     * </pre>
     */
    public io.stackrox.proto.storage.ImageOuterClass.Image getImage(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse countImages(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getCountImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse listImages(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScanImage scans a single image and returns the result
     * </pre>
     */
    public io.stackrox.proto.storage.ImageOuterClass.Image scanImage(io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getScanImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InvalidateScanAndRegistryCaches removes the image metadata cache.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty invalidateScanAndRegistryCaches(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInvalidateScanAndRegistryCachesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteImage removes the images based on a query
     * </pre>
     */
    public io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse deleteImages(io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteImagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ImageService APIs manages image metadata.
   * </pre>
   */
  public static final class ImageServiceFutureStub extends io.grpc.stub.AbstractStub<ImageServiceFutureStub> {
    private ImageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetImage returns the image given its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ImageOuterClass.Image> getImage(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse> countImages(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getCountImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListImages returns all the images.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse> listImages(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScanImage scans a single image and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ImageOuterClass.Image> scanImage(
        io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScanImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InvalidateScanAndRegistryCaches removes the image metadata cache.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> invalidateScanAndRegistryCaches(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInvalidateScanAndRegistryCachesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteImage removes the images based on a query
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse> deleteImages(
        io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteImagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_IMAGE = 0;
  private static final int METHODID_COUNT_IMAGES = 1;
  private static final int METHODID_LIST_IMAGES = 2;
  private static final int METHODID_SCAN_IMAGE = 3;
  private static final int METHODID_INVALIDATE_SCAN_AND_REGISTRY_CACHES = 4;
  private static final int METHODID_DELETE_IMAGES = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_IMAGE:
          serviceImpl.getImage((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageOuterClass.Image>) responseObserver);
          break;
        case METHODID_COUNT_IMAGES:
          serviceImpl.countImages((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.CountImagesResponse>) responseObserver);
          break;
        case METHODID_LIST_IMAGES:
          serviceImpl.listImages((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.ListImagesResponse>) responseObserver);
          break;
        case METHODID_SCAN_IMAGE:
          serviceImpl.scanImage((io.stackrox.proto.api.v1.ImageServiceOuterClass.ScanImageRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ImageOuterClass.Image>) responseObserver);
          break;
        case METHODID_INVALIDATE_SCAN_AND_REGISTRY_CACHES:
          serviceImpl.invalidateScanAndRegistryCaches((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_IMAGES:
          serviceImpl.deleteImages((io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ImageServiceOuterClass.DeleteImagesResponse>) responseObserver);
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

  private static abstract class ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ImageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageService");
    }
  }

  private static final class ImageServiceFileDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier {
    ImageServiceFileDescriptorSupplier() {}
  }

  private static final class ImageServiceMethodDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageServiceFileDescriptorSupplier())
              .addMethod(getGetImageMethod())
              .addMethod(getCountImagesMethod())
              .addMethod(getListImagesMethod())
              .addMethod(getScanImageMethod())
              .addMethod(getInvalidateScanAndRegistryCachesMethod())
              .addMethod(getDeleteImagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
