package p843uk;

import java.util.Objects;
import p705on.C18804k;

/* renamed from: uk.e0 */
public final class C19928e0 {

    /* renamed from: a */
    public final C19922c f50607a;

    /* renamed from: b */
    public final C18804k f50608b;

    public C19928e0(C19922c cVar, C18804k kVar) {
        this.f50607a = cVar;
        this.f50608b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19928e0.class != obj.getClass()) {
            return false;
        }
        C19928e0 e0Var = (C19928e0) obj;
        if (!this.f50607a.equals(e0Var.f50607a) || !Objects.equals(this.f50608b, e0Var.f50608b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50607a, this.f50608b});
    }
}
