package com.amazonaws.services.kinesis.model;

import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public enum MetricsName {
    IncomingBytes("IncomingBytes"),
    IncomingRecords("IncomingRecords"),
    OutgoingBytes("OutgoingBytes"),
    OutgoingRecords("OutgoingRecords"),
    WriteProvisionedThroughputExceeded("WriteProvisionedThroughputExceeded"),
    ReadProvisionedThroughputExceeded("ReadProvisionedThroughputExceeded"),
    IteratorAgeMilliseconds("IteratorAgeMilliseconds"),
    ALL("ALL");
    
    private static final Map<String, MetricsName> enumMap = null;
    private String value;

    /* access modifiers changed from: public */
    static {
        MetricsName metricsName;
        MetricsName metricsName2;
        MetricsName metricsName3;
        MetricsName metricsName4;
        MetricsName metricsName5;
        MetricsName metricsName6;
        MetricsName metricsName7;
        MetricsName metricsName8;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IncomingBytes", metricsName);
        hashMap.put("IncomingRecords", metricsName2);
        hashMap.put("OutgoingBytes", metricsName3);
        hashMap.put("OutgoingRecords", metricsName4);
        hashMap.put("WriteProvisionedThroughputExceeded", metricsName5);
        hashMap.put("ReadProvisionedThroughputExceeded", metricsName6);
        hashMap.put("IteratorAgeMilliseconds", metricsName7);
        hashMap.put("ALL", metricsName8);
    }

    private MetricsName(String str) {
        this.value = str;
    }

    public static MetricsName fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, MetricsName> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot create enum from ", str, " value!"));
    }

    public String toString() {
        return this.value;
    }
}
