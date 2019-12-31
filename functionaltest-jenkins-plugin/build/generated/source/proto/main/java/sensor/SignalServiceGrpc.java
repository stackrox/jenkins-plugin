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
 * A Sensor service that allows Collector to push Signal messages
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: internalapi/sensor/signal_iservice.proto")
public final class SignalServiceGrpc {

  private SignalServiceGrpc() {}

  public static final String SERVICE_NAME = "sensor.SignalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sensor.SignalIservice.SignalStreamMessage,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPushSignalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushSignals",
      requestType = sensor.SignalIservice.SignalStreamMessage.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<sensor.SignalIservice.SignalStreamMessage,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPushSignalsMethod() {
    io.grpc.MethodDescriptor<sensor.SignalIservice.SignalStreamMessage, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPushSignalsMethod;
    if ((getPushSignalsMethod = SignalServiceGrpc.getPushSignalsMethod) == null) {
      synchronized (SignalServiceGrpc.class) {
        if ((getPushSignalsMethod = SignalServiceGrpc.getPushSignalsMethod) == null) {
          SignalServiceGrpc.getPushSignalsMethod = getPushSignalsMethod = 
              io.grpc.MethodDescriptor.<sensor.SignalIservice.SignalStreamMessage, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensor.SignalService", "PushSignals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.SignalIservice.SignalStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SignalServiceMethodDescriptorSupplier("PushSignals"))
                  .build();
          }
        }
     }
     return getPushSignalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignalServiceStub newStub(io.grpc.Channel channel) {
    return new SignalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SignalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SignalServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to push Signal messages
   * </pre>
   */
  public static abstract class SignalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Note: the response is a stream due to a bug in the C++ GRPC client library. The server is not expected to
     * send anything via this stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sensor.SignalIservice.SignalStreamMessage> pushSignals(
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getPushSignalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushSignalsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                sensor.SignalIservice.SignalStreamMessage,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_PUSH_SIGNALS)))
          .build();
    }
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to push Signal messages
   * </pre>
   */
  public static final class SignalServiceStub extends io.grpc.stub.AbstractStub<SignalServiceStub> {
    private SignalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Note: the response is a stream due to a bug in the C++ GRPC client library. The server is not expected to
     * send anything via this stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sensor.SignalIservice.SignalStreamMessage> pushSignals(
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPushSignalsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to push Signal messages
   * </pre>
   */
  public static final class SignalServiceBlockingStub extends io.grpc.stub.AbstractStub<SignalServiceBlockingStub> {
    private SignalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignalServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to push Signal messages
   * </pre>
   */
  public static final class SignalServiceFutureStub extends io.grpc.stub.AbstractStub<SignalServiceFutureStub> {
    private SignalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignalServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PUSH_SIGNALS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SignalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SignalServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_PUSH_SIGNALS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pushSignals(
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SignalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SignalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sensor.SignalIservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SignalService");
    }
  }

  private static final class SignalServiceFileDescriptorSupplier
      extends SignalServiceBaseDescriptorSupplier {
    SignalServiceFileDescriptorSupplier() {}
  }

  private static final class SignalServiceMethodDescriptorSupplier
      extends SignalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SignalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SignalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SignalServiceFileDescriptorSupplier())
              .addMethod(getPushSignalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
