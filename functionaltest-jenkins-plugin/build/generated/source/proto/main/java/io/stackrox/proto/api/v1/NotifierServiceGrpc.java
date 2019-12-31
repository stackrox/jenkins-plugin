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
    comments = "Source: api/v1/notifier_service.proto")
public final class NotifierServiceGrpc {

  private NotifierServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.NotifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.NotifierOuterClass.Notifier> getGetNotifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotifier",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.NotifierOuterClass.Notifier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.NotifierOuterClass.Notifier> getGetNotifierMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.NotifierOuterClass.Notifier> getGetNotifierMethod;
    if ((getGetNotifierMethod = NotifierServiceGrpc.getGetNotifierMethod) == null) {
      synchronized (NotifierServiceGrpc.class) {
        if ((getGetNotifierMethod = NotifierServiceGrpc.getGetNotifierMethod) == null) {
          NotifierServiceGrpc.getGetNotifierMethod = getGetNotifierMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.NotifierOuterClass.Notifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NotifierService", "GetNotifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NotifierOuterClass.Notifier.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierServiceMethodDescriptorSupplier("GetNotifier"))
                  .build();
          }
        }
     }
     return getGetNotifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest,
      io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse> getGetNotifiersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotifiers",
      requestType = io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest.class,
      responseType = io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest,
      io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse> getGetNotifiersMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest, io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse> getGetNotifiersMethod;
    if ((getGetNotifiersMethod = NotifierServiceGrpc.getGetNotifiersMethod) == null) {
      synchronized (NotifierServiceGrpc.class) {
        if ((getGetNotifiersMethod = NotifierServiceGrpc.getGetNotifiersMethod) == null) {
          NotifierServiceGrpc.getGetNotifiersMethod = getGetNotifiersMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest, io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NotifierService", "GetNotifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierServiceMethodDescriptorSupplier("GetNotifiers"))
                  .build();
          }
        }
     }
     return getGetNotifiersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutNotifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutNotifier",
      requestType = io.stackrox.proto.storage.NotifierOuterClass.Notifier.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutNotifierMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutNotifierMethod;
    if ((getPutNotifierMethod = NotifierServiceGrpc.getPutNotifierMethod) == null) {
      synchronized (NotifierServiceGrpc.class) {
        if ((getPutNotifierMethod = NotifierServiceGrpc.getPutNotifierMethod) == null) {
          NotifierServiceGrpc.getPutNotifierMethod = getPutNotifierMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.NotifierOuterClass.Notifier, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NotifierService", "PutNotifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NotifierOuterClass.Notifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierServiceMethodDescriptorSupplier("PutNotifier"))
                  .build();
          }
        }
     }
     return getPutNotifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier,
      io.stackrox.proto.storage.NotifierOuterClass.Notifier> getPostNotifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostNotifier",
      requestType = io.stackrox.proto.storage.NotifierOuterClass.Notifier.class,
      responseType = io.stackrox.proto.storage.NotifierOuterClass.Notifier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier,
      io.stackrox.proto.storage.NotifierOuterClass.Notifier> getPostNotifierMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier, io.stackrox.proto.storage.NotifierOuterClass.Notifier> getPostNotifierMethod;
    if ((getPostNotifierMethod = NotifierServiceGrpc.getPostNotifierMethod) == null) {
      synchronized (NotifierServiceGrpc.class) {
        if ((getPostNotifierMethod = NotifierServiceGrpc.getPostNotifierMethod) == null) {
          NotifierServiceGrpc.getPostNotifierMethod = getPostNotifierMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.NotifierOuterClass.Notifier, io.stackrox.proto.storage.NotifierOuterClass.Notifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NotifierService", "PostNotifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NotifierOuterClass.Notifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NotifierOuterClass.Notifier.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierServiceMethodDescriptorSupplier("PostNotifier"))
                  .build();
          }
        }
     }
     return getPostNotifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestNotifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestNotifier",
      requestType = io.stackrox.proto.storage.NotifierOuterClass.Notifier.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestNotifierMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.NotifierOuterClass.Notifier, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestNotifierMethod;
    if ((getTestNotifierMethod = NotifierServiceGrpc.getTestNotifierMethod) == null) {
      synchronized (NotifierServiceGrpc.class) {
        if ((getTestNotifierMethod = NotifierServiceGrpc.getTestNotifierMethod) == null) {
          NotifierServiceGrpc.getTestNotifierMethod = getTestNotifierMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.NotifierOuterClass.Notifier, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NotifierService", "TestNotifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NotifierOuterClass.Notifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierServiceMethodDescriptorSupplier("TestNotifier"))
                  .build();
          }
        }
     }
     return getTestNotifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteNotifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotifier",
      requestType = io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteNotifierMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteNotifierMethod;
    if ((getDeleteNotifierMethod = NotifierServiceGrpc.getDeleteNotifierMethod) == null) {
      synchronized (NotifierServiceGrpc.class) {
        if ((getDeleteNotifierMethod = NotifierServiceGrpc.getDeleteNotifierMethod) == null) {
          NotifierServiceGrpc.getDeleteNotifierMethod = getDeleteNotifierMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NotifierService", "DeleteNotifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierServiceMethodDescriptorSupplier("DeleteNotifier"))
                  .build();
          }
        }
     }
     return getDeleteNotifierMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotifierServiceStub newStub(io.grpc.Channel channel) {
    return new NotifierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotifierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotifierServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NotifierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNotifier(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NotifierOuterClass.Notifier> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNotifierMethod(), responseObserver);
    }

    /**
     */
    public void getNotifiers(io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNotifiersMethod(), responseObserver);
    }

    /**
     */
    public void putNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPutNotifierMethod(), responseObserver);
    }

    /**
     */
    public void postNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NotifierOuterClass.Notifier> responseObserver) {
      asyncUnimplementedUnaryCall(getPostNotifierMethod(), responseObserver);
    }

    /**
     */
    public void testNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTestNotifierMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotifier(io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNotifierMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNotifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.NotifierOuterClass.Notifier>(
                  this, METHODID_GET_NOTIFIER)))
          .addMethod(
            getGetNotifiersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest,
                io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse>(
                  this, METHODID_GET_NOTIFIERS)))
          .addMethod(
            getPutNotifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.NotifierOuterClass.Notifier,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_PUT_NOTIFIER)))
          .addMethod(
            getPostNotifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.NotifierOuterClass.Notifier,
                io.stackrox.proto.storage.NotifierOuterClass.Notifier>(
                  this, METHODID_POST_NOTIFIER)))
          .addMethod(
            getTestNotifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.NotifierOuterClass.Notifier,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_TEST_NOTIFIER)))
          .addMethod(
            getDeleteNotifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_NOTIFIER)))
          .build();
    }
  }

  /**
   */
  public static final class NotifierServiceStub extends io.grpc.stub.AbstractStub<NotifierServiceStub> {
    private NotifierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifierServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNotifier(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NotifierOuterClass.Notifier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNotifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNotifiers(io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNotifiersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutNotifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NotifierOuterClass.Notifier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostNotifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestNotifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotifier(io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNotifierMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotifierServiceBlockingStub extends io.grpc.stub.AbstractStub<NotifierServiceBlockingStub> {
    private NotifierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.storage.NotifierOuterClass.Notifier getNotifier(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetNotifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse getNotifiers(io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNotifiersMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty putNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request) {
      return blockingUnaryCall(
          getChannel(), getPutNotifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.NotifierOuterClass.Notifier postNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request) {
      return blockingUnaryCall(
          getChannel(), getPostNotifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty testNotifier(io.stackrox.proto.storage.NotifierOuterClass.Notifier request) {
      return blockingUnaryCall(
          getChannel(), getTestNotifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteNotifier(io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNotifierMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotifierServiceFutureStub extends io.grpc.stub.AbstractStub<NotifierServiceFutureStub> {
    private NotifierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.NotifierOuterClass.Notifier> getNotifier(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNotifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse> getNotifiers(
        io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNotifiersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> putNotifier(
        io.stackrox.proto.storage.NotifierOuterClass.Notifier request) {
      return futureUnaryCall(
          getChannel().newCall(getPutNotifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.NotifierOuterClass.Notifier> postNotifier(
        io.stackrox.proto.storage.NotifierOuterClass.Notifier request) {
      return futureUnaryCall(
          getChannel().newCall(getPostNotifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> testNotifier(
        io.stackrox.proto.storage.NotifierOuterClass.Notifier request) {
      return futureUnaryCall(
          getChannel().newCall(getTestNotifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteNotifier(
        io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNotifierMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NOTIFIER = 0;
  private static final int METHODID_GET_NOTIFIERS = 1;
  private static final int METHODID_PUT_NOTIFIER = 2;
  private static final int METHODID_POST_NOTIFIER = 3;
  private static final int METHODID_TEST_NOTIFIER = 4;
  private static final int METHODID_DELETE_NOTIFIER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotifierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotifierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NOTIFIER:
          serviceImpl.getNotifier((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NotifierOuterClass.Notifier>) responseObserver);
          break;
        case METHODID_GET_NOTIFIERS:
          serviceImpl.getNotifiers((io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NotifierServiceOuterClass.GetNotifiersResponse>) responseObserver);
          break;
        case METHODID_PUT_NOTIFIER:
          serviceImpl.putNotifier((io.stackrox.proto.storage.NotifierOuterClass.Notifier) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_POST_NOTIFIER:
          serviceImpl.postNotifier((io.stackrox.proto.storage.NotifierOuterClass.Notifier) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NotifierOuterClass.Notifier>) responseObserver);
          break;
        case METHODID_TEST_NOTIFIER:
          serviceImpl.testNotifier((io.stackrox.proto.storage.NotifierOuterClass.Notifier) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFIER:
          serviceImpl.deleteNotifier((io.stackrox.proto.api.v1.NotifierServiceOuterClass.DeleteNotifierRequest) request,
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

  private static abstract class NotifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.NotifierServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotifierService");
    }
  }

  private static final class NotifierServiceFileDescriptorSupplier
      extends NotifierServiceBaseDescriptorSupplier {
    NotifierServiceFileDescriptorSupplier() {}
  }

  private static final class NotifierServiceMethodDescriptorSupplier
      extends NotifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotifierServiceFileDescriptorSupplier())
              .addMethod(getGetNotifierMethod())
              .addMethod(getGetNotifiersMethod())
              .addMethod(getPutNotifierMethod())
              .addMethod(getPostNotifierMethod())
              .addMethod(getTestNotifierMethod())
              .addMethod(getDeleteNotifierMethod())
              .build();
        }
      }
    }
    return result;
  }
}
