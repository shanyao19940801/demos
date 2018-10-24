// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/OneOf.proto

public final class OneOf {
  private OneOf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SampleMeeageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SampleMeeage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 4;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 4;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 4;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional .SubMessage sub_meeage = 9;</code>
     */
    boolean hasSubMeeage();
    /**
     * <code>optional .SubMessage sub_meeage = 9;</code>
     */
    OneOf.SubMessage getSubMeeage();
    /**
     * <code>optional .SubMessage sub_meeage = 9;</code>
     */
    OneOf.SubMessageOrBuilder getSubMeeageOrBuilder();
  }
  /**
   * Protobuf type {@code SampleMeeage}
   */
  public  static final class SampleMeeage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SampleMeeage)
      SampleMeeageOrBuilder {
    // Use SampleMeeage.newBuilder() to construct.
    private SampleMeeage(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private SampleMeeage() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SampleMeeage(
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
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              testOneofCase_ = 4;
              testOneof_ = bs;
              break;
            }
            case 74: {
              OneOf.SubMessage.Builder subBuilder = null;
              if (testOneofCase_ == 9) {
                subBuilder = ((OneOf.SubMessage) testOneof_).toBuilder();
              }
              testOneof_ = input.readMessage(OneOf.SubMessage.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((OneOf.SubMessage) testOneof_);
                testOneof_ = subBuilder.buildPartial();
              }
              testOneofCase_ = 9;
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
      return OneOf.internal_static_SampleMeeage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OneOf.internal_static_SampleMeeage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OneOf.SampleMeeage.class, OneOf.SampleMeeage.Builder.class);
    }

    private int bitField0_;
    private int testOneofCase_ = 0;
    private java.lang.Object testOneof_;
    public enum TestOneofCase
        implements com.google.protobuf.Internal.EnumLite {
      NAME(4),
      SUB_MEEAGE(9),
      TESTONEOF_NOT_SET(0);
      private int value = 0;
      private TestOneofCase(int value) {
        this.value = value;
      }
      public static TestOneofCase valueOf(int value) {
        switch (value) {
          case 4: return NAME;
          case 9: return SUB_MEEAGE;
          case 0: return TESTONEOF_NOT_SET;
          default: throw new java.lang.IllegalArgumentException(
            "Value is undefined for this oneof enum.");
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public TestOneofCase
    getTestOneofCase() {
      return TestOneofCase.valueOf(
          testOneofCase_);
    }

    public static final int NAME_FIELD_NUMBER = 4;
    /**
     * <code>optional string name = 4;</code>
     */
    public boolean hasName() {
      return testOneofCase_ == 4;
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = "";
      if (testOneofCase_ == 4) {
        ref = testOneof_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8() && (testOneofCase_ == 4)) {
          testOneof_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = "";
      if (testOneofCase_ == 4) {
        ref = testOneof_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (testOneofCase_ == 4) {
          testOneof_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUB_MEEAGE_FIELD_NUMBER = 9;
    /**
     * <code>optional .SubMessage sub_meeage = 9;</code>
     */
    public boolean hasSubMeeage() {
      return testOneofCase_ == 9;
    }
    /**
     * <code>optional .SubMessage sub_meeage = 9;</code>
     */
    public OneOf.SubMessage getSubMeeage() {
      if (testOneofCase_ == 9) {
         return (OneOf.SubMessage) testOneof_;
      }
      return OneOf.SubMessage.getDefaultInstance();
    }
    /**
     * <code>optional .SubMessage sub_meeage = 9;</code>
     */
    public OneOf.SubMessageOrBuilder getSubMeeageOrBuilder() {
      if (testOneofCase_ == 9) {
         return (OneOf.SubMessage) testOneof_;
      }
      return OneOf.SubMessage.getDefaultInstance();
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
      if (testOneofCase_ == 4) {
        output.writeBytes(4, getNameBytes());
      }
      if (testOneofCase_ == 9) {
        output.writeMessage(9, (OneOf.SubMessage) testOneof_);
      }
      unknownFields.writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (testOneofCase_ == 4) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
      }
      if (testOneofCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, (OneOf.SubMessage) testOneof_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static OneOf.SampleMeeage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OneOf.SampleMeeage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OneOf.SampleMeeage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OneOf.SampleMeeage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OneOf.SampleMeeage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static OneOf.SampleMeeage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static OneOf.SampleMeeage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static OneOf.SampleMeeage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static OneOf.SampleMeeage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static OneOf.SampleMeeage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(OneOf.SampleMeeage prototype) {
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
     * Protobuf type {@code SampleMeeage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SampleMeeage)
        OneOf.SampleMeeageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OneOf.internal_static_SampleMeeage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OneOf.internal_static_SampleMeeage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                OneOf.SampleMeeage.class, OneOf.SampleMeeage.Builder.class);
      }

      // Construct using OneOf.SampleMeeage.newBuilder()
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
        testOneofCase_ = 0;
        testOneof_ = null;
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OneOf.internal_static_SampleMeeage_descriptor;
      }

      public OneOf.SampleMeeage getDefaultInstanceForType() {
        return OneOf.SampleMeeage.getDefaultInstance();
      }

      public OneOf.SampleMeeage build() {
        OneOf.SampleMeeage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public OneOf.SampleMeeage buildPartial() {
        OneOf.SampleMeeage result = new OneOf.SampleMeeage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (testOneofCase_ == 4) {
          result.testOneof_ = testOneof_;
        }
        if (testOneofCase_ == 9) {
          if (subMeeageBuilder_ == null) {
            result.testOneof_ = testOneof_;
          } else {
            result.testOneof_ = subMeeageBuilder_.build();
          }
        }
        result.bitField0_ = to_bitField0_;
        result.testOneofCase_ = testOneofCase_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof OneOf.SampleMeeage) {
          return mergeFrom((OneOf.SampleMeeage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(OneOf.SampleMeeage other) {
        if (other == OneOf.SampleMeeage.getDefaultInstance()) return this;
        switch (other.getTestOneofCase()) {
          case NAME: {
            testOneofCase_ = 4;
            testOneof_ = other.testOneof_;
            onChanged();
            break;
          }
          case SUB_MEEAGE: {
            mergeSubMeeage(other.getSubMeeage());
            break;
          }
          case TESTONEOF_NOT_SET: {
            break;
          }
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
        OneOf.SampleMeeage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (OneOf.SampleMeeage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int testOneofCase_ = 0;
      private java.lang.Object testOneof_;
      public TestOneofCase
          getTestOneofCase() {
        return TestOneofCase.valueOf(
            testOneofCase_);
      }

      public Builder clearTestOneof() {
        testOneofCase_ = 0;
        testOneof_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      /**
       * <code>optional string name = 4;</code>
       */
      public boolean hasName() {
        return testOneofCase_ == 4;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = "";
        if (testOneofCase_ == 4) {
          ref = testOneof_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (testOneofCase_ == 4) {
            if (bs.isValidUtf8()) {
              testOneof_ = s;
            }
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = "";
        if (testOneofCase_ == 4) {
          ref = testOneof_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (testOneofCase_ == 4) {
            testOneof_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  testOneofCase_ = 4;
        testOneof_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder clearName() {
        if (testOneofCase_ == 4) {
          testOneofCase_ = 0;
          testOneof_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  testOneofCase_ = 4;
        testOneof_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilder<
          OneOf.SubMessage, OneOf.SubMessage.Builder, OneOf.SubMessageOrBuilder> subMeeageBuilder_;
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public boolean hasSubMeeage() {
        return testOneofCase_ == 9;
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public OneOf.SubMessage getSubMeeage() {
        if (subMeeageBuilder_ == null) {
          if (testOneofCase_ == 9) {
            return (OneOf.SubMessage) testOneof_;
          }
          return OneOf.SubMessage.getDefaultInstance();
        } else {
          if (testOneofCase_ == 9) {
            return subMeeageBuilder_.getMessage();
          }
          return OneOf.SubMessage.getDefaultInstance();
        }
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public Builder setSubMeeage(OneOf.SubMessage value) {
        if (subMeeageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          testOneof_ = value;
          onChanged();
        } else {
          subMeeageBuilder_.setMessage(value);
        }
        testOneofCase_ = 9;
        return this;
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public Builder setSubMeeage(
          OneOf.SubMessage.Builder builderForValue) {
        if (subMeeageBuilder_ == null) {
          testOneof_ = builderForValue.build();
          onChanged();
        } else {
          subMeeageBuilder_.setMessage(builderForValue.build());
        }
        testOneofCase_ = 9;
        return this;
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public Builder mergeSubMeeage(OneOf.SubMessage value) {
        if (subMeeageBuilder_ == null) {
          if (testOneofCase_ == 9 &&
              testOneof_ != OneOf.SubMessage.getDefaultInstance()) {
            testOneof_ = OneOf.SubMessage.newBuilder((OneOf.SubMessage) testOneof_)
                .mergeFrom(value).buildPartial();
          } else {
            testOneof_ = value;
          }
          onChanged();
        } else {
          if (testOneofCase_ == 9) {
            subMeeageBuilder_.mergeFrom(value);
          }
          subMeeageBuilder_.setMessage(value);
        }
        testOneofCase_ = 9;
        return this;
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public Builder clearSubMeeage() {
        if (subMeeageBuilder_ == null) {
          if (testOneofCase_ == 9) {
            testOneofCase_ = 0;
            testOneof_ = null;
            onChanged();
          }
        } else {
          if (testOneofCase_ == 9) {
            testOneofCase_ = 0;
            testOneof_ = null;
          }
          subMeeageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public OneOf.SubMessage.Builder getSubMeeageBuilder() {
        return getSubMeeageFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      public OneOf.SubMessageOrBuilder getSubMeeageOrBuilder() {
        if ((testOneofCase_ == 9) && (subMeeageBuilder_ != null)) {
          return subMeeageBuilder_.getMessageOrBuilder();
        } else {
          if (testOneofCase_ == 9) {
            return (OneOf.SubMessage) testOneof_;
          }
          return OneOf.SubMessage.getDefaultInstance();
        }
      }
      /**
       * <code>optional .SubMessage sub_meeage = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          OneOf.SubMessage, OneOf.SubMessage.Builder, OneOf.SubMessageOrBuilder> 
          getSubMeeageFieldBuilder() {
        if (subMeeageBuilder_ == null) {
          if (!(testOneofCase_ == 9)) {
            testOneof_ = OneOf.SubMessage.getDefaultInstance();
          }
          subMeeageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              OneOf.SubMessage, OneOf.SubMessage.Builder, OneOf.SubMessageOrBuilder>(
                  (OneOf.SubMessage) testOneof_,
                  getParentForChildren(),
                  isClean());
          testOneof_ = null;
        }
        testOneofCase_ = 9;
        onChanged();;
        return subMeeageBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:SampleMeeage)
    }

    // @@protoc_insertion_point(class_scope:SampleMeeage)
    private static final OneOf.SampleMeeage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new OneOf.SampleMeeage();
    }

    public static OneOf.SampleMeeage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<SampleMeeage> PARSER =
        new com.google.protobuf.AbstractParser<SampleMeeage>() {
      public SampleMeeage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new SampleMeeage(input, extensionRegistry);
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
    public com.google.protobuf.Parser<SampleMeeage> getParserForType() {
      return PARSER;
    }

    public OneOf.SampleMeeage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SubMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SubMessage)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code SubMessage}
   */
  public  static final class SubMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SubMessage)
      SubMessageOrBuilder {
    // Use SubMessage.newBuilder() to construct.
    private SubMessage(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private SubMessage() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SubMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
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
      return OneOf.internal_static_SubMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OneOf.internal_static_SubMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OneOf.SubMessage.class, OneOf.SubMessage.Builder.class);
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
      unknownFields.writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static OneOf.SubMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OneOf.SubMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OneOf.SubMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OneOf.SubMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OneOf.SubMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static OneOf.SubMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static OneOf.SubMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static OneOf.SubMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static OneOf.SubMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static OneOf.SubMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(OneOf.SubMessage prototype) {
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
     * Protobuf type {@code SubMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SubMessage)
        OneOf.SubMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OneOf.internal_static_SubMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OneOf.internal_static_SubMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                OneOf.SubMessage.class, OneOf.SubMessage.Builder.class);
      }

      // Construct using OneOf.SubMessage.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OneOf.internal_static_SubMessage_descriptor;
      }

      public OneOf.SubMessage getDefaultInstanceForType() {
        return OneOf.SubMessage.getDefaultInstance();
      }

      public OneOf.SubMessage build() {
        OneOf.SubMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public OneOf.SubMessage buildPartial() {
        OneOf.SubMessage result = new OneOf.SubMessage(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof OneOf.SubMessage) {
          return mergeFrom((OneOf.SubMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(OneOf.SubMessage other) {
        if (other == OneOf.SubMessage.getDefaultInstance()) return this;
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
        OneOf.SubMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (OneOf.SubMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SubMessage)
    }

    // @@protoc_insertion_point(class_scope:SubMessage)
    private static final OneOf.SubMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new OneOf.SubMessage();
    }

    public static OneOf.SubMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<SubMessage> PARSER =
        new com.google.protobuf.AbstractParser<SubMessage>() {
      public SubMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new SubMessage(input, extensionRegistry);
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
    public com.google.protobuf.Parser<SubMessage> getParserForType() {
      return PARSER;
    }

    public OneOf.SubMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_SampleMeeage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SampleMeeage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_SubMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SubMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021proto/OneOf.proto\"O\n\014SampleMeeage\022\016\n\004n" +
      "ame\030\004 \001(\tH\000\022!\n\nsub_meeage\030\t \001(\0132\013.SubMes" +
      "sageH\000B\014\n\ntest_oneof\"\014\n\nSubMessage"
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
    internal_static_SampleMeeage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SampleMeeage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SampleMeeage_descriptor,
        new java.lang.String[] { "Name", "SubMeeage", "TestOneof", });
    internal_static_SubMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SubMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SubMessage_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
