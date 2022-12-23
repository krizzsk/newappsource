package p843uk;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p705on.C18793a;
import p705on.C18809o;
import p705on.C18811q;
import p729pn.C18936a;

/* renamed from: uk.v */
public final class C19952v {

    /* renamed from: a */
    public final boolean f50705a;

    /* renamed from: b */
    public final boolean f50706b;

    /* renamed from: c */
    public final boolean f50707c;

    /* renamed from: d */
    public final boolean f50708d;

    /* renamed from: e */
    public final List<C18793a> f50709e;
    @Deprecated

    /* renamed from: f */
    public final List<String> f50710f;

    /* renamed from: g */
    public final List<C18811q> f50711g;

    /* renamed from: h */
    public final C18936a f50712h;

    /* renamed from: i */
    public final C18809o f50713i;

    /* renamed from: j */
    public final List<String> f50714j;

    /* renamed from: k */
    public final C19939k f50715k;

    /* renamed from: l */
    public final List<Object> f50716l;

    public C19952v(boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C18936a aVar, C18809o oVar, List list, C19939k kVar, ArrayList arrayList4) {
        this.f50708d = z;
        this.f50705a = z2;
        this.f50706b = z3;
        this.f50707c = z4;
        this.f50709e = C21100e.m49306F(arrayList);
        this.f50710f = C21100e.m49306F(arrayList2);
        this.f50711g = C21100e.m49306F(arrayList3);
        this.f50712h = aVar;
        this.f50713i = oVar;
        this.f50714j = C21100e.m49306F(list);
        this.f50715k = kVar;
        this.f50716l = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19952v.class != obj.getClass()) {
            return false;
        }
        C19952v vVar = (C19952v) obj;
        if (this.f50706b != vVar.f50706b || this.f50705a != vVar.f50705a || this.f50707c != vVar.f50707c || this.f50708d != vVar.f50708d || !this.f50709e.equals(vVar.f50709e) || !this.f50710f.equals(vVar.f50710f) || !this.f50711g.equals(vVar.f50711g) || !Objects.equals(this.f50712h, vVar.f50712h) || !Objects.equals(this.f50713i, vVar.f50713i) || !this.f50714j.equals(vVar.f50714j) || !Objects.equals(this.f50715k, vVar.f50715k) || !this.f50716l.equals(vVar.f50716l)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f50705a), Boolean.valueOf(this.f50706b), Boolean.valueOf(this.f50707c), Boolean.valueOf(this.f50708d), this.f50709e, this.f50710f, this.f50711g, this.f50712h, this.f50713i, this.f50714j, this.f50715k, this.f50716l});
    }
}
