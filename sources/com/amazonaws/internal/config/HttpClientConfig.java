package com.amazonaws.internal.config;

public class HttpClientConfig {
    private final String serviceName;

    public HttpClientConfig(String str) {
        this.serviceName = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("serviceName: ");
        k.append(this.serviceName);
        return k.toString();
    }
}
