package p092g3;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C1385a;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1410a;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.futures.C1420a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p081f3.C4652d;
import p081f3.C4656h;
import p090g1.C4732a;
import p092g3.C4766n;
import p179n3.C5842a;
import p205p3.C6049m;
import p218q3.C6165a;
import p218q3.C6166b;
import p695od.C18728c;

/* renamed from: g3.d */
public final class C4755d implements C4753b, C5842a {

    /* renamed from: m */
    public static final /* synthetic */ int f16040m = 0;

    /* renamed from: b */
    public PowerManager.WakeLock f16041b;

    /* renamed from: c */
    public Context f16042c;

    /* renamed from: d */
    public C1385a f16043d;

    /* renamed from: e */
    public C6165a f16044e;

    /* renamed from: f */
    public WorkDatabase f16045f;

    /* renamed from: g */
    public HashMap f16046g = new HashMap();

    /* renamed from: h */
    public HashMap f16047h = new HashMap();

    /* renamed from: i */
    public List<C4757e> f16048i;

    /* renamed from: j */
    public HashSet f16049j;

    /* renamed from: k */
    public final ArrayList f16050k;

    /* renamed from: l */
    public final Object f16051l;

    /* renamed from: g3.d$a */
    public static class C4756a implements Runnable {

        /* renamed from: b */
        public C4753b f16052b;

        /* renamed from: c */
        public String f16053c;

        /* renamed from: d */
        public C18728c<Boolean> f16054d;

        public C4756a(C4753b bVar, String str, C1420a aVar) {
            this.f16052b = bVar;
            this.f16053c = str;
            this.f16054d = aVar;
        }

        public final void run() {
            boolean z;
            try {
                z = this.f16054d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f16052b.mo5711e(this.f16053c, z);
        }
    }

    static {
        C4656h.m11961e("Processor");
    }

    public C4755d(Context context, C1385a aVar, C6166b bVar, WorkDatabase workDatabase, List list) {
        this.f16042c = context;
        this.f16043d = aVar;
        this.f16044e = bVar;
        this.f16045f = workDatabase;
        this.f16048i = list;
        this.f16049j = new HashSet();
        this.f16050k = new ArrayList();
        this.f16041b = null;
        this.f16051l = new Object();
    }

    /* renamed from: b */
    public static boolean m12060b(String str, C4766n nVar) {
        boolean z;
        if (nVar != null) {
            nVar.f16104t = true;
            nVar.mo20291i();
            C18728c<ListenableWorker.C1379a> cVar = nVar.f16103s;
            if (cVar != null) {
                z = cVar.isDone();
                nVar.f16103s.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = nVar.f16091g;
            if (listenableWorker == null || z) {
                String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{nVar.f16090f});
                C4656h c = C4656h.m11960c();
                int i = C4766n.f16085u;
                c.mo20176a(new Throwable[0]);
            } else {
                listenableWorker.stop();
            }
            C4656h c2 = C4656h.m11960c();
            String.format("WorkerWrapper interrupted for %s", new Object[]{str});
            c2.mo20176a(new Throwable[0]);
            return true;
        }
        C4656h c3 = C4656h.m11960c();
        String.format("WorkerWrapper could not be found for %s", new Object[]{str});
        c3.mo20176a(new Throwable[0]);
        return false;
    }

    /* renamed from: a */
    public final void mo20262a(C4753b bVar) {
        synchronized (this.f16051l) {
            this.f16050k.add(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo20263c(String str) {
        boolean z;
        synchronized (this.f16051l) {
            if (!this.f16047h.containsKey(str)) {
                if (!this.f16046g.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public final void mo20264d(String str, C4652d dVar) {
        synchronized (this.f16051l) {
            C4656h c = C4656h.m11960c();
            String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str});
            c.mo20178d(new Throwable[0]);
            C4766n nVar = (C4766n) this.f16047h.remove(str);
            if (nVar != null) {
                if (this.f16041b == null) {
                    PowerManager.WakeLock a = C6049m.m14532a(this.f16042c, "ProcessorForegroundLck");
                    this.f16041b = a;
                    a.acquire();
                }
                this.f16046g.put(str, nVar);
                C4732a.startForegroundService(this.f16042c, C1410a.m3773b(this.f16042c, str, dVar));
            }
        }
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        synchronized (this.f16051l) {
            this.f16047h.remove(str);
            C4656h c = C4656h.m11960c();
            String.format("%s %s executed; reschedule = %s", new Object[]{C4755d.class.getSimpleName(), str, Boolean.valueOf(z)});
            c.mo20176a(new Throwable[0]);
            Iterator it = this.f16050k.iterator();
            while (it.hasNext()) {
                ((C4753b) it.next()).mo5711e(str, z);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo20265f(String str, WorkerParameters.C1384a aVar) {
        synchronized (this.f16051l) {
            if (mo20263c(str)) {
                C4656h c = C4656h.m11960c();
                String.format("Work %s is already enqueued for processing", new Object[]{str});
                c.mo20176a(new Throwable[0]);
                return false;
            }
            C4766n.C4767a aVar2 = new C4766n.C4767a(this.f16042c, this.f16043d, this.f16044e, this, this.f16045f, str);
            aVar2.f16111g = this.f16048i;
            if (aVar != null) {
                aVar2.f16112h = aVar;
            }
            C4766n nVar = new C4766n(aVar2);
            C1420a<Boolean> aVar3 = nVar.f16102r;
            aVar3.addListener(new C4756a(this, str, aVar3), ((C6166b) this.f16044e).f19551c);
            this.f16047h.put(str, nVar);
            ((C6166b) this.f16044e).f19549a.execute(nVar);
            C4656h c2 = C4656h.m11960c();
            String.format("%s: processing %s", new Object[]{C4755d.class.getSimpleName(), str});
            c2.mo20176a(new Throwable[0]);
            return true;
        }
    }

    /* renamed from: g */
    public final void mo20266g() {
        synchronized (this.f16051l) {
            if (!(!this.f16046g.isEmpty())) {
                Context context = this.f16042c;
                int i = C1410a.f5221l;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f16042c.startService(intent);
                } catch (Throwable th) {
                    C4656h.m11960c().mo20177b(th);
                }
                PowerManager.WakeLock wakeLock = this.f16041b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f16041b = null;
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo20267h(String str) {
        boolean b;
        synchronized (this.f16051l) {
            C4656h c = C4656h.m11960c();
            String.format("Processor stopping foreground work %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            b = m12060b(str, (C4766n) this.f16046g.remove(str));
        }
        return b;
    }

    /* renamed from: i */
    public final boolean mo20268i(String str) {
        boolean b;
        synchronized (this.f16051l) {
            C4656h c = C4656h.m11960c();
            String.format("Processor stopping background work %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            b = m12060b(str, (C4766n) this.f16047h.remove(str));
        }
        return b;
    }
}
