// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage/license.proto

package io.stackrox.proto.storage;

public final class License {
  private License() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StoredLicenseKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:storage.StoredLicenseKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string license_key = 1;</code>
     */
    java.lang.String getLicenseKey();
    /**
     * <code>string license_key = 1;</code>
     */
    com.google.protobuf.ByteString
        getLicenseKeyBytes();

    /**
     * <code>string license_id = 2;</code>
     */
    java.lang.String getLicenseId();
    /**
     * <code>string license_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getLicenseIdBytes();

    /**
     * <pre>
     * if there are multiple valid licenses, store which of those were selected.
     * </pre>
     *
     * <code>bool selected = 3;</code>
     */
    boolean getSelected();
  }
  /**
   * Protobuf type {@code storage.StoredLicenseKey}
   */
  public  static final class StoredLicenseKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:storage.StoredLicenseKey)
      StoredLicenseKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StoredLicenseKey.newBuilder() to construct.
    private StoredLicenseKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StoredLicenseKey() {
      licenseKey_ = "";
      licenseId_ = "";
      selected_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StoredLicenseKey(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              licenseKey_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              licenseId_ = s;
              break;
            }
            case 24: {

              selected_ = input.readBool();
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
      return io.stackrox.proto.storage.License.internal_static_storage_StoredLicenseKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.stackrox.proto.storage.License.internal_static_storage_StoredLicenseKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.stackrox.proto.storage.License.StoredLicenseKey.class, io.stackrox.proto.storage.License.StoredLicenseKey.Builder.class);
    }

    public static final int LICENSE_KEY_FIELD_NUMBER = 1;
    private volatile java.lang.Object licenseKey_;
    /**
     * <code>string license_key = 1;</code>
     */
    public java.lang.String getLicenseKey() {
      java.lang.Object ref = licenseKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        licenseKey_ = s;
        return s;
      }
    }
    /**
     * <code>string license_key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLicenseKeyBytes() {
      java.lang.Object ref = licenseKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        licenseKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LICENSE_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object licenseId_;
    /**
     * <code>string license_id = 2;</code>
     */
    public java.lang.String getLicenseId() {
      java.lang.Object ref = licenseId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        licenseId_ = s;
        return s;
      }
    }
    /**
     * <code>string license_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLicenseIdBytes() {
      java.lang.Object ref = licenseId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        licenseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SELECTED_FIELD_NUMBER = 3;
    private boolean selected_;
    /**
     * <pre>
     * if there are multiple valid licenses, store which of those were selected.
     * </pre>
     *
     * <code>bool selected = 3;</code>
     */
    public boolean getSelected() {
      return selected_;
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
      if (!getLicenseKeyBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, licenseKey_);
      }
      if (!getLicenseIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, licenseId_);
      }
      if (selected_ != false) {
        output.writeBool(3, selected_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getLicenseKeyBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, licenseKey_);
      }
      if (!getLicenseIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, licenseId_);
      }
      if (selected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, selected_);
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
      if (!(obj instanceof io.stackrox.proto.storage.License.StoredLicenseKey)) {
        return super.equals(obj);
      }
      io.stackrox.proto.storage.License.StoredLicenseKey other = (io.stackrox.proto.storage.License.StoredLicenseKey) obj;

      boolean result = true;
      result = result && getLicenseKey()
          .equals(other.getLicenseKey());
      result = result && getLicenseId()
          .equals(other.getLicenseId());
      result = result && (getSelected()
          == other.getSelected());
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
      hash = (37 * hash) + LICENSE_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getLicenseKey().hashCode();
      hash = (37 * hash) + LICENSE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLicenseId().hashCode();
      hash = (37 * hash) + SELECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSelected());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.stackrox.proto.storage.License.StoredLicenseKey parseFrom(
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
    public static Builder newBuilder(io.stackrox.proto.storage.License.StoredLicenseKey prototype) {
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
     * Protobuf type {@code storage.StoredLicenseKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:storage.StoredLicenseKey)
        io.stackrox.proto.storage.License.StoredLicenseKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.stackrox.proto.storage.License.internal_static_storage_StoredLicenseKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.stackrox.proto.storage.License.internal_static_storage_StoredLicenseKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.stackrox.proto.storage.License.StoredLicenseKey.class, io.stackrox.proto.storage.License.StoredLicenseKey.Builder.class);
      }

      // Construct using io.stackrox.proto.storage.License.StoredLicenseKey.newBuilder()
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
        licenseKey_ = "";

        licenseId_ = "";

        selected_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.stackrox.proto.storage.License.internal_static_storage_StoredLicenseKey_descriptor;
      }

      @java.lang.Override
      public io.stackrox.proto.storage.License.StoredLicenseKey getDefaultInstanceForType() {
        return io.stackrox.proto.storage.License.StoredLicenseKey.getDefaultInstance();
      }

      @java.lang.Override
      public io.stackrox.proto.storage.License.StoredLicenseKey build() {
        io.stackrox.proto.storage.License.StoredLicenseKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.stackrox.proto.storage.License.StoredLicenseKey buildPartial() {
        io.stackrox.proto.storage.License.StoredLicenseKey result = new io.stackrox.proto.storage.License.StoredLicenseKey(this);
        result.licenseKey_ = licenseKey_;
        result.licenseId_ = licenseId_;
        result.selected_ = selected_;
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
        if (other instanceof io.stackrox.proto.storage.License.StoredLicenseKey) {
          return mergeFrom((io.stackrox.proto.storage.License.StoredLicenseKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.stackrox.proto.storage.License.StoredLicenseKey other) {
        if (other == io.stackrox.proto.storage.License.StoredLicenseKey.getDefaultInstance()) return this;
        if (!other.getLicenseKey().isEmpty()) {
          licenseKey_ = other.licenseKey_;
          onChanged();
        }
        if (!other.getLicenseId().isEmpty()) {
          licenseId_ = other.licenseId_;
          onChanged();
        }
        if (other.getSelected() != false) {
          setSelected(other.getSelected());
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
        io.stackrox.proto.storage.License.StoredLicenseKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.stackrox.proto.storage.License.StoredLicenseKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object licenseKey_ = "";
      /**
       * <code>string license_key = 1;</code>
       */
      public java.lang.String getLicenseKey() {
        java.lang.Object ref = licenseKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          licenseKey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string license_key = 1;</code>
       */
      public com.google.protobuf.ByteString
          getLicenseKeyBytes() {
        java.lang.Object ref = licenseKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          licenseKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string license_key = 1;</code>
       */
      public Builder setLicenseKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        licenseKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string license_key = 1;</code>
       */
      public Builder clearLicenseKey() {
        
        licenseKey_ = getDefaultInstance().getLicenseKey();
        onChanged();
        return this;
      }
      /**
       * <code>string license_key = 1;</code>
       */
      public Builder setLicenseKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        licenseKey_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object licenseId_ = "";
      /**
       * <code>string license_id = 2;</code>
       */
      public java.lang.String getLicenseId() {
        java.lang.Object ref = licenseId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          licenseId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string license_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLicenseIdBytes() {
        java.lang.Object ref = licenseId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          licenseId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string license_id = 2;</code>
       */
      public Builder setLicenseId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        licenseId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string license_id = 2;</code>
       */
      public Builder clearLicenseId() {
        
        licenseId_ = getDefaultInstance().getLicenseId();
        onChanged();
        return this;
      }
      /**
       * <code>string license_id = 2;</code>
       */
      public Builder setLicenseIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        licenseId_ = value;
        onChanged();
        return this;
      }

      private boolean selected_ ;
      /**
       * <pre>
       * if there are multiple valid licenses, store which of those were selected.
       * </pre>
       *
       * <code>bool selected = 3;</code>
       */
      public boolean getSelected() {
        return selected_;
      }
      /**
       * <pre>
       * if there are multiple valid licenses, store which of those were selected.
       * </pre>
       *
       * <code>bool selected = 3;</code>
       */
      public Builder setSelected(boolean value) {
        
        selected_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * if there are multiple valid licenses, store which of those were selected.
       * </pre>
       *
       * <code>bool selected = 3;</code>
       */
      public Builder clearSelected() {
        
        selected_ = false;
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


      // @@protoc_insertion_point(builder_scope:storage.StoredLicenseKey)
    }

    // @@protoc_insertion_point(class_scope:storage.StoredLicenseKey)
    private static final io.stackrox.proto.storage.License.StoredLicenseKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.stackrox.proto.storage.License.StoredLicenseKey();
    }

    public static io.stackrox.proto.storage.License.StoredLicenseKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StoredLicenseKey>
        PARSER = new com.google.protobuf.AbstractParser<StoredLicenseKey>() {
      @java.lang.Override
      public StoredLicenseKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StoredLicenseKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StoredLicenseKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StoredLicenseKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.stackrox.proto.storage.License.StoredLicenseKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_storage_StoredLicenseKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_storage_StoredLicenseKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025storage/license.proto\022\007storage\"M\n\020Stor" +
      "edLicenseKey\022\023\n\013license_key\030\001 \001(\t\022\022\n\nlic" +
      "ense_id\030\002 \001(\t\022\020\n\010selected\030\003 \001(\010B$\n\031io.st" +
      "ackrox.proto.storageZ\007storageb\006proto3"
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
    internal_static_storage_StoredLicenseKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_storage_StoredLicenseKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_storage_StoredLicenseKey_descriptor,
        new java.lang.String[] { "LicenseKey", "LicenseId", "Selected", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
