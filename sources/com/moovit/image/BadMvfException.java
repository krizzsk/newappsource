package com.moovit.image;

import org.json.JSONException;

public final class BadMvfException extends RuntimeException {
    public BadMvfException(String str) {
        super(str);
    }

    public BadMvfException(IllegalArgumentException illegalArgumentException) {
        super(illegalArgumentException);
    }

    public BadMvfException(String str, JSONException jSONException) {
        super(str, jSONException);
    }
}
