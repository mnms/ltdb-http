/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.stlogic.omnisci.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2021-02-02")
public class TDBObject implements org.apache.thrift.TBase<TDBObject, TDBObject._Fields>, java.io.Serializable, Cloneable, Comparable<TDBObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDBObject");

  private static final org.apache.thrift.protocol.TField OBJECT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("objectName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OBJECT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("objectType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRIVS_FIELD_DESC = new org.apache.thrift.protocol.TField("privs", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField GRANTEE_FIELD_DESC = new org.apache.thrift.protocol.TField("grantee", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDBObjectStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDBObjectTupleSchemeFactory();

  public java.lang.String objectName; // required
  /**
   * 
   * @see TDBObjectType
   */
  public TDBObjectType objectType; // required
  public java.util.List<java.lang.Boolean> privs; // required
  public java.lang.String grantee; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OBJECT_NAME((short)1, "objectName"),
    /**
     * 
     * @see TDBObjectType
     */
    OBJECT_TYPE((short)2, "objectType"),
    PRIVS((short)3, "privs"),
    GRANTEE((short)4, "grantee");

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
        case 1: // OBJECT_NAME
          return OBJECT_NAME;
        case 2: // OBJECT_TYPE
          return OBJECT_TYPE;
        case 3: // PRIVS
          return PRIVS;
        case 4: // GRANTEE
          return GRANTEE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OBJECT_NAME, new org.apache.thrift.meta_data.FieldMetaData("objectName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OBJECT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("objectType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDBObjectType.class)));
    tmpMap.put(_Fields.PRIVS, new org.apache.thrift.meta_data.FieldMetaData("privs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.GRANTEE, new org.apache.thrift.meta_data.FieldMetaData("grantee", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDBObject.class, metaDataMap);
  }

  public TDBObject() {
  }

  public TDBObject(
    java.lang.String objectName,
    TDBObjectType objectType,
    java.util.List<java.lang.Boolean> privs,
    java.lang.String grantee)
  {
    this();
    this.objectName = objectName;
    this.objectType = objectType;
    this.privs = privs;
    this.grantee = grantee;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDBObject(TDBObject other) {
    if (other.isSetObjectName()) {
      this.objectName = other.objectName;
    }
    if (other.isSetObjectType()) {
      this.objectType = other.objectType;
    }
    if (other.isSetPrivs()) {
      java.util.List<java.lang.Boolean> __this__privs = new java.util.ArrayList<java.lang.Boolean>(other.privs);
      this.privs = __this__privs;
    }
    if (other.isSetGrantee()) {
      this.grantee = other.grantee;
    }
  }

  public TDBObject deepCopy() {
    return new TDBObject(this);
  }

  @Override
  public void clear() {
    this.objectName = null;
    this.objectType = null;
    this.privs = null;
    this.grantee = null;
  }

  public java.lang.String getObjectName() {
    return this.objectName;
  }

  public TDBObject setObjectName(java.lang.String objectName) {
    this.objectName = objectName;
    return this;
  }

  public void unsetObjectName() {
    this.objectName = null;
  }

  /** Returns true if field objectName is set (has been assigned a value) and false otherwise */
  public boolean isSetObjectName() {
    return this.objectName != null;
  }

  public void setObjectNameIsSet(boolean value) {
    if (!value) {
      this.objectName = null;
    }
  }

  /**
   * 
   * @see TDBObjectType
   */
  public TDBObjectType getObjectType() {
    return this.objectType;
  }

  /**
   * 
   * @see TDBObjectType
   */
  public TDBObject setObjectType(TDBObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public void unsetObjectType() {
    this.objectType = null;
  }

  /** Returns true if field objectType is set (has been assigned a value) and false otherwise */
  public boolean isSetObjectType() {
    return this.objectType != null;
  }

  public void setObjectTypeIsSet(boolean value) {
    if (!value) {
      this.objectType = null;
    }
  }

  public int getPrivsSize() {
    return (this.privs == null) ? 0 : this.privs.size();
  }

  public java.util.Iterator<java.lang.Boolean> getPrivsIterator() {
    return (this.privs == null) ? null : this.privs.iterator();
  }

  public void addToPrivs(boolean elem) {
    if (this.privs == null) {
      this.privs = new java.util.ArrayList<java.lang.Boolean>();
    }
    this.privs.add(elem);
  }

  public java.util.List<java.lang.Boolean> getPrivs() {
    return this.privs;
  }

  public TDBObject setPrivs(java.util.List<java.lang.Boolean> privs) {
    this.privs = privs;
    return this;
  }

  public void unsetPrivs() {
    this.privs = null;
  }

  /** Returns true if field privs is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivs() {
    return this.privs != null;
  }

  public void setPrivsIsSet(boolean value) {
    if (!value) {
      this.privs = null;
    }
  }

  public java.lang.String getGrantee() {
    return this.grantee;
  }

  public TDBObject setGrantee(java.lang.String grantee) {
    this.grantee = grantee;
    return this;
  }

  public void unsetGrantee() {
    this.grantee = null;
  }

  /** Returns true if field grantee is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantee() {
    return this.grantee != null;
  }

  public void setGranteeIsSet(boolean value) {
    if (!value) {
      this.grantee = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OBJECT_NAME:
      if (value == null) {
        unsetObjectName();
      } else {
        setObjectName((java.lang.String)value);
      }
      break;

    case OBJECT_TYPE:
      if (value == null) {
        unsetObjectType();
      } else {
        setObjectType((TDBObjectType)value);
      }
      break;

    case PRIVS:
      if (value == null) {
        unsetPrivs();
      } else {
        setPrivs((java.util.List<java.lang.Boolean>)value);
      }
      break;

    case GRANTEE:
      if (value == null) {
        unsetGrantee();
      } else {
        setGrantee((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJECT_NAME:
      return getObjectName();

    case OBJECT_TYPE:
      return getObjectType();

    case PRIVS:
      return getPrivs();

    case GRANTEE:
      return getGrantee();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OBJECT_NAME:
      return isSetObjectName();
    case OBJECT_TYPE:
      return isSetObjectType();
    case PRIVS:
      return isSetPrivs();
    case GRANTEE:
      return isSetGrantee();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDBObject)
      return this.equals((TDBObject)that);
    return false;
  }

  public boolean equals(TDBObject that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_objectName = true && this.isSetObjectName();
    boolean that_present_objectName = true && that.isSetObjectName();
    if (this_present_objectName || that_present_objectName) {
      if (!(this_present_objectName && that_present_objectName))
        return false;
      if (!this.objectName.equals(that.objectName))
        return false;
    }

    boolean this_present_objectType = true && this.isSetObjectType();
    boolean that_present_objectType = true && that.isSetObjectType();
    if (this_present_objectType || that_present_objectType) {
      if (!(this_present_objectType && that_present_objectType))
        return false;
      if (!this.objectType.equals(that.objectType))
        return false;
    }

    boolean this_present_privs = true && this.isSetPrivs();
    boolean that_present_privs = true && that.isSetPrivs();
    if (this_present_privs || that_present_privs) {
      if (!(this_present_privs && that_present_privs))
        return false;
      if (!this.privs.equals(that.privs))
        return false;
    }

    boolean this_present_grantee = true && this.isSetGrantee();
    boolean that_present_grantee = true && that.isSetGrantee();
    if (this_present_grantee || that_present_grantee) {
      if (!(this_present_grantee && that_present_grantee))
        return false;
      if (!this.grantee.equals(that.grantee))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetObjectName()) ? 131071 : 524287);
    if (isSetObjectName())
      hashCode = hashCode * 8191 + objectName.hashCode();

    hashCode = hashCode * 8191 + ((isSetObjectType()) ? 131071 : 524287);
    if (isSetObjectType())
      hashCode = hashCode * 8191 + objectType.getValue();

    hashCode = hashCode * 8191 + ((isSetPrivs()) ? 131071 : 524287);
    if (isSetPrivs())
      hashCode = hashCode * 8191 + privs.hashCode();

    hashCode = hashCode * 8191 + ((isSetGrantee()) ? 131071 : 524287);
    if (isSetGrantee())
      hashCode = hashCode * 8191 + grantee.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDBObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetObjectName()).compareTo(other.isSetObjectName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjectName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objectName, other.objectName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetObjectType()).compareTo(other.isSetObjectType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjectType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objectType, other.objectType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrivs()).compareTo(other.isSetPrivs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privs, other.privs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGrantee()).compareTo(other.isSetGrantee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantee, other.grantee);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDBObject(");
    boolean first = true;

    sb.append("objectName:");
    if (this.objectName == null) {
      sb.append("null");
    } else {
      sb.append(this.objectName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("objectType:");
    if (this.objectType == null) {
      sb.append("null");
    } else {
      sb.append(this.objectType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("privs:");
    if (this.privs == null) {
      sb.append("null");
    } else {
      sb.append(this.privs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantee:");
    if (this.grantee == null) {
      sb.append("null");
    } else {
      sb.append(this.grantee);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDBObjectStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDBObjectStandardScheme getScheme() {
      return new TDBObjectStandardScheme();
    }
  }

  private static class TDBObjectStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDBObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDBObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJECT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.objectName = iprot.readString();
              struct.setObjectNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OBJECT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.objectType = com.stlogic.omnisci.thrift.server.TDBObjectType.findByValue(iprot.readI32());
              struct.setObjectTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIVS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list274 = iprot.readListBegin();
                struct.privs = new java.util.ArrayList<java.lang.Boolean>(_list274.size);
                boolean _elem275;
                for (int _i276 = 0; _i276 < _list274.size; ++_i276)
                {
                  _elem275 = iprot.readBool();
                  struct.privs.add(_elem275);
                }
                iprot.readListEnd();
              }
              struct.setPrivsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GRANTEE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.grantee = iprot.readString();
              struct.setGranteeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDBObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.objectName != null) {
        oprot.writeFieldBegin(OBJECT_NAME_FIELD_DESC);
        oprot.writeString(struct.objectName);
        oprot.writeFieldEnd();
      }
      if (struct.objectType != null) {
        oprot.writeFieldBegin(OBJECT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.objectType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.privs != null) {
        oprot.writeFieldBegin(PRIVS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, struct.privs.size()));
          for (boolean _iter277 : struct.privs)
          {
            oprot.writeBool(_iter277);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.grantee != null) {
        oprot.writeFieldBegin(GRANTEE_FIELD_DESC);
        oprot.writeString(struct.grantee);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDBObjectTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDBObjectTupleScheme getScheme() {
      return new TDBObjectTupleScheme();
    }
  }

  private static class TDBObjectTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDBObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDBObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetObjectName()) {
        optionals.set(0);
      }
      if (struct.isSetObjectType()) {
        optionals.set(1);
      }
      if (struct.isSetPrivs()) {
        optionals.set(2);
      }
      if (struct.isSetGrantee()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetObjectName()) {
        oprot.writeString(struct.objectName);
      }
      if (struct.isSetObjectType()) {
        oprot.writeI32(struct.objectType.getValue());
      }
      if (struct.isSetPrivs()) {
        {
          oprot.writeI32(struct.privs.size());
          for (boolean _iter278 : struct.privs)
          {
            oprot.writeBool(_iter278);
          }
        }
      }
      if (struct.isSetGrantee()) {
        oprot.writeString(struct.grantee);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDBObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.objectName = iprot.readString();
        struct.setObjectNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.objectType = com.stlogic.omnisci.thrift.server.TDBObjectType.findByValue(iprot.readI32());
        struct.setObjectTypeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list279 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, iprot.readI32());
          struct.privs = new java.util.ArrayList<java.lang.Boolean>(_list279.size);
          boolean _elem280;
          for (int _i281 = 0; _i281 < _list279.size; ++_i281)
          {
            _elem280 = iprot.readBool();
            struct.privs.add(_elem280);
          }
        }
        struct.setPrivsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.grantee = iprot.readString();
        struct.setGranteeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

