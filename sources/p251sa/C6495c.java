package p251sa;

import android.util.Pair;
import p099ga.C4883f;
import p173ma.C5750t;
import p173ma.C5753u;
import p277ub.C6774a0;

/* renamed from: sa.c */
public final class C6495c implements C6497e {

    /* renamed from: a */
    public final long[] f20254a;

    /* renamed from: b */
    public final long[] f20255b;

    /* renamed from: c */
    public final long f20256c;

    public C6495c(long[] jArr, long[] jArr2, long j) {
        this.f20254a = jArr;
        this.f20255b = jArr2;
        this.f20256c = j == -9223372036854775807L ? C4883f.m12376a(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static Pair<Long, Long> m15390a(long j, long[] jArr, long[] jArr2) {
        double d;
        int e = C6774a0.m15945e(jArr, j, true);
        long j2 = jArr[e];
        long j3 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (((double) j) - ((double) j2)) / ((double) (j4 - j2));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3));
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        Pair<Long, Long> a = m15390a(C4883f.m12377b(C6774a0.m15948h(j, 0, this.f20256c)), this.f20255b, this.f20254a);
        C5753u uVar = new C5753u(C4883f.m12376a(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new C5750t.C5751a(uVar, uVar);
    }

    /* renamed from: d */
    public final long mo22596d() {
        return -1;
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: f */
    public final long mo22597f(long j) {
        return C4883f.m12376a(((Long) m15390a(j, this.f20254a, this.f20255b).second).longValue());
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f20256c;
    }
}
