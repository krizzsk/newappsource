package p891wk;

import java.util.Map;
import java.util.Objects;
import mf0.C24361g;

/* renamed from: wk.e */
public final class C20350e {

    /* renamed from: a */
    public final Map<C20362q, C20365t> f51527a;

    public C20350e(Map<C20362q, C20365t> map) {
        this.f51527a = C24361g.m61133C(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20350e.class != obj.getClass()) {
            return false;
        }
        return this.f51527a.equals(((C20350e) obj).f51527a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51527a});
    }
}
