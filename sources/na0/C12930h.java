package na0;

import com.nutiteq.components.MapPos;

/* renamed from: na0.h */
public final class C12930h {

    /* renamed from: a */
    public double f32028a;

    /* renamed from: b */
    public double f32029b;

    /* renamed from: c */
    public double f32030c;

    public C12930h() {
        this.f32028a = 0.0d;
        this.f32029b = 0.0d;
        this.f32030c = 0.0d;
    }

    /* renamed from: a */
    public final void mo39797a(C12931i iVar) {
        this.f32028a += iVar.f32031a;
        this.f32029b += iVar.f32032b;
        this.f32030c += iVar.f32033c;
    }

    /* renamed from: b */
    public final void mo39798b(double d, double d2, double d3) {
        this.f32028a = d;
        this.f32029b = d2;
        this.f32030c = d3;
    }

    /* renamed from: c */
    public final void mo39799c(MapPos mapPos) {
        this.f32028a = mapPos.f24175b;
        this.f32029b = mapPos.f24176c;
        this.f32030c = mapPos.f24177d;
    }

    /* renamed from: d */
    public final void mo39800d(C12931i iVar) {
        this.f32028a -= iVar.f32031a;
        this.f32029b -= iVar.f32032b;
        this.f32030c -= iVar.f32033c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C12930h.class != obj.getClass()) {
            return false;
        }
        C12930h hVar = (C12930h) obj;
        if (this.f32028a == hVar.f32028a && this.f32029b == hVar.f32029b && this.f32030c == hVar.f32030c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MapPos [x=");
        k.append(this.f32028a);
        k.append(", y=");
        k.append(this.f32029b);
        k.append(", z=");
        k.append(this.f32030c);
        k.append("]");
        return k.toString();
    }

    public C12930h(double d, double d2) {
        this.f32028a = d;
        this.f32029b = d2;
        this.f32030c = 0.0d;
    }

    public C12930h(int i) {
        this.f32028a = 0.0d;
        this.f32029b = 0.0d;
        this.f32030c = 1.0d;
    }

    public C12930h(MapPos mapPos) {
        this.f32028a = mapPos.f24175b;
        this.f32029b = mapPos.f24176c;
        this.f32030c = mapPos.f24177d;
    }
}
