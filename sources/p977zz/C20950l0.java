package p977zz;

import ce0.C21100e;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.lang.Comparable;
import p583jk.C17884p;

/* renamed from: zz.l0 */
public final class C20950l0<T extends Comparable<T>> {

    /* renamed from: a */
    public final T f52695a;

    /* renamed from: b */
    public final T f52696b;

    public C20950l0(T t, T t2) {
        C21100e.m49373x(t, "min");
        this.f52695a = t;
        C21100e.m49373x(t2, InneractiveMediationNameConsts.MAX);
        this.f52696b = t2;
    }

    /* renamed from: a */
    public final boolean mo53020a(Integer num) {
        if (num.compareTo(this.f52695a) < 0 || num.compareTo(this.f52696b) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo53021b(T t) {
        if (t.compareTo(this.f52695a) < 0 || t.compareTo(this.f52696b) > 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20950l0)) {
            return false;
        }
        C20950l0 l0Var = (C20950l0) obj;
        if (!C20975x0.m49118e(l0Var.f52695a, this.f52695a) || !C20975x0.m49118e(l0Var.f52696b, this.f52696b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52695a), C17884p.m44335F(this.f52696b));
    }
}
