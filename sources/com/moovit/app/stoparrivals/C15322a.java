package com.moovit.app.stoparrivals;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import com.moovit.transit.TransitStop;
import j80.C12778f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C23825c;
import mf0.C24361g;
import mf0.C24362h;
import p227r.C6227a;
import p429cw.C16517g;
import p567iq.C17635b;

/* renamed from: com.moovit.app.stoparrivals.a */
public final class C15322a extends C0989a {

    /* renamed from: c */
    public final long f39631c = TimeUnit.MINUTES.toMillis(60);

    /* renamed from: d */
    public final int f39632d = 8;

    /* renamed from: e */
    public final C12778f f39633e;

    /* renamed from: f */
    public final AtomicReference<C16517g> f39634f;

    /* renamed from: g */
    public final C1043v<TripsUpdateResult> f39635g;

    /* renamed from: h */
    public final C1043v f39636h;

    /* renamed from: i */
    public final C1043v<TripsSelectionUpdate> f39637i;

    /* renamed from: j */
    public final C1043v f39638j;

    /* renamed from: k */
    public final C1040t f39639k;

    /* renamed from: com.moovit.app.stoparrivals.a$a */
    public static final class C15323a<I, O> implements C6227a {
        public final TransitStop apply(TripsUpdateResult tripsUpdateResult) {
            return tripsUpdateResult.f39627b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15322a(Application application, C1001d0 d0Var) {
        super(application);
        C24362h.m61211f(application, "application");
        C24362h.m61211f(d0Var, "savedState");
        C12778f fVar = C17635b.m43779f(application).f50174d;
        C24362h.m61210e(fVar, "from(application).serviceAlertsManager");
        this.f39633e = fVar;
        this.f39634f = new AtomicReference<>((Object) null);
        C1043v<TripsUpdateResult> d = d0Var.mo4294d(false, "stopArrivals", (Object) null);
        this.f39635g = d;
        this.f39636h = d;
        C1043v<TripsSelectionUpdate> d2 = d0Var.mo4294d(false, "selectedArrivals", (Object) null);
        this.f39637i = d2;
        this.f39638j = d2;
        this.f39639k = C24361g.m61135E(C24361g.m61159c0(d, new C15323a()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0101 A[LOOP:0: B:25:0x00fb->B:27:0x0101, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m39192a(com.moovit.app.stoparrivals.C15322a r20, com.moovit.network.model.ServerId r21, java.util.List r22, ff0.C23349c r23) {
        /*
            r0 = r20
            r1 = r23
            r20.getClass()
            boolean r2 = r1 instanceof com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$1
            if (r2 == 0) goto L_0x001a
            r2 = r1
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$1 r2 = (com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001f
        L_0x001a:
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$1 r2 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$1
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0075
            if (r4 == r8) goto L_0x005c
            if (r4 == r7) goto L_0x0046
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            p584jl.C17885a.m44475z0(r1)
            goto L_0x013b
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            p584jl.C17885a.m44475z0(r1)
            goto L_0x012b
        L_0x0046:
            java.lang.Object r0 = r2.L$3
            q00.a r0 = (q00.C19047a) r0
            java.lang.Object r4 = r2.L$2
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r7 = r2.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r10 = r2.L$0
            com.moovit.network.model.ServerId r10 = (com.moovit.network.model.ServerId) r10
            p584jl.C17885a.m44475z0(r1)
            r15 = r0
            goto L_0x00d1
        L_0x005c:
            java.lang.Object r0 = r2.L$3
            lz.a r0 = (p646lz.C18299a) r0
            java.lang.Object r4 = r2.L$2
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            com.moovit.network.model.ServerId r11 = (com.moovit.network.model.ServerId) r11
            p584jl.C17885a.m44475z0(r1)
            r19 = r11
            r11 = r10
            r10 = r19
            goto L_0x00aa
        L_0x0075:
            p584jl.C17885a.m44475z0(r1)
            android.app.Application r0 = r0.f3907b
            java.lang.String r1 = "getApplication()"
            mf0.C24362h.m61210e(r0, r1)
            lz.a r1 = ce0.C21100e.m49329X(r0)
            java.lang.String r4 = "CONFIGURATION"
            com.google.android.gms.tasks.Task r4 = r1.mo50699k(r4)
            java.lang.String r10 = "appDataManager.loadDataP…pDataParts.CONFIGURATION)"
            mf0.C24362h.m61210e(r4, r10)
            r10 = r21
            r2.L$0 = r10
            r11 = r22
            r2.L$1 = r11
            r2.L$2 = r0
            r2.L$3 = r1
            r2.label = r8
            java.lang.Object r4 = com.moovit.commons.async.AsyncExtKt.m40163a(r4, r2)
            if (r4 != r3) goto L_0x00a4
            goto L_0x013c
        L_0x00a4:
            r19 = r4
            r4 = r0
            r0 = r1
            r1 = r19
        L_0x00aa:
            java.lang.String r12 = "appDataManager.loadDataP…ts.CONFIGURATION).await()"
            mf0.C24362h.m61210e(r1, r12)
            q00.a r1 = (q00.C19047a) r1
            java.lang.String r12 = "METRO_CONTEXT"
            com.google.android.gms.tasks.Task r0 = r0.mo50699k(r12)
            java.lang.String r12 = "appDataManager.loadDataP…pDataParts.METRO_CONTEXT)"
            mf0.C24362h.m61210e(r0, r12)
            r2.L$0 = r10
            r2.L$1 = r11
            r2.L$2 = r4
            r2.L$3 = r1
            r2.label = r7
            java.lang.Object r0 = com.moovit.commons.async.AsyncExtKt.m40163a(r0, r2)
            if (r0 != r3) goto L_0x00ce
            goto L_0x013c
        L_0x00ce:
            r15 = r1
            r7 = r11
            r1 = r0
        L_0x00d1:
            java.lang.String r0 = "appDataManager.loadDataP…ts.METRO_CONTEXT).await()"
            mf0.C24362h.m61210e(r1, r0)
            r14 = r1
            tp.f r14 = (p824tp.C19728f) r14
            c70.e r13 = ce0.C21100e.m49341g0(r4)
            java.lang.String r0 = "configuration"
            ce0.C21100e.m49373x(r15, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            yy.b r4 = new yy.b
            r4.<init>()
            r4.f52454h = r8
            r4.f52455i = r8
            r4.f52453g = r8
            java.util.Iterator r7 = r7.iterator()
        L_0x00fb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x010e
            java.lang.Object r8 = r7.next()
            com.moovit.network.model.ServerId r8 = (com.moovit.network.model.ServerId) r8
            r0.add(r8)
            r1.add(r10)
            goto L_0x00fb
        L_0x010e:
            yy.d r7 = new yy.d
            r12 = r7
            r16 = r0
            r17 = r1
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.L$0 = r9
            r2.L$1 = r9
            r2.L$2 = r9
            r2.L$3 = r9
            r2.label = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder r1 = com.moovit.commons.request.C15752a.m40210b(r7)
            if (r1 != r3) goto L_0x012b
            goto L_0x013c
        L_0x012b:
            zh0.c r1 = (zh0.C25522c) r1
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1 r0 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1
            r0.<init>(r1)
            r2.label = r5
            java.lang.Object r1 = p845um.C19958a.m47445u(r0, r2)
            if (r1 != r3) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r3 = r1
        L_0x013c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.C15322a.m39192a(com.moovit.app.stoparrivals.a, com.moovit.network.model.ServerId, java.util.List, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m39193b(com.moovit.app.stoparrivals.C15322a r8, java.util.ArrayList r9, ff0.C23349c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchPatternStops$1
            if (r0 == 0) goto L_0x0016
            r0 = r10
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchPatternStops$1 r0 = (com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchPatternStops$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchPatternStops$1 r0 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchPatternStops$1
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p584jl.C17885a.m44475z0(r10)
            goto L_0x00ae
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p584jl.C17885a.m44475z0(r10)
            goto L_0x00a3
        L_0x003a:
            p584jl.C17885a.m44475z0(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0046:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r9.next()
            com.moovit.app.stoparrivals.StopArrival r2 = (com.moovit.app.stoparrivals.StopArrival) r2
            com.moovit.util.time.Time r2 = r2.f39600c
            com.moovit.network.model.ServerId r2 = r2.mo24630f()
            if (r2 == 0) goto L_0x0046
            r10.add(r2)
            goto L_0x0046
        L_0x005e:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x006c
            i30.d r1 = i30.C5268d.f17403i
            java.lang.String r8 = "empty()"
            mf0.C24362h.m61210e(r1, r8)
            goto L_0x00b4
        L_0x006c:
            android.app.Application r8 = r8.f3907b
            java.lang.String r9 = "getApplication()"
            mf0.C24362h.m61210e(r8, r9)
            c70.e r8 = ce0.C21100e.m49341g0(r8)
            java.lang.Class<com.moovit.app.stoparrivals.a> r9 = com.moovit.app.stoparrivals.C15322a.class
            java.lang.String r9 = r9.getSimpleName()
            android.content.Context r2 = r8.f33852a
            tp.f r2 = p824tp.C19728f.m47195a(r2)
            g30.h r2 = r2.f50165a
            java.lang.String r5 = "metroInfo"
            i30.e r5 = p379.C16759e.m42348d(r2, r5)
            com.moovit.metroentities.MetroEntityType r6 = com.moovit.metroentities.MetroEntityType.TRANSIT_PATTERN
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r7 = r5.f17412b
            r7.mo47002b(r6, r10)
            r5.mo21067b(r6)
            i30.c r10 = new i30.c
            r10.<init>(r8, r9, r2, r5)
            r0.label = r4
            kotlinx.coroutines.flow.CallbackFlowBuilder r10 = com.moovit.commons.request.C15752a.m40210b(r10)
            if (r10 != r1) goto L_0x00a3
            goto L_0x00b4
        L_0x00a3:
            zh0.c r10 = (zh0.C25522c) r10
            r0.label = r3
            java.lang.Object r10 = p845um.C19958a.m47445u(r10, r0)
            if (r10 != r1) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            java.util.List r10 = (java.util.List) r10
            i30.d r1 = i30.C5265a.m13289Q(r10)
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.C15322a.m39193b(com.moovit.app.stoparrivals.a, java.util.ArrayList, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m39194c(com.moovit.app.stoparrivals.C15322a r7, com.moovit.network.model.ServerId r8, java.util.List r9, ff0.C23349c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchSyncEntities$1
            if (r0 == 0) goto L_0x0016
            r0 = r10
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchSyncEntities$1 r0 = (com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchSyncEntities$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchSyncEntities$1 r0 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchSyncEntities$1
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p584jl.C17885a.m44475z0(r10)
            goto L_0x0080
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p584jl.C17885a.m44475z0(r10)
            goto L_0x0075
        L_0x0039:
            p584jl.C17885a.m44475z0(r10)
            android.app.Application r7 = r7.f3907b
            java.lang.String r10 = "getApplication()"
            mf0.C24362h.m61210e(r7, r10)
            c70.e r7 = ce0.C21100e.m49341g0(r7)
            java.lang.Class<com.moovit.app.stoparrivals.a> r10 = com.moovit.app.stoparrivals.C15322a.class
            java.lang.String r10 = r10.getSimpleName()
            android.content.Context r2 = r7.f33852a
            tp.f r2 = p824tp.C19728f.m47195a(r2)
            g30.h r2 = r2.f50165a
            java.lang.String r5 = "metroInfo"
            i30.e r5 = p379.C16759e.m42348d(r2, r5)
            com.moovit.metroentities.MetroEntityType r6 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP
            r5.mo21066a(r6, r8)
            com.moovit.metroentities.MetroEntityType r8 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r6 = r5.f17412b
            r6.mo47002b(r8, r9)
            i30.c r8 = new i30.c
            r8.<init>(r7, r10, r2, r5)
            r0.label = r4
            kotlinx.coroutines.flow.CallbackFlowBuilder r10 = com.moovit.commons.request.C15752a.m40210b(r8)
            if (r10 != r1) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            zh0.c r10 = (zh0.C25522c) r10
            r0.label = r3
            java.lang.Object r10 = p845um.C19958a.m47445u(r10, r0)
            if (r10 != r1) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            java.util.List r10 = (java.util.List) r10
            i30.d r1 = i30.C5265a.m13289Q(r10)
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.C15322a.m39194c(com.moovit.app.stoparrivals.a, com.moovit.network.model.ServerId, java.util.List, ff0.c):java.lang.Object");
    }

    /* renamed from: d */
    public final void mo45886d(int i, String str) {
        List<StopArrival> list;
        StopArrival stopArrival;
        StopArrival stopArrival2;
        TripsUpdateResult value = this.f39635g.getValue();
        if (value != null && (list = value.f39628c) != null && (stopArrival = (StopArrival) C23825c.m58516m0(i, list)) != null) {
            TripsSelectionUpdate tripsSelectionUpdate = (TripsSelectionUpdate) this.f39638j.getValue();
            if (tripsSelectionUpdate != null) {
                stopArrival2 = tripsSelectionUpdate.f39625d;
            } else {
                stopArrival2 = null;
            }
            if (!C24362h.m61206a(stopArrival2, stopArrival)) {
                this.f39637i.postValue(new TripsSelectionUpdate(i, stopArrival2, stopArrival, str));
            }
        }
    }
}
