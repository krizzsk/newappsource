package ck0;

import hi0.C23529c0;
import hi0.C23533d0;

/* renamed from: ck0.r */
public final class C21267r<T> {

    /* renamed from: a */
    public final C23529c0 f53229a;

    /* renamed from: b */
    public final T f53230b;

    public C21267r(C23529c0 c0Var, Object obj) {
        this.f53229a = c0Var;
        this.f53230b = obj;
    }

    /* renamed from: a */
    public static C21267r m49929a(C23533d0 d0Var, C23529c0 c0Var) {
        if (!c0Var.mo58644v()) {
            return new C21267r(c0Var, (Object) null);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: b */
    public static <T> C21267r<T> m49930b(T t, C23529c0 c0Var) {
        if (c0Var.mo58644v()) {
            return new C21267r<>(c0Var, t);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f53229a.toString();
    }
}
