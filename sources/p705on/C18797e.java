package p705on;

import java.util.Objects;

/* renamed from: on.e */
public final class C18797e {

    /* renamed from: a */
    public final String f47856a;

    /* renamed from: b */
    public final String f47857b;

    public C18797e(String str, String str2) {
        this.f47856a = str;
        this.f47857b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18797e.class != obj.getClass()) {
            return false;
        }
        C18797e eVar = (C18797e) obj;
        if (!Objects.equals(this.f47856a, eVar.f47856a) || !Objects.equals(this.f47857b, eVar.f47857b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47856a, this.f47857b});
    }
}
