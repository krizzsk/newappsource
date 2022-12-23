package com.moovit.commons.request;

public abstract class ServerException extends Exception {
    public ServerException() {
    }

    public ServerException(String str) {
        super(str);
    }
}
