package com.example.users;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: users.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "users.Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserRequest,
      com.example.users.UsersOuterClass.UserResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.example.users.UsersOuterClass.UserRequest.class,
      responseType = com.example.users.UsersOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserRequest,
      com.example.users.UsersOuterClass.UserResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserRequest, com.example.users.UsersOuterClass.UserResponse> getCreateMethod;
    if ((getCreateMethod = UsersGrpc.getCreateMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateMethod = UsersGrpc.getCreateMethod) == null) {
          UsersGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.example.users.UsersOuterClass.UserRequest, com.example.users.UsersOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserIdRequest,
      com.example.users.UsersOuterClass.UserResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = com.example.users.UsersOuterClass.UserIdRequest.class,
      responseType = com.example.users.UsersOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserIdRequest,
      com.example.users.UsersOuterClass.UserResponse> getReadMethod() {
    io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserIdRequest, com.example.users.UsersOuterClass.UserResponse> getReadMethod;
    if ((getReadMethod = UsersGrpc.getReadMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getReadMethod = UsersGrpc.getReadMethod) == null) {
          UsersGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<com.example.users.UsersOuterClass.UserIdRequest, com.example.users.UsersOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UpdateUserRequest,
      com.example.users.UsersOuterClass.UserResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.example.users.UsersOuterClass.UpdateUserRequest.class,
      responseType = com.example.users.UsersOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UpdateUserRequest,
      com.example.users.UsersOuterClass.UserResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UpdateUserRequest, com.example.users.UsersOuterClass.UserResponse> getUpdateMethod;
    if ((getUpdateMethod = UsersGrpc.getUpdateMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateMethod = UsersGrpc.getUpdateMethod) == null) {
          UsersGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.users.UsersOuterClass.UpdateUserRequest, com.example.users.UsersOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserIdRequest,
      com.example.users.UsersOuterClass.DeleteUserResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.example.users.UsersOuterClass.UserIdRequest.class,
      responseType = com.example.users.UsersOuterClass.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserIdRequest,
      com.example.users.UsersOuterClass.DeleteUserResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.example.users.UsersOuterClass.UserIdRequest, com.example.users.UsersOuterClass.DeleteUserResponse> getDeleteMethod;
    if ((getDeleteMethod = UsersGrpc.getDeleteMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteMethod = UsersGrpc.getDeleteMethod) == null) {
          UsersGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.example.users.UsersOuterClass.UserIdRequest, com.example.users.UsersOuterClass.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.users.UsersOuterClass.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersStub>() {
        @java.lang.Override
        public UsersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersStub(channel, callOptions);
        }
      };
    return UsersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub>() {
        @java.lang.Override
        public UsersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersBlockingStub(channel, callOptions);
        }
      };
    return UsersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub>() {
        @java.lang.Override
        public UsersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersFutureStub(channel, callOptions);
        }
      };
    return UsersFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(com.example.users.UsersOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void read(com.example.users.UsersOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    default void update(com.example.users.UsersOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    default void delete(com.example.users.UsersOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Users.
   */
  public static abstract class UsersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Users.
   */
  public static final class UsersStub
      extends io.grpc.stub.AbstractAsyncStub<UsersStub> {
    private UsersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     */
    public void create(com.example.users.UsersOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(com.example.users.UsersOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.users.UsersOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.example.users.UsersOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Users.
   */
  public static final class UsersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersBlockingStub> {
    private UsersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.users.UsersOuterClass.UserResponse create(com.example.users.UsersOuterClass.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.users.UsersOuterClass.UserResponse read(com.example.users.UsersOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.users.UsersOuterClass.UserResponse update(com.example.users.UsersOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.users.UsersOuterClass.DeleteUserResponse delete(com.example.users.UsersOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Users.
   */
  public static final class UsersFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersFutureStub> {
    private UsersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.users.UsersOuterClass.UserResponse> create(
        com.example.users.UsersOuterClass.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.users.UsersOuterClass.UserResponse> read(
        com.example.users.UsersOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.users.UsersOuterClass.UserResponse> update(
        com.example.users.UsersOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.users.UsersOuterClass.DeleteUserResponse> delete(
        com.example.users.UsersOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.example.users.UsersOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((com.example.users.UsersOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.users.UsersOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.example.users.UsersOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.users.UsersOuterClass.DeleteUserResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.users.UsersOuterClass.UserRequest,
              com.example.users.UsersOuterClass.UserResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.users.UsersOuterClass.UserIdRequest,
              com.example.users.UsersOuterClass.UserResponse>(
                service, METHODID_READ)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.users.UsersOuterClass.UpdateUserRequest,
              com.example.users.UsersOuterClass.UserResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.users.UsersOuterClass.UserIdRequest,
              com.example.users.UsersOuterClass.DeleteUserResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.users.UsersOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
