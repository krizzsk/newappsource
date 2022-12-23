package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import p173ma.C5754v;

public abstract class TagPayloadReader {

    /* renamed from: a */
    public final C5754v f13745a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(C5754v vVar) {
        this.f13745a = vVar;
    }
}
