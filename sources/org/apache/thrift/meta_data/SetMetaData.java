package org.apache.thrift.meta_data;

public class SetMetaData extends FieldValueMetaData {
    public final FieldValueMetaData elemMetaData;

    public SetMetaData(FieldValueMetaData fieldValueMetaData) {
        super((byte) 14, false);
        this.elemMetaData = fieldValueMetaData;
    }
}
