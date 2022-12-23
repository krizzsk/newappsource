package p705on;

import java.util.Objects;

/* renamed from: on.q */
public final class C18811q {

    /* renamed from: a */
    public final String f47918a;

    /* renamed from: b */
    public final String f47919b;

    /* renamed from: c */
    public final String f47920c;

    /* renamed from: d */
    public final String f47921d;

    public C18811q(String str, String str2, String str3, String str4) {
        this.f47918a = str;
        this.f47919b = str2;
        this.f47920c = str3;
        this.f47921d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18811q.class != obj.getClass()) {
            return false;
        }
        C18811q qVar = (C18811q) obj;
        if (!this.f47918a.equals(qVar.f47918a) || !Objects.equals(this.f47919b, qVar.f47919b) || !this.f47920c.equals(qVar.f47920c) || !this.f47921d.equals(qVar.f47921d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47918a, this.f47919b, this.f47920c, this.f47921d});
    }
}
