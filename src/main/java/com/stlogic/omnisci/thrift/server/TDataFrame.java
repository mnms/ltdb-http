/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.stlogic.omnisci.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2021-02-02")
public class TDataFrame implements org.apache.thrift.TBase<TDataFrame, TDataFrame._Fields>, java.io.Serializable, Cloneable, Comparable<TDataFrame> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataFrame");

  private static final org.apache.thrift.protocol.TField SM_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sm_handle", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SM_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("sm_size", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DF_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("df_handle", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DF_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("df_size", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDataFrameStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDataFrameTupleSchemeFactory();

  public java.nio.ByteBuffer sm_handle; // required
  public long sm_size; // required
  public java.nio.ByteBuffer df_handle; // required
  public long df_size; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SM_HANDLE((short)1, "sm_handle"),
    SM_SIZE((short)2, "sm_size"),
    DF_HANDLE((short)3, "df_handle"),
    DF_SIZE((short)4, "df_size");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SM_HANDLE
          return SM_HANDLE;
        case 2: // SM_SIZE
          return SM_SIZE;
        case 3: // DF_HANDLE
          return DF_HANDLE;
        case 4: // DF_SIZE
          return DF_SIZE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SM_SIZE_ISSET_ID = 0;
  private static final int __DF_SIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SM_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("sm_handle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SM_SIZE, new org.apache.thrift.meta_data.FieldMetaData("sm_size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DF_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("df_handle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.DF_SIZE, new org.apache.thrift.meta_data.FieldMetaData("df_size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataFrame.class, metaDataMap);
  }

  public TDataFrame() {
  }

  public TDataFrame(
    java.nio.ByteBuffer sm_handle,
    long sm_size,
    java.nio.ByteBuffer df_handle,
    long df_size)
  {
    this();
    this.sm_handle = org.apache.thrift.TBaseHelper.copyBinary(sm_handle);
    this.sm_size = sm_size;
    setSm_sizeIsSet(true);
    this.df_handle = org.apache.thrift.TBaseHelper.copyBinary(df_handle);
    this.df_size = df_size;
    setDf_sizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataFrame(TDataFrame other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSm_handle()) {
      this.sm_handle = org.apache.thrift.TBaseHelper.copyBinary(other.sm_handle);
    }
    this.sm_size = other.sm_size;
    if (other.isSetDf_handle()) {
      this.df_handle = org.apache.thrift.TBaseHelper.copyBinary(other.df_handle);
    }
    this.df_size = other.df_size;
  }

  public TDataFrame deepCopy() {
    return new TDataFrame(this);
  }

  @Override
  public void clear() {
    this.sm_handle = null;
    setSm_sizeIsSet(false);
    this.sm_size = 0;
    this.df_handle = null;
    setDf_sizeIsSet(false);
    this.df_size = 0;
  }

  public byte[] getSm_handle() {
    setSm_handle(org.apache.thrift.TBaseHelper.rightSize(sm_handle));
    return sm_handle == null ? null : sm_handle.array();
  }

  public java.nio.ByteBuffer bufferForSm_handle() {
    return org.apache.thrift.TBaseHelper.copyBinary(sm_handle);
  }

  public TDataFrame setSm_handle(byte[] sm_handle) {
    this.sm_handle = sm_handle == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(sm_handle.clone());
    return this;
  }

  public TDataFrame setSm_handle(java.nio.ByteBuffer sm_handle) {
    this.sm_handle = org.apache.thrift.TBaseHelper.copyBinary(sm_handle);
    return this;
  }

  public void unsetSm_handle() {
    this.sm_handle = null;
  }

  /** Returns true if field sm_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetSm_handle() {
    return this.sm_handle != null;
  }

  public void setSm_handleIsSet(boolean value) {
    if (!value) {
      this.sm_handle = null;
    }
  }

  public long getSm_size() {
    return this.sm_size;
  }

  public TDataFrame setSm_size(long sm_size) {
    this.sm_size = sm_size;
    setSm_sizeIsSet(true);
    return this;
  }

  public void unsetSm_size() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SM_SIZE_ISSET_ID);
  }

  /** Returns true if field sm_size is set (has been assigned a value) and false otherwise */
  public boolean isSetSm_size() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SM_SIZE_ISSET_ID);
  }

  public void setSm_sizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SM_SIZE_ISSET_ID, value);
  }

  public byte[] getDf_handle() {
    setDf_handle(org.apache.thrift.TBaseHelper.rightSize(df_handle));
    return df_handle == null ? null : df_handle.array();
  }

  public java.nio.ByteBuffer bufferForDf_handle() {
    return org.apache.thrift.TBaseHelper.copyBinary(df_handle);
  }

  public TDataFrame setDf_handle(byte[] df_handle) {
    this.df_handle = df_handle == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(df_handle.clone());
    return this;
  }

  public TDataFrame setDf_handle(java.nio.ByteBuffer df_handle) {
    this.df_handle = org.apache.thrift.TBaseHelper.copyBinary(df_handle);
    return this;
  }

  public void unsetDf_handle() {
    this.df_handle = null;
  }

  /** Returns true if field df_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetDf_handle() {
    return this.df_handle != null;
  }

  public void setDf_handleIsSet(boolean value) {
    if (!value) {
      this.df_handle = null;
    }
  }

  public long getDf_size() {
    return this.df_size;
  }

  public TDataFrame setDf_size(long df_size) {
    this.df_size = df_size;
    setDf_sizeIsSet(true);
    return this;
  }

  public void unsetDf_size() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DF_SIZE_ISSET_ID);
  }

  /** Returns true if field df_size is set (has been assigned a value) and false otherwise */
  public boolean isSetDf_size() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DF_SIZE_ISSET_ID);
  }

  public void setDf_sizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DF_SIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SM_HANDLE:
      if (value == null) {
        unsetSm_handle();
      } else {
        if (value instanceof byte[]) {
          setSm_handle((byte[])value);
        } else {
          setSm_handle((java.nio.ByteBuffer)value);
        }
      }
      break;

    case SM_SIZE:
      if (value == null) {
        unsetSm_size();
      } else {
        setSm_size((java.lang.Long)value);
      }
      break;

    case DF_HANDLE:
      if (value == null) {
        unsetDf_handle();
      } else {
        if (value instanceof byte[]) {
          setDf_handle((byte[])value);
        } else {
          setDf_handle((java.nio.ByteBuffer)value);
        }
      }
      break;

    case DF_SIZE:
      if (value == null) {
        unsetDf_size();
      } else {
        setDf_size((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SM_HANDLE:
      return getSm_handle();

    case SM_SIZE:
      return getSm_size();

    case DF_HANDLE:
      return getDf_handle();

    case DF_SIZE:
      return getDf_size();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SM_HANDLE:
      return isSetSm_handle();
    case SM_SIZE:
      return isSetSm_size();
    case DF_HANDLE:
      return isSetDf_handle();
    case DF_SIZE:
      return isSetDf_size();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDataFrame)
      return this.equals((TDataFrame)that);
    return false;
  }

  public boolean equals(TDataFrame that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sm_handle = true && this.isSetSm_handle();
    boolean that_present_sm_handle = true && that.isSetSm_handle();
    if (this_present_sm_handle || that_present_sm_handle) {
      if (!(this_present_sm_handle && that_present_sm_handle))
        return false;
      if (!this.sm_handle.equals(that.sm_handle))
        return false;
    }

    boolean this_present_sm_size = true;
    boolean that_present_sm_size = true;
    if (this_present_sm_size || that_present_sm_size) {
      if (!(this_present_sm_size && that_present_sm_size))
        return false;
      if (this.sm_size != that.sm_size)
        return false;
    }

    boolean this_present_df_handle = true && this.isSetDf_handle();
    boolean that_present_df_handle = true && that.isSetDf_handle();
    if (this_present_df_handle || that_present_df_handle) {
      if (!(this_present_df_handle && that_present_df_handle))
        return false;
      if (!this.df_handle.equals(that.df_handle))
        return false;
    }

    boolean this_present_df_size = true;
    boolean that_present_df_size = true;
    if (this_present_df_size || that_present_df_size) {
      if (!(this_present_df_size && that_present_df_size))
        return false;
      if (this.df_size != that.df_size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSm_handle()) ? 131071 : 524287);
    if (isSetSm_handle())
      hashCode = hashCode * 8191 + sm_handle.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sm_size);

    hashCode = hashCode * 8191 + ((isSetDf_handle()) ? 131071 : 524287);
    if (isSetDf_handle())
      hashCode = hashCode * 8191 + df_handle.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(df_size);

    return hashCode;
  }

  @Override
  public int compareTo(TDataFrame other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSm_handle()).compareTo(other.isSetSm_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSm_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sm_handle, other.sm_handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSm_size()).compareTo(other.isSetSm_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSm_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sm_size, other.sm_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDf_handle()).compareTo(other.isSetDf_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDf_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.df_handle, other.df_handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDf_size()).compareTo(other.isSetDf_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDf_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.df_size, other.df_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDataFrame(");
    boolean first = true;

    sb.append("sm_handle:");
    if (this.sm_handle == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.sm_handle, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sm_size:");
    sb.append(this.sm_size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("df_handle:");
    if (this.df_handle == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.df_handle, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("df_size:");
    sb.append(this.df_size);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDataFrameStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDataFrameStandardScheme getScheme() {
      return new TDataFrameStandardScheme();
    }
  }

  private static class TDataFrameStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDataFrame> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataFrame struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SM_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sm_handle = iprot.readBinary();
              struct.setSm_handleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SM_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sm_size = iprot.readI64();
              struct.setSm_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DF_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.df_handle = iprot.readBinary();
              struct.setDf_handleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DF_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.df_size = iprot.readI64();
              struct.setDf_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataFrame struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sm_handle != null) {
        oprot.writeFieldBegin(SM_HANDLE_FIELD_DESC);
        oprot.writeBinary(struct.sm_handle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SM_SIZE_FIELD_DESC);
      oprot.writeI64(struct.sm_size);
      oprot.writeFieldEnd();
      if (struct.df_handle != null) {
        oprot.writeFieldBegin(DF_HANDLE_FIELD_DESC);
        oprot.writeBinary(struct.df_handle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DF_SIZE_FIELD_DESC);
      oprot.writeI64(struct.df_size);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataFrameTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDataFrameTupleScheme getScheme() {
      return new TDataFrameTupleScheme();
    }
  }

  private static class TDataFrameTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDataFrame> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataFrame struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSm_handle()) {
        optionals.set(0);
      }
      if (struct.isSetSm_size()) {
        optionals.set(1);
      }
      if (struct.isSetDf_handle()) {
        optionals.set(2);
      }
      if (struct.isSetDf_size()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSm_handle()) {
        oprot.writeBinary(struct.sm_handle);
      }
      if (struct.isSetSm_size()) {
        oprot.writeI64(struct.sm_size);
      }
      if (struct.isSetDf_handle()) {
        oprot.writeBinary(struct.df_handle);
      }
      if (struct.isSetDf_size()) {
        oprot.writeI64(struct.df_size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataFrame struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.sm_handle = iprot.readBinary();
        struct.setSm_handleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sm_size = iprot.readI64();
        struct.setSm_sizeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.df_handle = iprot.readBinary();
        struct.setDf_handleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.df_size = iprot.readI64();
        struct.setDf_sizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

