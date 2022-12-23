package p241s0;

import p389bl.C13637c;

/* renamed from: s0.e */
public final class C6305e<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f19943f = new Object();

    /* renamed from: b */
    public boolean f19944b;

    /* renamed from: c */
    public long[] f19945c;

    /* renamed from: d */
    public Object[] f19946d;

    /* renamed from: e */
    public int f19947e;

    public C6305e() {
        this(10);
    }

    /* renamed from: a */
    public final void mo22324a(long j, Long l) {
        int i = this.f19947e;
        if (i == 0 || j > this.f19945c[i - 1]) {
            if (this.f19944b && i >= this.f19945c.length) {
                mo22328h();
            }
            int i2 = this.f19947e;
            if (i2 >= this.f19945c.length) {
                int i3 = (i2 + 1) * 8;
                int i4 = 4;
                while (true) {
                    if (i4 >= 32) {
                        break;
                    }
                    int i5 = (1 << i4) - 12;
                    if (i3 <= i5) {
                        i3 = i5;
                        break;
                    }
                    i4++;
                }
                int i6 = i3 / 8;
                long[] jArr = new long[i6];
                Object[] objArr = new Object[i6];
                long[] jArr2 = this.f19945c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f19946d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19945c = jArr;
                this.f19946d = objArr;
            }
            this.f19945c[i2] = j;
            this.f19946d[i2] = l;
            this.f19947e = i2 + 1;
            return;
        }
        mo22331k(j, l);
    }

    /* renamed from: f */
    public final void mo22326f() {
        int i = this.f19947e;
        Object[] objArr = this.f19946d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f19947e = 0;
        this.f19944b = false;
    }

    /* renamed from: g */
    public final C6305e<E> clone() {
        try {
            C6305e<E> eVar = (C6305e) super.clone();
            eVar.f19945c = (long[]) this.f19945c.clone();
            eVar.f19946d = (Object[]) this.f19946d.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public final void mo22328h() {
        int i = this.f19947e;
        long[] jArr = this.f19945c;
        Object[] objArr = this.f19946d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f19943f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f19944b = false;
        this.f19947e = i2;
    }

    /* renamed from: i */
    public final Object mo22329i(long j, Long l) {
        Object obj;
        int g = C13637c.m34068g(this.f19945c, this.f19947e, j);
        if (g < 0 || (obj = this.f19946d[g]) == f19943f) {
            return l;
        }
        return obj;
    }

    /* renamed from: j */
    public final long mo22330j(int i) {
        if (this.f19944b) {
            mo22328h();
        }
        return this.f19945c[i];
    }

    /* renamed from: k */
    public final void mo22331k(long j, E e) {
        int g = C13637c.m34068g(this.f19945c, this.f19947e, j);
        if (g >= 0) {
            this.f19946d[g] = e;
            return;
        }
        int i = ~g;
        int i2 = this.f19947e;
        if (i < i2) {
            Object[] objArr = this.f19946d;
            if (objArr[i] == f19943f) {
                this.f19945c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f19944b && i2 >= this.f19945c.length) {
            mo22328h();
            i = ~C13637c.m34068g(this.f19945c, this.f19947e, j);
        }
        int i3 = this.f19947e;
        if (i3 >= this.f19945c.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f19945c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f19946d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19945c = jArr;
            this.f19946d = objArr2;
        }
        int i8 = this.f19947e - i;
        if (i8 != 0) {
            long[] jArr3 = this.f19945c;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f19946d;
            System.arraycopy(objArr4, i, objArr4, i9, this.f19947e - i);
        }
        this.f19945c[i] = j;
        this.f19946d[i] = e;
        this.f19947e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f19946d;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22332l(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f19945c
            int r1 = r2.f19947e
            int r3 = p389bl.C13637c.m34068g(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f19946d
            r0 = r4[r3]
            java.lang.Object r1 = f19943f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f19944b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241s0.C6305e.mo22332l(long):void");
    }

    /* renamed from: m */
    public final int mo22333m() {
        if (this.f19944b) {
            mo22328h();
        }
        return this.f19947e;
    }

    /* renamed from: o */
    public final E mo22334o(int i) {
        if (this.f19944b) {
            mo22328h();
        }
        return this.f19946d[i];
    }

    public final String toString() {
        if (mo22333m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19947e * 28);
        sb.append('{');
        for (int i = 0; i < this.f19947e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo22330j(i));
            sb.append('=');
            Object o = mo22334o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6305e(int i) {
        this.f19944b = false;
        if (i == 0) {
            this.f19945c = C13637c.f33638e;
            this.f19946d = C13637c.f33639f;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f19945c = new long[i5];
        this.f19946d = new Object[i5];
    }
}
