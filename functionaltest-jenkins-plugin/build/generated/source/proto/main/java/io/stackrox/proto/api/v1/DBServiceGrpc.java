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
    comments = "Source: api/v1/db_service.proto")
public final class DBServiceGrpc {

  private DBServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.DBService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse> getGetExportCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExportCapabilities",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse> getGetExportCapabilitiesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse> getGetExportCapabilitiesMethod;
    if ((getGetExportCapabilitiesMethod = DBServiceGrpc.getGetExportCapabilitiesMethod) == null) {
      synchronized (DBServiceGrpc.class) {
        if ((getGetExportCapabilitiesMethod = DBServiceGrpc.getGetExportCapabilitiesMethod) == null) {
          DBServiceGrpc.getGetExportCapabilitiesMethod = getGetExportCapabilitiesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DBService", "GetExportCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DBServiceMethodDescriptorSupplier("GetExportCapabilities"))
                  .build();
          }
        }
     }
     return getGetExportCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse> getGetActiveRestoreProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveRestoreProcess",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse> getGetActiveRestoreProcessMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse> getGetActiveRestoreProcessMethod;
    if ((getGetActiveRestoreProcessMethod = DBServiceGrpc.getGetActiveRestoreProcessMethod) == null) {
      synchronized (DBServiceGrpc.class) {
        if ((getGetActiveRestoreProcessMethod = DBServiceGrpc.getGetActiveRestoreProcessMethod) == null) {
          DBServiceGrpc.getGetActiveRestoreProcessMethod = getGetActiveRestoreProcessMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DBService", "GetActiveRestoreProcess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DBServiceMethodDescriptorSupplier("GetActiveRestoreProcess"))
                  .build();
          }
        }
     }
     return getGetActiveRestoreProcessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest,
      io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse> getInterruptRestoreProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InterruptRestoreProcess",
      requestType = io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest.class,
      responseType = io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest,
      io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse> getInterruptRestoreProcessMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest, io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse> getInterruptRestoreProcessMethod;
    if ((getInterruptRestoreProcessMethod = DBServiceGrpc.getInterruptRestoreProcessMethod) == null) {
      synchronized (DBServiceGrpc.class) {
        if ((getInterruptRestoreProcessMethod = DBServiceGrpc.getInterruptRestoreProcessMethod) == null) {
          DBServiceGrpc.getInterruptRestoreProcessMethod = getInterruptRestoreProcessMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest, io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DBService", "InterruptRestoreProcess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DBServiceMethodDescriptorSupplier("InterruptRestoreProcess"))
                  .build();
          }
        }
     }
     return getInterruptRestoreProcessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCancelRestoreProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelRestoreProcess",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCancelRestoreProcessMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCancelRestoreProcessMethod;
    if ((getCancelRestoreProcessMethod = DBServiceGrpc.getCancelRestoreProcessMethod) == null) {
      synchronized (DBServiceGrpc.class) {
        if ((getCancelRestoreProcessMethod = DBServiceGrpc.getCancelRestoreProcessMethod) == null) {
          DBServiceGrpc.getCancelRestoreProcessMethod = getCancelRestoreProcessMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DBService", "CancelRestoreProcess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DBServiceMethodDescriptorSupplier("CancelRestoreProcess"))
                  .build();
          }
        }
     }
     return getCancelRestoreProcessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DBServiceStub newStub(io.grpc.Channel channel) {
    return new DBServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DBServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DBServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DBServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DBServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DBServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getExportCapabilities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExportCapabilitiesMethod(), responseObserver);
    }

    /**
     */
    public void getActiveRestoreProcess(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetActiveRestoreProcessMethod(), responseObserver);
    }

    /**
     */
    public void interruptRestoreProcess(io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInterruptRestoreProcessMethod(), responseObserver);
    }

    /**
     */
    public void cancelRestoreProcess(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelRestoreProcessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExportCapabilitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse>(
                  this, METHODID_GET_EXPORT_CAPABILITIES)))
          .addMethod(
            getGetActiveRestoreProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse>(
                  this, METHODID_GET_ACTIVE_RESTORE_PROCESS)))
          .addMethod(
            getInterruptRestoreProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest,
                io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse>(
                  this, METHODID_INTERRUPT_RESTORE_PROCESS)))
          .addMethod(
            getCancelRestoreProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_CANCEL_RESTORE_PROCESS)))
          .build();
    }
  }

  /**
   */
  public static final class DBServiceStub extends io.grpc.stub.AbstractStub<DBServiceStub> {
    private DBServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DBServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DBServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DBServiceStub(channel, callOptions);
    }

    /**
     */
    public void getExportCapabilities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExportCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getActiveRestoreProcess(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetActiveRestoreProcessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void interruptRestoreProcess(io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInterruptRestoreProcessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelRestoreProcess(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelRestoreProcessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DBServiceBlockingStub extends io.grpc.stub.AbstractStub<DBServiceBlockingStub> {
    private DBServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DBServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DBServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DBServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse getExportCapabilities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetExportCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse getActiveRestoreProcess(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetActiveRestoreProcessMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse interruptRestoreProcess(io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest request) {
      return blockingUnaryCall(
          getChannel(), getInterruptRestoreProcessMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty cancelRestoreProcess(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getCancelRestoreProcessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DBServiceFutureStub extends io.grpc.stub.AbstractStub<DBServiceFutureStub> {
    private DBServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DBServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DBServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DBServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse> getExportCapabilities(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExportCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse> getActiveRestoreProcess(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetActiveRestoreProcessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse> interruptRestoreProcess(
        io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInterruptRestoreProcessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> cancelRestoreProcess(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelRestoreProcessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXPORT_CAPABILITIES = 0;
  private static final int METHODID_GET_ACTIVE_RESTORE_PROCESS = 1;
  private static final int METHODID_INTERRUPT_RESTORE_PROCESS = 2;
  private static final int METHODID_CANCEL_RESTORE_PROCESS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DBServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DBServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXPORT_CAPABILITIES:
          serviceImpl.getExportCapabilities((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.GetDBExportCapabilitiesResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_RESTORE_PROCESS:
          serviceImpl.getActiveRestoreProcess((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.GetActiveDBRestoreProcessResponse>) responseObserver);
          break;
        case METHODID_INTERRUPT_RESTORE_PROCESS:
          serviceImpl.interruptRestoreProcess((io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DbService.InterruptDBRestoreProcessResponse>) responseObserver);
          break;
        case METHODID_CANCEL_RESTORE_PROCESS:
          serviceImpl.cancelRestoreProcess((io.stackrox.proto.api.v1.Common.ResourceByID) request,
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

  private static abstract class DBServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DBServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.DbService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DBService");
    }
  }

  private static final class DBServiceFileDescriptorSupplier
      extends DBServiceBaseDescriptorSupplier {
    DBServiceFileDescriptorSupplier() {}
  }

  private static final class DBServiceMethodDescriptorSupplier
      extends DBServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DBServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DBServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DBServiceFileDescriptorSupplier())
              .addMethod(getGetExportCapabilitiesMethod())
              .addMethod(getGetActiveRestoreProcessMethod())
              .addMethod(getInterruptRestoreProcessMethod())
              .addMethod(getCancelRestoreProcessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
