package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "", "media", "Lcom/veriff/sdk/internal/upload/Media;", "status", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "(Lcom/veriff/sdk/internal/upload/Media;Lcom/veriff/sdk/internal/upload/MediaUploadStatus;)V", "getMedia", "()Lcom/veriff/sdk/internal/upload/Media;", "getStatus", "()Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ng */
public final class C22060ng {

    /* renamed from: a */
    private final C22046na f55647a;

    /* renamed from: b */
    private final C22048nc f55648b;

    public C22060ng(C22046na naVar, C22048nc ncVar) {
        C24362h.m61211f(naVar, "media");
        C24362h.m61211f(ncVar, ServerParameters.STATUS);
        this.f55647a = naVar;
        this.f55648b = ncVar;
    }

    /* renamed from: a */
    public final C22046na mo55934a() {
        return this.f55647a;
    }

    /* renamed from: b */
    public final C22048nc mo55935b() {
        return this.f55648b;
    }

    /* renamed from: c */
    public final C22046na mo55936c() {
        return this.f55647a;
    }

    /* renamed from: d */
    public final C22048nc mo55937d() {
        return this.f55648b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22060ng)) {
            return false;
        }
        C22060ng ngVar = (C22060ng) obj;
        return C24362h.m61206a(this.f55647a, ngVar.f55647a) && C24362h.m61206a(this.f55648b, ngVar.f55648b);
    }

    public int hashCode() {
        C22046na naVar = this.f55647a;
        int i = 0;
        int hashCode = (naVar != null ? naVar.hashCode() : 0) * 31;
        C22048nc ncVar = this.f55648b;
        if (ncVar != null) {
            i = ncVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("MediaWithStatus(media=");
        k.append(this.f55647a);
        k.append(", status=");
        k.append(this.f55648b);
        k.append(")");
        return k.toString();
    }
}
