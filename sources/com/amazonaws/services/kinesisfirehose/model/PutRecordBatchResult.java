package com.amazonaws.services.kinesisfirehose.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PutRecordBatchResult implements Serializable {
    private Boolean encrypted;
    private Integer failedPutCount;
    private List<PutRecordBatchResponseEntry> requestResponses;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordBatchResult)) {
            return false;
        }
        PutRecordBatchResult putRecordBatchResult = (PutRecordBatchResult) obj;
        if (putRecordBatchResult.getFailedPutCount() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getFailedPutCount() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordBatchResult.getFailedPutCount() != null && !putRecordBatchResult.getFailedPutCount().equals(getFailedPutCount())) {
            return false;
        }
        if (putRecordBatchResult.getEncrypted() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getEncrypted() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordBatchResult.getEncrypted() != null && !putRecordBatchResult.getEncrypted().equals(getEncrypted())) {
            return false;
        }
        if (putRecordBatchResult.getRequestResponses() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getRequestResponses() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (putRecordBatchResult.getRequestResponses() == null || putRecordBatchResult.getRequestResponses().equals(getRequestResponses())) {
            return true;
        }
        return false;
    }

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public Integer getFailedPutCount() {
        return this.failedPutCount;
    }

    public List<PutRecordBatchResponseEntry> getRequestResponses() {
        return this.requestResponses;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getFailedPutCount() == null) {
            i = 0;
        } else {
            i = getFailedPutCount().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getEncrypted() == null) {
            i2 = 0;
        } else {
            i2 = getEncrypted().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getRequestResponses() != null) {
            i3 = getRequestResponses().hashCode();
        }
        return i5 + i3;
    }

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    public void setEncrypted(Boolean bool) {
        this.encrypted = bool;
    }

    public void setFailedPutCount(Integer num) {
        this.failedPutCount = num;
    }

    public void setRequestResponses(Collection<PutRecordBatchResponseEntry> collection) {
        if (collection == null) {
            this.requestResponses = null;
        } else {
            this.requestResponses = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getFailedPutCount() != null) {
            StringBuilder k2 = C13555b.m33972k("FailedPutCount: ");
            k2.append(getFailedPutCount());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getEncrypted() != null) {
            StringBuilder k3 = C13555b.m33972k("Encrypted: ");
            k3.append(getEncrypted());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getRequestResponses() != null) {
            StringBuilder k4 = C13555b.m33972k("RequestResponses: ");
            k4.append(getRequestResponses());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordBatchResult withEncrypted(Boolean bool) {
        this.encrypted = bool;
        return this;
    }

    public PutRecordBatchResult withFailedPutCount(Integer num) {
        this.failedPutCount = num;
        return this;
    }

    public PutRecordBatchResult withRequestResponses(PutRecordBatchResponseEntry... putRecordBatchResponseEntryArr) {
        if (getRequestResponses() == null) {
            this.requestResponses = new ArrayList(putRecordBatchResponseEntryArr.length);
        }
        for (PutRecordBatchResponseEntry add : putRecordBatchResponseEntryArr) {
            this.requestResponses.add(add);
        }
        return this;
    }

    public PutRecordBatchResult withRequestResponses(Collection<PutRecordBatchResponseEntry> collection) {
        setRequestResponses(collection);
        return this;
    }
}
