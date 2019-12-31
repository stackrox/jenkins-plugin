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
 * ScopedAccesssControlService manages configuration related to scoped access control.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/scoped_access_control_service.proto")
public final class ScopedAccessControlServiceGrpc {

  private ScopedAccessControlServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ScopedAccessControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDryRunAuthzPluginConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DryRunAuthzPluginConfig",
      requestType = io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDryRunAuthzPluginConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDryRunAuthzPluginConfigMethod;
    if ((getDryRunAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getDryRunAuthzPluginConfigMethod) == null) {
      synchronized (ScopedAccessControlServiceGrpc.class) {
        if ((getDryRunAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getDryRunAuthzPluginConfigMethod) == null) {
          ScopedAccessControlServiceGrpc.getDryRunAuthzPluginConfigMethod = getDryRunAuthzPluginConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ScopedAccessControlService", "DryRunAuthzPluginConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ScopedAccessControlServiceMethodDescriptorSupplier("DryRunAuthzPluginConfig"))
                  .build();
          }
        }
     }
     return getDryRunAuthzPluginConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse> getGetAuthzPluginConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthzPluginConfigs",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse> getGetAuthzPluginConfigsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse> getGetAuthzPluginConfigsMethod;
    if ((getGetAuthzPluginConfigsMethod = ScopedAccessControlServiceGrpc.getGetAuthzPluginConfigsMethod) == null) {
      synchronized (ScopedAccessControlServiceGrpc.class) {
        if ((getGetAuthzPluginConfigsMethod = ScopedAccessControlServiceGrpc.getGetAuthzPluginConfigsMethod) == null) {
          ScopedAccessControlServiceGrpc.getGetAuthzPluginConfigsMethod = getGetAuthzPluginConfigsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ScopedAccessControlService", "GetAuthzPluginConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScopedAccessControlServiceMethodDescriptorSupplier("GetAuthzPluginConfigs"))
                  .build();
          }
        }
     }
     return getGetAuthzPluginConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
      io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> getAddAuthzPluginConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAuthzPluginConfig",
      requestType = io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest.class,
      responseType = io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
      io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> getAddAuthzPluginConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest, io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> getAddAuthzPluginConfigMethod;
    if ((getAddAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getAddAuthzPluginConfigMethod) == null) {
      synchronized (ScopedAccessControlServiceGrpc.class) {
        if ((getAddAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getAddAuthzPluginConfigMethod) == null) {
          ScopedAccessControlServiceGrpc.getAddAuthzPluginConfigMethod = getAddAuthzPluginConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest, io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ScopedAccessControlService", "AddAuthzPluginConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig.getDefaultInstance()))
                  .setSchemaDescriptor(new ScopedAccessControlServiceMethodDescriptorSupplier("AddAuthzPluginConfig"))
                  .build();
          }
        }
     }
     return getAddAuthzPluginConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
      io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> getUpdateAuthzPluginConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthzPluginConfig",
      requestType = io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest.class,
      responseType = io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
      io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> getUpdateAuthzPluginConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest, io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> getUpdateAuthzPluginConfigMethod;
    if ((getUpdateAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getUpdateAuthzPluginConfigMethod) == null) {
      synchronized (ScopedAccessControlServiceGrpc.class) {
        if ((getUpdateAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getUpdateAuthzPluginConfigMethod) == null) {
          ScopedAccessControlServiceGrpc.getUpdateAuthzPluginConfigMethod = getUpdateAuthzPluginConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest, io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ScopedAccessControlService", "UpdateAuthzPluginConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig.getDefaultInstance()))
                  .setSchemaDescriptor(new ScopedAccessControlServiceMethodDescriptorSupplier("UpdateAuthzPluginConfig"))
                  .build();
          }
        }
     }
     return getUpdateAuthzPluginConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteAuthzPluginConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthzPluginConfig",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteAuthzPluginConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteAuthzPluginConfigMethod;
    if ((getDeleteAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getDeleteAuthzPluginConfigMethod) == null) {
      synchronized (ScopedAccessControlServiceGrpc.class) {
        if ((getDeleteAuthzPluginConfigMethod = ScopedAccessControlServiceGrpc.getDeleteAuthzPluginConfigMethod) == null) {
          ScopedAccessControlServiceGrpc.getDeleteAuthzPluginConfigMethod = getDeleteAuthzPluginConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ScopedAccessControlService", "DeleteAuthzPluginConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ScopedAccessControlServiceMethodDescriptorSupplier("DeleteAuthzPluginConfig"))
                  .build();
          }
        }
     }
     return getDeleteAuthzPluginConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScopedAccessControlServiceStub newStub(io.grpc.Channel channel) {
    return new ScopedAccessControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScopedAccessControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ScopedAccessControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScopedAccessControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ScopedAccessControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ScopedAccesssControlService manages configuration related to scoped access control.
   * </pre>
   */
  public static abstract class ScopedAccessControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void dryRunAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDryRunAuthzPluginConfigMethod(), responseObserver);
    }

    /**
     */
    public void getAuthzPluginConfigs(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthzPluginConfigsMethod(), responseObserver);
    }

    /**
     */
    public void addAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAuthzPluginConfigMethod(), responseObserver);
    }

    /**
     */
    public void updateAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAuthzPluginConfigMethod(), responseObserver);
    }

    /**
     */
    public void deleteAuthzPluginConfig(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAuthzPluginConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDryRunAuthzPluginConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DRY_RUN_AUTHZ_PLUGIN_CONFIG)))
          .addMethod(
            getGetAuthzPluginConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse>(
                  this, METHODID_GET_AUTHZ_PLUGIN_CONFIGS)))
          .addMethod(
            getAddAuthzPluginConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
                io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig>(
                  this, METHODID_ADD_AUTHZ_PLUGIN_CONFIG)))
          .addMethod(
            getUpdateAuthzPluginConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest,
                io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig>(
                  this, METHODID_UPDATE_AUTHZ_PLUGIN_CONFIG)))
          .addMethod(
            getDeleteAuthzPluginConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_AUTHZ_PLUGIN_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * ScopedAccesssControlService manages configuration related to scoped access control.
   * </pre>
   */
  public static final class ScopedAccessControlServiceStub extends io.grpc.stub.AbstractStub<ScopedAccessControlServiceStub> {
    private ScopedAccessControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScopedAccessControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScopedAccessControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScopedAccessControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void dryRunAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDryRunAuthzPluginConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthzPluginConfigs(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthzPluginConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAuthzPluginConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAuthzPluginConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAuthzPluginConfig(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAuthzPluginConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ScopedAccesssControlService manages configuration related to scoped access control.
   * </pre>
   */
  public static final class ScopedAccessControlServiceBlockingStub extends io.grpc.stub.AbstractStub<ScopedAccessControlServiceBlockingStub> {
    private ScopedAccessControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScopedAccessControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScopedAccessControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScopedAccessControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty dryRunAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getDryRunAuthzPluginConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse getAuthzPluginConfigs(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthzPluginConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig addAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddAuthzPluginConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig updateAuthzPluginConfig(io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAuthzPluginConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteAuthzPluginConfig(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAuthzPluginConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ScopedAccesssControlService manages configuration related to scoped access control.
   * </pre>
   */
  public static final class ScopedAccessControlServiceFutureStub extends io.grpc.stub.AbstractStub<ScopedAccessControlServiceFutureStub> {
    private ScopedAccessControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScopedAccessControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScopedAccessControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScopedAccessControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> dryRunAuthzPluginConfig(
        io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDryRunAuthzPluginConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse> getAuthzPluginConfigs(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthzPluginConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> addAuthzPluginConfig(
        io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAuthzPluginConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig> updateAuthzPluginConfig(
        io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAuthzPluginConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteAuthzPluginConfig(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAuthzPluginConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DRY_RUN_AUTHZ_PLUGIN_CONFIG = 0;
  private static final int METHODID_GET_AUTHZ_PLUGIN_CONFIGS = 1;
  private static final int METHODID_ADD_AUTHZ_PLUGIN_CONFIG = 2;
  private static final int METHODID_UPDATE_AUTHZ_PLUGIN_CONFIG = 3;
  private static final int METHODID_DELETE_AUTHZ_PLUGIN_CONFIG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScopedAccessControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScopedAccessControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DRY_RUN_AUTHZ_PLUGIN_CONFIG:
          serviceImpl.dryRunAuthzPluginConfig((io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_AUTHZ_PLUGIN_CONFIGS:
          serviceImpl.getAuthzPluginConfigs((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.GetAuthzPluginConfigsResponse>) responseObserver);
          break;
        case METHODID_ADD_AUTHZ_PLUGIN_CONFIG:
          serviceImpl.addAuthzPluginConfig((io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig>) responseObserver);
          break;
        case METHODID_UPDATE_AUTHZ_PLUGIN_CONFIG:
          serviceImpl.updateAuthzPluginConfig((io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.UpsertAuthzPluginConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AuthzPlugin.AuthzPluginConfig>) responseObserver);
          break;
        case METHODID_DELETE_AUTHZ_PLUGIN_CONFIG:
          serviceImpl.deleteAuthzPluginConfig((io.stackrox.proto.api.v1.Common.ResourceByID) request,
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

  private static abstract class ScopedAccessControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScopedAccessControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ScopedAccessControlServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScopedAccessControlService");
    }
  }

  private static final class ScopedAccessControlServiceFileDescriptorSupplier
      extends ScopedAccessControlServiceBaseDescriptorSupplier {
    ScopedAccessControlServiceFileDescriptorSupplier() {}
  }

  private static final class ScopedAccessControlServiceMethodDescriptorSupplier
      extends ScopedAccessControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScopedAccessControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScopedAccessControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScopedAccessControlServiceFileDescriptorSupplier())
              .addMethod(getDryRunAuthzPluginConfigMethod())
              .addMethod(getGetAuthzPluginConfigsMethod())
              .addMethod(getAddAuthzPluginConfigMethod())
              .addMethod(getUpdateAuthzPluginConfigMethod())
              .addMethod(getDeleteAuthzPluginConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
