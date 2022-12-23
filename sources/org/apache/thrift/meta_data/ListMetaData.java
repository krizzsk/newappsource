package org.apache.thrift.meta_data;

public class ListMetaData extends FieldValueMetaData {
    public final FieldValueMetaData elemMetaData;

    public ListMetaData(FieldValueMetaData fieldValueMetaData) {
        super((byte) 15, false);
        this.elemMetaData = fieldValueMetaData;
    }
}
