package com.masabi.justride.sdk.jobs.network.brand_data;

import com.masabi.justride.sdk.internal.models.network.HttpMethod;

public enum BrandDataEndpoint {
    STATIONS("stations", r1),
    FARE_BLOCKS("fareBlocks", r1);
    
    private final HttpMethod httpMethod;
    private final String path;

    private BrandDataEndpoint(String str, HttpMethod httpMethod2) {
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
