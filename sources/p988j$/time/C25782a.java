package p988j$.time;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;
import p988j$.util.function.BiConsumer;

/* renamed from: j$.time.a */
public abstract /* synthetic */ class C25782a {
    /* renamed from: a */
    public static void m64406a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m64407b(C25841l lVar, C25842m mVar) {
        C25848s d = lVar.mo83602d(mVar);
        if (d.mo83794g()) {
            long g = lVar.mo83604g(mVar);
            if (d.mo83795h(g)) {
                return (int) g;
            }
            throw new C25784c("Invalid value for " + mVar + " (valid values " + d + "): " + g);
        }
        throw new C25847r("Invalid field " + mVar + " for get() method, use getLong() instead");
    }

    /* renamed from: c */
    public static Object m64408c(C25841l lVar, C25845p pVar) {
        if (pVar == C25844o.m64625g() || pVar == C25844o.m64619a() || pVar == C25844o.m64623e()) {
            return null;
        }
        return pVar.mo83672a(lVar);
    }

    /* renamed from: d */
    public static C25848s m64409d(C25841l lVar, C25842m mVar) {
        if (mVar instanceof C25830a) {
            if (lVar.mo83603f(mVar)) {
                return mVar.mo83772c();
            }
            throw new C25847r("Unsupported field: " + mVar);
        } else if (mVar != null) {
            return mVar.mo83771b(lVar);
        } else {
            throw new NullPointerException("field");
        }
    }

    /* renamed from: e */
    public static /* synthetic */ long m64410e(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* renamed from: f */
    public static /* synthetic */ long m64411f(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* renamed from: g */
    public static /* synthetic */ long m64412g(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z = true;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            boolean z2 = i >= 0;
            if (j2 == Long.MIN_VALUE) {
                z = false;
            }
            if (z2 || z) {
                long j3 = j * j2;
                if (i == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public static /* synthetic */ long m64413h(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }
}
