package com.masabi.justride.sdk.error;

public class ConvertedErrorException extends Exception {
    private final int code;
    private final String domain;

    public ConvertedErrorException(int i, String str, String str2, ConvertedErrorException convertedErrorException) {
        super(str2, convertedErrorException);
        this.domain = str;
        this.code = i;
    }

    /* renamed from: a */
    public final int mo44333a() {
        return this.code;
    }

    /* renamed from: b */
    public final String mo44334b() {
        return this.domain;
    }
}
