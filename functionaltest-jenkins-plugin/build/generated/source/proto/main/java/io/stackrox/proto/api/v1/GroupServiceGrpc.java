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
    comments = "Source: api/v1/group_service.proto")
public final class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.GroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse> getGetGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroups",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse> getGetGroupsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse> getGetGroupsMethod;
    if ((getGetGroupsMethod = GroupServiceGrpc.getGetGroupsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupsMethod = GroupServiceGrpc.getGetGroupsMethod) == null) {
          GroupServiceGrpc.getGetGroupsMethod = getGetGroupsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.GroupService", "GetGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("GetGroups"))
                  .build();
          }
        }
     }
     return getGetGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.GroupProperties,
      io.stackrox.proto.storage.GroupOuterClass.Group> getGetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroup",
      requestType = io.stackrox.proto.storage.GroupOuterClass.GroupProperties.class,
      responseType = io.stackrox.proto.storage.GroupOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.GroupProperties,
      io.stackrox.proto.storage.GroupOuterClass.Group> getGetGroupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.GroupProperties, io.stackrox.proto.storage.GroupOuterClass.Group> getGetGroupMethod;
    if ((getGetGroupMethod = GroupServiceGrpc.getGetGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupMethod = GroupServiceGrpc.getGetGroupMethod) == null) {
          GroupServiceGrpc.getGetGroupMethod = getGetGroupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.GroupOuterClass.GroupProperties, io.stackrox.proto.storage.GroupOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.GroupService", "GetGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.GroupOuterClass.GroupProperties.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.GroupOuterClass.Group.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("GetGroup"))
                  .build();
          }
        }
     }
     return getGetGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getBatchUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdate",
      requestType = io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getBatchUpdateMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getBatchUpdateMethod;
    if ((getBatchUpdateMethod = GroupServiceGrpc.getBatchUpdateMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getBatchUpdateMethod = GroupServiceGrpc.getBatchUpdateMethod) == null) {
          GroupServiceGrpc.getBatchUpdateMethod = getBatchUpdateMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.GroupService", "BatchUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("BatchUpdate"))
                  .build();
          }
        }
     }
     return getBatchUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.Group,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = io.stackrox.proto.storage.GroupOuterClass.Group.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.Group,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.Group, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCreateGroupMethod;
    if ((getCreateGroupMethod = GroupServiceGrpc.getCreateGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getCreateGroupMethod = GroupServiceGrpc.getCreateGroupMethod) == null) {
          GroupServiceGrpc.getCreateGroupMethod = getCreateGroupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.GroupOuterClass.Group, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.GroupService", "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.GroupOuterClass.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("CreateGroup"))
                  .build();
          }
        }
     }
     return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.Group,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroup",
      requestType = io.stackrox.proto.storage.GroupOuterClass.Group.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.Group,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateGroupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.Group, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateGroupMethod;
    if ((getUpdateGroupMethod = GroupServiceGrpc.getUpdateGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getUpdateGroupMethod = GroupServiceGrpc.getUpdateGroupMethod) == null) {
          GroupServiceGrpc.getUpdateGroupMethod = getUpdateGroupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.GroupOuterClass.Group, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.GroupService", "UpdateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.GroupOuterClass.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("UpdateGroup"))
                  .build();
          }
        }
     }
     return getUpdateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.GroupProperties,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroup",
      requestType = io.stackrox.proto.storage.GroupOuterClass.GroupProperties.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.GroupProperties,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteGroupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.GroupOuterClass.GroupProperties, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteGroupMethod;
    if ((getDeleteGroupMethod = GroupServiceGrpc.getDeleteGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getDeleteGroupMethod = GroupServiceGrpc.getDeleteGroupMethod) == null) {
          GroupServiceGrpc.getDeleteGroupMethod = getDeleteGroupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.GroupOuterClass.GroupProperties, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.GroupService", "DeleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.GroupOuterClass.GroupProperties.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("DeleteGroup"))
                  .build();
          }
        }
     }
     return getDeleteGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getGroups(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupsMethod(), responseObserver);
    }

    /**
     */
    public void getGroup(io.stackrox.proto.storage.GroupOuterClass.GroupProperties request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.GroupOuterClass.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupMethod(), responseObserver);
    }

    /**
     */
    public void batchUpdate(io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchUpdateMethod(), responseObserver);
    }

    /**
     */
    public void createGroup(io.stackrox.proto.storage.GroupOuterClass.Group request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     */
    public void updateGroup(io.stackrox.proto.storage.GroupOuterClass.Group request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     */
    public void deleteGroup(io.stackrox.proto.storage.GroupOuterClass.GroupProperties request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse>(
                  this, METHODID_GET_GROUPS)))
          .addMethod(
            getGetGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.GroupOuterClass.GroupProperties,
                io.stackrox.proto.storage.GroupOuterClass.Group>(
                  this, METHODID_GET_GROUP)))
          .addMethod(
            getBatchUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_BATCH_UPDATE)))
          .addMethod(
            getCreateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.GroupOuterClass.Group,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getUpdateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.GroupOuterClass.Group,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            getDeleteGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.GroupOuterClass.GroupProperties,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_GROUP)))
          .build();
    }
  }

  /**
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGroups(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroup(io.stackrox.proto.storage.GroupOuterClass.GroupProperties request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.GroupOuterClass.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchUpdate(io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGroup(io.stackrox.proto.storage.GroupOuterClass.Group request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGroup(io.stackrox.proto.storage.GroupOuterClass.Group request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGroup(io.stackrox.proto.storage.GroupOuterClass.GroupProperties request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse getGroups(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.GroupOuterClass.Group getGroup(io.stackrox.proto.storage.GroupOuterClass.GroupProperties request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty batchUpdate(io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty createGroup(io.stackrox.proto.storage.GroupOuterClass.Group request) {
      return blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty updateGroup(io.stackrox.proto.storage.GroupOuterClass.Group request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteGroup(io.stackrox.proto.storage.GroupOuterClass.GroupProperties request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse> getGroups(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.GroupOuterClass.Group> getGroup(
        io.stackrox.proto.storage.GroupOuterClass.GroupProperties request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> batchUpdate(
        io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> createGroup(
        io.stackrox.proto.storage.GroupOuterClass.Group request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> updateGroup(
        io.stackrox.proto.storage.GroupOuterClass.Group request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteGroup(
        io.stackrox.proto.storage.GroupOuterClass.GroupProperties request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GROUPS = 0;
  private static final int METHODID_GET_GROUP = 1;
  private static final int METHODID_BATCH_UPDATE = 2;
  private static final int METHODID_CREATE_GROUP = 3;
  private static final int METHODID_UPDATE_GROUP = 4;
  private static final int METHODID_DELETE_GROUP = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GROUPS:
          serviceImpl.getGroups((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.GroupServiceOuterClass.GetGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_GROUP:
          serviceImpl.getGroup((io.stackrox.proto.storage.GroupOuterClass.GroupProperties) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.GroupOuterClass.Group>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE:
          serviceImpl.batchUpdate((io.stackrox.proto.api.v1.GroupServiceOuterClass.GroupBatchUpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((io.stackrox.proto.storage.GroupOuterClass.Group) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((io.stackrox.proto.storage.GroupOuterClass.Group) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((io.stackrox.proto.storage.GroupOuterClass.GroupProperties) request,
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

  private static abstract class GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.GroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupService");
    }
  }

  private static final class GroupServiceFileDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier {
    GroupServiceFileDescriptorSupplier() {}
  }

  private static final class GroupServiceMethodDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceFileDescriptorSupplier())
              .addMethod(getGetGroupsMethod())
              .addMethod(getGetGroupMethod())
              .addMethod(getBatchUpdateMethod())
              .addMethod(getCreateGroupMethod())
              .addMethod(getUpdateGroupMethod())
              .addMethod(getDeleteGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
