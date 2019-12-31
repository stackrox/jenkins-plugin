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
 * ProcessWhitelistService APIs can be used to manage process whitelists.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/process_whitelist_service.proto")
public final class ProcessWhitelistServiceGrpc {

  private ProcessWhitelistServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ProcessWhitelistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest,
      io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist> getGetProcessWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProcessWhitelist",
      requestType = io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest.class,
      responseType = io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest,
      io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist> getGetProcessWhitelistMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest, io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist> getGetProcessWhitelistMethod;
    if ((getGetProcessWhitelistMethod = ProcessWhitelistServiceGrpc.getGetProcessWhitelistMethod) == null) {
      synchronized (ProcessWhitelistServiceGrpc.class) {
        if ((getGetProcessWhitelistMethod = ProcessWhitelistServiceGrpc.getGetProcessWhitelistMethod) == null) {
          ProcessWhitelistServiceGrpc.getGetProcessWhitelistMethod = getGetProcessWhitelistMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest, io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProcessWhitelistService", "GetProcessWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessWhitelistServiceMethodDescriptorSupplier("GetProcessWhitelist"))
                  .build();
          }
        }
     }
     return getGetProcessWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest,
      io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> getUpdateProcessWhitelistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProcessWhitelists",
      requestType = io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest.class,
      responseType = io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest,
      io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> getUpdateProcessWhitelistsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest, io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> getUpdateProcessWhitelistsMethod;
    if ((getUpdateProcessWhitelistsMethod = ProcessWhitelistServiceGrpc.getUpdateProcessWhitelistsMethod) == null) {
      synchronized (ProcessWhitelistServiceGrpc.class) {
        if ((getUpdateProcessWhitelistsMethod = ProcessWhitelistServiceGrpc.getUpdateProcessWhitelistsMethod) == null) {
          ProcessWhitelistServiceGrpc.getUpdateProcessWhitelistsMethod = getUpdateProcessWhitelistsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest, io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProcessWhitelistService", "UpdateProcessWhitelists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessWhitelistServiceMethodDescriptorSupplier("UpdateProcessWhitelists"))
                  .build();
          }
        }
     }
     return getUpdateProcessWhitelistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest,
      io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> getLockProcessWhitelistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockProcessWhitelists",
      requestType = io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest.class,
      responseType = io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest,
      io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> getLockProcessWhitelistsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest, io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> getLockProcessWhitelistsMethod;
    if ((getLockProcessWhitelistsMethod = ProcessWhitelistServiceGrpc.getLockProcessWhitelistsMethod) == null) {
      synchronized (ProcessWhitelistServiceGrpc.class) {
        if ((getLockProcessWhitelistsMethod = ProcessWhitelistServiceGrpc.getLockProcessWhitelistsMethod) == null) {
          ProcessWhitelistServiceGrpc.getLockProcessWhitelistsMethod = getLockProcessWhitelistsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest, io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProcessWhitelistService", "LockProcessWhitelists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessWhitelistServiceMethodDescriptorSupplier("LockProcessWhitelists"))
                  .build();
          }
        }
     }
     return getLockProcessWhitelistsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProcessWhitelistServiceStub newStub(io.grpc.Channel channel) {
    return new ProcessWhitelistServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProcessWhitelistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProcessWhitelistServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProcessWhitelistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProcessWhitelistServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ProcessWhitelistService APIs can be used to manage process whitelists.
   * </pre>
   */
  public static abstract class ProcessWhitelistServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetProcessWhitelistById returns the single process whitelist referenced by the given ID.
     * </pre>
     */
    public void getProcessWhitelist(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProcessWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToProcessWhitelists adds a list of process names to each of a list of process whitelists
     * </pre>
     */
    public void updateProcessWhitelists(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProcessWhitelistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LockProcessWhitelists accepts a list of whitelist IDs, locks those whitelists, and returns the updated whitelist objects
     * </pre>
     */
    public void lockProcessWhitelists(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLockProcessWhitelistsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProcessWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest,
                io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist>(
                  this, METHODID_GET_PROCESS_WHITELIST)))
          .addMethod(
            getUpdateProcessWhitelistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest,
                io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse>(
                  this, METHODID_UPDATE_PROCESS_WHITELISTS)))
          .addMethod(
            getLockProcessWhitelistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest,
                io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse>(
                  this, METHODID_LOCK_PROCESS_WHITELISTS)))
          .build();
    }
  }

  /**
   * <pre>
   * ProcessWhitelistService APIs can be used to manage process whitelists.
   * </pre>
   */
  public static final class ProcessWhitelistServiceStub extends io.grpc.stub.AbstractStub<ProcessWhitelistServiceStub> {
    private ProcessWhitelistServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessWhitelistServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessWhitelistServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessWhitelistServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetProcessWhitelistById returns the single process whitelist referenced by the given ID.
     * </pre>
     */
    public void getProcessWhitelist(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProcessWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToProcessWhitelists adds a list of process names to each of a list of process whitelists
     * </pre>
     */
    public void updateProcessWhitelists(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProcessWhitelistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LockProcessWhitelists accepts a list of whitelist IDs, locks those whitelists, and returns the updated whitelist objects
     * </pre>
     */
    public void lockProcessWhitelists(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockProcessWhitelistsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ProcessWhitelistService APIs can be used to manage process whitelists.
   * </pre>
   */
  public static final class ProcessWhitelistServiceBlockingStub extends io.grpc.stub.AbstractStub<ProcessWhitelistServiceBlockingStub> {
    private ProcessWhitelistServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessWhitelistServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessWhitelistServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessWhitelistServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetProcessWhitelistById returns the single process whitelist referenced by the given ID.
     * </pre>
     */
    public io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist getProcessWhitelist(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProcessWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToProcessWhitelists adds a list of process names to each of a list of process whitelists
     * </pre>
     */
    public io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse updateProcessWhitelists(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProcessWhitelistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockProcessWhitelists accepts a list of whitelist IDs, locks those whitelists, and returns the updated whitelist objects
     * </pre>
     */
    public io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse lockProcessWhitelists(io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest request) {
      return blockingUnaryCall(
          getChannel(), getLockProcessWhitelistsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ProcessWhitelistService APIs can be used to manage process whitelists.
   * </pre>
   */
  public static final class ProcessWhitelistServiceFutureStub extends io.grpc.stub.AbstractStub<ProcessWhitelistServiceFutureStub> {
    private ProcessWhitelistServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessWhitelistServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessWhitelistServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessWhitelistServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetProcessWhitelistById returns the single process whitelist referenced by the given ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist> getProcessWhitelist(
        io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProcessWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToProcessWhitelists adds a list of process names to each of a list of process whitelists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> updateProcessWhitelists(
        io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProcessWhitelistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockProcessWhitelists accepts a list of whitelist IDs, locks those whitelists, and returns the updated whitelist objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse> lockProcessWhitelists(
        io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLockProcessWhitelistsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROCESS_WHITELIST = 0;
  private static final int METHODID_UPDATE_PROCESS_WHITELISTS = 1;
  private static final int METHODID_LOCK_PROCESS_WHITELISTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProcessWhitelistServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProcessWhitelistServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROCESS_WHITELIST:
          serviceImpl.getProcessWhitelist((io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.GetProcessWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ProcessWhitelistOuterClass.ProcessWhitelist>) responseObserver);
          break;
        case METHODID_UPDATE_PROCESS_WHITELISTS:
          serviceImpl.updateProcessWhitelists((io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse>) responseObserver);
          break;
        case METHODID_LOCK_PROCESS_WHITELISTS:
          serviceImpl.lockProcessWhitelists((io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.LockProcessWhitelistsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.UpdateProcessWhitelistsResponse>) responseObserver);
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

  private static abstract class ProcessWhitelistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProcessWhitelistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ProcessWhitelistServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProcessWhitelistService");
    }
  }

  private static final class ProcessWhitelistServiceFileDescriptorSupplier
      extends ProcessWhitelistServiceBaseDescriptorSupplier {
    ProcessWhitelistServiceFileDescriptorSupplier() {}
  }

  private static final class ProcessWhitelistServiceMethodDescriptorSupplier
      extends ProcessWhitelistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProcessWhitelistServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProcessWhitelistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProcessWhitelistServiceFileDescriptorSupplier())
              .addMethod(getGetProcessWhitelistMethod())
              .addMethod(getUpdateProcessWhitelistsMethod())
              .addMethod(getLockProcessWhitelistsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
