package vh0;

import com.appboy.Constants;
import kotlin.text.C24179b;
import kotlin.time.DurationUnit;
import mf0.C24362h;

/* renamed from: vh0.a */
public final class C25109a implements Comparable<C25109a> {

    /* renamed from: b */
    public static final long f63330b = Long.MAX_VALUE;

    /* renamed from: c */
    public static final long f63331c = -9223372036854775805L;

    /* renamed from: d */
    public static final /* synthetic */ int f63332d = 0;

    static {
        int i = C25110b.f63333a;
    }

    /* renamed from: a */
    public static final void m62915a(StringBuilder sb, int i, int i2, int i3, String str) {
        boolean z;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String R = C24179b.m60570R(String.valueOf(i2), i3);
            int i4 = -1;
            int length = R.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (R.charAt(length) != '0') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append(R, 0, i6);
            } else {
                sb.append(R, 0, ((i6 + 2) / 3) * 3);
            }
        }
        sb.append(str);
    }

    /* renamed from: b */
    public static final boolean m62916b(long j) {
        return j == f63330b || j == f63331c;
    }

    /* renamed from: c */
    public static final long m62917c(long j, DurationUnit durationUnit) {
        DurationUnit durationUnit2;
        C24362h.m61211f(durationUnit, "unit");
        if (j == f63330b) {
            return Long.MAX_VALUE;
        }
        if (j == f63331c) {
            return Long.MIN_VALUE;
        }
        boolean z = true;
        long j2 = j >> 1;
        if ((((int) j) & 1) != 0) {
            z = false;
        }
        if (z) {
            durationUnit2 = DurationUnit.NANOSECONDS;
        } else {
            durationUnit2 = DurationUnit.MILLISECONDS;
        }
        C24362h.m61211f(durationUnit2, "sourceUnit");
        return durationUnit.getTimeUnit$kotlin_stdlib().convert(j2, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    /* renamed from: d */
    public static String m62918d(long j) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        long j2;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        long j3 = j;
        int i6 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i6 == 0) {
            return "0s";
        }
        if (j3 == f63330b) {
            return "Infinity";
        }
        if (j3 == f63331c) {
            return "-Infinity";
        }
        if (i6 < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i6 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j3 = ((long) (((int) j3) & 1)) + ((-(j3 >> 1)) << 1);
            int i7 = C25110b.f63333a;
        }
        long c = m62917c(j3, DurationUnit.DAYS);
        if (m62916b(j3)) {
            i = 0;
        } else {
            i = (int) (m62917c(j3, DurationUnit.HOURS) % ((long) 24));
        }
        if (m62916b(j3)) {
            i2 = 0;
        } else {
            i2 = (int) (m62917c(j3, DurationUnit.MINUTES) % ((long) 60));
        }
        if (m62916b(j3)) {
            i3 = 0;
        } else {
            i3 = (int) (m62917c(j3, DurationUnit.SECONDS) % ((long) 60));
        }
        if (m62916b(j3)) {
            i4 = 0;
        } else {
            if ((((int) j3) & 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                j2 = ((j3 >> 1) % ((long) 1000)) * ((long) 1000000);
            } else {
                j2 = (j3 >> 1) % ((long) 1000000000);
            }
            i4 = (int) j2;
        }
        if (c != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i2 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (i3 == 0 && i4 == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z4) {
            sb.append(c);
            sb.append('d');
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i8 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append('h');
            i5 = i8;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i9 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('m');
            i5 = i9;
        }
        if (z7) {
            int i11 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            if (i3 != 0 || z4 || z5 || z6) {
                m62915a(sb, i3, i4, 9, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
            } else if (i4 >= 1000000) {
                m62915a(sb, i4 / 1000000, i4 % 1000000, 6, "ms");
            } else if (i4 >= 1000) {
                m62915a(sb, i4 / 1000, i4 % 1000, 3, "us");
            } else {
                sb.append(i4);
                sb.append("ns");
            }
            i5 = i11;
        }
        if (z && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final int compareTo(Object obj) {
        ((C25109a) obj).getClass();
        int i = ((int) 0) & 1;
        if (i == 0) {
            return 0;
        }
        return i - i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25109a)) {
            return false;
        }
        ((C25109a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (int) 0;
    }

    public final String toString() {
        return m62918d(0);
    }
}
