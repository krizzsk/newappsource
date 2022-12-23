package p654mk;

import java.util.Objects;
import p819tk.C19686c;

/* renamed from: mk.g */
public final class C18385g extends C19686c {

    /* renamed from: b */
    public final C18386h f46863b;

    public C18385g(C18386h hVar) {
        this.f46863b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18385g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f46863b, ((C18385g) obj).f46863b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46863b});
    }
}
