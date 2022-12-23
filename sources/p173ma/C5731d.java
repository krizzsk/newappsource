package p173ma;

import p173ma.C5750t;
import p277ub.C6774a0;

/* renamed from: ma.d */
public class C5731d implements C5750t {

    /* renamed from: a */
    public final long f18582a;

    /* renamed from: b */
    public final long f18583b;

    /* renamed from: c */
    public final int f18584c;

    /* renamed from: d */
    public final long f18585d;

    /* renamed from: e */
    public final int f18586e;

    /* renamed from: f */
    public final long f18587f;

    public C5731d(int i, int i2, long j, long j2) {
        this.f18582a = j;
        this.f18583b = j2;
        this.f18584c = i2 == -1 ? 1 : i2;
        this.f18586e = i;
        if (j == -1) {
            this.f18585d = -1;
            this.f18587f = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.f18585d = j3;
        this.f18587f = ((Math.max(0, j3) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        long j2 = this.f18585d;
        if (j2 == -1) {
            C5753u uVar = new C5753u(0, this.f18583b);
            return new C5750t.C5751a(uVar, uVar);
        }
        long j3 = (long) this.f18584c;
        long h = C6774a0.m15948h((((((long) this.f18586e) * j) / 8000000) / j3) * j3, 0, j2 - j3);
        long j4 = this.f18583b;
        long j5 = h + j4;
        long max = ((Math.max(0, j5 - j4) * 8) * 1000000) / ((long) this.f18586e);
        C5753u uVar2 = new C5753u(max, j5);
        if (max < j) {
            long j6 = ((long) this.f18584c) + j5;
            if (j6 < this.f18582a) {
                return new C5750t.C5751a(uVar2, new C5753u(((Math.max(0, j6 - this.f18583b) * 8) * 1000000) / ((long) this.f18586e), j6));
            }
        }
        return new C5750t.C5751a(uVar2, uVar2);
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return this.f18585d != -1;
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f18587f;
    }
}
