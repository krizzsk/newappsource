package p092g3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.work.C1385a;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1391a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p081f3.C4656h;
import p081f3.C4660j;
import p081f3.C4665k;
import p081f3.C4668m;
import p081f3.C4669n;
import p105h3.C5046c;
import p118i3.C5264b;
import p131j3.C5373b;
import p192o3.C5959r;
import p205p3.C6037b;
import p205p3.C6042g;
import p205p3.C6043h;
import p205p3.C6045j;
import p205p3.C6047k;
import p205p3.C6048l;
import p218q3.C6165a;
import p218q3.C6166b;
import p269u2.C6685f;

/* renamed from: g3.k */
public final class C4763k extends C4669n {

    /* renamed from: j */
    public static C4763k f16067j = null;

    /* renamed from: k */
    public static C4763k f16068k = null;

    /* renamed from: l */
    public static final Object f16069l = new Object();

    /* renamed from: a */
    public Context f16070a;

    /* renamed from: b */
    public C1385a f16071b;

    /* renamed from: c */
    public WorkDatabase f16072c;

    /* renamed from: d */
    public C6165a f16073d;

    /* renamed from: e */
    public List<C4757e> f16074e;

    /* renamed from: f */
    public C4755d f16075f;

    /* renamed from: g */
    public C6043h f16076g;

    /* renamed from: h */
    public boolean f16077h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f16078i;

    static {
        C4656h.m11961e("WorkManagerImpl");
    }

    /* JADX INFO: finally extract failed */
    public C4763k(Context context, C1385a aVar, C6166b bVar) {
        RoomDatabase.C1252a aVar2;
        C4757e eVar;
        C1385a aVar3 = aVar;
        C6166b bVar2 = bVar;
        boolean z = context.getResources().getBoolean(C4668m.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        C6045j jVar = bVar2.f19549a;
        int i = WorkDatabase.f5155m;
        Class<WorkDatabase> cls = WorkDatabase.class;
        C4757e eVar2 = null;
        if (z) {
            aVar2 = new RoomDatabase.C1252a(applicationContext, cls, (String) null);
            aVar2.f4726h = true;
        } else {
            String[] strArr = C4762j.f16066a;
            RoomDatabase.C1252a aVar4 = new RoomDatabase.C1252a(applicationContext, cls, "androidx.work.workdb");
            aVar4.f4725g = new C4760h(applicationContext);
            aVar2 = aVar4;
        }
        aVar2.f4723e = jVar;
        C4761i iVar = new C4761i();
        if (aVar2.f4722d == null) {
            aVar2.f4722d = new ArrayList<>();
        }
        aVar2.f4722d.add(iVar);
        aVar2.mo5196a(C1391a.f5165a);
        aVar2.mo5196a(new C1391a.C1399h(applicationContext, 2, 3));
        aVar2.mo5196a(C1391a.f5166b);
        aVar2.mo5196a(C1391a.f5167c);
        aVar2.mo5196a(new C1391a.C1399h(applicationContext, 5, 6));
        aVar2.mo5196a(C1391a.f5168d);
        aVar2.mo5196a(C1391a.f5169e);
        aVar2.mo5196a(C1391a.f5170f);
        aVar2.mo5196a(new C1391a.C1400i(applicationContext));
        aVar2.mo5196a(new C1391a.C1399h(applicationContext, 10, 11));
        aVar2.mo5196a(C1391a.f5171g);
        aVar2.f4728j = false;
        aVar2.f4729k = true;
        WorkDatabase workDatabase = (WorkDatabase) aVar2.mo5197b();
        Context applicationContext2 = context.getApplicationContext();
        C4656h.C4657a aVar5 = new C4656h.C4657a(aVar3.f5148f);
        synchronized (C4656h.class) {
            try {
                C4656h.f15899a = aVar5;
            } catch (Throwable th) {
                throw th;
            }
        }
        C4757e[] eVarArr = new C4757e[2];
        int i2 = C4758f.f16055a;
        if (Build.VERSION.SDK_INT >= 23) {
            eVar = new C5373b(applicationContext2, this);
            C6042g.m14529a(applicationContext2, SystemJobService.class, true);
            C4656h.m11960c().mo20176a(new Throwable[0]);
        } else {
            try {
                C4757e eVar3 = (C4757e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext2});
                C4656h c = C4656h.m11960c();
                String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"});
                c.mo20176a(new Throwable[0]);
                eVar2 = eVar3;
            } catch (Throwable th2) {
                C4656h c2 = C4656h.m11960c();
                int i3 = C4758f.f16055a;
                c2.mo20176a(th2);
            }
            if (eVar2 == null) {
                eVar = new C5264b(applicationContext2);
                C6042g.m14529a(applicationContext2, SystemAlarmService.class, true);
                C4656h.m11960c().mo20176a(new Throwable[0]);
            } else {
                eVar = eVar2;
            }
        }
        eVarArr[0] = eVar;
        eVarArr[1] = new C5046c(applicationContext2, aVar3, bVar2, this);
        List<C4757e> asList = Arrays.asList(eVarArr);
        C4755d dVar = new C4755d(context, aVar, bVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f16070a = applicationContext3;
        this.f16071b = aVar3;
        this.f16073d = bVar2;
        this.f16072c = workDatabase;
        this.f16074e = asList;
        this.f16075f = dVar;
        this.f16076g = new C6043h(workDatabase);
        this.f16077h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext3.isDeviceProtectedStorage()) {
            ((C6166b) this.f16073d).mo22153a(new ForceStopRunnable(applicationContext3, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    public static p092g3.C4763k m12079g(android.content.Context r2) {
        /*
            java.lang.Object r0 = f16069l
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            g3.k r1 = f16067j     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            g3.k r1 = f16068k     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0035 }
            boolean r1 = r2 instanceof androidx.work.C1385a.C1387b     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            androidx.work.a$b r1 = (androidx.work.C1385a.C1387b) r1     // Catch:{ all -> 0x0035 }
            androidx.work.a r1 = r1.mo5690a()     // Catch:{ all -> 0x0035 }
            m12080h(r2, r1)     // Catch:{ all -> 0x0035 }
            g3.k r1 = m12079g(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r2 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: p092g3.C4763k.m12079g(android.content.Context):g3.k");
    }

    /* renamed from: h */
    public static void m12080h(Context context, C1385a aVar) {
        synchronized (f16069l) {
            C4763k kVar = f16067j;
            if (kVar != null) {
                if (f16068k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (kVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f16068k == null) {
                    f16068k = new C4763k(applicationContext, aVar, new C6166b(aVar.f5144b));
                }
                f16067j = f16068k;
            }
        }
    }

    /* renamed from: e */
    public final C4754c mo20275e(String str) {
        C6037b bVar = new C6037b(this, str);
        ((C6166b) this.f16073d).mo22153a(bVar);
        return bVar.f19263b;
    }

    /* renamed from: f */
    public final C4660j mo20276f(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, C4665k kVar) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new C4759g(this, str, existingWorkPolicy, Collections.singletonList(kVar)).mo20273e();
    }

    /* renamed from: i */
    public final void mo20277i() {
        synchronized (f16069l) {
            this.f16077h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f16078i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f16078i = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final void mo20278j() {
        ArrayList f;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f16070a;
            int i = C5373b.f17688f;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (!(jobScheduler == null || (f = C5373b.m13480f(context, jobScheduler)) == null || f.isEmpty())) {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    C5373b.m13478c(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        C5959r rVar = (C5959r) this.f16072c.mo5701q();
        rVar.f19102a.mo5186b();
        C6685f a = rVar.f19110i.mo22151a();
        rVar.f19102a.mo5187c();
        try {
            a.executeUpdateDelete();
            rVar.f19102a.mo5194j();
            rVar.f19102a.mo5191g();
            rVar.f19110i.mo22152c(a);
            C4758f.m12072a(this.f16071b, this.f16072c, this.f16074e);
        } catch (Throwable th) {
            rVar.f19102a.mo5191g();
            rVar.f19110i.mo22152c(a);
            throw th;
        }
    }

    /* renamed from: k */
    public final void mo20279k(String str, WorkerParameters.C1384a aVar) {
        ((C6166b) this.f16073d).mo22153a(new C6047k(this, str, aVar));
    }

    /* renamed from: l */
    public final void mo20280l(String str) {
        ((C6166b) this.f16073d).mo22153a(new C6048l(this, str, false));
    }
}
