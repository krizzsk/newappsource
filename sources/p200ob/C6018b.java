package p200ob;

import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5336d;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ob.b */
public final class C6018b implements C5336d {

    /* renamed from: b */
    public final C5332a[] f19236b;

    /* renamed from: c */
    public final long[] f19237c;

    public C6018b(C5332a[] aVarArr, long[] jArr) {
        this.f19236b = aVarArr;
        this.f19237c = jArr;
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        int b = C6774a0.m15942b(this.f19237c, j, false);
        if (b < this.f19237c.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        C5332a aVar;
        int e = C6774a0.m15945e(this.f19237c, j, false);
        if (e == -1 || (aVar = this.f19236b[e]) == C5332a.f17588r) {
            return Collections.emptyList();
        }
        return Collections.singletonList(aVar);
    }

    /* renamed from: c */
    public final long mo21123c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (i >= this.f19237c.length) {
            z2 = false;
        }
        C17875h.m44301k(z2);
        return this.f19237c[i];
    }

    /* renamed from: f */
    public final int mo21124f() {
        return this.f19237c.length;
    }
}
