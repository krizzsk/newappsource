package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class StreamDescription implements Serializable {
    private String encryptionType;
    private List<EnhancedMetrics> enhancedMonitoring = new ArrayList();
    private Boolean hasMoreShards;
    private String keyId;
    private Integer retentionPeriodHours;
    private List<Shard> shards = new ArrayList();
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
        boolean z21;
        boolean z22;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamDescription)) {
            return false;
        }
        StreamDescription streamDescription = (StreamDescription) obj;
        if (streamDescription.getStreamName() == null) {
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
        if (streamDescription.getStreamName() != null && !streamDescription.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (streamDescription.getStreamARN() == null) {
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
        if (streamDescription.getStreamARN() != null && !streamDescription.getStreamARN().equals(getStreamARN())) {
            return false;
        }
        if (streamDescription.getStreamStatus() == null) {
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
        if (streamDescription.getStreamStatus() != null && !streamDescription.getStreamStatus().equals(getStreamStatus())) {
            return false;
        }
        if (streamDescription.getShards() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getShards() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (streamDescription.getShards() != null && !streamDescription.getShards().equals(getShards())) {
            return false;
        }
        if (streamDescription.getHasMoreShards() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getHasMoreShards() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (streamDescription.getHasMoreShards() != null && !streamDescription.getHasMoreShards().equals(getHasMoreShards())) {
            return false;
        }
        if (streamDescription.getRetentionPeriodHours() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getRetentionPeriodHours() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (streamDescription.getRetentionPeriodHours() != null && !streamDescription.getRetentionPeriodHours().equals(getRetentionPeriodHours())) {
            return false;
        }
        if (streamDescription.getStreamCreationTimestamp() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getStreamCreationTimestamp() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (streamDescription.getStreamCreationTimestamp() != null && !streamDescription.getStreamCreationTimestamp().equals(getStreamCreationTimestamp())) {
            return false;
        }
        if (streamDescription.getEnhancedMonitoring() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (getEnhancedMonitoring() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (streamDescription.getEnhancedMonitoring() != null && !streamDescription.getEnhancedMonitoring().equals(getEnhancedMonitoring())) {
            return false;
        }
        if (streamDescription.getEncryptionType() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (getEncryptionType() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (streamDescription.getEncryptionType() != null && !streamDescription.getEncryptionType().equals(getEncryptionType())) {
            return false;
        }
        if (streamDescription.getKeyId() == null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (getKeyId() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z21 ^ z22) {
            return false;
        }
        if (streamDescription.getKeyId() == null || streamDescription.getKeyId().equals(getKeyId())) {
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

    public Boolean getHasMoreShards() {
        return this.hasMoreShards;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    public List<Shard> getShards() {
        return this.shards;
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
        int i9;
        int i11 = 0;
        if (getStreamName() == null) {
            i = 0;
        } else {
            i = getStreamName().hashCode();
        }
        int i12 = (i + 31) * 31;
        if (getStreamARN() == null) {
            i2 = 0;
        } else {
            i2 = getStreamARN().hashCode();
        }
        int i13 = (i12 + i2) * 31;
        if (getStreamStatus() == null) {
            i3 = 0;
        } else {
            i3 = getStreamStatus().hashCode();
        }
        int i14 = (i13 + i3) * 31;
        if (getShards() == null) {
            i4 = 0;
        } else {
            i4 = getShards().hashCode();
        }
        int i15 = (i14 + i4) * 31;
        if (getHasMoreShards() == null) {
            i5 = 0;
        } else {
            i5 = getHasMoreShards().hashCode();
        }
        int i16 = (i15 + i5) * 31;
        if (getRetentionPeriodHours() == null) {
            i6 = 0;
        } else {
            i6 = getRetentionPeriodHours().hashCode();
        }
        int i17 = (i16 + i6) * 31;
        if (getStreamCreationTimestamp() == null) {
            i7 = 0;
        } else {
            i7 = getStreamCreationTimestamp().hashCode();
        }
        int i18 = (i17 + i7) * 31;
        if (getEnhancedMonitoring() == null) {
            i8 = 0;
        } else {
            i8 = getEnhancedMonitoring().hashCode();
        }
        int i19 = (i18 + i8) * 31;
        if (getEncryptionType() == null) {
            i9 = 0;
        } else {
            i9 = getEncryptionType().hashCode();
        }
        int i21 = (i19 + i9) * 31;
        if (getKeyId() != null) {
            i11 = getKeyId().hashCode();
        }
        return i21 + i11;
    }

    public Boolean isHasMoreShards() {
        return this.hasMoreShards;
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

    public void setHasMoreShards(Boolean bool) {
        this.hasMoreShards = bool;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
    }

    public void setShards(Collection<Shard> collection) {
        if (collection == null) {
            this.shards = null;
        } else {
            this.shards = new ArrayList(collection);
        }
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
        if (getShards() != null) {
            StringBuilder k5 = C13555b.m33972k("Shards: ");
            k5.append(getShards());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getHasMoreShards() != null) {
            StringBuilder k6 = C13555b.m33972k("HasMoreShards: ");
            k6.append(getHasMoreShards());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getRetentionPeriodHours() != null) {
            StringBuilder k7 = C13555b.m33972k("RetentionPeriodHours: ");
            k7.append(getRetentionPeriodHours());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getStreamCreationTimestamp() != null) {
            StringBuilder k8 = C13555b.m33972k("StreamCreationTimestamp: ");
            k8.append(getStreamCreationTimestamp());
            k8.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k8.toString());
        }
        if (getEnhancedMonitoring() != null) {
            StringBuilder k9 = C13555b.m33972k("EnhancedMonitoring: ");
            k9.append(getEnhancedMonitoring());
            k9.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k9.toString());
        }
        if (getEncryptionType() != null) {
            StringBuilder k11 = C13555b.m33972k("EncryptionType: ");
            k11.append(getEncryptionType());
            k11.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k11.toString());
        }
        if (getKeyId() != null) {
            StringBuilder k12 = C13555b.m33972k("KeyId: ");
            k12.append(getKeyId());
            k.append(k12.toString());
        }
        k.append("}");
        return k.toString();
    }

    public StreamDescription withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public StreamDescription withEnhancedMonitoring(EnhancedMetrics... enhancedMetricsArr) {
        if (getEnhancedMonitoring() == null) {
            this.enhancedMonitoring = new ArrayList(enhancedMetricsArr.length);
        }
        for (EnhancedMetrics add : enhancedMetricsArr) {
            this.enhancedMonitoring.add(add);
        }
        return this;
    }

    public StreamDescription withHasMoreShards(Boolean bool) {
        this.hasMoreShards = bool;
        return this;
    }

    public StreamDescription withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public StreamDescription withRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
        return this;
    }

    public StreamDescription withShards(Shard... shardArr) {
        if (getShards() == null) {
            this.shards = new ArrayList(shardArr.length);
        }
        for (Shard add : shardArr) {
            this.shards.add(add);
        }
        return this;
    }

    public StreamDescription withStreamARN(String str) {
        this.streamARN = str;
        return this;
    }

    public StreamDescription withStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
        return this;
    }

    public StreamDescription withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public StreamDescription withStreamStatus(String str) {
        this.streamStatus = str;
        return this;
    }

    public void setEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
    }

    public void setStreamStatus(StreamStatus streamStatus2) {
        this.streamStatus = streamStatus2.toString();
    }

    public StreamDescription withEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
        return this;
    }

    public StreamDescription withStreamStatus(StreamStatus streamStatus2) {
        this.streamStatus = streamStatus2.toString();
        return this;
    }

    public StreamDescription withEnhancedMonitoring(Collection<EnhancedMetrics> collection) {
        setEnhancedMonitoring(collection);
        return this;
    }

    public StreamDescription withShards(Collection<Shard> collection) {
        setShards(collection);
        return this;
    }
}
