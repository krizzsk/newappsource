package p891wk;

import ce0.C21100e;
import java.util.List;
import java.util.Objects;

/* renamed from: wk.f */
public final class C20351f {

    /* renamed from: a */
    public final List<String> f51528a;

    /* renamed from: b */
    public final int f51529b;

    /* renamed from: c */
    public final String f51530c;

    /* renamed from: d */
    public final long f51531d;

    public C20351f() {
        throw null;
    }

    public C20351f(int i, long j, List list, String str) {
        this.f51528a = C21100e.m49306F(list);
        this.f51529b = i;
        this.f51530c = str;
        this.f51531d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20351f.class != obj.getClass()) {
            return false;
        }
        C20351f fVar = (C20351f) obj;
        if (this.f51529b != fVar.f51529b || this.f51531d != fVar.f51531d || !this.f51528a.equals(fVar.f51528a) || !Objects.equals(this.f51530c, fVar.f51530c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51528a, Integer.valueOf(this.f51529b), this.f51530c, Long.valueOf(this.f51531d)});
    }
}
