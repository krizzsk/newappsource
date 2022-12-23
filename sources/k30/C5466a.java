package k30;

import android.content.Context;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import i30.C5269e;
import j40.C5384a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import s00.C19391d;

/* renamed from: k30.a */
public abstract class C5466a {
    /* renamed from: a */
    public Set mo21356a(C5384a aVar, HashSet hashSet) {
        hashSet.add(aVar.getServerId());
        return hashSet;
    }

    /* renamed from: b */
    public abstract MetroEntityType mo21357b();

    /* renamed from: c */
    public final boolean mo21358c(Context context, C19391d dVar, CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap, C5269e eVar) {
        boolean contains = eVar.f17413c.contains(mo21357b());
        MetroEntityType b = mo21357b();
        Set<ServerId> d = eVar.mo21068d(b);
        ArrayList arrayList = new ArrayList(d.size());
        boolean d2 = mo21359d(context, dVar, d, arrayList, eVar, contains);
        hashSetHashMap.mo47002b(b, arrayList);
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo21356a((C5384a) it.next(), hashSet);
        }
        eVar.mo21070i(b, hashSet);
        return d2;
    }

    /* renamed from: d */
    public abstract boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z);
}
