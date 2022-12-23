package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

public class DescribeStreamSummaryResult implements Serializable {
    private StreamDescriptionSummary streamDescriptionSummary;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamSummaryResult)) {
            return false;
        }
        DescribeStreamSummaryResult describeStreamSummaryResult = (DescribeStreamSummaryResult) obj;
        if (describeStreamSummaryResult.getStreamDescriptionSummary() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStreamDescriptionSummary() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (describeStreamSummaryResult.getStreamDescriptionSummary() == null || describeStreamSummaryResult.getStreamDescriptionSummary().equals(getStreamDescriptionSummary())) {
            return true;
        }
        return false;
    }

    public StreamDescriptionSummary getStreamDescriptionSummary() {
        return this.streamDescriptionSummary;
    }

    public int hashCode() {
        int i;
        if (getStreamDescriptionSummary() == null) {
            i = 0;
        } else {
            i = getStreamDescriptionSummary().hashCode();
        }
        return 31 + i;
    }

    public void setStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary2) {
        this.streamDescriptionSummary = streamDescriptionSummary2;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamDescriptionSummary() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamDescriptionSummary: ");
            k2.append(getStreamDescriptionSummary());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DescribeStreamSummaryResult withStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary2) {
        this.streamDescriptionSummary = streamDescriptionSummary2;
        return this;
    }
}
