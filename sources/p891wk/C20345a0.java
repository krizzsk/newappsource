package p891wk;

import java.util.Objects;

/* renamed from: wk.a0 */
public final class C20345a0 {

    /* renamed from: a */
    public Long f51514a;

    /* renamed from: b */
    public Long f51515b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20345a0.class != obj.getClass()) {
            return false;
        }
        C20345a0 a0Var = (C20345a0) obj;
        if (!Objects.equals(this.f51514a, a0Var.f51514a) || !Objects.equals(this.f51515b, a0Var.f51515b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51514a, this.f51515b});
    }
}
