package com.masabi.justride.sdk.models.ticket;

public enum ValidationMethod {
    VISUAL,
    BARCODE,
    UNKNOWN;

    public static ValidationMethod parse(String str) {
        try {
            return (ValidationMethod) Enum.valueOf(ValidationMethod.class, str);
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }
}
