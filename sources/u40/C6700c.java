package u40;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.ShapeSegment;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternShape;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import g30.C4776h;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import java.util.HashSet;
import java.util.List;
import p824tp.C19728f;
import p826tr.C19752b;
import p900wt.C20415e;
import r40.C6252c;
import t40.C6590a;

/* renamed from: u40.c */
public final class C6700c implements Continuation<C6590a, Task<C6590a>> {

    /* renamed from: b */
    public final C13752e f20776b;

    /* renamed from: c */
    public final C19728f f20777c;

    public C6700c(C13752e eVar, C19728f fVar) {
        C21100e.m49373x(eVar, "requestContext");
        this.f20776b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f20777c = fVar;
    }

    /* renamed from: a */
    public static void m15800a(TransitPatternShape transitPatternShape, C5268d dVar, TransitPattern transitPattern) {
        List<DbEntityRef<TransitStop>> list = transitPattern.f23709c;
        List<DbEntityRef<ShapeSegment>> list2 = transitPatternShape.f23713b;
        for (int i = 0; i < list2.size(); i++) {
            DbEntityRef dbEntityRef = list2.get(i);
            if (!dbEntityRef.isResolved()) {
                ServerId serverId = dbEntityRef.getServerId();
                ShapeSegment shapeSegment = (ShapeSegment) dVar.f17410g.get(serverId);
                if (shapeSegment == null) {
                    DbEntityRef dbEntityRef2 = list.get(i);
                    DbEntityRef dbEntityRef3 = list.get(i + 1);
                    shapeSegment = new ShapeSegment(serverId, dbEntityRef2.getServerId(), dbEntityRef3.getServerId(), Polylon.m40193b(((TransitStop) dbEntityRef2.get()).f23732d, ((TransitStop) dbEntityRef3.get()).f23732d));
                }
                dbEntityRef.resolveTo(shapeSegment);
            }
        }
    }

    public final Object then(Task task) throws Exception {
        C5268d dVar;
        if (task.isSuccessful()) {
            C6590a aVar = (C6590a) task.getResult();
            HashSet hashSet = new HashSet();
            for (C6252c cVar : aVar.f20410b) {
                List<TransitPatternTrips> list = cVar.f19727b;
                if (list != null) {
                    for (TransitPatternTrips next : list) {
                        for (TransitPatternShape transitPatternShape : next.f23722g) {
                            C13720d.m34276f(transitPatternShape.f23713b, (C13722f) null, new C20415e(12), hashSet);
                        }
                        for (TransitPatternShape transitPatternShape2 : next.f23723h) {
                            C13720d.m34276f(transitPatternShape2.f23713b, (C13722f) null, new C19752b(13), hashSet);
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                dVar = C5268d.f17403i;
            } else {
                try {
                    C13752e eVar = this.f20776b;
                    C4776h hVar = this.f20777c.f50165a;
                    C5269e eVar2 = new C5269e();
                    C21100e.m49373x(eVar, "requestContext");
                    C21100e.m49373x(hVar, "metroInfo");
                    eVar2.f17412b.mo47002b(MetroEntityType.SHAPE_SEGMENT, hashSet);
                    dVar = new C5274h(eVar, "LineGroupTripsShapeSegmentsResolver", hVar, eVar2).mo21062P();
                } catch (Exception unused) {
                    dVar = C5268d.f17403i;
                }
            }
            for (C6252c cVar2 : aVar.f20410b) {
                List<TransitPatternTrips> list2 = cVar2.f19727b;
                if (list2 != null) {
                    for (TransitPatternTrips next2 : list2) {
                        TransitPattern transitPattern = next2.f23717b;
                        for (TransitPatternShape a : next2.f23722g) {
                            m15800a(a, dVar, transitPattern);
                        }
                        for (TransitPatternShape a2 : next2.f23723h) {
                            m15800a(a2, dVar, transitPattern);
                        }
                    }
                }
            }
        }
        return task;
    }
}
