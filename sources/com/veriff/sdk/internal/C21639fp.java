package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24457h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, mo59060d2 = {"Lcom/veriff/sdk/internal/SessionServices;", "", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "getAnalytics", "()Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "getApiService", "()Lmobi/lab/veriff/network/VeriffApi$ApiService;", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "detectorProvider", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "getDetectorProvider", "()Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "getErrorReporter", "()Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "getLanguageUtil", "()Lmobi/lab/veriff/util/LanguageUtil;", "Lcom/squareup/moshi/o;", "moshi", "Lcom/squareup/moshi/o;", "getMoshi", "()Lcom/squareup/moshi/o;", "Lcom/squareup/picasso/Picasso;", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "getUploadManager", "()Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "<init>", "(Lmobi/lab/veriff/network/VeriffApi$ApiService;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/views/autocapture/DetectorProvider;Lmobi/lab/veriff/util/LanguageUtil;Lcom/squareup/moshi/o;Lcom/squareup/picasso/Picasso;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.fp */
public final class C21639fp {

    /* renamed from: a */
    private final xb$a f54645a;

    /* renamed from: b */
    private final C21645fu f54646b;

    /* renamed from: c */
    private final C22064nk f54647c;

    /* renamed from: d */
    private final C21910kf f54648d;

    /* renamed from: e */
    private final C22199oh f54649e;

    /* renamed from: f */
    private final C24457h f54650f;

    /* renamed from: h */
    private final C21512ci f54651h;

    public C21639fp(xb$a xb_a, C21645fu fuVar, C22064nk nkVar, C21910kf kfVar, C22199oh ohVar, C24457h hVar, C21450bi biVar, C21512ci ciVar) {
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ohVar, "detectorProvider");
        C24362h.m61211f(hVar, "languageUtil");
        C24362h.m61211f(biVar, "moshi");
        C24362h.m61211f(ciVar, "picasso");
        this.f54645a = xb_a;
        this.f54646b = fuVar;
        this.f54647c = nkVar;
        this.f54648d = kfVar;
        this.f54649e = ohVar;
        this.f54650f = hVar;
        this.f54651h = ciVar;
    }

    /* renamed from: a */
    public final xb$a mo54907a() {
        return this.f54645a;
    }

    /* renamed from: b */
    public final C21645fu mo54908b() {
        return this.f54646b;
    }

    /* renamed from: c */
    public final C22064nk mo54909c() {
        return this.f54647c;
    }

    /* renamed from: d */
    public final C21910kf mo54910d() {
        return this.f54648d;
    }

    /* renamed from: e */
    public final C22199oh mo54911e() {
        return this.f54649e;
    }

    /* renamed from: f */
    public final C24457h mo54912f() {
        return this.f54650f;
    }

    /* renamed from: g */
    public final C21512ci mo54913g() {
        return this.f54651h;
    }
}
