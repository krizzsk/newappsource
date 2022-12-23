package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class StreamDescriptionSummary implements Serializable {
    private String encryptionType;
    private List<EnhancedMetrics> enhancedMonitoring = new ArrayList();
    private String keyId;
    private Integer openShardCount;
    private Integer retentionPeriodHours;
    private String streamARN;
    private Date streamCreationTimestamp;
    private String streamName;
    private String streamStatus;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamDescriptionSummary)) {
            return false;
        }
        StreamDescriptionSummary streamDescriptionSummary = (StreamDescriptionSummary) obj;
        if (streamDescriptionSummary.getStreamName() == null) {
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
        if (streamDescriptionSummary.getStreamName() != null && !streamDescriptionSummary.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (streamDescriptionSummary.getStreamARN() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getStreamARN() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (streamDescriptionSummary.getStreamARN() != null && !streamDescriptionSummary.getStreamARN().equals(getStreamARN())) {
            return false;
        }
        if (streamDescriptionSummary.getStreamStatus() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getStreamStatus() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (streamDescriptionSummary.getStreamStatus() != null && !streamDescriptionSummary.getStreamStatus().equals(getStreamStatus())) {
            return false;
        }
        if (streamDescriptionSummary.getRetentionPeriodHours() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getRetentionPeriodHours() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (streamDescriptionSummary.getRetentionPeriodHours() != null && !streamDescriptionSummary.getRetentionPeriodHours().equals(getRetentionPeriodHours())) {
            return false;
        }
        if (streamDescriptionSummary.getStreamCreationTimestamp() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getStreamCreationTimestamp() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (streamDescriptionSummary.getStreamCreationTimestamp() != null && !streamDescriptionSummary.getStreamCreationTimestamp().equals(getStreamCreationTimestamp())) {
            return false;
        }
        if (streamDescriptionSummary.getEnhancedMonitoring() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getEnhancedMonitoring() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (streamDescriptionSummary.getEnhancedMonitoring() != null && !streamDescriptionSummary.getEnhancedMonitoring().equals(getEnhancedMonitoring())) {
            return false;
        }
        if (streamDescriptionSummary.getEncryptionType() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getEncryptionType() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (streamDescriptionSummary.getEncryptionType() != null && !streamDescriptionSummary.getEncryptionType().equals(getEncryptionType())) {
            return false;
        }
        if (streamDescriptionSummary.getKeyId() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (getKeyId() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (streamDescriptionSummary.getKeyId() != null && !streamDescriptionSummary.getKeyId().equals(getKeyId())) {
            return false;
        }
        if (streamDescriptionSummary.getOpenShardCount() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (getOpenShardCount() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (streamDescriptionSummary.getOpenShardCount() == null || streamDescriptionSummary.getOpenShardCount().equals(getOpenShardCount())) {
            return true;
        }
        return false;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public List<EnhancedMetrics> getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Integer getOpenShardCount() {
        return this.openShardCount;
    }

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    public String getStreamARN() {
        return this.streamARN;
    }

    public Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public String getStreamStatus() {
        return this.streamStatus;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (getStreamName() == null) {
            i = 0;
        } else {
            i = getStreamName().hashCode();
        }
        int i11 = (i + 31) * 31;
        if (getStreamARN() == null) {
            i2 = 0;
        } else {
            i2 = getStreamARN().hashCode();
        }
        int i12 = (i11 + i2) * 31;
        if (getStreamStatus() == null) {
            i3 = 0;
        } else {
            i3 = getStreamStatus().hashCode();
        }
        int i13 = (i12 + i3) * 31;
        if (getRetentionPeriodHours() == null) {
            i4 = 0;
        } else {
            i4 = getRetentionPeriodHours().hashCode();
        }
        int i14 = (i13 + i4) * 31;
        if (getStreamCreationTimestamp() == null) {
            i5 = 0;
        } else {
            i5 = getStreamCreationTimestamp().hashCode();
        }
        int i15 = (i14 + i5) * 31;
        if (getEnhancedMonitoring() == null) {
            i6 = 0;
        } else {
            i6 = getEnhancedMonitoring().hashCode();
        }
        int i16 = (i15 + i6) * 31;
        if (getEncryptionType() == null) {
            i7 = 0;
        } else {
            i7 = getEncryptionType().hashCode();
        }
        int i17 = (i16 + i7) * 31;
        if (getKeyId() == null) {
            i8 = 0;
        } else {
            i8 = getKeyId().hashCode();
        }
        int i18 = (i17 + i8) * 31;
        if (getOpenShardCount() != null) {
            i9 = getOpenShardCount().hashCode();
        }
        return i18 + i9;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public void setEnhancedMonitoring(Collection<EnhancedMetrics> collection) {
        if (collection == null) {
            this.enhancedMonitoring = null;
        } else {
            this.enhancedMonitoring = new ArrayList(collection);
        }
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setOpenShardCount(Integer num) {
        this.openShardCount = num;
    }

    public void setRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
    }

    public void setStreamARN(String str) {
        this.streamARN = str;
    }

    public void setStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setStreamStatus(String str) {
        this.streamStatus = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamName: ");
            k2.append(getStreamName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getStreamARN() != null) {
            StringBuilder k3 = C13555b.m33972k("StreamARN: ");
            k3.append(getStreamARN());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getStreamStatus() != null) {
            StringBuilder k4 = C13555b.m33972k("StreamStatus: ");
            k4.append(getStreamStatus());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getRetentionPeriodHours() != null) {
            StringBuilder k5 = C13555b.m33972k("RetentionPeriodHours: ");
            k5.append(getRetentionPeriodHours());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getStreamCreationTimestamp() != null) {
            StringBuilder k6 = C13555b.m33972k("StreamCreationTimestamp: ");
            k6.append(getStreamCreationTimestamp());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getEnhancedMonitoring() != null) {
            StringBuilder k7 = C13555b.m33972k("EnhancedMonitoring: ");
            k7.append(getEnhancedMonitoring());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getEncryptionType() != null) {
            StringBuilder k8 = C13555b.m33972k("EncryptionType: ");
            k8.append(getEncryptionType());
            k8.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k8.toString());
        }
        if (getKeyId() != null) {
            StringBuilder k9 = C13555b.m33972k("KeyId: ");
            k9.append(getKeyId());
            k9.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k9.toString());
        }
        if (getOpenShardCount() != null) {
            StringBuilder k11 = C13555b.m33972k("OpenShardCount: ");
            k11.append(getOpenShardCount());
            k.append(k11.toString());
        }
        k.append("}");
        return k.toString();
    }

    public StreamDescriptionSummary withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public StreamDescriptionSummary withEnhancedMonitoring(EnhancedMetrics... enhancedMetricsArr) {
        if (getEnhancedMonitoring() == null) {
            this.enhancedMonitoring = new ArrayList(enhancedMetricsArr.length);
        }
        for (EnhancedMetrics add : enhancedMetricsArr) {
            this.enhancedMonitoring.add(add);
        }
        return this;
    }

    public StreamDescriptionSummary withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public StreamDescriptionSummary withOpenShardCount(Integer num) {
        this.openShardCount = num;
        return this;
    }

    public StreamDescriptionSummary withRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
        return this;
    }

    public StreamDescriptionSummary withStreamARN(String str) {
        this.streamARN = str;
        return this;
    }

    public StreamDescriptionSummary withStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
        return this;
    }

    public StreamDescriptionSummary withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public StreamDescriptionSummary withStreamStatus(String str) {
        this.streamStatus = str;
        return this;
    }

    public void setEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
    }

    public void setStreamStatus(StreamStatus streamStatus2) {
        this.streamStatus = streamStatus2.toString();
    }

    public StreamDescriptionSummary withEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
        return this;
    }

    public StreamDescriptionSummary withStreamStatus(StreamStatus streamStatus2) {
        this.streamStatus = streamStatus2.toString();
        return this;
    }

    public StreamDescriptionSummary withEnhancedMonitoring(Collection<EnhancedMetrics> collection) {
        setEnhancedMonitoring(collection);
        return this;
    }
}
