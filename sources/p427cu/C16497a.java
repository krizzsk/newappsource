package p427cu;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13557b;
import ce0.C21100e;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import h20.C17296a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p054d0.C4314v;
import p241s0.C6302b;
import p499fu.C17073a;
import p499fu.C17074b;
import p523gu.C17228a;

/* renamed from: cu.a */
public abstract class C16497a extends C13557b<Void, Void, Object[]> {

    /* renamed from: j */
    public static final /* synthetic */ int f43085j = 0;

    /* renamed from: b */
    public final TransitLineGroup f43086b;

    /* renamed from: c */
    public final Map<ServerId, List<TransitPatternTrips>> f43087c;

    /* renamed from: d */
    public final Map<CharSequence, List<TransitStop>> f43088d;

    /* renamed from: e */
    public final ServerId f43089e;

    /* renamed from: f */
    public final ServerId f43090f;

    /* renamed from: g */
    public final ServerId f43091g;

    /* renamed from: h */
    public final Time f43092h;

    /* renamed from: i */
    public final LatLonE6 f43093i;

    /* renamed from: cu.a$a */
    public static class C16498a {

        /* renamed from: a */
        public final float f43094a;

        /* renamed from: b */
        public Time f43095b;

        /* renamed from: c */
        public ServerId f43096c;

        /* renamed from: d */
        public ServerId f43097d;

        public C16498a(TransitStop transitStop, float f) {
            this.f43094a = f;
        }
    }

    public C16497a(TransitLineGroup transitLineGroup, Map<ServerId, List<TransitPatternTrips>> map, Map<CharSequence, List<TransitStop>> map2, ServerId serverId, ServerId serverId2, ServerId serverId3, Time time, LatLonE6 latLonE6) {
        C21100e.m49373x(transitLineGroup, "lineGroup");
        this.f43086b = transitLineGroup;
        C21100e.m49373x(map, "patternTripsByLineId");
        this.f43087c = map;
        this.f43088d = map2;
        this.f43089e = serverId;
        this.f43090f = serverId2;
        this.f43091g = serverId3;
        this.f43092h = time;
        this.f43093i = latLonE6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: com.moovit.network.model.ServerId} */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x032b, code lost:
        if (r11 != null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x033b, code lost:
        if (r11 != null) goto L_0x0355;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            com.moovit.transit.TransitLineGroup r1 = r0.f43086b
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<com.moovit.transit.TransitPatternTrips>> r2 = r0.f43087c
            java.util.List<com.moovit.transit.TransitLine> r3 = r1.f23700h
            java.util.ArrayList r3 = com.moovit.network.model.ServerId.m11393d(r3)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap r5 = new com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap
            r5.<init>()
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap r6 = new com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap
            r6.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0027:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            com.moovit.network.model.ServerId r8 = (com.moovit.network.model.ServerId) r8
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            boolean r9 = c00.C13717b.m34258e(r7)
            if (r9 == 0) goto L_0x0046
            goto L_0x0027
        L_0x0046:
            java.util.Iterator r7 = r7.iterator()
        L_0x004a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0027
            java.lang.Object r9 = r7.next()
            com.moovit.transit.TransitPatternTrips r9 = (com.moovit.transit.TransitPatternTrips) r9
            com.moovit.transit.TransitPattern r9 = r9.f23717b
            com.moovit.network.model.ServerId r10 = r9.f23708b
            r4.put(r10, r9)
            r5.mo47001a(r8, r10)
            goto L_0x004a
        L_0x0061:
            java.util.List<com.moovit.transit.TransitLine> r1 = r1.f23700h
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()
            com.moovit.transit.TransitLine r2 = (com.moovit.transit.TransitLine) r2
            java.lang.String r7 = r2.f23691g
            if (r7 == 0) goto L_0x0067
            com.moovit.network.model.ServerId r2 = r2.f23687c
            r6.mo47001a(r7, r2)
            goto L_0x0067
        L_0x007d:
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<com.moovit.transit.TransitPatternTrips>> r1 = r0.f43087c
            com.moovit.util.time.Time r2 = r0.f43092h
            u90.a r7 = new u90.a
            r7.<init>(r2)
            s0.b r2 = new s0.b
            int r8 = r1.size()
            r2.<init>((int) r8)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0097:
            boolean r8 = r1.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            java.lang.Object r11 = r8.getValue()
            java.util.Collection r11 = (java.util.Collection) r11
            r10.<init>(r11)
            c00.C13723g.m34285f(r10, r9, r7)
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x0097
            java.lang.Object r8 = r8.getKey()
            com.moovit.network.model.ServerId r8 = (com.moovit.network.model.ServerId) r8
            r2.put(r8, r10)
            goto L_0x0097
        L_0x00c2:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00ca
            goto L_0x04b4
        L_0x00ca:
            com.moovit.util.time.Time r1 = r0.f43092h
            com.moovit.commons.geo.LatLonE6 r7 = r0.f43093i
            if (r1 == 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            com.moovit.util.time.Time r1 = com.moovit.util.time.Time.m17980k()
        L_0x00d5:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Set r10 = r2.entrySet()
            s0.g$b r10 = (p241s0.C6307g.C6309b) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00e4:
            r11 = r10
            s0.g$d r11 = (p241s0.C6307g.C6311d) r11
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0182
            r11.next()
            java.lang.Object r12 = r11.getKey()
            com.moovit.network.model.ServerId r12 = (com.moovit.network.model.ServerId) r12
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            boolean r13 = c00.C13717b.m34258e(r11)
            if (r13 == 0) goto L_0x0103
            goto L_0x00e4
        L_0x0103:
            java.util.Iterator r11 = r11.iterator()
        L_0x0107:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00e4
            java.lang.Object r13 = r11.next()
            com.moovit.transit.TransitPatternTrips r13 = (com.moovit.transit.TransitPatternTrips) r13
            com.moovit.transit.TransitPattern r14 = r13.f23717b
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r15 = r14.f23709c
            java.util.List r15 = com.moovit.database.DbEntityRef.getEntities(r15)
            java.util.Iterator r15 = r15.iterator()
        L_0x011f:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0107
            java.lang.Object r16 = r15.next()
            r9 = r16
            com.moovit.transit.TransitStop r9 = (com.moovit.transit.TransitStop) r9
            r16 = r10
            com.moovit.network.model.ServerId r10 = r9.f23730b
            java.lang.Object r17 = r8.get(r10)
            cu.a$a r17 = (p427cu.C16497a.C16498a) r17
            if (r17 != 0) goto L_0x0154
            if (r7 == 0) goto L_0x0144
            r18 = r11
            com.moovit.commons.geo.LatLonE6 r11 = r9.f23732d
            float r11 = com.moovit.commons.geo.LatLonE6.m40174c(r7, r11)
            goto L_0x0149
        L_0x0144:
            r18 = r11
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0149:
            r19 = r7
            cu.a$a r7 = new cu.a$a
            r7.<init>(r9, r11)
            r8.put(r10, r7)
            goto L_0x015a
        L_0x0154:
            r19 = r7
            r18 = r11
            r7 = r17
        L_0x015a:
            com.moovit.network.model.ServerId r9 = r9.f23730b
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.transit.Schedule> r10 = r13.f23726k
            java.lang.Object r9 = r10.get(r9)
            com.moovit.transit.Schedule r9 = (com.moovit.transit.Schedule) r9
            com.moovit.util.time.Time r9 = r9.mo24328s(r1)
            com.moovit.util.time.Time r10 = r7.f43095b
            if (r10 == 0) goto L_0x0172
            int r10 = p977zz.C20975x0.m49116c(r10, r9)
            if (r10 <= 0) goto L_0x017a
        L_0x0172:
            r7.f43095b = r9
            com.moovit.network.model.ServerId r9 = r14.f23708b
            r7.f43096c = r9
            r7.f43097d = r12
        L_0x017a:
            r10 = r16
            r11 = r18
            r7 = r19
            r9 = 0
            goto L_0x011f
        L_0x0182:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x018f:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x01da
            java.lang.Object r9 = r7.next()
            com.moovit.transit.TransitPattern r9 = (com.moovit.transit.TransitPattern) r9
            com.moovit.network.model.ServerId r10 = r9.f23708b
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r9 = r9.f23709c
            java.util.ArrayList r9 = com.moovit.network.model.ServerId.m11393d(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x01a7:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x018f
            java.lang.Object r11 = r9.next()
            com.moovit.network.model.ServerId r11 = (com.moovit.network.model.ServerId) r11
            java.lang.Object r12 = r8.get(r11)
            cu.a$a r12 = (p427cu.C16497a.C16498a) r12
            if (r12 != 0) goto L_0x01bc
            goto L_0x01a7
        L_0x01bc:
            java.lang.Object r13 = r1.get(r10)
            com.moovit.network.model.ServerId r13 = (com.moovit.network.model.ServerId) r13
            if (r13 == 0) goto L_0x01cb
            java.lang.Object r13 = r8.get(r13)
            cu.a$a r13 = (p427cu.C16497a.C16498a) r13
            goto L_0x01cc
        L_0x01cb:
            r13 = 0
        L_0x01cc:
            if (r13 == 0) goto L_0x01d6
            float r13 = r13.f43094a
            float r12 = r12.f43094a
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x01a7
        L_0x01d6:
            r1.put(r10, r11)
            goto L_0x01a7
        L_0x01da:
            java.util.HashMap r7 = new java.util.HashMap
            int r9 = r1.size()
            r7.<init>(r9)
            java.util.Set r9 = r4.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x01eb:
            boolean r10 = r9.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x022a
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r12 = r10.getKey()
            com.moovit.network.model.ServerId r12 = (com.moovit.network.model.ServerId) r12
            java.lang.Object r10 = r10.getValue()
            com.moovit.transit.TransitPattern r10 = (com.moovit.transit.TransitPattern) r10
            java.lang.Object r13 = r1.get(r12)
            com.moovit.network.model.ServerId r13 = (com.moovit.network.model.ServerId) r13
            if (r13 == 0) goto L_0x0213
            java.lang.Object r14 = r8.get(r13)
            cu.a$a r14 = (p427cu.C16497a.C16498a) r14
            goto L_0x0214
        L_0x0213:
            r14 = 0
        L_0x0214:
            if (r14 == 0) goto L_0x0222
            float r14 = r14.f43094a
            r15 = 1157234688(0x44fa0000, float:2000.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 > 0) goto L_0x0222
            r7.put(r12, r13)
            goto L_0x01eb
        L_0x0222:
            com.moovit.network.model.ServerId r10 = r10.mo24385c(r11)
            r7.put(r12, r10)
            goto L_0x01eb
        L_0x022a:
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap r9 = new com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap
            r9.<init>()
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x0237:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x024b
            java.lang.Object r10 = r8.next()
            cu.a$a r10 = (p427cu.C16497a.C16498a) r10
            com.moovit.network.model.ServerId r12 = r10.f43097d
            if (r12 == 0) goto L_0x0237
            r9.mo47001a(r12, r10)
            goto L_0x0237
        L_0x024b:
            java.util.HashMap r8 = new java.util.HashMap
            int r10 = r9.size()
            r8.<init>(r10)
            java.util.Set r10 = r2.entrySet()
            s0.g$b r10 = (p241s0.C6307g.C6309b) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x025e:
            r12 = r10
            s0.g$d r12 = (p241s0.C6307g.C6311d) r12
            boolean r13 = r12.hasNext()
            r14 = 1137180672(0x43c80000, float:400.0)
            r15 = 4
            if (r13 == 0) goto L_0x02bb
            r12.next()
            java.lang.Object r12 = r12.getKey()
            com.moovit.network.model.ServerId r12 = (com.moovit.network.model.ServerId) r12
            java.lang.Object r13 = r9.get(r12)
            java.util.List r13 = (java.util.List) r13
            boolean r16 = c00.C13717b.m34258e(r13)
            if (r16 != 0) goto L_0x028b
            x.l1 r11 = new x.l1
            r11.<init>(r15)
            java.lang.Object r11 = java.util.Collections.min(r13, r11)
            cu.a$a r11 = (p427cu.C16497a.C16498a) r11
            goto L_0x028c
        L_0x028b:
            r11 = 0
        L_0x028c:
            if (r11 == 0) goto L_0x029c
            float r15 = r11.f43094a
            int r14 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x029c
            com.moovit.network.model.ServerId r14 = r11.f43097d
            if (r14 == 0) goto L_0x029c
            r8.put(r12, r11)
            goto L_0x02b9
        L_0x029c:
            boolean r11 = c00.C13717b.m34258e(r13)
            if (r11 != 0) goto L_0x02af
            r8.c r11 = new r8.c
            r14 = 4
            r11.<init>(r14)
            java.lang.Object r11 = java.util.Collections.min(r13, r11)
            cu.a$a r11 = (p427cu.C16497a.C16498a) r11
            goto L_0x02b0
        L_0x02af:
            r11 = 0
        L_0x02b0:
            if (r11 == 0) goto L_0x02b9
            com.moovit.network.model.ServerId r13 = r11.f43097d
            if (r13 == 0) goto L_0x02b9
            r8.put(r12, r11)
        L_0x02b9:
            r11 = 0
            goto L_0x025e
        L_0x02bb:
            java.util.HashMap r9 = new java.util.HashMap
            int r10 = r8.size()
            r9.<init>(r10)
            java.util.Set r10 = r2.entrySet()
            s0.g$b r10 = (p241s0.C6307g.C6309b) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x02ce:
            r11 = r10
            s0.g$d r11 = (p241s0.C6307g.C6311d) r11
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x030b
            r11.next()
            java.lang.Object r12 = r11.getKey()
            com.moovit.network.model.ServerId r12 = (com.moovit.network.model.ServerId) r12
            java.lang.Object r13 = r8.get(r12)
            cu.a$a r13 = (p427cu.C16497a.C16498a) r13
            if (r13 == 0) goto L_0x02f0
            com.moovit.network.model.ServerId r13 = r13.f43096c
            if (r13 == 0) goto L_0x02f0
            r9.put(r12, r13)
            goto L_0x02ce
        L_0x02f0:
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            boolean r13 = c00.C13717b.m34258e(r11)
            if (r13 != 0) goto L_0x02ce
            r13 = 0
            java.lang.Object r11 = r11.get(r13)
            com.moovit.transit.TransitPatternTrips r11 = (com.moovit.transit.TransitPatternTrips) r11
            com.moovit.transit.TransitPattern r11 = r11.f23717b
            com.moovit.network.model.ServerId r11 = r11.f23708b
            r9.put(r12, r11)
            goto L_0x02ce
        L_0x030b:
            java.util.Collection r10 = r8.values()
            boolean r11 = c00.C13717b.m34258e(r10)
            r12 = 3
            r13 = 1
            if (r11 != 0) goto L_0x033e
            s3.u r11 = new s3.u
            r15 = 4
            r11.<init>(r15)
            java.lang.Object r11 = java.util.Collections.min(r10, r11)
            cu.a$a r11 = (p427cu.C16497a.C16498a) r11
            float r15 = r11.f43094a
            int r14 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x032e
            com.moovit.network.model.ServerId r11 = r11.f43097d
            if (r11 == 0) goto L_0x032e
            goto L_0x0355
        L_0x032e:
            q5.a r11 = new q5.a
            r11.<init>(r12)
            java.lang.Object r10 = java.util.Collections.min(r10, r11)
            cu.a$a r10 = (p427cu.C16497a.C16498a) r10
            com.moovit.network.model.ServerId r11 = r10.f43097d
            if (r11 == 0) goto L_0x033e
            goto L_0x0355
        L_0x033e:
            pq.k r10 = new pq.k
            r10.<init>(r2, r13)
            java.lang.Object r2 = c00.C13723g.m34286g(r3, r10)
            r11 = r2
            com.moovit.network.model.ServerId r11 = (com.moovit.network.model.ServerId) r11
            if (r11 == 0) goto L_0x034d
            goto L_0x0355
        L_0x034d:
            r2 = 0
            java.lang.Object r10 = r3.get(r2)
            r11 = r10
            com.moovit.network.model.ServerId r11 = (com.moovit.network.model.ServerId) r11
        L_0x0355:
            com.moovit.network.model.ServerId r2 = r0.f43091g
            if (r2 == 0) goto L_0x0379
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x0361:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0379
            java.lang.Object r10 = r4.next()
            com.moovit.transit.TransitPattern r10 = (com.moovit.transit.TransitPattern) r10
            boolean r14 = r10.mo24390g(r2)
            if (r14 == 0) goto L_0x0361
            com.moovit.network.model.ServerId r10 = r10.f23708b
            r7.put(r10, r2)
            goto L_0x0361
        L_0x0379:
            com.moovit.network.model.ServerId r2 = r0.f43090f
            if (r2 == 0) goto L_0x03a9
            java.util.Set r4 = r9.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0385:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x03a9
            java.lang.Object r10 = r4.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r14 = r10.getKey()
            com.moovit.network.model.ServerId r14 = (com.moovit.network.model.ServerId) r14
            java.lang.Object r14 = r5.get(r14)
            java.util.Set r14 = (java.util.Set) r14
            if (r14 == 0) goto L_0x0385
            boolean r14 = r14.contains(r2)
            if (r14 == 0) goto L_0x0385
            r10.setValue(r2)
            goto L_0x0385
        L_0x03a9:
            com.moovit.network.model.ServerId r2 = r0.f43089e
            if (r2 == 0) goto L_0x03b5
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x03b5
            com.moovit.network.model.ServerId r11 = r0.f43089e
        L_0x03b5:
            c00.C13717b.m34270q(r9)
            c00.C13717b.m34270q(r7)
            com.moovit.transit.TransitLineGroup r2 = r0.f43086b
            int r2 = r2.f23695c
            r3 = 2
            if (r2 != r3) goto L_0x03c4
            r2 = 1
            goto L_0x03c5
        L_0x03c4:
            r2 = 0
        L_0x03c5:
            if (r2 != 0) goto L_0x03d6
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r11
            r2[r13] = r9
            r2[r3] = r7
            r2[r12] = r1
        L_0x03d3:
            r9 = r2
            goto L_0x04b4
        L_0x03d6:
            r2 = 4
            r4 = 0
            java.util.Map<java.lang.CharSequence, java.util.List<com.moovit.transit.TransitStop>> r5 = r0.f43088d
            boolean r5 = c00.C13717b.m34259f(r5)
            if (r5 == 0) goto L_0x03eb
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r11
            r2[r13] = r9
            r2[r3] = r7
            r2[r12] = r1
            goto L_0x03d3
        L_0x03eb:
            java.util.HashMap r2 = new java.util.HashMap
            int r4 = r6.size()
            r2.<init>(r4)
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x03fc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0423
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            l0.b r10 = new l0.b
            r10.<init>(r8, r13)
            java.lang.Object r5 = java.util.Collections.min(r5, r10)
            com.moovit.network.model.ServerId r5 = (com.moovit.network.model.ServerId) r5
            r2.put(r6, r5)
            goto L_0x03fc
        L_0x0423:
            java.util.Map<java.lang.CharSequence, java.util.List<com.moovit.transit.TransitStop>> r4 = r0.f43088d
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0437:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x049f
            java.lang.Object r8 = r2.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.Object r8 = r8.getValue()
            com.moovit.network.model.ServerId r8 = (com.moovit.network.model.ServerId) r8
            java.lang.Object r14 = r4.get(r10)
            java.util.List r14 = (java.util.List) r14
            boolean r15 = c00.C13717b.m34258e(r14)
            if (r15 == 0) goto L_0x045c
            goto L_0x0437
        L_0x045c:
            java.lang.Object r8 = r9.get(r8)
            com.moovit.network.model.ServerId r8 = (com.moovit.network.model.ServerId) r8
            if (r8 != 0) goto L_0x046f
            r15 = 0
            java.lang.Object r8 = r14.get(r15)
            com.moovit.transit.TransitStop r8 = (com.moovit.transit.TransitStop) r8
            r5.put(r10, r8)
            goto L_0x0437
        L_0x046f:
            r15 = 0
            com.moovit.util.ServerIdMap r12 = com.moovit.util.ServerIdMap.m17949a(r14)
            java.lang.Object r16 = r7.get(r8)
            r3 = r16
            com.moovit.network.model.ServerId r3 = (com.moovit.network.model.ServerId) r3
            java.lang.Object r3 = r12.get(r3)
            com.moovit.transit.TransitStop r3 = (com.moovit.transit.TransitStop) r3
            if (r3 != 0) goto L_0x048e
            java.lang.Object r3 = r14.get(r15)
            com.moovit.transit.TransitStop r3 = (com.moovit.transit.TransitStop) r3
            r5.put(r10, r3)
            goto L_0x049c
        L_0x048e:
            r5.put(r10, r3)
            java.lang.Object r3 = r1.get(r8)
            com.moovit.network.model.ServerId r3 = (com.moovit.network.model.ServerId) r3
            if (r3 == 0) goto L_0x049c
            r6.put(r10, r3)
        L_0x049c:
            r3 = 2
            r12 = 3
            goto L_0x0437
        L_0x049f:
            c00.C13717b.m34270q(r5)
            c00.C13717b.m34270q(r6)
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r11
            r1[r13] = r9
            r2 = 2
            r1[r2] = r5
            r2 = 3
            r1[r2] = r6
            r9 = r1
        L_0x04b4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p427cu.C16497a.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final void onPostExecute(Object obj) {
        boolean z;
        List list;
        boolean z2;
        TransitLine transitLine;
        Object[] objArr = (Object[]) obj;
        if (objArr == null) {
            C15101a.C15104c cVar = (C15101a.C15104c) this;
            C15101a.m38470n2(C15101a.this);
            C15101a aVar = C15101a.this;
            C15101a.C15107f fVar = aVar.f38842z;
            if (fVar.f38853g != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C15101a aVar2 = C15101a.this;
                C17296a aVar3 = fVar.f38848b;
                C15101a.C15107f fVar2 = new C15101a.C15107f(new C17296a(aVar3.f33829q, aVar3.f44680v, aVar3.f44681w, aVar3.f44682x, aVar3.f44683y + 1, aVar3.f44684z, aVar3.f44678A), fVar.f38853g + 1, fVar.f38849c, fVar.f38850d, fVar.f38851e, fVar.f38852f);
                aVar.f38842z = fVar2;
                aVar.f38841y = fVar2.mo45476b();
                return;
            }
            if (aVar.f38817G.f23700h.isEmpty()) {
                transitLine = null;
            } else {
                ServerId serverId = aVar.f38812B;
                if (serverId != null) {
                    transitLine = aVar.f38817G.mo24377c(serverId);
                } else {
                    transitLine = aVar.f38817G.f23700h.get(0);
                }
            }
            aVar.mo45455J2(R.string.line_detail_empty_options_selected_time, R.drawable.img_empty_state_line_view);
            aVar.f38833q.setPositiveButton((int) R.string.time_picker_select_different_time);
            aVar.mo45456K2("no_directions", true);
            aVar.mo46786U1(C15101a.C15108g.class, new C4314v(transitLine, 7));
            return;
        }
        TransitLineGroup transitLineGroup = this.f43086b;
        if (transitLineGroup.f23695c == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ServerId serverId2 = (ServerId) objArr[0];
            Map map = (Map) objArr[2];
            Map map2 = (Map) objArr[3];
            Map<ServerId, List<TransitPatternTrips>> map3 = this.f43087c;
            Time time = this.f43092h;
            C15101a.C15104c cVar2 = (C15101a.C15104c) this;
            C15101a.m38470n2(C15101a.this);
            C15101a aVar4 = C15101a.this;
            aVar4.mo45448C2((Map) objArr[1]);
            Iterator<TransitLine> it = transitLineGroup.f23700h.iterator();
            while (it.hasNext()) {
                TransitLine next = it.next();
                ServerId serverId3 = next.f23687c;
                if (map3.get(serverId3) == null) {
                    list = Collections.emptyList();
                } else {
                    list = map3.get(serverId3);
                }
                C6302b bVar = aVar4.f38824N;
                Context requireContext = aVar4.requireContext();
                List<RecyclerView.C1133l> list2 = aVar4.f38840x;
                Map map4 = map2;
                Map map5 = map2;
                C17228a aVar5 = r8;
                Iterator<TransitLine> it2 = it;
                C15101a aVar6 = aVar4;
                C17228a aVar7 = new C17228a(requireContext, next, list, map4, map, list2, aVar4.f38821K, aVar6, aVar6);
                bVar.put(serverId3, aVar5);
                map2 = map5;
                it = it2;
                aVar4 = aVar6;
            }
            C15101a aVar8 = aVar4;
            aVar8.mo45470x2(time);
            aVar8.mo45445A2(serverId2);
            aVar8.mo45450E2();
            return;
        }
        ServerId serverId4 = (ServerId) objArr[0];
        Map map6 = (Map) objArr[2];
        Map map7 = (Map) objArr[3];
        Map<ServerId, List<TransitPatternTrips>> map8 = this.f43087c;
        Time time2 = this.f43092h;
        C15101a.C15104c cVar3 = (C15101a.C15104c) this;
        C15101a.m38470n2(C15101a.this);
        C15101a aVar9 = C15101a.this;
        aVar9.mo45448C2((Map) objArr[1]);
        int i = C7843b.f23777a;
        HashMap hashMap = new HashMap();
        for (TransitLine next2 : transitLineGroup.f23700h) {
            List list3 = (List) hashMap.get(next2.f23691g);
            if (list3 == null) {
                list3 = new ArrayList();
                hashMap.put(next2.f23691g, list3);
            }
            list3.add(next2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getKey();
            List<TransitLine> list4 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (TransitLine transitLine2 : list4) {
                List list5 = map8.get(transitLine2.f23687c);
                if (list5 != null) {
                    arrayList.addAll(list5);
                }
            }
            List list6 = aVar9.f38827Q.get(charSequence);
            if (list6 == null || arrayList.isEmpty()) {
                list6 = Collections.emptyList();
            }
            aVar9.f38825O.put(charSequence, new C17074b(new C17073a(aVar9.requireContext(), list4, list6, arrayList, (ServerId) map7.get(charSequence), (TransitStop) map6.get(charSequence), aVar9, aVar9), aVar9.f38821K, aVar9.f38840x, aVar9));
        }
        ArrayList arrayList2 = new ArrayList();
        String str = "";
        for (TransitLine next3 : transitLineGroup.f23700h) {
            if (next3.f23687c.equals(serverId4)) {
                str = next3.f23691g;
                arrayList2.add(next3.f23687c);
            }
        }
        aVar9.mo45470x2(time2);
        aVar9.mo45471y2(str, arrayList2);
        aVar9.mo45450E2();
    }
}
