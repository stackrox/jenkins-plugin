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
    comments = "Source: api/v1/network_graph.proto")
public final class NetworkGraphServiceGrpc {

  private NetworkGraphServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.NetworkGraphService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest,
      io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getGetNetworkGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkGraph",
      requestType = io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest,
      io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getGetNetworkGraphMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest, io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getGetNetworkGraphMethod;
    if ((getGetNetworkGraphMethod = NetworkGraphServiceGrpc.getGetNetworkGraphMethod) == null) {
      synchronized (NetworkGraphServiceGrpc.class) {
        if ((getGetNetworkGraphMethod = NetworkGraphServiceGrpc.getGetNetworkGraphMethod) == null) {
          NetworkGraphServiceGrpc.getGetNetworkGraphMethod = getGetNetworkGraphMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest, io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkGraphService", "GetNetworkGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkGraphServiceMethodDescriptorSupplier("GetNetworkGraph"))
                  .build();
          }
        }
     }
     return getGetNetworkGraphMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkGraphServiceStub newStub(io.grpc.Channel channel) {
    return new NetworkGraphServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkGraphServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkGraphServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkGraphServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkGraphServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NetworkGraphServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNetworkGraph(io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkGraphMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNetworkGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest,
                io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph>(
                  this, METHODID_GET_NETWORK_GRAPH)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkGraphServiceStub extends io.grpc.stub.AbstractStub<NetworkGraphServiceStub> {
    private NetworkGraphServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkGraphServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkGraphServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkGraphServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNetworkGraph(io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkGraphMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkGraphServiceBlockingStub extends io.grpc.stub.AbstractStub<NetworkGraphServiceBlockingStub> {
    private NetworkGraphServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkGraphServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkGraphServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkGraphServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph getNetworkGraph(io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkGraphMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkGraphServiceFutureStub extends io.grpc.stub.AbstractStub<NetworkGraphServiceFutureStub> {
    private NetworkGraphServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkGraphServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkGraphServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkGraphServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getNetworkGraph(
        io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkGraphMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NETWORK_GRAPH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkGraphServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkGraphServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NETWORK_GRAPH:
          serviceImpl.getNetworkGraph((io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraphRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph>) responseObserver);
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

  private static abstract class NetworkGraphServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkGraphServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.NetworkGraphOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkGraphService");
    }
  }

  private static final class NetworkGraphServiceFileDescriptorSupplier
      extends NetworkGraphServiceBaseDescriptorSupplier {
    NetworkGraphServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkGraphServiceMethodDescriptorSupplier
      extends NetworkGraphServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkGraphServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkGraphServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkGraphServiceFileDescriptorSupplier())
              .addMethod(getGetNetworkGraphMethod())
              .build();
        }
      }
    }
    return result;
  }
}
