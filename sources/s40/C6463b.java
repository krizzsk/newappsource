package s40;

import android.util.SparseArray;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.moovit.transit.Shape;
import com.moovit.transit.TransitFrequency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternShape;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.C7923a;
import i30.C5268d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p241s0.C6302b;
import p241s0.C6307g;
import p977zz.C20944i0;
import q40.C6177b;
import r40.C6252c;

/* renamed from: s40.b */
public final class C6463b extends C6466e {
    /* renamed from: a */
    public final void mo22585a(C6465d dVar) throws Exception {
        TransitLine transitLine;
        ArrayList arrayList;
        C6302b bVar;
        C6465d dVar2 = dVar;
        TransitLine b = dVar2.f20198o.mo21063b(dVar2.f20191h);
        if (dVar2.f20197n != null) {
            SparseArray sparseArray = new SparseArray(dVar2.f20197n.f19718e.size());
            C6302b bVar2 = new C6302b();
            CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
            CollectionHashMap.ArrayListHashMap arrayListHashMap2 = new CollectionHashMap.ArrayListHashMap();
            C6302b bVar3 = new C6302b();
            SparseArray sparseArray2 = new SparseArray();
            C6302b bVar4 = new C6302b();
            C6302b bVar5 = new C6302b();
            ServerIdMap<TransitFrequency> serverIdMap = dVar2.f20198o.f17411h;
            CollectionHashMap.HashSetHashMap hashSetHashMap = new CollectionHashMap.HashSetHashMap();
            CollectionHashMap.HashSetHashMap hashSetHashMap2 = new CollectionHashMap.HashSetHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = ((C6307g.C6309b) dVar2.f20197n.f19722i.entrySet()).iterator();
            while (true) {
                C6307g.C6311d dVar3 = (C6307g.C6311d) it;
                if (!dVar3.hasNext()) {
                    transitLine = b;
                    CollectionHashMap.ArrayListHashMap arrayListHashMap3 = arrayListHashMap2;
                    C6302b bVar6 = bVar3;
                    SparseArray sparseArray3 = sparseArray2;
                    C6302b bVar7 = bVar5;
                    C6302b bVar8 = bVar4;
                    arrayList = C7841a.m17866d(dVar2.f20187d, dVar2.f20188e, linkedHashSet, bVar2, arrayListHashMap, arrayListHashMap2, hashSetHashMap, bVar3, sparseArray2, hashSetHashMap2, bVar4, bVar7, serverIdMap);
                    break;
                }
                dVar3.next();
                Map.Entry entry = dVar3;
                ServerIdMap<TransitFrequency> serverIdMap2 = serverIdMap;
                Iterator it2 = it;
                long longValue = ((Long) entry.getKey()).longValue();
                TransitLine transitLine2 = b;
                CollectionHashMap.ArrayListHashMap arrayListHashMap4 = arrayListHashMap2;
                C6302b bVar9 = bVar5;
                Integer num = (Integer) dVar2.f20197n.f19721h.getOrDefault(Long.valueOf(longValue), null);
                if (num != null) {
                    int[] iArr = dVar2.f20197n.f19719f.get(num.intValue());
                    if (iArr != null) {
                        C6302b bVar10 = bVar4;
                        C6302b bVar11 = bVar3;
                        CollectionHashMap.ArrayListHashMap arrayListHashMap5 = arrayListHashMap;
                        int i = dVar2.f20197n.f19718e.get(num.intValue(), -1);
                        TransitPattern transitPattern = (TransitPattern) sparseArray.get(i);
                        if (transitPattern == null) {
                            C5268d dVar4 = dVar2.f20198o;
                            transitPattern = (TransitPattern) dVar4.f17407d.get(new ServerId(i));
                            if (transitPattern != null) {
                                sparseArray.put(i, transitPattern);
                                linkedHashSet.add(transitPattern);
                            } else {
                                throw new BadResponseException(C25541a.m63878h("Missing pattern id ", i, " for trip group"));
                            }
                        }
                        SparseArray sparseArray4 = sparseArray;
                        int i2 = dVar2.f20197n.f19723j.get(num.intValue(), -1);
                        DbEntityRef<Shape> dbEntityRef = (DbEntityRef) sparseArray2.get(i2);
                        if (dbEntityRef == null) {
                            dbEntityRef = DbEntityRef.newShapeRef(new ServerId(i2));
                            sparseArray2.append(i2, dbEntityRef);
                        }
                        hashSetHashMap.mo47001a(Integer.valueOf(i), dbEntityRef);
                        int[] iArr2 = dVar2.f20197n.f19724k.get(num.intValue());
                        ArrayList arrayList2 = new ArrayList(iArr2.length);
                        int length = iArr2.length;
                        SparseArray sparseArray5 = sparseArray2;
                        int i3 = 0;
                        while (i3 < length) {
                            arrayList2.add(DbEntityRef.newShapeSegmentRef(new ServerId(iArr2[i3])));
                            i3++;
                            length = length;
                            iArr2 = iArr2;
                        }
                        TransitPatternShape transitPatternShape = new TransitPatternShape(arrayList2);
                        hashSetHashMap2.mo47001a(Integer.valueOf(i), transitPatternShape);
                        if (iArr.length != 0) {
                            if (iArr.length == transitPattern.mo24389f() - 1) {
                                int[] iArr3 = (int[]) entry.getValue();
                                int length2 = iArr3.length;
                                int i4 = 0;
                                while (i4 < length2) {
                                    int i5 = iArr3[i4];
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i);
                                    int[] iArr4 = iArr3;
                                    sb.append("#");
                                    sb.append(longValue);
                                    sb.append("#");
                                    sb.append(i5);
                                    String sb2 = sb.toString();
                                    bVar2.put(sb2, Long.valueOf(longValue));
                                    Integer valueOf = Integer.valueOf(i);
                                    int i6 = i;
                                    CollectionHashMap.ArrayListHashMap arrayListHashMap6 = arrayListHashMap5;
                                    arrayListHashMap6.mo47001a(valueOf, sb2);
                                    Long valueOf2 = Long.valueOf(longValue);
                                    int i7 = length2;
                                    Integer valueOf3 = Integer.valueOf(i2);
                                    int i8 = i2;
                                    C6302b bVar12 = bVar11;
                                    bVar12.put(valueOf2, valueOf3);
                                    C6302b bVar13 = bVar10;
                                    bVar13.put(Long.valueOf(longValue), transitPatternShape);
                                    TransitPatternShape transitPatternShape2 = transitPatternShape;
                                    int i9 = dVar2.f20197n.f19725l.get(i5, -1);
                                    if (i9 != -1) {
                                        ServerId serverId = new ServerId(i9);
                                        bVar = bVar9;
                                        bVar.put(sb2, serverId);
                                    } else {
                                        bVar = bVar9;
                                    }
                                    long j = longValue;
                                    C20944i0 i0Var = new C20944i0(Long.valueOf(C7923a.m18012l(i5, dVar2.f20190g)), 0);
                                    CollectionHashMap.ArrayListHashMap arrayListHashMap7 = arrayListHashMap4;
                                    arrayListHashMap7.mo47001a(sb2, i0Var);
                                    int length3 = iArr.length;
                                    int i11 = 0;
                                    int i12 = 0;
                                    int i13 = 1;
                                    while (i11 < length3) {
                                        i12 += iArr[i11];
                                        int i14 = length3;
                                        int[] iArr5 = iArr;
                                        Long valueOf4 = Long.valueOf(C7923a.m18012l(i5 + i12, dVar2.f20190g));
                                        int i15 = i13 + 1;
                                        Integer valueOf5 = Integer.valueOf(i13);
                                        arrayListHashMap7.mo47001a(sb2, new C20944i0(valueOf4, valueOf5));
                                        i11++;
                                        bVar = bVar;
                                        length3 = i14;
                                        iArr = iArr5;
                                        i13 = i15;
                                    }
                                    int[] iArr6 = iArr;
                                    bVar9 = bVar;
                                    i4++;
                                    arrayListHashMap4 = arrayListHashMap7;
                                    bVar11 = bVar12;
                                    transitPatternShape = transitPatternShape2;
                                    length2 = i7;
                                    iArr3 = iArr4;
                                    i2 = i8;
                                    longValue = j;
                                    arrayListHashMap5 = arrayListHashMap6;
                                    bVar10 = bVar13;
                                    i = i6;
                                }
                            } else {
                                throw new BadResponseException("Intervals length does not match the stops pattern length - 1");
                            }
                        }
                        arrayListHashMap = arrayListHashMap5;
                        arrayListHashMap2 = arrayListHashMap4;
                        bVar3 = bVar11;
                        bVar4 = bVar10;
                        serverIdMap = serverIdMap2;
                        it = it2;
                        b = transitLine2;
                        bVar5 = bVar9;
                        sparseArray = sparseArray4;
                        sparseArray2 = sparseArray5;
                    } else {
                        throw new BadResponseException("Missing intervals id " + num + " for trip group");
                    }
                } else {
                    throw new BadResponseException("Intervals id " + num + " may not be null");
                }
            }
        } else {
            arrayList = null;
            transitLine = b;
        }
        C6252c cVar = new C6252c(transitLine, arrayList);
        dVar2.f20199p = cVar;
        C6177b bVar14 = dVar2.f20185b;
        int i16 = dVar2.f20189f;
        bVar14.f19564g.put(new C20944i0(Integer.valueOf(i16), dVar2.f20191h), cVar);
    }
}
