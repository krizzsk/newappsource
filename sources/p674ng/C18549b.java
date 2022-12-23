package p674ng;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;

/* renamed from: ng.b */
public final class C18549b {

    /* renamed from: a */
    public final int f47230a;

    /* renamed from: b */
    public final Executor f47231b = null;

    public /* synthetic */ C18549b(int i) {
        this.f47230a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18549b)) {
            return false;
        }
        C18549b bVar = (C18549b) obj;
        if (this.f47230a != bVar.f47230a || !Objects.equal(this.f47231b, bVar.f47231b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47230a), this.f47231b);
    }
}
