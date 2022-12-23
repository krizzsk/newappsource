package p586jn;

import java.util.Objects;

/* renamed from: jn.d */
public final class C17898d {

    /* renamed from: a */
    public final C17900f f45930a;

    /* renamed from: b */
    public final boolean f45931b;

    public C17898d(C17900f fVar) {
        boolean z;
        this.f45930a = fVar;
        if (fVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f45931b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17898d.class != obj.getClass()) {
            return false;
        }
        C17898d dVar = (C17898d) obj;
        if (this.f45931b != dVar.f45931b || !Objects.equals(this.f45930a, dVar.f45930a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f45930a, Boolean.valueOf(this.f45931b)});
    }
}
