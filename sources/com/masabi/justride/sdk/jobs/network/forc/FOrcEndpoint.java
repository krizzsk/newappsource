package com.masabi.justride.sdk.jobs.network.forc;

import com.masabi.justride.sdk.internal.models.network.HttpMethod;

public enum FOrcEndpoint {
    PAYMENT_INSTRUMENTS("forc/public/paymentInstruments/v1", r1),
    PURCHASE_STORED_VALUE("forc/public/sva/purchase/v1", r4),
    PURCHASE_V1("forc/public/purchase/v1", r4),
    PURCHASE_V2("forc/public/purchase/v2", r4),
    REMOVE_TOKENIZED_CARD("mpg/public/savedTokens/v1", HttpMethod.DELETE),
    TOKENIZED_CARDS("forc/public/tokenizedcards/v1", r1),
    TOP_UP("forc/public/sva/topup/v1", r4),
    TOP_UP_INSTRUMENTS("forc/public/topupInstruments/v2", r1),
    TICKET_REFUND_DETAILS("forc/public/refund/self/details/v1", r1),
    TICKET_REFUND("forc/public/refund/self/v1", r4);
    
    private final HttpMethod httpMethod;
    private final String path;

    private FOrcEndpoint(String str, HttpMethod httpMethod2) {
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
