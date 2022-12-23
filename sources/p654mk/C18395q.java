package p654mk;

import java.util.Objects;
import p819tk.C19686c;

/* renamed from: mk.q */
public final class C18395q extends C19686c {

    /* renamed from: b */
    public final C18396r f46896b;

    public C18395q(C18396r rVar) {
        this.f46896b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18395q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f46896b, ((C18395q) obj).f46896b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46896b});
    }
}
