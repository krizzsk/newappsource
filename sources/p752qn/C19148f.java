package p752qn;

import java.util.Objects;

/* renamed from: qn.f */
public final class C19148f {

    /* renamed from: a */
    public final String f48694a;

    /* renamed from: b */
    public final Integer f48695b;

    public C19148f(String str, Integer num) {
        this.f48694a = str;
        this.f48695b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19148f.class != obj.getClass()) {
            return false;
        }
        C19148f fVar = (C19148f) obj;
        if (!this.f48694a.equals(fVar.f48694a) || !this.f48695b.equals(fVar.f48695b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48694a, this.f48695b});
    }
}
