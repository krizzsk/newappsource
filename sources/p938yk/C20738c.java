package p938yk;

import java.util.Objects;
import p819tk.C19687d;

/* renamed from: yk.c */
public final class C20738c extends C19687d {

    /* renamed from: d */
    public final C20739d f52337d;

    public C20738c(C20739d dVar) {
        this.f52337d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20738c.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f52337d, ((C20738c) obj).f52337d);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f52337d});
    }
}
