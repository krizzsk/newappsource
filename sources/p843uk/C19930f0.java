package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: uk.f0 */
public final class C19930f0 {

    /* renamed from: a */
    public final String f50610a;

    /* renamed from: b */
    public final String f50611b;

    /* renamed from: c */
    public final List<C19954x> f50612c;

    /* renamed from: d */
    public final String f50613d;

    /* renamed from: e */
    public final String f50614e;

    public C19930f0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f50610a = str;
        this.f50611b = str2;
        this.f50612c = arrayList;
        this.f50613d = str3;
        this.f50614e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19930f0.class != obj.getClass()) {
            return false;
        }
        C19930f0 f0Var = (C19930f0) obj;
        if (!Objects.equals(this.f50610a, f0Var.f50610a) || !this.f50611b.equals(f0Var.f50611b) || !this.f50612c.equals(f0Var.f50612c) || !Objects.equals(this.f50613d, f0Var.f50613d) || !this.f50614e.equals(f0Var.f50614e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50610a, this.f50611b, this.f50612c, this.f50613d, this.f50614e});
    }
}
