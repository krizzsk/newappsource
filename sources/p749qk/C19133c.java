package p749qk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: qk.c */
public final class C19133c {

    /* renamed from: a */
    public final List<C19132b> f48652a;

    public C19133c(ArrayList arrayList) {
        this.f48652a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19133c.class != obj.getClass()) {
            return false;
        }
        return this.f48652a.equals(((C19133c) obj).f48652a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48652a});
    }
}
