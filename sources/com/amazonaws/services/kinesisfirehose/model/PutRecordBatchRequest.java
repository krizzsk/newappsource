package com.amazonaws.services.kinesisfirehose.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PutRecordBatchRequest extends AmazonWebServiceRequest implements Serializable {
    private String deliveryStreamName;
    private List<Record> records;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordBatchRequest)) {
            return false;
        }
        PutRecordBatchRequest putRecordBatchRequest = (PutRecordBatchRequest) obj;
        if (putRecordBatchRequest.getDeliveryStreamName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getDeliveryStreamName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordBatchRequest.getDeliveryStreamName() != null && !putRecordBatchRequest.getDeliveryStreamName().equals(getDeliveryStreamName())) {
            return false;
        }
        if (putRecordBatchRequest.getRecords() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getRecords() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordBatchRequest.getRecords() == null || putRecordBatchRequest.getRecords().equals(getRecords())) {
            return true;
        }
        return false;
    }

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getDeliveryStreamName() == null) {
            i = 0;
        } else {
            i = getDeliveryStreamName().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getRecords() != null) {
            i2 = getRecords().hashCode();
        }
        return i3 + i2;
    }

    public void setDeliveryStreamName(String str) {
        this.deliveryStreamName = str;
    }

    public void setRecords(Collection<Record> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getDeliveryStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("DeliveryStreamName: ");
            k2.append(getDeliveryStreamName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getRecords() != null) {
            StringBuilder k3 = C13555b.m33972k("Records: ");
            k3.append(getRecords());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordBatchRequest withDeliveryStreamName(String str) {
        this.deliveryStreamName = str;
        return this;
    }

    public PutRecordBatchRequest withRecords(Record... recordArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(recordArr.length);
        }
        for (Record add : recordArr) {
            this.records.add(add);
        }
        return this;
    }

    public PutRecordBatchRequest withRecords(Collection<Record> collection) {
        setRecords(collection);
        return this;
    }
}
