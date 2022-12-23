package p131j3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.C1385a;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p081f3.C4656h;
import p092g3.C4757e;
import p092g3.C4763k;
import p192o3.C5937d;
import p192o3.C5939f;
import p192o3.C5941g;
import p192o3.C5943i;
import p192o3.C5956p;
import p192o3.C5959r;
import p205p3.C6041f;

/* renamed from: j3.b */
public final class C5373b implements C4757e {

    /* renamed from: f */
    public static final /* synthetic */ int f17688f = 0;

    /* renamed from: b */
    public final Context f17689b;

    /* renamed from: c */
    public final JobScheduler f17690c;

    /* renamed from: d */
    public final C4763k f17691d;

    /* renamed from: e */
    public final C5371a f17692e;

    static {
        C4656h.m11961e("SystemJobScheduler");
    }

    public C5373b(Context context, C4763k kVar) {
        C5371a aVar = new C5371a(context);
        this.f17689b = context;
        this.f17691d = kVar;
        this.f17690c = (JobScheduler) context.getSystemService("jobscheduler");
        this.f17692e = aVar;
    }

    /* renamed from: c */
    public static void m13478c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C4656h c = C4656h.m11960c();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)});
            c.mo20177b(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0012 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m13479e(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = m13480f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L_0x0008
            return r6
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L_0x0031
            boolean r4 = r3.containsKey(r2)     // Catch:{ NullPointerException -> 0x0031 }
            if (r4 == 0) goto L_0x0031
            java.lang.String r2 = r3.getString(r2)     // Catch:{ NullPointerException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r2 = r6
        L_0x0032:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0012
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L_0x0012
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p131j3.C5373b.m13479e(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: f */
    public static ArrayList m13480f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C4656h.m11960c().mo20177b(th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo20270a(C5956p... pVarArr) {
        int i;
        int i2;
        ArrayList e;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C5956p[] pVarArr2 = pVarArr;
        Class<C6041f> cls = C6041f.class;
        WorkDatabase workDatabase = this.f17691d.f16072c;
        int length = pVarArr2.length;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            C5956p pVar = pVarArr2[i9];
            workDatabase.mo5187c();
            try {
                C5956p i11 = ((C5959r) workDatabase.mo5701q()).mo21951i(pVar.f19082a);
                if (i11 == null) {
                    C4656h.m11960c().mo20179f(new Throwable[i8]);
                    workDatabase.mo5194j();
                } else if (i11.f19083b != WorkInfo$State.ENQUEUED) {
                    C4656h.m11960c().mo20179f(new Throwable[i8]);
                    workDatabase.mo5194j();
                } else {
                    C5941g a = ((C5943i) workDatabase.mo5698n()).mo21929a(pVar.f19082a);
                    if (a != null) {
                        i2 = a.f19067b;
                        i = i9;
                    } else {
                        this.f17691d.f16071b.getClass();
                        int i12 = this.f17691d.f16071b.f5149g;
                        synchronized (cls) {
                            workDatabase.mo5187c();
                            try {
                                Long a2 = ((C5939f) workDatabase.mo5697m()).mo21925a("next_job_scheduler_id");
                                if (a2 != null) {
                                    i6 = a2.intValue();
                                } else {
                                    i6 = 0;
                                }
                                if (i6 == Integer.MAX_VALUE) {
                                    i7 = 0;
                                } else {
                                    i7 = i6 + 1;
                                }
                                i = i9;
                                ((C5939f) workDatabase.mo5697m()).mo21926b(new C5937d("next_job_scheduler_id", (long) i7));
                                workDatabase.mo5194j();
                                if (i6 >= 0) {
                                    if (i6 <= i12) {
                                        i2 = i6;
                                    }
                                }
                                ((C5939f) workDatabase.mo5697m()).mo21926b(new C5937d("next_job_scheduler_id", (long) 1));
                                i2 = 0;
                            } finally {
                                workDatabase.mo5191g();
                            }
                        }
                    }
                    if (a == null) {
                        ((C5943i) this.f17691d.f16072c.mo5698n()).mo21930b(new C5941g(pVar.f19082a, i2));
                    }
                    mo21152g(pVar, i2);
                    if (Build.VERSION.SDK_INT == 23 && (e = m13479e(this.f17689b, this.f17690c, pVar.f19082a)) != null) {
                        int indexOf = e.indexOf(Integer.valueOf(i2));
                        if (indexOf >= 0) {
                            e.remove(indexOf);
                        }
                        if (!e.isEmpty()) {
                            i3 = ((Integer) e.get(0)).intValue();
                        } else {
                            this.f17691d.f16071b.getClass();
                            int i13 = this.f17691d.f16071b.f5149g;
                            synchronized (cls) {
                                workDatabase.mo5187c();
                                try {
                                    Long a3 = ((C5939f) workDatabase.mo5697m()).mo21925a("next_job_scheduler_id");
                                    if (a3 != null) {
                                        i4 = a3.intValue();
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i4 == Integer.MAX_VALUE) {
                                        i5 = 0;
                                    } else {
                                        i5 = i4 + 1;
                                    }
                                    ((C5939f) workDatabase.mo5697m()).mo21926b(new C5937d("next_job_scheduler_id", (long) i5));
                                    workDatabase.mo5194j();
                                    if (i4 >= 0) {
                                        if (i4 <= i13) {
                                            i3 = i4;
                                        }
                                    }
                                    ((C5939f) workDatabase.mo5697m()).mo21926b(new C5937d("next_job_scheduler_id", (long) 1));
                                    i3 = 0;
                                } finally {
                                    workDatabase.mo5191g();
                                }
                            }
                        }
                        mo21152g(pVar, i3);
                    }
                    workDatabase.mo5194j();
                    workDatabase.mo5191g();
                    i9 = i + 1;
                    i8 = 0;
                }
                i = i9;
                workDatabase.mo5191g();
                i9 = i + 1;
                i8 = 0;
            } catch (Throwable th) {
                workDatabase.mo5191g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo20271b(String str) {
        ArrayList e = m13479e(this.f17689b, this.f17690c, str);
        if (e != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                m13478c(this.f17690c, ((Integer) it.next()).intValue());
            }
            ((C5943i) this.f17691d.f16072c.mo5698n()).mo21931c(str);
        }
    }

    /* renamed from: d */
    public final boolean mo20272d() {
        return true;
    }

    /* renamed from: g */
    public final void mo21152g(C5956p pVar, int i) {
        int i2;
        int i3;
        JobInfo a = this.f17692e.mo21151a(pVar, i);
        C4656h c = C4656h.m11960c();
        String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f19082a, Integer.valueOf(i)});
        c.mo20176a(new Throwable[0]);
        try {
            if (this.f17690c.schedule(a) == 0) {
                C4656h c2 = C4656h.m11960c();
                String.format("Unable to schedule work ID %s", new Object[]{pVar.f19082a});
                c2.mo20179f(new Throwable[0]);
                if (pVar.f19098q && pVar.f19099r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f19098q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f19082a});
                    C4656h.m11960c().mo20176a(new Throwable[0]);
                    mo21152g(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList f = m13480f(this.f17689b, this.f17690c);
            if (f != null) {
                i2 = f.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(((C5959r) this.f17691d.f16072c.mo5701q()).mo21947e().size());
            C1385a aVar = this.f17691d.f16071b;
            if (Build.VERSION.SDK_INT == 23) {
                i3 = aVar.f5150h / 2;
            } else {
                i3 = aVar.f5150h;
            }
            objArr[2] = Integer.valueOf(i3);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            C4656h.m11960c().mo20177b(new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C4656h c3 = C4656h.m11960c();
            String.format("Unable to schedule %s", new Object[]{pVar});
            c3.mo20177b(th);
        }
    }
}
