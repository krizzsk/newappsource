package p705on;

import java.util.Objects;

/* renamed from: on.h */
public final class C18800h {

    /* renamed from: a */
    public final String f47868a;

    /* renamed from: b */
    public final String f47869b;

    /* renamed from: c */
    public final Integer f47870c;

    /* renamed from: d */
    public final Integer f47871d;

    /* renamed from: e */
    public final Integer f47872e;

    public C18800h(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.f47868a = str;
        this.f47869b = str2;
        this.f47870c = num;
        this.f47871d = num2;
        this.f47872e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18800h.class != obj.getClass()) {
            return false;
        }
        C18800h hVar = (C18800h) obj;
        if (!this.f47868a.equals(hVar.f47868a) || !this.f47869b.equals(hVar.f47869b) || !this.f47870c.equals(hVar.f47870c) || !Objects.equals(this.f47871d, hVar.f47871d) || !Objects.equals(this.f47872e, hVar.f47872e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47868a, this.f47869b, this.f47870c, this.f47871d, this.f47872e});
    }
}
