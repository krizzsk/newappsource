package p226qb;

import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5336d;
import p583jk.C17875h;

/* renamed from: qb.b */
public final class C6226b implements C5336d {

    /* renamed from: c */
    public static final C6226b f19664c = new C6226b();

    /* renamed from: b */
    public final List<C5332a> f19665b;

    public C6226b(C5332a aVar) {
        this.f19665b = Collections.singletonList(aVar);
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        return j >= 0 ? this.f19665b : Collections.emptyList();
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

    public C6226b() {
        this.f19665b = Collections.emptyList();
    }
}
