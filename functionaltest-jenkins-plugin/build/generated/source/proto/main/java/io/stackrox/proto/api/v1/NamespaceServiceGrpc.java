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
    comments = "Source: api/v1/namespace_service.proto")
public final class NamespaceServiceGrpc {

  private NamespaceServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.NamespaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse> getGetNamespacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNamespaces",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse> getGetNamespacesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse> getGetNamespacesMethod;
    if ((getGetNamespacesMethod = NamespaceServiceGrpc.getGetNamespacesMethod) == null) {
      synchronized (NamespaceServiceGrpc.class) {
        if ((getGetNamespacesMethod = NamespaceServiceGrpc.getGetNamespacesMethod) == null) {
          NamespaceServiceGrpc.getGetNamespacesMethod = getGetNamespacesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NamespaceService", "GetNamespaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NamespaceServiceMethodDescriptorSupplier("GetNamespaces"))
                  .build();
          }
        }
     }
     return getGetNamespacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace> getGetNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNamespace",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace> getGetNamespaceMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace> getGetNamespaceMethod;
    if ((getGetNamespaceMethod = NamespaceServiceGrpc.getGetNamespaceMethod) == null) {
      synchronized (NamespaceServiceGrpc.class) {
        if ((getGetNamespaceMethod = NamespaceServiceGrpc.getGetNamespaceMethod) == null) {
          NamespaceServiceGrpc.getGetNamespaceMethod = getGetNamespaceMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NamespaceService", "GetNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace.getDefaultInstance()))
                  .setSchemaDescriptor(new NamespaceServiceMethodDescriptorSupplier("GetNamespace"))
                  .build();
          }
        }
     }
     return getGetNamespaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NamespaceServiceStub newStub(io.grpc.Channel channel) {
    return new NamespaceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NamespaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NamespaceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NamespaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NamespaceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NamespaceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNamespaces(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNamespacesMethod(), responseObserver);
    }

    /**
     */
    public void getNamespace(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNamespaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNamespacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse>(
                  this, METHODID_GET_NAMESPACES)))
          .addMethod(
            getGetNamespaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace>(
                  this, METHODID_GET_NAMESPACE)))
          .build();
    }
  }

  /**
   */
  public static final class NamespaceServiceStub extends io.grpc.stub.AbstractStub<NamespaceServiceStub> {
    private NamespaceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NamespaceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NamespaceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNamespaces(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNamespacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNamespace(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNamespaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NamespaceServiceBlockingStub extends io.grpc.stub.AbstractStub<NamespaceServiceBlockingStub> {
    private NamespaceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NamespaceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NamespaceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse getNamespaces(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetNamespacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace getNamespace(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetNamespaceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NamespaceServiceFutureStub extends io.grpc.stub.AbstractStub<NamespaceServiceFutureStub> {
    private NamespaceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NamespaceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NamespaceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse> getNamespaces(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNamespacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace> getNamespace(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNamespaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAMESPACES = 0;
  private static final int METHODID_GET_NAMESPACE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NamespaceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NamespaceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NAMESPACES:
          serviceImpl.getNamespaces((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.GetNamespacesResponse>) responseObserver);
          break;
        case METHODID_GET_NAMESPACE:
          serviceImpl.getNamespace((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NamespaceServiceOuterClass.Namespace>) responseObserver);
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

  private static abstract class NamespaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NamespaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.NamespaceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NamespaceService");
    }
  }

  private static final class NamespaceServiceFileDescriptorSupplier
      extends NamespaceServiceBaseDescriptorSupplier {
    NamespaceServiceFileDescriptorSupplier() {}
  }

  private static final class NamespaceServiceMethodDescriptorSupplier
      extends NamespaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NamespaceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NamespaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NamespaceServiceFileDescriptorSupplier())
              .addMethod(getGetNamespacesMethod())
              .addMethod(getGetNamespaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
