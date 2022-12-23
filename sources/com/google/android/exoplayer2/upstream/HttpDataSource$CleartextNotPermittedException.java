package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import p265tb.C6657i;

public final class HttpDataSource$CleartextNotPermittedException extends HttpDataSource$HttpDataSourceException {
    public HttpDataSource$CleartextNotPermittedException(IOException iOException, C6657i iVar) {
        super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, iVar);
    }
}
