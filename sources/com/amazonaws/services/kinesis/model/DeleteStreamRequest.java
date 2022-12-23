package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class DeleteStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String streamName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteStreamRequest)) {
            return false;
        }
        DeleteStreamRequest deleteStreamRequest = (DeleteStreamRequest) obj;
        if (deleteStreamRequest.getStreamName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStreamName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (deleteStreamRequest.getStreamName() == null || deleteStreamRequest.getStreamName().equals(getStreamName())) {
            return true;
        }
        return false;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return 31 + (getStreamName() == null ? 0 : getStreamName().hashCode());
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamName: ");
            k2.append(getStreamName());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DeleteStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
