package p173ma;

import java.io.IOException;
import p173ma.C5750t;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ma.a */
public abstract class C5722a {

    /* renamed from: a */
    public final C5723a f18553a;

    /* renamed from: b */
    public final C5728f f18554b;

    /* renamed from: c */
    public C5725c f18555c;

    /* renamed from: d */
    public final int f18556d;

    /* renamed from: ma.a$a */
    public static class C5723a implements C5750t {

        /* renamed from: a */
        public final C5726d f18557a;

        /* renamed from: b */
        public final long f18558b;

        /* renamed from: c */
        public final long f18559c = 0;

        /* renamed from: d */
        public final long f18560d;

        /* renamed from: e */
        public final long f18561e;

        /* renamed from: f */
        public final long f18562f;

        /* renamed from: g */
        public final long f18563g;

        public C5723a(C5726d dVar, long j, long j2, long j3, long j4, long j5) {
            this.f18557a = dVar;
            this.f18558b = j;
            this.f18560d = j2;
            this.f18561e = j3;
            this.f18562f = j4;
            this.f18563g = j5;
        }

        /* renamed from: c */
        public final C5750t.C5751a mo21569c(long j) {
            C5753u uVar = new C5753u(j, C5725c.m14083a(this.f18557a.mo5857a(j), this.f18559c, this.f18560d, this.f18561e, this.f18562f, this.f18563g));
            return new C5750t.C5751a(uVar, uVar);
        }

        /* renamed from: e */
        public final boolean mo21570e() {
            return true;
        }

        /* renamed from: i */
        public final long mo21571i() {
            return this.f18558b;
        }
    }

    /* renamed from: ma.a$b */
    public static final class C5724b implements C5726d {
        /* renamed from: a */
        public final long mo5857a(long j) {
            return j;
        }
    }

    /* renamed from: ma.a$c */
    public static class C5725c {

        /* renamed from: a */
        public final long f18564a;

        /* renamed from: b */
        public final long f18565b;

        /* renamed from: c */
        public final long f18566c;

        /* renamed from: d */
        public long f18567d;

        /* renamed from: e */
        public long f18568e;

        /* renamed from: f */
        public long f18569f;

        /* renamed from: g */
        public long f18570g;

        /* renamed from: h */
        public long f18571h;

        public C5725c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f18564a = j;
            this.f18565b = j2;
            this.f18567d = j3;
            this.f18568e = j4;
            this.f18569f = j5;
            this.f18570g = j6;
            this.f18566c = j7;
            this.f18571h = m14083a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: a */
        public static long m14083a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C6774a0.m15948h(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* renamed from: ma.a$d */
    public interface C5726d {
        /* renamed from: a */
        long mo5857a(long j);
    }

    /* renamed from: ma.a$e */
    public static final class C5727e {

        /* renamed from: d */
        public static final C5727e f18572d = new C5727e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f18573a;

        /* renamed from: b */
        public final long f18574b;

        /* renamed from: c */
        public final long f18575c;

        public C5727e(int i, long j, long j2) {
            this.f18573a = i;
            this.f18574b = j;
            this.f18575c = j2;
        }

        /* renamed from: a */
        public static C5727e m14085a(long j) {
            return new C5727e(0, -9223372036854775807L, j);
        }
    }

    /* renamed from: ma.a$f */
    public interface C5728f {
        /* renamed from: a */
        C5727e mo21572a(C5732e eVar, long j) throws IOException;

        /* renamed from: b */
        void mo21573b();
    }

    public C5722a(C5726d dVar, C5728f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.f18554b = fVar;
        this.f18556d = i;
        this.f18553a = new C5723a(dVar, j, j2, j3, j4, j5);
    }

    /* renamed from: b */
    public static int m14076b(C5732e eVar, long j, C5749s sVar) {
        if (j == eVar.f18591d) {
            return 0;
        }
        sVar.f18624a = j;
        return 1;
    }

    /* renamed from: a */
    public final int mo21567a(C5732e eVar, C5749s sVar) throws IOException {
        boolean z;
        C5732e eVar2 = eVar;
        C5749s sVar2 = sVar;
        while (true) {
            C5725c cVar = this.f18555c;
            C17875h.m44306q(cVar);
            long j = cVar.f18569f;
            long j2 = cVar.f18570g;
            long j3 = cVar.f18571h;
            if (j2 - j <= ((long) this.f18556d)) {
                this.f18555c = null;
                this.f18554b.mo21573b();
                return m14076b(eVar2, j, sVar2);
            }
            long j4 = j3 - eVar2.f18591d;
            if (j4 < 0 || j4 > 262144) {
                z = false;
            } else {
                eVar2.mo21582i((int) j4);
                z = true;
            }
            if (!z) {
                return m14076b(eVar2, j3, sVar2);
            }
            eVar2.f18593f = 0;
            C5727e a = this.f18554b.mo21572a(eVar2, cVar.f18565b);
            int i = a.f18573a;
            if (i == -3) {
                this.f18555c = null;
                this.f18554b.mo21573b();
                return m14076b(eVar2, j3, sVar2);
            } else if (i == -2) {
                long j5 = a.f18574b;
                long j6 = a.f18575c;
                cVar.f18567d = j5;
                cVar.f18569f = j6;
                cVar.f18571h = C5725c.m14083a(cVar.f18565b, j5, cVar.f18568e, j6, cVar.f18570g, cVar.f18566c);
            } else if (i == -1) {
                long j7 = a.f18574b;
                long j8 = a.f18575c;
                cVar.f18568e = j7;
                cVar.f18570g = j8;
                cVar.f18571h = C5725c.m14083a(cVar.f18565b, cVar.f18567d, j7, cVar.f18569f, j8, cVar.f18566c);
            } else if (i == 0) {
                long j9 = a.f18575c - eVar2.f18591d;
                if (j9 >= 0 && j9 <= 262144) {
                    eVar2.mo21582i((int) j9);
                }
                this.f18555c = null;
                this.f18554b.mo21573b();
                return m14076b(eVar2, a.f18575c, sVar2);
            } else {
                throw new IllegalStateException("Invalid case");
            }
        }
    }

    /* renamed from: c */
    public final void mo21568c(long j) {
        long j2 = j;
        C5725c cVar = this.f18555c;
        if (cVar == null || cVar.f18564a != j2) {
            long a = this.f18553a.f18557a.mo5857a(j2);
            C5723a aVar = this.f18553a;
            C5725c cVar2 = r1;
            C5725c cVar3 = new C5725c(j, a, aVar.f18559c, aVar.f18560d, aVar.f18561e, aVar.f18562f, aVar.f18563g);
            this.f18555c = cVar2;
        }
    }
}
