package p843uk;

import java.util.Objects;

/* renamed from: uk.i0 */
public final class C19936i0 implements C19949s {

    /* renamed from: a */
    public final String f50629a;

    /* renamed from: b */
    public final String f50630b;

    public C19936i0(String str, String str2) {
        this.f50629a = str;
        this.f50630b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19936i0.class != obj.getClass()) {
            return false;
        }
        C19936i0 i0Var = (C19936i0) obj;
        if (!this.f50629a.equals(i0Var.f50629a) || !Objects.equals(this.f50630b, i0Var.f50630b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50629a, this.f50630b});
    }
}
