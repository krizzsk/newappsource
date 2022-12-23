package p654mk;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p819tk.C19687d;

/* renamed from: mk.m */
public final class C18391m extends C19687d {

    /* renamed from: d */
    public final List<C18390l> f46885d;

    public C18391m(ArrayList arrayList) {
        this.f46885d = C21100e.m49362r0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18391m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f46885d, ((C18391m) obj).f46885d);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46885d});
    }
}
