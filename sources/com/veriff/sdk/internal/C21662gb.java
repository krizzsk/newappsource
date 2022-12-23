package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/CodecInfo;", "", "name", "", "types", "", "Lcom/veriff/sdk/internal/analytics/CodecType;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gb */
public final class C21662gb {

    /* renamed from: a */
    private final String f54717a;

    /* renamed from: b */
    private final List<C21663gc> f54718b;

    public C21662gb(String str, List<C21663gc> list) {
        C24362h.m61211f(str, "name");
        C24362h.m61211f(list, "types");
        this.f54717a = str;
        this.f54718b = list;
    }

    /* renamed from: a */
    public final String mo54945a() {
        return this.f54717a;
    }

    /* renamed from: b */
    public final List<C21663gc> mo54946b() {
        return this.f54718b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21662gb)) {
            return false;
        }
        C21662gb gbVar = (C21662gb) obj;
        return C24362h.m61206a(this.f54717a, gbVar.f54717a) && C24362h.m61206a(this.f54718b, gbVar.f54718b);
    }

    public int hashCode() {
        String str = this.f54717a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C21663gc> list = this.f54718b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("CodecInfo(name=");
        k.append(this.f54717a);
        k.append(", types=");
        k.append(this.f54718b);
        k.append(")");
        return k.toString();
    }
}
