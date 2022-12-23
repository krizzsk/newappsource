package p946ys;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;

/* renamed from: ys.b */
public final class C20761b {

    /* renamed from: a */
    public final long f52382a;

    /* renamed from: b */
    public final String f52383b;

    /* renamed from: c */
    public final String f52384c;

    /* renamed from: d */
    public final List<C20760a> f52385d;

    /* renamed from: e */
    public final List<C20760a> f52386e;

    public C20761b(long j, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Long valueOf = Long.valueOf(j);
        C21100e.m49373x(valueOf, "sectionId");
        this.f52382a = valueOf.longValue();
        this.f52383b = str;
        this.f52384c = str2;
        this.f52385d = Collections.unmodifiableList(arrayList);
        this.f52386e = Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20761b) && this.f52382a == ((C20761b) obj).f52382a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44334E(this.f52382a);
    }
}
