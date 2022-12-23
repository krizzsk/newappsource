package p705on;

import java.util.Objects;

/* renamed from: on.o */
public final class C18809o {

    /* renamed from: a */
    public final long f47915a;

    public C18809o(long j) {
        this.f47915a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18809o.class == obj.getClass() && this.f47915a == ((C18809o) obj).f47915a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f47915a)});
    }
}
