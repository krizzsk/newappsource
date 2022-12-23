package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int i, String str, IOException iOException) {
        super(C16759e.m42350f(str, ", status code: ", i), iOException);
        this.statusCode = i;
    }

    public HttpException(int i) {
        this(i, "Http request failed", (IOException) null);
    }
}
