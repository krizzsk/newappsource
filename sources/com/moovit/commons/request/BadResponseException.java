package com.moovit.commons.request;

public class BadResponseException extends RuntimeException {
    public BadResponseException(String str, Throwable th) {
        super(str, th);
    }

    public BadResponseException(String str) {
        super(str);
    }

    public BadResponseException(Exception exc) {
        super(exc);
    }
}
