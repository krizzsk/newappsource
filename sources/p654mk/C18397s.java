package p654mk;

import java.util.Objects;
import p819tk.C19687d;

/* renamed from: mk.s */
public final class C18397s extends C19687d {

    /* renamed from: d */
    public final C18390l f46900d;

    public C18397s(C18390l lVar) {
        this.f46900d = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18397s.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f46900d, ((C18397s) obj).f46900d);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46900d});
    }
}
