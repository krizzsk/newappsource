package org.apache.thrift.meta_data;

public class MapMetaData extends FieldValueMetaData {
    public final FieldValueMetaData keyMetaData;
    public final FieldValueMetaData valueMetaData;

    public MapMetaData(FieldValueMetaData fieldValueMetaData, FieldValueMetaData fieldValueMetaData2) {
        super((byte) 13, false);
        this.keyMetaData = fieldValueMetaData;
        this.valueMetaData = fieldValueMetaData2;
    }
}
