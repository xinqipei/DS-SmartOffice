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
    comments = "Source: Radiators.proto")
public final class RadiatorsServiceGrpc {

  private RadiatorsServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartFarmingGRPC.RadiatorsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = RadiatorsServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (RadiatorsServiceGrpc.class) {
        if ((getInitialApplianceMethod = RadiatorsServiceGrpc.getInitialApplianceMethod) == null) {
          RadiatorsServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.RadiatorsService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadiatorsServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTemperature",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeTemperatureMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeTemperatureMethod;
    if ((getChangeTemperatureMethod = RadiatorsServiceGrpc.getChangeTemperatureMethod) == null) {
      synchronized (RadiatorsServiceGrpc.class) {
        if ((getChangeTemperatureMethod = RadiatorsServiceGrpc.getChangeTemperatureMethod) == null) {
          RadiatorsServiceGrpc.getChangeTemperatureMethod = getChangeTemperatureMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.RadiatorsService", "changeTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadiatorsServiceMethodDescriptorSupplier("changeTemperature"))
                  .build();
          }
        }
     }
     return getChangeTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeFanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeFan",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeFanMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> getChangeFanMethod;
    if ((getChangeFanMethod = RadiatorsServiceGrpc.getChangeFanMethod) == null) {
      synchronized (RadiatorsServiceGrpc.class) {
        if ((getChangeFanMethod = RadiatorsServiceGrpc.getChangeFanMethod) == null) {
          RadiatorsServiceGrpc.getChangeFanMethod = getChangeFanMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.RadiatorsService", "changeFan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadiatorsServiceMethodDescriptorSupplier("changeFan"))
                  .build();
          }
        }
     }
     return getChangeFanMethod;
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
    if ((getOnOffMethod = RadiatorsServiceGrpc.getOnOffMethod) == null) {
      synchronized (RadiatorsServiceGrpc.class) {
        if ((getOnOffMethod = RadiatorsServiceGrpc.getOnOffMethod) == null) {
          RadiatorsServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.RadiatorsService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadiatorsServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeApplianceNameMethod = RadiatorsServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (RadiatorsServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = RadiatorsServiceGrpc.getChangeApplianceNameMethod) == null) {
          RadiatorsServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.RadiatorsService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadiatorsServiceMethodDescriptorSupplier("changeApplianceName"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadiatorsServiceStub newStub(io.grpc.Channel channel) {
    return new RadiatorsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadiatorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadiatorsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadiatorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadiatorsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadiatorsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
    }

    /**
     */
    public void changeTemperature(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void changeFan(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeFanMethod(), responseObserver);
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
                org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
          .addMethod(
            getChangeTemperatureMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>(
                  this, METHODID_CHANGE_TEMPERATURE)))
          .addMethod(
            getChangeFanMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest,
                org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>(
                  this, METHODID_CHANGE_FAN)))
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
  public static final class RadiatorsServiceStub extends io.grpc.stub.AbstractStub<RadiatorsServiceStub> {
    private RadiatorsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadiatorsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadiatorsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadiatorsServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeTemperature(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeFan(org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeFanMethod(), getCallOptions()), request, responseObserver);
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
  public static final class RadiatorsServiceBlockingStub extends io.grpc.stub.AbstractStub<RadiatorsServiceBlockingStub> {
    private RadiatorsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadiatorsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadiatorsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadiatorsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> changeTemperature(
        org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse> changeFan(
        org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeFanMethod(), getCallOptions(), request);
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
  public static final class RadiatorsServiceFutureStub extends io.grpc.stub.AbstractStub<RadiatorsServiceFutureStub> {
    private RadiatorsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadiatorsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadiatorsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadiatorsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse> initialAppliance(
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
  private static final int METHODID_CHANGE_TEMPERATURE = 1;
  private static final int METHODID_CHANGE_FAN = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadiatorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadiatorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_APPLIANCE:
          serviceImpl.initialAppliance((org.DS.xinqipeiproject.SmartOfficeGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TEMPERATURE:
          serviceImpl.changeTemperature((org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_CHANGE_FAN:
          serviceImpl.changeFan((org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest) request,
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

  private static abstract class RadiatorsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadiatorsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.RadiatorsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadiatorsService");
    }
  }

  private static final class RadiatorsServiceFileDescriptorSupplier
      extends RadiatorsServiceBaseDescriptorSupplier {
    RadiatorsServiceFileDescriptorSupplier() {}
  }

  private static final class RadiatorsServiceMethodDescriptorSupplier
      extends RadiatorsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadiatorsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadiatorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadiatorsServiceFileDescriptorSupplier())
              .addMethod(getInitialApplianceMethod())
              .addMethod(getChangeTemperatureMethod())
              .addMethod(getChangeFanMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeApplianceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
