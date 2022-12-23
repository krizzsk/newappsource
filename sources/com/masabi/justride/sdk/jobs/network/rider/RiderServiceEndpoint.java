package com.masabi.justride.sdk.jobs.network.rider;

import com.masabi.justride.sdk.internal.models.network.HttpMethod;

public enum RiderServiceEndpoint {
    EXTERNAL_AUTHENTICATION("mobile/account/loginWithExternalToken", HttpMethod.POST);
    
    private final HttpMethod httpMethod;
    private final String path;

    private RiderServiceEndpoint(String str, HttpMethod httpMethod2) {
        this.path = str;
        this.httpMethod = httpMethod2;
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public String getPath() {
        return this.path;
    }
}
