package p126ib;

import java.util.List;
import p137ja.C5415f;

/* renamed from: ib.h */
public abstract class C5341h extends C5415f implements C5336d {

    /* renamed from: d */
    public C5336d f17626d;

    /* renamed from: e */
    public long f17627e;

    /* renamed from: a */
    public final int mo21121a(long j) {
        C5336d dVar = this.f17626d;
        dVar.getClass();
        return dVar.mo21121a(j - this.f17627e);
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        C5336d dVar = this.f17626d;
        dVar.getClass();
        return dVar.mo21122b(j - this.f17627e);
    }

    /* renamed from: c */
    public final long mo21123c(int i) {
        C5336d dVar = this.f17626d;
        dVar.getClass();
        return dVar.mo21123c(i) + this.f17627e;
    }

    /* renamed from: f */
    public final int mo21124f() {
        C5336d dVar = this.f17626d;
        dVar.getClass();
        return dVar.mo21124f();
    }

    /* renamed from: i */
    public final void mo21125i(long j, C5336d dVar, long j2) {
        this.f17777c = j;
        this.f17626d = dVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f17627e = j;
    }
}
