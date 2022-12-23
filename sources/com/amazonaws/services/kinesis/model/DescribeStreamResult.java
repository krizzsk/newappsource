package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

public class DescribeStreamResult implements Serializable {
    private StreamDescription streamDescription;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamResult)) {
            return false;
        }
        DescribeStreamResult describeStreamResult = (DescribeStreamResult) obj;
        if (describeStreamResult.getStreamDescription() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStreamDescription() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (describeStreamResult.getStreamDescription() == null || describeStreamResult.getStreamDescription().equals(getStreamDescription())) {
            return true;
        }
        return false;
    }

    public StreamDescription getStreamDescription() {
        return this.streamDescription;
    }

    public int hashCode() {
        return 31 + (getStreamDescription() == null ? 0 : getStreamDescription().hashCode());
    }

    public void setStreamDescription(StreamDescription streamDescription2) {
        this.streamDescription = streamDescription2;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamDescription() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamDescription: ");
            k2.append(getStreamDescription());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DescribeStreamResult withStreamDescription(StreamDescription streamDescription2) {
        this.streamDescription = streamDescription2;
        return this;
    }
}
