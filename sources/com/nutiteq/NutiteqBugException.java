package com.nutiteq;

public class NutiteqBugException extends RuntimeException {
    public NutiteqBugException(String str, Throwable th) {
        super(str, th);
    }
}
