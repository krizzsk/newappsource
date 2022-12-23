package p870vn;

import java.util.Objects;
import p725pj.C18926a;
import p794sj.C19467d;

/* renamed from: vn.b */
public final class C20162b implements C20163c {

    /* renamed from: a */
    public final C18926a f51173a;

    public C20162b(C19467d dVar) {
        this.f51173a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20162b.class != obj.getClass()) {
            return false;
        }
        return this.f51173a.equals(((C20162b) obj).f51173a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51173a});
    }
}
