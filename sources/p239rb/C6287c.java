package p239rb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5336d;
import p583jk.C17875h;

/* renamed from: rb.c */
public final class C6287c implements C5336d {

    /* renamed from: b */
    public final List<C5332a> f19879b;

    public C6287c(ArrayList arrayList) {
        this.f19879b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        return j >= 0 ? this.f19879b : Collections.emptyList();
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
