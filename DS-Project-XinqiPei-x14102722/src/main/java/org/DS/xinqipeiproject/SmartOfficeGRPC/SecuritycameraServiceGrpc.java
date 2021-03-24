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
    comments = "Source: Securitycamera.proto")
public final class SecuritycameraServiceGrpc {

  private SecuritycameraServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartFarmingGRPC.SecuritycameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = SecuritycameraServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getInitialApplianceMethod = SecuritycameraServiceGrpc.getInitialApplianceMethod) == null) {
          SecuritycameraServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.SecuritycameraService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeCamera",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeCameraMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeCameraMethod;
    if ((getChangeCameraMethod = SecuritycameraServiceGrpc.getChangeCameraMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getChangeCameraMethod = SecuritycameraServiceGrpc.getChangeCameraMethod) == null) {
          SecuritycameraServiceGrpc.getChangeCameraMethod = getChangeCameraMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.SecuritycameraService", "changeCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("changeCamera"))
                  .build();
          }
        }
     }
     return getChangeCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolume",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeVolumeMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeVolumeMethod;
    if ((getChangeVolumeMethod = SecuritycameraServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getChangeVolumeMethod = SecuritycameraServiceGrpc.getChangeVolumeMethod) == null) {
          SecuritycameraServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.SecuritycameraService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("changeVolume"))
                  .build();
          }
        }
     }
     return getChangeVolumeMethod;
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
    if ((getOnOffMethod = SecuritycameraServiceGrpc.getOnOffMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getOnOffMethod = SecuritycameraServiceGrpc.getOnOffMethod) == null) {
          SecuritycameraServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.SecuritycameraService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeApplianceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplianceName",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeApplianceNameMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> getChangeApplianceNameMethod;
    if ((getChangeApplianceNameMethod = SecuritycameraServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = SecuritycameraServiceGrpc.getChangeApplianceNameMethod) == null) {
          SecuritycameraServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.SecuritycameraService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("changeApplianceName"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecuritycameraServiceStub newStub(io.grpc.Channel channel) {
    return new SecuritycameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecuritycameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecuritycameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecuritycameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecuritycameraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SecuritycameraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
    }

    /**
     */
    public void changeCamera(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeCameraMethod(), responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeApplianceName(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplianceNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialApplianceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
                org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
          .addMethod(
            getChangeCameraMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>(
                  this, METHODID_CHANGE_CAMERA)))
          .addMethod(
            getChangeVolumeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>(
                  this, METHODID_CHANGE_VOLUME)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeApplianceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>(
                  this, METHODID_CHANGE_APPLIANCE_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class SecuritycameraServiceStub extends io.grpc.stub.AbstractStub<SecuritycameraServiceStub> {
    private SecuritycameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecuritycameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritycameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecuritycameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeCamera(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request, responseObserver);
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
    public void changeApplianceName(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SecuritycameraServiceBlockingStub extends io.grpc.stub.AbstractStub<SecuritycameraServiceBlockingStub> {
    private SecuritycameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecuritycameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritycameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecuritycameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> changeCamera(
        org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeCameraMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> changeVolume(
        org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse onOff(org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse changeApplianceName(org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeApplianceNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecuritycameraServiceFutureStub extends io.grpc.stub.AbstractStub<SecuritycameraServiceFutureStub> {
    private SecuritycameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecuritycameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritycameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecuritycameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse> initialAppliance(
        org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse> changeApplianceName(
        org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_APPLIANCE = 0;
  private static final int METHODID_CHANGE_CAMERA = 1;
  private static final int METHODID_CHANGE_VOLUME = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecuritycameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecuritycameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_APPLIANCE:
          serviceImpl.initialAppliance((org.DS.xinqipeiproject.SmartOfficeGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.cameraResponse>) responseObserver);
          break;
        case METHODID_CHANGE_CAMERA:
          serviceImpl.changeCamera((org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME:
          serviceImpl.changeVolume((org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_APPLIANCE_NAME:
          serviceImpl.changeApplianceName((org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest) request,
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

  private static abstract class SecuritycameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecuritycameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.SecuritycameraServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecuritycameraService");
    }
  }

  private static final class SecuritycameraServiceFileDescriptorSupplier
      extends SecuritycameraServiceBaseDescriptorSupplier {
    SecuritycameraServiceFileDescriptorSupplier() {}
  }

  private static final class SecuritycameraServiceMethodDescriptorSupplier
      extends SecuritycameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecuritycameraServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecuritycameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecuritycameraServiceFileDescriptorSupplier())
              .addMethod(getInitialApplianceMethod())
              .addMethod(getChangeCameraMethod())
              .addMethod(getChangeVolumeMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeApplianceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
