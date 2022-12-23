package com.moovit.database;

import android.content.Context;
import c00.C13733n;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleProvider;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.Shape;
import com.moovit.transit.ShapeSegment;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitFrequency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19584i;
import p810sz.C19615p;
import p810sz.C19616q;
import p824tp.C19728f;
import p824tp.C19731i;

public final class DbEntityRef<T extends C5384a> implements C5384a {
    public static C19584i<DbEntityRef<TransitAgency>> AGENCY_REF_CODER = new Coder<TransitAgency>() {
        public DbEntityRef<TransitAgency> newInstance(ServerId serverId) {
            return DbEntityRef.newAgencyRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<BicycleProvider>> BICYCLE_PROVIDER_REF_CODER = new Coder<BicycleProvider>() {
        public DbEntityRef<BicycleProvider> newInstance(ServerId serverId) {
            return DbEntityRef.newBicycleProviderRef(serverId);
        }
    };
    public static C13733n<ServerId, DbEntityRef<BicycleStop>> BICYCLE_STOP_ID_TO_BICYCLE_STOP_REF_CONVERTER = new C13733n<ServerId, DbEntityRef<BicycleStop>>() {
        public DbEntityRef<BicycleStop> convert(ServerId serverId) throws RuntimeException {
            return DbEntityRef.newBicycleStopRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<BicycleStop>> BICYCLE_STOP_REF_CODER = new Coder<BicycleStop>() {
        public DbEntityRef<BicycleStop> newInstance(ServerId serverId) {
            return DbEntityRef.newBicycleStopRef(serverId);
        }
    };
    public static C13733n<ServerId, DbEntityRef<TransitLine>> LINE_ID_TO_LINE_REF_CONVERTER = new C13733n<ServerId, DbEntityRef<TransitLine>>() {
        public DbEntityRef<TransitLine> convert(ServerId serverId) throws RuntimeException {
            return DbEntityRef.newTransitLineRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<Shape>> SHAPE_REF_CODER = new Coder<Shape>() {
        public DbEntityRef<Shape> newInstance(ServerId serverId) {
            return DbEntityRef.newShapeRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<ShapeSegment>> SHAPE_SEGMENT_REF_CODER = new Coder<ShapeSegment>() {
        public DbEntityRef<ShapeSegment> newInstance(ServerId serverId) {
            return DbEntityRef.newShapeSegmentRef(serverId);
        }
    };
    public static C13733n<ServerId, DbEntityRef<TransitStop>> STOP_ID_TO_STOP_REF_CONVERTER = new C13733n<ServerId, DbEntityRef<TransitStop>>() {
        public DbEntityRef<TransitStop> convert(ServerId serverId) throws RuntimeException {
            return DbEntityRef.newTransitStopRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<TransitLineGroup>> TRANSIT_LINE_GROUP_REF_CODER = new Coder<TransitLineGroup>() {
        public DbEntityRef<TransitLineGroup> newInstance(ServerId serverId) {
            return DbEntityRef.newTransitLineGroupRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<TransitLine>> TRANSIT_LINE_REF_CODER = new Coder<TransitLine>() {
        public DbEntityRef<TransitLine> newInstance(ServerId serverId) {
            return DbEntityRef.newTransitLineRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<TransitPattern>> TRANSIT_PATTERN_REF_CODER = new Coder<TransitPattern>() {
        public DbEntityRef<TransitPattern> newInstance(ServerId serverId) {
            return DbEntityRef.newTransitPatternRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<TransitStop>> TRANSIT_STOP_REF_CODER = new Coder<TransitStop>() {
        public DbEntityRef<TransitStop> newInstance(ServerId serverId) {
            return DbEntityRef.newTransitStopRef(serverId);
        }
    };
    public static C19584i<DbEntityRef<TransitType>> TRANSIT_TYPE_REF_CODER = new Coder<TransitType>() {
        public DbEntityRef<TransitType> newInstance(ServerId serverId) {
            return DbEntityRef.newTransitTypeRef(serverId);
        }
    };
    private final Class<T> clazz;

    /* renamed from: id */
    public final ServerId f41323id;
    public T object;

    public static abstract class Coder<T extends C5384a> implements C19584i<DbEntityRef<T>> {
        private Coder() {
        }

        public abstract DbEntityRef<T> newInstance(ServerId serverId);

        public DbEntityRef<T> read(C19615p pVar) throws IOException {
            pVar.getClass();
            return newInstance(new ServerId(pVar.mo51924l()));
        }

        public void write(DbEntityRef<T> dbEntityRef, C19616q qVar) throws IOException {
            ServerId serverId = dbEntityRef.f41323id;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
        }
    }

    static {
        new Coder<TransitFrequency>() {
            public DbEntityRef<TransitFrequency> newInstance(ServerId serverId) {
                return DbEntityRef.newTransitFrequencyRef(serverId);
            }
        };
    }

    private DbEntityRef(Class<T> cls, ServerId serverId) {
        C21100e.m49373x(cls, "clazz");
        this.clazz = cls;
        C21100e.m49373x(serverId, "id");
        this.f41323id = serverId;
        this.object = null;
    }

    public static <T extends C5384a> boolean areFullyResolved(Collection<DbEntityRef<T>> collection) {
        for (DbEntityRef<T> isResolved : collection) {
            if (!isResolved.isResolved()) {
                return false;
            }
        }
        return true;
    }

    public static <T extends C5384a> List<T> getEntities(Collection<DbEntityRef<T>> collection) {
        return getEntities(collection, false);
    }

    public static DbEntityRef<TransitAgency> newAgencyRef(ServerId serverId) {
        return new DbEntityRef<>(TransitAgency.class, serverId);
    }

    public static DbEntityRef<BicycleProvider> newBicycleProviderRef(ServerId serverId) {
        return new DbEntityRef<>(BicycleProvider.class, serverId);
    }

    public static DbEntityRef<BicycleStop> newBicycleStopRef(ServerId serverId) {
        return new DbEntityRef<>(BicycleStop.class, serverId);
    }

    public static DbEntityRef<Shape> newShapeRef(ServerId serverId) {
        return new DbEntityRef<>(Shape.class, serverId);
    }

    public static DbEntityRef<ShapeSegment> newShapeSegmentRef(ServerId serverId) {
        return new DbEntityRef<>(ShapeSegment.class, serverId);
    }

    public static DbEntityRef<TransitFrequency> newTransitFrequencyRef(ServerId serverId) {
        return new DbEntityRef<>(TransitFrequency.class, serverId);
    }

    public static DbEntityRef<TransitLineGroup> newTransitLineGroupRef(ServerId serverId) {
        return new DbEntityRef<>(TransitLineGroup.class, serverId);
    }

    public static DbEntityRef<TransitLine> newTransitLineRef(ServerId serverId) {
        return new DbEntityRef<>(TransitLine.class, serverId);
    }

    public static DbEntityRef<TransitPattern> newTransitPatternRef(ServerId serverId) {
        return new DbEntityRef<>(TransitPattern.class, serverId);
    }

    public static DbEntityRef<TransitStop> newTransitStopRef(ServerId serverId) {
        return new DbEntityRef<>(TransitStop.class, serverId);
    }

    public static DbEntityRef<TransitType> newTransitTypeRef(ServerId serverId) {
        return new DbEntityRef<>(TransitType.class, serverId);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DbEntityRef)) {
            return false;
        }
        DbEntityRef dbEntityRef = (DbEntityRef) obj;
        if (!this.clazz.equals(dbEntityRef.clazz) || !this.f41323id.equals(dbEntityRef.f41323id)) {
            return false;
        }
        return true;
    }

    public synchronized T get() {
        if (!isResolved()) {
            resolve(MoovitApplication.f37317k);
        }
        return this.object;
    }

    public ServerId getServerId() {
        return this.f41323id;
    }

    public int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.clazz), C17884p.m44335F(this.f41323id));
    }

    public synchronized boolean isResolved() {
        return this.object != null;
    }

    public synchronized void resolve(Context context) {
        if (!isResolved()) {
            HashSet hashSet = C19728f.f50164e;
            C19728f fVar = (C19728f) context.getSystemService("metro_context");
            if (fVar != null) {
                C19731i j = MoovitApplication.f37317k.mo44558j();
                j.getClass();
                resolve(context, j.mo52085c(fVar.f50165a));
            }
        }
    }

    public synchronized void resolveTo(T t) {
        if (!isResolved()) {
            ServerId serverId = this.f41323id;
            C21100e.m49373x(t, "object");
            if (serverId.equals(t.getServerId())) {
                this.object = t;
                return;
            }
            throw new IllegalArgumentException("Server id mismatch");
        }
    }

    public String toString() {
        return this.f41323id.mo19751c();
    }

    public static <T extends C5384a> List<T> getEntities(Collection<DbEntityRef<T>> collection, boolean z) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (DbEntityRef<T> dbEntityRef : collection) {
            C5384a aVar = dbEntityRef.get();
            if (aVar != null) {
                arrayList.add(aVar);
            } else if (!z) {
                throw new IllegalStateException("Entity reference object may not be null!");
            }
        }
        return arrayList;
    }

    public static DbEntityRef<TransitAgency> newAgencyRef(TransitAgency transitAgency) {
        return new DbEntityRef<>(TransitAgency.class, transitAgency);
    }

    public static DbEntityRef<BicycleStop> newBicycleStopRef(BicycleStop bicycleStop) {
        return new DbEntityRef<>(BicycleStop.class, bicycleStop);
    }

    public static DbEntityRef<Shape> newShapeRef(Shape shape) {
        return new DbEntityRef<>(Shape.class, shape);
    }

    public static DbEntityRef<TransitLineGroup> newTransitLineGroupRef(TransitLineGroup transitLineGroup) {
        return new DbEntityRef<>(TransitLineGroup.class, transitLineGroup);
    }

    public static DbEntityRef<TransitLine> newTransitLineRef(TransitLine transitLine) {
        return new DbEntityRef<>(TransitLine.class, transitLine);
    }

    public static DbEntityRef<TransitPattern> newTransitPatternRef(TransitPattern transitPattern) {
        return new DbEntityRef<>(TransitPattern.class, transitPattern);
    }

    public static DbEntityRef<TransitStop> newTransitStopRef(TransitStop transitStop) {
        return new DbEntityRef<>(TransitStop.class, transitStop);
    }

    private DbEntityRef(Class<T> cls, T t) {
        C21100e.m49373x(cls, "clazz");
        this.clazz = cls;
        C21100e.m49373x(t, "object");
        this.object = t;
        this.f41323id = t.getServerId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void resolve(android.content.Context r2, s00.C19391d r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isResolved()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            com.moovit.network.model.ServerId r0 = r1.f41323id     // Catch:{ all -> 0x0016 }
            j40.a r2 = r1.resolve(r2, r3, r0)     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0014
            r1.resolveTo(r2)     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r1)
            return
        L_0x0016:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.DbEntityRef.resolve(android.content.Context, s00.d):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private T resolve(android.content.Context r4, s00.C19391d r5, com.moovit.network.model.ServerId r6) {
        /*
            r3 = this;
            java.lang.Class<T> r0 = r3.clazz
            r0.getClass()
            java.lang.Class<T> r0 = r3.clazz
            java.lang.Class<com.moovit.transit.TransitType> r1 = com.moovit.transit.TransitType.class
            if (r0 != r1) goto L_0x0026
            u00.r r5 = r5.mo51807i()
            monitor-enter(r5)
            r5.mo52154h(r4)     // Catch:{ all -> 0x0023 }
            com.moovit.util.HasServerIdMap<com.moovit.transit.TransitType> r4 = r5.f50475c     // Catch:{ all -> 0x0023 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0023 }
            com.moovit.transit.TransitType r4 = (com.moovit.transit.TransitType) r4     // Catch:{ all -> 0x0023 }
            monitor-exit(r5)
            java.lang.Object r4 = r0.cast(r4)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x0023:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x0026:
            java.lang.Class<com.moovit.transit.TransitAgency> r1 = com.moovit.transit.TransitAgency.class
            if (r0 != r1) goto L_0x0045
            u00.m r5 = r5.mo51801c()
            monitor-enter(r5)
            r5.mo52145h(r4)     // Catch:{ all -> 0x0042 }
            com.moovit.util.HasServerIdMap<com.moovit.transit.TransitAgency> r4 = r5.f50436b     // Catch:{ all -> 0x0042 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0042 }
            com.moovit.transit.TransitAgency r4 = (com.moovit.transit.TransitAgency) r4     // Catch:{ all -> 0x0042 }
            monitor-exit(r5)
            java.lang.Object r4 = r0.cast(r4)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x0042:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x0045:
            java.lang.Class<com.moovit.transit.TransitStop> r1 = com.moovit.transit.TransitStop.class
            if (r0 != r1) goto L_0x0058
            u00.q r5 = r5.mo51806h()
            com.moovit.transit.TransitStop r4 = r5.mo52152h(r4, r6)
            java.lang.Object r4 = r0.cast(r4)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x0058:
            java.lang.Class<com.moovit.transit.TransitLine> r1 = com.moovit.transit.TransitLine.class
            r2 = 0
            if (r0 != r1) goto L_0x0093
            u00.o r5 = r5.mo51803e()
            r5.getClass()
            java.util.Set r0 = java.util.Collections.singleton(r6)
            java.util.Set r0 = r5.mo52150i(r4, r0)
            java.util.Set r4 = r5.mo52149h(r4, r0)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0078
            r4 = r2
            goto L_0x0082
        L_0x0078:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            com.moovit.transit.TransitLineGroup r4 = (com.moovit.transit.TransitLineGroup) r4
        L_0x0082:
            if (r4 != 0) goto L_0x0085
            goto L_0x0092
        L_0x0085:
            java.lang.Class<T> r5 = r3.clazz
            com.moovit.transit.TransitLine r4 = r4.mo24377c(r6)
            java.lang.Object r4 = r5.cast(r4)
            r2 = r4
            j40.a r2 = (j40.C5384a) r2
        L_0x0092:
            return r2
        L_0x0093:
            java.lang.Class<com.moovit.transit.TransitLineGroup> r1 = com.moovit.transit.TransitLineGroup.class
            if (r0 != r1) goto L_0x00bf
            u00.o r5 = r5.mo51803e()
            r5.getClass()
            java.util.Set r6 = java.util.Collections.singleton(r6)
            java.util.Set r4 = r5.mo52149h(r4, r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00ad
            goto L_0x00b8
        L_0x00ad:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            r2 = r4
            com.moovit.transit.TransitLineGroup r2 = (com.moovit.transit.TransitLineGroup) r2
        L_0x00b8:
            java.lang.Object r4 = r0.cast(r2)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x00bf:
            java.lang.Class<com.moovit.transit.TransitPattern> r1 = com.moovit.transit.TransitPattern.class
            if (r0 != r1) goto L_0x00f4
            u00.p r5 = r5.mo51804f()
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.TransitPattern> r1 = r5.f50456b
            java.lang.Object r1 = r1.get(r6)
            com.moovit.transit.TransitPattern r1 = (com.moovit.transit.TransitPattern) r1
            if (r1 == 0) goto L_0x00d2
            goto L_0x00ed
        L_0x00d2:
            java.util.Set r6 = java.util.Collections.singleton(r6)
            java.util.Set r4 = r5.mo52151h(r4, r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00e1
            goto L_0x00ec
        L_0x00e1:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            r2 = r4
            com.moovit.transit.TransitPattern r2 = (com.moovit.transit.TransitPattern) r2
        L_0x00ec:
            r1 = r2
        L_0x00ed:
            java.lang.Object r4 = r0.cast(r1)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x00f4:
            java.lang.Class<com.moovit.transit.BicycleProvider> r1 = com.moovit.transit.BicycleProvider.class
            if (r0 != r1) goto L_0x012b
            java.lang.Class<u00.b> r1 = u00.C19808b.class
            s00.b r5 = r5.mo51794a(r1)
            u00.b r5 = (u00.C19808b) r5
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x0128 }
            monitor-enter(r5)     // Catch:{ all -> 0x0125 }
            java.util.ArrayList r1 = r5.f50341b     // Catch:{ all -> 0x0122 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0122 }
            r1 = r1 ^ 1
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            if (r1 != 0) goto L_0x0111
            r5.mo52112h(r4)     // Catch:{ all -> 0x0125 }
        L_0x0111:
            monitor-exit(r5)     // Catch:{ all -> 0x0128 }
            com.moovit.util.HasServerIdMap<com.moovit.transit.BicycleProvider> r4 = r5.f50342c     // Catch:{ all -> 0x0128 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0128 }
            com.moovit.transit.BicycleProvider r4 = (com.moovit.transit.BicycleProvider) r4     // Catch:{ all -> 0x0128 }
            monitor-exit(r5)
            java.lang.Object r4 = r0.cast(r4)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x0122:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            throw r4     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0128 }
            throw r4     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x012b:
            java.lang.Class<com.moovit.transit.BicycleStop> r1 = com.moovit.transit.BicycleStop.class
            if (r0 != r1) goto L_0x0164
            java.lang.Class<u00.c> r1 = u00.C19810c.class
            s00.b r5 = r5.mo51794a(r1)
            u00.c r5 = (u00.C19810c) r5
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.BicycleStop> r1 = r5.f50346b
            java.lang.Object r1 = r1.get(r6)
            com.moovit.transit.BicycleStop r1 = (com.moovit.transit.BicycleStop) r1
            if (r1 == 0) goto L_0x0142
            goto L_0x015d
        L_0x0142:
            java.util.Set r6 = java.util.Collections.singleton(r6)
            java.util.Set r4 = r5.mo52114h(r4, r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0151
            goto L_0x015c
        L_0x0151:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            r2 = r4
            com.moovit.transit.BicycleStop r2 = (com.moovit.transit.BicycleStop) r2
        L_0x015c:
            r1 = r2
        L_0x015d:
            java.lang.Object r4 = r0.cast(r1)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x0164:
            java.lang.Class<com.moovit.transit.Shape> r1 = com.moovit.transit.Shape.class
            if (r0 != r1) goto L_0x019d
            java.lang.Class<u00.l> r1 = u00.C19842l.class
            s00.b r5 = r5.mo51794a(r1)
            u00.l r5 = (u00.C19842l) r5
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.Shape> r1 = r5.f50431b
            java.lang.Object r1 = r1.get(r6)
            com.moovit.transit.Shape r1 = (com.moovit.transit.Shape) r1
            if (r1 == 0) goto L_0x017b
            goto L_0x0196
        L_0x017b:
            java.util.Set r6 = java.util.Collections.singleton(r6)
            java.util.Set r4 = r5.mo52143h(r4, r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x018a
            goto L_0x0195
        L_0x018a:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            r2 = r4
            com.moovit.transit.Shape r2 = (com.moovit.transit.Shape) r2
        L_0x0195:
            r1 = r2
        L_0x0196:
            java.lang.Object r4 = r0.cast(r1)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x019d:
            java.lang.Class<com.moovit.transit.ShapeSegment> r1 = com.moovit.transit.ShapeSegment.class
            if (r0 != r1) goto L_0x01d6
            java.lang.Class<u00.k> r1 = u00.C19840k.class
            s00.b r5 = r5.mo51794a(r1)
            u00.k r5 = (u00.C19840k) r5
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.ShapeSegment> r1 = r5.f50426b
            java.lang.Object r1 = r1.get(r6)
            com.moovit.transit.ShapeSegment r1 = (com.moovit.transit.ShapeSegment) r1
            if (r1 == 0) goto L_0x01b4
            goto L_0x01cf
        L_0x01b4:
            java.util.Set r6 = java.util.Collections.singleton(r6)
            java.util.Set r4 = r5.mo52141h(r4, r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x01c3
            goto L_0x01ce
        L_0x01c3:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            r2 = r4
            com.moovit.transit.ShapeSegment r2 = (com.moovit.transit.ShapeSegment) r2
        L_0x01ce:
            r1 = r2
        L_0x01cf:
            java.lang.Object r4 = r0.cast(r1)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x01d6:
            java.lang.Class<com.moovit.transit.TransitFrequency> r1 = com.moovit.transit.TransitFrequency.class
            if (r0 != r1) goto L_0x0215
            java.lang.Class<u00.n> r1 = u00.C19846n.class
            s00.b r5 = r5.mo51794a(r1)
            u00.n r5 = (u00.C19846n) r5
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.TransitFrequency> r1 = r5.f50440b
            java.lang.Object r1 = r1.get(r6)
            com.moovit.transit.TransitFrequency r1 = (com.moovit.transit.TransitFrequency) r1
            if (r1 == 0) goto L_0x01f0
            java.util.Objects.toString(r6)
            goto L_0x020e
        L_0x01f0:
            java.util.Objects.toString(r6)
            java.util.Set r6 = java.util.Collections.singleton(r6)
            java.util.Set r4 = r5.mo52147h(r4, r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0202
            goto L_0x020d
        L_0x0202:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            r2 = r4
            com.moovit.transit.TransitFrequency r2 = (com.moovit.transit.TransitFrequency) r2
        L_0x020d:
            r1 = r2
        L_0x020e:
            java.lang.Object r4 = r0.cast(r1)
            j40.a r4 = (j40.C5384a) r4
            return r4
        L_0x0215:
            com.moovit.commons.utils.ApplicationBugException r4 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r5 = "Unknown class type "
            java.lang.StringBuilder r5 = p379.C13555b.m33972k(r5)
            java.lang.Class<T> r6 = r3.clazz
            java.lang.String r6 = r6.getSimpleName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>((java.lang.String) r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.DbEntityRef.resolve(android.content.Context, s00.d, com.moovit.network.model.ServerId):j40.a");
    }
}
