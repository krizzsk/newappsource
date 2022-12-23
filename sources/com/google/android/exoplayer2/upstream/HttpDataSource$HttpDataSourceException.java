package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import p265tb.C6657i;

public class HttpDataSource$HttpDataSourceException extends IOException {
    public final C6657i dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(String str, C6657i iVar) {
        super(str);
        this.dataSpec = iVar;
        this.type = 1;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, C6657i iVar, int i) {
        super(iOException);
        this.dataSpec = iVar;
        this.type = i;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, C6657i iVar) {
        super(str, iOException);
        this.dataSpec = iVar;
        this.type = 1;
    }
}
