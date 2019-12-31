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
 * ConfigService APIs can be used to manage Central config.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/config_service.proto")
public final class ConfigServiceGrpc {

  private ConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.ConfigOuterClass.PublicConfig> getGetPublicConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicConfig",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.storage.ConfigOuterClass.PublicConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.ConfigOuterClass.PublicConfig> getGetPublicConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.ConfigOuterClass.PublicConfig> getGetPublicConfigMethod;
    if ((getGetPublicConfigMethod = ConfigServiceGrpc.getGetPublicConfigMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getGetPublicConfigMethod = ConfigServiceGrpc.getGetPublicConfigMethod) == null) {
          ConfigServiceGrpc.getGetPublicConfigMethod = getGetPublicConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.ConfigOuterClass.PublicConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ConfigService", "GetPublicConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ConfigOuterClass.PublicConfig.getDefaultInstance()))
                  .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("GetPublicConfig"))
                  .build();
          }
        }
     }
     return getGetPublicConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig> getGetPrivateConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrivateConfig",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig> getGetPrivateConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig> getGetPrivateConfigMethod;
    if ((getGetPrivateConfigMethod = ConfigServiceGrpc.getGetPrivateConfigMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getGetPrivateConfigMethod = ConfigServiceGrpc.getGetPrivateConfigMethod) == null) {
          ConfigServiceGrpc.getGetPrivateConfigMethod = getGetPrivateConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ConfigService", "GetPrivateConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig.getDefaultInstance()))
                  .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("GetPrivateConfig"))
                  .build();
          }
        }
     }
     return getGetPrivateConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.ConfigOuterClass.Config> getGetConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfig",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.storage.ConfigOuterClass.Config.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.ConfigOuterClass.Config> getGetConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.ConfigOuterClass.Config> getGetConfigMethod;
    if ((getGetConfigMethod = ConfigServiceGrpc.getGetConfigMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getGetConfigMethod = ConfigServiceGrpc.getGetConfigMethod) == null) {
          ConfigServiceGrpc.getGetConfigMethod = getGetConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.ConfigOuterClass.Config>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ConfigService", "GetConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ConfigOuterClass.Config.getDefaultInstance()))
                  .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("GetConfig"))
                  .build();
          }
        }
     }
     return getGetConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest,
      io.stackrox.proto.storage.ConfigOuterClass.Config> getPutConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutConfig",
      requestType = io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest.class,
      responseType = io.stackrox.proto.storage.ConfigOuterClass.Config.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest,
      io.stackrox.proto.storage.ConfigOuterClass.Config> getPutConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest, io.stackrox.proto.storage.ConfigOuterClass.Config> getPutConfigMethod;
    if ((getPutConfigMethod = ConfigServiceGrpc.getPutConfigMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getPutConfigMethod = ConfigServiceGrpc.getPutConfigMethod) == null) {
          ConfigServiceGrpc.getPutConfigMethod = getPutConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest, io.stackrox.proto.storage.ConfigOuterClass.Config>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ConfigService", "PutConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ConfigOuterClass.Config.getDefaultInstance()))
                  .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("PutConfig"))
                  .build();
          }
        }
     }
     return getPutConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigServiceStub newStub(io.grpc.Channel channel) {
    return new ConfigServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConfigServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConfigServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ConfigService APIs can be used to manage Central config.
   * </pre>
   */
  public static abstract class ConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPublicConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.PublicConfig> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPublicConfigMethod(), responseObserver);
    }

    /**
     */
    public void getPrivateConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrivateConfigMethod(), responseObserver);
    }

    /**
     */
    public void getConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.Config> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConfigMethod(), responseObserver);
    }

    /**
     */
    public void putConfig(io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.Config> responseObserver) {
      asyncUnimplementedUnaryCall(getPutConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPublicConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.storage.ConfigOuterClass.PublicConfig>(
                  this, METHODID_GET_PUBLIC_CONFIG)))
          .addMethod(
            getGetPrivateConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig>(
                  this, METHODID_GET_PRIVATE_CONFIG)))
          .addMethod(
            getGetConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.storage.ConfigOuterClass.Config>(
                  this, METHODID_GET_CONFIG)))
          .addMethod(
            getPutConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest,
                io.stackrox.proto.storage.ConfigOuterClass.Config>(
                  this, METHODID_PUT_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * ConfigService APIs can be used to manage Central config.
   * </pre>
   */
  public static final class ConfigServiceStub extends io.grpc.stub.AbstractStub<ConfigServiceStub> {
    private ConfigServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPublicConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.PublicConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPublicConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPrivateConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPrivateConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.Config> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putConfig(io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.Config> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ConfigService APIs can be used to manage Central config.
   * </pre>
   */
  public static final class ConfigServiceBlockingStub extends io.grpc.stub.AbstractStub<ConfigServiceBlockingStub> {
    private ConfigServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.storage.ConfigOuterClass.PublicConfig getPublicConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPublicConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig getPrivateConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPrivateConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.ConfigOuterClass.Config getConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.ConfigOuterClass.Config putConfig(io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ConfigService APIs can be used to manage Central config.
   * </pre>
   */
  public static final class ConfigServiceFutureStub extends io.grpc.stub.AbstractStub<ConfigServiceFutureStub> {
    private ConfigServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ConfigOuterClass.PublicConfig> getPublicConfig(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPublicConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig> getPrivateConfig(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPrivateConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ConfigOuterClass.Config> getConfig(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ConfigOuterClass.Config> putConfig(
        io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PUBLIC_CONFIG = 0;
  private static final int METHODID_GET_PRIVATE_CONFIG = 1;
  private static final int METHODID_GET_CONFIG = 2;
  private static final int METHODID_PUT_CONFIG = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PUBLIC_CONFIG:
          serviceImpl.getPublicConfig((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.PublicConfig>) responseObserver);
          break;
        case METHODID_GET_PRIVATE_CONFIG:
          serviceImpl.getPrivateConfig((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.PrivateConfig>) responseObserver);
          break;
        case METHODID_GET_CONFIG:
          serviceImpl.getConfig((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.Config>) responseObserver);
          break;
        case METHODID_PUT_CONFIG:
          serviceImpl.putConfig((io.stackrox.proto.api.v1.ConfigServiceOuterClass.PutConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ConfigOuterClass.Config>) responseObserver);
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

  private static abstract class ConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ConfigServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfigService");
    }
  }

  private static final class ConfigServiceFileDescriptorSupplier
      extends ConfigServiceBaseDescriptorSupplier {
    ConfigServiceFileDescriptorSupplier() {}
  }

  private static final class ConfigServiceMethodDescriptorSupplier
      extends ConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigServiceFileDescriptorSupplier())
              .addMethod(getGetPublicConfigMethod())
              .addMethod(getGetPrivateConfigMethod())
              .addMethod(getGetConfigMethod())
              .addMethod(getPutConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
