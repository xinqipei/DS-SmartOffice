// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ComputerControlSystem.proto

package org.DS.xinqipeiproject.SmartOfficeGRPC;

public final class ComputerControlSystemServiceImpl {
  private ComputerControlSystemServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_stringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_stringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_stringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_stringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_booleanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_booleanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_booleanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_booleanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_valueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_valueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_valueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_valueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartFarmingGRPC_computercontrolsystemResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartFarmingGRPC_computercontrolsystemResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ComputerControlSystem.proto\022\020SmartFarm" +
      "ingGRPC\"\007\n\005Empty\"\035\n\rstringRequest\022\014\n\004tex" +
      "t\030\001 \001(\t\"\036\n\016stringResponse\022\014\n\004text\030\001 \001(\t\"" +
      "\035\n\016booleanRequest\022\013\n\003msg\030\002 \001(\010\"\036\n\017boolea" +
      "nResponse\022\013\n\003msg\030\002 \001(\010\"\036\n\014valueRequest\022\016" +
      "\n\006length\030\003 \001(\005\"\037\n\rvalueResponse\022\016\n\006lengt" +
      "h\030\003 \001(\005\"N\n\035computercontrolsystemResponse" +
      "\022\r\n\005aname\030\004 \001(\t\022\016\n\006status\030\005 \001(\t\022\016\n\006volum" +
      "e\030\006 \001(\0052\377\002\n\034ComputerControlSystemService" +
      "\022^\n\020initialAppliance\022\027.SmartFarmingGRPC." +
      "Empty\032/.SmartFarmingGRPC.computercontrol" +
      "systemResponse\"\000\022S\n\014changeVolume\022\036.Smart" +
      "FarmingGRPC.valueRequest\032\037.SmartFarmingG" +
      "RPC.valueResponse\"\0000\001\022N\n\005onOff\022 .SmartFa" +
      "rmingGRPC.booleanRequest\032!.SmartFarmingG" +
      "RPC.booleanResponse\"\000\022Z\n\023changeAppliance" +
      "Name\022\037.SmartFarmingGRPC.stringRequest\032 ." +
      "SmartFarmingGRPC.stringResponse\"\000BL\n&org" +
      ".DS.xinqipeiproject.SmartOfficeGRPCB Com" +
      "puterControlSystemServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SmartFarmingGRPC_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartFarmingGRPC_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_SmartFarmingGRPC_stringRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartFarmingGRPC_stringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_stringRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartFarmingGRPC_stringResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SmartFarmingGRPC_stringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_stringResponse_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartFarmingGRPC_booleanRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SmartFarmingGRPC_booleanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_booleanRequest_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartFarmingGRPC_booleanResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SmartFarmingGRPC_booleanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_booleanResponse_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartFarmingGRPC_valueRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SmartFarmingGRPC_valueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_valueRequest_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartFarmingGRPC_valueResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SmartFarmingGRPC_valueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_valueResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartFarmingGRPC_computercontrolsystemResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SmartFarmingGRPC_computercontrolsystemResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartFarmingGRPC_computercontrolsystemResponse_descriptor,
        new java.lang.String[] { "Aname", "Status", "Volume", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}