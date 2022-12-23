package p829tu;

import aa0.C7529e;
import aa0.C7530f;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p543hq.C17474b;
import p640lt.C18275a;
import p824tp.C19728f;
import p874vr.C20199a;
import p977zz.C20944i0;
import p977zz.C20957p;
import q00.C19047a;

/* renamed from: tu.p */
public final class C19785p implements Callable<C20944i0<List<MotQrCodeTrip>, C17474b>> {

    /* renamed from: b */
    public final C13752e f50295b;

    /* renamed from: c */
    public final C19728f f50296c;

    /* renamed from: d */
    public final C19047a f50297d;

    /* renamed from: e */
    public final MotQrCodeScanResult f50298e;

    /* renamed from: f */
    public final List<ServerId> f50299f;

    public C19785p(C13752e eVar, C19728f fVar, C19047a aVar, MotQrCodeScanResult motQrCodeScanResult, List<ServerId> list) {
        C21100e.m49373x(eVar, "requestContext");
        this.f50295b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f50296c = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f50297d = aVar;
        C21100e.m49373x(motQrCodeScanResult, "scanResult");
        this.f50298e = motQrCodeScanResult;
        this.f50299f = list;
    }

    /* renamed from: a */
    public static C17474b m47236a(C19047a aVar, MotQrCodeScanResult motQrCodeScanResult, long j, long j2, List<ServerId> list, List<MotQrCodeTrip> list2, List<MotQrCodeTrip> list3) {
        MotQrCodeTrip motQrCodeTrip;
        MotQrCodeTrip motQrCodeTrip2;
        int i;
        ServerId serverId;
        Float f;
        Long l;
        C19047a aVar2 = aVar;
        MotQrCodeScanResult motQrCodeScanResult2 = motQrCodeScanResult;
        List<MotQrCodeTrip> list4 = list2;
        List list5 = (List) aVar.mo51505b(C20199a.f51245G0);
        List list6 = (List) aVar.mo51505b(C20199a.f51246H0);
        LatLonE6 latLonE6 = motQrCodeScanResult2.f39065e;
        C7529e c = C7530f.m17270c(latLonE6);
        Boolean bool = null;
        if (C13717b.m34258e(list2)) {
            motQrCodeTrip = null;
        } else {
            motQrCodeTrip = (MotQrCodeTrip) Collections.min(list4, new C18275a(c, 1));
        }
        long j3 = motQrCodeScanResult2.f39064d;
        if (C13717b.m34258e(list2)) {
            motQrCodeTrip2 = null;
        } else {
            motQrCodeTrip2 = (MotQrCodeTrip) Collections.min(list4, new C19784o(j3));
        }
        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.MOT_TRIP_ALGORITHM);
        aVar3.mo49939g(AnalyticsAttributeKey.RADIUS, C20957p.m49075a(list5));
        aVar3.mo49939g(AnalyticsAttributeKey.TIME, C20957p.m49075a(list6));
        aVar3.mo49943k(AnalyticsAttributeKey.ID, motQrCodeScanResult2.f39063c);
        aVar3.mo49938f(AnalyticsAttributeKey.SELECTED_LOCATION, latLonE6);
        aVar3.mo49936d(AnalyticsAttributeKey.CHOSEN_TIME, j3);
        long j4 = j;
        aVar3.mo49936d(AnalyticsAttributeKey.FROM, j);
        aVar3.mo49936d(AnalyticsAttributeKey.TO, j2);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.STOPS_COUNT;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        aVar3.mo49935c(analyticsAttributeKey, i);
        AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.STOP_ID;
        if (motQrCodeTrip != null) {
            serverId = motQrCodeTrip.f39072b.f23730b;
        } else {
            serverId = null;
        }
        aVar3.mo49943k(analyticsAttributeKey2, serverId);
        AnalyticsAttributeKey analyticsAttributeKey3 = AnalyticsAttributeKey.DISTANCE;
        if (motQrCodeTrip != null) {
            f = Float.valueOf(LatLonE6.m40174c(latLonE6, motQrCodeTrip.f39072b));
        } else {
            f = null;
        }
        aVar3.mo49944l(analyticsAttributeKey3, f);
        aVar3.mo49935c(AnalyticsAttributeKey.COUNT, list2.size());
        AnalyticsAttributeKey analyticsAttributeKey4 = AnalyticsAttributeKey.SELECTED_ITEM;
        if (motQrCodeTrip2 != null) {
            l = Long.valueOf(motQrCodeTrip2.f39074d.mo24631g());
        } else {
            l = null;
        }
        aVar3.mo49944l(analyticsAttributeKey4, l);
        AnalyticsAttributeKey analyticsAttributeKey5 = AnalyticsAttributeKey.IS_REAL_TIME;
        if (motQrCodeTrip2 != null) {
            bool = Boolean.valueOf(motQrCodeTrip2.f39074d.mo24633j());
        }
        aVar3.mo49944l(analyticsAttributeKey5, bool);
        aVar3.mo49935c(AnalyticsAttributeKey.NUMBER_OF_RESULTS, list3.size());
        return aVar3.mo49933a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r22 = this;
            r0 = r22
            java.util.List<com.moovit.network.model.ServerId> r1 = r0.f50299f
            boolean r1 = c00.C13717b.m34258e(r1)
            if (r1 == 0) goto L_0x002b
            java.util.List r1 = java.util.Collections.emptyList()
            q00.a r2 = r0.f50297d
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r3 = r0.f50298e
            java.util.List<com.moovit.network.model.ServerId> r8 = r0.f50299f
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            r4 = -1
            r6 = -1
            hq.b r2 = m47236a(r2, r3, r4, r6, r8, r9, r10)
            zz.i0 r3 = new zz.i0
            r3.<init>(r1, r2)
            goto L_0x0277
        L_0x002b:
            c70.e r1 = r0.f50295b
            android.content.Context r1 = r1.f33852a
            q00.a r1 = r0.f50297d
            f00.g$d r2 = p969zr.C20886a.f52628g
            T r2 = r2.f43936b
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0042
            vr.a$a r2 = p874vr.C20199a.f51246H0
            java.lang.Object r1 = r1.mo51505b(r2)
            r2 = r1
            java.util.List r2 = (java.util.List) r2
        L_0x0042:
            r1 = 2
            if (r2 == 0) goto L_0x004c
            int r4 = r2.size()
            if (r4 != r1) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            if (r2 != 0) goto L_0x0070
            java.util.List r1 = java.util.Collections.emptyList()
            q00.a r2 = r0.f50297d
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r3 = r0.f50298e
            java.util.List<com.moovit.network.model.ServerId> r8 = r0.f50299f
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            r4 = -1
            r6 = -1
            hq.b r2 = m47236a(r2, r3, r4, r6, r8, r9, r10)
            zz.i0 r3 = new zz.i0
            r3.<init>(r1, r2)
            goto L_0x0277
        L_0x0070:
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r4 = r0.f50298e
            long r4 = r4.f39064d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            r7 = 0
            java.lang.Object r8 = r2.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            long r8 = (long) r8
            long r8 = r6.toMillis(r8)
            long r12 = r4 - r8
            r4 = 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r8 = (long) r2
            long r5 = r6.toMillis(r8)
            long r14 = r5 + r12
            c70.e r2 = r0.f50295b
            tp.f r5 = r0.f50296c
            q00.a r6 = r0.f50297d
            java.lang.String r8 = "requestContext"
            ce0.C21100e.m49373x(r2, r8)
            java.lang.String r9 = "metroContext"
            ce0.C21100e.m49373x(r5, r9)
            java.lang.String r9 = "configuration"
            ce0.C21100e.m49373x(r6, r9)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            yy.b r10 = new yy.b
            r10.<init>()
            java.util.List<com.moovit.network.model.ServerId> r11 = r0.f50299f
            r9.addAll(r11)
            r16 = 0
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x00c6
            r11 = 0
            goto L_0x00cb
        L_0x00c6:
            com.moovit.util.time.Time r11 = new com.moovit.util.time.Time
            r11.<init>(r12)
        L_0x00cb:
            r10.f52447a = r11
            r10.f52452f = r4
            yy.f r4 = new yy.f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r9)
            r16 = r4
            r17 = r2
            r18 = r5
            r19 = r6
            r20 = r11
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            java.util.ArrayList r2 = r4.mo52625I()
            c70.e r4 = r0.f50295b
            tp.f r5 = r0.f50296c
            g30.h r5 = r5.f50165a
            i30.e r6 = new i30.e
            r6.<init>()
            ce0.C21100e.m49373x(r4, r8)
            java.lang.String r9 = "metroInfo"
            ce0.C21100e.m49373x(r5, r9)
            java.util.List<com.moovit.network.model.ServerId> r10 = r0.f50299f
            com.moovit.metroentities.MetroEntityType r11 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r1 = r6.f17412b
            r1.mo47002b(r11, r10)
            r6.mo21067b(r11)
            i30.c r1 = new i30.c
            java.lang.String r10 = "MotQrCodeTripsTask.stops"
            r1.<init>(r4, r10, r5, r6)
            i30.d r1 = r1.mo21062P()
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r4 = r0.f50298e
            com.moovit.network.model.ServerId r4 = r4.mo45611c()
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r5 = r0.f50298e
            com.moovit.network.model.ServerId r5 = r5.f39063c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0126:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0199
            java.lang.Object r10 = r2.next()
            yy.g r10 = (p952yy.C20793g) r10
            java.util.List<yy.c> r10 = r10.f52481n
            java.util.Iterator r10 = r10.iterator()
        L_0x0138:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0126
            java.lang.Object r11 = r10.next()
            yy.c r11 = (p952yy.C20787c) r11
            com.moovit.network.model.ServerId r3 = r11.f52457b
            com.moovit.transit.TransitStop r3 = r1.mo21064c(r3)
            if (r3 != 0) goto L_0x014d
            goto L_0x0138
        L_0x014d:
            com.moovit.network.model.ServerId r7 = r11.f52456a
            if (r4 == 0) goto L_0x0158
            boolean r19 = r4.equals(r7)
            if (r19 == 0) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            com.moovit.transit.TransitLine r7 = r1.mo21063b(r7)
            if (r7 != 0) goto L_0x0161
        L_0x015e:
            r19 = r1
            goto L_0x0195
        L_0x0161:
            r19 = r1
            com.moovit.transit.TransitLineGroup r1 = r7.mo24369b()
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitAgency> r1 = r1.f23696d
            com.moovit.network.model.ServerId r1 = r1.getServerId()
            if (r5 == 0) goto L_0x0176
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0176
            goto L_0x0195
        L_0x0176:
            com.moovit.transit.Schedule r1 = r11.f52458c
            java.util.Iterator r1 = r1.iterator()
        L_0x017c:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0195
            java.lang.Object r11 = r1.next()
            com.moovit.util.time.Time r11 = (com.moovit.util.time.Time) r11
            r20 = r1
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r1 = new com.moovit.app.mot.purchase.model.MotQrCodeTrip
            r1.<init>(r3, r7, r11)
            r6.add(r1)
            r1 = r20
            goto L_0x017c
        L_0x0195:
            r1 = r19
            r7 = 0
            goto L_0x0138
        L_0x0199:
            tu.l r1 = new tu.l
            r1.<init>(r12, r14)
            java.util.ArrayList r1 = c00.C13723g.m34282c(r6, r1)
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r2 = r0.f50298e
            long r2 = r2.f39064d
            tu.m r4 = new tu.m
            r4.<init>(r2)
            java.util.Collections.sort(r1, r4)
            java.util.HashSet r2 = new java.util.HashSet
            int r3 = r1.size()
            r2.<init>(r3)
            tu.n r3 = new tu.n
            r4 = 0
            r3.<init>(r2, r4)
            r2 = 0
            c00.C13723g.m34285f(r1, r2, r3)
            n10.f r2 = new n10.f
            int r3 = r1.size()
            r2.<init>(r3)
            l0.b r3 = new l0.b
            r4 = 2
            r3.<init>(r2, r4)
            java.util.Collections.sort(r1, r3)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0262
            c70.e r2 = r0.f50295b
            tp.f r3 = r0.f50296c
            g30.h r3 = r3.f50165a
            i30.e r4 = new i30.e
            r4.<init>()
            ce0.C21100e.m49373x(r2, r8)
            ce0.C21100e.m49373x(r3, r9)
            java.util.HashSet r5 = new java.util.HashSet
            int r7 = r1.size()
            r5.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
        L_0x01f7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x020f
            java.lang.Object r8 = r7.next()
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r8 = (com.moovit.app.mot.purchase.model.MotQrCodeTrip) r8
            com.moovit.util.time.Time r8 = r8.f39074d
            com.moovit.network.model.ServerId r8 = r8.mo24630f()
            if (r8 == 0) goto L_0x01f7
            r5.add(r8)
            goto L_0x01f7
        L_0x020f:
            com.moovit.metroentities.MetroEntityType r7 = com.moovit.metroentities.MetroEntityType.TRANSIT_PATTERN
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r8 = r4.f17412b
            r8.mo47002b(r7, r5)
            r4.mo21067b(r7)
            i30.c r5 = new i30.c
            java.lang.String r7 = "MotQrCodeTripsTask.patterns"
            r5.<init>(r2, r7, r3, r4)
            i30.d r2 = r5.mo21062P()
            java.util.Iterator r3 = r1.iterator()
        L_0x0228:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0262
            java.lang.Object r4 = r3.next()
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r4 = (com.moovit.app.mot.purchase.model.MotQrCodeTrip) r4
            com.moovit.util.time.Time r4 = r4.f39074d
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitPattern> r4 = r4.f23905f
            if (r4 != 0) goto L_0x023b
            goto L_0x0228
        L_0x023b:
            j40.a r4 = r4.get()
            com.moovit.transit.TransitPattern r4 = (com.moovit.transit.TransitPattern) r4
            if (r4 != 0) goto L_0x0244
            goto L_0x0228
        L_0x0244:
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r4 = r4.f23709c
            java.util.Iterator r4 = r4.iterator()
        L_0x024a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0228
            java.lang.Object r5 = r4.next()
            com.moovit.database.DbEntityRef r5 = (com.moovit.database.DbEntityRef) r5
            com.moovit.network.model.ServerId r7 = r5.getServerId()
            com.moovit.transit.TransitStop r7 = r2.mo21064c(r7)
            r5.resolveTo(r7)
            goto L_0x024a
        L_0x0262:
            q00.a r10 = r0.f50297d
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r11 = r0.f50298e
            java.util.List<com.moovit.network.model.ServerId> r2 = r0.f50299f
            r16 = r2
            r17 = r6
            r18 = r1
            hq.b r2 = m47236a(r10, r11, r12, r14, r16, r17, r18)
            zz.i0 r3 = new zz.i0
            r3.<init>(r1, r2)
        L_0x0277:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p829tu.C19785p.call():java.lang.Object");
    }
}
