package com.usebutton.sdk.internal.core;

import com.usebutton.sdk.internal.api.HttpResponse;

public final class Response<T> {
    public static final String HEADER_REQUEST_ID = "X-Button-Request";
    private final HttpResponse httpResponse;
    private final T object;

    private Response(T t, HttpResponse httpResponse2) {
        this.object = t;
        this.httpResponse = httpResponse2;
    }

    public static <T> Response<T> success(T t, HttpResponse httpResponse2) {
        return new Response<>(t, httpResponse2);
    }

    public HttpResponse httpResponse() {
        return this.httpResponse;
    }

    public T object() {
        return this.object;
    }

    public String requestId() {
        return this.httpResponse.header(HEADER_REQUEST_ID);
    }
}
