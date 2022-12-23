package p705on;

import java.util.Objects;

/* renamed from: on.p */
public final class C18810p {

    /* renamed from: a */
    public final String f47916a;

    /* renamed from: b */
    public final String f47917b;

    public C18810p(String str, String str2) {
        this.f47916a = str;
        this.f47917b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18810p.class != obj.getClass()) {
            return false;
        }
        C18810p pVar = (C18810p) obj;
        if (!Objects.equals(this.f47916a, pVar.f47916a) || !Objects.equals(this.f47917b, pVar.f47917b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47916a, this.f47917b});
    }
}
