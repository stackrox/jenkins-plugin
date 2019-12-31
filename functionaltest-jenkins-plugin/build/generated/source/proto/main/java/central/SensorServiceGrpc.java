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
    comments = "Source: internalapi/central/sensor_iservice.proto")
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "central.SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<central.SensorIservice.MsgFromSensor,
      central.SensorIservice.MsgToSensor> getCommunicateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Communicate",
      requestType = central.SensorIservice.MsgFromSensor.class,
      responseType = central.SensorIservice.MsgToSensor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<central.SensorIservice.MsgFromSensor,
      central.SensorIservice.MsgToSensor> getCommunicateMethod() {
    io.grpc.MethodDescriptor<central.SensorIservice.MsgFromSensor, central.SensorIservice.MsgToSensor> getCommunicateMethod;
    if ((getCommunicateMethod = SensorServiceGrpc.getCommunicateMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getCommunicateMethod = SensorServiceGrpc.getCommunicateMethod) == null) {
          SensorServiceGrpc.getCommunicateMethod = getCommunicateMethod = 
              io.grpc.MethodDescriptor.<central.SensorIservice.MsgFromSensor, central.SensorIservice.MsgToSensor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "central.SensorService", "Communicate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.SensorIservice.MsgFromSensor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.SensorIservice.MsgToSensor.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("Communicate"))
                  .build();
          }
        }
     }
     return getCommunicateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    return new SensorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SensorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SensorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<central.SensorIservice.MsgFromSensor> communicate(
        io.grpc.stub.StreamObserver<central.SensorIservice.MsgToSensor> responseObserver) {
      return asyncUnimplementedStreamingCall(getCommunicateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommunicateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                central.SensorIservice.MsgFromSensor,
                central.SensorIservice.MsgToSensor>(
                  this, METHODID_COMMUNICATE)))
          .build();
    }
  }

  /**
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractStub<SensorServiceStub> {
    private SensorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<central.SensorIservice.MsgFromSensor> communicate(
        io.grpc.stub.StreamObserver<central.SensorIservice.MsgToSensor> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCommunicateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COMMUNICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMUNICATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.communicate(
              (io.grpc.stub.StreamObserver<central.SensorIservice.MsgToSensor>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return central.SensorIservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorService");
    }
  }

  private static final class SensorServiceFileDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier {
    SensorServiceFileDescriptorSupplier() {}
  }

  private static final class SensorServiceMethodDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorServiceFileDescriptorSupplier())
              .addMethod(getCommunicateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
