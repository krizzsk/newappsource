package p752qn;

import java.util.Objects;

/* renamed from: qn.e */
public final class C19147e {

    /* renamed from: a */
    public final String f48692a;

    /* renamed from: b */
    public final String f48693b;

    public C19147e(String str, String str2) {
        this.f48692a = str;
        this.f48693b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19147e.class != obj.getClass()) {
            return false;
        }
        C19147e eVar = (C19147e) obj;
        if (!this.f48692a.equals(eVar.f48692a) || !this.f48693b.equals(eVar.f48693b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48692a, this.f48693b});
    }
}
