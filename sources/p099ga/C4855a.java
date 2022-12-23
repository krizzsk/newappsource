package p099ga;

import android.util.Pair;
import p099ga.C4879e1;
import p100gb.C4967d0;
import p277ub.C6774a0;

/* renamed from: ga.a */
public abstract class C4855a extends C4879e1 {

    /* renamed from: e */
    public static final /* synthetic */ int f16282e = 0;

    /* renamed from: b */
    public final int f16283b;

    /* renamed from: c */
    public final C4967d0 f16284c;

    /* renamed from: d */
    public final boolean f16285d = false;

    public C4855a(C4967d0 d0Var) {
        this.f16284c = d0Var;
        this.f16283b = d0Var.getLength();
    }

    /* renamed from: a */
    public final int mo20341a(boolean z) {
        if (this.f16283b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f16285d) {
            z = false;
        }
        if (z) {
            i = this.f16284c.mo20671f();
        }
        do {
            C4947w0 w0Var = (C4947w0) this;
            if (w0Var.f16729j[i].mo20464p()) {
                i = mo20350q(i, z);
            } else {
                return w0Var.f16729j[i].mo20341a(z) + w0Var.f16728i[i];
            }
        } while (i != -1);
        return -1;
    }

    /* renamed from: b */
    public final int mo20342b(Object obj) {
        int i;
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C4947w0 w0Var = (C4947w0) this;
        Integer num = w0Var.f16731l.get(obj2);
        if (num == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        if (i == -1 || (b = w0Var.f16729j[i].mo20342b(obj3)) == -1) {
            return -1;
        }
        return w0Var.f16727h[i] + b;
    }

    /* renamed from: c */
    public final int mo20343c(boolean z) {
        int i;
        int i2;
        int i3 = this.f16283b;
        if (i3 == 0) {
            return -1;
        }
        if (this.f16285d) {
            z = false;
        }
        if (z) {
            i = this.f16284c.mo20669d();
        } else {
            i = i3 - 1;
        }
        do {
            C4947w0 w0Var = (C4947w0) this;
            if (!w0Var.f16729j[i].mo20464p()) {
                return w0Var.f16729j[i].mo20343c(z) + w0Var.f16728i[i];
            } else if (z) {
                i2 = this.f16284c.mo20667b(i);
                continue;
            } else if (i > 0) {
                i2 = i - 1;
                continue;
            } else {
                i2 = -1;
                continue;
            }
        } while (i != -1);
        return -1;
    }

    /* renamed from: e */
    public final int mo20344e(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f16285d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        C4947w0 w0Var = (C4947w0) this;
        int d = C6774a0.m15944d(w0Var.f16728i, i + 1);
        int i4 = w0Var.f16728i[d];
        C4879e1 e1Var = w0Var.f16729j[d];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int e = e1Var.mo20344e(i5, i3, z);
        if (e != -1) {
            return i4 + e;
        }
        int q = mo20350q(d, z);
        while (q != -1 && w0Var.f16729j[q].mo20464p()) {
            q = mo20350q(q, z);
        }
        if (q != -1) {
            return w0Var.f16729j[q].mo20341a(z) + w0Var.f16728i[q];
        } else if (i2 == 2) {
            return mo20341a(z);
        } else {
            return -1;
        }
    }

    /* renamed from: f */
    public final C4879e1.C4881b mo20345f(int i, C4879e1.C4881b bVar, boolean z) {
        C4947w0 w0Var = (C4947w0) this;
        int d = C6774a0.m15944d(w0Var.f16727h, i + 1);
        int i2 = w0Var.f16728i[d];
        w0Var.f16729j[d].mo20345f(i - w0Var.f16727h[d], bVar, z);
        bVar.f16417c += i2;
        if (z) {
            Object obj = w0Var.f16730k[d];
            Object obj2 = bVar.f16416b;
            obj2.getClass();
            bVar.f16416b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    /* renamed from: g */
    public final C4879e1.C4881b mo20346g(Object obj, C4879e1.C4881b bVar) {
        int i;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C4947w0 w0Var = (C4947w0) this;
        Integer num = w0Var.f16731l.get(obj2);
        if (num == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        int i2 = w0Var.f16728i[i];
        w0Var.f16729j[i].mo20346g(obj3, bVar);
        bVar.f16417c += i2;
        bVar.f16416b = obj;
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:34:0x0055->B:25:0x0055 ?: BREAK  
    EDGE_INSN: B:35:0x0055->B:25:0x0055 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20347k(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f16285d
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            r9 = 1
            if (r8 != r9) goto L_0x000a
            r8 = 2
        L_0x000a:
            r9 = 0
        L_0x000b:
            r0 = r6
            ga.w0 r0 = (p099ga.C4947w0) r0
            int[] r3 = r0.f16728i
            int r4 = r7 + 1
            int r3 = p277ub.C6774a0.m15944d(r3, r4)
            int[] r4 = r0.f16728i
            r4 = r4[r3]
            ga.e1[] r5 = r0.f16729j
            r5 = r5[r3]
            int r7 = r7 - r4
            if (r8 != r1) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r8
        L_0x0023:
            int r7 = r5.mo20347k(r7, r2, r9)
            r2 = -1
            if (r7 == r2) goto L_0x002c
            int r4 = r4 + r7
            return r4
        L_0x002c:
            if (r9 == 0) goto L_0x0035
            gb.d0 r7 = r6.f16284c
            int r7 = r7.mo20667b(r3)
            goto L_0x003b
        L_0x0035:
            if (r3 <= 0) goto L_0x003a
            int r7 = r3 + -1
            goto L_0x003b
        L_0x003a:
            r7 = -1
        L_0x003b:
            if (r7 == r2) goto L_0x0055
            ga.e1[] r3 = r0.f16729j
            r3 = r3[r7]
            boolean r3 = r3.mo20464p()
            if (r3 == 0) goto L_0x0055
            if (r9 == 0) goto L_0x0050
            gb.d0 r3 = r6.f16284c
            int r7 = r3.mo20667b(r7)
            goto L_0x003b
        L_0x0050:
            if (r7 <= 0) goto L_0x003a
            int r7 = r7 + -1
            goto L_0x003b
        L_0x0055:
            if (r7 == r2) goto L_0x0065
            int[] r8 = r0.f16728i
            r8 = r8[r7]
            ga.e1[] r0 = r0.f16729j
            r7 = r0[r7]
            int r7 = r7.mo20343c(r9)
            int r7 = r7 + r8
            return r7
        L_0x0065:
            if (r8 != r1) goto L_0x006c
            int r7 = r6.mo20343c(r9)
            return r7
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4855a.mo20347k(int, int, boolean):int");
    }

    /* renamed from: l */
    public final Object mo20348l(int i) {
        C4947w0 w0Var = (C4947w0) this;
        int d = C6774a0.m15944d(w0Var.f16727h, i + 1);
        return Pair.create(w0Var.f16730k[d], w0Var.f16729j[d].mo20348l(i - w0Var.f16727h[d]));
    }

    /* renamed from: n */
    public final C4879e1.C4882c mo20349n(int i, C4879e1.C4882c cVar, long j) {
        C4947w0 w0Var = (C4947w0) this;
        int d = C6774a0.m15944d(w0Var.f16728i, i + 1);
        int i2 = w0Var.f16728i[d];
        int i3 = w0Var.f16727h[d];
        w0Var.f16729j[d].mo20349n(i - i2, cVar, j);
        Object obj = w0Var.f16730k[d];
        if (!C4879e1.C4882c.f16422r.equals(cVar.f16424a)) {
            obj = Pair.create(obj, cVar.f16424a);
        }
        cVar.f16424a = obj;
        cVar.f16438o += i3;
        cVar.f16439p += i3;
        return cVar;
    }

    /* renamed from: q */
    public final int mo20350q(int i, boolean z) {
        if (z) {
            return this.f16284c.mo20668c(i);
        }
        if (i < this.f16283b - 1) {
            return i + 1;
        }
        return -1;
    }
}
