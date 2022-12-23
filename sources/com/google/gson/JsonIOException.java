package com.google.gson;

public final class JsonIOException extends JsonParseException {
    private static final long serialVersionUID = 1;

    public JsonIOException(String str) {
        super(str);
    }

    public JsonIOException(String str, SecurityException securityException) {
        super(str, securityException);
    }

    public JsonIOException(Exception exc) {
        super(exc);
    }
}
