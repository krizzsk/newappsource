package com.veriff.sdk.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileWriter;", "", "storage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "fileName", "", "(Lcom/veriff/sdk/internal/upload/MediaStorage;Ljava/lang/String;)V", "write", "Ljava/io/File;", "inStream", "Ljava/io/InputStream;", "bytes", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xk */
public final class C22692xk {

    /* renamed from: a */
    private final C22047nb f57344a;

    /* renamed from: b */
    private final String f57345b;

    public C22692xk(C22047nb nbVar, String str) {
        C24362h.m61211f(nbVar, "storage");
        C24362h.m61211f(str, "fileName");
        this.f57344a = nbVar;
        this.f57345b = str;
    }

    /* renamed from: a */
    public final File mo57077a(InputStream inputStream) throws IOException {
        C24362h.m61211f(inputStream, "inStream");
        if (!C21641fr.m52541b()) {
            return this.f57344a.mo55862a(inputStream, this.f57345b);
        }
        throw new IOException("Cant run write on main thread");
    }
}
