package p752qn;

import java.util.Objects;

/* renamed from: qn.g */
public final class C19149g {

    /* renamed from: a */
    public final String f48696a;

    /* renamed from: b */
    public final C19148f f48697b;

    public C19149g(String str, C19148f fVar) {
        this.f48696a = str;
        this.f48697b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19149g.class != obj.getClass()) {
            return false;
        }
        C19149g gVar = (C19149g) obj;
        if (!Objects.equals(this.f48696a, gVar.f48696a) || !this.f48697b.equals(gVar.f48697b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48696a, this.f48697b});
    }
}
