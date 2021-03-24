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
    comments = "Source: Lighting.proto")
public final class LightingServiceGrpc {

  private LightingServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartOfficeGRPC.LightingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse> getInitialItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialItem",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse> getInitialItemMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse> getInitialItemMethod;
    if ((getInitialItemMethod = LightingServiceGrpc.getInitialItemMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getInitialItemMethod = LightingServiceGrpc.getInitialItemMethod) == null) {
          LightingServiceGrpc.getInitialItemMethod = getInitialItemMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartOfficeGRPC.LightingService", "initialItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("initialItem"))
                  .build();
          }
        }
     }
     return getInitialItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeBrightness",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeBrightnessMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeBrightnessMethod;
    if ((getChangeBrightnessMethod = LightingServiceGrpc.getChangeBrightnessMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getChangeBrightnessMethod = LightingServiceGrpc.getChangeBrightnessMethod) == null) {
          LightingServiceGrpc.getChangeBrightnessMethod = getChangeBrightnessMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartOfficeGRPC.LightingService", "changeBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("changeBrightness"))
                  .build();
          }
        }
     }
     return getChangeBrightnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> getOnOffMethod;
    if ((getOnOffMethod = LightingServiceGrpc.getOnOffMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getOnOffMethod = LightingServiceGrpc.getOnOffMethod) == null) {
          LightingServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartOfficeGRPC.LightingService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeItemNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeItemName",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeItemNameMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeItemNameMethod;
    if ((getChangeItemNameMethod = LightingServiceGrpc.getChangeItemNameMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getChangeItemNameMethod = LightingServiceGrpc.getChangeItemNameMethod) == null) {
          LightingServiceGrpc.getChangeItemNameMethod = getChangeItemNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartOfficeGRPC.LightingService", "changeItemName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("changeItemName"))
                  .build();
          }
        }
     }
     return getChangeItemNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightingServiceStub newStub(io.grpc.Channel channel) {
    return new LightingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LightingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialItem(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialItemMethod(), responseObserver);
    }

    /**
     */
    public void changeBrightness(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeBrightnessMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeItemName(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeItemNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
                org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse>(
                  this, METHODID_INITIAL_ITEM)))
          .addMethod(
            getChangeBrightnessMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>(
                  this, METHODID_CHANGE_BRIGHTNESS)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeItemNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>(
                  this, METHODID_CHANGE_ITEM_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class LightingServiceStub extends io.grpc.stub.AbstractStub<LightingServiceStub> {
    private LightingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialItem(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeBrightness(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeBrightnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeItemName(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeItemNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightingServiceBlockingStub extends io.grpc.stub.AbstractStub<LightingServiceBlockingStub> {
    private LightingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse initialItem(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> changeBrightness(
        org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeBrightnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse changeItemName(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeItemNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightingServiceFutureStub extends io.grpc.stub.AbstractStub<LightingServiceFutureStub> {
    private LightingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse> initialItem(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> onOff(
        org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> changeItemName(
        org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeItemNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_ITEM = 0;
  private static final int METHODID_CHANGE_BRIGHTNESS = 1;
  private static final int METHODID_ON_OFF = 2;
  private static final int METHODID_CHANGE_ITEM_NAME = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_ITEM:
          serviceImpl.initialItem((org.DS.xinqipeiproject.SmartOfficeGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse>) responseObserver);
          break;
        case METHODID_CHANGE_BRIGHTNESS:
          serviceImpl.changeBrightness((org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ITEM_NAME:
          serviceImpl.changeItemName((org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>) responseObserver);
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

  private static abstract class LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.LightingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightingService");
    }
  }

  private static final class LightingServiceFileDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier {
    LightingServiceFileDescriptorSupplier() {}
  }

  private static final class LightingServiceMethodDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightingServiceFileDescriptorSupplier())
              .addMethod(getInitialItemMethod())
              .addMethod(getChangeBrightnessMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeItemNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
