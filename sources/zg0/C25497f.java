package zg0;

import mf0.C24362h;
import ug0.C25065b;

/* renamed from: zg0.f */
public final class C25497f {

    /* renamed from: a */
    public final C25065b f63772a;

    /* renamed from: b */
    public final int f63773b;

    public C25497f(C25065b bVar, int i) {
        this.f63772a = bVar;
        this.f63773b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25497f)) {
            return false;
        }
        C25497f fVar = (C25497f) obj;
        return C24362h.m61206a(this.f63772a, fVar.f63772a) && this.f63773b == fVar.f63773b;
    }

    public final int hashCode() {
        return (this.f63772a.hashCode() * 31) + this.f63773b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f63773b;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            i3++;
            sb.append("kotlin/Array<");
        }
        sb.append(this.f63772a);
        int i4 = this.f63773b;
        while (i2 < i4) {
            i2++;
            sb.append(">");
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
