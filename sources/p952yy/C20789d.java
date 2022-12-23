package p952yy;

import android.content.Context;
import c00.C13717b;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7923a;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalsRequest;
import com.tranzmate.moovit.protocol.linearrivals.MVStopLineIds;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import q00.C19047a;
import q00.C19053d;
import s00.C19391d;
import u00.C19815e;

/* renamed from: yy.d */
public final class C20789d extends C13778r<C20789d, C20791e, MVLineArrivalsRequest> {

    /* renamed from: A */
    public final C20786b f52462A;

    /* renamed from: B */
    public final String f52463B;

    /* renamed from: w */
    public final C19728f f52464w;

    /* renamed from: x */
    public final C19047a f52465x;

    /* renamed from: y */
    public final List<ServerId> f52466y;

    /* renamed from: z */
    public final List<ServerId> f52467z;

    /* renamed from: yy.d$a */
    public static class C20790a {

        /* renamed from: a */
        public final C13752e f52468a;

        /* renamed from: b */
        public final C19728f f52469b;

        /* renamed from: c */
        public final C19047a f52470c;

        /* renamed from: d */
        public final ArrayList f52471d = new ArrayList();

        /* renamed from: e */
        public final ArrayList f52472e = new ArrayList();

        /* renamed from: f */
        public final C20786b f52473f = new C20786b();

        public C20790a(C19728f fVar, C19047a aVar, C13752e eVar) {
            this.f52468a = eVar;
            C21100e.m49373x(fVar, "metroContext");
            this.f52469b = fVar;
            C21100e.m49373x(aVar, "configuration");
            this.f52470c = aVar;
        }
    }

    public C20789d() {
        throw null;
    }

    public C20789d(C13752e eVar, C19728f fVar, C19047a aVar, ArrayList arrayList, ArrayList arrayList2, C20786b bVar) {
        super(eVar, C19746x.api_path_line_arrivals_request_path, C20791e.class);
        C21100e.m49373x(fVar, "metroContext");
        this.f52464w = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f52465x = aVar;
        C21100e.m49373x(arrayList, "lineIds");
        this.f52466y = arrayList;
        C21100e.m49373x(arrayList2, "stopIds");
        this.f52467z = arrayList2;
        C21100e.m49373x(bVar, "requestConfiguration");
        this.f52462A = bVar;
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("lineId and/or stopIds may not be empty!");
        }
        this.f52463B = C20789d.class.getName() + "#" + C13717b.m34269p(arrayList) + "#" + C13717b.m34269p(arrayList2) + "#" + bVar;
        RO mVLineArrivalsRequest = new MVLineArrivalsRequest();
        mVLineArrivalsRequest.conf = C7923a.m18008h(bVar);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int i2 = ((ServerId) arrayList.get(i)).f15142b;
            int i3 = ((ServerId) arrayList2.get(i)).f15142b;
            MVStopLineIds mVStopLineIds = new MVStopLineIds();
            mVStopLineIds.stopId = i3;
            mVStopLineIds.mo28098i();
            mVStopLineIds.lineId = i2;
            mVStopLineIds.mo28096h();
            if (mVLineArrivalsRequest.StopAndlineIds == null) {
                mVLineArrivalsRequest.StopAndlineIds = new ArrayList();
            }
            mVLineArrivalsRequest.StopAndlineIds.add(mVStopLineIds);
        }
        this.f33922v = mVLineArrivalsRequest;
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return true;
    }

    /* renamed from: E */
    public final List<C20791e> mo21059E() throws IOException, ServerException {
        boolean z;
        int i;
        ArrayList O;
        C19047a a = C19047a.m46164a(this.f51759b.getApplicationContext());
        if (a == null || !((Boolean) a.mo51505b(C19053d.f48483v)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f52462A.f52449c) {
            C19391d d = C19731i.m47197a(this.f51759b).mo52086d(this.f52464w);
            C19815e d2 = d.mo51802d();
            Context context = this.f51759b;
            if (this.f52462A.f52452f) {
                i = 1224;
            } else {
                i = 1216;
            }
            if (!d2.mo52120l(i, context) || !this.f52462A.f52449c || z || (O = mo52918O(d)) == null) {
                return Collections.emptyList();
            }
            this.f51765h = true;
            return O;
        }
        this.f51765h = true;
        return Collections.emptyList();
    }

    /* renamed from: F */
    public final List<C20791e> mo22677F() {
        ArrayList O;
        C20786b bVar = this.f52462A;
        if (!bVar.f52453g || !bVar.f52449c || (O = mo52918O(C19731i.m47197a(this.f51759b).mo52086d(this.f52464w))) == null) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return O;
    }

    /* renamed from: L */
    public final boolean mo20305L() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo52918O(s00.C19391d r14) {
        /*
            r13 = this;
            u00.e r0 = r14.mo51802d()
            r0.getClass()
            ce0.C21100e.m49355o()
            m40.b r1 = r0.f50356c
            if (r1 != 0) goto L_0x001f
            monitor-enter(r0)
            m40.b r1 = r0.f50356c     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            m40.b r1 = new m40.b     // Catch:{ all -> 0x001c }
            r1.<init>()     // Catch:{ all -> 0x001c }
            r0.f50356c = r1     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001f
        L_0x001c:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r14
        L_0x001f:
            m40.b r0 = r0.f50356c
            java.util.List<com.moovit.network.model.ServerId> r1 = r13.f52466y
            int r8 = r1.size()
            c70.e r9 = r13.f33829q
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            r11 = 0
            r12 = 0
        L_0x0030:
            if (r12 >= r8) goto L_0x0058
            java.util.List<com.moovit.network.model.ServerId> r1 = r13.f52466y
            java.lang.Object r1 = r1.get(r12)
            r5 = r1
            com.moovit.network.model.ServerId r5 = (com.moovit.network.model.ServerId) r5
            java.util.List<com.moovit.network.model.ServerId> r1 = r13.f52467z
            java.lang.Object r1 = r1.get(r12)
            r6 = r1
            com.moovit.network.model.ServerId r6 = (com.moovit.network.model.ServerId) r6
            tp.f r3 = r13.f52464w
            q00.a r4 = r13.f52465x
            yy.b r1 = r13.f52462A
            com.moovit.util.time.Time r7 = r1.f52447a
            r1 = r0
            r2 = r9
            com.google.android.gms.tasks.Task r1 = r1.mo21544a(r2, r3, r4, r5, r6, r7)
            r10.add(r1)
            int r12 = r12 + 1
            goto L_0x0030
        L_0x0058:
            r0 = 0
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.whenAll((java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>) r10)     // Catch:{ Exception -> 0x00c8 }
            com.google.android.gms.tasks.Tasks.await(r1)     // Catch:{ Exception -> 0x00c8 }
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r2 = 0
            r3 = 0
        L_0x0067:
            if (r2 >= r8) goto L_0x00c5
            java.lang.Object r4 = r10.get(r2)
            com.google.android.gms.tasks.Task r4 = (com.google.android.gms.tasks.Task) r4
            java.lang.Object r4 = r4.getResult()
            yy.c r4 = (p952yy.C20787c) r4
            yy.b r5 = r13.f52462A
            boolean r5 = r5.f52452f
            if (r5 == 0) goto L_0x009e
            if (r4 == 0) goto L_0x009e
            java.util.Set r5 = java.util.Collections.singleton(r4)
            java.util.HashSet r5 = p952yy.C20785a.m48771c(r5)
            u00.p r6 = r14.mo51804f()
            android.content.Context r7 = r13.f51759b
            java.util.Set r6 = r6.mo52151h(r7, r5)
            int r5 = r5.size()
            int r7 = r6.size()
            if (r5 != r7) goto L_0x009e
            com.moovit.util.ServerIdMap r5 = com.moovit.util.ServerIdMap.m17949a(r6)
            goto L_0x009f
        L_0x009e:
            r5 = r0
        L_0x009f:
            if (r4 == 0) goto L_0x00ac
            yy.b r6 = r13.f52462A
            boolean r6 = r6.f52452f
            if (r6 == 0) goto L_0x00aa
            if (r5 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r5 = 0
            goto L_0x00ad
        L_0x00ac:
            r5 = 1
        L_0x00ad:
            if (r5 == 0) goto L_0x00ba
            int r3 = r3 + 1
            yy.e r4 = new yy.e
            r4.<init>(r0)
            r1.add(r4)
            goto L_0x00c2
        L_0x00ba:
            yy.e r5 = new yy.e
            r5.<init>(r4)
            r1.add(r5)
        L_0x00c2:
            int r2 = r2 + 1
            goto L_0x0067
        L_0x00c5:
            if (r3 == r8) goto L_0x00c8
            r0 = r1
        L_0x00c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p952yy.C20789d.mo52918O(s00.d):java.util.ArrayList");
    }
}
