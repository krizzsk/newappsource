package p654mk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p819tk.C19687d;

/* renamed from: mk.p */
public final class C18394p extends C19687d {

    /* renamed from: d */
    public final List<C18393o> f46895d;

    public C18394p(ArrayList arrayList) {
        this.f46895d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18394p.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f46895d, ((C18394p) obj).f46895d);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46895d});
    }
}
