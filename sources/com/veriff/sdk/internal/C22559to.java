package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/ErrorResponse;", "", "error", "", "deprecated", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getDeprecated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lmobi/lab/veriff/data/api/request/response/ErrorResponse;", "equals", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.to */
public final class C22559to {

    /* renamed from: a */
    private final String f56923a;

    /* renamed from: b */
    private final Boolean f56924b;

    public C22559to(String str, Boolean bool) {
        this.f56923a = str;
        this.f56924b = bool;
    }

    /* renamed from: a */
    public final String mo56751a() {
        return this.f56923a;
    }

    /* renamed from: b */
    public final Boolean mo56752b() {
        return this.f56924b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22559to)) {
            return false;
        }
        C22559to toVar = (C22559to) obj;
        return C24362h.m61206a(this.f56923a, toVar.f56923a) && C24362h.m61206a(this.f56924b, toVar.f56924b);
    }

    public int hashCode() {
        String str = this.f56923a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f56924b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ErrorResponse(error=");
        k.append(this.f56923a);
        k.append(", deprecated=");
        k.append(this.f56924b);
        k.append(")");
        return k.toString();
    }
}
