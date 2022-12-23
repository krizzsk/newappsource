package p798sn;

import ce0.C21100e;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* renamed from: sn.b */
public final class C19494b {

    /* renamed from: a */
    public final List<C19493a> f49582a;

    /* renamed from: b */
    public final List<C19493a> f49583b;

    /* renamed from: c */
    public final List<C19493a> f49584c;

    /* renamed from: d */
    public final List<C19493a> f49585d;

    /* renamed from: e */
    public final Date f49586e;

    public C19494b() {
        throw null;
    }

    public C19494b(List list, List list2, List list3, List list4, Date date) {
        this.f49582a = C21100e.m49306F(list);
        this.f49583b = C21100e.m49306F(list2);
        this.f49584c = C21100e.m49306F(list3);
        this.f49585d = C21100e.m49306F(list4);
        this.f49586e = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19494b.class != obj.getClass()) {
            return false;
        }
        C19494b bVar = (C19494b) obj;
        if (!this.f49582a.equals(bVar.f49582a) || !this.f49583b.equals(bVar.f49583b) || !this.f49584c.equals(bVar.f49584c) || !this.f49585d.equals(bVar.f49585d) || !this.f49586e.equals(bVar.f49586e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49582a, this.f49583b, this.f49584c, this.f49585d, this.f49586e});
    }
}
