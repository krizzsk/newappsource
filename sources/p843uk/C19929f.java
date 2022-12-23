package p843uk;

import p752qn.C19148f;
import p819tk.C19687d;

/* renamed from: uk.f */
public final class C19929f extends C19687d {

    /* renamed from: d */
    public final C19148f f50609d;

    public C19929f(C19148f fVar) {
        this.f50609d = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19929f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C19148f fVar = this.f50609d;
        C19148f fVar2 = ((C19929f) obj).f50609d;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        C19148f fVar = this.f50609d;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
