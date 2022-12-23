package p843uk;

import java.util.Objects;

/* renamed from: uk.l0 */
public final class C19942l0 {

    /* renamed from: a */
    public final String f50655a;

    public C19942l0(String str) {
        this.f50655a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19942l0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f50655a, ((C19942l0) obj).f50655a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50655a});
    }
}
