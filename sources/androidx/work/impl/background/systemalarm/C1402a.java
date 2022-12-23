package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import p081f3.C4656h;
import p092g3.C4753b;

/* renamed from: androidx.work.impl.background.systemalarm.a */
public final class C1402a implements C4753b {

    /* renamed from: e */
    public static final /* synthetic */ int f5181e = 0;

    /* renamed from: b */
    public final Context f5182b;

    /* renamed from: c */
    public final HashMap f5183c = new HashMap();

    /* renamed from: d */
    public final Object f5184d = new Object();

    static {
        C4656h.m11961e("CommandHandler");
    }

    public C1402a(Context context) {
        this.f5182b = context;
    }

    /* renamed from: a */
    public static Intent m3753a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m3754b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5710c(int r10, android.content.Intent r11, androidx.work.impl.background.systemalarm.C1405d r12) {
        /*
            r9 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0113
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r11 = "Handling constraints changed %s"
            java.lang.String.format(r11, r1)
            java.lang.Throwable[] r11 = new java.lang.Throwable[r3]
            r0.mo20176a(r11)
            androidx.work.impl.background.systemalarm.b r11 = new androidx.work.impl.background.systemalarm.b
            android.content.Context r0 = r9.f5182b
            r11.<init>(r0, r10, r12)
            g3.k r10 = r12.f5204f
            androidx.work.impl.WorkDatabase r10 = r10.f16072c
            o3.q r10 = r10.mo5701q()
            o3.r r10 = (p192o3.C5959r) r10
            java.util.ArrayList r10 = r10.mo21947e()
            int r12 = androidx.work.impl.background.systemalarm.ConstraintProxy.f5174a
            java.util.Iterator r12 = r10.iterator()
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x003f:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x0068
            java.lang.Object r7 = r12.next()
            o3.p r7 = (p192o3.C5956p) r7
            f3.b r7 = r7.f19091j
            boolean r8 = r7.f15880d
            r1 = r1 | r8
            boolean r8 = r7.f15878b
            r4 = r4 | r8
            boolean r8 = r7.f15881e
            r5 = r5 | r8
            androidx.work.NetworkType r7 = r7.f15877a
            androidx.work.NetworkType r8 = androidx.work.NetworkType.NOT_REQUIRED
            if (r7 == r8) goto L_0x005e
            r7 = 1
            goto L_0x005f
        L_0x005e:
            r7 = 0
        L_0x005f:
            r6 = r6 | r7
            if (r1 == 0) goto L_0x003f
            if (r4 == 0) goto L_0x003f
            if (r5 == 0) goto L_0x003f
            if (r6 == 0) goto L_0x003f
        L_0x0068:
            int r12 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.f5175a
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r7 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            r12.<init>(r7)
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver> r8 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class
            r7.<init>(r0, r8)
            r12.setComponent(r7)
            java.lang.String r7 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r1 = r12.putExtra(r7, r1)
            java.lang.String r7 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            android.content.Intent r1 = r1.putExtra(r7, r4)
            java.lang.String r4 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r1 = r1.putExtra(r4, r5)
            java.lang.String r4 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            r1.putExtra(r4, r6)
            r0.sendBroadcast(r12)
            k3.d r12 = r11.f5189d
            r12.mo21354b(r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r10.size()
            r12.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r10 = r10.iterator()
        L_0x00ab:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00d3
            java.lang.Object r4 = r10.next()
            o3.p r4 = (p192o3.C5956p) r4
            java.lang.String r5 = r4.f19082a
            long r6 = r4.mo21934a()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00ab
            boolean r6 = r4.mo21935b()
            if (r6 == 0) goto L_0x00cf
            k3.d r6 = r11.f5189d
            boolean r5 = r6.mo21353a(r5)
            if (r5 == 0) goto L_0x00ab
        L_0x00cf:
            r12.add(r4)
            goto L_0x00ab
        L_0x00d3:
            java.util.Iterator r10 = r12.iterator()
        L_0x00d7:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x010c
            java.lang.Object r12 = r10.next()
            o3.p r12 = (p192o3.C5956p) r12
            java.lang.String r12 = r12.f19082a
            android.content.Context r0 = r11.f5186a
            android.content.Intent r0 = m3753a(r0, r12)
            f3.h r1 = p081f3.C4656h.m11960c()
            int r4 = androidx.work.impl.background.systemalarm.C1403b.f5185e
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r12
            java.lang.String r12 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String.format(r12, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r1.mo20176a(r12)
            androidx.work.impl.background.systemalarm.d r12 = r11.f5188c
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b
            int r4 = r11.f5187b
            r1.<init>(r4, r0, r12)
            r12.mo5721d(r1)
            goto L_0x00d7
        L_0x010c:
            k3.d r10 = r11.f5189d
            r10.mo21355c()
            goto L_0x0331
        L_0x0113:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            r4 = 2
            if (r1 == 0) goto L_0x013b
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r2] = r10
            java.lang.String r10 = "Handling reschedule %s, %s"
            java.lang.String.format(r10, r1)
            java.lang.Throwable[] r10 = new java.lang.Throwable[r3]
            r0.mo20176a(r10)
            g3.k r10 = r12.f5204f
            r10.mo20278j()
            goto L_0x0331
        L_0x013b:
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String r5 = "KEY_WORKSPEC_ID"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            if (r1 == 0) goto L_0x015f
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x014e
            goto L_0x015f
        L_0x014e:
            r6 = 0
        L_0x014f:
            if (r6 >= r2) goto L_0x015d
            r7 = r5[r6]
            java.lang.Object r7 = r1.get(r7)
            if (r7 != 0) goto L_0x015a
            goto L_0x015f
        L_0x015a:
            int r6 = r6 + 1
            goto L_0x014f
        L_0x015d:
            r1 = 1
            goto L_0x0160
        L_0x015f:
            r1 = 0
        L_0x0160:
            if (r1 != 0) goto L_0x017a
            f3.h r10 = p081f3.C4656h.m11960c()
            java.lang.String r11 = "Invalid request for %s, requires %s."
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r3] = r0
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r12[r2] = r0
            java.lang.String.format(r11, r12)
            java.lang.Throwable[] r11 = new java.lang.Throwable[r3]
            r10.mo20177b(r11)
            goto L_0x0331
        L_0x017a:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0239
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r5 = "Handling schedule work for %s"
            java.lang.String.format(r5, r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]
            r0.mo20176a(r1)
            g3.k r0 = r12.f5204f
            androidx.work.impl.WorkDatabase r0 = r0.f16072c
            r0.mo5187c()
            o3.q r1 = r0.mo5701q()     // Catch:{ all -> 0x0234 }
            o3.r r1 = (p192o3.C5959r) r1     // Catch:{ all -> 0x0234 }
            o3.p r1 = r1.mo21951i(r11)     // Catch:{ all -> 0x0234 }
            if (r1 != 0) goto L_0x01bb
            f3.h r10 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0234 }
            java.lang.Throwable[] r11 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0234 }
            r10.mo20179f(r11)     // Catch:{ all -> 0x0234 }
            goto L_0x022f
        L_0x01bb:
            androidx.work.WorkInfo$State r5 = r1.f19083b     // Catch:{ all -> 0x0234 }
            boolean r5 = r5.isFinished()     // Catch:{ all -> 0x0234 }
            if (r5 == 0) goto L_0x01cd
            f3.h r10 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0234 }
            java.lang.Throwable[] r11 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0234 }
            r10.mo20179f(r11)     // Catch:{ all -> 0x0234 }
            goto L_0x022f
        L_0x01cd:
            long r5 = r1.mo21934a()     // Catch:{ all -> 0x0234 }
            boolean r1 = r1.mo21935b()     // Catch:{ all -> 0x0234 }
            if (r1 != 0) goto L_0x01f7
            f3.h r10 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0234 }
            java.lang.String r1 = "Setting up Alarms for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0234 }
            r4[r3] = r11     // Catch:{ all -> 0x0234 }
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0234 }
            r4[r2] = r7     // Catch:{ all -> 0x0234 }
            java.lang.String.format(r1, r4)     // Catch:{ all -> 0x0234 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0234 }
            r10.mo20176a(r1)     // Catch:{ all -> 0x0234 }
            android.content.Context r10 = r9.f5182b     // Catch:{ all -> 0x0234 }
            g3.k r12 = r12.f5204f     // Catch:{ all -> 0x0234 }
            p118i3.C5263a.m13284b(r10, r12, r11, r5)     // Catch:{ all -> 0x0234 }
            goto L_0x022c
        L_0x01f7:
            f3.h r1 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x0234 }
            java.lang.String r7 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0234 }
            r4[r3] = r11     // Catch:{ all -> 0x0234 }
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0234 }
            r4[r2] = r8     // Catch:{ all -> 0x0234 }
            java.lang.String.format(r7, r4)     // Catch:{ all -> 0x0234 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0234 }
            r1.mo20176a(r2)     // Catch:{ all -> 0x0234 }
            android.content.Context r1 = r9.f5182b     // Catch:{ all -> 0x0234 }
            g3.k r2 = r12.f5204f     // Catch:{ all -> 0x0234 }
            p118i3.C5263a.m13284b(r1, r2, r11, r5)     // Catch:{ all -> 0x0234 }
            android.content.Context r11 = r9.f5182b     // Catch:{ all -> 0x0234 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0234 }
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r2 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r1.<init>(r11, r2)     // Catch:{ all -> 0x0234 }
            java.lang.String r11 = "ACTION_CONSTRAINTS_CHANGED"
            r1.setAction(r11)     // Catch:{ all -> 0x0234 }
            androidx.work.impl.background.systemalarm.d$b r11 = new androidx.work.impl.background.systemalarm.d$b     // Catch:{ all -> 0x0234 }
            r11.<init>(r10, r1, r12)     // Catch:{ all -> 0x0234 }
            r12.mo5721d(r11)     // Catch:{ all -> 0x0234 }
        L_0x022c:
            r0.mo5194j()     // Catch:{ all -> 0x0234 }
        L_0x022f:
            r0.mo5191g()
            goto L_0x0331
        L_0x0234:
            r10 = move-exception
            r0.mo5191g()
            throw r10
        L_0x0239:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0290
            android.os.Bundle r11 = r11.getExtras()
            java.lang.Object r1 = r9.f5184d
            monitor-enter(r1)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)     // Catch:{ all -> 0x028d }
            f3.h r0 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x028d }
            java.lang.String r4 = "Handing delay met for %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x028d }
            r5[r3] = r11     // Catch:{ all -> 0x028d }
            java.lang.String.format(r4, r5)     // Catch:{ all -> 0x028d }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x028d }
            r0.mo20176a(r4)     // Catch:{ all -> 0x028d }
            java.util.HashMap r0 = r9.f5183c     // Catch:{ all -> 0x028d }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x028d }
            if (r0 != 0) goto L_0x0278
            androidx.work.impl.background.systemalarm.c r0 = new androidx.work.impl.background.systemalarm.c     // Catch:{ all -> 0x028d }
            android.content.Context r2 = r9.f5182b     // Catch:{ all -> 0x028d }
            r0.<init>(r2, r10, r11, r12)     // Catch:{ all -> 0x028d }
            java.util.HashMap r10 = r9.f5183c     // Catch:{ all -> 0x028d }
            r10.put(r11, r0)     // Catch:{ all -> 0x028d }
            r0.mo5715d()     // Catch:{ all -> 0x028d }
            goto L_0x028a
        L_0x0278:
            f3.h r10 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x028d }
            java.lang.String r12 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x028d }
            r0[r3] = r11     // Catch:{ all -> 0x028d }
            java.lang.String.format(r12, r0)     // Catch:{ all -> 0x028d }
            java.lang.Throwable[] r11 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x028d }
            r10.mo20176a(r11)     // Catch:{ all -> 0x028d }
        L_0x028a:
            monitor-exit(r1)     // Catch:{ all -> 0x028d }
            goto L_0x0331
        L_0x028d:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x028d }
            throw r10
        L_0x0290:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02eb
            android.os.Bundle r10 = r11.getExtras()
            java.lang.String r11 = "KEY_WORKSPEC_ID"
            java.lang.String r10 = r10.getString(r11)
            f3.h r11 = p081f3.C4656h.m11960c()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r10
            java.lang.String r1 = "Handing stopWork work for %s"
            java.lang.String.format(r1, r0)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r11.mo20176a(r0)
            g3.k r11 = r12.f5204f
            r11.mo20280l(r10)
            android.content.Context r11 = r9.f5182b
            g3.k r0 = r12.f5204f
            int r1 = p118i3.C5263a.f17393a
            androidx.work.impl.WorkDatabase r0 = r0.f16072c
            o3.h r0 = r0.mo5698n()
            o3.i r0 = (p192o3.C5943i) r0
            o3.g r1 = r0.mo21929a(r10)
            if (r1 == 0) goto L_0x02e7
            int r1 = r1.f19067b
            p118i3.C5263a.m13283a(r11, r1, r10)
            f3.h r11 = p081f3.C4656h.m11960c()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r10
            java.lang.String r2 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String.format(r2, r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]
            r11.mo20176a(r1)
            r0.mo21931c(r10)
        L_0x02e7:
            r12.mo5711e(r10, r3)
            goto L_0x0331
        L_0x02eb:
            java.lang.String r12 = "ACTION_EXECUTION_COMPLETED"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x031f
            android.os.Bundle r12 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r1 = "KEY_NEEDS_RESCHEDULE"
            boolean r12 = r12.getBoolean(r1)
            f3.h r1 = p081f3.C4656h.m11960c()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r2] = r10
            java.lang.String r10 = "Handling onExecutionCompleted %s, %s"
            java.lang.String.format(r10, r4)
            java.lang.Throwable[] r10 = new java.lang.Throwable[r3]
            r1.mo20176a(r10)
            r9.mo5711e(r0, r12)
            goto L_0x0331
        L_0x031f:
            f3.h r10 = p081f3.C4656h.m11960c()
            java.lang.String r12 = "Ignoring intent %s"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r11
            java.lang.String.format(r12, r0)
            java.lang.Throwable[] r11 = new java.lang.Throwable[r3]
            r10.mo20179f(r11)
        L_0x0331:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.C1402a.mo5710c(int, android.content.Intent, androidx.work.impl.background.systemalarm.d):void");
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        synchronized (this.f5184d) {
            C4753b bVar = (C4753b) this.f5183c.remove(str);
            if (bVar != null) {
                bVar.mo5711e(str, z);
            }
        }
    }
}
