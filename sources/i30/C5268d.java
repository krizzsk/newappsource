package i30;

import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DbEntityRef;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.Shape;
import com.moovit.transit.ShapeSegment;
import com.moovit.transit.TransitFrequency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPlatform;
import com.moovit.util.ServerIdMap;
import j40.C5384a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: i30.d */
public final class C5268d {

    /* renamed from: i */
    public static final C5268d f17403i = new C5268d(new CollectionHashMap.HashSetHashMap());

    /* renamed from: a */
    public final ServerIdMap<TransitStop> f17404a = new ServerIdMap<>();

    /* renamed from: b */
    public final ServerIdMap<TransitLineGroup> f17405b = new ServerIdMap<>();

    /* renamed from: c */
    public final ServerIdMap<TransitLine> f17406c = new ServerIdMap<>();

    /* renamed from: d */
    public final ServerIdMap<TransitPattern> f17407d = new ServerIdMap<>();

    /* renamed from: e */
    public final ServerIdMap<BicycleStop> f17408e = new ServerIdMap<>();

    /* renamed from: f */
    public final ServerIdMap<Shape> f17409f = new ServerIdMap<>();

    /* renamed from: g */
    public final ServerIdMap<ShapeSegment> f17410g = new ServerIdMap<>();

    /* renamed from: h */
    public final ServerIdMap<TransitFrequency> f17411h = new ServerIdMap<>();

    public C5268d(CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap) {
        Collection<C5384a> collection = (Collection) hashSetHashMap.get(MetroEntityType.TRANSIT_LINE_GROUP);
        if (collection != null) {
            for (C5384a aVar : collection) {
                TransitLineGroup transitLineGroup = (TransitLineGroup) aVar;
                this.f17405b.put(transitLineGroup.f23694b, transitLineGroup);
                for (TransitLine next : transitLineGroup.f23700h) {
                    this.f17406c.put(next.f23687c, next);
                }
            }
        }
        Collection<C5384a> collection2 = (Collection) hashSetHashMap.get(MetroEntityType.TRANSIT_LINE);
        if (collection2 != null) {
            for (C5384a aVar2 : collection2) {
                TransitLineGroup transitLineGroup2 = (TransitLineGroup) aVar2;
                this.f17405b.put(transitLineGroup2.f23694b, transitLineGroup2);
                for (TransitLine next2 : transitLineGroup2.f23700h) {
                    this.f17406c.put(next2.f23687c, next2);
                }
            }
        }
        Collection<C5384a> collection3 = (Collection) hashSetHashMap.get(MetroEntityType.TRANSIT_STOP);
        if (collection3 != null) {
            for (C5384a aVar3 : collection3) {
                TransitStop transitStop = (TransitStop) aVar3;
                this.f17404a.put(transitStop.f23730b, transitStop);
                mo21065d(transitStop.f23735g);
                mo21065d(transitStop.f23737i);
                for (TransitStopPlatform transitStopPlatform : transitStop.f23741m) {
                    mo21065d(transitStopPlatform.f23755c);
                }
            }
        }
        Collection<C5384a> collection4 = (Collection) hashSetHashMap.get(MetroEntityType.TRANSIT_PATTERN);
        if (collection4 != null) {
            for (C5384a aVar4 : collection4) {
                TransitPattern transitPattern = (TransitPattern) aVar4;
                this.f17407d.put(transitPattern.f23708b, transitPattern);
                for (DbEntityRef next3 : transitPattern.f23709c) {
                    if (!next3.isResolved()) {
                        TransitStop transitStop2 = (TransitStop) this.f17404a.get(next3.getServerId());
                        if (transitStop2 != null) {
                            next3.resolveTo(transitStop2);
                        }
                    }
                }
            }
        }
        Collection<C5384a> collection5 = (Collection) hashSetHashMap.get(MetroEntityType.BICYCLE_STOP);
        if (collection5 != null) {
            for (C5384a aVar5 : collection5) {
                BicycleStop bicycleStop = (BicycleStop) aVar5;
                this.f17408e.put(bicycleStop.f23637c, bicycleStop);
            }
        }
        Collection<C5384a> collection6 = (Collection) hashSetHashMap.get(MetroEntityType.SHAPE);
        if (collection6 != null) {
            for (C5384a aVar6 : collection6) {
                Shape shape = (Shape) aVar6;
                this.f17409f.put(shape.f23663b, shape);
            }
        }
        Collection<C5384a> collection7 = (Collection) hashSetHashMap.get(MetroEntityType.SHAPE_SEGMENT);
        if (collection7 != null) {
            for (C5384a aVar7 : collection7) {
                ShapeSegment shapeSegment = (ShapeSegment) aVar7;
                this.f17410g.put(shapeSegment.f23666b, shapeSegment);
            }
        }
        Collection<C5384a> collection8 = (Collection) hashSetHashMap.get(MetroEntityType.TRANSIT_FREQUENCIES);
        if (collection8 != null) {
            for (C5384a aVar8 : collection8) {
                TransitFrequency transitFrequency = (TransitFrequency) aVar8;
                this.f17411h.put(transitFrequency.f23679b, transitFrequency);
            }
        }
    }

    /* renamed from: a */
    public static <RS extends C5266b<?, ?>> C5268d m13299a(Collection<RS> collection) {
        CollectionHashMap.HashSetHashMap hashSetHashMap = new CollectionHashMap.HashSetHashMap();
        for (RS rs : collection) {
            hashSetHashMap.mo47001a(rs.f17401m, rs.f17402n);
        }
        return new C5268d(hashSetHashMap);
    }

    /* renamed from: b */
    public final TransitLine mo21063b(ServerId serverId) {
        return (TransitLine) this.f17406c.get(serverId);
    }

    /* renamed from: c */
    public final TransitStop mo21064c(ServerId serverId) {
        return (TransitStop) this.f17404a.get(serverId);
    }

    /* renamed from: d */
    public final void mo21065d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbEntityRef dbEntityRef = (DbEntityRef) it.next();
            if (!dbEntityRef.isResolved()) {
                TransitLine transitLine = (TransitLine) this.f17406c.get(dbEntityRef.getServerId());
                if (transitLine != null) {
                    dbEntityRef.resolveTo(transitLine);
                }
            }
        }
    }
}
