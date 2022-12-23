package p843uk;

import java.util.Objects;

/* renamed from: uk.g */
public final class C19931g {

    /* renamed from: a */
    public final String f50615a;

    /* renamed from: b */
    public final String f50616b;

    /* renamed from: c */
    public final String f50617c;

    /* renamed from: d */
    public final String f50618d;

    /* renamed from: e */
    public final String f50619e;

    public C19931g(String str, String str2, String str3, String str4, String str5) {
        this.f50615a = str;
        this.f50616b = str2;
        this.f50617c = str3;
        this.f50618d = str4;
        this.f50619e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19931g.class != obj.getClass()) {
            return false;
        }
        C19931g gVar = (C19931g) obj;
        if (!this.f50615a.equals(gVar.f50615a) || !this.f50616b.equals(gVar.f50616b) || !this.f50617c.equals(gVar.f50617c) || !this.f50618d.equals(gVar.f50618d) || !this.f50619e.equals(gVar.f50619e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50615a, this.f50616b, this.f50617c, this.f50618d, this.f50619e});
    }
}
