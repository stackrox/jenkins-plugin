// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage/version.proto

package io.stackrox.proto.storage;

public final class VersionOuterClass {
  private VersionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VersionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:storage.Version)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * This is a strictly incrementing integer describing the DB version.
     * </pre>
     *
     * <code>int32 seq_num = 1;</code>
     */
    int getSeqNum();

    /**
     * <pre>
     * Associated version metadata. (For example, the corresponding product version.)
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    java.lang.String getVersion();
    /**
     * <pre>
     * Associated version metadata. (For example, the corresponding product version.)
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    com.google.protobuf.ByteString
        getVersionBytes();
  }
  /**
   * Protobuf type {@code storage.Version}
   */
  public  static final class Version extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:storage.Version)
      VersionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Version.newBuilder() to construct.
    private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Version() {
      seqNum_ = 0;
      version_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Version(
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
            case 8: {

              seqNum_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
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
      return io.stackrox.proto.storage.VersionOuterClass.internal_static_storage_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.stackrox.proto.storage.VersionOuterClass.internal_static_storage_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.stackrox.proto.storage.VersionOuterClass.Version.class, io.stackrox.proto.storage.VersionOuterClass.Version.Builder.class);
    }

    public static final int SEQ_NUM_FIELD_NUMBER = 1;
    private int seqNum_;
    /**
     * <pre>
     * This is a strictly incrementing integer describing the DB version.
     * </pre>
     *
     * <code>int32 seq_num = 1;</code>
     */
    public int getSeqNum() {
      return seqNum_;
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private volatile java.lang.Object version_;
    /**
     * <pre>
     * Associated version metadata. (For example, the corresponding product version.)
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Associated version metadata. (For example, the corresponding product version.)
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (seqNum_ != 0) {
        output.writeInt32(1, seqNum_);
      }
      if (!getVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (seqNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, seqNum_);
      }
      if (!getVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
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
      if (!(obj instanceof io.stackrox.proto.storage.VersionOuterClass.Version)) {
        return super.equals(obj);
      }
      io.stackrox.proto.storage.VersionOuterClass.Version other = (io.stackrox.proto.storage.VersionOuterClass.Version) obj;

      boolean result = true;
      result = result && (getSeqNum()
          == other.getSeqNum());
      result = result && getVersion()
          .equals(other.getVersion());
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
      hash = (37 * hash) + SEQ_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getSeqNum();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.stackrox.proto.storage.VersionOuterClass.Version parseFrom(
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
    public static Builder newBuilder(io.stackrox.proto.storage.VersionOuterClass.Version prototype) {
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
     * Protobuf type {@code storage.Version}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:storage.Version)
        io.stackrox.proto.storage.VersionOuterClass.VersionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.stackrox.proto.storage.VersionOuterClass.internal_static_storage_Version_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.stackrox.proto.storage.VersionOuterClass.internal_static_storage_Version_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.stackrox.proto.storage.VersionOuterClass.Version.class, io.stackrox.proto.storage.VersionOuterClass.Version.Builder.class);
      }

      // Construct using io.stackrox.proto.storage.VersionOuterClass.Version.newBuilder()
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
        seqNum_ = 0;

        version_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.stackrox.proto.storage.VersionOuterClass.internal_static_storage_Version_descriptor;
      }

      @java.lang.Override
      public io.stackrox.proto.storage.VersionOuterClass.Version getDefaultInstanceForType() {
        return io.stackrox.proto.storage.VersionOuterClass.Version.getDefaultInstance();
      }

      @java.lang.Override
      public io.stackrox.proto.storage.VersionOuterClass.Version build() {
        io.stackrox.proto.storage.VersionOuterClass.Version result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.stackrox.proto.storage.VersionOuterClass.Version buildPartial() {
        io.stackrox.proto.storage.VersionOuterClass.Version result = new io.stackrox.proto.storage.VersionOuterClass.Version(this);
        result.seqNum_ = seqNum_;
        result.version_ = version_;
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
        if (other instanceof io.stackrox.proto.storage.VersionOuterClass.Version) {
          return mergeFrom((io.stackrox.proto.storage.VersionOuterClass.Version)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.stackrox.proto.storage.VersionOuterClass.Version other) {
        if (other == io.stackrox.proto.storage.VersionOuterClass.Version.getDefaultInstance()) return this;
        if (other.getSeqNum() != 0) {
          setSeqNum(other.getSeqNum());
        }
        if (!other.getVersion().isEmpty()) {
          version_ = other.version_;
          onChanged();
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
        io.stackrox.proto.storage.VersionOuterClass.Version parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.stackrox.proto.storage.VersionOuterClass.Version) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int seqNum_ ;
      /**
       * <pre>
       * This is a strictly incrementing integer describing the DB version.
       * </pre>
       *
       * <code>int32 seq_num = 1;</code>
       */
      public int getSeqNum() {
        return seqNum_;
      }
      /**
       * <pre>
       * This is a strictly incrementing integer describing the DB version.
       * </pre>
       *
       * <code>int32 seq_num = 1;</code>
       */
      public Builder setSeqNum(int value) {
        
        seqNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * This is a strictly incrementing integer describing the DB version.
       * </pre>
       *
       * <code>int32 seq_num = 1;</code>
       */
      public Builder clearSeqNum() {
        
        seqNum_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object version_ = "";
      /**
       * <pre>
       * Associated version metadata. (For example, the corresponding product version.)
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          version_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Associated version metadata. (For example, the corresponding product version.)
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Associated version metadata. (For example, the corresponding product version.)
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public Builder setVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Associated version metadata. (For example, the corresponding product version.)
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public Builder clearVersion() {
        
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Associated version metadata. (For example, the corresponding product version.)
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        version_ = value;
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


      // @@protoc_insertion_point(builder_scope:storage.Version)
    }

    // @@protoc_insertion_point(class_scope:storage.Version)
    private static final io.stackrox.proto.storage.VersionOuterClass.Version DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.stackrox.proto.storage.VersionOuterClass.Version();
    }

    public static io.stackrox.proto.storage.VersionOuterClass.Version getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Version>
        PARSER = new com.google.protobuf.AbstractParser<Version>() {
      @java.lang.Override
      public Version parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Version(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Version> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Version> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.stackrox.proto.storage.VersionOuterClass.Version getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_storage_Version_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_storage_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025storage/version.proto\022\007storage\"+\n\007Vers" +
      "ion\022\017\n\007seq_num\030\001 \001(\005\022\017\n\007version\030\002 \001(\tB$\n" +
      "\031io.stackrox.proto.storageZ\007storageb\006pro" +
      "to3"
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
    internal_static_storage_Version_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_storage_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_storage_Version_descriptor,
        new java.lang.String[] { "SeqNum", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
