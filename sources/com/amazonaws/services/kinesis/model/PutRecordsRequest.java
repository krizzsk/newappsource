package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PutRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    private List<PutRecordsRequestEntry> records = new ArrayList();
    private String streamName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordsRequest)) {
            return false;
        }
        PutRecordsRequest putRecordsRequest = (PutRecordsRequest) obj;
        if (putRecordsRequest.getRecords() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getRecords() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordsRequest.getRecords() != null && !putRecordsRequest.getRecords().equals(getRecords())) {
            return false;
        }
        if (putRecordsRequest.getStreamName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getStreamName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordsRequest.getStreamName() == null || putRecordsRequest.getStreamName().equals(getStreamName())) {
            return true;
        }
        return false;
    }

    public List<PutRecordsRequestEntry> getRecords() {
        return this.records;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getRecords() == null) {
            i = 0;
        } else {
            i = getRecords().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getStreamName() != null) {
            i2 = getStreamName().hashCode();
        }
        return i3 + i2;
    }

    public void setRecords(Collection<PutRecordsRequestEntry> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getRecords() != null) {
            StringBuilder k2 = C13555b.m33972k("Records: ");
            k2.append(getRecords());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getStreamName() != null) {
            StringBuilder k3 = C13555b.m33972k("StreamName: ");
            k3.append(getStreamName());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordsRequest withRecords(PutRecordsRequestEntry... putRecordsRequestEntryArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(putRecordsRequestEntryArr.length);
        }
        for (PutRecordsRequestEntry add : putRecordsRequestEntryArr) {
            this.records.add(add);
        }
        return this;
    }

    public PutRecordsRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public PutRecordsRequest withRecords(Collection<PutRecordsRequestEntry> collection) {
        setRecords(collection);
        return this;
    }
}
