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
 * APITokenService APIs can be used to manage API tokens.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/api_token_service.proto")
public final class APITokenServiceGrpc {

  private APITokenServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.APITokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ApiToken.TokenMetadata> getGetAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPIToken",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.ApiToken.TokenMetadata.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ApiToken.TokenMetadata> getGetAPITokenMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ApiToken.TokenMetadata> getGetAPITokenMethod;
    if ((getGetAPITokenMethod = APITokenServiceGrpc.getGetAPITokenMethod) == null) {
      synchronized (APITokenServiceGrpc.class) {
        if ((getGetAPITokenMethod = APITokenServiceGrpc.getGetAPITokenMethod) == null) {
          APITokenServiceGrpc.getGetAPITokenMethod = getGetAPITokenMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ApiToken.TokenMetadata>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.APITokenService", "GetAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ApiToken.TokenMetadata.getDefaultInstance()))
                  .setSchemaDescriptor(new APITokenServiceMethodDescriptorSupplier("GetAPIToken"))
                  .build();
          }
        }
     }
     return getGetAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest,
      io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse> getGetAPITokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPITokens",
      requestType = io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest.class,
      responseType = io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest,
      io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse> getGetAPITokensMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest, io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse> getGetAPITokensMethod;
    if ((getGetAPITokensMethod = APITokenServiceGrpc.getGetAPITokensMethod) == null) {
      synchronized (APITokenServiceGrpc.class) {
        if ((getGetAPITokensMethod = APITokenServiceGrpc.getGetAPITokensMethod) == null) {
          APITokenServiceGrpc.getGetAPITokensMethod = getGetAPITokensMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest, io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.APITokenService", "GetAPITokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new APITokenServiceMethodDescriptorSupplier("GetAPITokens"))
                  .build();
          }
        }
     }
     return getGetAPITokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest,
      io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse> getGenerateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateToken",
      requestType = io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest.class,
      responseType = io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest,
      io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse> getGenerateTokenMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest, io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse> getGenerateTokenMethod;
    if ((getGenerateTokenMethod = APITokenServiceGrpc.getGenerateTokenMethod) == null) {
      synchronized (APITokenServiceGrpc.class) {
        if ((getGenerateTokenMethod = APITokenServiceGrpc.getGenerateTokenMethod) == null) {
          APITokenServiceGrpc.getGenerateTokenMethod = getGenerateTokenMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest, io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.APITokenService", "GenerateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new APITokenServiceMethodDescriptorSupplier("GenerateToken"))
                  .build();
          }
        }
     }
     return getGenerateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getRevokeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeToken",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getRevokeTokenMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getRevokeTokenMethod;
    if ((getRevokeTokenMethod = APITokenServiceGrpc.getRevokeTokenMethod) == null) {
      synchronized (APITokenServiceGrpc.class) {
        if ((getRevokeTokenMethod = APITokenServiceGrpc.getRevokeTokenMethod) == null) {
          APITokenServiceGrpc.getRevokeTokenMethod = getRevokeTokenMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.APITokenService", "RevokeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new APITokenServiceMethodDescriptorSupplier("RevokeToken"))
                  .build();
          }
        }
     }
     return getRevokeTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static APITokenServiceStub newStub(io.grpc.Channel channel) {
    return new APITokenServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static APITokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new APITokenServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static APITokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new APITokenServiceFutureStub(channel);
  }

  /**
   * <pre>
   * APITokenService APIs can be used to manage API tokens.
   * </pre>
   */
  public static abstract class APITokenServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetAPIToken returns API token metadata for a given id.
     * </pre>
     */
    public void getAPIToken(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ApiToken.TokenMetadata> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAPITokens returns all the API tokens.
     * </pre>
     */
    public void getAPITokens(io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAPITokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * GenerateToken generates API token for a given user and role.
     * </pre>
     */
    public void generateToken(io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeToken removes the API token for a given id.
     * </pre>
     */
    public void revokeToken(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAPITokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.ApiToken.TokenMetadata>(
                  this, METHODID_GET_APITOKEN)))
          .addMethod(
            getGetAPITokensMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest,
                io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse>(
                  this, METHODID_GET_APITOKENS)))
          .addMethod(
            getGenerateTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest,
                io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse>(
                  this, METHODID_GENERATE_TOKEN)))
          .addMethod(
            getRevokeTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_REVOKE_TOKEN)))
          .build();
    }
  }

  /**
   * <pre>
   * APITokenService APIs can be used to manage API tokens.
   * </pre>
   */
  public static final class APITokenServiceStub extends io.grpc.stub.AbstractStub<APITokenServiceStub> {
    private APITokenServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APITokenServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APITokenServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APITokenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAPIToken returns API token metadata for a given id.
     * </pre>
     */
    public void getAPIToken(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ApiToken.TokenMetadata> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAPITokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAPITokens returns all the API tokens.
     * </pre>
     */
    public void getAPITokens(io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAPITokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GenerateToken generates API token for a given user and role.
     * </pre>
     */
    public void generateToken(io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeToken removes the API token for a given id.
     * </pre>
     */
    public void revokeToken(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * APITokenService APIs can be used to manage API tokens.
   * </pre>
   */
  public static final class APITokenServiceBlockingStub extends io.grpc.stub.AbstractStub<APITokenServiceBlockingStub> {
    private APITokenServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APITokenServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APITokenServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APITokenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAPIToken returns API token metadata for a given id.
     * </pre>
     */
    public io.stackrox.proto.storage.ApiToken.TokenMetadata getAPIToken(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetAPITokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAPITokens returns all the API tokens.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse getAPITokens(io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAPITokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GenerateToken generates API token for a given user and role.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse generateToken(io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeToken removes the API token for a given id.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty revokeToken(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getRevokeTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * APITokenService APIs can be used to manage API tokens.
   * </pre>
   */
  public static final class APITokenServiceFutureStub extends io.grpc.stub.AbstractStub<APITokenServiceFutureStub> {
    private APITokenServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APITokenServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APITokenServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APITokenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAPIToken returns API token metadata for a given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ApiToken.TokenMetadata> getAPIToken(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAPITokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAPITokens returns all the API tokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse> getAPITokens(
        io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAPITokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GenerateToken generates API token for a given user and role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse> generateToken(
        io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeToken removes the API token for a given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> revokeToken(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_APITOKEN = 0;
  private static final int METHODID_GET_APITOKENS = 1;
  private static final int METHODID_GENERATE_TOKEN = 2;
  private static final int METHODID_REVOKE_TOKEN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final APITokenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(APITokenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_APITOKEN:
          serviceImpl.getAPIToken((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ApiToken.TokenMetadata>) responseObserver);
          break;
        case METHODID_GET_APITOKENS:
          serviceImpl.getAPITokens((io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ApiTokenService.GetAPITokensResponse>) responseObserver);
          break;
        case METHODID_GENERATE_TOKEN:
          serviceImpl.generateToken((io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse>) responseObserver);
          break;
        case METHODID_REVOKE_TOKEN:
          serviceImpl.revokeToken((io.stackrox.proto.api.v1.Common.ResourceByID) request,
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

  private static abstract class APITokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    APITokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ApiTokenService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("APITokenService");
    }
  }

  private static final class APITokenServiceFileDescriptorSupplier
      extends APITokenServiceBaseDescriptorSupplier {
    APITokenServiceFileDescriptorSupplier() {}
  }

  private static final class APITokenServiceMethodDescriptorSupplier
      extends APITokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    APITokenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (APITokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new APITokenServiceFileDescriptorSupplier())
              .addMethod(getGetAPITokenMethod())
              .addMethod(getGetAPITokensMethod())
              .addMethod(getGenerateTokenMethod())
              .addMethod(getRevokeTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
