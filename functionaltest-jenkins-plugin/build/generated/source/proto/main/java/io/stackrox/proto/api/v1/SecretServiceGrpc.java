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
    comments = "Source: api/v1/secret_service.proto")
public final class SecretServiceGrpc {

  private SecretServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.SecretService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.SecretOuterClass.Secret> getGetSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecret",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.SecretOuterClass.Secret.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.SecretOuterClass.Secret> getGetSecretMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.SecretOuterClass.Secret> getGetSecretMethod;
    if ((getGetSecretMethod = SecretServiceGrpc.getGetSecretMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getGetSecretMethod = SecretServiceGrpc.getGetSecretMethod) == null) {
          SecretServiceGrpc.getGetSecretMethod = getGetSecretMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.SecretOuterClass.Secret>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SecretService", "GetSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.SecretOuterClass.Secret.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("GetSecret"))
                  .build();
          }
        }
     }
     return getGetSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse> getCountSecretsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountSecrets",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse> getCountSecretsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse> getCountSecretsMethod;
    if ((getCountSecretsMethod = SecretServiceGrpc.getCountSecretsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getCountSecretsMethod = SecretServiceGrpc.getCountSecretsMethod) == null) {
          SecretServiceGrpc.getCountSecretsMethod = getCountSecretsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SecretService", "CountSecrets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("CountSecrets"))
                  .build();
          }
        }
     }
     return getCountSecretsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse> getListSecretsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecrets",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse> getListSecretsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse> getListSecretsMethod;
    if ((getListSecretsMethod = SecretServiceGrpc.getListSecretsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getListSecretsMethod = SecretServiceGrpc.getListSecretsMethod) == null) {
          SecretServiceGrpc.getListSecretsMethod = getListSecretsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SecretService", "ListSecrets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("ListSecrets"))
                  .build();
          }
        }
     }
     return getListSecretsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretServiceStub newStub(io.grpc.Channel channel) {
    return new SecretServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecretServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecretServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SecretServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSecret(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.SecretOuterClass.Secret> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSecretMethod(), responseObserver);
    }

    /**
     */
    public void countSecrets(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountSecretsMethod(), responseObserver);
    }

    /**
     */
    public void listSecrets(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSecretsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSecretMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.SecretOuterClass.Secret>(
                  this, METHODID_GET_SECRET)))
          .addMethod(
            getCountSecretsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse>(
                  this, METHODID_COUNT_SECRETS)))
          .addMethod(
            getListSecretsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse>(
                  this, METHODID_LIST_SECRETS)))
          .build();
    }
  }

  /**
   */
  public static final class SecretServiceStub extends io.grpc.stub.AbstractStub<SecretServiceStub> {
    private SecretServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSecret(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.SecretOuterClass.Secret> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countSecrets(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountSecretsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSecrets(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSecretsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SecretServiceBlockingStub extends io.grpc.stub.AbstractStub<SecretServiceBlockingStub> {
    private SecretServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.storage.SecretOuterClass.Secret getSecret(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse countSecrets(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getCountSecretsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse listSecrets(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListSecretsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecretServiceFutureStub extends io.grpc.stub.AbstractStub<SecretServiceFutureStub> {
    private SecretServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.SecretOuterClass.Secret> getSecret(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse> countSecrets(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getCountSecretsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse> listSecrets(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListSecretsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SECRET = 0;
  private static final int METHODID_COUNT_SECRETS = 1;
  private static final int METHODID_LIST_SECRETS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecretServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SECRET:
          serviceImpl.getSecret((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.SecretOuterClass.Secret>) responseObserver);
          break;
        case METHODID_COUNT_SECRETS:
          serviceImpl.countSecrets((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SecretServiceOuterClass.CountSecretsResponse>) responseObserver);
          break;
        case METHODID_LIST_SECRETS:
          serviceImpl.listSecrets((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SecretServiceOuterClass.ListSecretsResponse>) responseObserver);
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

  private static abstract class SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.SecretServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretService");
    }
  }

  private static final class SecretServiceFileDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier {
    SecretServiceFileDescriptorSupplier() {}
  }

  private static final class SecretServiceMethodDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecretServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretServiceFileDescriptorSupplier())
              .addMethod(getGetSecretMethod())
              .addMethod(getCountSecretsMethod())
              .addMethod(getListSecretsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
