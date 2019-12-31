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
 * A Sensor service that allows Collector to send NetworkConnectionInfo messages
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: internalapi/sensor/network_connection_iservice.proto")
public final class NetworkConnectionInfoServiceGrpc {

  private NetworkConnectionInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "sensor.NetworkConnectionInfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPushNetworkConnectionInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushNetworkConnectionInfo",
      requestType = sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPushNetworkConnectionInfoMethod() {
    io.grpc.MethodDescriptor<sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPushNetworkConnectionInfoMethod;
    if ((getPushNetworkConnectionInfoMethod = NetworkConnectionInfoServiceGrpc.getPushNetworkConnectionInfoMethod) == null) {
      synchronized (NetworkConnectionInfoServiceGrpc.class) {
        if ((getPushNetworkConnectionInfoMethod = NetworkConnectionInfoServiceGrpc.getPushNetworkConnectionInfoMethod) == null) {
          NetworkConnectionInfoServiceGrpc.getPushNetworkConnectionInfoMethod = getPushNetworkConnectionInfoMethod = 
              io.grpc.MethodDescriptor.<sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensor.NetworkConnectionInfoService", "PushNetworkConnectionInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkConnectionInfoServiceMethodDescriptorSupplier("PushNetworkConnectionInfo"))
                  .build();
          }
        }
     }
     return getPushNetworkConnectionInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkConnectionInfoServiceStub newStub(io.grpc.Channel channel) {
    return new NetworkConnectionInfoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkConnectionInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkConnectionInfoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkConnectionInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkConnectionInfoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to send NetworkConnectionInfo messages
   * </pre>
   */
  public static abstract class NetworkConnectionInfoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Note: the response is a stream due to a bug in the C++ GRPC client library. The server is not expected to
     * send anything via this stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage> pushNetworkConnectionInfo(
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getPushNetworkConnectionInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushNetworkConnectionInfoMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_PUSH_NETWORK_CONNECTION_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to send NetworkConnectionInfo messages
   * </pre>
   */
  public static final class NetworkConnectionInfoServiceStub extends io.grpc.stub.AbstractStub<NetworkConnectionInfoServiceStub> {
    private NetworkConnectionInfoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkConnectionInfoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkConnectionInfoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkConnectionInfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Note: the response is a stream due to a bug in the C++ GRPC client library. The server is not expected to
     * send anything via this stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sensor.NetworkConnectionIservice.NetworkConnectionInfoMessage> pushNetworkConnectionInfo(
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPushNetworkConnectionInfoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to send NetworkConnectionInfo messages
   * </pre>
   */
  public static final class NetworkConnectionInfoServiceBlockingStub extends io.grpc.stub.AbstractStub<NetworkConnectionInfoServiceBlockingStub> {
    private NetworkConnectionInfoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkConnectionInfoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkConnectionInfoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkConnectionInfoServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * A Sensor service that allows Collector to send NetworkConnectionInfo messages
   * </pre>
   */
  public static final class NetworkConnectionInfoServiceFutureStub extends io.grpc.stub.AbstractStub<NetworkConnectionInfoServiceFutureStub> {
    private NetworkConnectionInfoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkConnectionInfoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkConnectionInfoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkConnectionInfoServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PUSH_NETWORK_CONNECTION_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkConnectionInfoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkConnectionInfoServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_PUSH_NETWORK_CONNECTION_INFO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pushNetworkConnectionInfo(
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NetworkConnectionInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkConnectionInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sensor.NetworkConnectionIservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkConnectionInfoService");
    }
  }

  private static final class NetworkConnectionInfoServiceFileDescriptorSupplier
      extends NetworkConnectionInfoServiceBaseDescriptorSupplier {
    NetworkConnectionInfoServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkConnectionInfoServiceMethodDescriptorSupplier
      extends NetworkConnectionInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkConnectionInfoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkConnectionInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkConnectionInfoServiceFileDescriptorSupplier())
              .addMethod(getPushNetworkConnectionInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
