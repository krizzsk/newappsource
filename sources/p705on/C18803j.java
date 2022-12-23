package p705on;

import ce0.C21100e;
import java.util.List;
import java.util.Objects;
import p729pn.C18936a;

/* renamed from: on.j */
public final class C18803j {

    /* renamed from: a */
    public final boolean f47883a;

    /* renamed from: b */
    public final boolean f47884b;

    /* renamed from: c */
    public final boolean f47885c;

    /* renamed from: d */
    public final boolean f47886d;

    /* renamed from: e */
    public final List<C18793a> f47887e;
    @Deprecated

    /* renamed from: f */
    public final List<String> f47888f;

    /* renamed from: g */
    public final List<C18811q> f47889g;

    /* renamed from: h */
    public final C18936a f47890h;

    /* renamed from: i */
    public final C18809o f47891i;

    /* renamed from: j */
    public final C18797e f47892j;

    public C18803j(boolean z, boolean z2, boolean z3, boolean z4, List<C18793a> list, List<String> list2, List<C18811q> list3, C18936a aVar, C18809o oVar, C18797e eVar) {
        this.f47886d = z;
        this.f47883a = z2;
        this.f47884b = z3;
        this.f47885c = z4;
        this.f47887e = C21100e.m49306F(list);
        this.f47888f = C21100e.m49306F(list2);
        this.f47889g = C21100e.m49306F(list3);
        this.f47890h = aVar;
        this.f47891i = oVar;
        this.f47892j = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18803j.class != obj.getClass()) {
            return false;
        }
        C18803j jVar = (C18803j) obj;
        if (this.f47883a != jVar.f47883a || this.f47884b != jVar.f47884b || this.f47885c != jVar.f47885c || this.f47886d != jVar.f47886d || !this.f47887e.equals(jVar.f47887e) || !this.f47888f.equals(jVar.f47888f) || !this.f47889g.equals(jVar.f47889g) || !Objects.equals(this.f47890h, jVar.f47890h) || !Objects.equals(this.f47891i, jVar.f47891i) || !Objects.equals(this.f47892j, jVar.f47892j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f47883a), Boolean.valueOf(this.f47884b), Boolean.valueOf(this.f47885c), Boolean.valueOf(this.f47886d), this.f47887e, this.f47888f, this.f47889g, this.f47890h, this.f47891i, this.f47892j});
    }
}
