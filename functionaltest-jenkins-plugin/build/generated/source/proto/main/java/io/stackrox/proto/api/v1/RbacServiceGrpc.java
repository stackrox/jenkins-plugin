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
    comments = "Source: api/v1/rbac_service.proto")
public final class RbacServiceGrpc {

  private RbacServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.RbacService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse> getGetRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRole",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse> getGetRoleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse> getGetRoleMethod;
    if ((getGetRoleMethod = RbacServiceGrpc.getGetRoleMethod) == null) {
      synchronized (RbacServiceGrpc.class) {
        if ((getGetRoleMethod = RbacServiceGrpc.getGetRoleMethod) == null) {
          RbacServiceGrpc.getGetRoleMethod = getGetRoleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RbacService", "GetRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RbacServiceMethodDescriptorSupplier("GetRole"))
                  .build();
          }
        }
     }
     return getGetRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = RbacServiceGrpc.getListRolesMethod) == null) {
      synchronized (RbacServiceGrpc.class) {
        if ((getListRolesMethod = RbacServiceGrpc.getListRolesMethod) == null) {
          RbacServiceGrpc.getListRolesMethod = getListRolesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RbacService", "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RbacServiceMethodDescriptorSupplier("ListRoles"))
                  .build();
          }
        }
     }
     return getListRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse> getGetRoleBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoleBinding",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse> getGetRoleBindingMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse> getGetRoleBindingMethod;
    if ((getGetRoleBindingMethod = RbacServiceGrpc.getGetRoleBindingMethod) == null) {
      synchronized (RbacServiceGrpc.class) {
        if ((getGetRoleBindingMethod = RbacServiceGrpc.getGetRoleBindingMethod) == null) {
          RbacServiceGrpc.getGetRoleBindingMethod = getGetRoleBindingMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RbacService", "GetRoleBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RbacServiceMethodDescriptorSupplier("GetRoleBinding"))
                  .build();
          }
        }
     }
     return getGetRoleBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse> getListRoleBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoleBindings",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse> getListRoleBindingsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse> getListRoleBindingsMethod;
    if ((getListRoleBindingsMethod = RbacServiceGrpc.getListRoleBindingsMethod) == null) {
      synchronized (RbacServiceGrpc.class) {
        if ((getListRoleBindingsMethod = RbacServiceGrpc.getListRoleBindingsMethod) == null) {
          RbacServiceGrpc.getListRoleBindingsMethod = getListRoleBindingsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RbacService", "ListRoleBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RbacServiceMethodDescriptorSupplier("ListRoleBindings"))
                  .build();
          }
        }
     }
     return getListRoleBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse> getGetSubjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubject",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse> getGetSubjectMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse> getGetSubjectMethod;
    if ((getGetSubjectMethod = RbacServiceGrpc.getGetSubjectMethod) == null) {
      synchronized (RbacServiceGrpc.class) {
        if ((getGetSubjectMethod = RbacServiceGrpc.getGetSubjectMethod) == null) {
          RbacServiceGrpc.getGetSubjectMethod = getGetSubjectMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RbacService", "GetSubject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RbacServiceMethodDescriptorSupplier("GetSubject"))
                  .build();
          }
        }
     }
     return getGetSubjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse> getListSubjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubjects",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse> getListSubjectsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse> getListSubjectsMethod;
    if ((getListSubjectsMethod = RbacServiceGrpc.getListSubjectsMethod) == null) {
      synchronized (RbacServiceGrpc.class) {
        if ((getListSubjectsMethod = RbacServiceGrpc.getListSubjectsMethod) == null) {
          RbacServiceGrpc.getListSubjectsMethod = getListSubjectsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.RbacService", "ListSubjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RbacServiceMethodDescriptorSupplier("ListSubjects"))
                  .build();
          }
        }
     }
     return getListSubjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RbacServiceStub newStub(io.grpc.Channel channel) {
    return new RbacServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RbacServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RbacServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RbacServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RbacServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RbacServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRole(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    /**
     */
    public void listRoles(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     */
    public void getRoleBinding(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleBindingMethod(), responseObserver);
    }

    /**
     */
    public void listRoleBindings(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRoleBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subjects served from this API are Groups and Users only.
     * Id in this case is the Name field, since for users and groups, that is unique, and subjects do not have IDs.
     * </pre>
     */
    public void getSubject(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSubjectMethod(), responseObserver);
    }

    /**
     */
    public void listSubjects(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSubjectsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse>(
                  this, METHODID_GET_ROLE)))
          .addMethod(
            getListRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse>(
                  this, METHODID_LIST_ROLES)))
          .addMethod(
            getGetRoleBindingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse>(
                  this, METHODID_GET_ROLE_BINDING)))
          .addMethod(
            getListRoleBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse>(
                  this, METHODID_LIST_ROLE_BINDINGS)))
          .addMethod(
            getGetSubjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse>(
                  this, METHODID_GET_SUBJECT)))
          .addMethod(
            getListSubjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse>(
                  this, METHODID_LIST_SUBJECTS)))
          .build();
    }
  }

  /**
   */
  public static final class RbacServiceStub extends io.grpc.stub.AbstractStub<RbacServiceStub> {
    private RbacServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RbacServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RbacServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RbacServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRole(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoles(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoleBinding(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoleBindings(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRoleBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subjects served from this API are Groups and Users only.
     * Id in this case is the Name field, since for users and groups, that is unique, and subjects do not have IDs.
     * </pre>
     */
    public void getSubject(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSubjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSubjects(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSubjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RbacServiceBlockingStub extends io.grpc.stub.AbstractStub<RbacServiceBlockingStub> {
    private RbacServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RbacServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RbacServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RbacServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse getRole(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse listRoles(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse getRoleBinding(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleBindingMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse listRoleBindings(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListRoleBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subjects served from this API are Groups and Users only.
     * Id in this case is the Name field, since for users and groups, that is unique, and subjects do not have IDs.
     * </pre>
     */
    public io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse getSubject(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetSubjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse listSubjects(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListSubjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RbacServiceFutureStub extends io.grpc.stub.AbstractStub<RbacServiceFutureStub> {
    private RbacServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RbacServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RbacServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RbacServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse> getRole(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse> listRoles(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse> getRoleBinding(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleBindingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse> listRoleBindings(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListRoleBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subjects served from this API are Groups and Users only.
     * Id in this case is the Name field, since for users and groups, that is unique, and subjects do not have IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse> getSubject(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSubjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse> listSubjects(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListSubjectsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROLE = 0;
  private static final int METHODID_LIST_ROLES = 1;
  private static final int METHODID_GET_ROLE_BINDING = 2;
  private static final int METHODID_LIST_ROLE_BINDINGS = 3;
  private static final int METHODID_GET_SUBJECT = 4;
  private static final int METHODID_LIST_SUBJECTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RbacServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RbacServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROLE:
          serviceImpl.getRole((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRolesResponse>) responseObserver);
          break;
        case METHODID_GET_ROLE_BINDING:
          serviceImpl.getRoleBinding((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetRoleBindingResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLE_BINDINGS:
          serviceImpl.listRoleBindings((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListRoleBindingsResponse>) responseObserver);
          break;
        case METHODID_GET_SUBJECT:
          serviceImpl.getSubject((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.GetSubjectResponse>) responseObserver);
          break;
        case METHODID_LIST_SUBJECTS:
          serviceImpl.listSubjects((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.RbacServiceOuterClass.ListSubjectsResponse>) responseObserver);
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

  private static abstract class RbacServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RbacServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.RbacServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RbacService");
    }
  }

  private static final class RbacServiceFileDescriptorSupplier
      extends RbacServiceBaseDescriptorSupplier {
    RbacServiceFileDescriptorSupplier() {}
  }

  private static final class RbacServiceMethodDescriptorSupplier
      extends RbacServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RbacServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RbacServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RbacServiceFileDescriptorSupplier())
              .addMethod(getGetRoleMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getGetRoleBindingMethod())
              .addMethod(getListRoleBindingsMethod())
              .addMethod(getGetSubjectMethod())
              .addMethod(getListSubjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
