package p891wk;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: wk.t */
public final class C20365t {

    /* renamed from: a */
    public final List<Long> f51636a;

    /* renamed from: b */
    public final List<C20363r> f51637b;

    /* renamed from: c */
    public final String f51638c;

    /* renamed from: d */
    public final String f51639d;

    /* renamed from: e */
    public final Integer f51640e;

    public C20365t(ArrayList arrayList, ArrayList arrayList2, String str, String str2, Integer num) {
        this.f51636a = C21100e.m49306F(arrayList);
        this.f51637b = C21100e.m49306F(arrayList2);
        this.f51638c = str;
        this.f51639d = str2;
        this.f51640e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20365t.class != obj.getClass()) {
            return false;
        }
        C20365t tVar = (C20365t) obj;
        if (!this.f51636a.equals(tVar.f51636a) || !this.f51637b.equals(tVar.f51637b) || !this.f51638c.equals(tVar.f51638c) || !this.f51639d.equals(tVar.f51639d) || !this.f51640e.equals(tVar.f51640e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51636a, this.f51637b, this.f51638c, this.f51639d, this.f51640e});
    }
}
