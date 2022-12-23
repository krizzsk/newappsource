package p173ma;

import p173ma.C5750t;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ma.r */
public final class C5748r implements C5750t {

    /* renamed from: a */
    public final long[] f18620a;

    /* renamed from: b */
    public final long[] f18621b;

    /* renamed from: c */
    public final long f18622c;

    /* renamed from: d */
    public final boolean f18623d;

    public C5748r(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f18623d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f18620a = jArr;
            this.f18621b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f18620a = jArr3;
            long[] jArr4 = new long[i];
            this.f18621b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f18622c = j;
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        if (!this.f18623d) {
            C5753u uVar = C5753u.f18629c;
            return new C5750t.C5751a(uVar, uVar);
        }
        int e = C6774a0.m15945e(this.f18621b, j, true);
        long[] jArr = this.f18621b;
        long j2 = jArr[e];
        long[] jArr2 = this.f18620a;
        C5753u uVar2 = new C5753u(j2, jArr2[e]);
        if (j2 == j || e == jArr.length - 1) {
            return new C5750t.C5751a(uVar2, uVar2);
        }
        int i = e + 1;
        return new C5750t.C5751a(uVar2, new C5753u(jArr[i], jArr2[i]));
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return this.f18623d;
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f18622c;
    }
}
