package p205p3;

import androidx.work.C1388b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import p081f3.C4648b;
import p081f3.C4656h;
import p081f3.C4660j;
import p092g3.C4754c;
import p092g3.C4758f;
import p092g3.C4759g;
import p092g3.C4763k;
import p192o3.C5956p;

/* renamed from: p3.e */
public final class C6040e implements Runnable {

    /* renamed from: b */
    public final C4759g f19264b;

    /* renamed from: c */
    public final C4754c f19265c = new C4754c();

    static {
        C4656h.m11961e("EnqueueRunnable");
    }

    public C6040e(C4759g gVar) {
        this.f19264b = gVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d1, code lost:
        if (r4.hasNext() == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d3, code lost:
        r3.mo21943a(((p192o3.C5956p.C5957a) r4.next()).f19100a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01df, code lost:
        r16 = false;
        r17 = false;
        r13 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01bd, code lost:
        if (r16 != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bf, code lost:
        r3 = (p192o3.C5959r) r11.mo5701q();
        r4 = r3.mo21952j(r7).iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0186  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m14527a(p092g3.C4759g r22) {
        /*
            r0 = r22
            java.util.List<g3.g> r1 = r0.f16062g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003e
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r1.next()
            g3.g r5 = (p092g3.C4759g) r5
            boolean r6 = r5.f16063h
            if (r6 != 0) goto L_0x0023
            boolean r5 = m14527a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            f3.h r6 = p081f3.C4656h.m11960c()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.util.ArrayList r5 = r5.f16060e
            java.lang.String r8 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r8, r5)
            r7[r3] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String.format(r5, r7)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]
            r6.mo20179f(r5)
            goto L_0x000d
        L_0x003e:
            r4 = 0
        L_0x003f:
            java.util.HashSet r1 = p092g3.C4759g.m12074g(r22)
            g3.k r5 = r0.f16056a
            java.util.List<? extends f3.o> r6 = r0.f16059d
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f16057b
            androidx.work.ExistingWorkPolicy r8 = r0.f16058c
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r11 = r5.f16072c
            if (r1 == 0) goto L_0x0060
            int r12 = r1.length
            if (r12 <= 0) goto L_0x0060
            r12 = 1
            goto L_0x0061
        L_0x0060:
            r12 = 0
        L_0x0061:
            if (r12 == 0) goto L_0x00ae
            int r13 = r1.length
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x006a:
            if (r14 >= r13) goto L_0x00b3
            r3 = r1[r14]
            o3.q r19 = r11.mo5701q()
            r2 = r19
            o3.r r2 = (p192o3.C5959r) r2
            o3.p r2 = r2.mo21951i(r3)
            if (r2 != 0) goto L_0x0092
            f3.h r1 = p081f3.C4656h.m11960c()
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r2 = 0
            r5[r2] = r3
            java.lang.String r3 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String.format(r3, r5)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r1.mo20177b(r3)
            goto L_0x00f9
        L_0x0092:
            androidx.work.WorkInfo$State r2 = r2.f19083b
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.SUCCEEDED
            if (r2 != r3) goto L_0x009a
            r3 = 1
            goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            r15 = r15 & r3
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.FAILED
            if (r2 != r3) goto L_0x00a3
            r16 = 1
            goto L_0x00a9
        L_0x00a3:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.CANCELLED
            if (r2 != r3) goto L_0x00a9
            r17 = 1
        L_0x00a9:
            int r14 = r14 + 1
            r2 = 1
            r3 = 0
            goto L_0x006a
        L_0x00ae:
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x00b3:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00bf
            if (r12 != 0) goto L_0x00bf
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            if (r3 == 0) goto L_0x01f4
            o3.q r3 = r11.mo5701q()
            o3.r r3 = (p192o3.C5959r) r3
            java.util.ArrayList r3 = r3.mo21952j(r7)
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L_0x01f4
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.APPEND
            if (r8 == r13) goto L_0x012b
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r8 != r13) goto L_0x00db
            goto L_0x012b
        L_0x00db:
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.KEEP
            if (r8 != r13) goto L_0x00ff
            java.util.Iterator r8 = r3.iterator()
        L_0x00e3:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x00ff
            java.lang.Object r13 = r8.next()
            o3.p$a r13 = (p192o3.C5956p.C5957a) r13
            androidx.work.WorkInfo$State r13 = r13.f19101b
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.ENQUEUED
            if (r13 == r14) goto L_0x00f9
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.RUNNING
            if (r13 != r14) goto L_0x00e3
        L_0x00f9:
            r20 = r4
            r1 = 1
            r3 = 0
            goto L_0x035f
        L_0x00ff:
            p3.c r8 = new p3.c
            r13 = 0
            r8.<init>(r5, r7, r13)
            r8.run()
            o3.q r8 = r11.mo5701q()
            java.util.Iterator r3 = r3.iterator()
        L_0x0110:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0125
            java.lang.Object r13 = r3.next()
            o3.p$a r13 = (p192o3.C5956p.C5957a) r13
            java.lang.String r13 = r13.f19100a
            r14 = r8
            o3.r r14 = (p192o3.C5959r) r14
            r14.mo21943a(r13)
            goto L_0x0110
        L_0x0125:
            r20 = r4
            r0 = 0
            r3 = 1
            goto L_0x01f8
        L_0x012b:
            o3.b r12 = r11.mo5696l()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0138:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x01b4
            java.lang.Object r14 = r3.next()
            o3.p$a r14 = (p192o3.C5956p.C5957a) r14
            r19 = r3
            java.lang.String r3 = r14.f19100a
            r20 = r4
            r4 = r12
            o3.c r4 = (p192o3.C5935c) r4
            r4.getClass()
            r21 = r12
            java.lang.String r12 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r0 = 1
            q2.k r12 = p217q2.C6162k.m14718a(r0, r12)
            if (r3 != 0) goto L_0x015f
            r12.bindNull(r0)
            goto L_0x0162
        L_0x015f:
            r12.bindString(r0, r3)
        L_0x0162:
            androidx.room.RoomDatabase r0 = r4.f19060a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r4.f19060a
            android.database.Cursor r3 = r0.mo5193i(r12)
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x017c
            r0 = 0
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x01ac }
            if (r4 == 0) goto L_0x017d
            r4 = 1
            goto L_0x017e
        L_0x017c:
            r0 = 0
        L_0x017d:
            r4 = 0
        L_0x017e:
            r3.close()
            r12.release()
            if (r4 != 0) goto L_0x01a3
            androidx.work.WorkInfo$State r3 = r14.f19101b
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo$State.SUCCEEDED
            if (r3 != r4) goto L_0x018e
            r4 = 1
            goto L_0x018f
        L_0x018e:
            r4 = 0
        L_0x018f:
            r4 = r4 & r15
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo$State.FAILED
            if (r3 != r12) goto L_0x0197
            r16 = 1
            goto L_0x019d
        L_0x0197:
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo$State.CANCELLED
            if (r3 != r12) goto L_0x019d
            r17 = 1
        L_0x019d:
            java.lang.String r3 = r14.f19100a
            r13.add(r3)
            r15 = r4
        L_0x01a3:
            r0 = r22
            r3 = r19
            r4 = r20
            r12 = r21
            goto L_0x0138
        L_0x01ac:
            r0 = move-exception
            r3.close()
            r12.release()
            throw r0
        L_0x01b4:
            r20 = r4
            r0 = 0
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r8 != r3) goto L_0x01e7
            if (r17 != 0) goto L_0x01bf
            if (r16 == 0) goto L_0x01e7
        L_0x01bf:
            o3.q r3 = r11.mo5701q()
            o3.r r3 = (p192o3.C5959r) r3
            java.util.ArrayList r4 = r3.mo21952j(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x01cd:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01df
            java.lang.Object r8 = r4.next()
            o3.p$a r8 = (p192o3.C5956p.C5957a) r8
            java.lang.String r8 = r8.f19100a
            r3.mo21943a(r8)
            goto L_0x01cd
        L_0x01df:
            java.util.List r13 = java.util.Collections.emptyList()
            r16 = 0
            r17 = 0
        L_0x01e7:
            java.lang.Object[] r1 = r13.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01f2
            r12 = 1
            goto L_0x01f7
        L_0x01f2:
            r12 = 0
            goto L_0x01f7
        L_0x01f4:
            r20 = r4
            r0 = 0
        L_0x01f7:
            r3 = 0
        L_0x01f8:
            java.util.Iterator r4 = r6.iterator()
        L_0x01fc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x035c
            java.lang.Object r6 = r4.next()
            f3.o r6 = (p081f3.C4670o) r6
            o3.p r8 = r6.f15905b
            if (r12 == 0) goto L_0x0221
            if (r15 != 0) goto L_0x0221
            if (r16 == 0) goto L_0x0215
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.FAILED
            r8.f19083b = r13
            goto L_0x022e
        L_0x0215:
            if (r17 == 0) goto L_0x021c
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.CANCELLED
            r8.f19083b = r13
            goto L_0x022e
        L_0x021c:
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.BLOCKED
            r8.f19083b = r13
            goto L_0x022e
        L_0x0221:
            boolean r13 = r8.mo21936c()
            if (r13 != 0) goto L_0x022a
            r8.f19095n = r9
            goto L_0x022e
        L_0x022a:
            r13 = 0
            r8.f19095n = r13
        L_0x022e:
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 23
            if (r13 < r14) goto L_0x023c
            r14 = 25
            if (r13 > r14) goto L_0x023c
            m14528b(r8)
            goto L_0x026d
        L_0x023c:
            r14 = 22
            if (r13 > r14) goto L_0x026d
            java.lang.String r13 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ ClassNotFoundException -> 0x0266 }
            java.util.List<g3.e> r14 = r5.f16074e     // Catch:{ ClassNotFoundException -> 0x0266 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ ClassNotFoundException -> 0x0266 }
        L_0x024c:
            boolean r18 = r14.hasNext()     // Catch:{ ClassNotFoundException -> 0x0266 }
            if (r18 == 0) goto L_0x0267
            java.lang.Object r18 = r14.next()     // Catch:{ ClassNotFoundException -> 0x0266 }
            g3.e r18 = (p092g3.C4757e) r18     // Catch:{ ClassNotFoundException -> 0x0266 }
            java.lang.Class r0 = r18.getClass()     // Catch:{ ClassNotFoundException -> 0x0266 }
            boolean r0 = r13.isAssignableFrom(r0)     // Catch:{ ClassNotFoundException -> 0x0266 }
            if (r0 == 0) goto L_0x0264
            r0 = 1
            goto L_0x0268
        L_0x0264:
            r0 = 0
            goto L_0x024c
        L_0x0266:
        L_0x0267:
            r0 = 0
        L_0x0268:
            if (r0 == 0) goto L_0x026d
            m14528b(r8)
        L_0x026d:
            androidx.work.WorkInfo$State r0 = r8.f19083b
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.ENQUEUED
            if (r0 != r13) goto L_0x0274
            r3 = 1
        L_0x0274:
            o3.q r0 = r11.mo5701q()
            r13 = r0
            o3.r r13 = (p192o3.C5959r) r13
            androidx.room.RoomDatabase r0 = r13.f19102a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r13.f19102a
            r0.mo5187c()
            o3.r$a r0 = r13.f19103b     // Catch:{ all -> 0x0355 }
            r0.mo22125e(r8)     // Catch:{ all -> 0x0355 }
            androidx.room.RoomDatabase r0 = r13.f19102a     // Catch:{ all -> 0x0355 }
            r0.mo5194j()     // Catch:{ all -> 0x0355 }
            androidx.room.RoomDatabase r0 = r13.f19102a
            r0.mo5191g()
            if (r12 == 0) goto L_0x02d5
            int r0 = r1.length
            r8 = 0
        L_0x0298:
            if (r8 >= r0) goto L_0x02d5
            r13 = r1[r8]
            o3.a r14 = new o3.a
            r18 = r0
            java.util.UUID r0 = r6.f15904a
            java.lang.String r0 = r0.toString()
            r14.<init>(r0, r13)
            o3.b r0 = r11.mo5696l()
            r13 = r0
            o3.c r13 = (p192o3.C5935c) r13
            androidx.room.RoomDatabase r0 = r13.f19060a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r13.f19060a
            r0.mo5187c()
            o3.c$a r0 = r13.f19061b     // Catch:{ all -> 0x02ce }
            r0.mo22125e(r14)     // Catch:{ all -> 0x02ce }
            androidx.room.RoomDatabase r0 = r13.f19060a     // Catch:{ all -> 0x02ce }
            r0.mo5194j()     // Catch:{ all -> 0x02ce }
            androidx.room.RoomDatabase r0 = r13.f19060a
            r0.mo5191g()
            int r8 = r8 + 1
            r0 = r18
            goto L_0x0298
        L_0x02ce:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r13.f19060a
            r1.mo5191g()
            throw r0
        L_0x02d5:
            java.util.Set<java.lang.String> r0 = r6.f15906c
            java.util.Iterator r0 = r0.iterator()
        L_0x02db:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x031d
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            o3.t r13 = r11.mo5702r()
            o3.s r14 = new o3.s
            r18 = r0
            java.util.UUID r0 = r6.f15904a
            java.lang.String r0 = r0.toString()
            r14.<init>(r8, r0)
            o3.u r13 = (p192o3.C5970u) r13
            androidx.room.RoomDatabase r0 = r13.f19113a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r13.f19113a
            r0.mo5187c()
            o3.u$a r0 = r13.f19114b     // Catch:{ all -> 0x0316 }
            r0.mo22125e(r14)     // Catch:{ all -> 0x0316 }
            androidx.room.RoomDatabase r0 = r13.f19113a     // Catch:{ all -> 0x0316 }
            r0.mo5194j()     // Catch:{ all -> 0x0316 }
            androidx.room.RoomDatabase r0 = r13.f19113a
            r0.mo5191g()
            r0 = r18
            goto L_0x02db
        L_0x0316:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r13.f19113a
            r1.mo5191g()
            throw r0
        L_0x031d:
            if (r2 == 0) goto L_0x0352
            o3.k r0 = r11.mo5699o()
            o3.j r8 = new o3.j
            java.util.UUID r6 = r6.f15904a
            java.lang.String r6 = r6.toString()
            r8.<init>(r7, r6)
            r6 = r0
            o3.l r6 = (p192o3.C5948l) r6
            androidx.room.RoomDatabase r0 = r6.f19073a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r6.f19073a
            r0.mo5187c()
            o3.l$a r0 = r6.f19074b     // Catch:{ all -> 0x034b }
            r0.mo22125e(r8)     // Catch:{ all -> 0x034b }
            androidx.room.RoomDatabase r0 = r6.f19073a     // Catch:{ all -> 0x034b }
            r0.mo5194j()     // Catch:{ all -> 0x034b }
            androidx.room.RoomDatabase r0 = r6.f19073a
            r0.mo5191g()
            goto L_0x0352
        L_0x034b:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r6.f19073a
            r1.mo5191g()
            throw r0
        L_0x0352:
            r0 = 0
            goto L_0x01fc
        L_0x0355:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r13.f19102a
            r1.mo5191g()
            throw r0
        L_0x035c:
            r1 = 1
            r0 = r22
        L_0x035f:
            r0.f16063h = r1
            r0 = r20 | r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p205p3.C6040e.m14527a(g3.g):boolean");
    }

    /* renamed from: b */
    public static void m14528b(C5956p pVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        C4648b bVar = pVar.f19091j;
        String str = pVar.f19084c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (bVar.f15880d || bVar.f15881e) {
            C1388b.C1389a aVar = new C1388b.C1389a();
            aVar.mo5695a(pVar.f19086e.f5152a);
            aVar.f5153a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f19084c = cls.getName();
            C1388b bVar2 = new C1388b(aVar.f5153a);
            C1388b.m3716c(bVar2);
            pVar.f19086e = bVar2;
        }
    }

    public final void run() {
        WorkDatabase workDatabase;
        try {
            C4759g gVar = this.f19264b;
            gVar.getClass();
            if (!C4759g.m12073f(gVar, new HashSet())) {
                workDatabase = this.f19264b.f16056a.f16072c;
                workDatabase.mo5187c();
                boolean a = m14527a(this.f19264b);
                workDatabase.mo5194j();
                workDatabase.mo5191g();
                if (a) {
                    C6042g.m14529a(this.f19264b.f16056a.f16070a, RescheduleReceiver.class, true);
                    C4763k kVar = this.f19264b.f16056a;
                    C4758f.m12072a(kVar.f16071b, kVar.f16072c, kVar.f16074e);
                }
                this.f19265c.mo20261a(C4660j.f15901a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f19264b}));
        } catch (Throwable th) {
            this.f19265c.mo20261a(new C4660j.C4661a.C4662a(th));
        }
    }
}
