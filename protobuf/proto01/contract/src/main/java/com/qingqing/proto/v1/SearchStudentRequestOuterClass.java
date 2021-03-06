// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/SearchStudentRequest.proto

package com.qingqing.proto.v1;

public final class SearchStudentRequestOuterClass {
  private SearchStudentRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SearchStudentRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SearchStudentRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string qingqing_user_id = 1;</code>
     */
    boolean hasQingqingUserId();
    /**
     * <code>optional string qingqing_user_id = 1;</code>
     */
    java.lang.String getQingqingUserId();
    /**
     * <code>optional string qingqing_user_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getQingqingUserIdBytes();
  }
  /**
   * Protobuf type {@code SearchStudentRequest}
   */
  public  static final class SearchStudentRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SearchStudentRequest)
      SearchStudentRequestOrBuilder {
    // Use SearchStudentRequest.newBuilder() to construct.
    private SearchStudentRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private SearchStudentRequest() {
      qingqingUserId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SearchStudentRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              qingqingUserId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.qingqing.proto.v1.SearchStudentRequestOuterClass.internal_static_SearchStudentRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.qingqing.proto.v1.SearchStudentRequestOuterClass.internal_static_SearchStudentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.class, com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.Builder.class);
    }

    private int bitField0_;
    public static final int QINGQING_USER_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object qingqingUserId_;
    /**
     * <code>optional string qingqing_user_id = 1;</code>
     */
    public boolean hasQingqingUserId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string qingqing_user_id = 1;</code>
     */
    public java.lang.String getQingqingUserId() {
      java.lang.Object ref = qingqingUserId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          qingqingUserId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string qingqing_user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQingqingUserIdBytes() {
      java.lang.Object ref = qingqingUserId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        qingqingUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getQingqingUserIdBytes());
      }
      unknownFields.writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getQingqingUserIdBytes());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SearchStudentRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SearchStudentRequest)
        com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.qingqing.proto.v1.SearchStudentRequestOuterClass.internal_static_SearchStudentRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.qingqing.proto.v1.SearchStudentRequestOuterClass.internal_static_SearchStudentRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.class, com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.Builder.class);
      }

      // Construct using com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        qingqingUserId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.qingqing.proto.v1.SearchStudentRequestOuterClass.internal_static_SearchStudentRequest_descriptor;
      }

      public com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest getDefaultInstanceForType() {
        return com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.getDefaultInstance();
      }

      public com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest build() {
        com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest buildPartial() {
        com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest result = new com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.qingqingUserId_ = qingqingUserId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest) {
          return mergeFrom((com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest other) {
        if (other == com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest.getDefaultInstance()) return this;
        if (other.hasQingqingUserId()) {
          bitField0_ |= 0x00000001;
          qingqingUserId_ = other.qingqingUserId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object qingqingUserId_ = "";
      /**
       * <code>optional string qingqing_user_id = 1;</code>
       */
      public boolean hasQingqingUserId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string qingqing_user_id = 1;</code>
       */
      public java.lang.String getQingqingUserId() {
        java.lang.Object ref = qingqingUserId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            qingqingUserId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string qingqing_user_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQingqingUserIdBytes() {
        java.lang.Object ref = qingqingUserId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          qingqingUserId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string qingqing_user_id = 1;</code>
       */
      public Builder setQingqingUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        qingqingUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string qingqing_user_id = 1;</code>
       */
      public Builder clearQingqingUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        qingqingUserId_ = getDefaultInstance().getQingqingUserId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string qingqing_user_id = 1;</code>
       */
      public Builder setQingqingUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        qingqingUserId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SearchStudentRequest)
    }

    // @@protoc_insertion_point(class_scope:SearchStudentRequest)
    private static final com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest();
    }

    public static com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<SearchStudentRequest> PARSER =
        new com.google.protobuf.AbstractParser<SearchStudentRequest>() {
      public SearchStudentRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new SearchStudentRequest(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SearchStudentRequest> getParserForType() {
      return PARSER;
    }

    public com.qingqing.proto.v1.SearchStudentRequestOuterClass.SearchStudentRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchStudentRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SearchStudentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n proto/SearchStudentRequest.proto\"L\n\024Se" +
      "archStudentRequest\022\030\n\020qingqing_user_id\030\001" +
      " \001(\tJ\004\010\002\020\003J\004\010\017\020\020J\004\010\t\020\014R\003fooR\003barB\027\n\025com." +
      "qingqing.proto.v1"
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
    internal_static_SearchStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SearchStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SearchStudentRequest_descriptor,
        new java.lang.String[] { "QingqingUserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
