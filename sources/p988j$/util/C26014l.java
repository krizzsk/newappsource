package p988j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l */
public final class C26014l {

    /* renamed from: c */
    private static final C26014l f64691c = new C26014l();

    /* renamed from: a */
    private final boolean f64692a;

    /* renamed from: b */
    private final long f64693b;

    private C26014l() {
        this.f64692a = false;
        this.f64693b = 0;
    }

    private C26014l(long j) {
        this.f64692a = true;
        this.f64693b = j;
    }

    /* renamed from: a */
    public static C26014l m64884a() {
        return f64691c;
    }

    /* renamed from: d */
    public static C26014l m64885d(long j) {
        return new C26014l(j);
    }

    /* renamed from: b */
    public final long mo84121b() {
        if (this.f64692a) {
            return this.f64693b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo84122c() {
        return this.f64692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26014l)) {
            return false;
        }
        C26014l lVar = (C26014l) obj;
        boolean z = this.f64692a;
        if (!z || !lVar.f64692a) {
            if (z == lVar.f64692a) {
                return true;
            }
        } else if (this.f64693b == lVar.f64693b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f64692a) {
            return 0;
        }
        long j = this.f64693b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.f64692a) {
            return "OptionalLong.empty";
        }
        return String.format("OptionalLong[%s]", new Object[]{Long.valueOf(this.f64693b)});
    }
}
