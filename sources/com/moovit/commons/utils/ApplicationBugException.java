package com.moovit.commons.utils;

public class ApplicationBugException extends RuntimeException {
    public ApplicationBugException() {
    }

    public ApplicationBugException(String str, Throwable th) {
        super(str, th);
    }

    public ApplicationBugException(String str) {
        super(str);
    }

    public ApplicationBugException(Exception exc) {
        super(exc);
    }
}
