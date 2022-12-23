package p105h3;

import p081f3.C4656h;
import p192o3.C5956p;

/* renamed from: h3.a */
public final class C5044a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5956p f17027b;

    /* renamed from: c */
    public final /* synthetic */ C5045b f17028c;

    public C5044a(C5045b bVar, C5956p pVar) {
        this.f17028c = bVar;
        this.f17027b = pVar;
    }

    public final void run() {
        C4656h c = C4656h.m11960c();
        int i = C5045b.f17029d;
        String.format("Scheduling work %s", new Object[]{this.f17027b.f19082a});
        c.mo20176a(new Throwable[0]);
        this.f17028c.f17030a.mo20270a(this.f17027b);
    }
}
