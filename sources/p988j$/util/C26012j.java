package p988j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.j */
public final class C26012j {

    /* renamed from: c */
    private static final C26012j f64685c = new C26012j();

    /* renamed from: a */
    private final boolean f64686a;

    /* renamed from: b */
    private final double f64687b;

    private C26012j() {
        this.f64686a = false;
        this.f64687b = Double.NaN;
    }

    private C26012j(double d) {
        this.f64686a = true;
        this.f64687b = d;
    }

    /* renamed from: a */
    public static C26012j m64876a() {
        return f64685c;
    }

    /* renamed from: d */
    public static C26012j m64877d(double d) {
        return new C26012j(d);
    }

    /* renamed from: b */
    public final double mo84111b() {
        if (this.f64686a) {
            return this.f64687b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo84112c() {
        return this.f64686a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26012j)) {
            return false;
        }
        C26012j jVar = (C26012j) obj;
        boolean z = this.f64686a;
        if (!z || !jVar.f64686a) {
            if (z == jVar.f64686a) {
                return true;
            }
        } else if (Double.compare(this.f64687b, jVar.f64687b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f64686a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f64687b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f64686a) {
            return "OptionalDouble.empty";
        }
        return String.format("OptionalDouble[%s]", new Object[]{Double.valueOf(this.f64687b)});
    }
}
