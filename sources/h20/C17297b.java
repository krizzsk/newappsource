package h20;

import android.util.SparseArray;
import android.util.SparseIntArray;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13752e;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.moovit.transit.Shape;
import com.moovit.transit.ShapeSegment;
import com.moovit.transit.TransitFrequency;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternShape;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.C7923a;
import com.tranzmate.moovit.protocol.gtfs.MVLineGroupTripsResponse;
import com.tranzmate.moovit.protocol.gtfs.MVLineTrips;
import com.tranzmate.moovit.protocol.gtfs.MVSubGroupMergedStops;
import com.tranzmate.moovit.protocol.gtfs.MVTripGroup;
import com.tranzmate.moovit.protocol.gtfs.MVTripIntervals;
import g30.C4776h;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import p054d0.C4303q;
import p241s0.C6302b;
import p435de.C16596f;
import p824tp.C19728f;
import p977zz.C20944i0;
import q00.C19047a;

/* renamed from: h20.b */
public final class C17297b extends C13780t<C17296a, C17297b, MVLineGroupTripsResponse> {

    /* renamed from: m */
    public TransitLineGroup f44685m;

    /* renamed from: n */
    public Map<ServerId, List<TransitPatternTrips>> f44686n;

    /* renamed from: o */
    public Map<CharSequence, List<TransitStop>> f44687o;

    public C17297b() {
        super(MVLineGroupTripsResponse.class);
    }

    /* renamed from: g */
    public final C5265a mo40706g(C13746a aVar, HttpURLConnection httpURLConnection, C5269e eVar) {
        C17296a aVar2 = (C17296a) aVar;
        String path = httpURLConnection.getURL().getPath();
        C13752e eVar2 = aVar2.f33829q;
        C4776h hVar = aVar2.f44680v.f50165a;
        C21100e.m49373x(eVar2, "requestContext");
        C21100e.m49373x(path, "source");
        C21100e.m49373x(hVar, "metroInfo");
        return new C5267c(eVar2, path, hVar, eVar);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        List<Integer> list;
        C17296a aVar2 = (C17296a) aVar;
        MVLineGroupTripsResponse mVLineGroupTripsResponse = (MVLineGroupTripsResponse) tBase;
        C5269e.C5270a aVar3 = new C5269e.C5270a();
        aVar3.f17416c.add(Integer.valueOf(aVar2.f44682x.f15142b));
        aVar3.f17419f = true;
        for (MVLineTrips next : mVLineGroupTripsResponse.linesTrips) {
            aVar3.mo21075b(next.lineId);
            if (next.mo27408h()) {
                for (MVTripIntervals mVTripIntervals : next.tripIntervals) {
                    aVar3.f17418e.add(Integer.valueOf(mVTripIntervals.tripPatternId));
                }
            }
            if (next.mo27407g()) {
                for (MVTripGroup next2 : next.tripGroups) {
                    if (aVar2.f44684z) {
                        aVar3.f17420g.add(Integer.valueOf(next2.tripShapeId));
                    }
                    if (aVar2.f44678A && (list = next2.shapeSegmentIds) != null) {
                        aVar3.f17421h.addAll(list);
                    }
                    if (next2.mo27575h()) {
                        aVar3.f17422i.add(Integer.valueOf(next2.frequencyId));
                    }
                }
            }
        }
        if (mVLineGroupTripsResponse.mo27362g()) {
            for (MVSubGroupMergedStops mVSubGroupMergedStops : mVLineGroupTripsResponse.subGroupsStops) {
                List<Integer> list2 = mVSubGroupMergedStops.stopIdsSequence;
                if (list2 != null) {
                    aVar3.f17414a.addAll(list2);
                }
            }
        }
        return aVar3.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        Iterator<MVLineTrips> it;
        MVLineGroupTripsResponse mVLineGroupTripsResponse;
        C17297b bVar;
        C19047a aVar2;
        C19728f fVar;
        CollectionHashMap.ArrayListHashMap arrayListHashMap;
        LinkedHashSet linkedHashSet;
        ServerId serverId;
        SparseArray sparseArray;
        CollectionHashMap.ArrayListHashMap arrayListHashMap2;
        CollectionHashMap.ArrayListHashMap arrayListHashMap3;
        C6302b bVar2;
        C5268d dVar2;
        C6302b bVar3;
        C6302b bVar4;
        C17297b bVar5 = this;
        C5268d dVar3 = dVar;
        C17296a aVar3 = (C17296a) aVar;
        MVLineGroupTripsResponse mVLineGroupTripsResponse2 = (MVLineGroupTripsResponse) tBase;
        C19728f fVar2 = aVar3.f44680v;
        C19047a aVar4 = aVar3.f44681w;
        TransitLineGroup transitLineGroup = (TransitLineGroup) dVar3.f17405b.get(aVar3.f44682x);
        bVar5.f44685m = transitLineGroup;
        bVar5.f44686n = new C6302b(transitLineGroup.f23700h.size());
        Iterator<MVLineTrips> it2 = mVLineGroupTripsResponse2.linesTrips.iterator();
        C17297b bVar6 = bVar5;
        while (it2.hasNext()) {
            MVLineTrips next = it2.next();
            if (next == null) {
                bVar = bVar5;
                it = it2;
                mVLineGroupTripsResponse = mVLineGroupTripsResponse2;
                aVar2 = aVar4;
                fVar = fVar2;
            } else if (C13717b.m34258e(next.tripGroups)) {
                continue;
            } else {
                ServerId serverId2 = new ServerId(next.lineId);
                List<MVTripIntervals> list = next.tripIntervals;
                if (!C13717b.m34258e(list)) {
                    int size = list.size();
                    SparseIntArray sparseIntArray = new SparseIntArray(size);
                    SparseArray sparseArray2 = new SparseArray(size);
                    for (MVTripIntervals next2 : list) {
                        int i = next2.tripIntervalsId;
                        sparseArray2.put(i, next2.intervals);
                        sparseIntArray.put(i, next2.tripPatternId);
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    C6302b bVar7 = new C6302b();
                    CollectionHashMap.ArrayListHashMap arrayListHashMap4 = new CollectionHashMap.ArrayListHashMap();
                    CollectionHashMap.ArrayListHashMap arrayListHashMap5 = new CollectionHashMap.ArrayListHashMap();
                    C6302b bVar8 = new C6302b();
                    CollectionHashMap.HashSetHashMap hashSetHashMap = new CollectionHashMap.HashSetHashMap();
                    it = it2;
                    C6302b bVar9 = new C6302b();
                    ServerId serverId3 = serverId2;
                    CollectionHashMap.HashSetHashMap hashSetHashMap2 = new CollectionHashMap.HashSetHashMap();
                    mVLineGroupTripsResponse = mVLineGroupTripsResponse2;
                    C6302b bVar10 = new C6302b();
                    ServerIdMap<TransitFrequency> serverIdMap = dVar3.f17411h;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator<MVTripGroup> it3 = next.tripGroups.iterator();
                    ServerIdMap<TransitFrequency> serverIdMap2 = serverIdMap;
                    C5268d dVar4 = dVar;
                    while (it3.hasNext()) {
                        Iterator<MVTripGroup> it4 = it3;
                        MVTripGroup next3 = it3.next();
                        C19047a aVar5 = aVar4;
                        int i2 = next3.localMidnightDaysSinceEpoch;
                        CollectionHashMap.ArrayListHashMap arrayListHashMap6 = arrayListHashMap5;
                        Calendar k = C7923a.m18011k(fVar2, i2);
                        C19728f fVar3 = fVar2;
                        int i3 = next3.tripIntervalsId;
                        Calendar calendar = k;
                        int i4 = next3.tripShapeId;
                        C6302b bVar11 = bVar10;
                        List<Integer> list2 = next3.shapeSegmentIds;
                        C6302b bVar12 = bVar9;
                        int i5 = sparseIntArray.get(i3);
                        SparseIntArray sparseIntArray2 = sparseIntArray;
                        C6302b bVar13 = bVar8;
                        TransitPattern transitPattern = (TransitPattern) dVar4.f17407d.get(new ServerId(i5));
                        if (transitPattern != null) {
                            String str = "Pattern id: ";
                            if (DbEntityRef.areFullyResolved(transitPattern.f23709c)) {
                                linkedHashSet2.add(transitPattern);
                                DbEntityRef<Shape> dbEntityRef = (DbEntityRef) sparseArray3.get(i4);
                                if (dbEntityRef == null) {
                                    ServerId serverId4 = new ServerId(i4);
                                    linkedHashSet = linkedHashSet2;
                                    DbEntityRef<Shape> newShapeRef = DbEntityRef.newShapeRef(serverId4);
                                    arrayListHashMap = arrayListHashMap4;
                                    Shape shape = (Shape) dVar4.f17409f.get(serverId4);
                                    if (shape != null) {
                                        newShapeRef.resolveTo(shape);
                                    }
                                    sparseArray3.put(i4, newShapeRef);
                                    dbEntityRef = newShapeRef;
                                } else {
                                    linkedHashSet = linkedHashSet2;
                                    arrayListHashMap = arrayListHashMap4;
                                }
                                hashSetHashMap.mo47001a(Integer.valueOf(i5), dbEntityRef);
                                ArrayList arrayList = new ArrayList(list2.size());
                                Iterator<Integer> it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    CollectionHashMap.HashSetHashMap hashSetHashMap3 = hashSetHashMap;
                                    ServerId serverId5 = new ServerId(it5.next().intValue());
                                    DbEntityRef<ShapeSegment> newShapeSegmentRef = DbEntityRef.newShapeSegmentRef(serverId5);
                                    Iterator<Integer> it6 = it5;
                                    ShapeSegment shapeSegment = (ShapeSegment) dVar4.f17410g.get(serverId5);
                                    if (shapeSegment != null) {
                                        newShapeSegmentRef.resolveTo(shapeSegment);
                                    }
                                    arrayList.add(newShapeSegmentRef);
                                    it5 = it6;
                                    hashSetHashMap = hashSetHashMap3;
                                }
                                CollectionHashMap.HashSetHashMap hashSetHashMap4 = hashSetHashMap;
                                TransitPatternShape transitPatternShape = new TransitPatternShape(arrayList);
                                hashSetHashMap2.mo47001a(Integer.valueOf(i5), transitPatternShape);
                                if (next3.mo27575h()) {
                                    serverId = new ServerId(next3.frequencyId);
                                } else {
                                    serverId = null;
                                }
                                List<Long> list3 = next3.departureTripIds;
                                List<Integer> list4 = next3.departures;
                                List list5 = (List) sparseArray2.get(i3);
                                if (list5 != null) {
                                    if (list4.isEmpty()) {
                                        dVar2 = dVar4;
                                        sparseArray = sparseArray2;
                                        arrayListHashMap2 = arrayListHashMap6;
                                        bVar4 = bVar11;
                                        bVar3 = bVar12;
                                        bVar2 = bVar13;
                                        arrayListHashMap3 = arrayListHashMap;
                                    } else if (list3.size() != list4.size()) {
                                        throw new BadResponseException("trip ids length does not match the departures length");
                                    } else if (list5.size() != transitPattern.mo24389f() - 1) {
                                        throw new BadResponseException("Intervals length does not match the stops pattern length - 1");
                                    } else if (list2.size() == transitPattern.mo24389f() - 1) {
                                        int size2 = list3.size();
                                        int i6 = 0;
                                        while (i6 < size2) {
                                            int i7 = size2;
                                            List<Long> list6 = list3;
                                            long longValue = list3.get(i6).longValue();
                                            int intValue = list4.get(i6).intValue();
                                            List<Integer> list7 = list4;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(i2);
                                            SparseArray sparseArray4 = sparseArray2;
                                            sb.append("#");
                                            sb.append(i5);
                                            sb.append("#");
                                            sb.append(longValue);
                                            sb.append("#");
                                            sb.append(intValue);
                                            String sb2 = sb.toString();
                                            bVar7.put(sb2, Long.valueOf(longValue));
                                            int i8 = i2;
                                            CollectionHashMap.ArrayListHashMap arrayListHashMap7 = arrayListHashMap;
                                            arrayListHashMap7.mo47001a(Integer.valueOf(i5), sb2);
                                            Long valueOf = Long.valueOf(longValue);
                                            int i9 = i7;
                                            Integer valueOf2 = Integer.valueOf(i4);
                                            int i11 = i4;
                                            C6302b bVar14 = bVar13;
                                            bVar14.put(valueOf, valueOf2);
                                            C6302b bVar15 = bVar12;
                                            bVar15.put(Long.valueOf(longValue), transitPatternShape);
                                            C6302b bVar16 = bVar11;
                                            bVar16.put(sb2, serverId);
                                            Calendar calendar2 = calendar;
                                            TransitPatternShape transitPatternShape2 = transitPatternShape;
                                            ServerId serverId6 = serverId;
                                            C20944i0 i0Var = new C20944i0(Long.valueOf(C7923a.m18012l(intValue, calendar2)), 0);
                                            CollectionHashMap.ArrayListHashMap arrayListHashMap8 = arrayListHashMap6;
                                            arrayListHashMap8.mo47001a(sb2, i0Var);
                                            Iterator it7 = list5.iterator();
                                            int i12 = 1;
                                            while (it7.hasNext()) {
                                                arrayListHashMap8.mo47001a(sb2, new C20944i0(Long.valueOf(C7923a.m18012l(((Integer) it7.next()).intValue() + intValue, calendar2)), Integer.valueOf(i12)));
                                                i12++;
                                                it7 = it7;
                                                intValue = intValue;
                                            }
                                            i6++;
                                            bVar12 = bVar15;
                                            bVar13 = bVar14;
                                            arrayListHashMap6 = arrayListHashMap8;
                                            serverId = serverId6;
                                            transitPatternShape = transitPatternShape2;
                                            list3 = list6;
                                            list4 = list7;
                                            i4 = i11;
                                            bVar11 = bVar16;
                                            calendar = calendar2;
                                            size2 = i9;
                                            sparseArray2 = sparseArray4;
                                            arrayListHashMap = arrayListHashMap7;
                                            i2 = i8;
                                        }
                                        sparseArray = sparseArray2;
                                        arrayListHashMap2 = arrayListHashMap6;
                                        bVar4 = bVar11;
                                        bVar3 = bVar12;
                                        bVar2 = bVar13;
                                        arrayListHashMap3 = arrayListHashMap;
                                        dVar2 = dVar;
                                    } else {
                                        throw new BadResponseException("Shape segments length does not match the stops pattern length - 1");
                                    }
                                    bVar10 = bVar4;
                                    dVar4 = dVar2;
                                    bVar8 = bVar2;
                                    arrayListHashMap4 = arrayListHashMap3;
                                    arrayListHashMap5 = arrayListHashMap2;
                                    aVar4 = aVar5;
                                    it3 = it4;
                                    fVar2 = fVar3;
                                    sparseIntArray = sparseIntArray2;
                                    hashSetHashMap = hashSetHashMap4;
                                    sparseArray2 = sparseArray;
                                    bVar9 = bVar3;
                                    linkedHashSet2 = linkedHashSet;
                                } else {
                                    throw new BadResponseException(C25541a.m63878h("Missing intervals id ", i3, " for trip group"));
                                }
                            } else {
                                C16596f a = C16596f.m42113a();
                                a.mo49363b(str + i5);
                                throw new BadResponseException("Missing pattern stop sync items");
                            }
                        } else {
                            C16596f a2 = C16596f.m42113a();
                            a2.mo49363b("Pattern id: " + i5);
                            throw new BadResponseException("Missing pattern sync item");
                        }
                    }
                    LinkedHashSet linkedHashSet3 = linkedHashSet2;
                    C6302b bVar17 = bVar9;
                    C6302b bVar18 = bVar10;
                    C19047a aVar6 = aVar4;
                    C19728f fVar4 = fVar2;
                    CollectionHashMap.ArrayListHashMap arrayListHashMap9 = arrayListHashMap5;
                    C6302b bVar19 = bVar8;
                    C6302b bVar20 = bVar19;
                    aVar2 = aVar6;
                    C6302b bVar21 = bVar17;
                    fVar = fVar4;
                    ArrayList d = C7841a.m17866d(fVar4, aVar6, linkedHashSet3, bVar7, arrayListHashMap4, arrayListHashMap9, hashSetHashMap, bVar19, sparseArray3, hashSetHashMap2, bVar21, bVar18, serverIdMap2);
                    bVar = this;
                    bVar.f44686n.put(serverId3, d);
                    bVar6 = bVar;
                } else {
                    C17297b bVar22 = bVar5;
                    throw new BadResponseException("Trip intervals may not be null or empty!");
                }
            }
            it2 = it;
            fVar2 = fVar;
            aVar4 = aVar2;
            bVar5 = bVar;
            mVLineGroupTripsResponse2 = mVLineGroupTripsResponse;
            dVar3 = dVar;
        }
        C17297b bVar23 = bVar5;
        MVLineGroupTripsResponse mVLineGroupTripsResponse3 = mVLineGroupTripsResponse2;
        bVar6.f44687o = new C6302b();
        if (mVLineGroupTripsResponse3.mo27362g()) {
            for (MVSubGroupMergedStops next4 : mVLineGroupTripsResponse3.subGroupsStops) {
                bVar6.f44687o.put(next4.subGroup.name, dVar.f17404a.mo24576b(C13720d.m34273c(next4.stopIdsSequence, (C13722f) null, new C4303q(13))));
            }
        }
    }

    public C17297b(TransitLineGroup transitLineGroup, C6302b bVar, Map map) {
        super(MVLineGroupTripsResponse.class);
        C21100e.m49373x(transitLineGroup, "lineGroup");
        this.f44685m = transitLineGroup;
        this.f44686n = bVar;
        C21100e.m49373x(map, "mergedStopsBySubgroup");
        this.f44687o = map;
    }
}
