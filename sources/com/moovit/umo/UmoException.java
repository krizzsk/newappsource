package com.moovit.umo;

public class UmoException extends RuntimeException {
    public UmoException() {
    }

    public UmoException(String str) {
        super(str);
    }

    public UmoException(Exception exc) {
        super(exc);
    }
}
