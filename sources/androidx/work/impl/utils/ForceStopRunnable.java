package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.C1385a;
import java.util.concurrent.TimeUnit;
import p081f3.C4656h;
import p092g3.C4763k;
import p177n1.C5799a;
import p205p3.C6044i;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    public static final long f5232e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    public final Context f5233b;

    /* renamed from: c */
    public final C4763k f5234c;

    /* renamed from: d */
    public int f5235d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            C4656h.m11961e("ForceStopRunnable$Rcvr");
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                int i = ((C4656h.C4657a) C4656h.m11960c()).f15900b;
                ForceStopRunnable.m3778c(context);
            }
        }
    }

    static {
        C4656h.m11961e("ForceStopRunnable");
    }

    public ForceStopRunnable(Context context, C4763k kVar) {
        this.f5233b = context.getApplicationContext();
        this.f5234c = kVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: c */
    public static void m3778c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (C5799a.m14228b()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f5232e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5733a() {
        /*
            r15 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = -1
            r6 = 23
            if (r0 < r6) goto L_0x00fb
            android.content.Context r0 = r15.f5233b
            g3.k r6 = r15.f5234c
            int r7 = p131j3.C5373b.f17688f
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r0.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            java.util.ArrayList r0 = p131j3.C5373b.m13480f(r0, r7)
            androidx.work.impl.WorkDatabase r8 = r6.f16072c
            o3.h r8 = r8.mo5698n()
            o3.i r8 = (p192o3.C5943i) r8
            r8.getClass()
            java.lang.String r9 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            q2.k r9 = p217q2.C6162k.m14718a(r3, r9)
            androidx.room.RoomDatabase r10 = r8.f19068a
            r10.mo5186b()
            androidx.room.RoomDatabase r8 = r8.f19068a
            android.database.Cursor r8 = r8.mo5193i(r9)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f3 }
            int r11 = r8.getCount()     // Catch:{ all -> 0x00f3 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f3 }
        L_0x0042:
            boolean r11 = r8.moveToNext()     // Catch:{ all -> 0x00f3 }
            if (r11 == 0) goto L_0x0050
            java.lang.String r11 = r8.getString(r3)     // Catch:{ all -> 0x00f3 }
            r10.add(r11)     // Catch:{ all -> 0x00f3 }
            goto L_0x0042
        L_0x0050:
            r8.close()
            r9.release()
            if (r0 == 0) goto L_0x005d
            int r8 = r0.size()
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r8)
            if (r0 == 0) goto L_0x00a1
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x00a1
            java.util.Iterator r0 = r0.iterator()
        L_0x006f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00a1
            java.lang.Object r8 = r0.next()
            android.app.job.JobInfo r8 = (android.app.job.JobInfo) r8
            java.lang.String r11 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r12 = r8.getExtras()
            if (r12 == 0) goto L_0x008e
            boolean r13 = r12.containsKey(r11)     // Catch:{ NullPointerException -> 0x008e }
            if (r13 == 0) goto L_0x008e
            java.lang.String r11 = r12.getString(r11)     // Catch:{ NullPointerException -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r11 = r1
        L_0x008f:
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0099
            r9.add(r11)
            goto L_0x006f
        L_0x0099:
            int r8 = r8.getId()
            p131j3.C5373b.m13478c(r7, r8)
            goto L_0x006f
        L_0x00a1:
            java.util.Iterator r0 = r10.iterator()
        L_0x00a5:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00c4
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r9.contains(r7)
            if (r7 != 0) goto L_0x00a5
            f3.h r0 = p081f3.C4656h.m11960c()
            int r7 = p131j3.C5373b.f17688f
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r0.mo20176a(r7)
            r0 = 1
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            if (r0 == 0) goto L_0x00fc
            androidx.work.impl.WorkDatabase r6 = r6.f16072c
            r6.mo5187c()
            o3.q r7 = r6.mo5701q()     // Catch:{ all -> 0x00ee }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x00ee }
        L_0x00d4:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00ee }
            if (r9 == 0) goto L_0x00e7
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00ee }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00ee }
            r10 = r7
            o3.r r10 = (p192o3.C5959r) r10     // Catch:{ all -> 0x00ee }
            r10.mo21954l(r4, r9)     // Catch:{ all -> 0x00ee }
            goto L_0x00d4
        L_0x00e7:
            r6.mo5194j()     // Catch:{ all -> 0x00ee }
            r6.mo5191g()
            goto L_0x00fc
        L_0x00ee:
            r0 = move-exception
            r6.mo5191g()
            throw r0
        L_0x00f3:
            r0 = move-exception
            r8.close()
            r9.release()
            throw r0
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            g3.k r6 = r15.f5234c
            androidx.work.impl.WorkDatabase r6 = r6.f16072c
            o3.q r7 = r6.mo5701q()
            o3.n r8 = r6.mo5700p()
            r6.mo5187c()
            o3.r r7 = (p192o3.C5959r) r7     // Catch:{ all -> 0x0237 }
            java.util.ArrayList r9 = r7.mo21946d()     // Catch:{ all -> 0x0237 }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0237 }
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x0139
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0237 }
        L_0x011c:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0237 }
            if (r11 == 0) goto L_0x0139
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0237 }
            o3.p r11 = (p192o3.C5956p) r11     // Catch:{ all -> 0x0237 }
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x0237 }
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x0237 }
            java.lang.String r14 = r11.f19082a     // Catch:{ all -> 0x0237 }
            r13[r3] = r14     // Catch:{ all -> 0x0237 }
            r7.mo21958p(r12, r13)     // Catch:{ all -> 0x0237 }
            java.lang.String r11 = r11.f19082a     // Catch:{ all -> 0x0237 }
            r7.mo21954l(r4, r11)     // Catch:{ all -> 0x0237 }
            goto L_0x011c
        L_0x0139:
            o3.o r8 = (p192o3.C5952o) r8     // Catch:{ all -> 0x0237 }
            r8.mo21933b()     // Catch:{ all -> 0x0237 }
            r6.mo5194j()     // Catch:{ all -> 0x0237 }
            r6.mo5191g()
            if (r10 != 0) goto L_0x014b
            if (r0 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r0 = 0
            goto L_0x014c
        L_0x014b:
            r0 = 1
        L_0x014c:
            g3.k r4 = r15.f5234c
            p3.h r4 = r4.f16076g
            androidx.work.impl.WorkDatabase r4 = r4.f19266a
            o3.e r4 = r4.mo5697m()
            o3.f r4 = (p192o3.C5939f) r4
            java.lang.String r5 = "reschedule_needed"
            java.lang.Long r4 = r4.mo21925a(r5)
            if (r4 == 0) goto L_0x016c
            long r6 = r4.longValue()
            r8 = 1
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x016c
            r4 = 1
            goto L_0x016d
        L_0x016c:
            r4 = 0
        L_0x016d:
            if (r4 == 0) goto L_0x0198
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]
            r0.mo20176a(r1)
            g3.k r0 = r15.f5234c
            r0.mo20278j()
            g3.k r0 = r15.f5234c
            p3.h r0 = r0.f16076g
            r0.getClass()
            o3.d r1 = new o3.d
            r2 = 0
            r1.<init>(r5, r2)
            androidx.work.impl.WorkDatabase r0 = r0.f19266a
            o3.e r0 = r0.mo5697m()
            o3.f r0 = (p192o3.C5939f) r0
            r0.mo21926b(r1)
            goto L_0x0236
        L_0x0198:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r5 = p177n1.C5799a.m14228b()     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            if (r5 == 0) goto L_0x01a2
            r4 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x01a2:
            android.content.Context r5 = r15.f5233b     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            r6.<init>()     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r8 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class
            r7.<init>(r5, r8)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            r6.setComponent(r7)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            java.lang.String r7 = "ACTION_FORCE_STOP_RESCHEDULE"
            r6.setAction(r7)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            r7 = -1
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r5, r7, r6, r4)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            r6 = 30
            if (r5 < r6) goto L_0x01f7
            if (r4 == 0) goto L_0x01c8
            r4.cancel()     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
        L_0x01c8:
            android.content.Context r4 = r15.f5233b     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            java.lang.String r5 = "activity"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            java.util.List r1 = r4.getHistoricalProcessExitReasons(r1, r3, r3)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            if (r1 == 0) goto L_0x01ff
            boolean r4 = r1.isEmpty()     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            if (r4 != 0) goto L_0x01ff
            r4 = 0
        L_0x01df:
            int r5 = r1.size()     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            if (r4 >= r5) goto L_0x01ff
            java.lang.Object r5 = r1.get(r4)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            android.app.ApplicationExitInfo r5 = (android.app.ApplicationExitInfo) r5     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            int r5 = r5.getReason()     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            r6 = 10
            if (r5 != r6) goto L_0x01f4
            goto L_0x020f
        L_0x01f4:
            int r4 = r4 + 1
            goto L_0x01df
        L_0x01f7:
            if (r4 != 0) goto L_0x01ff
            android.content.Context r1 = r15.f5233b     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            m3778c(r1)     // Catch:{ SecurityException -> 0x0203, IllegalArgumentException -> 0x0201 }
            goto L_0x020f
        L_0x01ff:
            r2 = 0
            goto L_0x020f
        L_0x0201:
            r1 = move-exception
            goto L_0x0204
        L_0x0203:
            r1 = move-exception
        L_0x0204:
            f3.h r4 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r5[r3] = r1
            r4.mo20179f(r5)
        L_0x020f:
            if (r2 == 0) goto L_0x0220
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]
            r0.mo20176a(r1)
            g3.k r0 = r15.f5234c
            r0.mo20278j()
            goto L_0x0236
        L_0x0220:
            if (r0 == 0) goto L_0x0236
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]
            r0.mo20176a(r1)
            g3.k r0 = r15.f5234c
            androidx.work.a r1 = r0.f16071b
            androidx.work.impl.WorkDatabase r2 = r0.f16072c
            java.util.List<g3.e> r0 = r0.f16074e
            p092g3.C4758f.m12072a(r1, r2, r0)
        L_0x0236:
            return
        L_0x0237:
            r0 = move-exception
            r6.mo5191g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.mo5733a():void");
    }

    /* renamed from: b */
    public final boolean mo5734b() {
        C1385a aVar = this.f5234c.f16071b;
        aVar.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            C4656h.m11960c().mo20176a(new Throwable[0]);
            return true;
        }
        boolean a = C6044i.m14530a(this.f5233b, aVar);
        C4656h c = C4656h.m11960c();
        String.format("Is default app process = %s", new Object[]{Boolean.valueOf(a)});
        c.mo20176a(new Throwable[0]);
        return a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000c A[LOOP:0: B:5:0x000c->B:24:0x000c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = r10.mo5734b()     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x000c
        L_0x0006:
            g3.k r0 = r10.f5234c
            r0.mo20277i()
            return
        L_0x000c:
            android.content.Context r0 = r10.f5233b     // Catch:{ all -> 0x0073 }
            p092g3.C4762j.m12078a(r0)     // Catch:{ all -> 0x0073 }
            f3.h r0 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0073 }
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]     // Catch:{ all -> 0x0073 }
            r0.mo20176a(r2)     // Catch:{ all -> 0x0073 }
            r10.mo5733a()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x0029, SQLiteDatabaseCorruptException -> 0x0027, SQLiteDatabaseLockedException -> 0x0025, SQLiteTableLockedException -> 0x0023, SQLiteConstraintException -> 0x0021, SQLiteAccessPermException -> 0x001f }
            goto L_0x0006
        L_0x001f:
            r0 = move-exception
            goto L_0x002a
        L_0x0021:
            r0 = move-exception
            goto L_0x002a
        L_0x0023:
            r0 = move-exception
            goto L_0x002a
        L_0x0025:
            r0 = move-exception
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            goto L_0x002a
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            int r2 = r10.f5235d     // Catch:{ all -> 0x0073 }
            r3 = 1
            int r2 = r2 + r3
            r10.f5235d = r2     // Catch:{ all -> 0x0073 }
            r4 = 3
            if (r2 >= r4) goto L_0x0059
            long r4 = (long) r2     // Catch:{ all -> 0x0073 }
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            f3.h r2 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0073 }
            java.lang.String r8 = "Retrying after %s"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0073 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0073 }
            r9[r1] = r4     // Catch:{ all -> 0x0073 }
            java.lang.String.format(r8, r9)     // Catch:{ all -> 0x0073 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0073 }
            r3[r1] = r0     // Catch:{ all -> 0x0073 }
            r2.mo20176a(r3)     // Catch:{ all -> 0x0073 }
            int r0 = r10.f5235d     // Catch:{ all -> 0x0073 }
            long r0 = (long) r0
            long r0 = r0 * r6
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x0059:
            java.lang.String r2 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            f3.h r4 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0073 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0073 }
            r3[r1] = r0     // Catch:{ all -> 0x0073 }
            r4.mo20177b(r3)     // Catch:{ all -> 0x0073 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0073 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0073 }
            g3.k r0 = r10.f5234c     // Catch:{ all -> 0x0073 }
            androidx.work.a r0 = r0.f16071b     // Catch:{ all -> 0x0073 }
            r0.getClass()     // Catch:{ all -> 0x0073 }
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            g3.k r1 = r10.f5234c
            r1.mo20277i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
