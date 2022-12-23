package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/BrowserIdResponse;", "", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tj */
public final class C22552tj {

    /* renamed from: a */
    private final String f56909a;

    public C22552tj(String str) {
        this.f56909a = str;
    }

    /* renamed from: a */
    public final String mo56714a() {
        return this.f56909a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22552tj) && C24362h.m61206a(this.f56909a, ((C22552tj) obj).f56909a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f56909a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0016g.m31o(C13555b.m33972k("BrowserIdResponse(token="), this.f56909a, ")");
    }
}
