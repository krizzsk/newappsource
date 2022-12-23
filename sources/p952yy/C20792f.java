package p952yy;

import android.content.Context;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7923a;
import com.tranzmate.moovit.protocol.linearrivals.MVArrivalTimesConf;
import com.tranzmate.moovit.protocol.linearrivals.MVStopArrivalsRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p066e0.C4454r0;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import q00.C19047a;
import q00.C19053d;
import s00.C19391d;
import u00.C19815e;

/* renamed from: yy.f */
public final class C20792f extends C13778r<C20792f, C20793g, MVStopArrivalsRequest> {

    /* renamed from: A */
    public final String f52475A;

    /* renamed from: w */
    public final C19728f f52476w;

    /* renamed from: x */
    public final C19047a f52477x;

    /* renamed from: y */
    public final List<ServerId> f52478y;

    /* renamed from: z */
    public final C20786b f52479z;

    public C20792f() {
        throw null;
    }

    public C20792f(C13752e eVar, C19728f fVar, C19047a aVar, ArrayList arrayList, C20786b bVar) {
        super(eVar, C19746x.api_path_stop_arrivals_request_path, C20793g.class);
        C21100e.m49373x(fVar, "metroContext");
        this.f52476w = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f52477x = aVar;
        this.f52478y = arrayList;
        C21100e.m49373x(bVar, "requestConfiguration");
        this.f52479z = bVar;
        if (!arrayList.isEmpty()) {
            this.f52475A = C20792f.class.getName() + "#" + C13717b.m34269p(arrayList) + "#" + bVar;
            ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C4454r0(9));
            MVArrivalTimesConf h = C7923a.m18008h(bVar);
            RO mVStopArrivalsRequest = new MVStopArrivalsRequest();
            mVStopArrivalsRequest.stopIds = c;
            mVStopArrivalsRequest.conf = h;
            this.f33922v = mVStopArrivalsRequest;
            return;
        }
        throw new IllegalArgumentException("stopIds may not be empty!");
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return true;
    }

    /* renamed from: E */
    public final List<C20793g> mo21059E() throws IOException, ServerException {
        boolean z;
        int i;
        ArrayList O;
        C19047a a = C19047a.m46164a(this.f51759b.getApplicationContext());
        if (a == null || !((Boolean) a.mo51505b(C19053d.f48483v)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f52479z.f52449c) {
            C19391d d = C19731i.m47197a(this.f51759b).mo52086d(this.f52476w);
            C19815e d2 = d.mo51802d();
            Context context = this.f51759b;
            if (this.f52479z.f52452f) {
                i = 200;
            } else {
                i = 192;
            }
            if (!d2.mo52120l(i, context) || !this.f52479z.f52449c || z || (O = mo52919O(d)) == null) {
                return Collections.emptyList();
            }
            this.f51765h = true;
            return O;
        }
        this.f51765h = true;
        return Collections.emptyList();
    }

    /* renamed from: F */
    public final List<C20793g> mo22677F() {
        ArrayList O;
        C20786b bVar = this.f52479z;
        if (!bVar.f52453g || !bVar.f52449c || (O = mo52919O(C19731i.m47197a(this.f51759b).mo52086d(this.f52476w))) == null) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return O;
    }

    /* renamed from: L */
    public final boolean mo20305L() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f9  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo52919O(s00.C19391d r21) {
        /*
            r20 = this;
            r1 = r20
            u00.e r2 = r21.mo51802d()
            r2.getClass()
            ce0.C21100e.m49355o()
            m40.b r0 = r2.f50356c
            if (r0 != 0) goto L_0x0021
            monitor-enter(r2)
            m40.b r0 = r2.f50356c     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            m40.b r0 = new m40.b     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r2.f50356c = r0     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r0
        L_0x0021:
            m40.b r0 = r2.f50356c
            java.util.List<com.moovit.network.model.ServerId> r2 = r1.f52478y
            int r2 = r2.size()
            c70.e r11 = r1.f33829q
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r2)
            java.util.List<com.moovit.network.model.ServerId> r3 = r1.f52478y
            java.util.Iterator r13 = r3.iterator()
        L_0x0036:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x008c
            java.lang.Object r3 = r13.next()
            r14 = r3
            com.moovit.network.model.ServerId r14 = (com.moovit.network.model.ServerId) r14
            tp.f r15 = r1.f52476w
            q00.a r10 = r1.f52477x
            yy.b r3 = r1.f52479z
            com.moovit.util.time.Time r9 = r3.f52447a
            r0.getClass()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.forResult(r3)
            java.util.concurrent.ThreadPoolExecutor r7 = r0.f18497b
            o40.a r6 = new o40.a
            m40.a r5 = r0.f18496a
            r3 = r6
            r4 = r0
            r16 = r13
            r13 = r6
            r6 = r11
            r1 = r7
            r7 = r15
            r17 = r2
            r2 = r8
            r8 = r10
            r18 = r9
            r19 = r10
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.google.android.gms.tasks.Task r1 = r2.continueWith(r1, r13)
            java.util.concurrent.ThreadPoolExecutor r2 = r0.f18497b
            o40.b r13 = new o40.b
            m40.a r5 = r0.f18496a
            r3 = r13
            r8 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.google.android.gms.tasks.Task r1 = r1.continueWith(r2, r13)
            r12.add(r1)
            r1 = r20
            r13 = r16
            r2 = r17
            goto L_0x0036
        L_0x008c:
            r17 = r2
            r0 = 0
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.whenAll((java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>) r12)     // Catch:{ Exception -> 0x010a }
            com.google.android.gms.tasks.Tasks.await(r1)     // Catch:{ Exception -> 0x010a }
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r17
            r1.<init>(r2)
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x00a0:
            if (r4 >= r2) goto L_0x0104
            r6 = r20
            java.util.List<com.moovit.network.model.ServerId> r7 = r6.f52478y
            java.lang.Object r7 = r7.get(r4)
            com.moovit.network.model.ServerId r7 = (com.moovit.network.model.ServerId) r7
            java.lang.Object r8 = r12.get(r4)
            com.google.android.gms.tasks.Task r8 = (com.google.android.gms.tasks.Task) r8
            java.lang.Object r8 = r8.getResult()
            java.util.List r8 = (java.util.List) r8
            yy.b r9 = r6.f52479z
            boolean r9 = r9.f52452f
            if (r9 == 0) goto L_0x00dd
            if (r8 == 0) goto L_0x00dd
            java.util.HashSet r9 = p952yy.C20785a.m48771c(r8)
            u00.p r10 = r21.mo51804f()
            android.content.Context r11 = r6.f51759b
            java.util.Set r10 = r10.mo52151h(r11, r9)
            int r9 = r9.size()
            int r11 = r10.size()
            if (r9 != r11) goto L_0x00dd
            com.moovit.util.ServerIdMap r9 = com.moovit.util.ServerIdMap.m17949a(r10)
            goto L_0x00de
        L_0x00dd:
            r9 = r0
        L_0x00de:
            if (r8 == 0) goto L_0x00eb
            yy.b r10 = r6.f52479z
            boolean r10 = r10.f52452f
            if (r10 == 0) goto L_0x00e9
            if (r9 != 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r9 = 0
            goto L_0x00ec
        L_0x00eb:
            r9 = 1
        L_0x00ec:
            if (r9 == 0) goto L_0x00f9
            int r5 = r5 + 1
            yy.g r8 = new yy.g
            r8.<init>(r7, r0)
            r1.add(r8)
            goto L_0x0101
        L_0x00f9:
            yy.g r9 = new yy.g
            r9.<init>(r7, r8)
            r1.add(r9)
        L_0x0101:
            int r4 = r4 + 1
            goto L_0x00a0
        L_0x0104:
            r6 = r20
            if (r5 == r2) goto L_0x0109
            r0 = r1
        L_0x0109:
            return r0
        L_0x010a:
            r6 = r20
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p952yy.C20792f.mo52919O(s00.d):java.util.ArrayList");
    }
}
