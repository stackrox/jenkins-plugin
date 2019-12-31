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
    comments = "Source: api/v1/authprovider_service.proto")
public final class AuthProviderServiceGrpc {

  private AuthProviderServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.AuthProviderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getGetAuthProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthProvider",
      requestType = io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest.class,
      responseType = io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getGetAuthProviderMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getGetAuthProviderMethod;
    if ((getGetAuthProviderMethod = AuthProviderServiceGrpc.getGetAuthProviderMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getGetAuthProviderMethod = AuthProviderServiceGrpc.getGetAuthProviderMethod) == null) {
          AuthProviderServiceGrpc.getGetAuthProviderMethod = getGetAuthProviderMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "GetAuthProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("GetAuthProvider"))
                  .build();
          }
        }
     }
     return getGetAuthProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse> getGetLoginAuthProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLoginAuthProviders",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse> getGetLoginAuthProvidersMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse> getGetLoginAuthProvidersMethod;
    if ((getGetLoginAuthProvidersMethod = AuthProviderServiceGrpc.getGetLoginAuthProvidersMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getGetLoginAuthProvidersMethod = AuthProviderServiceGrpc.getGetLoginAuthProvidersMethod) == null) {
          AuthProviderServiceGrpc.getGetLoginAuthProvidersMethod = getGetLoginAuthProvidersMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "GetLoginAuthProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("GetLoginAuthProviders"))
                  .build();
          }
        }
     }
     return getGetLoginAuthProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest,
      io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse> getGetAuthProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthProviders",
      requestType = io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest.class,
      responseType = io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest,
      io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse> getGetAuthProvidersMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest, io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse> getGetAuthProvidersMethod;
    if ((getGetAuthProvidersMethod = AuthProviderServiceGrpc.getGetAuthProvidersMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getGetAuthProvidersMethod = AuthProviderServiceGrpc.getGetAuthProvidersMethod) == null) {
          AuthProviderServiceGrpc.getGetAuthProvidersMethod = getGetAuthProvidersMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest, io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "GetAuthProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("GetAuthProviders"))
                  .build();
          }
        }
     }
     return getGetAuthProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getPostAuthProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAuthProvider",
      requestType = io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest.class,
      responseType = io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getPostAuthProviderMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getPostAuthProviderMethod;
    if ((getPostAuthProviderMethod = AuthProviderServiceGrpc.getPostAuthProviderMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getPostAuthProviderMethod = AuthProviderServiceGrpc.getPostAuthProviderMethod) == null) {
          AuthProviderServiceGrpc.getPostAuthProviderMethod = getPostAuthProviderMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "PostAuthProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("PostAuthProvider"))
                  .build();
          }
        }
     }
     return getPostAuthProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getUpdateAuthProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthProvider",
      requestType = io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest.class,
      responseType = io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getUpdateAuthProviderMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getUpdateAuthProviderMethod;
    if ((getUpdateAuthProviderMethod = AuthProviderServiceGrpc.getUpdateAuthProviderMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getUpdateAuthProviderMethod = AuthProviderServiceGrpc.getUpdateAuthProviderMethod) == null) {
          AuthProviderServiceGrpc.getUpdateAuthProviderMethod = getUpdateAuthProviderMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "UpdateAuthProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("UpdateAuthProvider"))
                  .build();
          }
        }
     }
     return getUpdateAuthProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getPutAuthProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutAuthProvider",
      requestType = io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.class,
      responseType = io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider,
      io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getPutAuthProviderMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getPutAuthProviderMethod;
    if ((getPutAuthProviderMethod = AuthProviderServiceGrpc.getPutAuthProviderMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getPutAuthProviderMethod = AuthProviderServiceGrpc.getPutAuthProviderMethod) == null) {
          AuthProviderServiceGrpc.getPutAuthProviderMethod = getPutAuthProviderMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider, io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "PutAuthProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("PutAuthProvider"))
                  .build();
          }
        }
     }
     return getPutAuthProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteAuthProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthProvider",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteAuthProviderMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteAuthProviderMethod;
    if ((getDeleteAuthProviderMethod = AuthProviderServiceGrpc.getDeleteAuthProviderMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getDeleteAuthProviderMethod = AuthProviderServiceGrpc.getDeleteAuthProviderMethod) == null) {
          AuthProviderServiceGrpc.getDeleteAuthProviderMethod = getDeleteAuthProviderMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "DeleteAuthProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("DeleteAuthProvider"))
                  .build();
          }
        }
     }
     return getDeleteAuthProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest,
      io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse> getExchangeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeToken",
      requestType = io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest.class,
      responseType = io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest,
      io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse> getExchangeTokenMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest, io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse> getExchangeTokenMethod;
    if ((getExchangeTokenMethod = AuthProviderServiceGrpc.getExchangeTokenMethod) == null) {
      synchronized (AuthProviderServiceGrpc.class) {
        if ((getExchangeTokenMethod = AuthProviderServiceGrpc.getExchangeTokenMethod) == null) {
          AuthProviderServiceGrpc.getExchangeTokenMethod = getExchangeTokenMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest, io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AuthProviderService", "ExchangeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthProviderServiceMethodDescriptorSupplier("ExchangeToken"))
                  .build();
          }
        }
     }
     return getExchangeTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthProviderServiceStub newStub(io.grpc.Channel channel) {
    return new AuthProviderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthProviderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthProviderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthProviderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthProviderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthProviderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthProviderMethod(), responseObserver);
    }

    /**
     */
    public void getLoginAuthProviders(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLoginAuthProvidersMethod(), responseObserver);
    }

    /**
     */
    public void getAuthProviders(io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthProvidersMethod(), responseObserver);
    }

    /**
     */
    public void postAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAuthProviderMethod(), responseObserver);
    }

    /**
     */
    public void updateAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAuthProviderMethod(), responseObserver);
    }

    /**
     */
    public void putAuthProvider(io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnimplementedUnaryCall(getPutAuthProviderMethod(), responseObserver);
    }

    /**
     */
    public void deleteAuthProvider(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAuthProviderMethod(), responseObserver);
    }

    /**
     */
    public void exchangeToken(io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAuthProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest,
                io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>(
                  this, METHODID_GET_AUTH_PROVIDER)))
          .addMethod(
            getGetLoginAuthProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse>(
                  this, METHODID_GET_LOGIN_AUTH_PROVIDERS)))
          .addMethod(
            getGetAuthProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest,
                io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse>(
                  this, METHODID_GET_AUTH_PROVIDERS)))
          .addMethod(
            getPostAuthProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest,
                io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>(
                  this, METHODID_POST_AUTH_PROVIDER)))
          .addMethod(
            getUpdateAuthProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest,
                io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>(
                  this, METHODID_UPDATE_AUTH_PROVIDER)))
          .addMethod(
            getPutAuthProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider,
                io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>(
                  this, METHODID_PUT_AUTH_PROVIDER)))
          .addMethod(
            getDeleteAuthProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_AUTH_PROVIDER)))
          .addMethod(
            getExchangeTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest,
                io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse>(
                  this, METHODID_EXCHANGE_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class AuthProviderServiceStub extends io.grpc.stub.AbstractStub<AuthProviderServiceStub> {
    private AuthProviderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthProviderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthProviderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthProviderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLoginAuthProviders(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLoginAuthProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthProviders(io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAuthProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAuthProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putAuthProvider(io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutAuthProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAuthProvider(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAuthProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeToken(io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthProviderServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthProviderServiceBlockingStub> {
    private AuthProviderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthProviderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthProviderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthProviderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider getAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse getLoginAuthProviders(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetLoginAuthProvidersMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse getAuthProviders(io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthProvidersMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider postAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAuthProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider updateAuthProvider(io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAuthProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider putAuthProvider(io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider request) {
      return blockingUnaryCall(
          getChannel(), getPutAuthProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteAuthProvider(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAuthProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse exchangeToken(io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthProviderServiceFutureStub extends io.grpc.stub.AbstractStub<AuthProviderServiceFutureStub> {
    private AuthProviderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthProviderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthProviderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthProviderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> getAuthProvider(
        io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse> getLoginAuthProviders(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLoginAuthProvidersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse> getAuthProviders(
        io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthProvidersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> postAuthProvider(
        io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAuthProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> updateAuthProvider(
        io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAuthProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider> putAuthProvider(
        io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider request) {
      return futureUnaryCall(
          getChannel().newCall(getPutAuthProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteAuthProvider(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAuthProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse> exchangeToken(
        io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUTH_PROVIDER = 0;
  private static final int METHODID_GET_LOGIN_AUTH_PROVIDERS = 1;
  private static final int METHODID_GET_AUTH_PROVIDERS = 2;
  private static final int METHODID_POST_AUTH_PROVIDER = 3;
  private static final int METHODID_UPDATE_AUTH_PROVIDER = 4;
  private static final int METHODID_PUT_AUTH_PROVIDER = 5;
  private static final int METHODID_DELETE_AUTH_PROVIDER = 6;
  private static final int METHODID_EXCHANGE_TOKEN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthProviderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthProviderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUTH_PROVIDER:
          serviceImpl.getAuthProvider((io.stackrox.proto.api.v1.AuthproviderService.GetAuthProviderRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>) responseObserver);
          break;
        case METHODID_GET_LOGIN_AUTH_PROVIDERS:
          serviceImpl.getLoginAuthProviders((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.GetLoginAuthProvidersResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_PROVIDERS:
          serviceImpl.getAuthProviders((io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.GetAuthProvidersResponse>) responseObserver);
          break;
        case METHODID_POST_AUTH_PROVIDER:
          serviceImpl.postAuthProvider((io.stackrox.proto.api.v1.AuthproviderService.PostAuthProviderRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_PROVIDER:
          serviceImpl.updateAuthProvider((io.stackrox.proto.api.v1.AuthproviderService.UpdateAuthProviderRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>) responseObserver);
          break;
        case METHODID_PUT_AUTH_PROVIDER:
          serviceImpl.putAuthProvider((io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthProviderOuterClass.AuthProvider>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_PROVIDER:
          serviceImpl.deleteAuthProvider((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_EXCHANGE_TOKEN:
          serviceImpl.exchangeToken((io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AuthproviderService.ExchangeTokenResponse>) responseObserver);
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

  private static abstract class AuthProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthProviderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.AuthproviderService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthProviderService");
    }
  }

  private static final class AuthProviderServiceFileDescriptorSupplier
      extends AuthProviderServiceBaseDescriptorSupplier {
    AuthProviderServiceFileDescriptorSupplier() {}
  }

  private static final class AuthProviderServiceMethodDescriptorSupplier
      extends AuthProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthProviderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthProviderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthProviderServiceFileDescriptorSupplier())
              .addMethod(getGetAuthProviderMethod())
              .addMethod(getGetLoginAuthProvidersMethod())
              .addMethod(getGetAuthProvidersMethod())
              .addMethod(getPostAuthProviderMethod())
              .addMethod(getUpdateAuthProviderMethod())
              .addMethod(getPutAuthProviderMethod())
              .addMethod(getDeleteAuthProviderMethod())
              .addMethod(getExchangeTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
