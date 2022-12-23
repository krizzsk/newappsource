package com.amazonaws.metrics.internal;

import com.amazonaws.Request;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.SimpleThroughputMetricType;
import com.amazonaws.metrics.ThroughputMetricType;

public enum ServiceMetricTypeGuesser {
    ;

    public static ThroughputMetricType guessThroughputMetricType(Request<?> request, String str, String str2) {
        if (AwsSdkMetrics.isMetricsEnabled() && request.getOriginalRequest().getClass().getName().startsWith("com.amazonaws.services.s3")) {
            return new SimpleThroughputMetricType(C25541a.m63881k("S3", str), request.getServiceName(), C25541a.m63881k("S3", str2));
        }
        return null;
    }
}
