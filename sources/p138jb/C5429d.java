package p138jb;

import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5336d;
import p583jk.C17875h;

/* renamed from: jb.d */
public final class C5429d implements C5336d {

    /* renamed from: b */
    public final List<C5332a> f17884b;

    public C5429d(List<C5332a> list) {
        this.f17884b = list;
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        return j >= 0 ? this.f17884b : Collections.emptyList();
    }

    /* renamed from: c */
    public final long mo21123c(int i) {
        C17875h.m44301k(i == 0);
        return 0;
    }

    /* renamed from: f */
    public final int mo21124f() {
        return 1;
    }
}
