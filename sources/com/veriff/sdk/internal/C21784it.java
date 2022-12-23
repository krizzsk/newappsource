package com.veriff.sdk.internal;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016Rh\u0010\n\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \t*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \t**\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \t*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/AndroidAssetTranslatsionsLoader;", "Lcom/veriff/sdk/internal/data/TranslationsLoader;", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "language", "Lcom/veriff/sdk/TranslatedStrings;", "loadTranslations", "Lcom/squareup/moshi/k;", "", "", "kotlin.jvm.PlatformType", "adapter", "Lcom/squareup/moshi/k;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.it */
public final class C21784it implements C21899jy {

    /* renamed from: a */
    private final C21420av<Map<String, String>> f55124a;

    /* renamed from: b */
    private final Context f55125b;

    /* renamed from: c */
    private final C21910kf f55126c;

    public C21784it(Context context, C21910kf kfVar, C21450bi biVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(biVar, "moshi");
        this.f55125b = context;
        this.f55126c = kfVar;
        this.f55124a = biVar.mo54335a((Type) C21785iu.f55127a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        p584jl.C17885a.m44462t(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C21617ey mo55409a(mobi.lab.veriff.util.C24454g r11) {
        /*
            r10 = this;
            java.lang.String r0 = "language"
            mf0.C24362h.m61211f(r11, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "veriff/"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r11 = r11.mo60678c()
            r2.append(r11)
            java.lang.String r11 = ".json"
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r2 = 0
            android.content.Context r3 = r10.f55125b     // Catch:{ IOException -> 0x00ae }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x00ae }
            java.io.InputStream r3 = r3.open(r11)     // Catch:{ IOException -> 0x00ae }
            com.veriff.sdk.internal.aca r3 = com.veriff.sdk.internal.abr.m50514a((java.io.InputStream) r3)     // Catch:{ IOException -> 0x00ae }
            com.veriff.sdk.internal.abk r3 = com.veriff.sdk.internal.abr.m50508a((com.veriff.sdk.internal.aca) r3)     // Catch:{ IOException -> 0x00ae }
            com.veriff.sdk.internal.av<java.util.Map<java.lang.String, java.lang.String>> r4 = r10.f55124a     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r4.mo54222a((com.veriff.sdk.internal.abk) r3)     // Catch:{ all -> 0x00a7 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0090
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a7 }
            mobi.lab.veriff.util.j r7 = com.veriff.sdk.internal.C21785iu.f55128b     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r8.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = "Loaded file "
            r8.append(r9)     // Catch:{ all -> 0x00a7 }
            r8.append(r11)     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = " with "
            r8.append(r11)     // Catch:{ all -> 0x00a7 }
            int r11 = r4.size()     // Catch:{ all -> 0x00a7 }
            r8.append(r11)     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = " translations"
            r8.append(r11)     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = r8.toString()     // Catch:{ all -> 0x00a7 }
            r7.mo60705d(r11)     // Catch:{ all -> 0x00a7 }
            mobi.lab.veriff.util.j r11 = com.veriff.sdk.internal.C21785iu.f55128b     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r7.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = "Loading translations took "
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            long r5 = r5 - r0
            r7.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "ms"
            r7.append(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a7 }
            r11.mo60705d(r0)     // Catch:{ all -> 0x00a7 }
            com.veriff.sdk.internal.ey r11 = new com.veriff.sdk.internal.ey     // Catch:{ all -> 0x00a7 }
            r11.<init>(r4)     // Catch:{ all -> 0x00a7 }
            p584jl.C17885a.m44462t(r3, r2)     // Catch:{ IOException -> 0x00ae }
            return r11
        L_0x0090:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            r1.append(r11)     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = " load failed"
            r1.append(r11)     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r0.<init>(r11)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            p584jl.C17885a.m44462t(r3, r11)     // Catch:{ IOException -> 0x00ae }
            throw r0     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r11 = move-exception
            com.veriff.sdk.internal.kf r0 = r10.f55126c
            com.veriff.sdk.internal.gj r1 = com.veriff.sdk.internal.C21720gj.language_change
            java.lang.String r3 = "LanguageUtil"
            r0.mo55690a(r11, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21784it.mo55409a(mobi.lab.veriff.util.g):com.veriff.sdk.internal.ey");
    }
}
