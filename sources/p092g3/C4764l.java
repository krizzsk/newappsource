package p092g3;

import androidx.work.impl.utils.futures.C1420a;
import p081f3.C4656h;
import p695od.C18728c;

/* renamed from: g3.l */
public final class C4764l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18728c f16079b;

    /* renamed from: c */
    public final /* synthetic */ C1420a f16080c;

    /* renamed from: d */
    public final /* synthetic */ C4766n f16081d;

    public C4764l(C4766n nVar, C1420a aVar, C1420a aVar2) {
        this.f16081d = nVar;
        this.f16079b = aVar;
        this.f16080c = aVar2;
    }

    public final void run() {
        try {
            this.f16079b.get();
            C4656h c = C4656h.m11960c();
            int i = C4766n.f16085u;
            String.format("Starting work for %s", new Object[]{this.f16081d.f16090f.f19084c});
            c.mo20176a(new Throwable[0]);
            C4766n nVar = this.f16081d;
            nVar.f16103s = nVar.f16091g.startWork();
            this.f16080c.mo5758j(this.f16081d.f16103s);
        } catch (Throwable th) {
            this.f16080c.mo5757i(th);
        }
    }
}
