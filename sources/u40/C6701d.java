package u40;

import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Shape;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import g30.C4776h;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p824tp.C19728f;
import r40.C6252c;
import t40.C6590a;

/* renamed from: u40.d */
public final class C6701d implements Continuation<C6590a, Task<C6590a>> {

    /* renamed from: b */
    public final C13752e f20778b;

    /* renamed from: c */
    public final C19728f f20779c;

    public C6701d(C13752e eVar, C19728f fVar) {
        C21100e.m49373x(eVar, "requestContext");
        this.f20778b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f20779c = fVar;
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
                        for (DbEntityRef<Shape> serverId : next.f23720e) {
                            hashSet.add(serverId.getServerId());
                        }
                        for (DbEntityRef<Shape> serverId2 : next.f23721f) {
                            hashSet.add(serverId2.getServerId());
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                dVar = C5268d.f17403i;
            } else {
                try {
                    C13752e eVar = this.f20778b;
                    C4776h hVar = this.f20779c.f50165a;
                    C5269e eVar2 = new C5269e();
                    C21100e.m49373x(eVar, "requestContext");
                    C21100e.m49373x(hVar, "metroInfo");
                    eVar2.f17412b.mo47002b(MetroEntityType.SHAPE, hashSet);
                    dVar = new C5274h(eVar, "LineGroupTripsShapesResolver", hVar, eVar2).mo21062P();
                } catch (Exception unused) {
                    dVar = C5268d.f17403i;
                }
            }
            for (C6252c cVar2 : aVar.f20410b) {
                List<TransitPatternTrips> list2 = cVar2.f19727b;
                if (list2 != null) {
                    for (TransitPatternTrips next2 : list2) {
                        List<DbEntityRef<TransitStop>> list3 = next2.f23717b.f23709c;
                        ArrayList arrayList = new ArrayList(list3.size());
                        for (DbEntityRef next3 : list3) {
                            TransitStop transitStop = (TransitStop) next3.get();
                            if (transitStop != null) {
                                arrayList.add(transitStop.f23732d);
                            } else {
                                StringBuilder k = C13555b.m33972k("Transit stop does not exists in database. id=");
                                k.append(next3.getServerId());
                                throw new IllegalStateException(k.toString());
                            }
                        }
                        Polylon polylon = new Polylon(arrayList, true);
                        for (DbEntityRef next4 : next2.f23720e) {
                            if (!next4.isResolved()) {
                                ServerId serverId3 = next4.getServerId();
                                Shape shape = (Shape) dVar.f17409f.get(serverId3);
                                if (shape == null) {
                                    shape = new Shape(serverId3, polylon);
                                }
                                next4.resolveTo(shape);
                            }
                        }
                        for (DbEntityRef next5 : next2.f23721f) {
                            if (!next5.isResolved()) {
                                ServerId serverId4 = next5.getServerId();
                                Shape shape2 = (Shape) dVar.f17409f.get(serverId4);
                                if (shape2 == null) {
                                    shape2 = new Shape(serverId4, polylon);
                                }
                                next5.resolveTo(shape2);
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return task;
    }
}
