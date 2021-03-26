package org.DS.xinqipeiproject.SmartOfficeGRPC;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Camera.proto")
public final class CameraSecServiceGrpc {

  private CameraSecServiceGrpc() {}

  public static final String SERVICE_NAME = "org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse> getInitialItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialItem",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse> getInitialItemMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse> getInitialItemMethod;
    if ((getInitialItemMethod = CameraSecServiceGrpc.getInitialItemMethod) == null) {
      synchronized (CameraSecServiceGrpc.class) {
        if ((getInitialItemMethod = CameraSecServiceGrpc.getInitialItemMethod) == null) {
          CameraSecServiceGrpc.getInitialItemMethod = getInitialItemMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService", "initialItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraSecServiceMethodDescriptorSupplier("initialItem"))
                  .build();
          }
        }
     }
     return getInitialItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> getChangeCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeCamera",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> getChangeCameraMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> getChangeCameraMethod;
    if ((getChangeCameraMethod = CameraSecServiceGrpc.getChangeCameraMethod) == null) {
      synchronized (CameraSecServiceGrpc.class) {
        if ((getChangeCameraMethod = CameraSecServiceGrpc.getChangeCameraMethod) == null) {
          CameraSecServiceGrpc.getChangeCameraMethod = getChangeCameraMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService", "changeCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraSecServiceMethodDescriptorSupplier("changeCamera"))
                  .build();
          }
        }
     }
     return getChangeCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse> getChangeDistanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeDistance",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse> getChangeDistanceMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse> getChangeDistanceMethod;
    if ((getChangeDistanceMethod = CameraSecServiceGrpc.getChangeDistanceMethod) == null) {
      synchronized (CameraSecServiceGrpc.class) {
        if ((getChangeDistanceMethod = CameraSecServiceGrpc.getChangeDistanceMethod) == null) {
          CameraSecServiceGrpc.getChangeDistanceMethod = getChangeDistanceMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService", "changeDistance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraSecServiceMethodDescriptorSupplier("changeDistance"))
                  .build();
          }
        }
     }
     return getChangeDistanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse> getOnOffMethod;
    if ((getOnOffMethod = CameraSecServiceGrpc.getOnOffMethod) == null) {
      synchronized (CameraSecServiceGrpc.class) {
        if ((getOnOffMethod = CameraSecServiceGrpc.getOnOffMethod) == null) {
          CameraSecServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraSecServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> getChangeItemNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeItemName",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> getChangeItemNameMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> getChangeItemNameMethod;
    if ((getChangeItemNameMethod = CameraSecServiceGrpc.getChangeItemNameMethod) == null) {
      synchronized (CameraSecServiceGrpc.class) {
        if ((getChangeItemNameMethod = CameraSecServiceGrpc.getChangeItemNameMethod) == null) {
          CameraSecServiceGrpc.getChangeItemNameMethod = getChangeItemNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService", "changeItemName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraSecServiceMethodDescriptorSupplier("changeItemName"))
                  .build();
          }
        }
     }
     return getChangeItemNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraSecServiceStub newStub(io.grpc.Channel channel) {
    return new CameraSecServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraSecServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CameraSecServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraSecServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CameraSecServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CameraSecServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialItem(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialItemMethod(), responseObserver);
    }

    /**
     */
    public void changeCamera(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeCameraMethod(), responseObserver);
    }

    /**
     */
    public void changeDistance(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDistanceMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeItemName(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeItemNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty,
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse>(
                  this, METHODID_INITIAL_ITEM)))
          .addMethod(
            getChangeCameraMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse>(
                  this, METHODID_CHANGE_CAMERA)))
          .addMethod(
            getChangeDistanceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse>(
                  this, METHODID_CHANGE_DISTANCE)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeItemNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse>(
                  this, METHODID_CHANGE_ITEM_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class CameraSecServiceStub extends io.grpc.stub.AbstractStub<CameraSecServiceStub> {
    private CameraSecServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraSecServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraSecServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraSecServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialItem(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeCamera(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDistance(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeDistanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeItemName(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeItemNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CameraSecServiceBlockingStub extends io.grpc.stub.AbstractStub<CameraSecServiceBlockingStub> {
    private CameraSecServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraSecServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraSecServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraSecServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse initialItem(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> changeCamera(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeCameraMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse> changeDistance(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeDistanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse changeItemName(org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeItemNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CameraSecServiceFutureStub extends io.grpc.stub.AbstractStub<CameraSecServiceFutureStub> {
    private CameraSecServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraSecServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraSecServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraSecServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse> initialItem(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse> onOff(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse> changeItemName(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeItemNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_ITEM = 0;
  private static final int METHODID_CHANGE_CAMERA = 1;
  private static final int METHODID_CHANGE_DISTANCE = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_ITEM_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraSecServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraSecServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_ITEM:
          serviceImpl.initialItem((org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.cameraResponse>) responseObserver);
          break;
        case METHODID_CHANGE_CAMERA:
          serviceImpl.changeCamera((org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_DISTANCE:
          serviceImpl.changeDistance((org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ITEM_NAME:
          serviceImpl.changeItemName((org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.stringResponse>) responseObserver);
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

  private static abstract class CameraSecServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraSecServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.Camera.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraSecService");
    }
  }

  private static final class CameraSecServiceFileDescriptorSupplier
      extends CameraSecServiceBaseDescriptorSupplier {
    CameraSecServiceFileDescriptorSupplier() {}
  }

  private static final class CameraSecServiceMethodDescriptorSupplier
      extends CameraSecServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraSecServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CameraSecServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraSecServiceFileDescriptorSupplier())
              .addMethod(getInitialItemMethod())
              .addMethod(getChangeCameraMethod())
              .addMethod(getChangeDistanceMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeItemNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
