package com.veriff.sdk.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/FileStorage;", "", "mediaStorage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "(Lcom/veriff/sdk/internal/upload/MediaStorage;Lcom/veriff/sdk/internal/errors/ErrorReporter;)V", "saveToFile", "Ljava/io/File;", "inStream", "Ljava/io/InputStream;", "fileName", "", "bytes", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mr */
public final class C22036mr {

    /* renamed from: a */
    private final C22047nb f55588a;

    /* renamed from: b */
    private final C21910kf f55589b;

    public C22036mr(C22047nb nbVar, C21910kf kfVar) {
        C24362h.m61211f(nbVar, "mediaStorage");
        C24362h.m61211f(kfVar, "errorReporter");
        this.f55588a = nbVar;
        this.f55589b = kfVar;
    }

    /* renamed from: a */
    public final File mo55865a(InputStream inputStream, String str) throws IOException {
        C24362h.m61211f(inputStream, "inStream");
        C24362h.m61211f(str, "fileName");
        return new C22684xg(new C22692xk(this.f55588a, str), this.f55589b).mo57071a(inputStream);
    }
}
