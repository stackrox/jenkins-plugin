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
 * storage.Node represents information about a node in the cluster.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/node_service.proto")
public final class NodeServiceGrpc {

  private NodeServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.NodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest,
      io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest.class,
      responseType = io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest,
      io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse> getListNodesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest, io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse> getListNodesMethod;
    if ((getListNodesMethod = NodeServiceGrpc.getListNodesMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getListNodesMethod = NodeServiceGrpc.getListNodesMethod) == null) {
          NodeServiceGrpc.getListNodesMethod = getListNodesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest, io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NodeService", "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("ListNodes"))
                  .build();
          }
        }
     }
     return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest,
      io.stackrox.proto.storage.NodeOuterClass.Node> getGetNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNode",
      requestType = io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest.class,
      responseType = io.stackrox.proto.storage.NodeOuterClass.Node.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest,
      io.stackrox.proto.storage.NodeOuterClass.Node> getGetNodeMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest, io.stackrox.proto.storage.NodeOuterClass.Node> getGetNodeMethod;
    if ((getGetNodeMethod = NodeServiceGrpc.getGetNodeMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getGetNodeMethod = NodeServiceGrpc.getGetNodeMethod) == null) {
          NodeServiceGrpc.getGetNodeMethod = getGetNodeMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest, io.stackrox.proto.storage.NodeOuterClass.Node>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NodeService", "GetNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NodeOuterClass.Node.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("GetNode"))
                  .build();
          }
        }
     }
     return getGetNodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeServiceStub newStub(io.grpc.Channel channel) {
    return new NodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NodeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * storage.Node represents information about a node in the cluster.
   * </pre>
   */
  public static abstract class NodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listNodes(io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    public void getNode(io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NodeOuterClass.Node> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest,
                io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse>(
                  this, METHODID_LIST_NODES)))
          .addMethod(
            getGetNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest,
                io.stackrox.proto.storage.NodeOuterClass.Node>(
                  this, METHODID_GET_NODE)))
          .build();
    }
  }

  /**
   * <pre>
   * storage.Node represents information about a node in the cluster.
   * </pre>
   */
  public static final class NodeServiceStub extends io.grpc.stub.AbstractStub<NodeServiceStub> {
    private NodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void listNodes(io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNode(io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NodeOuterClass.Node> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * storage.Node represents information about a node in the cluster.
   * </pre>
   */
  public static final class NodeServiceBlockingStub extends io.grpc.stub.AbstractStub<NodeServiceBlockingStub> {
    private NodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse listNodes(io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.NodeOuterClass.Node getNode(io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * storage.Node represents information about a node in the cluster.
   * </pre>
   */
  public static final class NodeServiceFutureStub extends io.grpc.stub.AbstractStub<NodeServiceFutureStub> {
    private NodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse> listNodes(
        io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.NodeOuterClass.Node> getNode(
        io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NODES = 0;
  private static final int METHODID_GET_NODE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NodeServiceOuterClass.ListNodesResponse>) responseObserver);
          break;
        case METHODID_GET_NODE:
          serviceImpl.getNode((io.stackrox.proto.api.v1.NodeServiceOuterClass.GetNodeRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NodeOuterClass.Node>) responseObserver);
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

  private static abstract class NodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.NodeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NodeService");
    }
  }

  private static final class NodeServiceFileDescriptorSupplier
      extends NodeServiceBaseDescriptorSupplier {
    NodeServiceFileDescriptorSupplier() {}
  }

  private static final class NodeServiceMethodDescriptorSupplier
      extends NodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeServiceFileDescriptorSupplier())
              .addMethod(getListNodesMethod())
              .addMethod(getGetNodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
