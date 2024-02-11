// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: methodSearchByF.proto

package com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio;

/**
 * Protobuf type {@code IndividualByF}
 */
public final class IndividualByF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IndividualByF)
    IndividualByFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IndividualByF.newBuilder() to construct.
  private IndividualByF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IndividualByF() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IndividualByF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IndividualByF(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 16: {

            version_ = input.readInt32();
            break;
          }
          case 26: {
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.Builder subBuilder = null;
            if (individualName_ != null) {
              subBuilder = individualName_.toBuilder();
            }
            individualName_ = input.readMessage(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(individualName_);
              individualName_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.Builder subBuilder = null;
            if (birthDate_ != null) {
              subBuilder = birthDate_.toBuilder();
            }
            birthDate_ = input.readMessage(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(birthDate_);
              birthDate_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.MethodSearchByF.internal_static_IndividualByF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.MethodSearchByF.internal_static_IndividualByF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.class, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <code>int32 version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int INDIVIDUALNAME_FIELD_NUMBER = 3;
  private com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name individualName_;
  /**
   * <code>.Name individualName = 3;</code>
   * @return Whether the individualName field is set.
   */
  @java.lang.Override
  public boolean hasIndividualName() {
    return individualName_ != null;
  }
  /**
   * <code>.Name individualName = 3;</code>
   * @return The individualName.
   */
  @java.lang.Override
  public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name getIndividualName() {
    return individualName_ == null ? com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.getDefaultInstance() : individualName_;
  }
  /**
   * <code>.Name individualName = 3;</code>
   */
  @java.lang.Override
  public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.NameOrBuilder getIndividualNameOrBuilder() {
    return getIndividualName();
  }

  public static final int BIRTHDATE_FIELD_NUMBER = 4;
  private com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate birthDate_;
  /**
   * <code>.BirthDate birthDate = 4;</code>
   * @return Whether the birthDate field is set.
   */
  @java.lang.Override
  public boolean hasBirthDate() {
    return birthDate_ != null;
  }
  /**
   * <code>.BirthDate birthDate = 4;</code>
   * @return The birthDate.
   */
  @java.lang.Override
  public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate getBirthDate() {
    return birthDate_ == null ? com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.getDefaultInstance() : birthDate_;
  }
  /**
   * <code>.BirthDate birthDate = 4;</code>
   */
  @java.lang.Override
  public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDateOrBuilder getBirthDateOrBuilder() {
    return getBirthDate();
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (version_ != 0) {
      output.writeInt32(2, version_);
    }
    if (individualName_ != null) {
      output.writeMessage(3, getIndividualName());
    }
    if (birthDate_ != null) {
      output.writeMessage(4, getBirthDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, version_);
    }
    if (individualName_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getIndividualName());
    }
    if (birthDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getBirthDate());
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
    if (!(obj instanceof com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF)) {
      return super.equals(obj);
    }
    com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF other = (com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (hasIndividualName() != other.hasIndividualName()) return false;
    if (hasIndividualName()) {
      if (!getIndividualName()
          .equals(other.getIndividualName())) return false;
    }
    if (hasBirthDate() != other.hasBirthDate()) return false;
    if (hasBirthDate()) {
      if (!getBirthDate()
          .equals(other.getBirthDate())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    if (hasIndividualName()) {
      hash = (37 * hash) + INDIVIDUALNAME_FIELD_NUMBER;
      hash = (53 * hash) + getIndividualName().hashCode();
    }
    if (hasBirthDate()) {
      hash = (37 * hash) + BIRTHDATE_FIELD_NUMBER;
      hash = (53 * hash) + getBirthDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parseFrom(
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
  public static Builder newBuilder(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF prototype) {
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
   * Protobuf type {@code IndividualByF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IndividualByF)
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.MethodSearchByF.internal_static_IndividualByF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.MethodSearchByF.internal_static_IndividualByF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.class, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.Builder.class);
    }

    // Construct using com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.newBuilder()
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
      id_ = "";

      version_ = 0;

      if (individualNameBuilder_ == null) {
        individualName_ = null;
      } else {
        individualName_ = null;
        individualNameBuilder_ = null;
      }
      if (birthDateBuilder_ == null) {
        birthDate_ = null;
      } else {
        birthDate_ = null;
        birthDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.MethodSearchByF.internal_static_IndividualByF_descriptor;
    }

    @java.lang.Override
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF getDefaultInstanceForType() {
      return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.getDefaultInstance();
    }

    @java.lang.Override
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF build() {
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF buildPartial() {
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF result = new com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF(this);
      result.id_ = id_;
      result.version_ = version_;
      if (individualNameBuilder_ == null) {
        result.individualName_ = individualName_;
      } else {
        result.individualName_ = individualNameBuilder_.build();
      }
      if (birthDateBuilder_ == null) {
        result.birthDate_ = birthDate_;
      } else {
        result.birthDate_ = birthDateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF) {
        return mergeFrom((com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF other) {
      if (other == com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.hasIndividualName()) {
        mergeIndividualName(other.getIndividualName());
      }
      if (other.hasBirthDate()) {
        mergeBirthDate(other.getBirthDate());
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
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <code>int32 version = 2;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>int32 version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name individualName_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.Builder, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.NameOrBuilder> individualNameBuilder_;
    /**
     * <code>.Name individualName = 3;</code>
     * @return Whether the individualName field is set.
     */
    public boolean hasIndividualName() {
      return individualNameBuilder_ != null || individualName_ != null;
    }
    /**
     * <code>.Name individualName = 3;</code>
     * @return The individualName.
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name getIndividualName() {
      if (individualNameBuilder_ == null) {
        return individualName_ == null ? com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.getDefaultInstance() : individualName_;
      } else {
        return individualNameBuilder_.getMessage();
      }
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    public Builder setIndividualName(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name value) {
      if (individualNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        individualName_ = value;
        onChanged();
      } else {
        individualNameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    public Builder setIndividualName(
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.Builder builderForValue) {
      if (individualNameBuilder_ == null) {
        individualName_ = builderForValue.build();
        onChanged();
      } else {
        individualNameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    public Builder mergeIndividualName(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name value) {
      if (individualNameBuilder_ == null) {
        if (individualName_ != null) {
          individualName_ =
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.newBuilder(individualName_).mergeFrom(value).buildPartial();
        } else {
          individualName_ = value;
        }
        onChanged();
      } else {
        individualNameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    public Builder clearIndividualName() {
      if (individualNameBuilder_ == null) {
        individualName_ = null;
        onChanged();
      } else {
        individualName_ = null;
        individualNameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.Builder getIndividualNameBuilder() {
      
      onChanged();
      return getIndividualNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.NameOrBuilder getIndividualNameOrBuilder() {
      if (individualNameBuilder_ != null) {
        return individualNameBuilder_.getMessageOrBuilder();
      } else {
        return individualName_ == null ?
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.getDefaultInstance() : individualName_;
      }
    }
    /**
     * <code>.Name individualName = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.Builder, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.NameOrBuilder> 
        getIndividualNameFieldBuilder() {
      if (individualNameBuilder_ == null) {
        individualNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.Name.Builder, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.NameOrBuilder>(
                getIndividualName(),
                getParentForChildren(),
                isClean());
        individualName_ = null;
      }
      return individualNameBuilder_;
    }

    private com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate birthDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.Builder, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDateOrBuilder> birthDateBuilder_;
    /**
     * <code>.BirthDate birthDate = 4;</code>
     * @return Whether the birthDate field is set.
     */
    public boolean hasBirthDate() {
      return birthDateBuilder_ != null || birthDate_ != null;
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     * @return The birthDate.
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate getBirthDate() {
      if (birthDateBuilder_ == null) {
        return birthDate_ == null ? com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.getDefaultInstance() : birthDate_;
      } else {
        return birthDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    public Builder setBirthDate(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate value) {
      if (birthDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        birthDate_ = value;
        onChanged();
      } else {
        birthDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    public Builder setBirthDate(
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.Builder builderForValue) {
      if (birthDateBuilder_ == null) {
        birthDate_ = builderForValue.build();
        onChanged();
      } else {
        birthDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    public Builder mergeBirthDate(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate value) {
      if (birthDateBuilder_ == null) {
        if (birthDate_ != null) {
          birthDate_ =
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.newBuilder(birthDate_).mergeFrom(value).buildPartial();
        } else {
          birthDate_ = value;
        }
        onChanged();
      } else {
        birthDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    public Builder clearBirthDate() {
      if (birthDateBuilder_ == null) {
        birthDate_ = null;
        onChanged();
      } else {
        birthDate_ = null;
        birthDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.Builder getBirthDateBuilder() {
      
      onChanged();
      return getBirthDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDateOrBuilder getBirthDateOrBuilder() {
      if (birthDateBuilder_ != null) {
        return birthDateBuilder_.getMessageOrBuilder();
      } else {
        return birthDate_ == null ?
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.getDefaultInstance() : birthDate_;
      }
    }
    /**
     * <code>.BirthDate birthDate = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.Builder, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDateOrBuilder> 
        getBirthDateFieldBuilder() {
      if (birthDateBuilder_ == null) {
        birthDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDate.Builder, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.BirthDateOrBuilder>(
                getBirthDate(),
                getParentForChildren(),
                isClean());
        birthDate_ = null;
      }
      return birthDateBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:IndividualByF)
  }

  // @@protoc_insertion_point(class_scope:IndividualByF)
  private static final com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF();
  }

  public static com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IndividualByF>
      PARSER = new com.google.protobuf.AbstractParser<IndividualByF>() {
    @java.lang.Override
    public IndividualByF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IndividualByF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IndividualByF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IndividualByF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

