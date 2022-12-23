package p205p3;

import androidx.work.C1388b;
import androidx.work.WorkInfo$State;
import androidx.work.impl.utils.futures.C1420a;
import java.util.UUID;
import p081f3.C4656h;
import p192o3.C5950m;
import p192o3.C5952o;
import p192o3.C5956p;
import p192o3.C5959r;

/* renamed from: p3.q */
public final class C6055q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ UUID f19299b;

    /* renamed from: c */
    public final /* synthetic */ C1388b f19300c;

    /* renamed from: d */
    public final /* synthetic */ C1420a f19301d;

    /* renamed from: e */
    public final /* synthetic */ C6056r f19302e;

    public C6055q(C6056r rVar, UUID uuid, C1388b bVar, C1420a aVar) {
        this.f19302e = rVar;
        this.f19299b = uuid;
        this.f19300c = bVar;
        this.f19301d = aVar;
    }

    public final void run() {
        C5952o oVar;
        String uuid = this.f19299b.toString();
        C4656h c = C4656h.m11960c();
        int i = C6056r.f19303c;
        String.format("Updating progress for %s (%s)", new Object[]{this.f19299b, this.f19300c});
        c.mo20176a(new Throwable[0]);
        this.f19302e.f19304a.mo5187c();
        try {
            C5956p i2 = ((C5959r) this.f19302e.f19304a.mo5701q()).mo21951i(uuid);
            if (i2 != null) {
                if (i2.f19083b == WorkInfo$State.RUNNING) {
                    C5950m mVar = new C5950m(uuid, this.f19300c);
                    oVar = (C5952o) this.f19302e.f19304a.mo5700p();
                    oVar.f19077a.mo5186b();
                    oVar.f19077a.mo5187c();
                    oVar.f19078b.mo22125e(mVar);
                    oVar.f19077a.mo5194j();
                    oVar.f19077a.mo5191g();
                } else {
                    C4656h c2 = C4656h.m11960c();
                    String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid});
                    c2.mo20179f(new Throwable[0]);
                }
                this.f19301d.mo5756h(null);
                this.f19302e.f19304a.mo5194j();
                this.f19302e.f19304a.mo5191g();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        } catch (Throwable th) {
            try {
                C4656h c3 = C4656h.m11960c();
                int i3 = C6056r.f19303c;
                c3.mo20177b(th);
                this.f19301d.mo5757i(th);
            } catch (Throwable th2) {
                this.f19302e.f19304a.mo5191g();
                throw th2;
            }
        }
    }
}
