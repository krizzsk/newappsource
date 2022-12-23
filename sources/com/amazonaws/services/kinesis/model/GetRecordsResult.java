package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GetRecordsResult implements Serializable {
    private Long millisBehindLatest;
    private String nextShardIterator;
    private List<Record> records = new ArrayList();

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
        if (obj == null || !(obj instanceof GetRecordsResult)) {
            return false;
        }
        GetRecordsResult getRecordsResult = (GetRecordsResult) obj;
        if (getRecordsResult.getRecords() == null) {
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
        if (getRecordsResult.getRecords() != null && !getRecordsResult.getRecords().equals(getRecords())) {
            return false;
        }
        if (getRecordsResult.getNextShardIterator() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getNextShardIterator() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getRecordsResult.getNextShardIterator() != null && !getRecordsResult.getNextShardIterator().equals(getNextShardIterator())) {
            return false;
        }
        if (getRecordsResult.getMillisBehindLatest() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getMillisBehindLatest() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getRecordsResult.getMillisBehindLatest() == null || getRecordsResult.getMillisBehindLatest().equals(getMillisBehindLatest())) {
            return true;
        }
        return false;
    }

    public Long getMillisBehindLatest() {
        return this.millisBehindLatest;
    }

    public String getNextShardIterator() {
        return this.nextShardIterator;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getRecords() == null) {
            i = 0;
        } else {
            i = getRecords().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getNextShardIterator() == null) {
            i2 = 0;
        } else {
            i2 = getNextShardIterator().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getMillisBehindLatest() != null) {
            i3 = getMillisBehindLatest().hashCode();
        }
        return i5 + i3;
    }

    public void setMillisBehindLatest(Long l) {
        this.millisBehindLatest = l;
    }

    public void setNextShardIterator(String str) {
        this.nextShardIterator = str;
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
        if (getRecords() != null) {
            StringBuilder k2 = C13555b.m33972k("Records: ");
            k2.append(getRecords());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getNextShardIterator() != null) {
            StringBuilder k3 = C13555b.m33972k("NextShardIterator: ");
            k3.append(getNextShardIterator());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getMillisBehindLatest() != null) {
            StringBuilder k4 = C13555b.m33972k("MillisBehindLatest: ");
            k4.append(getMillisBehindLatest());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetRecordsResult withMillisBehindLatest(Long l) {
        this.millisBehindLatest = l;
        return this;
    }

    public GetRecordsResult withNextShardIterator(String str) {
        this.nextShardIterator = str;
        return this;
    }

    public GetRecordsResult withRecords(Record... recordArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(recordArr.length);
        }
        for (Record add : recordArr) {
            this.records.add(add);
        }
        return this;
    }

    public GetRecordsResult withRecords(Collection<Record> collection) {
        setRecords(collection);
        return this;
    }
}
