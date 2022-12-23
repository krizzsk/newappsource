package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderException;

public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String str) {
        super(str);
    }

    public SubtitleDecoderException(ParserException parserException) {
        super(parserException);
    }

    public SubtitleDecoderException(String str, Throwable th) {
        super(str, th);
    }
}
