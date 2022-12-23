package c40;

import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.Color;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: c40.b */
public final class C1778b {

    /* renamed from: a */
    public final Polygon f6248a;

    /* renamed from: b */
    public final List<Polygon> f6249b;

    /* renamed from: c */
    public final Color f6250c;

    /* renamed from: d */
    public final int f6251d;

    /* renamed from: e */
    public final int f6252e;

    public C1778b(Polylon polylon, ArrayList arrayList, Color color, int i, int i2) {
        this.f6248a = polylon;
        this.f6249b = arrayList;
        this.f6250c = color;
        this.f6251d = i;
        this.f6252e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778b)) {
            return false;
        }
        C1778b bVar = (C1778b) obj;
        if (!C20975x0.m49118e(this.f6248a, bVar.f6248a) || !C20975x0.m49118e(this.f6249b, bVar.f6249b) || !C20975x0.m49118e(this.f6250c, bVar.f6250c) || this.f6251d != bVar.f6251d || this.f6252e != bVar.f6252e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f6248a), C17884p.m44335F(this.f6249b), C17884p.m44335F(this.f6250c), this.f6251d, this.f6252e);
    }
}
