package p988j$.util.stream;

import p988j$.time.C25783b;
import p988j$.util.C25856D;
import p988j$.util.C25861I;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.r2 */
abstract class C26221r2 {
    /* renamed from: a */
    static long m65606a(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    static Spliterator m65607b(int i, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int[] iArr = C26211p2.f64989a;
        if (i != 0) {
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                return new C26222r3(spliterator, j, j4);
            }
            if (i2 == 2) {
                return new C26202n3((Spliterator.OfInt) spliterator, j, j4);
            }
            if (i2 == 3) {
                return new C26212p3((C25861I) spliterator, j, j4);
            }
            if (i2 == 4) {
                return new C26192l3((C25856D) spliterator, j, j4);
            }
            StringBuilder a = C25783b.m64414a("Unknown shape ");
            a.append(C25783b.m64415b(i));
            throw new IllegalStateException(a.toString());
        }
        throw null;
    }

    /* renamed from: c */
    static long m65608c(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1, Math.min(j - j2, j3));
        }
        return -1;
    }

    /* renamed from: d */
    private static int m65609d(long j) {
        return (j != -1 ? C26116V2.f64849u : 0) | C26116V2.f64848t;
    }

    /* renamed from: e */
    public static C26047F m65610e(C26143c cVar, long j, long j2) {
        if (j >= 0) {
            return new C26206o2(cVar, m65609d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: f */
    public static IntStream m65611f(C26143c cVar, long j, long j2) {
        if (j >= 0) {
            return new C26186k2(cVar, m65609d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: g */
    public static C26194m0 m65612g(C26143c cVar, long j, long j2) {
        if (j >= 0) {
            return new C26196m2(cVar, m65609d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: h */
    public static Stream m65613h(C26143c cVar, long j, long j2) {
        if (j >= 0) {
            return new C26176i2(cVar, m65609d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }
}
