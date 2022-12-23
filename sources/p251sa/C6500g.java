package p251sa;

import p173ma.C5750t;
import p173ma.C5753u;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: sa.g */
public final class C6500g implements C6497e {

    /* renamed from: a */
    public final long f20282a;

    /* renamed from: b */
    public final int f20283b;

    /* renamed from: c */
    public final long f20284c;

    /* renamed from: d */
    public final long f20285d;

    /* renamed from: e */
    public final long f20286e;

    /* renamed from: f */
    public final long[] f20287f;

    public C6500g(long j, int i, long j2, long j3, long[] jArr) {
        this.f20282a = j;
        this.f20283b = i;
        this.f20284c = j2;
        this.f20287f = jArr;
        this.f20285d = j3;
        this.f20286e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        double d;
        if (!mo21570e()) {
            C5753u uVar = new C5753u(0, this.f20282a + ((long) this.f20283b));
            return new C5750t.C5751a(uVar, uVar);
        }
        long h = C6774a0.m15948h(j, 0, this.f20284c);
        double d2 = (((double) h) * 100.0d) / ((double) this.f20284c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.f20287f;
                C17875h.m44306q(jArr);
                double d4 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                d3 = C16530d.m42010c(d, d4, d2 - ((double) i), d4);
            }
        }
        C5753u uVar2 = new C5753u(h, this.f20282a + C6774a0.m15948h(Math.round((d3 / 256.0d) * ((double) this.f20285d)), (long) this.f20283b, this.f20285d - 1));
        return new C5750t.C5751a(uVar2, uVar2);
    }

    /* renamed from: d */
    public final long mo22596d() {
        return this.f20286e;
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return this.f20287f != null;
    }

    /* renamed from: f */
    public final long mo22597f(long j) {
        long j2;
        double d;
        long j3 = j - this.f20282a;
        if (!mo21570e() || j3 <= ((long) this.f20283b)) {
            return 0;
        }
        long[] jArr = this.f20287f;
        C17875h.m44306q(jArr);
        double d2 = (((double) j3) * 256.0d) / ((double) this.f20285d);
        int e = C6774a0.m15945e(jArr, (long) d2, true);
        long j4 = this.f20284c;
        long j5 = (((long) e) * j4) / 100;
        long j6 = jArr[e];
        int i = e + 1;
        long j7 = (j4 * ((long) i)) / 100;
        if (e == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j6 == j2) {
            d = 0.0d;
        } else {
            d = (d2 - ((double) j6)) / ((double) (j2 - j6));
        }
        return Math.round(d * ((double) (j7 - j5))) + j5;
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f20284c;
    }
}
