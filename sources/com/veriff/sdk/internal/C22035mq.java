package com.veriff.sdk.internal;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.File;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24450d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/AndroidMediaStorage;", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "context", "Landroid/content/Context;", "encryption", "Lmobi/lab/veriff/util/Encryption;", "(Landroid/content/Context;Lmobi/lab/veriff/util/Encryption;)V", "createFile", "Ljava/io/File;", "fileName", "", "saveFile", "bytes", "", "saveFileStream", "inputStream", "Ljava/io/InputStream;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mq */
public final class C22035mq implements C22047nb {

    /* renamed from: a */
    private final Context f55586a;

    /* renamed from: b */
    private final C24450d f55587b;

    public C22035mq(Context context, C24450d dVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(dVar, "encryption");
        this.f55586a = context;
        this.f55587b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        p584jl.C17885a.m44462t(r0, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo55864a(byte[] r3, java.lang.String r4) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "bytes"
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "fileName"
            mf0.C24362h.m61211f(r4, r0)
            java.io.File r4 = r2.mo55863a(r4)
            mobi.lab.veriff.util.d r0 = r2.f55587b
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r4)
            java.io.OutputStream r0 = r0.mo60665a((java.io.OutputStream) r1)
            r0.write(r3)     // Catch:{ all -> 0x0023 }
            bf0.d r3 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0023 }
            r3 = 0
            p584jl.C17885a.m44462t(r0, r3)
            return r4
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r4 = move-exception
            p584jl.C17885a.m44462t(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22035mq.mo55864a(byte[], java.lang.String):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        p584jl.C17885a.m44462t(r0, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo55862a(java.io.InputStream r3, java.lang.String r4) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "inputStream"
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "fileName"
            mf0.C24362h.m61211f(r4, r0)
            java.io.File r4 = r2.mo55863a(r4)
            mobi.lab.veriff.util.d r0 = r2.f55587b
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r4)
            java.io.OutputStream r0 = r0.mo60665a((java.io.OutputStream) r1)
            java.lang.String r1 = "outStream"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ all -> 0x0026 }
            r1 = 0
            p583jk.C17884p.m44377q(r3, r0)     // Catch:{ all -> 0x0026 }
            p584jl.C17885a.m44462t(r0, r1)
            return r4
        L_0x0026:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r4 = move-exception
            p584jl.C17885a.m44462t(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22035mq.mo55862a(java.io.InputStream, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    public File mo55863a(String str) {
        C24362h.m61211f(str, "fileName");
        File file = new File(this.f55586a.getFilesDir(), "veriff");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }
}
