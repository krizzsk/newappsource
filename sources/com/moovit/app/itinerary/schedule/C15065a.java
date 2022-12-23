package com.moovit.app.itinerary.schedule;

import android.annotation.SuppressLint;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.Schedule;
import com.moovit.util.time.Time;
import e20.C16769e;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import o00.C18676l;
import p824tp.C19728f;
import p971zt.C20893c;

/* renamed from: com.moovit.app.itinerary.schedule.a */
public final class C15065a implements Callable<C15067b> {

    /* renamed from: b */
    public final C13752e f38622b;

    /* renamed from: c */
    public final C19728f f38623c;

    /* renamed from: d */
    public final Itinerary f38624d;

    /* renamed from: e */
    public final int f38625e;

    /* renamed from: f */
    public final C16769e.C16772c f38626f;

    /* renamed from: com.moovit.app.itinerary.schedule.a$a */
    public static class C15066a implements Comparator<C20893c> {

        /* renamed from: b */
        public final Schedule.C7799d f38627b;

        public C15066a(Time time) {
            this.f38627b = new Schedule.C7799d(time);
        }

        public final int compare(Object obj, Object obj2) {
            return this.f38627b.compare(((C20893c) obj).f52641c, ((C20893c) obj2).f52641c);
        }
    }

    /* renamed from: com.moovit.app.itinerary.schedule.a$b */
    public static class C15067b {

        /* renamed from: a */
        public final LocationDescriptor f38628a;

        /* renamed from: b */
        public final LocationDescriptor f38629b;

        /* renamed from: c */
        public final List<C18676l.C18679c<C20893c>> f38630c;

        public C15067b(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, List<C18676l.C18679c<C20893c>> list) {
            this.f38628a = locationDescriptor;
            this.f38629b = locationDescriptor2;
            this.f38630c = list;
        }
    }

    public C15065a(C13752e eVar, C19728f fVar, Itinerary itinerary, int i, C16769e.C16772c cVar) {
        C21100e.m49373x(eVar, "requestContext");
        this.f38622b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f38623c = fVar;
        C21100e.m49373x(itinerary, "itinerary");
        this.f38624d = itinerary;
        this.f38625e = i;
        C21100e.m49373x(cVar, "realTimeInfo");
        this.f38626f = cVar;
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: a */
    public final TransitLineLeg mo45327a(Itinerary itinerary) {
        Leg leg = itinerary.mo48295u0().get(this.f38625e + 1);
        int type = leg.getType();
        if (type == 2) {
            return (TransitLineLeg) leg;
        }
        if (type == 9) {
            return ((MultiTransitLinesLeg) leg).mo48440b();
        }
        StringBuilder k = C13555b.m33972k("Received non line leg index: ");
        k.append(this.f38625e + 1);
        throw new IllegalStateException(k.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: com.moovit.util.time.Time} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r21 = this;
            r0 = r21
            c70.e r1 = r0.f38622b
            tp.f r2 = r0.f38623c
            com.moovit.itinerary.model.Itinerary r3 = r0.f38624d
            com.moovit.itinerary.model.Itinerary r1 = e20.C16776h.m42406a(r1, r2, r3)
            if (r1 == 0) goto L_0x0386
            com.moovit.itinerary.model.leg.TransitLineLeg r2 = r0.mo45327a(r1)
            com.moovit.transit.LocationDescriptor r3 = r2.mo48332W()
            com.moovit.transit.LocationDescriptor r2 = r2.mo48334e2()
            java.util.List r4 = r1.mo48295u0()
            int r5 = r0.f38625e
            java.lang.Object r4 = r4.get(r5)
            com.moovit.itinerary.model.leg.Leg r4 = (com.moovit.itinerary.model.leg.Leg) r4
            int r5 = r4.getType()
            r6 = 3
            if (r5 == r6) goto L_0x004b
            r6 = 10
            if (r5 != r6) goto L_0x0036
            com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg r4 = (com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg) r4
            java.util.List<com.moovit.itinerary.model.leg.WaitToTransitLineLeg> r4 = r4.f42117b
            goto L_0x0051
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Received non line wait leg index: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r0.f38625e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x004b:
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r4 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r4
            java.util.List r4 = java.util.Collections.singletonList(r4)
        L_0x0051:
            java.util.List r5 = r1.mo48295u0()
            int r6 = r0.f38625e
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            com.moovit.itinerary.model.leg.Leg r5 = (com.moovit.itinerary.model.leg.Leg) r5
            int r6 = r5.getType()
            r7 = 2
            if (r6 == r7) goto L_0x0086
            r8 = 9
            if (r6 != r8) goto L_0x006f
            com.moovit.itinerary.model.leg.MultiTransitLinesLeg r5 = (com.moovit.itinerary.model.leg.MultiTransitLinesLeg) r5
            java.util.List<com.moovit.itinerary.model.leg.TransitLineLeg> r5 = r5.f42086b
            goto L_0x008c
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Received non line leg index: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r0.f38625e
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0086:
            com.moovit.itinerary.model.leg.TransitLineLeg r5 = (com.moovit.itinerary.model.leg.TransitLineLeg) r5
            java.util.List r5 = java.util.Collections.singletonList(r5)
        L_0x008c:
            com.moovit.itinerary.model.leg.TransitLineLeg r1 = r0.mo45327a(r1)
            com.moovit.database.DbEntityRef r1 = r1.mo48460c()
            j40.a r1 = r1.get()
            com.moovit.transit.TransitStop r1 = (com.moovit.transit.TransitStop) r1
            s0.b r6 = new s0.b
            int r8 = r5.size()
            r6.<init>((int) r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x00a7:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00bd
            java.lang.Object r8 = r5.next()
            com.moovit.itinerary.model.leg.TransitLineLeg r8 = (com.moovit.itinerary.model.leg.TransitLineLeg) r8
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r9 = r8.f42110d
            com.moovit.network.model.ServerId r9 = r9.getServerId()
            r6.put(r9, r8)
            goto L_0x00a7
        L_0x00bd:
            s0.b r5 = new s0.b
            int r8 = r4.size()
            r5.<init>((int) r8)
            java.util.Iterator r8 = r4.iterator()
        L_0x00ca:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r9 = r8.next()
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r9 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r9
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r10 = r9.f42135f
            com.moovit.network.model.ServerId r10 = r10.getServerId()
            com.moovit.servicealerts.LineServiceAlertDigest r9 = r9.f42139j
            if (r9 == 0) goto L_0x00ca
            r5.put(r10, r9)
            goto L_0x00ca
        L_0x00e4:
            s0.b r8 = new s0.b
            int r9 = r4.size()
            r8.<init>((int) r9)
            java.util.Iterator r9 = r4.iterator()
        L_0x00f1:
            boolean r10 = r9.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x0131
            java.lang.Object r10 = r9.next()
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r10 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r10
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r12 = r10.f42135f
            com.moovit.network.model.ServerId r12 = r12.getServerId()
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop> r13 = r10.f42136g
            com.moovit.network.model.ServerId r13 = r13.getServerId()
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop> r14 = r10.f42137h
            com.moovit.network.model.ServerId r14 = r14.getServerId()
            oy.a r15 = p716oy.C18860a.m45884a()
            boolean r15 = r15.f48029q
            if (r15 == 0) goto L_0x011e
            com.moovit.util.time.Time r11 = r10.f42132c
            com.moovit.util.time.Time r11 = e20.C16783l.m42482n(r11)
        L_0x011e:
            e20.e$c r15 = r0.f38626f
            yy.c r11 = r15.mo49467b(r12, r13, r14, r11)
            if (r11 == 0) goto L_0x0129
            com.moovit.transit.Schedule r10 = r11.f52458c
            goto L_0x012d
        L_0x0129:
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r10 = r10.f42138i
            com.moovit.transit.Schedule r10 = r10.f42142b
        L_0x012d:
            r8.put(r12, r10)
            goto L_0x00f1
        L_0x0131:
            com.moovit.util.time.Time r15 = new com.moovit.util.time.Time
            long r9 = java.lang.System.currentTimeMillis()
            r15.<init>(r9)
            c70.e r9 = r0.f38622b
            android.content.Context r9 = r9.f33852a
            o00.l$b r14 = new o00.l$b
            r10 = 2131889397(0x7f120cf5, float:1.9413456E38)
            java.lang.String r9 = r9.getString(r10)
            r14.<init>(r9, r11)
            java.util.Set r8 = r8.entrySet()
            s0.g$b r8 = (p241s0.C6307g.C6309b) r8
            java.util.Iterator r16 = r8.iterator()
        L_0x0154:
            r8 = r16
            s0.g$d r8 = (p241s0.C6307g.C6311d) r8
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0257
            r8.next()
            java.lang.Object r9 = r8.getKey()
            com.moovit.network.model.ServerId r9 = (com.moovit.network.model.ServerId) r9
            java.lang.Object r8 = r8.getValue()
            com.moovit.transit.Schedule r8 = (com.moovit.transit.Schedule) r8
            java.lang.Object r10 = r6.getOrDefault(r9, r11)
            com.moovit.itinerary.model.leg.TransitLineLeg r10 = (com.moovit.itinerary.model.leg.TransitLineLeg) r10
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r10 = r10.f42110d
            j40.a r10 = r10.get()
            com.moovit.transit.TransitLine r10 = (com.moovit.transit.TransitLine) r10
            com.moovit.transit.TransitLineGroup r11 = r10.mo24369b()
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitAgency> r11 = r11.f23696d
            j40.a r11 = r11.get()
            com.moovit.transit.TransitAgency r11 = (com.moovit.transit.TransitAgency) r11
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitType> r11 = r11.f23674d
            j40.a r11 = r11.get()
            com.moovit.transit.TransitType r11 = (com.moovit.transit.TransitType) r11
            com.moovit.transit.TransitType$ViewType r11 = r11.f23761f
            java.util.List r12 = java.util.Collections.emptyList()
            com.moovit.transit.TransitType$ViewType r13 = com.moovit.transit.TransitType.ViewType.TRIPS
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x01a8
            com.moovit.util.time.Time r7 = r8.mo24328s(r15)
            if (r7 == 0) goto L_0x01e6
            java.util.List r12 = java.util.Collections.singletonList(r7)
            goto L_0x01e6
        L_0x01a8:
            java.util.List r8 = r8.mo24333x(r15)
            nq.d r11 = new nq.d
            r11.<init>(r7)
            java.util.List r7 = c00.C13717b.m34265l(r8, r11)
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L_0x01c2
            r8 = 3
            java.util.List r7 = c00.C13717b.m34260g(r8, r7)
        L_0x01c0:
            r12 = r7
            goto L_0x01e6
        L_0x01c2:
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x01db
            r7 = 0
            java.lang.Object r7 = r8.get(r7)
            com.moovit.util.time.Time r7 = (com.moovit.util.time.Time) r7
            long r11 = r7.mo24631g()
            boolean r7 = com.moovit.util.time.C7925b.m18029q(r11)
            if (r7 == 0) goto L_0x01db
            r7 = 1
            goto L_0x01dc
        L_0x01db:
            r7 = 0
        L_0x01dc:
            if (r7 == 0) goto L_0x01e0
            r7 = 1
            goto L_0x01e1
        L_0x01e0:
            r7 = 2
        L_0x01e1:
            java.util.List r7 = c00.C13717b.m34260g(r7, r8)
            goto L_0x01c0
        L_0x01e6:
            int r7 = r12.size()
            r8 = 1
            if (r7 != r8) goto L_0x01f5
            r7 = 0
            java.lang.Object r7 = r12.get(r7)
            com.moovit.util.time.Time r7 = (com.moovit.util.time.Time) r7
            goto L_0x01f6
        L_0x01f5:
            r7 = 0
        L_0x01f6:
            r8 = 0
            java.lang.Object r8 = r6.getOrDefault(r9, r8)
            com.moovit.itinerary.model.leg.TransitLineLeg r8 = (com.moovit.itinerary.model.leg.TransitLineLeg) r8
            if (r8 == 0) goto L_0x0207
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r11 = r8.f42111e
            int r11 = r11.size()
            r13 = r11
            goto L_0x0209
        L_0x0207:
            r11 = 0
            r13 = 0
        L_0x0209:
            if (r8 == 0) goto L_0x0226
            com.moovit.util.time.Time r11 = r8.f42108b
            r18 = r14
            r17 = r15
            long r14 = r11.mo24631g()
            com.moovit.util.time.Time r8 = r8.f42109c
            r20 = r2
            r19 = r3
            long r2 = r8.mo24631g()
            long r2 = com.moovit.util.time.C7925b.m18026n(r14, r2)
            int r3 = (int) r2
            r14 = r3
            goto L_0x0230
        L_0x0226:
            r20 = r2
            r19 = r3
            r18 = r14
            r17 = r15
            r2 = 0
            r14 = 0
        L_0x0230:
            zt.c r2 = new zt.c
            com.moovit.transit.Schedule r11 = new com.moovit.transit.Schedule
            r11.<init>(r12)
            r3 = 0
            java.lang.Object r3 = r5.getOrDefault(r9, r3)
            r15 = r3
            com.moovit.servicealerts.LineServiceAlertDigest r15 = (com.moovit.servicealerts.LineServiceAlertDigest) r15
            r8 = r2
            r9 = r1
            r12 = r7
            r7 = r18
            r3 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.add(r2)
            r2 = 2
            r15 = r3
            r14 = r7
            r3 = r19
            r2 = r20
            r7 = 2
            r11 = 0
            goto L_0x0154
        L_0x0257:
            r20 = r2
            r19 = r3
            r7 = r14
            r3 = r15
            com.moovit.app.itinerary.schedule.a$a r2 = new com.moovit.app.itinerary.schedule.a$a
            r2.<init>(r3)
            java.util.Collections.sort(r7, r2)
            e00.a r2 = new e00.a
            s0.b r5 = new s0.b
            int r6 = r7.size()
            r5.<init>((int) r6)
            r2.<init>(r5, r3)
            java.util.Iterator r5 = r7.iterator()
        L_0x0277:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02b2
            java.lang.Object r6 = r5.next()
            zt.c r6 = (p971zt.C20893c) r6
            com.moovit.transit.TransitLine r8 = r6.f52640b
            com.moovit.network.model.ServerId r8 = r8.f23687c
            com.moovit.transit.Schedule r9 = r6.f52641c
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0290
            goto L_0x0277
        L_0x0290:
            com.moovit.transit.Schedule r6 = r6.f52641c
            java.util.List<com.moovit.util.time.Time> r6 = r6.f23660b
            int r9 = r6.size()
            int r9 = r9 + -1
            java.lang.Object r6 = r6.get(r9)
            com.moovit.util.time.Time r6 = (com.moovit.util.time.Time) r6
            java.lang.Object r9 = r2.get(r8)
            com.moovit.util.time.Time r9 = (com.moovit.util.time.Time) r9
            if (r9 == 0) goto L_0x0277
            int r9 = r9.compareTo(r6)
            if (r9 >= 0) goto L_0x0277
            r2.put(r8, r6)
            goto L_0x0277
        L_0x02b2:
            c70.e r5 = r0.f38622b
            android.content.Context r5 = r5.f33852a
            o00.l$b r6 = new o00.l$b
            r8 = 2131889396(0x7f120cf4, float:1.9413454E38)
            java.lang.String r5 = r5.getString(r8)
            r6.<init>(r5, r11)
            java.util.Iterator r4 = r4.iterator()
        L_0x02c6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0340
            java.lang.Object r5 = r4.next()
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r5 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r5
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r8 = r5.f42135f
            com.moovit.network.model.ServerId r8 = r8.getServerId()
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r9 = r5.f42138i
            com.moovit.transit.Schedule r9 = r9.f42142b
            java.lang.Object r8 = r2.get(r8)
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            if (r8 == 0) goto L_0x02e9
            com.moovit.util.time.Time r15 = com.moovit.util.time.Time.m17981l(r8)
            goto L_0x02ea
        L_0x02e9:
            r15 = r3
        L_0x02ea:
            int r8 = r9.mo24334z(r15)
            if (r8 >= 0) goto L_0x02f4
            int r8 = -r8
            int r8 = r8 + -1
            goto L_0x02f6
        L_0x02f4:
            int r8 = r8 + 1
        L_0x02f6:
            java.util.List<com.moovit.util.time.Time> r9 = r9.f23660b
            int r10 = r9.size()
            if (r8 < r10) goto L_0x02ff
            goto L_0x02c6
        L_0x02ff:
            int r10 = r9.size()
            java.util.List r8 = r9.subList(r8, r10)
            java.util.Iterator r16 = r8.iterator()
        L_0x030b:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x033d
            java.lang.Object r8 = r16.next()
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            com.moovit.util.time.Time r8 = com.moovit.util.time.Time.m17981l(r8)
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r9 = r5.f42135f
            j40.a r9 = r9.get()
            r10 = r9
            com.moovit.transit.TransitLine r10 = (com.moovit.transit.TransitLine) r10
            zt.c r15 = new zt.c
            com.moovit.transit.Schedule r11 = com.moovit.transit.Schedule.m17783E(r8)
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r8 = r15
            r9 = r1
            r0 = r15
            r15 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r6.add(r0)
            r0 = r21
            goto L_0x030b
        L_0x033d:
            r0 = r21
            goto L_0x02c6
        L_0x0340:
            r0 = 0
            com.moovit.app.itinerary.schedule.a$a r1 = new com.moovit.app.itinerary.schedule.a$a
            r1.<init>(r3)
            java.util.Collections.sort(r6, r1)
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x035a
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x035a
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x037c
        L_0x035a:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0365
            java.util.List r0 = java.util.Collections.singletonList(r6)
            goto L_0x037c
        L_0x0365:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0370
            java.util.List r0 = java.util.Collections.singletonList(r7)
            goto L_0x037c
        L_0x0370:
            r1 = 2
            o00.l$c[] r1 = new o00.C18676l.C18679c[r1]
            r1[r0] = r7
            r0 = 1
            r1[r0] = r6
            java.util.List r0 = java.util.Arrays.asList(r1)
        L_0x037c:
            com.moovit.app.itinerary.schedule.a$b r1 = new com.moovit.app.itinerary.schedule.a$b
            r2 = r19
            r3 = r20
            r1.<init>(r2, r3, r0)
            return r1
        L_0x0386:
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r1 = "Unable to resolve itinerary's metro entities"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.schedule.C15065a.call():java.lang.Object");
    }
}
