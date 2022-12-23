package com.veriff.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/AndroidFileResolver;", "Lmobi/lab/veriff/util/files/FileResolver;", "context", "Landroid/content/Context;", "fileStorage", "Lcom/veriff/sdk/internal/upload/FileStorage;", "(Landroid/content/Context;Lcom/veriff/sdk/internal/upload/FileStorage;)V", "getType", "", "uri", "Landroid/net/Uri;", "saveAsFile", "Ljava/io/File;", "fileName", "maxFileSizeMB", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xe */
public final class C22681xe implements C22682xf {

    /* renamed from: a */
    private final Context f57334a;

    /* renamed from: b */
    private final C22036mr f57335b;

    public C22681xe(Context context, C22036mr mrVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(mrVar, "fileStorage");
        this.f57334a = context;
        this.f57335b = mrVar;
    }

    /* renamed from: a */
    public String mo57067a(Uri uri) {
        C24362h.m61211f(uri, "uri");
        return this.f57334a.getContentResolver().getType(uri);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        p584jl.C17885a.m44462t(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo57066a(android.net.Uri r4, java.lang.String r5, int r6) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "uri"
            mf0.C24362h.m61211f(r4, r0)
            java.lang.String r0 = "fileName"
            mf0.C24362h.m61211f(r5, r0)
            boolean r0 = com.veriff.sdk.camera.core.impl.utils.Threads.isBackgroundThread()
            if (r0 == 0) goto L_0x0038
            r0 = 0
            android.content.Context r1 = r3.f57334a     // Catch:{ FileNotFoundException -> 0x0037 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0037 }
            java.io.InputStream r4 = r1.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x0037 }
            if (r4 == 0) goto L_0x0037
            com.veriff.sdk.internal.mr r1 = r3.f57335b     // Catch:{ all -> 0x0030 }
            com.veriff.sdk.internal.mz r2 = new com.veriff.sdk.internal.mz     // Catch:{ all -> 0x0030 }
            int r6 = r6 * 1024
            int r6 = r6 * 1024
            r2.<init>(r4, r6)     // Catch:{ all -> 0x0030 }
            java.io.File r5 = r1.mo55865a(r2, r5)     // Catch:{ all -> 0x0030 }
            p584jl.C17885a.m44462t(r4, r0)     // Catch:{ FileNotFoundException -> 0x0037 }
            return r5
        L_0x0030:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r6 = move-exception
            p584jl.C17885a.m44462t(r4, r5)     // Catch:{ FileNotFoundException -> 0x0037 }
            throw r6     // Catch:{ FileNotFoundException -> 0x0037 }
        L_0x0037:
            return r0
        L_0x0038:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "saveAsFile should be called from main thread"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22681xe.mo57066a(android.net.Uri, java.lang.String, int):java.io.File");
    }
}
