package pj0;

import nj0.C24541b;

/* renamed from: pj0.b */
public final class C24723b implements C24541b {

    /* renamed from: b */
    public final String f62588b;

    public C24723b(String str) {
        this.f62588b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24723b.class != obj.getClass() || !this.f62588b.equals(((C24723b) obj).f62588b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f62588b.hashCode();
    }
}
