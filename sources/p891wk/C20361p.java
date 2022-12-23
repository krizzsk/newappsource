package p891wk;

import java.util.Objects;

/* renamed from: wk.p */
public final class C20361p {

    /* renamed from: a */
    public final int f51576a;

    /* renamed from: b */
    public final boolean f51577b;

    /* renamed from: c */
    public final long f51578c;

    public C20361p(long j, int i, boolean z) {
        this.f51576a = i;
        this.f51577b = z;
        this.f51578c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20361p.class != obj.getClass()) {
            return false;
        }
        C20361p pVar = (C20361p) obj;
        if (this.f51576a == pVar.f51576a && this.f51577b == pVar.f51577b && this.f51578c == pVar.f51578c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f51576a), Boolean.valueOf(this.f51577b), Long.valueOf(this.f51578c)});
    }
}
