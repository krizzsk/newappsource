package com.masabi.justride.sdk.helpers;

public class ColourTransformerException extends Exception {
    public ColourTransformerException(String str) {
        super(str);
    }

    public ColourTransformerException(String str, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
    }
}
