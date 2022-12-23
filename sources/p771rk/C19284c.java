package p771rk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: rk.c */
public final class C19284c {

    /* renamed from: a */
    public final String f49023a;

    /* renamed from: b */
    public final List<Integer> f49024b;

    public C19284c(String str, ArrayList arrayList) {
        this.f49023a = str;
        this.f49024b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19284c.class != obj.getClass()) {
            return false;
        }
        C19284c cVar = (C19284c) obj;
        if (!Objects.equals(this.f49023a, cVar.f49023a) || !Objects.equals(this.f49024b, cVar.f49024b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49023a, this.f49024b});
    }
}
