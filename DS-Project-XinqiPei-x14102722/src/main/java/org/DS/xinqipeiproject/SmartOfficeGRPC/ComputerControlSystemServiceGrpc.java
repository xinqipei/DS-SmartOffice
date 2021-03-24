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
    comments = "Source: ComputerControlSystem.proto")
public final class ComputerControlSystemServiceGrpc {

  private ComputerControlSystemServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartFarmingGRPC.ComputerControlSystemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.class,
      responseType = org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty,
      org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = ComputerControlSystemServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getInitialApplianceMethod = ComputerControlSystemServiceGrpc.getInitialApplianceMethod) == null) {
          ComputerControlSystemServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.Empty, org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
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
    if ((getChangeVolumeMethod = ComputerControlSystemServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getChangeVolumeMethod = ComputerControlSystemServiceGrpc.getChangeVolumeMethod) == null) {
          ComputerControlSystemServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("changeVolume"))
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
    if ((getOnOffMethod = ComputerControlSystemServiceGrpc.getOnOffMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getOnOffMethod = ComputerControlSystemServiceGrpc.getOnOffMethod) == null) {
          ComputerControlSystemServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeApplianceNameMethod = ComputerControlSystemServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = ComputerControlSystemServiceGrpc.getChangeApplianceNameMethod) == null) {
          ComputerControlSystemServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest, org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("changeApplianceName"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputerControlSystemServiceStub newStub(io.grpc.Channel channel) {
    return new ComputerControlSystemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputerControlSystemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ComputerControlSystemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputerControlSystemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ComputerControlSystemServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ComputerControlSystemServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
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
                org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
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
  public static final class ComputerControlSystemServiceStub extends io.grpc.stub.AbstractStub<ComputerControlSystemServiceStub> {
    private ComputerControlSystemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComputerControlSystemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerControlSystemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComputerControlSystemServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
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
  public static final class ComputerControlSystemServiceBlockingStub extends io.grpc.stub.AbstractStub<ComputerControlSystemServiceBlockingStub> {
    private ComputerControlSystemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComputerControlSystemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerControlSystemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComputerControlSystemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse initialAppliance(org.DS.xinqipeiproject.SmartOfficeGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
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
  public static final class ComputerControlSystemServiceFutureStub extends io.grpc.stub.AbstractStub<ComputerControlSystemServiceFutureStub> {
    private ComputerControlSystemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComputerControlSystemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerControlSystemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComputerControlSystemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse> initialAppliance(
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
  private static final int METHODID_CHANGE_VOLUME = 1;
  private static final int METHODID_ON_OFF = 2;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComputerControlSystemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComputerControlSystemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_APPLIANCE:
          serviceImpl.initialAppliance((org.DS.xinqipeiproject.SmartOfficeGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse>) responseObserver);
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

  private static abstract class ComputerControlSystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputerControlSystemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.ComputerControlSystemServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputerControlSystemService");
    }
  }

  private static final class ComputerControlSystemServiceFileDescriptorSupplier
      extends ComputerControlSystemServiceBaseDescriptorSupplier {
    ComputerControlSystemServiceFileDescriptorSupplier() {}
  }

  private static final class ComputerControlSystemServiceMethodDescriptorSupplier
      extends ComputerControlSystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComputerControlSystemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComputerControlSystemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputerControlSystemServiceFileDescriptorSupplier())
              .addMethod(getInitialApplianceMethod())
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
