package p870vn;

import java.util.Objects;
import p586jn.C17898d;

/* renamed from: vn.h */
public final class C20168h implements C20163c {

    /* renamed from: a */
    public final C17898d f51177a;

    public C20168h(C17898d dVar) {
        this.f51177a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20168h.class != obj.getClass()) {
            return false;
        }
        return this.f51177a.equals(((C20168h) obj).f51177a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51177a});
    }
}
