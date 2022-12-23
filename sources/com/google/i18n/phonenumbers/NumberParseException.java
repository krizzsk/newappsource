package com.google.i18n.phonenumbers;

public class NumberParseException extends Exception {
    private ErrorType errorType;
    private String message;

    public enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(ErrorType errorType2, String str) {
        super(str);
        this.message = str;
        this.errorType = errorType2;
    }

    /* renamed from: a */
    public final ErrorType mo43750a() {
        return this.errorType;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Error type: ");
        k.append(this.errorType);
        k.append(". ");
        k.append(this.message);
        return k.toString();
    }
}
