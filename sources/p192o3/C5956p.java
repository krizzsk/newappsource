package p192o3;

import androidx.work.BackoffPolicy;
import androidx.work.C1388b;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import p001a0.C0016g;
import p081f3.C4648b;
import p081f3.C4656h;

/* renamed from: o3.p */
public final class C5956p {

    /* renamed from: s */
    public static final /* synthetic */ int f19081s = 0;

    /* renamed from: a */
    public String f19082a;

    /* renamed from: b */
    public WorkInfo$State f19083b = WorkInfo$State.ENQUEUED;

    /* renamed from: c */
    public String f19084c;

    /* renamed from: d */
    public String f19085d;

    /* renamed from: e */
    public C1388b f19086e;

    /* renamed from: f */
    public C1388b f19087f;

    /* renamed from: g */
    public long f19088g;

    /* renamed from: h */
    public long f19089h;

    /* renamed from: i */
    public long f19090i;

    /* renamed from: j */
    public C4648b f19091j;

    /* renamed from: k */
    public int f19092k;

    /* renamed from: l */
    public BackoffPolicy f19093l;

    /* renamed from: m */
    public long f19094m;

    /* renamed from: n */
    public long f19095n;

    /* renamed from: o */
    public long f19096o;

    /* renamed from: p */
    public long f19097p;

    /* renamed from: q */
    public boolean f19098q;

    /* renamed from: r */
    public OutOfQuotaPolicy f19099r;

    /* renamed from: o3.p$a */
    public static class C5957a {

        /* renamed from: a */
        public String f19100a;

        /* renamed from: b */
        public WorkInfo$State f19101b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5957a)) {
                return false;
            }
            C5957a aVar = (C5957a) obj;
            if (this.f19101b != aVar.f19101b) {
                return false;
            }
            return this.f19100a.equals(aVar.f19100a);
        }

        public final int hashCode() {
            return this.f19101b.hashCode() + (this.f19100a.hashCode() * 31);
        }
    }

    static {
        C4656h.m11961e("WorkSpec");
    }

    public C5956p(String str, String str2) {
        C1388b bVar = C1388b.f5151b;
        this.f19086e = bVar;
        this.f19087f = bVar;
        this.f19091j = C4648b.f15876i;
        this.f19093l = BackoffPolicy.EXPONENTIAL;
        this.f19094m = 30000;
        this.f19097p = -1;
        this.f19099r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f19082a = str;
        this.f19084c = str2;
    }

    /* renamed from: a */
    public final long mo21934a() {
        boolean z;
        long j;
        long j2;
        long j3;
        boolean z2 = false;
        if (this.f19083b != WorkInfo$State.ENQUEUED || this.f19092k <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f19093l == BackoffPolicy.LINEAR) {
                z2 = true;
            }
            if (z2) {
                j3 = this.f19094m * ((long) this.f19092k);
            } else {
                j3 = (long) Math.scalb((float) this.f19094m, this.f19092k - 1);
            }
            j = this.f19095n;
            j2 = Math.min(18000000, j3);
        } else {
            long j4 = 0;
            if (mo21936c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j5 = this.f19095n;
                int i = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
                if (i == 0) {
                    j5 = this.f19088g + currentTimeMillis;
                }
                long j6 = this.f19090i;
                long j7 = this.f19089h;
                if (j6 != j7) {
                    z2 = true;
                }
                if (z2) {
                    if (i == 0) {
                        j4 = j6 * -1;
                    }
                    return j5 + j7 + j4;
                }
                if (i != 0) {
                    j4 = j7;
                }
                return j5 + j4;
            }
            j2 = this.f19095n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            j = this.f19088g;
        }
        return j2 + j;
    }

    /* renamed from: b */
    public final boolean mo21935b() {
        return !C4648b.f15876i.equals(this.f19091j);
    }

    /* renamed from: c */
    public final boolean mo21936c() {
        return this.f19089h != 0;
    }

    /* renamed from: d */
    public final void mo21937d(long j, long j2) {
        if (j < 900000) {
            C4656h c = C4656h.m11960c();
            String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L});
            c.mo20179f(new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            C4656h c2 = C4656h.m11960c();
            String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L});
            c2.mo20179f(new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            C4656h c3 = C4656h.m11960c();
            String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)});
            c3.mo20179f(new Throwable[0]);
            j2 = j;
        }
        this.f19089h = j;
        this.f19090i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5956p.class != obj.getClass()) {
            return false;
        }
        C5956p pVar = (C5956p) obj;
        if (this.f19088g != pVar.f19088g || this.f19089h != pVar.f19089h || this.f19090i != pVar.f19090i || this.f19092k != pVar.f19092k || this.f19094m != pVar.f19094m || this.f19095n != pVar.f19095n || this.f19096o != pVar.f19096o || this.f19097p != pVar.f19097p || this.f19098q != pVar.f19098q || !this.f19082a.equals(pVar.f19082a) || this.f19083b != pVar.f19083b || !this.f19084c.equals(pVar.f19084c)) {
            return false;
        }
        String str = this.f19085d;
        if (str == null ? pVar.f19085d != null : !str.equals(pVar.f19085d)) {
            return false;
        }
        if (this.f19086e.equals(pVar.f19086e) && this.f19087f.equals(pVar.f19087f) && this.f19091j.equals(pVar.f19091j) && this.f19093l == pVar.f19093l && this.f19099r == pVar.f19099r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f19083b.hashCode();
        int d = C13715c.m34238d(this.f19084c, (hashCode + (this.f19082a.hashCode() * 31)) * 31, 31);
        String str = this.f19085d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f19086e.hashCode();
        int hashCode3 = this.f19087f.hashCode();
        long j = this.f19088g;
        long j2 = this.f19089h;
        long j3 = this.f19090i;
        int hashCode4 = this.f19091j.hashCode();
        int hashCode5 = this.f19093l.hashCode();
        long j4 = this.f19094m;
        long j5 = this.f19095n;
        long j6 = this.f19096o;
        long j7 = this.f19097p;
        return this.f19099r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((d + i) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f19092k) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f19098q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return C0016g.m31o(C13555b.m33972k("{WorkSpec: "), this.f19082a, "}");
    }

    public C5956p(C5956p pVar) {
        C1388b bVar = C1388b.f5151b;
        this.f19086e = bVar;
        this.f19087f = bVar;
        this.f19091j = C4648b.f15876i;
        this.f19093l = BackoffPolicy.EXPONENTIAL;
        this.f19094m = 30000;
        this.f19097p = -1;
        this.f19099r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f19082a = pVar.f19082a;
        this.f19084c = pVar.f19084c;
        this.f19083b = pVar.f19083b;
        this.f19085d = pVar.f19085d;
        this.f19086e = new C1388b(pVar.f19086e);
        this.f19087f = new C1388b(pVar.f19087f);
        this.f19088g = pVar.f19088g;
        this.f19089h = pVar.f19089h;
        this.f19090i = pVar.f19090i;
        this.f19091j = new C4648b(pVar.f19091j);
        this.f19092k = pVar.f19092k;
        this.f19093l = pVar.f19093l;
        this.f19094m = pVar.f19094m;
        this.f19095n = pVar.f19095n;
        this.f19096o = pVar.f19096o;
        this.f19097p = pVar.f19097p;
        this.f19098q = pVar.f19098q;
        this.f19099r = pVar.f19099r;
    }
}
