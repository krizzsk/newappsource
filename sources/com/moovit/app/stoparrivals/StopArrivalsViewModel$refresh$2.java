package com.moovit.app.stoparrivals;

import bf0.C21050d;
import com.moovit.network.model.ServerId;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2", mo58555f = "StopArrivalsViewModel.kt", mo58556l = {160, 161, 166, 170}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopArrivalsViewModel$refresh$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ List<ServerId> $lineIds;
    public final /* synthetic */ ServerId $stopId;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C15322a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$refresh$2(C15322a aVar, ServerId serverId, List<ServerId> list, C23349c<? super StopArrivalsViewModel$refresh$2> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$stopId = serverId;
        this.$lineIds = list;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        StopArrivalsViewModel$refresh$2 stopArrivalsViewModel$refresh$2 = new StopArrivalsViewModel$refresh$2(this.this$0, this.$stopId, this.$lineIds, cVar);
        stopArrivalsViewModel$refresh$2.L$0 = obj;
        return stopArrivalsViewModel$refresh$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StopArrivalsViewModel$refresh$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: type inference failed for: r1v44, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x057e, code lost:
        if (r5 != -1) goto L_0x0582;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x040c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0591 A[LOOP:14: B:211:0x058b->B:213:0x0591, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f0 A[LOOP:6: B:56:0x01ea->B:58:0x01f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            r44 = this;
            r0 = r44
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 2
            if (r2 == 0) goto L_0x0062
            if (r2 == r5) goto L_0x0053
            if (r2 == r7) goto L_0x0045
            if (r2 == r3) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            java.lang.Object r1 = r0.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.L$1
            cw.g r2 = (p429cw.C16517g) r2
            java.lang.Object r3 = r0.L$0
            java.util.List r3 = (java.util.List) r3
            p584jl.C17885a.m44475z0(r45)
            r7 = r1
            r1 = r45
            goto L_0x04bd
        L_0x0029:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0031:
            java.lang.Object r2 = r0.L$2
            cw.g r2 = (p429cw.C16517g) r2
            java.lang.Object r3 = r0.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.L$0
            i30.d r4 = (i30.C5268d) r4
            p584jl.C17885a.m44475z0(r45)
            r5 = r1
            r1 = r45
            goto L_0x0412
        L_0x0045:
            java.lang.Object r2 = r0.L$1
            i30.d r2 = (i30.C5268d) r2
            java.lang.Object r3 = r0.L$0
            wh0.c0 r3 = (wh0.C25162c0) r3
            p584jl.C17885a.m44475z0(r45)
            r4 = r45
            goto L_0x00b5
        L_0x0053:
            java.lang.Object r2 = r0.L$1
            wh0.c0 r2 = (wh0.C25162c0) r2
            java.lang.Object r3 = r0.L$0
            wh0.c0 r3 = (wh0.C25162c0) r3
            p584jl.C17885a.m44475z0(r45)
            r4 = r3
            r3 = r45
            goto L_0x00a1
        L_0x0062:
            p584jl.C17885a.m44475z0(r45)
            java.lang.Object r2 = r0.L$0
            wh0.z r2 = (wh0.C25235z) r2
            com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$syncEntitiesDeferred$1 r3 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$syncEntitiesDeferred$1
            com.moovit.app.stoparrivals.a r4 = r0.this$0
            com.moovit.network.model.ServerId r8 = r0.$stopId
            java.util.List<com.moovit.network.model.ServerId> r9 = r0.$lineIds
            r3.<init>(r4, r8, r9, r6)
            wh0.d0 r3 = wh0.C25177g.m63217a(r2, r3)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1 r4 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1
            com.moovit.app.stoparrivals.a r8 = r0.this$0
            com.moovit.network.model.ServerId r9 = r0.$stopId
            java.util.List<com.moovit.network.model.ServerId> r10 = r0.$lineIds
            r4.<init>(r8, r9, r10, r6)
            wh0.d0 r4 = wh0.C25177g.m63217a(r2, r4)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1 r8 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1
            com.moovit.app.stoparrivals.a r9 = r0.this$0
            com.moovit.network.model.ServerId r10 = r0.$stopId
            r8.<init>(r9, r10, r6)
            wh0.d0 r2 = wh0.C25177g.m63217a(r2, r8)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r3 = r3.mo61764h(r0)
            if (r3 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            i30.d r3 = (i30.C5268d) r3
            r0.L$0 = r2
            r0.L$1 = r3
            r0.label = r7
            java.lang.Object r4 = r4.mo61764h(r0)
            if (r4 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            r43 = r3
            r3 = r2
            r2 = r43
        L_0x00b5:
            java.util.List r4 = (java.util.List) r4
            com.moovit.app.stoparrivals.a r5 = r0.this$0
            com.moovit.network.model.ServerId r6 = r0.$stopId
            r5.getClass()
            com.moovit.transit.TransitStop r7 = r2.mo21064c(r6)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Iterator r9 = r4.iterator()
        L_0x00cb:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r10 = r9.next()
            r11 = r10
            yy.c r11 = (p952yy.C20787c) r11
            com.moovit.network.model.ServerId r11 = r11.f52456a
            java.lang.Object r12 = r8.get(r11)
            if (r12 != 0) goto L_0x00e8
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r8.put(r11, r12)
        L_0x00e8:
            java.util.List r12 = (java.util.List) r12
            r12.add(r10)
            goto L_0x00cb
        L_0x00ee:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r10 = r8.size()
            int r10 = p389bl.C13637c.m34083z(r10)
            r9.<init>(r10)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0103:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0122:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0164
            java.lang.Object r13 = r10.next()
            yy.c r13 = (p952yy.C20787c) r13
            com.moovit.transit.Schedule r13 = r13.f52458c
            java.util.List<com.moovit.util.time.Time> r13 = r13.f23660b
            java.lang.String r14 = "it.schedule.arrivals"
            mf0.C24362h.m61210e(r13, r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0140:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x015e
            java.lang.Object r15 = r13.next()
            r45 = r8
            r8 = r15
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            com.moovit.network.model.LongServerId r8 = r8.f23904e
            if (r8 == 0) goto L_0x0155
            r8 = 1
            goto L_0x0156
        L_0x0155:
            r8 = 0
        L_0x0156:
            if (r8 == 0) goto L_0x015b
            r14.add(r15)
        L_0x015b:
            r8 = r45
            goto L_0x0140
        L_0x015e:
            r45 = r8
            cf0.C21140n.m49439a0(r14, r12)
            goto L_0x0122
        L_0x0164:
            r45 = r8
            r9.put(r11, r12)
            goto L_0x0103
        L_0x016a:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r10 = r9.size()
            int r10 = p389bl.C13637c.m34083z(r10)
            r8.<init>(r10)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x017f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01cc
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x019e:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x01c4
            java.lang.Object r13 = r10.next()
            r14 = r13
            com.moovit.util.time.Time r14 = (com.moovit.util.time.Time) r14
            com.moovit.network.model.LongServerId r14 = r14.f23904e
            mf0.C24362h.m61208c(r14)
            java.lang.Object r15 = r12.get(r14)
            if (r15 != 0) goto L_0x01be
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r12.put(r14, r15)
        L_0x01be:
            java.util.List r15 = (java.util.List) r15
            r15.add(r13)
            goto L_0x019e
        L_0x01c4:
            java.util.Map r10 = kotlin.collections.C23826d.m58535Z(r12)
            r8.put(r11, r10)
            goto L_0x017f
        L_0x01cc:
            java.util.Collection r9 = r8.values()
            cf0.p r9 = kotlin.collections.C23825c.m58506c0(r9)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$createTripsResult$vehicleIds$1 r10 = com.moovit.app.stoparrivals.StopArrivalsViewModel$createTripsResult$vehicleIds$1.f39621f
            th0.f r9 = kotlin.sequences.C24177b.m60548i0(r9, r10)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$createTripsResult$vehicleIds$2 r10 = com.moovit.app.stoparrivals.StopArrivalsViewModel$createTripsResult$vehicleIds$2.f39622f
            th0.e r9 = kotlin.sequences.C24177b.m60543d0(r9, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            th0.e$a r11 = new th0.e$a
            r11.<init>(r9)
        L_0x01ea:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L_0x0202
            java.lang.Object r9 = r11.next()
            r12 = r9
            com.moovit.util.time.Time r12 = (com.moovit.util.time.Time) r12
            com.moovit.util.time.TimeVehicleLocation r12 = r12.f23912m
            mf0.C24362h.m61208c(r12)
            java.lang.String r12 = r12.f23924b
            r10.put(r12, r9)
            goto L_0x01ea
        L_0x0202:
            java.util.Map r9 = kotlin.collections.C23826d.m58535Z(r10)
            cw.g r10 = new cw.g
            java.lang.String r11 = "stop"
            mf0.C24362h.m61210e(r7, r11)
            r10.<init>(r7, r8, r9)
            java.util.concurrent.atomic.AtomicReference<cw.g> r5 = r5.f39634f
            java.lang.Object r5 = r5.get()
            cw.g r5 = (p429cw.C16517g) r5
            if (r5 == 0) goto L_0x03e0
            com.moovit.transit.TransitStop r7 = r5.f43128a
            com.moovit.network.model.ServerId r7 = r7.f23730b
            boolean r6 = mf0.C24362h.m61206a(r6, r7)
            if (r6 == 0) goto L_0x03e0
            java.util.Set r6 = r8.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x022c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x03e0
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            com.moovit.network.model.ServerId r8 = (com.moovit.network.model.ServerId) r8
            java.lang.Object r7 = r7.getValue()
            java.util.Map r7 = (java.util.Map) r7
            java.util.Map<com.moovit.network.model.ServerId, java.util.Map<com.moovit.network.model.LongServerId, java.util.List<com.moovit.util.time.Time>>> r9 = r5.f43129b
            java.lang.Object r8 = r9.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0254:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x03dc
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r11 = r9.getKey()
            com.moovit.network.model.LongServerId r11 = (com.moovit.network.model.LongServerId) r11
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            if (r8 == 0) goto L_0x0275
            java.lang.Object r11 = r8.get(r11)
            java.util.List r11 = (java.util.List) r11
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            java.util.Iterator r12 = r9.iterator()
            r13 = 0
        L_0x027b:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x03d8
            java.lang.Object r14 = r12.next()
            int r15 = r13 + 1
            if (r13 < 0) goto L_0x03d3
            com.moovit.util.time.Time r14 = (com.moovit.util.time.Time) r14
            if (r11 == 0) goto L_0x0294
            java.lang.Object r16 = kotlin.collections.C23825c.m58516m0(r13, r11)
            com.moovit.util.time.Time r16 = (com.moovit.util.time.Time) r16
            goto L_0x0296
        L_0x0294:
            r16 = 0
        L_0x0296:
            r45 = r6
            r6 = r16
            r16 = r7
            java.util.Map<java.lang.String, com.moovit.util.time.Time> r7 = r10.f43130c
            java.util.Set r7 = r7.keySet()
            r17 = r8
            com.moovit.util.time.TimeVehicleLocation r8 = r14.f23912m
            if (r8 != 0) goto L_0x02c2
            if (r6 == 0) goto L_0x02c2
            com.moovit.util.time.TimeVehicleLocation r8 = r6.f23912m
            if (r8 == 0) goto L_0x02b1
            java.lang.String r8 = r8.f23924b
            goto L_0x02b2
        L_0x02b1:
            r8 = 0
        L_0x02b2:
            boolean r7 = kotlin.collections.C23825c.m58507d0(r7, r8)
            if (r7 != 0) goto L_0x02c2
            com.moovit.util.time.TimeVehicleLocation r7 = r6.f23912m
            com.moovit.util.time.TimeVehicleAttributes r6 = r6.f23913n
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r6)
            goto L_0x02c3
        L_0x02c2:
            r8 = 0
        L_0x02c3:
            if (r8 == 0) goto L_0x02cc
            java.lang.Object r6 = r8.mo59068c()
            com.moovit.util.time.TimeVehicleLocation r6 = (com.moovit.util.time.TimeVehicleLocation) r6
            goto L_0x02cd
        L_0x02cc:
            r6 = 0
        L_0x02cd:
            java.util.Map<java.lang.String, com.moovit.util.time.Time> r7 = r5.f43130c
            boolean r18 = r14.mo24633j()
            if (r18 == 0) goto L_0x02da
        L_0x02d5:
            r18 = r5
        L_0x02d7:
            r5 = r11
            r7 = r12
            goto L_0x0318
        L_0x02da:
            if (r6 == 0) goto L_0x02e0
            java.lang.String r6 = r6.f23924b
            if (r6 != 0) goto L_0x02e8
        L_0x02e0:
            com.moovit.util.time.TimeVehicleLocation r6 = r14.f23912m
            if (r6 == 0) goto L_0x02e7
            java.lang.String r6 = r6.f23924b
            goto L_0x02e8
        L_0x02e7:
            r6 = 0
        L_0x02e8:
            java.lang.Object r6 = r7.get(r6)
            com.moovit.util.time.Time r6 = (com.moovit.util.time.Time) r6
            if (r6 == 0) goto L_0x02d5
            com.moovit.network.model.LongServerId r7 = r14.f23904e
            r18 = r5
            com.moovit.network.model.LongServerId r5 = r6.f23904e
            boolean r5 = mf0.C24362h.m61206a(r7, r5)
            if (r5 == 0) goto L_0x02d7
            boolean r5 = r6.mo24633j()
            if (r5 != 0) goto L_0x0303
            goto L_0x02d7
        L_0x0303:
            r5 = r11
            r7 = r12
            long r11 = r6.f23902c
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            com.moovit.util.time.Time$Status r6 = r6.f23910k
            java.lang.String r12 = "vehicleTime.status"
            mf0.C24362h.m61210e(r6, r12)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r11, r6)
            goto L_0x0319
        L_0x0318:
            r12 = 0
        L_0x0319:
            if (r8 != 0) goto L_0x0330
            if (r12 != 0) goto L_0x0330
            r6 = 0
            r36 = r1
            r37 = r2
            r41 = r3
            r35 = r4
            r38 = r5
            r39 = r7
            r42 = r10
            r40 = r15
            goto L_0x03b2
        L_0x0330:
            com.moovit.util.time.Time r6 = new com.moovit.util.time.Time
            r11 = r3
            r35 = r4
            long r3 = r14.f23901b
            if (r12 == 0) goto L_0x034a
            java.lang.Object r19 = r12.mo59068c()
            java.lang.Number r19 = (java.lang.Number) r19
            long r19 = r19.longValue()
            r36 = r1
            r37 = r2
            r22 = r19
            goto L_0x0352
        L_0x034a:
            r36 = r1
            r37 = r2
            long r1 = r14.f23902c
            r22 = r1
        L_0x0352:
            int r1 = r14.f23903d
            com.moovit.network.model.LongServerId r2 = r14.f23904e
            r38 = r5
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitPattern> r5 = r14.f23905f
            r39 = r7
            int r7 = r14.f23906g
            r40 = r15
            com.moovit.network.model.ServerId r15 = r14.f23907h
            r41 = r11
            com.moovit.util.time.TimeFrequency r11 = r14.f23908i
            r42 = r10
            java.lang.String r10 = r14.f23909j
            if (r12 == 0) goto L_0x0374
            java.lang.Object r12 = r12.mo59069d()
            com.moovit.util.time.Time$Status r12 = (com.moovit.util.time.Time.Status) r12
            if (r12 != 0) goto L_0x037b
        L_0x0374:
            com.moovit.util.time.Time$Status r12 = r14.f23910k
            java.lang.String r0 = "time.status"
            mf0.C24362h.m61210e(r12, r0)
        L_0x037b:
            r31 = r12
            boolean r0 = r14.f23911l
            if (r8 == 0) goto L_0x0389
            java.lang.Object r12 = r8.mo59068c()
            com.moovit.util.time.TimeVehicleLocation r12 = (com.moovit.util.time.TimeVehicleLocation) r12
            if (r12 != 0) goto L_0x038b
        L_0x0389:
            com.moovit.util.time.TimeVehicleLocation r12 = r14.f23912m
        L_0x038b:
            r33 = r12
            if (r8 == 0) goto L_0x0397
            java.lang.Object r8 = r8.mo59069d()
            com.moovit.util.time.TimeVehicleAttributes r8 = (com.moovit.util.time.TimeVehicleAttributes) r8
            if (r8 != 0) goto L_0x0399
        L_0x0397:
            com.moovit.util.time.TimeVehicleAttributes r8 = r14.f23913n
        L_0x0399:
            r34 = r8
            r19 = r6
            r20 = r3
            r24 = r1
            r25 = r2
            r26 = r5
            r27 = r7
            r28 = r15
            r29 = r11
            r30 = r10
            r32 = r0
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x03b2:
            if (r6 == 0) goto L_0x03b7
            r9.set(r13, r6)
        L_0x03b7:
            r0 = r44
            r6 = r45
            r7 = r16
            r8 = r17
            r5 = r18
            r4 = r35
            r1 = r36
            r2 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r3 = r41
            r10 = r42
            goto L_0x027b
        L_0x03d3:
            p583jk.C17875h.m44294U()
            r0 = 0
            throw r0
        L_0x03d8:
            r0 = r44
            goto L_0x0254
        L_0x03dc:
            r0 = r44
            goto L_0x022c
        L_0x03e0:
            r36 = r1
            r37 = r2
            r41 = r3
            r35 = r4
            r42 = r10
            r0 = r44
            com.moovit.app.stoparrivals.a r1 = r0.this$0
            java.util.concurrent.atomic.AtomicReference<cw.g> r1 = r1.f39634f
            r2 = r42
            r1.set(r2)
            r3 = r37
            r0.L$0 = r3
            r4 = r35
            r0.L$1 = r4
            r0.L$2 = r2
            r1 = 3
            r0.label = r1
            r1 = r41
            java.lang.Object r1 = r1.mo61764h(r0)
            r5 = r36
            if (r1 != r5) goto L_0x040d
            return r5
        L_0x040d:
            r43 = r4
            r4 = r3
            r3 = r43
        L_0x0412:
            java.util.Map r1 = (java.util.Map) r1
            com.moovit.app.stoparrivals.a r6 = r0.this$0
            java.lang.String r7 = "serviceAlerts"
            mf0.C24362h.m61210e(r1, r7)
            r6.getClass()
            java.util.Map<com.moovit.network.model.ServerId, java.util.Map<com.moovit.network.model.LongServerId, java.util.List<com.moovit.util.time.Time>>> r6 = r2.f43129b
            java.lang.String r7 = "<this>"
            mf0.C24362h.m61211f(r6, r7)
            java.util.Set r6 = r6.entrySet()
            cf0.p r6 = kotlin.collections.C23825c.m58506c0(r6)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$createStopArrivals$1 r7 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$createStopArrivals$1
            r7.<init>(r1, r4)
            th0.f r1 = kotlin.sequences.C24177b.m60548i0(r6, r7)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$createStopArrivals$2 r4 = com.moovit.app.stoparrivals.StopArrivalsViewModel$createStopArrivals$2.f39620f
            th0.e r1 = kotlin.sequences.C24177b.m60543d0(r1, r4)
            cw.f r4 = new cw.f
            r4.<init>()
            th0.j r6 = new th0.j
            r6.<init>(r1, r4)
            java.util.List r1 = kotlin.sequences.C24177b.m60553n0(r6)
            java.util.List r1 = p583jk.C17875h.m44285I(r1)
            com.moovit.app.stoparrivals.a r4 = r0.this$0
            r4.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            cf0.p r8 = kotlin.collections.C23825c.m58506c0(r1)
            com.moovit.app.stoparrivals.StopArrivalsViewModel$filterStopArrivals$result$1 r9 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$filterStopArrivals$result$1
            r9.<init>(r4, r6)
            th0.e r6 = kotlin.sequences.C24177b.m60543d0(r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            kotlin.sequences.C24177b.m60552m0(r6, r7)
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x04ab
            cf0.p r1 = kotlin.collections.C23825c.m58506c0(r1)
            int r4 = r4.f39632d
            if (r4 < 0) goto L_0x047c
            r6 = 1
            goto L_0x047d
        L_0x047c:
            r6 = 0
        L_0x047d:
            if (r6 == 0) goto L_0x0499
            if (r4 != 0) goto L_0x0484
            th0.d r1 = th0.C24996d.f63140a
            goto L_0x0495
        L_0x0484:
            boolean r6 = r1 instanceof th0.C24995c
            if (r6 == 0) goto L_0x048f
            th0.c r1 = (th0.C24995c) r1
            th0.h r1 = r1.mo61540b(r4)
            goto L_0x0495
        L_0x048f:
            th0.l r6 = new th0.l
            r6.<init>(r1, r4)
            r1 = r6
        L_0x0495:
            kotlin.sequences.C24177b.m60552m0(r1, r7)
            goto L_0x04ab
        L_0x0499:
            java.lang.String r1 = "Requested element count "
            java.lang.String r2 = " is less than zero."
            java.lang.String r1 = p379.C25541a.m63878h(r1, r4, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x04ab:
            com.moovit.app.stoparrivals.a r1 = r0.this$0
            r0.L$0 = r3
            r0.L$1 = r2
            r0.L$2 = r7
            r4 = 4
            r0.label = r4
            java.lang.Object r1 = com.moovit.app.stoparrivals.C15322a.m39193b(r1, r7, r0)
            if (r1 != r5) goto L_0x04bd
            return r5
        L_0x04bd:
            i30.d r1 = (i30.C5268d) r1
            java.util.Iterator r4 = r7.iterator()
        L_0x04c3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x04e5
            java.lang.Object r5 = r4.next()
            com.moovit.app.stoparrivals.StopArrival r5 = (com.moovit.app.stoparrivals.StopArrival) r5
            com.moovit.util.time.Time r5 = r5.f39600c
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitPattern> r5 = r5.f23905f
            if (r5 == 0) goto L_0x04c3
            com.moovit.network.model.ServerId r6 = r5.getServerId()
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitPattern> r8 = r1.f17407d
            java.lang.Object r6 = r8.get(r6)
            com.moovit.transit.TransitPattern r6 = (com.moovit.transit.TransitPattern) r6
            r5.resolveTo(r6)
            goto L_0x04c3
        L_0x04e5:
            com.moovit.app.stoparrivals.a r1 = r0.this$0
            androidx.lifecycle.v r1 = r1.f39638j
            java.lang.Object r1 = r1.getValue()
            com.moovit.app.stoparrivals.TripsSelectionUpdate r1 = (com.moovit.app.stoparrivals.TripsSelectionUpdate) r1
            if (r1 == 0) goto L_0x04f4
            com.moovit.app.stoparrivals.StopArrival r1 = r1.f39625d
            goto L_0x04f5
        L_0x04f4:
            r1 = 0
        L_0x04f5:
            com.moovit.app.stoparrivals.a r4 = r0.this$0
            r4.getClass()
            if (r1 != 0) goto L_0x04fe
            goto L_0x0581
        L_0x04fe:
            java.util.Iterator r4 = r7.iterator()
            r5 = 0
        L_0x0503:
            boolean r6 = r4.hasNext()
            r8 = -1
            if (r6 == 0) goto L_0x052d
            java.lang.Object r6 = r4.next()
            com.moovit.app.stoparrivals.StopArrival r6 = (com.moovit.app.stoparrivals.StopArrival) r6
            com.moovit.util.time.Time r9 = r6.f39600c
            com.moovit.network.model.LongServerId r9 = r9.f23904e
            com.moovit.util.time.Time r10 = r1.f39600c
            com.moovit.network.model.LongServerId r10 = r10.f23904e
            boolean r9 = mf0.C24362h.m61206a(r9, r10)
            if (r9 == 0) goto L_0x0526
            int r6 = r6.f39601d
            int r9 = r1.f39601d
            if (r6 != r9) goto L_0x0526
            r6 = 1
            goto L_0x0527
        L_0x0526:
            r6 = 0
        L_0x0527:
            if (r6 == 0) goto L_0x052a
            goto L_0x052e
        L_0x052a:
            int r5 = r5 + 1
            goto L_0x0503
        L_0x052d:
            r5 = -1
        L_0x052e:
            if (r5 == r8) goto L_0x0531
            goto L_0x0582
        L_0x0531:
            java.util.Iterator r4 = r7.iterator()
            r5 = 0
        L_0x0536:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0554
            java.lang.Object r6 = r4.next()
            com.moovit.app.stoparrivals.StopArrival r6 = (com.moovit.app.stoparrivals.StopArrival) r6
            com.moovit.util.time.Time r6 = r6.f39600c
            com.moovit.network.model.LongServerId r6 = r6.f23904e
            com.moovit.util.time.Time r9 = r1.f39600c
            com.moovit.network.model.LongServerId r9 = r9.f23904e
            boolean r6 = mf0.C24362h.m61206a(r6, r9)
            if (r6 == 0) goto L_0x0551
            goto L_0x0556
        L_0x0551:
            int r5 = r5 + 1
            goto L_0x0536
        L_0x0554:
            r4 = -1
            r5 = -1
        L_0x0556:
            if (r5 == r8) goto L_0x0559
            goto L_0x0582
        L_0x0559:
            java.util.Iterator r4 = r7.iterator()
            r5 = 0
        L_0x055e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x057c
            java.lang.Object r6 = r4.next()
            com.moovit.app.stoparrivals.StopArrival r6 = (com.moovit.app.stoparrivals.StopArrival) r6
            com.moovit.transit.TransitLine r6 = r6.f39599b
            com.moovit.network.model.ServerId r6 = r6.f23687c
            com.moovit.transit.TransitLine r9 = r1.f39599b
            com.moovit.network.model.ServerId r9 = r9.f23687c
            boolean r6 = mf0.C24362h.m61206a(r6, r9)
            if (r6 == 0) goto L_0x0579
            goto L_0x057e
        L_0x0579:
            int r5 = r5 + 1
            goto L_0x055e
        L_0x057c:
            r4 = -1
            r5 = -1
        L_0x057e:
            if (r5 == r8) goto L_0x0581
            goto L_0x0582
        L_0x0581:
            r5 = 0
        L_0x0582:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x058b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x05a2
            java.lang.Object r6 = r3.next()
            yy.c r6 = (p952yy.C20787c) r6
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.transit.TransitPatternShape> r6 = r6.f52460e
            java.lang.String r8 = "lineArrival.shapeIdToSegments"
            mf0.C24362h.m61210e(r6, r8)
            r4.putAll(r6)
            goto L_0x058b
        L_0x05a2:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r6 = r7.iterator()
            r8 = 0
        L_0x05ac:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x05d8
            java.lang.Object r9 = r6.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x05d3
            com.moovit.app.stoparrivals.StopArrival r9 = (com.moovit.app.stoparrivals.StopArrival) r9
            com.moovit.util.time.Time r9 = r9.f39600c
            com.moovit.util.time.TimeVehicleLocation r9 = r9.f23912m
            if (r9 == 0) goto L_0x05d1
            java.lang.String r9 = r9.f23924b
            java.lang.String r11 = "vehicle.vehicleId"
            mf0.C24362h.m61210e(r9, r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r8)
            r3.put(r9, r11)
        L_0x05d1:
            r8 = r10
            goto L_0x05ac
        L_0x05d3:
            p583jk.C17875h.m44294U()
            r1 = 0
            throw r1
        L_0x05d8:
            com.moovit.app.stoparrivals.a r6 = r0.this$0
            androidx.lifecycle.v<com.moovit.app.stoparrivals.TripsUpdateResult> r6 = r6.f39635g
            com.moovit.app.stoparrivals.TripsUpdateResult r8 = new com.moovit.app.stoparrivals.TripsUpdateResult
            com.moovit.transit.TransitStop r2 = r2.f43128a
            r8.<init>(r2, r7, r4, r3)
            r6.postValue(r8)
            boolean r2 = r7.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0601
            com.moovit.app.stoparrivals.a r2 = r0.this$0
            androidx.lifecycle.v<com.moovit.app.stoparrivals.TripsSelectionUpdate> r2 = r2.f39637i
            com.moovit.app.stoparrivals.TripsSelectionUpdate r3 = new com.moovit.app.stoparrivals.TripsSelectionUpdate
            java.lang.Object r4 = r7.get(r5)
            com.moovit.app.stoparrivals.StopArrival r4 = (com.moovit.app.stoparrivals.StopArrival) r4
            r6 = 0
            r3.<init>(r5, r1, r4, r6)
            r2.postValue(r3)
        L_0x0601:
            bf0.d r1 = bf0.C21050d.f52856a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
