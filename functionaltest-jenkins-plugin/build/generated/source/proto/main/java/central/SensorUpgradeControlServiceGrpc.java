package central;

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
    comments = "Source: internalapi/central/sensor_upgrade_ctrl_iservice.proto")
public final class SensorUpgradeControlServiceGrpc {

  private SensorUpgradeControlServiceGrpc() {}

  public static final String SERVICE_NAME = "central.SensorUpgradeControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest,
      central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse> getUpgradeCheckInFromUpgraderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeCheckInFromUpgrader",
      requestType = central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest.class,
      responseType = central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest,
      central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse> getUpgradeCheckInFromUpgraderMethod() {
    io.grpc.MethodDescriptor<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest, central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse> getUpgradeCheckInFromUpgraderMethod;
    if ((getUpgradeCheckInFromUpgraderMethod = SensorUpgradeControlServiceGrpc.getUpgradeCheckInFromUpgraderMethod) == null) {
      synchronized (SensorUpgradeControlServiceGrpc.class) {
        if ((getUpgradeCheckInFromUpgraderMethod = SensorUpgradeControlServiceGrpc.getUpgradeCheckInFromUpgraderMethod) == null) {
          SensorUpgradeControlServiceGrpc.getUpgradeCheckInFromUpgraderMethod = getUpgradeCheckInFromUpgraderMethod = 
              io.grpc.MethodDescriptor.<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest, central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "central.SensorUpgradeControlService", "UpgradeCheckInFromUpgrader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorUpgradeControlServiceMethodDescriptorSupplier("UpgradeCheckInFromUpgrader"))
                  .build();
          }
        }
     }
     return getUpgradeCheckInFromUpgraderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest,
      com.google.protobuf.Empty> getUpgradeCheckInFromSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeCheckInFromSensor",
      requestType = central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest,
      com.google.protobuf.Empty> getUpgradeCheckInFromSensorMethod() {
    io.grpc.MethodDescriptor<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest, com.google.protobuf.Empty> getUpgradeCheckInFromSensorMethod;
    if ((getUpgradeCheckInFromSensorMethod = SensorUpgradeControlServiceGrpc.getUpgradeCheckInFromSensorMethod) == null) {
      synchronized (SensorUpgradeControlServiceGrpc.class) {
        if ((getUpgradeCheckInFromSensorMethod = SensorUpgradeControlServiceGrpc.getUpgradeCheckInFromSensorMethod) == null) {
          SensorUpgradeControlServiceGrpc.getUpgradeCheckInFromSensorMethod = getUpgradeCheckInFromSensorMethod = 
              io.grpc.MethodDescriptor.<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "central.SensorUpgradeControlService", "UpgradeCheckInFromSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorUpgradeControlServiceMethodDescriptorSupplier("UpgradeCheckInFromSensor"))
                  .build();
          }
        }
     }
     return getUpgradeCheckInFromSensorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorUpgradeControlServiceStub newStub(io.grpc.Channel channel) {
    return new SensorUpgradeControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorUpgradeControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SensorUpgradeControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorUpgradeControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SensorUpgradeControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SensorUpgradeControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void upgradeCheckInFromUpgrader(central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest request,
        io.grpc.stub.StreamObserver<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpgradeCheckInFromUpgraderMethod(), responseObserver);
    }

    /**
     */
    public void upgradeCheckInFromSensor(central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpgradeCheckInFromSensorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpgradeCheckInFromUpgraderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest,
                central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse>(
                  this, METHODID_UPGRADE_CHECK_IN_FROM_UPGRADER)))
          .addMethod(
            getUpgradeCheckInFromSensorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPGRADE_CHECK_IN_FROM_SENSOR)))
          .build();
    }
  }

  /**
   */
  public static final class SensorUpgradeControlServiceStub extends io.grpc.stub.AbstractStub<SensorUpgradeControlServiceStub> {
    private SensorUpgradeControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorUpgradeControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorUpgradeControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorUpgradeControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void upgradeCheckInFromUpgrader(central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest request,
        io.grpc.stub.StreamObserver<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpgradeCheckInFromUpgraderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upgradeCheckInFromSensor(central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpgradeCheckInFromSensorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorUpgradeControlServiceBlockingStub extends io.grpc.stub.AbstractStub<SensorUpgradeControlServiceBlockingStub> {
    private SensorUpgradeControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorUpgradeControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorUpgradeControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorUpgradeControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse upgradeCheckInFromUpgrader(central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpgradeCheckInFromUpgraderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty upgradeCheckInFromSensor(central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpgradeCheckInFromSensorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorUpgradeControlServiceFutureStub extends io.grpc.stub.AbstractStub<SensorUpgradeControlServiceFutureStub> {
    private SensorUpgradeControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorUpgradeControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorUpgradeControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorUpgradeControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse> upgradeCheckInFromUpgrader(
        central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpgradeCheckInFromUpgraderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> upgradeCheckInFromSensor(
        central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpgradeCheckInFromSensorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPGRADE_CHECK_IN_FROM_UPGRADER = 0;
  private static final int METHODID_UPGRADE_CHECK_IN_FROM_SENSOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorUpgradeControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorUpgradeControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPGRADE_CHECK_IN_FROM_UPGRADER:
          serviceImpl.upgradeCheckInFromUpgrader((central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderRequest) request,
              (io.grpc.stub.StreamObserver<central.SensorUpgradeCtrlIservice.UpgradeCheckInFromUpgraderResponse>) responseObserver);
          break;
        case METHODID_UPGRADE_CHECK_IN_FROM_SENSOR:
          serviceImpl.upgradeCheckInFromSensor((central.SensorUpgradeCtrlIservice.UpgradeCheckInFromSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class SensorUpgradeControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorUpgradeControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return central.SensorUpgradeCtrlIservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorUpgradeControlService");
    }
  }

  private static final class SensorUpgradeControlServiceFileDescriptorSupplier
      extends SensorUpgradeControlServiceBaseDescriptorSupplier {
    SensorUpgradeControlServiceFileDescriptorSupplier() {}
  }

  private static final class SensorUpgradeControlServiceMethodDescriptorSupplier
      extends SensorUpgradeControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorUpgradeControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorUpgradeControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorUpgradeControlServiceFileDescriptorSupplier())
              .addMethod(getUpgradeCheckInFromUpgraderMethod())
              .addMethod(getUpgradeCheckInFromSensorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
