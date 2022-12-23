package p771rk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: rk.b */
public final class C19283b {

    /* renamed from: a */
    public final List<C19282a> f49021a;

    /* renamed from: b */
    public final List<C19285d> f49022b;

    public C19283b(ArrayList arrayList, ArrayList arrayList2) {
        this.f49021a = arrayList;
        this.f49022b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19283b.class != obj.getClass()) {
            return false;
        }
        C19283b bVar = (C19283b) obj;
        if (!Objects.equals(this.f49021a, bVar.f49021a) || !Objects.equals(this.f49022b, bVar.f49022b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49021a, this.f49022b});
    }
}
