package com.moovit.transit;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c00.C13733n;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.Image;
import com.moovit.transit.TransitType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p241s0.C6307g;
import p824tp.C19735m;
import p824tp.C19739q;
import p977zz.C20941h;
import p977zz.C20944i0;
import x00.C20440a;

/* renamed from: com.moovit.transit.b */
public final class C7843b {

    /* renamed from: a */
    public static final int f23777a = C19739q.ic_wheelchair_spannable_16_on_surface;

    /* renamed from: b */
    public static final C7844a f23778b = new C7844a();

    /* renamed from: com.moovit.transit.b$a */
    public class C7844a implements C13733n<TransitPatternTrips, List<TransitStop>> {
        public final Object convert(Object obj) throws Exception {
            return DbEntityRef.getEntities(((TransitPatternTrips) obj).f23717b.f23709c);
        }
    }

    /* renamed from: com.moovit.transit.b$b */
    public static class C7845b {

        /* renamed from: a */
        public final TransitStop f23779a;

        /* renamed from: b */
        public final HashSet f23780b = new HashSet();

        /* renamed from: c */
        public final HashSet f23781c = new HashSet();

        public C7845b(TransitStop transitStop) {
            this.f23779a = transitStop;
        }

        /* renamed from: a */
        public static void m17882a(C7845b bVar, Collection collection) {
            bVar.getClass();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C7845b bVar2 = (C7845b) it.next();
                bVar.f23780b.add(bVar2);
                bVar.f23780b.addAll(bVar2.f23780b);
            }
        }

        /* renamed from: b */
        public static void m17883b(C7845b bVar, Collection collection) {
            bVar.getClass();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C7845b bVar2 = (C7845b) it.next();
                bVar.f23781c.add(bVar2);
                bVar.f23781c.addAll(bVar2.f23781c);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7845b.class != obj.getClass()) {
                return false;
            }
            return this.f23779a.equals(((C7845b) obj).f23779a);
        }

        public final int hashCode() {
            return this.f23779a.f23730b.f15142b;
        }
    }

    /* renamed from: com.moovit.transit.b$c */
    public static class C7846c {

        /* renamed from: a */
        public final ArrayList f23782a;

        public C7846c(List<TransitStop> list) {
            this.f23782a = new ArrayList(list.size());
            for (TransitStop bVar : list) {
                this.f23782a.add(new C7845b(bVar));
            }
        }
    }

    /* renamed from: com.moovit.transit.b$d */
    public static class C7847d implements Comparator<C7845b> {

        /* renamed from: b */
        public final HashMap f23783b = new HashMap();

        /* renamed from: c */
        public static void m17884c(C7845b bVar, C7845b bVar2) {
            C7845b.m17883b(bVar, Collections.singletonList(bVar2));
            C7845b.m17883b(bVar, bVar2.f23781c);
            C7845b.m17882a(bVar2, Collections.singletonList(bVar));
            C7845b.m17882a(bVar2, bVar.f23780b);
        }

        /* renamed from: a */
        public final C7845b mo24455a(C7845b bVar, C7845b bVar2, HashSet hashSet, HashSet hashSet2) {
            Iterator it = hashSet.iterator();
            C7845b bVar3 = null;
            double d = Double.MAX_VALUE;
            while (it.hasNext()) {
                C7845b bVar4 = (C7845b) it.next();
                if (hashSet2.contains(bVar4)) {
                    double b = mo24456b(bVar, bVar4) + mo24456b(bVar2, bVar4);
                    if (b < d) {
                        bVar3 = bVar4;
                        d = b;
                    }
                }
            }
            return bVar3;
        }

        /* renamed from: b */
        public final double mo24456b(C7845b bVar, C7845b bVar2) {
            C20944i0 i0Var = new C20944i0(bVar, bVar2);
            C20944i0 i0Var2 = new C20944i0(bVar2, bVar);
            if (this.f23783b.containsKey(i0Var)) {
                return ((Double) this.f23783b.get(i0Var)).doubleValue();
            }
            if (this.f23783b.containsKey(i0Var2)) {
                return ((Double) this.f23783b.get(i0Var2)).doubleValue();
            }
            LatLonE6 latLonE6 = bVar.f23779a.f23732d;
            LatLonE6 latLonE62 = bVar2.f23779a.f23732d;
            latLonE6.getClass();
            double c = (double) LatLonE6.m40174c(latLonE6, latLonE62);
            this.f23783b.put(i0Var, Double.valueOf(c));
            return c;
        }

        public final int compare(Object obj, Object obj2) {
            C7845b bVar = (C7845b) obj;
            C7845b bVar2 = (C7845b) obj2;
            if (!bVar.f23781c.contains(bVar2)) {
                if (!bVar.f23780b.contains(bVar2)) {
                    if (mo24455a(bVar, bVar2, bVar.f23780b, bVar2.f23781c) != null) {
                        m17884c(bVar2, bVar);
                    } else if (mo24455a(bVar, bVar2, bVar.f23781c, bVar2.f23780b) != null) {
                        m17884c(bVar, bVar2);
                    } else {
                        C7845b a = mo24455a(bVar, bVar2, bVar.f23780b, bVar2.f23780b);
                        if (a == null) {
                            C7845b a2 = mo24455a(bVar, bVar2, bVar.f23781c, bVar2.f23781c);
                            if (a2 != null) {
                                if (mo24456b(bVar, a2) < mo24456b(bVar2, a2)) {
                                    m17884c(bVar2, bVar);
                                } else {
                                    m17884c(bVar, bVar2);
                                }
                            } else if (bVar.f23779a.f23730b.f15142b < bVar2.f23779a.f23730b.f15142b) {
                                return -1;
                            }
                        } else if (mo24456b(bVar, a) < mo24456b(bVar2, a)) {
                            m17884c(bVar, bVar2);
                        } else {
                            m17884c(bVar2, bVar);
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static Color m17874a(Context context, TransitLineGroup transitLineGroup) {
        Color color;
        if (UiUtils.m40253l(context)) {
            color = transitLineGroup.f23703k;
        } else {
            color = transitLineGroup.f23702j;
        }
        if (color == null) {
            return Color.m40220d(C19735m.colorSurfaceInverseEmphasisLow, context);
        }
        return color;
    }

    /* renamed from: b */
    public static Color m17875b(Context context, Color color) {
        int i = color.f41007b;
        int f = C20941h.m49043f(C19735m.colorOnSurface, context);
        int f2 = C20941h.m49043f(C19735m.colorOnSurfaceInverse, context);
        if (Color.m40219c(i, f) > Color.m40219c(i, f2)) {
            return new Color(f);
        }
        return new Color(f2);
    }

    /* renamed from: c */
    public static TransitAgency m17876c(TransitLine transitLine) {
        TransitLineGroup b;
        if (transitLine == null || (b = transitLine.mo24369b()) == null) {
            return null;
        }
        return b.f23696d.get();
    }

    /* renamed from: d */
    public static TransitType m17877d(TransitAgency transitAgency) {
        if (transitAgency != null) {
            return transitAgency.f23674d.get();
        }
        return null;
    }

    /* renamed from: e */
    public static TransitType.ViewType m17878e(TransitLine transitLine) {
        TransitType d = m17877d(m17876c(transitLine));
        if (d != null) {
            return d.f23761f;
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m17879f(List<C20440a> list) {
        boolean z;
        if (list == null) {
            return false;
        }
        for (C20440a aVar : list) {
            Image image = aVar.f51781a;
            if (image != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && "DrawableResourceImage".equals(image.f41803b) && image.f41804c.equals(Integer.valueOf(f23777a))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static ArrayList m17880g(Collection collection) {
        ArrayList<C7845b> arrayList;
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C7846c((List) it.next()));
        }
        if (arrayList2.size() == 1) {
            arrayList = ((C7846c) arrayList2.get(0)).f23782a;
        } else {
            HashMap hashMap = new HashMap();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList3 = ((C7846c) it2.next()).f23782a;
                int i = 0;
                while (i < arrayList3.size()) {
                    C7845b bVar = (C7845b) arrayList3.get(i);
                    C7845b.m17882a(bVar, arrayList3.subList(0, i));
                    i++;
                    C7845b.m17883b(bVar, arrayList3.subList(i, arrayList3.size()));
                    if (hashMap.containsKey(bVar.f23779a)) {
                        C7845b bVar2 = (C7845b) hashMap.get(bVar.f23779a);
                        C7845b.m17882a(bVar2, bVar.f23780b);
                        C7845b.m17883b(bVar2, bVar.f23781c);
                    } else {
                        hashMap.put(bVar.f23779a, bVar);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(hashMap.values());
            try {
                Collections.sort(arrayList4, new C7847d());
            } catch (Exception unused) {
            }
            arrayList = arrayList4;
        }
        ArrayList arrayList5 = new ArrayList();
        for (C7845b bVar3 : arrayList) {
            arrayList5.add(bVar3.f23779a);
        }
        return arrayList5;
    }

    /* renamed from: h */
    public static C6302b m17881h(List list, Map map) {
        C6302b bVar = new C6302b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransitLine transitLine = (TransitLine) it.next();
            String str = transitLine.f23691g;
            List list2 = (List) map.get(transitLine.f23687c);
            Collection collection = (List) bVar.getOrDefault(str, null);
            if (collection == null) {
                collection = new ArrayList();
                bVar.put(str, collection);
            }
            if (list2 != null) {
                C13720d.m34276f(list2, (C13722f) null, f23778b, collection);
            }
        }
        C6302b bVar2 = new C6302b(bVar.f19969d);
        Iterator it2 = ((C6307g.C6309b) bVar.entrySet()).iterator();
        while (true) {
            C6307g.C6311d dVar = (C6307g.C6311d) it2;
            if (!dVar.hasNext()) {
                return bVar2;
            }
            dVar.next();
            Map.Entry entry = dVar;
            bVar2.put((CharSequence) entry.getKey(), m17880g((Collection) entry.getValue()));
        }
    }
}
