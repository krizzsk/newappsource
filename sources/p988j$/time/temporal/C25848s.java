package p988j$.time.temporal;

import java.io.Serializable;
import p988j$.time.C25784c;

/* renamed from: j$.time.temporal.s */
public final class C25848s implements Serializable {

    /* renamed from: a */
    private final long f64442a;

    /* renamed from: b */
    private final long f64443b;

    /* renamed from: c */
    private final long f64444c;

    /* renamed from: d */
    private final long f64445d;

    private C25848s(long j, long j2, long j3, long j4) {
        this.f64442a = j;
        this.f64443b = j2;
        this.f64444c = j3;
        this.f64445d = j4;
    }

    /* renamed from: c */
    private String m64628c(long j, C25842m mVar) {
        if (mVar != null) {
            return "Invalid value for " + mVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    /* renamed from: i */
    public static C25848s m64629i(long j, long j2) {
        if (j <= j2) {
            return new C25848s(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C25848s m64630j(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j3) {
            return new C25848s(j, 1, j2, j3);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: k */
    public static C25848s m64631k(long j, long j2) {
        return m64630j(1, j, j2);
    }

    /* renamed from: a */
    public final int mo83788a(long j, C25842m mVar) {
        if (mo83794g() && mo83795h(j)) {
            return (int) j;
        }
        throw new C25784c(m64628c(j, mVar));
    }

    /* renamed from: b */
    public final void mo83789b(long j, C25842m mVar) {
        if (!mo83795h(j)) {
            throw new C25784c(m64628c(j, mVar));
        }
    }

    /* renamed from: d */
    public final long mo83790d() {
        return this.f64445d;
    }

    /* renamed from: e */
    public final long mo83791e() {
        return this.f64442a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25848s)) {
            return false;
        }
        C25848s sVar = (C25848s) obj;
        return this.f64442a == sVar.f64442a && this.f64443b == sVar.f64443b && this.f64444c == sVar.f64444c && this.f64445d == sVar.f64445d;
    }

    /* renamed from: f */
    public final boolean mo83793f() {
        return this.f64442a == this.f64443b && this.f64444c == this.f64445d;
    }

    /* renamed from: g */
    public final boolean mo83794g() {
        return this.f64442a >= -2147483648L && this.f64445d <= 2147483647L;
    }

    /* renamed from: h */
    public final boolean mo83795h(long j) {
        return j >= this.f64442a && j <= this.f64445d;
    }

    public final int hashCode() {
        long j = this.f64442a;
        long j2 = this.f64443b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f64444c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f64445d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f64442a);
        if (this.f64442a != this.f64443b) {
            sb.append('/');
            sb.append(this.f64443b);
        }
        sb.append(" - ");
        sb.append(this.f64444c);
        if (this.f64444c != this.f64445d) {
            sb.append('/');
            sb.append(this.f64445d);
        }
        return sb.toString();
    }
}
