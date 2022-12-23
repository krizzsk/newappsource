package com.google.gson;

import java.text.ParseException;

public final class JsonSyntaxException extends JsonParseException {
    private static final long serialVersionUID = 1;

    public JsonSyntaxException(String str) {
        super(str);
    }

    public JsonSyntaxException(String str, ParseException parseException) {
        super(str, parseException);
    }

    public JsonSyntaxException(Exception exc) {
        super(exc);
    }
}
