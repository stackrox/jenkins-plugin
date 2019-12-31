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
    comments = "Source: api/v1/user_service.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsers",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse> getGetUsersMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse> getGetUsersMethod;
    if ((getGetUsersMethod = UserServiceGrpc.getGetUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUsersMethod = UserServiceGrpc.getGetUsersMethod) == null) {
          UserServiceGrpc.getGetUsersMethod = getGetUsersMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.UserService", "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUsers"))
                  .build();
          }
        }
     }
     return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.UserOuterClass.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.UserOuterClass.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.UserOuterClass.User> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.UserService", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.UserOuterClass.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse> getGetUsersAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersAttributes",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse> getGetUsersAttributesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse> getGetUsersAttributesMethod;
    if ((getGetUsersAttributesMethod = UserServiceGrpc.getGetUsersAttributesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUsersAttributesMethod = UserServiceGrpc.getGetUsersAttributesMethod) == null) {
          UserServiceGrpc.getGetUsersAttributesMethod = getGetUsersAttributesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.UserService", "GetUsersAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUsersAttributes"))
                  .build();
          }
        }
     }
     return getGetUsersAttributesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUsers(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     */
    public void getUser(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.UserOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getUsersAttributes(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersAttributesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.UserOuterClass.User>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUsersAttributesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse>(
                  this, METHODID_GET_USERS_ATTRIBUTES)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUsers(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.UserOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersAttributes(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersAttributesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse getUsers(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.UserOuterClass.User getUser(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse getUsersAttributes(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersAttributesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse> getUsers(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.UserOuterClass.User> getUser(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse> getUsersAttributes(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersAttributesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USERS = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_GET_USERS_ATTRIBUTES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USERS:
          serviceImpl.getUsers((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_GET_USERS_ATTRIBUTES:
          serviceImpl.getUsersAttributes((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.UserServiceOuterClass.GetUsersAttributesResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUsersMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUsersAttributesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
