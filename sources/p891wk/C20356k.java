package p891wk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: wk.k */
public final class C20356k {

    /* renamed from: a */
    public final List<C20352g> f51560a;

    public C20356k(ArrayList arrayList) {
        this.f51560a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20356k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f51560a, ((C20356k) obj).f51560a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51560a});
    }
}
