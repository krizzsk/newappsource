package com.moovit.ticketing.validation.receipt.offline;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.moovit.MoovitApplication;
import java.util.concurrent.TimeUnit;
import p081f3.C4648b;
import p081f3.C4658i;
import p092g3.C4763k;

public final class TicketReceiptSyncManager extends Worker {
    public TicketReceiptSyncManager(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static void m17739a(MoovitApplication moovitApplication) {
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        C4648b bVar = new C4648b(aVar);
        BackoffPolicy backoffPolicy = BackoffPolicy.LINEAR;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C4763k.m12079g(moovitApplication).mo20186b("com.moovit.ticketing.ticket_receipt", ExistingWorkPolicy.REPLACE, (C4658i) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(TicketReceiptSyncManager.class).mo20192f(bVar)).mo20191e(backoffPolicy, timeUnit)).mo20193g(10, timeUnit)).mo20190b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.ListenableWorker.C1379a doWork() {
        /*
            r14 = this;
            int r0 = r14.getRunAttemptCount()
            r1 = 5
            if (r0 < r1) goto L_0x000d
            androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
            r0.<init>()
            goto L_0x0012
        L_0x000d:
            androidx.work.ListenableWorker$a$b r0 = new androidx.work.ListenableWorker$a$b
            r0.<init>()
        L_0x0012:
            android.content.Context r1 = r14.getApplicationContext()
            com.moovit.MoovitApplication r1 = (com.moovit.MoovitApplication) r1
            m90.c r2 = m90.C12892c.m32688r(r1)
            lz.a r3 = r1.f37321e
            java.lang.String r4 = "TICKETING_CONFIGURATION"
            r5 = 0
            java.lang.Object r3 = r3.mo50695h(r4, r5)
            p80.b r3 = (p80.C12991b) r3
            if (r3 == 0) goto L_0x0159
            if (r2 != 0) goto L_0x002d
            goto L_0x0159
        L_0x002d:
            com.moovit.ticketing.configuration.TicketingAgencyCapability r4 = com.moovit.ticketing.configuration.TicketingAgencyCapability.OFFLINE_MODE
            boolean r4 = r3.mo39881b(r4)
            if (r4 != 0) goto L_0x0036
            return r0
        L_0x0036:
            r4 = 0
            m80.v r6 = m80.C12887v.m32668b()     // Catch:{ Exception -> 0x004a }
            com.google.android.gms.tasks.Task r6 = r6.mo39736g(r5)     // Catch:{ Exception -> 0x004a }
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x004a }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r7, r9)     // Catch:{ Exception -> 0x004a }
            s90.d r6 = (s90.C13076d) r6     // Catch:{ Exception -> 0x004a }
            goto L_0x004c
        L_0x004a:
            r6 = r4
        L_0x004c:
            if (r6 != 0) goto L_0x004f
            return r0
        L_0x004f:
            p90.a r7 = new p90.a
            r7.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<p80.a>> r9 = r3.f32159a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0063:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0088
            java.lang.Object r10 = r9.next()
            com.moovit.network.model.ServerId r10 = (com.moovit.network.model.ServerId) r10
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<p80.a>> r11 = r3.f32159a
            java.lang.Object r10 = r11.get(r10)
            java.util.List r10 = (java.util.List) r10
            at.a r11 = new at.a
            r12 = 6
            r11.<init>(r12)
            wt.e r12 = new wt.e
            r13 = 17
            r12.<init>(r13)
            c00.C13720d.m34276f(r10, r11, r12, r8)
            goto L_0x0063
        L_0x0088:
            java.util.Set r3 = java.util.Collections.emptySet()
            java.util.Set<com.moovit.ticketing.ticket.Ticket$Status> r9 = s90.C13076d.f32345h
            java.util.List r3 = r6.mo39944b(r3, r9)
            pq.k r6 = new pq.k
            r9 = 7
            r6.<init>(r8, r9)
            com.facebook.appevents.l r8 = new com.facebook.appevents.l
            r9 = 26
            r8.<init>(r9)
            java.util.ArrayList r3 = c00.C13720d.m34273c(r3, r6, r8)
            s0.b r6 = new s0.b
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ac:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00d2
            java.lang.Object r8 = r3.next()
            r9 = r8
            com.moovit.ticketing.ticket.TicketId r9 = (com.moovit.ticketing.ticket.TicketId) r9
            com.moovit.network.model.ServerId r9 = r9.f23511b
            java.lang.Object r10 = r6.getOrDefault(r9, r4)
            java.util.Collection r10 = (java.util.Collection) r10
            if (r10 != 0) goto L_0x00ce
            r10 = 10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r10)
            r6.put(r9, r11)
            r10 = r11
        L_0x00ce:
            r10.add(r8)
            goto L_0x00ac
        L_0x00d2:
            java.util.Set r3 = r6.entrySet()
            s0.g$b r3 = (p241s0.C6307g.C6309b) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 1
            r6 = 1
        L_0x00de:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0152
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            com.moovit.network.model.ServerId r9 = (com.moovit.network.model.ServerId) r9
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            r8.size()
            pq.i r10 = new pq.i
            r11 = 4
            r10.<init>(r2, r11)
            java.util.ArrayList r10 = c00.C13723g.m34282c(r8, r10)
            boolean r11 = c00.C13717b.m34258e(r10)
            if (r11 != 0) goto L_0x011b
            r10.size()
            c70.e r11 = r1.mo44560l()     // Catch:{ Exception -> 0x0119 }
            q80.t r12 = new q80.t     // Catch:{ Exception -> 0x0119 }
            r12.<init>(r11, r9, r10)     // Catch:{ Exception -> 0x0119 }
            r12.mo52626J()     // Catch:{ Exception -> 0x0119 }
            goto L_0x011b
        L_0x0119:
            r9 = 0
            goto L_0x011c
        L_0x011b:
            r9 = 1
        L_0x011c:
            java.util.Iterator r8 = r8.iterator()
        L_0x0120:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0150
            java.lang.Object r10 = r8.next()
            com.moovit.ticketing.ticket.TicketId r10 = (com.moovit.ticketing.ticket.TicketId) r10
            m90.b r10 = r2.get(r10)
            if (r10 == 0) goto L_0x014d
            java.lang.Object r11 = r10.mo24270a(r7)     // Catch:{ Exception -> 0x0144 }
            m90.b r11 = (m90.C12890b) r11     // Catch:{ Exception -> 0x0144 }
            if (r11 == 0) goto L_0x0142
            com.moovit.ticketing.ticket.TicketId r12 = r11.f31901a     // Catch:{ Exception -> 0x0144 }
            boolean r10 = r2.put(r12, r11)     // Catch:{ Exception -> 0x0144 }
            if (r10 == 0) goto L_0x0148
        L_0x0142:
            r10 = 1
            goto L_0x0149
        L_0x0144:
            com.moovit.ticketing.ticket.TicketId r10 = r10.f31901a
            java.lang.String r10 = r10.f23513d
        L_0x0148:
            r10 = 0
        L_0x0149:
            if (r10 == 0) goto L_0x014d
            r10 = 1
            goto L_0x014e
        L_0x014d:
            r10 = 0
        L_0x014e:
            r9 = r9 & r10
            goto L_0x0120
        L_0x0150:
            r6 = r6 & r9
            goto L_0x00de
        L_0x0152:
            if (r6 == 0) goto L_0x0159
            androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c
            r0.<init>()
        L_0x0159:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.validation.receipt.offline.TicketReceiptSyncManager.doWork():androidx.work.ListenableWorker$a");
    }
}
