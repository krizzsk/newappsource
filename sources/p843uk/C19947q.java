package p843uk;

import java.util.Objects;

/* renamed from: uk.q */
public final class C19947q {

    /* renamed from: a */
    public final Integer f50677a;

    /* renamed from: b */
    public final C19919b f50678b;

    /* renamed from: c */
    public final C19943m f50679c;

    /* renamed from: d */
    public final C19936i0 f50680d;

    public C19947q(Integer num, C19943m mVar, C19936i0 i0Var, C19919b bVar) {
        this.f50677a = num;
        this.f50679c = mVar;
        this.f50680d = i0Var;
        this.f50678b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19947q.class != obj.getClass()) {
            return false;
        }
        C19947q qVar = (C19947q) obj;
        if (!Objects.equals(this.f50677a, qVar.f50677a) || !Objects.equals(this.f50679c, qVar.f50679c) || !Objects.equals(this.f50680d, qVar.f50680d) || !Objects.equals(this.f50678b, qVar.f50678b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50677a, this.f50679c, this.f50680d, this.f50678b});
    }

    public C19947q(Integer num, C19943m mVar) {
        this.f50677a = num;
        this.f50679c = mVar;
        this.f50678b = null;
        this.f50680d = null;
    }

    public C19947q(Integer num, C19936i0 i0Var) {
        this.f50677a = num;
        this.f50678b = null;
        this.f50679c = null;
        this.f50680d = i0Var;
    }
}
