package pg0;

import hg0.C23469i;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25448i0;

/* renamed from: pg0.i */
public final class C24705i {

    /* renamed from: a */
    public final C24307v f62548a;

    /* renamed from: b */
    public final C23469i f62549b;

    /* renamed from: c */
    public final C25448i0 f62550c;

    /* renamed from: d */
    public final boolean f62551d;

    public C24705i(C24307v vVar, C23469i iVar, C25448i0 i0Var, boolean z) {
        C24362h.m61211f(vVar, "type");
        this.f62548a = vVar;
        this.f62549b = iVar;
        this.f62550c = i0Var;
        this.f62551d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24705i)) {
            return false;
        }
        C24705i iVar = (C24705i) obj;
        return C24362h.m61206a(this.f62548a, iVar.f62548a) && C24362h.m61206a(this.f62549b, iVar.f62549b) && C24362h.m61206a(this.f62550c, iVar.f62550c) && this.f62551d == iVar.f62551d;
    }

    public final int hashCode() {
        int hashCode = this.f62548a.hashCode() * 31;
        C23469i iVar = this.f62549b;
        int i = 0;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C25448i0 i0Var = this.f62550c;
        if (i0Var != null) {
            i = i0Var.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f62551d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TypeAndDefaultQualifiers(type=");
        k.append(this.f62548a);
        k.append(", defaultQualifiers=");
        k.append(this.f62549b);
        k.append(", typeParameterForArgument=");
        k.append(this.f62550c);
        k.append(", isFromStarProjection=");
        return C13715c.m34247m(k, this.f62551d, ')');
    }
}
