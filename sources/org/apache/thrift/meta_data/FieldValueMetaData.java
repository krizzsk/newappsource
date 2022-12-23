package org.apache.thrift.meta_data;

import java.io.Serializable;

public class FieldValueMetaData implements Serializable {
    private final boolean isBinary;
    private final boolean isTypedefType;
    public final byte type;
    private final String typedefName;

    public FieldValueMetaData(byte b, boolean z) {
        this.type = b;
        this.isTypedefType = false;
        this.typedefName = null;
        this.isBinary = z;
    }

    public FieldValueMetaData(byte b) {
        this(b, false);
    }

    public FieldValueMetaData(byte b, String str) {
        this.type = b;
        this.isTypedefType = true;
        this.typedefName = str;
        this.isBinary = false;
    }
}
