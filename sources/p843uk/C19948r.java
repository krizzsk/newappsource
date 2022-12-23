package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: uk.r */
public final class C19948r {

    /* renamed from: a */
    public final List<C19950t> f50681a;

    public C19948r(ArrayList arrayList) {
        this.f50681a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19948r.class != obj.getClass()) {
            return false;
        }
        return this.f50681a.equals(((C19948r) obj).f50681a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50681a});
    }
}
