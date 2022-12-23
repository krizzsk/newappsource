package com.cubic.umo.exception;

import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo59060d2 = {"Lcom/cubic/umo/exception/SDKException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "code", "I", "getCode", "()I", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public abstract class SDKException extends RuntimeException {
    private final int code;
    private final String message;

    public SDKException(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }
}
