package p205p3;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import p081f3.C4656h;
import p092g3.C4755d;
import p092g3.C4763k;
import p192o3.C5958q;
import p192o3.C5959r;

/* renamed from: p3.l */
public final class C6048l implements Runnable {

    /* renamed from: b */
    public final C4763k f19276b;

    /* renamed from: c */
    public final String f19277c;

    /* renamed from: d */
    public final boolean f19278d;

    static {
        C4656h.m11961e("StopWorkRunnable");
    }

    public C6048l(C4763k kVar, String str, boolean z) {
        this.f19276b = kVar;
        this.f19277c = str;
        this.f19278d = z;
    }

    public final void run() {
        boolean containsKey;
        boolean z;
        C4763k kVar = this.f19276b;
        WorkDatabase workDatabase = kVar.f16072c;
        C4755d dVar = kVar.f16075f;
        C5958q q = workDatabase.mo5701q();
        workDatabase.mo5187c();
        try {
            String str = this.f19277c;
            synchronized (dVar.f16051l) {
                containsKey = dVar.f16046g.containsKey(str);
            }
            if (this.f19278d) {
                z = this.f19276b.f16075f.mo20267h(this.f19277c);
            } else {
                if (!containsKey) {
                    C5959r rVar = (C5959r) q;
                    if (rVar.mo21948f(this.f19277c) == WorkInfo$State.RUNNING) {
                        rVar.mo21958p(WorkInfo$State.ENQUEUED, this.f19277c);
                    }
                }
                z = this.f19276b.f16075f.mo20268i(this.f19277c);
            }
            C4656h c = C4656h.m11960c();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f19277c, Boolean.valueOf(z)});
            c.mo20176a(new Throwable[0]);
            workDatabase.mo5194j();
            workDatabase.mo5191g();
        } catch (Throwable th) {
            workDatabase.mo5191g();
            throw th;
        }
    }
}
