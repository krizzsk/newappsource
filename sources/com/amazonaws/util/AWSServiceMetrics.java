package com.amazonaws.util;

import com.amazonaws.metrics.ServiceMetricType;

@Deprecated
public enum AWSServiceMetrics implements ServiceMetricType {
    HttpClientGetConnectionTime("HttpClient");
    
    private final String serviceName;

    private AWSServiceMetrics(String str) {
        this.serviceName = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }
}
