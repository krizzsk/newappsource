package i30;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.metroentities.MetroEntityType;
import com.tranzmate.moovit.protocol.sync.MVSyncEntitiesRequest;
import com.tranzmate.moovit.protocol.sync.MVSyncEntityRequest;
import com.tranzmate.moovit.protocol.sync.MVSyncEntityType;
import g30.C4776h;
import i30.C5265a;
import i30.C5266b;
import j30.C5382i;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19731i;
import p828tt.C19759a;
import p906wz.C20432d;
import p977zz.C20944i0;
import p977zz.C20952m0;
import s00.C19391d;

/* renamed from: i30.a */
public abstract class C5265a<RQ extends C5265a<RQ, RS>, RS extends C5266b<RQ, RS>> extends C13778r<RQ, RS, MVSyncEntitiesRequest> {

    /* renamed from: A */
    public final CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> f17395A = new CollectionHashMap.HashSetHashMap<>();

    /* renamed from: B */
    public final String f17396B;

    /* renamed from: w */
    public final String f17397w;

    /* renamed from: x */
    public final C5269e f17398x;

    /* renamed from: y */
    public final C19391d f17399y;

    /* renamed from: z */
    public final CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> f17400z = new CollectionHashMap.HashSetHashMap<>();

    public C5265a(C13752e eVar, int i, String str, C4776h hVar, C5269e eVar2, Class<RS> cls) {
        super(eVar, i, cls);
        C21100e.m49373x(eVar2, "idsCollection");
        if (!eVar2.isEmpty()) {
            C21100e.m49373x(str, "source");
            this.f17397w = str;
            this.f17398x = eVar2;
            C19731i a = C19731i.m47197a(eVar.f33852a);
            a.getClass();
            C19391d b = a.mo52084b(hVar.f16126a, hVar.f16127b);
            this.f17399y = b;
            StringBuilder k = C13555b.m33972k("MER(");
            k.append(eVar.f33854c);
            k.append(") id=");
            k.append(this.f33832t);
            String sb = k.toString();
            this.f17396B = sb;
            C16596f a2 = C16596f.m42113a();
            StringBuilder t = C0016g.m36t(sb, " metro id=");
            t.append(b.f49321d);
            t.append(" revision=");
            t.append(b.f49322e);
            a2.mo49363b(t.toString());
            return;
        }
        throw new IllegalArgumentException("idsCollection may not be empty!");
    }

    /* renamed from: Q */
    public static <RQ extends C5265a<RQ, RS>, RS extends C5266b<RQ, RS>> C5268d m13289Q(List<RS> list) {
        CollectionHashMap.HashSetHashMap hashSetHashMap = new CollectionHashMap.HashSetHashMap();
        for (RS rs : list) {
            hashSetHashMap.mo47001a(rs.f17401m, rs.f17402n);
        }
        return new C5268d(hashSetHashMap);
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return true;
    }

    /* renamed from: D */
    public final void mo21058D() {
        super.mo21058D();
        if (!this.f17395A.isEmpty()) {
            new C5382i(this.f51759b, this.f17399y, this.f17395A).run();
        }
    }

    /* renamed from: E */
    public final List<RS> mo21059E() {
        MVSyncEntityType mVSyncEntityType;
        boolean z;
        boolean z2 = false;
        try {
            Context context = this.f51759b;
            HashSet hashSet = new HashSet(this.f17398x.f17412b.size());
            do {
                C16596f a = C16596f.m42113a();
                a.mo49363b(this.f17396B + " pass:" + this.f17398x);
                hashSet.clear();
                hashSet.addAll(this.f17398x.mo21069e());
                Iterator it = hashSet.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= ((MetroEntityType) it.next()).getResolver().mo21358c(context, this.f17399y, this.f17400z, this.f17398x);
                }
            } while (z);
        } catch (SQLiteDatabaseCorruptException e) {
            C16596f.m42113a().mo49364c(e);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C20944i0<MetroEntityType, C5384a>> it2 = this.f17400z.iterator();
        while (it2.hasNext()) {
            C20944i0 next = it2.next();
            C5266b bVar = (C5266b) mo40056C();
            MetroEntityType metroEntityType = (MetroEntityType) next.f52692a;
            C5384a aVar = (C5384a) next.f52693b;
            bVar.getClass();
            C21100e.m49373x(metroEntityType, "itemType");
            bVar.f17401m = metroEntityType;
            C21100e.m49373x(aVar, "item");
            bVar.f17402n = aVar;
            arrayList.add(bVar);
        }
        if (this.f17398x.isEmpty()) {
            C16596f a2 = C16596f.m42113a();
            a2.mo49363b(this.f17396B + " fulfilled locally");
            this.f51765h = true;
        } else {
            C16596f a3 = C16596f.m42113a();
            a3.mo49363b(this.f17396B + " unable to resolve: " + this.f17398x);
            Set<MetroEntityType> e2 = this.f17398x.mo21069e();
            ArrayList arrayList2 = new ArrayList(e2.size());
            for (MetroEntityType next2 : e2) {
                C20952m0<Integer> m0Var = C13749c.f33838a;
                switch (C13749c.C13750a.f33839a[next2.ordinal()]) {
                    case 1:
                        mVSyncEntityType = MVSyncEntityType.StopGeographicObjects;
                        break;
                    case 2:
                        mVSyncEntityType = MVSyncEntityType.BicycleStop;
                        break;
                    case 3:
                        mVSyncEntityType = MVSyncEntityType.LineSummaries;
                        break;
                    case 4:
                        mVSyncEntityType = MVSyncEntityType.LineGroup;
                        break;
                    case 5:
                        mVSyncEntityType = MVSyncEntityType.TripPattern;
                        break;
                    case 6:
                        mVSyncEntityType = MVSyncEntityType.TripShape;
                        break;
                    case 7:
                        mVSyncEntityType = MVSyncEntityType.LineShapeSegment;
                        break;
                    case 8:
                        mVSyncEntityType = MVSyncEntityType.TripFrequency;
                        break;
                    default:
                        throw new ApplicationBugException("Unknown sync item type: " + next2);
                }
                MVSyncEntityRequest mVSyncEntityRequest = new MVSyncEntityRequest();
                mVSyncEntityRequest.syncEntityType = mVSyncEntityType;
                mVSyncEntityRequest.ids = C13720d.m34277g(this.f17398x.mo21068d(next2), (C13722f) null, new C19759a(12));
                arrayList2.add(mVSyncEntityRequest);
                z2 |= this.f17398x.f17413c.contains(next2);
            }
            RO mVSyncEntitiesRequest = new MVSyncEntitiesRequest();
            mVSyncEntitiesRequest.entitiesToSync = arrayList2;
            mVSyncEntitiesRequest.resolveReference = z2;
            mVSyncEntitiesRequest.mo32044i();
            mVSyncEntitiesRequest.source = this.f17397w;
            this.f33922v = mVSyncEntitiesRequest;
        }
        return arrayList;
    }

    /* renamed from: L */
    public final boolean mo20305L() {
        return false;
    }

    /* renamed from: M */
    public final void mo21060M(C17474b.C17475a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C17474b.C17475a aVar2 = aVar;
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap = this.f17400z;
        MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
        Set set = (Set) hashSetHashMap.get(metroEntityType);
        if (set != null) {
            i = set.size();
        } else {
            i = 0;
        }
        Set set2 = (Set) this.f17395A.get(metroEntityType);
        if (set2 != null) {
            i2 = set2.size();
        } else {
            i2 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap2 = this.f17400z;
        MetroEntityType metroEntityType2 = MetroEntityType.TRANSIT_LINE;
        Set set3 = (Set) hashSetHashMap2.get(metroEntityType2);
        if (set3 != null) {
            i3 = set3.size();
        } else {
            i3 = 0;
        }
        Set set4 = (Set) this.f17395A.get(metroEntityType2);
        if (set4 != null) {
            i4 = set4.size();
        } else {
            i4 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap3 = this.f17400z;
        MetroEntityType metroEntityType3 = MetroEntityType.TRANSIT_LINE_GROUP;
        Set set5 = (Set) hashSetHashMap3.get(metroEntityType3);
        if (set5 != null) {
            i5 = set5.size();
        } else {
            i5 = 0;
        }
        Set set6 = (Set) this.f17395A.get(metroEntityType3);
        if (set6 != null) {
            i6 = set6.size();
        } else {
            i6 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap4 = this.f17400z;
        MetroEntityType metroEntityType4 = MetroEntityType.TRANSIT_PATTERN;
        Set set7 = (Set) hashSetHashMap4.get(metroEntityType4);
        if (set7 != null) {
            i7 = set7.size();
        } else {
            i7 = 0;
        }
        Set set8 = (Set) this.f17395A.get(metroEntityType4);
        if (set8 != null) {
            i8 = set8.size();
        } else {
            i8 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap5 = this.f17400z;
        MetroEntityType metroEntityType5 = MetroEntityType.BICYCLE_STOP;
        Set set9 = (Set) hashSetHashMap5.get(metroEntityType5);
        if (set9 != null) {
            i9 = set9.size();
        } else {
            i9 = 0;
        }
        Set set10 = (Set) this.f17395A.get(metroEntityType5);
        if (set10 != null) {
            i11 = set10.size();
        } else {
            i11 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap6 = this.f17400z;
        MetroEntityType metroEntityType6 = MetroEntityType.SHAPE;
        Set set11 = (Set) hashSetHashMap6.get(metroEntityType6);
        if (set11 != null) {
            i12 = set11.size();
        } else {
            i12 = 0;
        }
        Set set12 = (Set) this.f17395A.get(metroEntityType6);
        if (set12 != null) {
            i13 = set12.size();
        } else {
            i13 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap7 = this.f17400z;
        MetroEntityType metroEntityType7 = MetroEntityType.SHAPE_SEGMENT;
        Set set13 = (Set) hashSetHashMap7.get(metroEntityType7);
        if (set13 != null) {
            i14 = set13.size();
        } else {
            i14 = 0;
        }
        int i18 = i13;
        Set set14 = (Set) this.f17395A.get(metroEntityType7);
        if (set14 != null) {
            i15 = set14.size();
        } else {
            i15 = 0;
        }
        CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap8 = this.f17400z;
        int i19 = i15;
        MetroEntityType metroEntityType8 = MetroEntityType.TRANSIT_FREQUENCIES;
        Set set15 = (Set) hashSetHashMap8.get(metroEntityType8);
        if (set15 != null) {
            i16 = set15.size();
        } else {
            i16 = 0;
        }
        Set set16 = (Set) this.f17395A.get(metroEntityType8);
        if (set16 != null) {
            i17 = set16.size();
        } else {
            i17 = 0;
        }
        aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, this.f17397w);
        aVar2.mo49935c(AnalyticsAttributeKey.READ_TRANSIT_STOPS_LOCAL_COUNT, i);
        aVar2.mo49935c(AnalyticsAttributeKey.READ_TRANSIT_STOPS_REMOTE_COUNT, i2);
        aVar2.mo49935c(AnalyticsAttributeKey.READ_TRANSIT_LINES_LOCAL_COUNT, i3);
        aVar2.mo49935c(AnalyticsAttributeKey.READ_TRANSIT_LINES_REMOTE_COUNT, i4);
        aVar2.mo49935c(AnalyticsAttributeKey.READ_TRANSIT_LINE_GROUPS_LOCAL_COUNT, i5);
        aVar2.mo49935c(AnalyticsAttributeKey.READ_TRANSIT_LINE_GROUPS_REMOTE_COUNT, i6);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17396B);
        sb.append(" LTS=");
        sb.append(i);
        sb.append(" RTS=");
        C0016g.m41y(sb, i2, " LTL=", i3, " RTL=");
        C0016g.m41y(sb, i4, " LTLG=", i5, " RTLG=");
        C0016g.m41y(sb, i6, " LTP=", i7, " RTP=");
        C0016g.m41y(sb, i8, " LBS=", i9, " RBS=");
        C0016g.m41y(sb, i11, " LS=", i12, " RS=");
        C0016g.m41y(sb, i18, " LSS=", i14, " RSS=");
        C0016g.m41y(sb, i19, " LTF=", i16, " RTF=");
        sb.append(i17);
        C16596f.m42113a().mo49363b(sb.toString());
    }

    /* renamed from: O */
    public final String mo21061O() {
        StringBuilder sb = new StringBuilder(getClass().getName());
        ArrayList arrayList = new ArrayList(this.f17398x.mo21069e());
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MetroEntityType metroEntityType = (MetroEntityType) it.next();
            sb.append('_');
            sb.append(metroEntityType.name());
            sb.append(':');
            sb.append(C13717b.m34269p(this.f17398x.mo21068d(metroEntityType)));
            sb.append('-');
            sb.append(this.f17398x.f17413c.contains(metroEntityType));
        }
        return sb.toString();
    }

    /* renamed from: P */
    public final C5268d mo21062P() throws IOException, ServerException {
        return m13289Q(mo52625I());
    }

    /* renamed from: u */
    public final void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        dVar.mo52632a("supplemental_data_state", 2);
    }
}
