package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

public class Record implements Serializable {
    private ByteBuffer data;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        if (record.getData() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getData() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (record.getData() == null || record.getData().equals(getData())) {
            return true;
        }
        return false;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int hashCode() {
        return 31 + (getData() == null ? 0 : getData().hashCode());
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getData() != null) {
            StringBuilder k2 = C13555b.m33972k("Data: ");
            k2.append(getData());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public Record withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }
}
