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
    comments = "Source: api/v1/backup_service.proto")
public final class ExternalBackupServiceGrpc {

  private ExternalBackupServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ExternalBackupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getGetExternalBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExternalBackup",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getGetExternalBackupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getGetExternalBackupMethod;
    if ((getGetExternalBackupMethod = ExternalBackupServiceGrpc.getGetExternalBackupMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getGetExternalBackupMethod = ExternalBackupServiceGrpc.getGetExternalBackupMethod) == null) {
          ExternalBackupServiceGrpc.getGetExternalBackupMethod = getGetExternalBackupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "GetExternalBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("GetExternalBackup"))
                  .build();
          }
        }
     }
     return getGetExternalBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse> getGetExternalBackupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExternalBackups",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse> getGetExternalBackupsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse> getGetExternalBackupsMethod;
    if ((getGetExternalBackupsMethod = ExternalBackupServiceGrpc.getGetExternalBackupsMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getGetExternalBackupsMethod = ExternalBackupServiceGrpc.getGetExternalBackupsMethod) == null) {
          ExternalBackupServiceGrpc.getGetExternalBackupsMethod = getGetExternalBackupsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "GetExternalBackups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("GetExternalBackups"))
                  .build();
          }
        }
     }
     return getGetExternalBackupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
      io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getPostExternalBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostExternalBackup",
      requestType = io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.class,
      responseType = io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
      io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getPostExternalBackupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup, io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getPostExternalBackupMethod;
    if ((getPostExternalBackupMethod = ExternalBackupServiceGrpc.getPostExternalBackupMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getPostExternalBackupMethod = ExternalBackupServiceGrpc.getPostExternalBackupMethod) == null) {
          ExternalBackupServiceGrpc.getPostExternalBackupMethod = getPostExternalBackupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup, io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "PostExternalBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("PostExternalBackup"))
                  .build();
          }
        }
     }
     return getPostExternalBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
      io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getPutExternalBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutExternalBackup",
      requestType = io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.class,
      responseType = io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
      io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getPutExternalBackupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup, io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getPutExternalBackupMethod;
    if ((getPutExternalBackupMethod = ExternalBackupServiceGrpc.getPutExternalBackupMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getPutExternalBackupMethod = ExternalBackupServiceGrpc.getPutExternalBackupMethod) == null) {
          ExternalBackupServiceGrpc.getPutExternalBackupMethod = getPutExternalBackupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup, io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "PutExternalBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("PutExternalBackup"))
                  .build();
          }
        }
     }
     return getPutExternalBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestExternalBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestExternalBackup",
      requestType = io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestExternalBackupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTestExternalBackupMethod;
    if ((getTestExternalBackupMethod = ExternalBackupServiceGrpc.getTestExternalBackupMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getTestExternalBackupMethod = ExternalBackupServiceGrpc.getTestExternalBackupMethod) == null) {
          ExternalBackupServiceGrpc.getTestExternalBackupMethod = getTestExternalBackupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "TestExternalBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("TestExternalBackup"))
                  .build();
          }
        }
     }
     return getTestExternalBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteExternalBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExternalBackup",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteExternalBackupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteExternalBackupMethod;
    if ((getDeleteExternalBackupMethod = ExternalBackupServiceGrpc.getDeleteExternalBackupMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getDeleteExternalBackupMethod = ExternalBackupServiceGrpc.getDeleteExternalBackupMethod) == null) {
          ExternalBackupServiceGrpc.getDeleteExternalBackupMethod = getDeleteExternalBackupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "DeleteExternalBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("DeleteExternalBackup"))
                  .build();
          }
        }
     }
     return getDeleteExternalBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTriggerExternalBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerExternalBackup",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTriggerExternalBackupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getTriggerExternalBackupMethod;
    if ((getTriggerExternalBackupMethod = ExternalBackupServiceGrpc.getTriggerExternalBackupMethod) == null) {
      synchronized (ExternalBackupServiceGrpc.class) {
        if ((getTriggerExternalBackupMethod = ExternalBackupServiceGrpc.getTriggerExternalBackupMethod) == null) {
          ExternalBackupServiceGrpc.getTriggerExternalBackupMethod = getTriggerExternalBackupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ExternalBackupService", "TriggerExternalBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ExternalBackupServiceMethodDescriptorSupplier("TriggerExternalBackup"))
                  .build();
          }
        }
     }
     return getTriggerExternalBackupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExternalBackupServiceStub newStub(io.grpc.Channel channel) {
    return new ExternalBackupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExternalBackupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExternalBackupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExternalBackupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExternalBackupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ExternalBackupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExternalBackupMethod(), responseObserver);
    }

    /**
     */
    public void getExternalBackups(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExternalBackupsMethod(), responseObserver);
    }

    /**
     */
    public void postExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> responseObserver) {
      asyncUnimplementedUnaryCall(getPostExternalBackupMethod(), responseObserver);
    }

    /**
     */
    public void putExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> responseObserver) {
      asyncUnimplementedUnaryCall(getPutExternalBackupMethod(), responseObserver);
    }

    /**
     */
    public void testExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTestExternalBackupMethod(), responseObserver);
    }

    /**
     */
    public void deleteExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteExternalBackupMethod(), responseObserver);
    }

    /**
     */
    public void triggerExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerExternalBackupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExternalBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>(
                  this, METHODID_GET_EXTERNAL_BACKUP)))
          .addMethod(
            getGetExternalBackupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse>(
                  this, METHODID_GET_EXTERNAL_BACKUPS)))
          .addMethod(
            getPostExternalBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
                io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>(
                  this, METHODID_POST_EXTERNAL_BACKUP)))
          .addMethod(
            getPutExternalBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
                io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>(
                  this, METHODID_PUT_EXTERNAL_BACKUP)))
          .addMethod(
            getTestExternalBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_TEST_EXTERNAL_BACKUP)))
          .addMethod(
            getDeleteExternalBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_EXTERNAL_BACKUP)))
          .addMethod(
            getTriggerExternalBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_TRIGGER_EXTERNAL_BACKUP)))
          .build();
    }
  }

  /**
   */
  public static final class ExternalBackupServiceStub extends io.grpc.stub.AbstractStub<ExternalBackupServiceStub> {
    private ExternalBackupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExternalBackupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalBackupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExternalBackupServiceStub(channel, callOptions);
    }

    /**
     */
    public void getExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExternalBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExternalBackups(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExternalBackupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostExternalBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutExternalBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestExternalBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteExternalBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerExternalBackupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExternalBackupServiceBlockingStub extends io.grpc.stub.AbstractStub<ExternalBackupServiceBlockingStub> {
    private ExternalBackupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExternalBackupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalBackupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExternalBackupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup getExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetExternalBackupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse getExternalBackups(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetExternalBackupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup postExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request) {
      return blockingUnaryCall(
          getChannel(), getPostExternalBackupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup putExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request) {
      return blockingUnaryCall(
          getChannel(), getPutExternalBackupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty testExternalBackup(io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request) {
      return blockingUnaryCall(
          getChannel(), getTestExternalBackupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteExternalBackupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty triggerExternalBackup(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getTriggerExternalBackupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExternalBackupServiceFutureStub extends io.grpc.stub.AbstractStub<ExternalBackupServiceFutureStub> {
    private ExternalBackupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExternalBackupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalBackupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExternalBackupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> getExternalBackup(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExternalBackupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse> getExternalBackups(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExternalBackupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> postExternalBackup(
        io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request) {
      return futureUnaryCall(
          getChannel().newCall(getPostExternalBackupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup> putExternalBackup(
        io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request) {
      return futureUnaryCall(
          getChannel().newCall(getPutExternalBackupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> testExternalBackup(
        io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup request) {
      return futureUnaryCall(
          getChannel().newCall(getTestExternalBackupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteExternalBackup(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteExternalBackupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> triggerExternalBackup(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerExternalBackupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXTERNAL_BACKUP = 0;
  private static final int METHODID_GET_EXTERNAL_BACKUPS = 1;
  private static final int METHODID_POST_EXTERNAL_BACKUP = 2;
  private static final int METHODID_PUT_EXTERNAL_BACKUP = 3;
  private static final int METHODID_TEST_EXTERNAL_BACKUP = 4;
  private static final int METHODID_DELETE_EXTERNAL_BACKUP = 5;
  private static final int METHODID_TRIGGER_EXTERNAL_BACKUP = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExternalBackupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExternalBackupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXTERNAL_BACKUP:
          serviceImpl.getExternalBackup((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>) responseObserver);
          break;
        case METHODID_GET_EXTERNAL_BACKUPS:
          serviceImpl.getExternalBackups((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.BackupService.GetExternalBackupsResponse>) responseObserver);
          break;
        case METHODID_POST_EXTERNAL_BACKUP:
          serviceImpl.postExternalBackup((io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>) responseObserver);
          break;
        case METHODID_PUT_EXTERNAL_BACKUP:
          serviceImpl.putExternalBackup((io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup>) responseObserver);
          break;
        case METHODID_TEST_EXTERNAL_BACKUP:
          serviceImpl.testExternalBackup((io.stackrox.proto.storage.ExternalBackupOuterClass.ExternalBackup) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_EXTERNAL_BACKUP:
          serviceImpl.deleteExternalBackup((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_TRIGGER_EXTERNAL_BACKUP:
          serviceImpl.triggerExternalBackup((io.stackrox.proto.api.v1.Common.ResourceByID) request,
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

  private static abstract class ExternalBackupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExternalBackupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.BackupService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExternalBackupService");
    }
  }

  private static final class ExternalBackupServiceFileDescriptorSupplier
      extends ExternalBackupServiceBaseDescriptorSupplier {
    ExternalBackupServiceFileDescriptorSupplier() {}
  }

  private static final class ExternalBackupServiceMethodDescriptorSupplier
      extends ExternalBackupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExternalBackupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExternalBackupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExternalBackupServiceFileDescriptorSupplier())
              .addMethod(getGetExternalBackupMethod())
              .addMethod(getGetExternalBackupsMethod())
              .addMethod(getPostExternalBackupMethod())
              .addMethod(getPutExternalBackupMethod())
              .addMethod(getTestExternalBackupMethod())
              .addMethod(getDeleteExternalBackupMethod())
              .addMethod(getTriggerExternalBackupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
