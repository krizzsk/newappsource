package p499fu;

import c00.C13717b;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitPatternTrips;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p523gu.C17231c;
import p952yy.C20787c;

/* renamed from: fu.a */
public final class C17073a extends C17231c {

    /* renamed from: A */
    public final HashMap f44255A;

    /* renamed from: B */
    public final C6302b f44256B;

    /* renamed from: y */
    public final List<TransitLine> f44257y;

    /* renamed from: z */
    public final List<TransitPatternTrips> f44258z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17073a(android.content.Context r14, java.util.List r15, java.util.List r16, java.util.ArrayList r17, com.moovit.network.model.ServerId r18, com.moovit.transit.TransitStop r19, com.moovit.app.linedetail.p416ui.C15101a r20, com.moovit.app.linedetail.p416ui.C15101a r21) {
        /*
            r13 = this;
            r9 = r13
            r10 = r15
            r11 = r17
            r12 = 0
            java.lang.Object r0 = r15.get(r12)
            r2 = r0
            com.moovit.transit.TransitLine r2 = (com.moovit.transit.TransitLine) r2
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L_0x0014
            r0 = 0
            goto L_0x001a
        L_0x0014:
            java.lang.Object r0 = r11.get(r12)
            com.moovit.transit.TransitPatternTrips r0 = (com.moovit.transit.TransitPatternTrips) r0
        L_0x001a:
            r4 = r0
            r0 = r13
            r1 = r14
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            s0.b r0 = new s0.b
            r0.<init>()
            r9.f44256B = r0
            r9.f44257y = r10
            r9.f44258z = r11
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r16.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r16.iterator()
        L_0x0042:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r1.next()
            com.moovit.transit.TransitStop r2 = (com.moovit.transit.TransitStop) r2
            com.moovit.network.model.ServerId r2 = r2.f23730b
            int r3 = com.moovit.transit.C7843b.f23777a
            com.moovit.transit.Schedule r3 = new com.moovit.transit.Schedule
            java.util.List r4 = java.util.Collections.emptyList()
            r3.<init>(r4)
            java.util.Iterator r4 = r17.iterator()
        L_0x005f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0086
            java.lang.Object r5 = r4.next()
            com.moovit.transit.TransitPatternTrips r5 = (com.moovit.transit.TransitPatternTrips) r5
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.transit.Schedule> r5 = r5.f23726k
            java.lang.Object r5 = r5.get(r2)
            com.moovit.transit.Schedule r5 = (com.moovit.transit.Schedule) r5
            if (r5 == 0) goto L_0x005f
            r6 = 2
            com.moovit.transit.Schedule[] r6 = new com.moovit.transit.Schedule[r6]
            r6[r12] = r3
            r3 = 1
            r6[r3] = r5
            java.util.List r3 = java.util.Arrays.asList(r6)
            com.moovit.transit.Schedule r3 = com.moovit.transit.Schedule.m17781C(r3)
            goto L_0x005f
        L_0x0086:
            r0.put(r2, r3)
            goto L_0x0042
        L_0x008a:
            r9.f44255A = r0
            java.util.Iterator r0 = r17.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00af
            java.lang.Object r1 = r0.next()
            com.moovit.transit.TransitPatternTrips r1 = (com.moovit.transit.TransitPatternTrips) r1
            com.moovit.commons.geo.BoxE6 r1 = r1.f23727l
            if (r1 != 0) goto L_0x00a1
            goto L_0x0090
        L_0x00a1:
            com.moovit.commons.geo.BoxE6 r2 = r9.f44548r
            if (r2 != 0) goto L_0x00a8
            r9.f44548r = r1
            goto L_0x0090
        L_0x00a8:
            com.moovit.commons.geo.BoxE6 r1 = r2.mo46895b(r1)
            r9.f44548r = r1
            goto L_0x0090
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p499fu.C17073a.<init>(android.content.Context, java.util.List, java.util.List, java.util.ArrayList, com.moovit.network.model.ServerId, com.moovit.transit.TransitStop, com.moovit.app.linedetail.ui.a, com.moovit.app.linedetail.ui.a):void");
    }

    /* renamed from: j */
    public final Schedule mo49673j(int i, ServerId serverId) {
        return (Schedule) this.f44256B.getOrDefault(serverId, null);
    }

    /* renamed from: k */
    public final Schedule mo49674k(int i, ServerId serverId) {
        return (Schedule) this.f44255A.get(serverId);
    }

    /* renamed from: l */
    public final void mo49675l(CollectionHashMap.ArrayListHashMap arrayListHashMap) {
        CollectionHashMap.ArrayListHashMap arrayListHashMap2 = new CollectionHashMap.ArrayListHashMap();
        for (TransitLine transitLine : this.f44257y) {
            List<C20787c> list = (List) arrayListHashMap.get(transitLine.f23687c);
            if (!C13717b.m34258e(list)) {
                for (C20787c cVar : list) {
                    arrayListHashMap2.mo47001a(cVar.f52457b, cVar.f52458c);
                }
            }
        }
        boolean z = false;
        for (Map.Entry entry : arrayListHashMap2.entrySet()) {
            ServerId serverId = (ServerId) entry.getKey();
            List list2 = (List) entry.getValue();
            if (!C13717b.m34258e(list2)) {
                this.f44256B.put(serverId, Schedule.m17781C(list2));
                z = true;
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
    }
}
