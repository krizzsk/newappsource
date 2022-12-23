package com.masabi.justride.sdk.jobs.network.broker;

import com.masabi.justride.sdk.internal.models.network.HttpMethod;

public enum BrokerEndpoint {
    ACCOUNT_CREATE("account/create", r1),
    ACCOUNT_LOGIN("account/login", r1),
    ACCOUNT_LOGIN_WITH_DEVICE_CHANGE("account/loginWithDeviceChange", r1),
    ACCOUNT_LOGOUT("account/logout", r1),
    ACCOUNT_PASSWORD_CHANGE("account/changePassword", r1),
    ACCOUNT_PASSWORD_RESET("account/sendReset", r1),
    CALCULATE_FEE("calculatefee", r1),
    CREATE_ENTITLEMENT("/entitlements/create", r1),
    DEVICE_INSTALL("device/install", r1),
    DEVICE_LOGIN("device/login", r1),
    ENTITLEMENTS("entitlements", r1),
    PRODUCT_LOOKUP("lookup/product", r1),
    PRODUCT_RESTRICTIONS("productRestrictions", r1),
    TICKET_RESEND_RECEIPT("sendReceipt", r1),
    TICKET_SYNC("synchTicketWallet", r1),
    TOKENS("tokens", r1),
    UPDATE_ENTITLEMENT("entitlements/update", r1);
    
    private final HttpMethod httpMethod;
    private final String path;

    private BrokerEndpoint(String str, HttpMethod httpMethod2) {
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
