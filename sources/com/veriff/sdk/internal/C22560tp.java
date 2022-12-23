package com.veriff.sdk.internal;

import android.net.Uri;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/FeedbackImages;", "", "notOkUrl", "Landroid/net/Uri;", "okUrl", "(Landroid/net/Uri;Landroid/net/Uri;)V", "getNotOkUrl", "()Landroid/net/Uri;", "getOkUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tp */
public final class C22560tp {

    /* renamed from: a */
    private final Uri f56925a;

    /* renamed from: b */
    private final Uri f56926b;

    public C22560tp(Uri uri, Uri uri2) {
        C24362h.m61211f(uri, "notOkUrl");
        C24362h.m61211f(uri2, "okUrl");
        this.f56925a = uri;
        this.f56926b = uri2;
    }

    /* renamed from: a */
    public final Uri mo56756a() {
        return this.f56925a;
    }

    /* renamed from: b */
    public final Uri mo56757b() {
        return this.f56926b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22560tp)) {
            return false;
        }
        C22560tp tpVar = (C22560tp) obj;
        return C24362h.m61206a(this.f56925a, tpVar.f56925a) && C24362h.m61206a(this.f56926b, tpVar.f56926b);
    }

    public int hashCode() {
        Uri uri = this.f56925a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f56926b;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("FeedbackImages(notOkUrl=");
        k.append(this.f56925a);
        k.append(", okUrl=");
        k.append(this.f56926b);
        k.append(")");
        return k.toString();
    }
}
