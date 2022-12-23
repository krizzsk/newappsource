package p092g3;

import android.content.Context;
import android.database.Cursor;
import androidx.work.C1385a;
import androidx.work.C1388b;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C1420a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p081f3.C4656h;
import p179n3.C5842a;
import p192o3.C5934b;
import p192o3.C5935c;
import p192o3.C5952o;
import p192o3.C5956p;
import p192o3.C5958q;
import p192o3.C5959r;
import p192o3.C5969t;
import p205p3.C6042g;
import p217q2.C6162k;
import p218q3.C6165a;
import p695od.C18728c;

/* renamed from: g3.n */
public final class C4766n implements Runnable {

    /* renamed from: u */
    public static final /* synthetic */ int f16085u = 0;

    /* renamed from: b */
    public Context f16086b;

    /* renamed from: c */
    public String f16087c;

    /* renamed from: d */
    public List<C4757e> f16088d;

    /* renamed from: e */
    public WorkerParameters.C1384a f16089e;

    /* renamed from: f */
    public C5956p f16090f;

    /* renamed from: g */
    public ListenableWorker f16091g;

    /* renamed from: h */
    public C6165a f16092h;

    /* renamed from: i */
    public ListenableWorker.C1379a f16093i = new ListenableWorker.C1379a.C1380a();

    /* renamed from: j */
    public C1385a f16094j;

    /* renamed from: k */
    public C5842a f16095k;

    /* renamed from: l */
    public WorkDatabase f16096l;

    /* renamed from: m */
    public C5958q f16097m;

    /* renamed from: n */
    public C5934b f16098n;

    /* renamed from: o */
    public C5969t f16099o;

    /* renamed from: p */
    public ArrayList f16100p;

    /* renamed from: q */
    public String f16101q;

    /* renamed from: r */
    public C1420a<Boolean> f16102r = new C1420a<>();

    /* renamed from: s */
    public C18728c<ListenableWorker.C1379a> f16103s = null;

    /* renamed from: t */
    public volatile boolean f16104t;

    /* renamed from: g3.n$a */
    public static class C4767a {

        /* renamed from: a */
        public Context f16105a;

        /* renamed from: b */
        public C5842a f16106b;

        /* renamed from: c */
        public C6165a f16107c;

        /* renamed from: d */
        public C1385a f16108d;

        /* renamed from: e */
        public WorkDatabase f16109e;

        /* renamed from: f */
        public String f16110f;

        /* renamed from: g */
        public List<C4757e> f16111g;

        /* renamed from: h */
        public WorkerParameters.C1384a f16112h = new WorkerParameters.C1384a();

        public C4767a(Context context, C1385a aVar, C6165a aVar2, C5842a aVar3, WorkDatabase workDatabase, String str) {
            this.f16105a = context.getApplicationContext();
            this.f16107c = aVar2;
            this.f16106b = aVar3;
            this.f16108d = aVar;
            this.f16109e = workDatabase;
            this.f16110f = str;
        }
    }

    static {
        C4656h.m11961e("WorkerWrapper");
    }

    public C4766n(C4767a aVar) {
        this.f16086b = aVar.f16105a;
        this.f16092h = aVar.f16107c;
        this.f16095k = aVar.f16106b;
        this.f16087c = aVar.f16110f;
        this.f16088d = aVar.f16111g;
        this.f16089e = aVar.f16112h;
        this.f16091g = null;
        this.f16094j = aVar.f16108d;
        WorkDatabase workDatabase = aVar.f16109e;
        this.f16096l = workDatabase;
        this.f16097m = workDatabase.mo5701q();
        this.f16098n = this.f16096l.mo5696l();
        this.f16099o = this.f16096l.mo5702r();
    }

    /* renamed from: a */
    public final void mo20283a(ListenableWorker.C1379a aVar) {
        if (aVar instanceof ListenableWorker.C1379a.C1382c) {
            C4656h c = C4656h.m11960c();
            String.format("Worker result SUCCESS for %s", new Object[]{this.f16101q});
            c.mo20178d(new Throwable[0]);
            if (this.f16090f.mo21936c()) {
                mo20287e();
                return;
            }
            this.f16096l.mo5187c();
            try {
                C5958q qVar = this.f16097m;
                ((C5959r) qVar).mo21958p(WorkInfo$State.SUCCEEDED, this.f16087c);
                C1388b bVar = ((ListenableWorker.C1379a.C1382c) this.f16093i).f5128a;
                ((C5959r) this.f16097m).mo21956n(this.f16087c, bVar);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((C5935c) this.f16098n).mo21921a(this.f16087c).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((C5959r) this.f16097m).mo21948f(str) == WorkInfo$State.BLOCKED && ((C5935c) this.f16098n).mo21922b(str)) {
                        C4656h c2 = C4656h.m11960c();
                        String.format("Setting status to enqueued for %s", new Object[]{str});
                        c2.mo20178d(new Throwable[0]);
                        C5958q qVar2 = this.f16097m;
                        ((C5959r) qVar2).mo21958p(WorkInfo$State.ENQUEUED, str);
                        ((C5959r) this.f16097m).mo21957o(currentTimeMillis, str);
                    }
                }
                this.f16096l.mo5194j();
            } finally {
                this.f16096l.mo5191g();
                mo20288f(false);
            }
        } else if (aVar instanceof ListenableWorker.C1379a.C1381b) {
            C4656h c3 = C4656h.m11960c();
            String.format("Worker result RETRY for %s", new Object[]{this.f16101q});
            c3.mo20178d(new Throwable[0]);
            mo20286d();
        } else {
            C4656h c4 = C4656h.m11960c();
            String.format("Worker result FAILURE for %s", new Object[]{this.f16101q});
            c4.mo20178d(new Throwable[0]);
            if (this.f16090f.mo21936c()) {
                mo20287e();
            } else {
                mo20290h();
            }
        }
    }

    /* renamed from: b */
    public final void mo20284b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((C5959r) this.f16097m).mo21948f(str2) != WorkInfo$State.CANCELLED) {
                C5958q qVar = this.f16097m;
                ((C5959r) qVar).mo21958p(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((C5935c) this.f16098n).mo21921a(str2));
        }
    }

    /* renamed from: c */
    public final void mo20285c() {
        if (!mo20291i()) {
            this.f16096l.mo5187c();
            try {
                WorkInfo$State f = ((C5959r) this.f16097m).mo21948f(this.f16087c);
                ((C5952o) this.f16096l.mo5700p()).mo21932a(this.f16087c);
                if (f == null) {
                    mo20288f(false);
                } else if (f == WorkInfo$State.RUNNING) {
                    mo20283a(this.f16093i);
                } else if (!f.isFinished()) {
                    mo20286d();
                }
                this.f16096l.mo5194j();
            } finally {
                this.f16096l.mo5191g();
            }
        }
        List<C4757e> list = this.f16088d;
        if (list != null) {
            for (C4757e b : list) {
                b.mo20271b(this.f16087c);
            }
            C4758f.m12072a(this.f16094j, this.f16096l, this.f16088d);
        }
    }

    /* renamed from: d */
    public final void mo20286d() {
        this.f16096l.mo5187c();
        try {
            C5958q qVar = this.f16097m;
            ((C5959r) qVar).mo21958p(WorkInfo$State.ENQUEUED, this.f16087c);
            C5958q qVar2 = this.f16097m;
            C5959r rVar = (C5959r) qVar2;
            rVar.mo21957o(System.currentTimeMillis(), this.f16087c);
            ((C5959r) this.f16097m).mo21954l(-1, this.f16087c);
            this.f16096l.mo5194j();
        } finally {
            this.f16096l.mo5191g();
            mo20288f(true);
        }
    }

    /* renamed from: e */
    public final void mo20287e() {
        this.f16096l.mo5187c();
        try {
            C5958q qVar = this.f16097m;
            C5959r rVar = (C5959r) qVar;
            rVar.mo21957o(System.currentTimeMillis(), this.f16087c);
            C5958q qVar2 = this.f16097m;
            ((C5959r) qVar2).mo21958p(WorkInfo$State.ENQUEUED, this.f16087c);
            ((C5959r) this.f16097m).mo21955m(this.f16087c);
            ((C5959r) this.f16097m).mo21954l(-1, this.f16087c);
            this.f16096l.mo5194j();
        } finally {
            this.f16096l.mo5191g();
            mo20288f(false);
        }
    }

    /* renamed from: f */
    public final void mo20288f(boolean z) {
        C6162k a;
        Cursor i;
        boolean z2;
        ListenableWorker listenableWorker;
        this.f16096l.mo5187c();
        try {
            C5959r rVar = (C5959r) this.f16096l.mo5701q();
            rVar.getClass();
            a = C6162k.m14718a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            rVar.f19102a.mo5186b();
            i = rVar.f19102a.mo5193i(a);
            if (!i.moveToFirst() || i.getInt(0) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            i.close();
            a.release();
            if (!z2) {
                C6042g.m14529a(this.f16086b, RescheduleReceiver.class, false);
            }
            if (z) {
                C5958q qVar = this.f16097m;
                ((C5959r) qVar).mo21958p(WorkInfo$State.ENQUEUED, this.f16087c);
                ((C5959r) this.f16097m).mo21954l(-1, this.f16087c);
            }
            if (!(this.f16090f == null || (listenableWorker = this.f16091g) == null || !listenableWorker.isRunInForeground())) {
                C5842a aVar = this.f16095k;
                String str = this.f16087c;
                C4755d dVar = (C4755d) aVar;
                synchronized (dVar.f16051l) {
                    dVar.f16046g.remove(str);
                    dVar.mo20266g();
                }
            }
            this.f16096l.mo5194j();
            this.f16096l.mo5191g();
            this.f16102r.mo5756h(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f16096l.mo5191g();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo20289g() {
        WorkInfo$State f = ((C5959r) this.f16097m).mo21948f(this.f16087c);
        if (f == WorkInfo$State.RUNNING) {
            C4656h c = C4656h.m11960c();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f16087c});
            c.mo20176a(new Throwable[0]);
            mo20288f(true);
            return;
        }
        C4656h c2 = C4656h.m11960c();
        String.format("Status for %s is %s; not doing any work", new Object[]{this.f16087c, f});
        c2.mo20176a(new Throwable[0]);
        mo20288f(false);
    }

    /* renamed from: h */
    public final void mo20290h() {
        this.f16096l.mo5187c();
        try {
            mo20284b(this.f16087c);
            C1388b bVar = ((ListenableWorker.C1379a.C1380a) this.f16093i).f5127a;
            ((C5959r) this.f16097m).mo21956n(this.f16087c, bVar);
            this.f16096l.mo5194j();
        } finally {
            this.f16096l.mo5191g();
            mo20288f(false);
        }
    }

    /* renamed from: i */
    public final boolean mo20291i() {
        if (!this.f16104t) {
            return false;
        }
        C4656h c = C4656h.m11960c();
        String.format("Work interrupted for %s", new Object[]{this.f16101q});
        c.mo20176a(new Throwable[0]);
        WorkInfo$State f = ((C5959r) this.f16097m).mo21948f(this.f16087c);
        if (f == null) {
            mo20288f(false);
        } else {
            mo20288f(!f.isFinished());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r0 != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            o3.t r0 = r1.f16099o
            java.lang.String r2 = r1.f16087c
            o3.u r0 = (p192o3.C5970u) r0
            java.util.ArrayList r0 = r0.mo21959a(r2)
            r1.f16100p = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Work [ id="
            r2.<init>(r3)
            java.lang.String r3 = r1.f16087c
            r2.append(r3)
            java.lang.String r3 = ", tags={ "
            r2.append(r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 1
            r4 = 1
        L_0x0025:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L_0x0036
            r4 = 0
            goto L_0x003b
        L_0x0036:
            java.lang.String r6 = ", "
            r2.append(r6)
        L_0x003b:
            r2.append(r5)
            goto L_0x0025
        L_0x003f:
            java.lang.String r0 = " } ]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f16101q = r0
            boolean r0 = r18.mo20291i()
            if (r0 == 0) goto L_0x0052
            goto L_0x02c7
        L_0x0052:
            androidx.work.impl.WorkDatabase r0 = r1.f16096l
            r0.mo5187c()
            o3.q r0 = r1.f16097m     // Catch:{ all -> 0x02d7 }
            java.lang.String r2 = r1.f16087c     // Catch:{ all -> 0x02d7 }
            o3.r r0 = (p192o3.C5959r) r0     // Catch:{ all -> 0x02d7 }
            o3.p r0 = r0.mo21951i(r2)     // Catch:{ all -> 0x02d7 }
            r1.f16090f = r0     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0083
            f3.h r0 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x02d7 }
            java.lang.String r2 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02d7 }
            java.lang.String r4 = r1.f16087c     // Catch:{ all -> 0x02d7 }
            r3[r6] = r4     // Catch:{ all -> 0x02d7 }
            java.lang.String.format(r2, r3)     // Catch:{ all -> 0x02d7 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02d7 }
            r0.mo20177b(r2)     // Catch:{ all -> 0x02d7 }
            r1.mo20288f(r6)     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r1.f16096l     // Catch:{ all -> 0x02d7 }
            r0.mo5194j()     // Catch:{ all -> 0x02d7 }
            goto L_0x00f6
        L_0x0083:
            androidx.work.WorkInfo$State r2 = r0.f19083b     // Catch:{ all -> 0x02d7 }
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x02d7 }
            if (r2 == r4) goto L_0x00a8
            r18.mo20289g()     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r1.f16096l     // Catch:{ all -> 0x02d7 }
            r0.mo5194j()     // Catch:{ all -> 0x02d7 }
            f3.h r0 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x02d7 }
            java.lang.String r2 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02d7 }
            o3.p r4 = r1.f16090f     // Catch:{ all -> 0x02d7 }
            java.lang.String r4 = r4.f19084c     // Catch:{ all -> 0x02d7 }
            r3[r6] = r4     // Catch:{ all -> 0x02d7 }
            java.lang.String.format(r2, r3)     // Catch:{ all -> 0x02d7 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02d7 }
            r0.mo20176a(r2)     // Catch:{ all -> 0x02d7 }
            goto L_0x00f6
        L_0x00a8:
            boolean r0 = r0.mo21936c()     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x00bd
            o3.p r0 = r1.f16090f     // Catch:{ all -> 0x02d7 }
            androidx.work.WorkInfo$State r2 = r0.f19083b     // Catch:{ all -> 0x02d7 }
            if (r2 != r4) goto L_0x00ba
            int r0 = r0.f19092k     // Catch:{ all -> 0x02d7 }
            if (r0 <= 0) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r0 == 0) goto L_0x00fd
        L_0x00bd:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02d7 }
            o3.p r0 = r1.f16090f     // Catch:{ all -> 0x02d7 }
            long r7 = r0.f19095n     // Catch:{ all -> 0x02d7 }
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00cd
            r2 = 1
            goto L_0x00ce
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            if (r2 != 0) goto L_0x00fd
            long r7 = r0.mo21934a()     // Catch:{ all -> 0x02d7 }
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fd
            f3.h r0 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x02d7 }
            java.lang.String r2 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x02d7 }
            o3.p r5 = r1.f16090f     // Catch:{ all -> 0x02d7 }
            java.lang.String r5 = r5.f19084c     // Catch:{ all -> 0x02d7 }
            r4[r6] = r5     // Catch:{ all -> 0x02d7 }
            java.lang.String.format(r2, r4)     // Catch:{ all -> 0x02d7 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02d7 }
            r0.mo20176a(r2)     // Catch:{ all -> 0x02d7 }
            r1.mo20288f(r3)     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r1.f16096l     // Catch:{ all -> 0x02d7 }
            r0.mo5194j()     // Catch:{ all -> 0x02d7 }
        L_0x00f6:
            androidx.work.impl.WorkDatabase r0 = r1.f16096l
            r0.mo5191g()
            goto L_0x02c7
        L_0x00fd:
            androidx.work.impl.WorkDatabase r0 = r1.f16096l     // Catch:{ all -> 0x02d7 }
            r0.mo5194j()     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r1.f16096l
            r0.mo5191g()
            o3.p r0 = r1.f16090f
            boolean r0 = r0.mo21936c()
            if (r0 == 0) goto L_0x0116
            o3.p r0 = r1.f16090f
            androidx.work.b r0 = r0.f19086e
        L_0x0113:
            r9 = r0
            goto L_0x01b4
        L_0x0116:
            androidx.work.a r0 = r1.f16094j
            f3.g r0 = r0.f5146d
            o3.p r2 = r1.f16090f
            java.lang.String r2 = r2.f19085d
            r0.getClass()
            int r0 = p081f3.C4654f.f15898a
            r4 = 0
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0130 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x0130 }
            f3.f r0 = (p081f3.C4654f) r0     // Catch:{ Exception -> 0x0130 }
            r4 = r0
            goto L_0x013e
        L_0x0130:
            r0 = move-exception
            f3.h r2 = p081f3.C4656h.m11960c()
            int r5 = p081f3.C4654f.f15898a
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]
            r5[r6] = r0
            r2.mo20177b(r5)
        L_0x013e:
            if (r4 != 0) goto L_0x015b
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            o3.p r3 = r1.f16090f
            java.lang.String r3 = r3.f19085d
            r2[r6] = r3
            java.lang.String r3 = "Could not create Input Merger %s"
            java.lang.String.format(r3, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r6]
            r0.mo20177b(r2)
            r18.mo20290h()
            goto L_0x02c7
        L_0x015b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            o3.p r2 = r1.f16090f
            androidx.work.b r2 = r2.f19086e
            r0.add(r2)
            o3.q r2 = r1.f16097m
            java.lang.String r5 = r1.f16087c
            o3.r r2 = (p192o3.C5959r) r2
            r2.getClass()
            java.lang.String r7 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            q2.k r7 = p217q2.C6162k.m14718a(r3, r7)
            if (r5 != 0) goto L_0x017c
            r7.bindNull(r3)
            goto L_0x017f
        L_0x017c:
            r7.bindString(r3, r5)
        L_0x017f:
            androidx.room.RoomDatabase r5 = r2.f19102a
            r5.mo5186b()
            androidx.room.RoomDatabase r2 = r2.f19102a
            android.database.Cursor r2 = r2.mo5193i(r7)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x02cf }
            int r8 = r2.getCount()     // Catch:{ all -> 0x02cf }
            r5.<init>(r8)     // Catch:{ all -> 0x02cf }
        L_0x0193:
            boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x02cf }
            if (r8 == 0) goto L_0x01a5
            byte[] r8 = r2.getBlob(r6)     // Catch:{ all -> 0x02cf }
            androidx.work.b r8 = androidx.work.C1388b.m3715a(r8)     // Catch:{ all -> 0x02cf }
            r5.add(r8)     // Catch:{ all -> 0x02cf }
            goto L_0x0193
        L_0x01a5:
            r2.close()
            r7.release()
            r0.addAll(r5)
            androidx.work.b r0 = r4.mo5655a(r0)
            goto L_0x0113
        L_0x01b4:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r2 = r1.f16087c
            java.util.UUID r8 = java.util.UUID.fromString(r2)
            java.util.ArrayList r10 = r1.f16100p
            androidx.work.WorkerParameters$a r11 = r1.f16089e
            o3.p r2 = r1.f16090f
            int r12 = r2.f19092k
            androidx.work.a r2 = r1.f16094j
            java.util.concurrent.ExecutorService r13 = r2.f5143a
            q3.a r14 = r1.f16092h
            f3.p r15 = r2.f5145c
            p3.r r2 = new p3.r
            androidx.work.impl.WorkDatabase r4 = r1.f16096l
            q3.a r5 = r1.f16092h
            r2.<init>(r4, r5)
            p3.p r4 = new p3.p
            androidx.work.impl.WorkDatabase r5 = r1.f16096l
            n3.a r7 = r1.f16095k
            q3.a r6 = r1.f16092h
            r4.<init>(r5, r7, r6)
            r7 = r0
            r16 = r2
            r17 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.work.ListenableWorker r2 = r1.f16091g
            if (r2 != 0) goto L_0x01fc
            androidx.work.a r2 = r1.f16094j
            f3.p r2 = r2.f5145c
            android.content.Context r4 = r1.f16086b
            o3.p r5 = r1.f16090f
            java.lang.String r5 = r5.f19084c
            androidx.work.ListenableWorker r2 = r2.mo20195a(r4, r5, r0)
            r1.f16091g = r2
        L_0x01fc:
            androidx.work.ListenableWorker r2 = r1.f16091g
            if (r2 != 0) goto L_0x021c
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            o3.p r3 = r1.f16090f
            java.lang.String r3 = r3.f19084c
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Could not create Worker %s"
            java.lang.String.format(r3, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r0.mo20177b(r2)
            r18.mo20290h()
            goto L_0x02c7
        L_0x021c:
            r4 = 0
            boolean r2 = r2.isUsed()
            if (r2 == 0) goto L_0x023e
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            o3.p r3 = r1.f16090f
            java.lang.String r3 = r3.f19084c
            r2[r4] = r3
            java.lang.String r3 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String.format(r3, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r0.mo20177b(r2)
            r18.mo20290h()
            goto L_0x02c7
        L_0x023e:
            androidx.work.ListenableWorker r2 = r1.f16091g
            r2.setUsed()
            androidx.work.impl.WorkDatabase r2 = r1.f16096l
            r2.mo5187c()
            o3.q r2 = r1.f16097m     // Catch:{ all -> 0x02c8 }
            java.lang.String r4 = r1.f16087c     // Catch:{ all -> 0x02c8 }
            o3.r r2 = (p192o3.C5959r) r2     // Catch:{ all -> 0x02c8 }
            androidx.work.WorkInfo$State r2 = r2.mo21948f(r4)     // Catch:{ all -> 0x02c8 }
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x02c8 }
            if (r2 != r4) goto L_0x0270
            o3.q r2 = r1.f16097m     // Catch:{ all -> 0x02c8 }
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo$State.RUNNING     // Catch:{ all -> 0x02c8 }
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ all -> 0x02c8 }
            java.lang.String r6 = r1.f16087c     // Catch:{ all -> 0x02c8 }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x02c8 }
            o3.r r2 = (p192o3.C5959r) r2     // Catch:{ all -> 0x02c8 }
            r2.mo21958p(r4, r5)     // Catch:{ all -> 0x02c8 }
            o3.q r2 = r1.f16097m     // Catch:{ all -> 0x02c8 }
            java.lang.String r4 = r1.f16087c     // Catch:{ all -> 0x02c8 }
            o3.r r2 = (p192o3.C5959r) r2     // Catch:{ all -> 0x02c8 }
            r2.mo21953k(r4)     // Catch:{ all -> 0x02c8 }
            goto L_0x0272
        L_0x0270:
            r7 = 0
            r3 = 0
        L_0x0272:
            androidx.work.impl.WorkDatabase r2 = r1.f16096l     // Catch:{ all -> 0x02c8 }
            r2.mo5194j()     // Catch:{ all -> 0x02c8 }
            androidx.work.impl.WorkDatabase r2 = r1.f16096l
            r2.mo5191g()
            if (r3 == 0) goto L_0x02c4
            boolean r2 = r18.mo20291i()
            if (r2 == 0) goto L_0x0285
            goto L_0x02c7
        L_0x0285:
            androidx.work.impl.utils.futures.a r2 = new androidx.work.impl.utils.futures.a
            r2.<init>()
            p3.n r9 = new p3.n
            android.content.Context r4 = r1.f16086b
            o3.p r5 = r1.f16090f
            androidx.work.ListenableWorker r6 = r1.f16091g
            f3.e r7 = r0.f5139j
            q3.a r8 = r1.f16092h
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            q3.a r0 = r1.f16092h
            q3.b r0 = (p218q3.C6166b) r0
            q3.b$a r0 = r0.f19551c
            r0.execute(r9)
            androidx.work.impl.utils.futures.a<java.lang.Void> r0 = r9.f19281b
            g3.l r3 = new g3.l
            r3.<init>(r1, r0, r2)
            q3.a r4 = r1.f16092h
            q3.b r4 = (p218q3.C6166b) r4
            q3.b$a r4 = r4.f19551c
            r0.addListener(r3, r4)
            java.lang.String r0 = r1.f16101q
            g3.m r3 = new g3.m
            r3.<init>(r1, r2, r0)
            q3.a r0 = r1.f16092h
            q3.b r0 = (p218q3.C6166b) r0
            p3.j r0 = r0.f19549a
            r2.addListener(r3, r0)
            goto L_0x02c7
        L_0x02c4:
            r18.mo20289g()
        L_0x02c7:
            return
        L_0x02c8:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.f16096l
            r2.mo5191g()
            throw r0
        L_0x02cf:
            r0 = move-exception
            r2.close()
            r7.release()
            throw r0
        L_0x02d7:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.f16096l
            r2.mo5191g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p092g3.C4766n.run():void");
    }
}
