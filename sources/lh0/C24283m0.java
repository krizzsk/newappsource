package lh0;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: lh0.m0 */
public abstract class C24283m0 implements C24281l0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24281l0)) {
            return false;
        }
        C24281l0 l0Var = (C24281l0) obj;
        if (mo60240a() == l0Var.mo60240a() && mo60241b() == l0Var.mo60241b() && getType().equals(l0Var.getType())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = mo60241b().hashCode();
        if (C24299r0.m60984p(getType())) {
            return (hashCode * 31) + 19;
        }
        int i2 = hashCode * 31;
        if (mo60240a()) {
            i = 17;
        } else {
            i = getType().hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        if (mo60240a()) {
            return "*";
        }
        if (mo60241b() == Variance.INVARIANT) {
            return getType().toString();
        }
        return mo60241b() + " " + getType();
    }
}
