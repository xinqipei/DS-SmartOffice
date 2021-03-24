// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Lighting.proto

package org.DS.xinqipeiproject.SmartOfficeGRPC;

/**
 * Protobuf type {@code SmartOfficeGRPC.lightingResponse}
 */
public  final class lightingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartOfficeGRPC.lightingResponse)
    lightingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use lightingResponse.newBuilder() to construct.
  private lightingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private lightingResponse() {
    aname_ = "";
    status_ = "";
    brightness_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private lightingResponse(
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
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            aname_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 48: {

            brightness_ = input.readInt32();
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
    return org.DS.xinqipeiproject.SmartOfficeGRPC.LightingServiceImpl.internal_static_SmartOfficeGRPC_lightingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.DS.xinqipeiproject.SmartOfficeGRPC.LightingServiceImpl.internal_static_SmartOfficeGRPC_lightingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.class, org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.Builder.class);
  }

  public static final int ANAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object aname_;
  /**
   * <code>string aname = 4;</code>
   */
  public java.lang.String getAname() {
    java.lang.Object ref = aname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aname_ = s;
      return s;
    }
  }
  /**
   * <code>string aname = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAnameBytes() {
    java.lang.Object ref = aname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 5;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRIGHTNESS_FIELD_NUMBER = 6;
  private int brightness_;
  /**
   * <code>int32 brightness = 6;</code>
   */
  public int getBrightness() {
    return brightness_;
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
    if (!getAnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, aname_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, status_);
    }
    if (brightness_ != 0) {
      output.writeInt32(6, brightness_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, aname_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, status_);
    }
    if (brightness_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, brightness_);
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
    if (!(obj instanceof org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse)) {
      return super.equals(obj);
    }
    org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse other = (org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse) obj;

    boolean result = true;
    result = result && getAname()
        .equals(other.getAname());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && (getBrightness()
        == other.getBrightness());
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
    hash = (37 * hash) + ANAME_FIELD_NUMBER;
    hash = (53 * hash) + getAname().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + BRIGHTNESS_FIELD_NUMBER;
    hash = (53 * hash) + getBrightness();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parseFrom(
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
  public static Builder newBuilder(org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse prototype) {
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
   * Protobuf type {@code SmartOfficeGRPC.lightingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartOfficeGRPC.lightingResponse)
      org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.LightingServiceImpl.internal_static_SmartOfficeGRPC_lightingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.LightingServiceImpl.internal_static_SmartOfficeGRPC_lightingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.class, org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.Builder.class);
    }

    // Construct using org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.newBuilder()
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
      aname_ = "";

      status_ = "";

      brightness_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.LightingServiceImpl.internal_static_SmartOfficeGRPC_lightingResponse_descriptor;
    }

    @java.lang.Override
    public org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse getDefaultInstanceForType() {
      return org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse build() {
      org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse buildPartial() {
      org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse result = new org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse(this);
      result.aname_ = aname_;
      result.status_ = status_;
      result.brightness_ = brightness_;
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
      if (other instanceof org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse) {
        return mergeFrom((org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse other) {
      if (other == org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse.getDefaultInstance()) return this;
      if (!other.getAname().isEmpty()) {
        aname_ = other.aname_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.getBrightness() != 0) {
        setBrightness(other.getBrightness());
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
      org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object aname_ = "";
    /**
     * <code>string aname = 4;</code>
     */
    public java.lang.String getAname() {
      java.lang.Object ref = aname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aname = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAnameBytes() {
      java.lang.Object ref = aname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aname = 4;</code>
     */
    public Builder setAname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aname = 4;</code>
     */
    public Builder clearAname() {
      
      aname_ = getDefaultInstance().getAname();
      onChanged();
      return this;
    }
    /**
     * <code>string aname = 4;</code>
     */
    public Builder setAnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 5;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 5;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 5;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 5;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private int brightness_ ;
    /**
     * <code>int32 brightness = 6;</code>
     */
    public int getBrightness() {
      return brightness_;
    }
    /**
     * <code>int32 brightness = 6;</code>
     */
    public Builder setBrightness(int value) {
      
      brightness_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 brightness = 6;</code>
     */
    public Builder clearBrightness() {
      
      brightness_ = 0;
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


    // @@protoc_insertion_point(builder_scope:SmartOfficeGRPC.lightingResponse)
  }

  // @@protoc_insertion_point(class_scope:SmartOfficeGRPC.lightingResponse)
  private static final org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse();
  }

  public static org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<lightingResponse>
      PARSER = new com.google.protobuf.AbstractParser<lightingResponse>() {
    @java.lang.Override
    public lightingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new lightingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<lightingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<lightingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.DS.xinqipeiproject.SmartOfficeGRPC.lightingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

