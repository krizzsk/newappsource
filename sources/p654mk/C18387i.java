package p654mk;

import java.util.Objects;
import p819tk.C19687d;

/* renamed from: mk.i */
public final class C18387i extends C19687d {

    /* renamed from: d */
    public C18390l f46867d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18387i.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f46867d, ((C18387i) obj).f46867d);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46867d});
    }
}
