package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: d */
    public static final FormatException f36908d;

    static {
        FormatException formatException = new FormatException();
        f36908d = formatException;
        formatException.setStackTrace(ReaderException.f36911c);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m36739a() {
        return ReaderException.f36910b ? new FormatException() : f36908d;
    }
}
