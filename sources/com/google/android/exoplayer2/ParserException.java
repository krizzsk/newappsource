package com.google.android.exoplayer2;

import java.io.IOException;

public class ParserException extends IOException {
    public ParserException() {
    }

    public ParserException(String str) {
        super(str);
    }

    public ParserException(NumberFormatException numberFormatException) {
        super(numberFormatException);
    }

    public ParserException(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
    }
}
