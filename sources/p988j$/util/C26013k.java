package p988j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k */
public final class C26013k {

    /* renamed from: c */
    private static final C26013k f64688c = new C26013k();

    /* renamed from: a */
    private final boolean f64689a;

    /* renamed from: b */
    private final int f64690b;

    private C26013k() {
        this.f64689a = false;
        this.f64690b = 0;
    }

    private C26013k(int i) {
        this.f64689a = true;
        this.f64690b = i;
    }

    /* renamed from: a */
    public static C26013k m64880a() {
        return f64688c;
    }

    /* renamed from: d */
    public static C26013k m64881d(int i) {
        return new C26013k(i);
    }

    /* renamed from: b */
    public final int mo84116b() {
        if (this.f64689a) {
            return this.f64690b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo84117c() {
        return this.f64689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26013k)) {
            return false;
        }
        C26013k kVar = (C26013k) obj;
        boolean z = this.f64689a;
        if (!z || !kVar.f64689a) {
            if (z == kVar.f64689a) {
                return true;
            }
        } else if (this.f64690b == kVar.f64690b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f64689a) {
            return this.f64690b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f64689a) {
            return "OptionalInt.empty";
        }
        return String.format("OptionalInt[%s]", new Object[]{Integer.valueOf(this.f64690b)});
    }
}
