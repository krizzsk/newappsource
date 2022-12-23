package p205p3;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import p081f3.C4656h;
import p081f3.C4660j;
import p092g3.C4754c;
import p092g3.C4755d;
import p092g3.C4757e;
import p092g3.C4763k;
import p092g3.C4766n;
import p192o3.C5934b;
import p192o3.C5935c;
import p192o3.C5958q;
import p192o3.C5959r;

/* renamed from: p3.d */
public abstract class C6039d implements Runnable {

    /* renamed from: b */
    public final C4754c f19263b = new C4754c();

    /* renamed from: a */
    public static void m14525a(C4763k kVar, String str) {
        boolean z;
        WorkDatabase workDatabase = kVar.f16072c;
        C5958q q = workDatabase.mo5701q();
        C5934b l = workDatabase.mo5696l();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C5959r rVar = (C5959r) q;
            WorkInfo$State f = rVar.mo21948f(str2);
            if (!(f == WorkInfo$State.SUCCEEDED || f == WorkInfo$State.FAILED)) {
                rVar.mo21958p(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((C5935c) l).mo21921a(str2));
        }
        C4755d dVar = kVar.f16075f;
        synchronized (dVar.f16051l) {
            C4656h c = C4656h.m11960c();
            int i = C4755d.f16040m;
            String.format("Processor cancelling %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            dVar.f16049j.add(str);
            C4766n nVar = (C4766n) dVar.f16046g.remove(str);
            if (nVar == null) {
                z = false;
            }
            if (nVar == null) {
                nVar = (C4766n) dVar.f16047h.remove(str);
            }
            C4755d.m12060b(str, nVar);
            if (z) {
                dVar.mo20266g();
            }
        }
        for (C4757e b : kVar.f16074e) {
            b.mo20271b(str);
        }
    }

    /* renamed from: b */
    public abstract void mo22029b();

    public final void run() {
        try {
            mo22029b();
            this.f19263b.mo20261a(C4660j.f15901a);
        } catch (Throwable th) {
            this.f19263b.mo20261a(new C4660j.C4661a.C4662a(th));
        }
    }
}
