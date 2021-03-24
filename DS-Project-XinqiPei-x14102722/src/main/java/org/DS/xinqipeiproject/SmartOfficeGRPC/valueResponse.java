// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Securitycamera.proto

package org.DS.xinqipeiproject.SmartOfficeGRPC;

/**
 * Protobuf type {@code SmartFarmingGRPC.valueResponse}
 */
public  final class valueResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartFarmingGRPC.valueResponse)
    valueResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use valueResponse.newBuilder() to construct.
  private valueResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private valueResponse() {
    length_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private valueResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 24: {

            length_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.DS.xinqipeiproject.SmartOfficeGRPC.SecuritycameraServiceImpl.internal_static_SmartFarmingGRPC_valueResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.DS.xinqipeiproject.SmartOfficeGRPC.SecuritycameraServiceImpl.internal_static_SmartFarmingGRPC_valueResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.class, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.Builder.class);
  }

  public static final int LENGTH_FIELD_NUMBER = 3;
  private int length_;
  /**
   * <code>int32 length = 3;</code>
   */
  public int getLength() {
    return length_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (length_ != 0) {
      output.writeInt32(3, length_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (length_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, length_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse)) {
      return super.equals(obj);
    }
    org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse other = (org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse) obj;

    boolean result = true;
    result = result && (getLength()
        == other.getLength());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getLength();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SmartFarmingGRPC.valueResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartFarmingGRPC.valueResponse)
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.SecuritycameraServiceImpl.internal_static_SmartFarmingGRPC_valueResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.SecuritycameraServiceImpl.internal_static_SmartFarmingGRPC_valueResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.class, org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.Builder.class);
    }

    // Construct using org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      length_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.SecuritycameraServiceImpl.internal_static_SmartFarmingGRPC_valueResponse_descriptor;
    }

    @java.lang.Override
    public org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse getDefaultInstanceForType() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse build() {
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse buildPartial() {
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse result = new org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse(this);
      result.length_ = length_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse) {
        return mergeFrom((org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse other) {
      if (other == org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse.getDefaultInstance()) return this;
      if (other.getLength() != 0) {
        setLength(other.getLength());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int length_ ;
    /**
     * <code>int32 length = 3;</code>
     */
    public int getLength() {
      return length_;
    }
    /**
     * <code>int32 length = 3;</code>
     */
    public Builder setLength(int value) {
      
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 length = 3;</code>
     */
    public Builder clearLength() {
      
      length_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SmartFarmingGRPC.valueResponse)
  }

  // @@protoc_insertion_point(class_scope:SmartFarmingGRPC.valueResponse)
  private static final org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse();
  }

  public static org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<valueResponse>
      PARSER = new com.google.protobuf.AbstractParser<valueResponse>() {
    @java.lang.Override
    public valueResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new valueResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<valueResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<valueResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
