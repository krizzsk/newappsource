package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: uk.b */
public final class C19919b {

    /* renamed from: a */
    public final List<String> f50589a;

    public C19919b(ArrayList arrayList) {
        this.f50589a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19919b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f50589a, ((C19919b) obj).f50589a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50589a});
    }
}
