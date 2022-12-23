package com.masabi.justride.sdk.jobs.network.eta;

import com.masabi.justride.sdk.internal.models.network.HttpMethod;

public enum ETAEndpoint {
    GET_BALANCE("sva", "v1", "balance", r6),
    GET_BARCODE("account", "v1", "barcode", r6),
    ENROL_BARCODE("account", "v1", "barcode", HttpMethod.POST),
    GET_TOKENS("account", "v1", "tokens", r6),
    ASSOCIATE_SMART_CARD_V1("account", "v1", "associatesmartcard", r24),
    ASSOCIATE_SMART_CARD_V2("account", "v2", "associatesmartcard", r24);
    
    private final String apiVersion;
    private final HttpMethod httpMethod;
    private final String identifierType;
    private final String path;

    private ETAEndpoint(String str, String str2, String str3, HttpMethod httpMethod2) {
        this.identifierType = str;
        this.apiVersion = str2;
        this.path = str3;
        this.httpMethod = httpMethod2;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public String getIdentifierType() {
        return this.identifierType;
    }

    public String getPath() {
        return this.path;
    }
}
