package com.veriff.sdk.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSaver;", "", "fileWriter", "Lmobi/lab/veriff/util/files/FileWriter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "(Lmobi/lab/veriff/util/files/FileWriter;Lcom/veriff/sdk/internal/errors/ErrorReporter;)V", "save", "Ljava/io/File;", "inStream", "Ljava/io/InputStream;", "bytes", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xg */
public final class C22684xg {

    /* renamed from: a */
    private final C22692xk f57337a;

    /* renamed from: b */
    private final C21910kf f57338b;

    public C22684xg(C22692xk xkVar, C21910kf kfVar) {
        C24362h.m61211f(xkVar, "fileWriter");
        C24362h.m61211f(kfVar, "errorReporter");
        this.f57337a = xkVar;
        this.f57338b = kfVar;
    }

    /* renamed from: a */
    public final File mo57071a(InputStream inputStream) throws IOException {
        C24362h.m61211f(inputStream, "inStream");
        try {
            return this.f57337a.mo57077a(inputStream);
        } catch (IOException e) {
            this.f57338b.mo55690a(e, "FileSaver.save(inStream)", C21720gj.file_handling);
            C22685xh.f57339a.mo60705d("failed to write file input stream to file");
            throw e;
        }
    }
}
