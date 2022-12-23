package p988j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: j$.time.d */
public final class C25793d implements Comparable, Serializable {

    /* renamed from: c */
    public static final C25793d f64331c = new C25793d(0, 0);

    /* renamed from: a */
    private final long f64332a;

    /* renamed from: b */
    private final int f64333b;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private C25793d(long j, int i) {
        this.f64332a = j;
        this.f64333b = i;
    }

    /* renamed from: a */
    private static C25793d m64419a(long j, int i) {
        return (((long) i) | j) == 0 ? f64331c : new C25793d(j, i);
    }

    /* renamed from: c */
    public static C25793d m64420c(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m64419a(j2, i);
    }

    /* renamed from: d */
    public static C25793d m64421d() {
        return m64419a(C25782a.m64410e(Long.MAX_VALUE, C25782a.m64413h(999999999, 1000000000)), (int) C25782a.m64411f(999999999, 1000000000));
    }

    /* renamed from: e */
    public static C25793d m64422e(long j) {
        return m64419a(j, 0);
    }

    /* renamed from: b */
    public final long mo83660b() {
        return this.f64332a;
    }

    public final int compareTo(Object obj) {
        C25793d dVar = (C25793d) obj;
        int compare = Long.compare(this.f64332a, dVar.f64332a);
        return compare != 0 ? compare : this.f64333b - dVar.f64333b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25793d)) {
            return false;
        }
        C25793d dVar = (C25793d) obj;
        return this.f64332a == dVar.f64332a && this.f64333b == dVar.f64333b;
    }

    public final int hashCode() {
        long j = this.f64332a;
        return (this.f64333b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f64331c) {
            return "PT0S";
        }
        long j = this.f64332a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.f64333b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.f64333b <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.f64333b > 0) {
            int length = sb.length();
            sb.append(i2 < 0 ? 2000000000 - ((long) this.f64333b) : ((long) this.f64333b) + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
