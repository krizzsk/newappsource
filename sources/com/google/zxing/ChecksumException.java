package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: d */
    public static final ChecksumException f36907d;

    static {
        ChecksumException checksumException = new ChecksumException();
        f36907d = checksumException;
        checksumException.setStackTrace(ReaderException.f36911c);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m36738a() {
        return ReaderException.f36910b ? new ChecksumException() : f36907d;
    }
}
