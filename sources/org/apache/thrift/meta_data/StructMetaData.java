package org.apache.thrift.meta_data;

import org.apache.thrift.TBase;

public class StructMetaData extends FieldValueMetaData {
    public final Class<? extends TBase> structClass;

    public StructMetaData(Class cls) {
        super((byte) 12, false);
        this.structClass = cls;
    }
}
