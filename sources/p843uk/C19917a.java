package p843uk;

import java.util.Objects;

/* renamed from: uk.a */
public final class C19917a {

    /* renamed from: a */
    public String f50568a;

    public C19917a(String str) {
        this.f50568a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19917a.class != obj.getClass()) {
            return false;
        }
        return this.f50568a.equals(((C19917a) obj).f50568a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50568a});
    }
}
