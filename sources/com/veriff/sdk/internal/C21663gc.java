package com.veriff.sdk.internal;

import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/CodecType;", "", "mime_type", "", "colors", "", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getColors", "()Ljava/util/Set;", "getMime_type", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gc */
public final class C21663gc {

    /* renamed from: a */
    private final String f54719a;

    /* renamed from: b */
    private final Set<Integer> f54720b;

    public C21663gc(String str, Set<Integer> set) {
        C24362h.m61211f(str, "mime_type");
        C24362h.m61211f(set, "colors");
        this.f54719a = str;
        this.f54720b = set;
    }

    /* renamed from: a */
    public final String mo54950a() {
        return this.f54719a;
    }

    /* renamed from: b */
    public final Set<Integer> mo54951b() {
        return this.f54720b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21663gc)) {
            return false;
        }
        C21663gc gcVar = (C21663gc) obj;
        return C24362h.m61206a(this.f54719a, gcVar.f54719a) && C24362h.m61206a(this.f54720b, gcVar.f54720b);
    }

    public int hashCode() {
        String str = this.f54719a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<Integer> set = this.f54720b;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("CodecType(mime_type=");
        k.append(this.f54719a);
        k.append(", colors=");
        k.append(this.f54720b);
        k.append(")");
        return k.toString();
    }
}
