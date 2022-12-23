package org.apache.thrift.meta_data;

public class EnumMetaData extends FieldValueMetaData {
    public final Class<Object> enumClass;

    public EnumMetaData(Class cls) {
        super((byte) 16, false);
        this.enumClass = cls;
    }
}
