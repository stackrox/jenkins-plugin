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
    comments = "Source: api/v1/role_service.proto")
public final class RoleServiceGrpc {

  private RoleServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.RoleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse> getGetRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoles",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse> getGetRolesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse> getGetRolesMethod;
    if ((getGetRolesMethod = RoleServiceGrpc.getGetRolesMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getGetRolesMethod = RoleServiceGrpc.getGetRolesMethod) == null) {
          RoleServiceGrpc.getGetRolesMethod = getGetRolesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "GetRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("GetRoles"))
                  .build();
          }
        }
     }
     return getGetRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.RoleOuterClass.Role> getGetRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRole",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.RoleOuterClass.Role.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.RoleOuterClass.Role> getGetRoleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.RoleOuterClass.Role> getGetRoleMethod;
    if ((getGetRoleMethod = RoleServiceGrpc.getGetRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getGetRoleMethod = RoleServiceGrpc.getGetRoleMethod) == null) {
          RoleServiceGrpc.getGetRoleMethod = getGetRoleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.RoleOuterClass.Role>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "GetRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.RoleOuterClass.Role.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("GetRole"))
                  .build();
          }
        }
     }
     return getGetRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.RoleOuterClass.Role> getGetMyPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyPermissions",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.storage.RoleOuterClass.Role.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.storage.RoleOuterClass.Role> getGetMyPermissionsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.RoleOuterClass.Role> getGetMyPermissionsMethod;
    if ((getGetMyPermissionsMethod = RoleServiceGrpc.getGetMyPermissionsMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getGetMyPermissionsMethod = RoleServiceGrpc.getGetMyPermissionsMethod) == null) {
          RoleServiceGrpc.getGetMyPermissionsMethod = getGetMyPermissionsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.storage.RoleOuterClass.Role>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "GetMyPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.RoleOuterClass.Role.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("GetMyPermissions"))
                  .build();
          }
        }
     }
     return getGetMyPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.RoleOuterClass.Role,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCreateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRole",
      requestType = io.stackrox.proto.storage.RoleOuterClass.Role.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.RoleOuterClass.Role,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCreateRoleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.RoleOuterClass.Role, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getCreateRoleMethod;
    if ((getCreateRoleMethod = RoleServiceGrpc.getCreateRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getCreateRoleMethod = RoleServiceGrpc.getCreateRoleMethod) == null) {
          RoleServiceGrpc.getCreateRoleMethod = getCreateRoleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.RoleOuterClass.Role, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "CreateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.RoleOuterClass.Role.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("CreateRole"))
                  .build();
          }
        }
     }
     return getCreateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.RoleOuterClass.Role,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRole",
      requestType = io.stackrox.proto.storage.RoleOuterClass.Role.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.RoleOuterClass.Role,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateRoleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.RoleOuterClass.Role, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getUpdateRoleMethod;
    if ((getUpdateRoleMethod = RoleServiceGrpc.getUpdateRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getUpdateRoleMethod = RoleServiceGrpc.getUpdateRoleMethod) == null) {
          RoleServiceGrpc.getUpdateRoleMethod = getUpdateRoleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.RoleOuterClass.Role, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "UpdateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.RoleOuterClass.Role.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("UpdateRole"))
                  .build();
          }
        }
     }
     return getUpdateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRole",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = RoleServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getDeleteRoleMethod = RoleServiceGrpc.getDeleteRoleMethod) == null) {
          RoleServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("DeleteRole"))
                  .build();
          }
        }
     }
     return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse> getGetResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResources",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse> getGetResourcesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse> getGetResourcesMethod;
    if ((getGetResourcesMethod = RoleServiceGrpc.getGetResourcesMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getGetResourcesMethod = RoleServiceGrpc.getGetResourcesMethod) == null) {
          RoleServiceGrpc.getGetResourcesMethod = getGetResourcesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RoleService", "GetResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("GetResources"))
                  .build();
          }
        }
     }
     return getGetResourcesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleServiceStub newStub(io.grpc.Channel channel) {
    return new RoleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RoleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoles(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRolesMethod(), responseObserver);
    }

    /**
     */
    public void getRole(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.RoleOuterClass.Role> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    /**
     */
    public void getMyPermissions(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.RoleOuterClass.Role> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMyPermissionsMethod(), responseObserver);
    }

    /**
     */
    public void createRole(io.stackrox.proto.storage.RoleOuterClass.Role request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
    }

    /**
     */
    public void updateRole(io.stackrox.proto.storage.RoleOuterClass.Role request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     */
    public void deleteRole(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     */
    public void getResources(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResourcesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse>(
                  this, METHODID_GET_ROLES)))
          .addMethod(
            getGetRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.RoleOuterClass.Role>(
                  this, METHODID_GET_ROLE)))
          .addMethod(
            getGetMyPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.storage.RoleOuterClass.Role>(
                  this, METHODID_GET_MY_PERMISSIONS)))
          .addMethod(
            getCreateRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.RoleOuterClass.Role,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_CREATE_ROLE)))
          .addMethod(
            getUpdateRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.RoleOuterClass.Role,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_UPDATE_ROLE)))
          .addMethod(
            getDeleteRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_ROLE)))
          .addMethod(
            getGetResourcesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse>(
                  this, METHODID_GET_RESOURCES)))
          .build();
    }
  }

  /**
   */
  public static final class RoleServiceStub extends io.grpc.stub.AbstractStub<RoleServiceStub> {
    private RoleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRoles(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRole(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.RoleOuterClass.Role> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMyPermissions(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.RoleOuterClass.Role> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMyPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRole(io.stackrox.proto.storage.RoleOuterClass.Role request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRole(io.stackrox.proto.storage.RoleOuterClass.Role request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResources(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResourcesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoleServiceBlockingStub extends io.grpc.stub.AbstractStub<RoleServiceBlockingStub> {
    private RoleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse getRoles(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.RoleOuterClass.Role getRole(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.storage.RoleOuterClass.Role getMyPermissions(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMyPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty createRole(io.stackrox.proto.storage.RoleOuterClass.Role request) {
      return blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty updateRole(io.stackrox.proto.storage.RoleOuterClass.Role request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteRole(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse getResources(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetResourcesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoleServiceFutureStub extends io.grpc.stub.AbstractStub<RoleServiceFutureStub> {
    private RoleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse> getRoles(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.RoleOuterClass.Role> getRole(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.RoleOuterClass.Role> getMyPermissions(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMyPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> createRole(
        io.stackrox.proto.storage.RoleOuterClass.Role request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> updateRole(
        io.stackrox.proto.storage.RoleOuterClass.Role request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteRole(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse> getResources(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResourcesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROLES = 0;
  private static final int METHODID_GET_ROLE = 1;
  private static final int METHODID_GET_MY_PERMISSIONS = 2;
  private static final int METHODID_CREATE_ROLE = 3;
  private static final int METHODID_UPDATE_ROLE = 4;
  private static final int METHODID_DELETE_ROLE = 5;
  private static final int METHODID_GET_RESOURCES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROLES:
          serviceImpl.getRoles((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetRolesResponse>) responseObserver);
          break;
        case METHODID_GET_ROLE:
          serviceImpl.getRole((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.RoleOuterClass.Role>) responseObserver);
          break;
        case METHODID_GET_MY_PERMISSIONS:
          serviceImpl.getMyPermissions((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.RoleOuterClass.Role>) responseObserver);
          break;
        case METHODID_CREATE_ROLE:
          serviceImpl.createRole((io.stackrox.proto.storage.RoleOuterClass.Role) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE:
          serviceImpl.updateRole((io.stackrox.proto.storage.RoleOuterClass.Role) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_RESOURCES:
          serviceImpl.getResources((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RoleServiceOuterClass.GetResourcesResponse>) responseObserver);
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

  private static abstract class RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.RoleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleService");
    }
  }

  private static final class RoleServiceFileDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier {
    RoleServiceFileDescriptorSupplier() {}
  }

  private static final class RoleServiceMethodDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleServiceFileDescriptorSupplier())
              .addMethod(getGetRolesMethod())
              .addMethod(getGetRoleMethod())
              .addMethod(getGetMyPermissionsMethod())
              .addMethod(getCreateRoleMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getGetResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
