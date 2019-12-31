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
    comments = "Source: api/v1/cluster_service.proto")
public final class ClustersServiceGrpc {

  private ClustersServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ClustersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ClusterService.GetClustersRequest,
      io.stackrox.proto.api.v1.ClusterService.ClustersList> getGetClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusters",
      requestType = io.stackrox.proto.api.v1.ClusterService.GetClustersRequest.class,
      responseType = io.stackrox.proto.api.v1.ClusterService.ClustersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ClusterService.GetClustersRequest,
      io.stackrox.proto.api.v1.ClusterService.ClustersList> getGetClustersMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ClusterService.GetClustersRequest, io.stackrox.proto.api.v1.ClusterService.ClustersList> getGetClustersMethod;
    if ((getGetClustersMethod = ClustersServiceGrpc.getGetClustersMethod) == null) {
      synchronized (ClustersServiceGrpc.class) {
        if ((getGetClustersMethod = ClustersServiceGrpc.getGetClustersMethod) == null) {
          ClustersServiceGrpc.getGetClustersMethod = getGetClustersMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ClusterService.GetClustersRequest, io.stackrox.proto.api.v1.ClusterService.ClustersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ClustersService", "GetClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ClusterService.GetClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ClusterService.ClustersList.getDefaultInstance()))
                  .setSchemaDescriptor(new ClustersServiceMethodDescriptorSupplier("GetClusters"))
                  .build();
          }
        }
     }
     return getGetClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getGetClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCluster",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.ClusterService.ClusterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getGetClusterMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getGetClusterMethod;
    if ((getGetClusterMethod = ClustersServiceGrpc.getGetClusterMethod) == null) {
      synchronized (ClustersServiceGrpc.class) {
        if ((getGetClusterMethod = ClustersServiceGrpc.getGetClusterMethod) == null) {
          ClustersServiceGrpc.getGetClusterMethod = getGetClusterMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.ClusterService.ClusterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ClustersService", "GetCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ClusterService.ClusterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClustersServiceMethodDescriptorSupplier("GetCluster"))
                  .build();
          }
        }
     }
     return getGetClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ClusterOuterClass.Cluster,
      io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getPostClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCluster",
      requestType = io.stackrox.proto.storage.ClusterOuterClass.Cluster.class,
      responseType = io.stackrox.proto.api.v1.ClusterService.ClusterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ClusterOuterClass.Cluster,
      io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getPostClusterMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ClusterOuterClass.Cluster, io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getPostClusterMethod;
    if ((getPostClusterMethod = ClustersServiceGrpc.getPostClusterMethod) == null) {
      synchronized (ClustersServiceGrpc.class) {
        if ((getPostClusterMethod = ClustersServiceGrpc.getPostClusterMethod) == null) {
          ClustersServiceGrpc.getPostClusterMethod = getPostClusterMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ClusterOuterClass.Cluster, io.stackrox.proto.api.v1.ClusterService.ClusterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ClustersService", "PostCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ClusterOuterClass.Cluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ClusterService.ClusterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClustersServiceMethodDescriptorSupplier("PostCluster"))
                  .build();
          }
        }
     }
     return getPostClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ClusterOuterClass.Cluster,
      io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getPutClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutCluster",
      requestType = io.stackrox.proto.storage.ClusterOuterClass.Cluster.class,
      responseType = io.stackrox.proto.api.v1.ClusterService.ClusterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ClusterOuterClass.Cluster,
      io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getPutClusterMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ClusterOuterClass.Cluster, io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getPutClusterMethod;
    if ((getPutClusterMethod = ClustersServiceGrpc.getPutClusterMethod) == null) {
      synchronized (ClustersServiceGrpc.class) {
        if ((getPutClusterMethod = ClustersServiceGrpc.getPutClusterMethod) == null) {
          ClustersServiceGrpc.getPutClusterMethod = getPutClusterMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ClusterOuterClass.Cluster, io.stackrox.proto.api.v1.ClusterService.ClusterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ClustersService", "PutCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ClusterOuterClass.Cluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ClusterService.ClusterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClustersServiceMethodDescriptorSupplier("PutCluster"))
                  .build();
          }
        }
     }
     return getPutClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCluster",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteClusterMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteClusterMethod;
    if ((getDeleteClusterMethod = ClustersServiceGrpc.getDeleteClusterMethod) == null) {
      synchronized (ClustersServiceGrpc.class) {
        if ((getDeleteClusterMethod = ClustersServiceGrpc.getDeleteClusterMethod) == null) {
          ClustersServiceGrpc.getDeleteClusterMethod = getDeleteClusterMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ClustersService", "DeleteCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ClustersServiceMethodDescriptorSupplier("DeleteCluster"))
                  .build();
          }
        }
     }
     return getDeleteClusterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClustersServiceStub newStub(io.grpc.Channel channel) {
    return new ClustersServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClustersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClustersServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClustersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClustersServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClustersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getClusters(io.stackrox.proto.api.v1.ClusterService.GetClustersRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClustersList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClustersMethod(), responseObserver);
    }

    /**
     */
    public void getCluster(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClusterMethod(), responseObserver);
    }

    /**
     */
    public void postCluster(io.stackrox.proto.storage.ClusterOuterClass.Cluster request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostClusterMethod(), responseObserver);
    }

    /**
     */
    public void putCluster(io.stackrox.proto.storage.ClusterOuterClass.Cluster request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutClusterMethod(), responseObserver);
    }

    /**
     */
    public void deleteCluster(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClusterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetClustersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ClusterService.GetClustersRequest,
                io.stackrox.proto.api.v1.ClusterService.ClustersList>(
                  this, METHODID_GET_CLUSTERS)))
          .addMethod(
            getGetClusterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.ClusterService.ClusterResponse>(
                  this, METHODID_GET_CLUSTER)))
          .addMethod(
            getPostClusterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ClusterOuterClass.Cluster,
                io.stackrox.proto.api.v1.ClusterService.ClusterResponse>(
                  this, METHODID_POST_CLUSTER)))
          .addMethod(
            getPutClusterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ClusterOuterClass.Cluster,
                io.stackrox.proto.api.v1.ClusterService.ClusterResponse>(
                  this, METHODID_PUT_CLUSTER)))
          .addMethod(
            getDeleteClusterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_CLUSTER)))
          .build();
    }
  }

  /**
   */
  public static final class ClustersServiceStub extends io.grpc.stub.AbstractStub<ClustersServiceStub> {
    private ClustersServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClustersServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClustersServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClustersServiceStub(channel, callOptions);
    }

    /**
     */
    public void getClusters(io.stackrox.proto.api.v1.ClusterService.GetClustersRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClustersList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCluster(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postCluster(io.stackrox.proto.storage.ClusterOuterClass.Cluster request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putCluster(io.stackrox.proto.storage.ClusterOuterClass.Cluster request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCluster(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClusterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClustersServiceBlockingStub extends io.grpc.stub.AbstractStub<ClustersServiceBlockingStub> {
    private ClustersServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClustersServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClustersServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClustersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ClusterService.ClustersList getClusters(io.stackrox.proto.api.v1.ClusterService.GetClustersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ClusterService.ClusterResponse getCluster(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ClusterService.ClusterResponse postCluster(io.stackrox.proto.storage.ClusterOuterClass.Cluster request) {
      return blockingUnaryCall(
          getChannel(), getPostClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ClusterService.ClusterResponse putCluster(io.stackrox.proto.storage.ClusterOuterClass.Cluster request) {
      return blockingUnaryCall(
          getChannel(), getPutClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteCluster(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClusterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClustersServiceFutureStub extends io.grpc.stub.AbstractStub<ClustersServiceFutureStub> {
    private ClustersServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClustersServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClustersServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClustersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ClusterService.ClustersList> getClusters(
        io.stackrox.proto.api.v1.ClusterService.GetClustersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> getCluster(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> postCluster(
        io.stackrox.proto.storage.ClusterOuterClass.Cluster request) {
      return futureUnaryCall(
          getChannel().newCall(getPostClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ClusterService.ClusterResponse> putCluster(
        io.stackrox.proto.storage.ClusterOuterClass.Cluster request) {
      return futureUnaryCall(
          getChannel().newCall(getPutClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteCluster(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClusterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CLUSTERS = 0;
  private static final int METHODID_GET_CLUSTER = 1;
  private static final int METHODID_POST_CLUSTER = 2;
  private static final int METHODID_PUT_CLUSTER = 3;
  private static final int METHODID_DELETE_CLUSTER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClustersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClustersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CLUSTERS:
          serviceImpl.getClusters((io.stackrox.proto.api.v1.ClusterService.GetClustersRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClustersList>) responseObserver);
          break;
        case METHODID_GET_CLUSTER:
          serviceImpl.getCluster((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse>) responseObserver);
          break;
        case METHODID_POST_CLUSTER:
          serviceImpl.postCluster((io.stackrox.proto.storage.ClusterOuterClass.Cluster) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse>) responseObserver);
          break;
        case METHODID_PUT_CLUSTER:
          serviceImpl.putCluster((io.stackrox.proto.storage.ClusterOuterClass.Cluster) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ClusterService.ClusterResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLUSTER:
          serviceImpl.deleteCluster((io.stackrox.proto.api.v1.Common.ResourceByID) request,
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

  private static abstract class ClustersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClustersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ClusterService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClustersService");
    }
  }

  private static final class ClustersServiceFileDescriptorSupplier
      extends ClustersServiceBaseDescriptorSupplier {
    ClustersServiceFileDescriptorSupplier() {}
  }

  private static final class ClustersServiceMethodDescriptorSupplier
      extends ClustersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClustersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClustersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClustersServiceFileDescriptorSupplier())
              .addMethod(getGetClustersMethod())
              .addMethod(getGetClusterMethod())
              .addMethod(getPostClusterMethod())
              .addMethod(getPutClusterMethod())
              .addMethod(getDeleteClusterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
