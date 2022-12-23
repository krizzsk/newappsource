package p843uk;

import java.util.Objects;
import p586jn.C17898d;

/* renamed from: uk.z */
public final class C19956z {

    /* renamed from: a */
    public final C19937j f50738a;

    /* renamed from: b */
    public final C17898d f50739b;

    /* renamed from: c */
    public final String f50740c;

    public C19956z(C19937j jVar, C17898d dVar, String str) {
        this.f50738a = jVar;
        this.f50739b = dVar;
        this.f50740c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19956z.class != obj.getClass()) {
            return false;
        }
        C19956z zVar = (C19956z) obj;
        if (!this.f50738a.equals(zVar.f50738a) || !this.f50739b.equals(zVar.f50739b) || !this.f50740c.equals(zVar.f50740c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50738a, this.f50739b, this.f50740c});
    }
}
