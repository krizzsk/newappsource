package com.cubic.umo.exception;

import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/exception/AuthenticationException;", "Lcom/cubic/umo/exception/SDKException;", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AuthenticationException extends SDKException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticationException(int i, String str) {
        super(i, str == null ? "Authentication failed" : str);
    }
}
