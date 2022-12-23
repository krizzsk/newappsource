package p678nk;

import java.util.Objects;

/* renamed from: nk.d */
public final class C18574d {

    /* renamed from: a */
    public final String f47277a;

    /* renamed from: b */
    public final String f47278b;

    /* renamed from: c */
    public final Long f47279c;

    /* renamed from: d */
    public final String f47280d;

    /* renamed from: e */
    public final String f47281e;

    public C18574d(String str, String str2, String str3, String str4, Long l) {
        this.f47277a = str;
        this.f47278b = str2;
        this.f47279c = l;
        this.f47280d = str3;
        this.f47281e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18574d.class != obj.getClass()) {
            return false;
        }
        C18574d dVar = (C18574d) obj;
        if (!this.f47277a.equals(dVar.f47277a) || !this.f47278b.equals(dVar.f47278b) || !this.f47279c.equals(dVar.f47279c) || !this.f47280d.equals(dVar.f47280d) || !this.f47281e.equals(dVar.f47281e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47277a, this.f47278b, this.f47279c, this.f47280d, this.f47281e});
    }
}
