package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/Strings;", "", "intro", "", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "(Ljava/util/List;)V", "getIntro", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.vc */
public final class C22613vc {

    /* renamed from: a */
    private final List<C22614vd> f57036a;

    public C22613vc(List<C22614vd> list) {
        this.f57036a = list;
    }

    /* renamed from: a */
    public final List<C22614vd> mo56919a() {
        return this.f57036a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22613vc) && C24362h.m61206a(this.f57036a, ((C22613vc) obj).f57036a);
        }
        return true;
    }

    public int hashCode() {
        List<C22614vd> list = this.f57036a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Strings(intro=");
        k.append(this.f57036a);
        k.append(")");
        return k.toString();
    }
}
