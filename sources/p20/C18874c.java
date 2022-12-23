package p20;

import android.content.Context;
import android.util.SparseArray;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.PointD;
import com.moovit.image.model.ImageRef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p824tp.C19738p;
import p977zz.C20964s0;

/* renamed from: p20.c */
public final class C18874c {

    /* renamed from: p20.c$a */
    public interface C18875a {
    }

    /* renamed from: p20.c$b */
    public interface C18876b {
        /* renamed from: i */
        PointD mo51343i(int i, LatLonE6 latLonE6);
    }

    /* renamed from: a */
    public static SparseArray<? extends Collection<? extends C18880g>> m45902a(Context context, Collection<? extends C18880g> collection, C18876b bVar, int i, int i2, ImageRef imageRef) {
        String str;
        Collection<? extends C18880g> collection2;
        Iterator<? extends C18880g> it;
        HashMap hashMap;
        HashMap hashMap2;
        int i3 = i2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C19738p.cluster_size);
        SparseArray<? extends Collection<? extends C18880g>> sparseArray = new SparseArray<>();
        Collection<? extends C18880g> collection3 = collection;
        sparseArray.put(i3, collection3);
        int i4 = i3 - 1;
        int i5 = i;
        ArrayList arrayList = collection3;
        while (i4 >= i5) {
            HashMap hashMap3 = new HashMap();
            for (C18880g gVar : arrayList) {
                hashMap3.put(gVar, bVar.mo51343i(i4, gVar.f48054b));
            }
            C18876b bVar2 = bVar;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            Iterator<? extends C18880g> it2 = arrayList.iterator();
            Collection<? extends C18880g> collection4 = arrayList;
            while (it2.hasNext()) {
                C18880g gVar2 = (C18880g) it2.next();
                if (hashSet.contains(gVar2)) {
                    collection2 = collection4;
                } else {
                    PointD pointD = (PointD) hashMap3.get(gVar2);
                    int i6 = dimensionPixelSize * dimensionPixelSize;
                    ArrayList arrayList3 = new ArrayList();
                    Collection<? extends C18880g> collection5 = collection4;
                    for (C18880g gVar3 : collection4) {
                        int i7 = dimensionPixelSize;
                        Collection<? extends C18880g> collection6 = collection5;
                        PointD pointD2 = (PointD) hashMap3.get(gVar3);
                        HashMap hashMap6 = hashMap5;
                        HashMap hashMap7 = hashMap3;
                        double d = pointD2.f41030b - pointD.f41030b;
                        SparseArray<? extends Collection<? extends C18880g>> sparseArray2 = sparseArray;
                        double d2 = pointD2.f41031c - pointD.f41031c;
                        if ((d2 * d2) + (d * d) <= ((double) i6)) {
                            arrayList3.add(gVar3);
                        }
                        collection5 = collection6;
                        C18876b bVar3 = bVar;
                        int i8 = i;
                        hashMap5 = hashMap6;
                        hashMap3 = hashMap7;
                        dimensionPixelSize = i7;
                        sparseArray = sparseArray2;
                    }
                    int i9 = dimensionPixelSize;
                    SparseArray<? extends Collection<? extends C18880g>> sparseArray3 = sparseArray;
                    Collection<? extends C18880g> collection7 = collection5;
                    HashMap hashMap8 = hashMap3;
                    HashMap hashMap9 = hashMap5;
                    if (arrayList3.size() == 1) {
                        arrayList2.add(Collections.singleton(gVar2));
                        hashSet.add(gVar2);
                        hashMap4.put(gVar2, Double.valueOf(0.0d));
                        hashMap = hashMap9;
                        it = it2;
                    } else {
                        HashSet hashSet2 = new HashSet();
                        arrayList2.add(hashSet2);
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            C18880g gVar4 = (C18880g) it3.next();
                            Double d3 = (Double) hashMap4.get(gVar4);
                            HashMap hashMap10 = hashMap8;
                            PointD pointD3 = (PointD) hashMap10.get(gVar4);
                            Iterator<? extends C18880g> it4 = it2;
                            double d4 = pointD.f41030b - pointD3.f41030b;
                            hashMap8 = hashMap10;
                            double d5 = pointD.f41031c - pointD3.f41031c;
                            double d6 = (d5 * d5) + (d4 * d4);
                            if (d3 == null) {
                                hashMap2 = hashMap9;
                            } else if (d3.doubleValue() <= d6) {
                                it2 = it4;
                            } else {
                                hashMap2 = hashMap9;
                                ((Set) hashMap2.get(gVar4)).remove(gVar4);
                            }
                            hashMap4.put(gVar4, Double.valueOf(d6));
                            hashSet2.add(gVar4);
                            hashMap2.put(gVar4, hashSet2);
                            hashMap9 = hashMap2;
                            it2 = it4;
                        }
                        hashMap = hashMap9;
                        it = it2;
                        hashSet.addAll(hashSet2);
                    }
                    collection2 = collection7;
                    C18876b bVar4 = bVar;
                    int i11 = i;
                    hashMap5 = hashMap;
                    it2 = it;
                    hashMap3 = hashMap8;
                    dimensionPixelSize = i9;
                    sparseArray = sparseArray3;
                }
                collection4 = collection2;
            }
            int i12 = dimensionPixelSize;
            SparseArray<? extends Collection<? extends C18880g>> sparseArray4 = sparseArray;
            ArrayList arrayList4 = new ArrayList(arrayList2.size());
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Set<C18880g> set = (Set) it5.next();
                if (!set.isEmpty()) {
                    if (set.size() == 1) {
                        arrayList4.addAll(set);
                    } else {
                        long j = 0;
                        long j2 = 0;
                        for (C18880g gVar5 : set) {
                            LatLonE6 latLonE6 = gVar5.f48054b;
                            j += (long) latLonE6.f40980b;
                            j2 += (long) latLonE6.f40981c;
                        }
                        long size = (long) set.size();
                        LatLonE6 latLonE62 = new LatLonE6((int) (j / size), (int) (j2 / size));
                        int min = Math.min(99, C18872a.m45901a(set));
                        String[] strArr = new String[1];
                        if (min < 0) {
                            str = "";
                        } else {
                            Object[] objArr = {Integer.valueOf(min)};
                            String str2 = C20964s0.f52718a;
                            str = String.format((Locale) null, "%d", objArr);
                        }
                        strArr[0] = str;
                        arrayList4.add(new C18872a(latLonE62, imageRef.mo48235p(strArr), set));
                    }
                }
            }
            ImageRef imageRef2 = imageRef;
            sparseArray = sparseArray4;
            sparseArray.put(i4, arrayList4);
            i4--;
            i5 = i;
            dimensionPixelSize = i12;
            arrayList = arrayList4;
        }
        return sparseArray;
    }
}
