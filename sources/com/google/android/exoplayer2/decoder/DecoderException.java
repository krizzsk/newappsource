package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.ParserException;

public class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(ParserException parserException) {
        super(parserException);
    }

    public DecoderException(String str, Throwable th) {
        super(str, th);
    }
}
