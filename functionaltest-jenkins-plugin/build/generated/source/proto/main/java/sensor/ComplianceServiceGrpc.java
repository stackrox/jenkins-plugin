package sensor;

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
 * A Sensor service that allows node scrapes to report results.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: internalapi/sensor/compliance_iservice.proto")
public final class ComplianceServiceGrpc {

  private ComplianceServiceGrpc() {}

  public static final String SERVICE_NAME = "sensor.ComplianceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sensor.ComplianceIservice.MsgFromCompliance,
      sensor.ComplianceIservice.MsgToCompliance> getCommunicateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Communicate",
      requestType = sensor.ComplianceIservice.MsgFromCompliance.class,
      responseType = sensor.ComplianceIservice.MsgToCompliance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<sensor.ComplianceIservice.MsgFromCompliance,
      sensor.ComplianceIservice.MsgToCompliance> getCommunicateMethod() {
    io.grpc.MethodDescriptor<sensor.ComplianceIservice.MsgFromCompliance, sensor.ComplianceIservice.MsgToCompliance> getCommunicateMethod;
    if ((getCommunicateMethod = ComplianceServiceGrpc.getCommunicateMethod) == null) {
      synchronized (ComplianceServiceGrpc.class) {
        if ((getCommunicateMethod = ComplianceServiceGrpc.getCommunicateMethod) == null) {
          ComplianceServiceGrpc.getCommunicateMethod = getCommunicateMethod = 
              io.grpc.MethodDescriptor.<sensor.ComplianceIservice.MsgFromCompliance, sensor.ComplianceIservice.MsgToCompliance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensor.ComplianceService", "Communicate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.ComplianceIservice.MsgFromCompliance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.ComplianceIservice.MsgToCompliance.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceServiceMethodDescriptorSupplier("Communicate"))
                  .build();
          }
        }
     }
     return getCommunicateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComplianceServiceStub newStub(io.grpc.Channel channel) {
    return new ComplianceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComplianceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ComplianceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComplianceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ComplianceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A Sensor service that allows node scrapes to report results.
   * </pre>
   */
  public static abstract class ComplianceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<sensor.ComplianceIservice.MsgFromCompliance> communicate(
        io.grpc.stub.StreamObserver<sensor.ComplianceIservice.MsgToCompliance> responseObserver) {
      return asyncUnimplementedStreamingCall(getCommunicateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommunicateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                sensor.ComplianceIservice.MsgFromCompliance,
                sensor.ComplianceIservice.MsgToCompliance>(
                  this, METHODID_COMMUNICATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A Sensor service that allows node scrapes to report results.
   * </pre>
   */
  public static final class ComplianceServiceStub extends io.grpc.stub.AbstractStub<ComplianceServiceStub> {
    private ComplianceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sensor.ComplianceIservice.MsgFromCompliance> communicate(
        io.grpc.stub.StreamObserver<sensor.ComplianceIservice.MsgToCompliance> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCommunicateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * A Sensor service that allows node scrapes to report results.
   * </pre>
   */
  public static final class ComplianceServiceBlockingStub extends io.grpc.stub.AbstractStub<ComplianceServiceBlockingStub> {
    private ComplianceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * A Sensor service that allows node scrapes to report results.
   * </pre>
   */
  public static final class ComplianceServiceFutureStub extends io.grpc.stub.AbstractStub<ComplianceServiceFutureStub> {
    private ComplianceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COMMUNICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComplianceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComplianceServiceImplBase serviceImpl, int methodId) {
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
              (io.grpc.stub.StreamObserver<sensor.ComplianceIservice.MsgToCompliance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ComplianceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComplianceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sensor.ComplianceIservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComplianceService");
    }
  }

  private static final class ComplianceServiceFileDescriptorSupplier
      extends ComplianceServiceBaseDescriptorSupplier {
    ComplianceServiceFileDescriptorSupplier() {}
  }

  private static final class ComplianceServiceMethodDescriptorSupplier
      extends ComplianceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComplianceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComplianceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComplianceServiceFileDescriptorSupplier())
              .addMethod(getCommunicateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
