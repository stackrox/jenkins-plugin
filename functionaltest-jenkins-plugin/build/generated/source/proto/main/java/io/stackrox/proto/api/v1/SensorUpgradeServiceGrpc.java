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
    comments = "Source: api/v1/sensor_upgrade_service.proto")
public final class SensorUpgradeServiceGrpc {

  private SensorUpgradeServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.SensorUpgradeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse> getGetSensorUpgradeConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSensorUpgradeConfig",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse> getGetSensorUpgradeConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse> getGetSensorUpgradeConfigMethod;
    if ((getGetSensorUpgradeConfigMethod = SensorUpgradeServiceGrpc.getGetSensorUpgradeConfigMethod) == null) {
      synchronized (SensorUpgradeServiceGrpc.class) {
        if ((getGetSensorUpgradeConfigMethod = SensorUpgradeServiceGrpc.getGetSensorUpgradeConfigMethod) == null) {
          SensorUpgradeServiceGrpc.getGetSensorUpgradeConfigMethod = getGetSensorUpgradeConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SensorUpgradeService", "GetSensorUpgradeConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorUpgradeServiceMethodDescriptorSupplier("GetSensorUpgradeConfig"))
                  .build();
          }
        }
     }
     return getGetSensorUpgradeConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateSensorUpgradeConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSensorUpgradeConfig",
      requestType = io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateSensorUpgradeConfigMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateSensorUpgradeConfigMethod;
    if ((getUpdateSensorUpgradeConfigMethod = SensorUpgradeServiceGrpc.getUpdateSensorUpgradeConfigMethod) == null) {
      synchronized (SensorUpgradeServiceGrpc.class) {
        if ((getUpdateSensorUpgradeConfigMethod = SensorUpgradeServiceGrpc.getUpdateSensorUpgradeConfigMethod) == null) {
          SensorUpgradeServiceGrpc.getUpdateSensorUpgradeConfigMethod = getUpdateSensorUpgradeConfigMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SensorUpgradeService", "UpdateSensorUpgradeConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorUpgradeServiceMethodDescriptorSupplier("UpdateSensorUpgradeConfig"))
                  .build();
          }
        }
     }
     return getUpdateSensorUpgradeConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTriggerSensorUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerSensorUpgrade",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTriggerSensorUpgradeMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTriggerSensorUpgradeMethod;
    if ((getTriggerSensorUpgradeMethod = SensorUpgradeServiceGrpc.getTriggerSensorUpgradeMethod) == null) {
      synchronized (SensorUpgradeServiceGrpc.class) {
        if ((getTriggerSensorUpgradeMethod = SensorUpgradeServiceGrpc.getTriggerSensorUpgradeMethod) == null) {
          SensorUpgradeServiceGrpc.getTriggerSensorUpgradeMethod = getTriggerSensorUpgradeMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SensorUpgradeService", "TriggerSensorUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorUpgradeServiceMethodDescriptorSupplier("TriggerSensorUpgrade"))
                  .build();
          }
        }
     }
     return getTriggerSensorUpgradeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorUpgradeServiceStub newStub(io.grpc.Channel channel) {
    return new SensorUpgradeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorUpgradeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SensorUpgradeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorUpgradeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SensorUpgradeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SensorUpgradeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSensorUpgradeConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSensorUpgradeConfigMethod(), responseObserver);
    }

    /**
     */
    public void updateSensorUpgradeConfig(io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSensorUpgradeConfigMethod(), responseObserver);
    }

    /**
     */
    public void triggerSensorUpgrade(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerSensorUpgradeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSensorUpgradeConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse>(
                  this, METHODID_GET_SENSOR_UPGRADE_CONFIG)))
          .addMethod(
            getUpdateSensorUpgradeConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_UPDATE_SENSOR_UPGRADE_CONFIG)))
          .addMethod(
            getTriggerSensorUpgradeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_TRIGGER_SENSOR_UPGRADE)))
          .build();
    }
  }

  /**
   */
  public static final class SensorUpgradeServiceStub extends io.grpc.stub.AbstractStub<SensorUpgradeServiceStub> {
    private SensorUpgradeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorUpgradeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorUpgradeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorUpgradeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSensorUpgradeConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSensorUpgradeConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSensorUpgradeConfig(io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSensorUpgradeConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerSensorUpgrade(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerSensorUpgradeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorUpgradeServiceBlockingStub extends io.grpc.stub.AbstractStub<SensorUpgradeServiceBlockingStub> {
    private SensorUpgradeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorUpgradeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorUpgradeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorUpgradeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse getSensorUpgradeConfig(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSensorUpgradeConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty updateSensorUpgradeConfig(io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSensorUpgradeConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty triggerSensorUpgrade(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getTriggerSensorUpgradeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorUpgradeServiceFutureStub extends io.grpc.stub.AbstractStub<SensorUpgradeServiceFutureStub> {
    private SensorUpgradeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorUpgradeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorUpgradeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorUpgradeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse> getSensorUpgradeConfig(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSensorUpgradeConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> updateSensorUpgradeConfig(
        io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSensorUpgradeConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> triggerSensorUpgrade(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerSensorUpgradeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SENSOR_UPGRADE_CONFIG = 0;
  private static final int METHODID_UPDATE_SENSOR_UPGRADE_CONFIG = 1;
  private static final int METHODID_TRIGGER_SENSOR_UPGRADE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorUpgradeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorUpgradeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SENSOR_UPGRADE_CONFIG:
          serviceImpl.getSensorUpgradeConfig((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.GetSensorUpgradeConfigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SENSOR_UPGRADE_CONFIG:
          serviceImpl.updateSensorUpgradeConfig((io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.UpdateSensorUpgradeConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_TRIGGER_SENSOR_UPGRADE:
          serviceImpl.triggerSensorUpgrade((io.stackrox.proto.api.v1.Common.ResourceByID) request,
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

  private static abstract class SensorUpgradeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorUpgradeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.SensorUpgradeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorUpgradeService");
    }
  }

  private static final class SensorUpgradeServiceFileDescriptorSupplier
      extends SensorUpgradeServiceBaseDescriptorSupplier {
    SensorUpgradeServiceFileDescriptorSupplier() {}
  }

  private static final class SensorUpgradeServiceMethodDescriptorSupplier
      extends SensorUpgradeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorUpgradeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorUpgradeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorUpgradeServiceFileDescriptorSupplier())
              .addMethod(getGetSensorUpgradeConfigMethod())
              .addMethod(getUpdateSensorUpgradeConfigMethod())
              .addMethod(getTriggerSensorUpgradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
