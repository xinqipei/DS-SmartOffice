package org.DS.gerryproject.SmartFarmingGRPC;

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
  private static volatile io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.Empty,
      org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = org.DS.gerryproject.SmartFarmingGRPC.Empty.class,
      responseType = org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.Empty,
      org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.Empty, org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = ComputerControlSystemServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getInitialApplianceMethod = ComputerControlSystemServiceGrpc.getInitialApplianceMethod) == null) {
          ComputerControlSystemServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<org.DS.gerryproject.SmartFarmingGRPC.Empty, org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.valueRequest,
      org.DS.gerryproject.SmartFarmingGRPC.valueResponse> getChangeIntensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeIntensity",
      requestType = org.DS.gerryproject.SmartFarmingGRPC.valueRequest.class,
      responseType = org.DS.gerryproject.SmartFarmingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.valueRequest,
      org.DS.gerryproject.SmartFarmingGRPC.valueResponse> getChangeIntensityMethod() {
    io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.valueRequest, org.DS.gerryproject.SmartFarmingGRPC.valueResponse> getChangeIntensityMethod;
    if ((getChangeIntensityMethod = ComputerControlSystemServiceGrpc.getChangeIntensityMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getChangeIntensityMethod = ComputerControlSystemServiceGrpc.getChangeIntensityMethod) == null) {
          ComputerControlSystemServiceGrpc.getChangeIntensityMethod = getChangeIntensityMethod = 
              io.grpc.MethodDescriptor.<org.DS.gerryproject.SmartFarmingGRPC.valueRequest, org.DS.gerryproject.SmartFarmingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "changeIntensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("changeIntensity"))
                  .build();
          }
        }
     }
     return getChangeIntensityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.valueRequest,
      org.DS.gerryproject.SmartFarmingGRPC.valueResponse> getChangeRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeRange",
      requestType = org.DS.gerryproject.SmartFarmingGRPC.valueRequest.class,
      responseType = org.DS.gerryproject.SmartFarmingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.valueRequest,
      org.DS.gerryproject.SmartFarmingGRPC.valueResponse> getChangeRangeMethod() {
    io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.valueRequest, org.DS.gerryproject.SmartFarmingGRPC.valueResponse> getChangeRangeMethod;
    if ((getChangeRangeMethod = ComputerControlSystemServiceGrpc.getChangeRangeMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getChangeRangeMethod = ComputerControlSystemServiceGrpc.getChangeRangeMethod) == null) {
          ComputerControlSystemServiceGrpc.getChangeRangeMethod = getChangeRangeMethod = 
              io.grpc.MethodDescriptor.<org.DS.gerryproject.SmartFarmingGRPC.valueRequest, org.DS.gerryproject.SmartFarmingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "changeRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("changeRange"))
                  .build();
          }
        }
     }
     return getChangeRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.booleanRequest,
      org.DS.gerryproject.SmartFarmingGRPC.booleanResponse> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.gerryproject.SmartFarmingGRPC.booleanRequest.class,
      responseType = org.DS.gerryproject.SmartFarmingGRPC.booleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.booleanRequest,
      org.DS.gerryproject.SmartFarmingGRPC.booleanResponse> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.booleanRequest, org.DS.gerryproject.SmartFarmingGRPC.booleanResponse> getOnOffMethod;
    if ((getOnOffMethod = ComputerControlSystemServiceGrpc.getOnOffMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getOnOffMethod = ComputerControlSystemServiceGrpc.getOnOffMethod) == null) {
          ComputerControlSystemServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.gerryproject.SmartFarmingGRPC.booleanRequest, org.DS.gerryproject.SmartFarmingGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerControlSystemServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.stringRequest,
      org.DS.gerryproject.SmartFarmingGRPC.stringResponse> getChangeApplianceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplianceName",
      requestType = org.DS.gerryproject.SmartFarmingGRPC.stringRequest.class,
      responseType = org.DS.gerryproject.SmartFarmingGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.stringRequest,
      org.DS.gerryproject.SmartFarmingGRPC.stringResponse> getChangeApplianceNameMethod() {
    io.grpc.MethodDescriptor<org.DS.gerryproject.SmartFarmingGRPC.stringRequest, org.DS.gerryproject.SmartFarmingGRPC.stringResponse> getChangeApplianceNameMethod;
    if ((getChangeApplianceNameMethod = ComputerControlSystemServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (ComputerControlSystemServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = ComputerControlSystemServiceGrpc.getChangeApplianceNameMethod) == null) {
          ComputerControlSystemServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.gerryproject.SmartFarmingGRPC.stringRequest, org.DS.gerryproject.SmartFarmingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarmingGRPC.ComputerControlSystemService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.gerryproject.SmartFarmingGRPC.stringResponse.getDefaultInstance()))
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
    public void initialAppliance(org.DS.gerryproject.SmartFarmingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
    }

    /**
     */
    public void changeIntensity(org.DS.gerryproject.SmartFarmingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeIntensityMethod(), responseObserver);
    }

    /**
     */
    public void changeRange(org.DS.gerryproject.SmartFarmingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeRangeMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.gerryproject.SmartFarmingGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeApplianceName(org.DS.gerryproject.SmartFarmingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplianceNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialApplianceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.gerryproject.SmartFarmingGRPC.Empty,
                org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
          .addMethod(
            getChangeIntensityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.gerryproject.SmartFarmingGRPC.valueRequest,
                org.DS.gerryproject.SmartFarmingGRPC.valueResponse>(
                  this, METHODID_CHANGE_INTENSITY)))
          .addMethod(
            getChangeRangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.gerryproject.SmartFarmingGRPC.valueRequest,
                org.DS.gerryproject.SmartFarmingGRPC.valueResponse>(
                  this, METHODID_CHANGE_RANGE)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.gerryproject.SmartFarmingGRPC.booleanRequest,
                org.DS.gerryproject.SmartFarmingGRPC.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeApplianceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.gerryproject.SmartFarmingGRPC.stringRequest,
                org.DS.gerryproject.SmartFarmingGRPC.stringResponse>(
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
    public void initialAppliance(org.DS.gerryproject.SmartFarmingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeIntensity(org.DS.gerryproject.SmartFarmingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeIntensityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeRange(org.DS.gerryproject.SmartFarmingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.gerryproject.SmartFarmingGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.booleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeApplianceName(org.DS.gerryproject.SmartFarmingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.stringResponse> responseObserver) {
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
    public org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse initialAppliance(org.DS.gerryproject.SmartFarmingGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.gerryproject.SmartFarmingGRPC.valueResponse> changeIntensity(
        org.DS.gerryproject.SmartFarmingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeIntensityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.gerryproject.SmartFarmingGRPC.valueResponse> changeRange(
        org.DS.gerryproject.SmartFarmingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.gerryproject.SmartFarmingGRPC.booleanResponse onOff(org.DS.gerryproject.SmartFarmingGRPC.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.gerryproject.SmartFarmingGRPC.stringResponse changeApplianceName(org.DS.gerryproject.SmartFarmingGRPC.stringRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse> initialAppliance(
        org.DS.gerryproject.SmartFarmingGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.gerryproject.SmartFarmingGRPC.booleanResponse> onOff(
        org.DS.gerryproject.SmartFarmingGRPC.booleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.gerryproject.SmartFarmingGRPC.stringResponse> changeApplianceName(
        org.DS.gerryproject.SmartFarmingGRPC.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_APPLIANCE = 0;
  private static final int METHODID_CHANGE_INTENSITY = 1;
  private static final int METHODID_CHANGE_RANGE = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 4;

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
          serviceImpl.initialAppliance((org.DS.gerryproject.SmartFarmingGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.computercontrolsystemResponse>) responseObserver);
          break;
        case METHODID_CHANGE_INTENSITY:
          serviceImpl.changeIntensity((org.DS.gerryproject.SmartFarmingGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_CHANGE_RANGE:
          serviceImpl.changeRange((org.DS.gerryproject.SmartFarmingGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.gerryproject.SmartFarmingGRPC.booleanRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_APPLIANCE_NAME:
          serviceImpl.changeApplianceName((org.DS.gerryproject.SmartFarmingGRPC.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.gerryproject.SmartFarmingGRPC.stringResponse>) responseObserver);
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
      return org.DS.gerryproject.SmartFarmingGRPC.ComputerControlSystemServiceImpl.getDescriptor();
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
              .addMethod(getChangeIntensityMethod())
              .addMethod(getChangeRangeMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeApplianceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
