package p290vb;

import java.util.Arrays;

/* renamed from: vb.b */
public final class C6933b {

    /* renamed from: a */
    public C6934a f21605a = new C6934a();

    /* renamed from: b */
    public C6934a f21606b = new C6934a();

    /* renamed from: c */
    public boolean f21607c;

    /* renamed from: d */
    public long f21608d = -9223372036854775807L;

    /* renamed from: e */
    public int f21609e;

    /* renamed from: vb.b$a */
    public static final class C6934a {

        /* renamed from: a */
        public long f21610a;

        /* renamed from: b */
        public long f21611b;

        /* renamed from: c */
        public long f21612c;

        /* renamed from: d */
        public long f21613d;

        /* renamed from: e */
        public long f21614e;

        /* renamed from: f */
        public long f21615f;

        /* renamed from: g */
        public final boolean[] f21616g = new boolean[15];

        /* renamed from: h */
        public int f21617h;

        /* renamed from: a */
        public final boolean mo23171a() {
            return this.f21613d > 15 && this.f21617h == 0;
        }

        /* renamed from: b */
        public final void mo23172b(long j) {
            long j2 = this.f21613d;
            if (j2 == 0) {
                this.f21610a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f21610a;
                this.f21611b = j3;
                this.f21615f = j3;
                this.f21614e = 1;
            } else {
                long j4 = j - this.f21612c;
                int i = (int) (j2 % 15);
                if (Math.abs(j4 - this.f21611b) <= 1000000) {
                    this.f21614e++;
                    this.f21615f += j4;
                    boolean[] zArr = this.f21616g;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f21617h--;
                    }
                } else {
                    boolean[] zArr2 = this.f21616g;
                    if (!zArr2[i]) {
                        zArr2[i] = true;
                        this.f21617h++;
                    }
                }
            }
            this.f21613d++;
            this.f21612c = j;
        }

        /* renamed from: c */
        public final void mo23173c() {
            this.f21613d = 0;
            this.f21614e = 0;
            this.f21615f = 0;
            this.f21617h = 0;
            Arrays.fill(this.f21616g, false);
        }
    }

    /* renamed from: a */
    public final boolean mo23170a() {
        return this.f21605a.mo23171a();
    }
}
