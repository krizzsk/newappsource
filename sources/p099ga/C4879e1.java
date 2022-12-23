package p099ga;

import android.net.Uri;
import android.util.Pair;
import p099ga.C4901j0;
import p113hb.C5213a;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ga.e1 */
public abstract class C4879e1 {

    /* renamed from: a */
    public static final C4880a f16414a = new C4880a();

    /* renamed from: ga.e1$a */
    public class C4880a extends C4879e1 {
        /* renamed from: b */
        public final int mo20342b(Object obj) {
            return -1;
        }

        /* renamed from: f */
        public final C4881b mo20345f(int i, C4881b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: h */
        public final int mo20458h() {
            return 0;
        }

        /* renamed from: l */
        public final Object mo20348l(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: n */
        public final C4882c mo20349n(int i, C4882c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: o */
        public final int mo20463o() {
            return 0;
        }
    }

    /* renamed from: ga.e1$b */
    public static final class C4881b {

        /* renamed from: a */
        public Object f16415a;

        /* renamed from: b */
        public Object f16416b;

        /* renamed from: c */
        public int f16417c;

        /* renamed from: d */
        public long f16418d;

        /* renamed from: e */
        public long f16419e;

        /* renamed from: f */
        public boolean f16420f;

        /* renamed from: g */
        public C5213a f16421g = C5213a.f17301g;

        /* renamed from: a */
        public final long mo20465a(int i, int i2) {
            C5213a.C5214a aVar = this.f16421g.f17305d[i];
            if (aVar.f17308a != -1) {
                return aVar.f17311d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: b */
        public final int mo20466b(long j) {
            C5213a aVar = this.f16421g;
            long j2 = this.f16418d;
            aVar.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i = 0;
            while (true) {
                long[] jArr = aVar.f17304c;
                if (i >= jArr.length) {
                    break;
                }
                long j3 = jArr[i];
                if ((j3 == Long.MIN_VALUE || j3 > j) && aVar.f17305d[i].mo20994b()) {
                    break;
                }
                i++;
            }
            if (i < aVar.f17304c.length) {
                return i;
            }
            return -1;
        }

        /* renamed from: c */
        public final int mo20467c(int i) {
            return this.f16421g.f17305d[i].mo20993a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C4881b.class.equals(obj.getClass())) {
                return false;
            }
            C4881b bVar = (C4881b) obj;
            if (C6774a0.m15941a(this.f16415a, bVar.f16415a) && C6774a0.m15941a(this.f16416b, bVar.f16416b) && this.f16417c == bVar.f16417c && this.f16418d == bVar.f16418d && this.f16419e == bVar.f16419e && this.f16420f == bVar.f16420f && C6774a0.m15941a(this.f16421g, bVar.f16421g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            Object obj = this.f16415a;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            int i3 = (217 + i) * 31;
            Object obj2 = this.f16416b;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            long j = this.f16418d;
            long j2 = this.f16419e;
            return this.f16421g.hashCode() + ((((((((((i3 + i2) * 31) + this.f16417c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f16420f ? 1 : 0)) * 31);
        }
    }

    /* renamed from: ga.e1$c */
    public static final class C4882c {

        /* renamed from: r */
        public static final Object f16422r = new Object();

        /* renamed from: s */
        public static final C4901j0 f16423s;

        /* renamed from: a */
        public Object f16424a = f16422r;
        @Deprecated

        /* renamed from: b */
        public Object f16425b;

        /* renamed from: c */
        public C4901j0 f16426c = f16423s;

        /* renamed from: d */
        public Object f16427d;

        /* renamed from: e */
        public long f16428e;

        /* renamed from: f */
        public long f16429f;

        /* renamed from: g */
        public long f16430g;

        /* renamed from: h */
        public boolean f16431h;

        /* renamed from: i */
        public boolean f16432i;
        @Deprecated

        /* renamed from: j */
        public boolean f16433j;

        /* renamed from: k */
        public C4901j0.C4906e f16434k;

        /* renamed from: l */
        public boolean f16435l;

        /* renamed from: m */
        public long f16436m;

        /* renamed from: n */
        public long f16437n;

        /* renamed from: o */
        public int f16438o;

        /* renamed from: p */
        public int f16439p;

        /* renamed from: q */
        public long f16440q;

        static {
            C4901j0.C4903b bVar = new C4901j0.C4903b();
            bVar.f16541a = "com.google.android.exoplayer2.Timeline";
            bVar.f16542b = Uri.EMPTY;
            f16423s = bVar.mo20542a();
        }

        /* renamed from: a */
        public final boolean mo20470a() {
            boolean z;
            boolean z2;
            boolean z3 = this.f16433j;
            if (this.f16434k != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17875h.m44304o(z2);
            if (this.f16434k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo20471b(C4901j0 j0Var, Object obj, long j, long j2, long j3, boolean z, boolean z2, C4901j0.C4906e eVar, long j4, long j5, long j6) {
            C4901j0 j0Var2;
            Object obj2;
            boolean z3;
            C4901j0.C4907f fVar;
            C4901j0 j0Var3 = j0Var;
            C4901j0.C4906e eVar2 = eVar;
            this.f16424a = f16422r;
            if (j0Var3 != null) {
                j0Var2 = j0Var3;
            } else {
                j0Var2 = f16423s;
            }
            this.f16426c = j0Var2;
            if (j0Var3 == null || (fVar = j0Var3.f16537b) == null) {
                obj2 = null;
            } else {
                obj2 = fVar.f16567f;
            }
            this.f16425b = obj2;
            this.f16427d = obj;
            this.f16428e = j;
            this.f16429f = j2;
            this.f16430g = j3;
            this.f16431h = z;
            this.f16432i = z2;
            if (eVar2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f16433j = z3;
            this.f16434k = eVar2;
            this.f16436m = j4;
            this.f16437n = j5;
            this.f16438o = 0;
            this.f16439p = 0;
            this.f16440q = j6;
            this.f16435l = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C4882c.class.equals(obj.getClass())) {
                return false;
            }
            C4882c cVar = (C4882c) obj;
            if (C6774a0.m15941a(this.f16424a, cVar.f16424a) && C6774a0.m15941a(this.f16426c, cVar.f16426c) && C6774a0.m15941a(this.f16427d, cVar.f16427d) && C6774a0.m15941a(this.f16434k, cVar.f16434k) && this.f16428e == cVar.f16428e && this.f16429f == cVar.f16429f && this.f16430g == cVar.f16430g && this.f16431h == cVar.f16431h && this.f16432i == cVar.f16432i && this.f16435l == cVar.f16435l && this.f16436m == cVar.f16436m && this.f16437n == cVar.f16437n && this.f16438o == cVar.f16438o && this.f16439p == cVar.f16439p && this.f16440q == cVar.f16440q) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = (this.f16426c.hashCode() + ((this.f16424a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f16427d;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            int i3 = (hashCode + i) * 31;
            C4901j0.C4906e eVar = this.f16434k;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            long j = this.f16428e;
            long j2 = this.f16429f;
            long j3 = this.f16430g;
            long j4 = this.f16436m;
            long j5 = this.f16437n;
            long j6 = this.f16440q;
            return ((((((((((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f16431h ? 1 : 0)) * 31) + (this.f16432i ? 1 : 0)) * 31) + (this.f16435l ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f16438o) * 31) + this.f16439p) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo20341a(boolean z) {
        return mo20464p() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo20342b(Object obj);

    /* renamed from: c */
    public int mo20343c(boolean z) {
        if (mo20464p()) {
            return -1;
        }
        return mo20463o() - 1;
    }

    /* renamed from: d */
    public final int mo20456d(int i, C4881b bVar, C4882c cVar, int i2, boolean z) {
        int i3 = mo20345f(i, bVar, false).f16417c;
        if (mo20462m(i3, cVar).f16439p != i) {
            return i + 1;
        }
        int e = mo20344e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return mo20462m(e, cVar).f16438o;
    }

    /* renamed from: e */
    public int mo20344e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo20343c(z)) {
                return mo20341a(z);
            } else {
                return i + 1;
            }
        } else if (i == mo20343c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4879e1)) {
            return false;
        }
        C4879e1 e1Var = (C4879e1) obj;
        if (e1Var.mo20463o() != mo20463o() || e1Var.mo20458h() != mo20458h()) {
            return false;
        }
        C4882c cVar = new C4882c();
        C4881b bVar = new C4881b();
        C4882c cVar2 = new C4882c();
        C4881b bVar2 = new C4881b();
        for (int i = 0; i < mo20463o(); i++) {
            if (!mo20462m(i, cVar).equals(e1Var.mo20462m(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo20458h(); i2++) {
            if (!mo20345f(i2, bVar, true).equals(e1Var.mo20345f(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract C4881b mo20345f(int i, C4881b bVar, boolean z);

    /* renamed from: g */
    public C4881b mo20346g(Object obj, C4881b bVar) {
        return mo20345f(mo20342b(obj), bVar, true);
    }

    /* renamed from: h */
    public abstract int mo20458h();

    public final int hashCode() {
        C4882c cVar = new C4882c();
        C4881b bVar = new C4881b();
        int o = mo20463o() + 217;
        for (int i = 0; i < mo20463o(); i++) {
            o = (o * 31) + mo20462m(i, cVar).hashCode();
        }
        int h = mo20458h() + (o * 31);
        for (int i2 = 0; i2 < mo20458h(); i2++) {
            h = (h * 31) + mo20345f(i2, bVar, true).hashCode();
        }
        return h;
    }

    /* renamed from: i */
    public final Pair<Object, Long> mo20460i(C4882c cVar, C4881b bVar, int i, long j) {
        Pair<Object, Long> j2 = mo20461j(cVar, bVar, i, j, 0);
        j2.getClass();
        return j2;
    }

    /* renamed from: j */
    public final Pair<Object, Long> mo20461j(C4882c cVar, C4881b bVar, int i, long j, long j2) {
        C17875h.m44303n(i, mo20463o());
        mo20349n(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.f16436m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f16438o;
        mo20345f(i2, bVar, false);
        while (i2 < cVar.f16439p && bVar.f16419e != j) {
            int i3 = i2 + 1;
            if (mo20345f(i3, bVar, false).f16419e > j) {
                break;
            }
            i2 = i3;
        }
        mo20345f(i2, bVar, true);
        Object obj = bVar.f16416b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(j - bVar.f16419e));
    }

    /* renamed from: k */
    public int mo20347k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo20341a(z)) {
                return mo20343c(z);
            } else {
                return i - 1;
            }
        } else if (i == mo20341a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: l */
    public abstract Object mo20348l(int i);

    /* renamed from: m */
    public final C4882c mo20462m(int i, C4882c cVar) {
        return mo20349n(i, cVar, 0);
    }

    /* renamed from: n */
    public abstract C4882c mo20349n(int i, C4882c cVar, long j);

    /* renamed from: o */
    public abstract int mo20463o();

    /* renamed from: p */
    public final boolean mo20464p() {
        return mo20463o() == 0;
    }
}
