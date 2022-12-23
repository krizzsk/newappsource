package k30;

import android.content.Context;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.transit.ShapeSegment;
import i30.C5269e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import s00.C19391d;
import u00.C19840k;

/* renamed from: k30.c */
public final class C5468c extends C5466a {
    /* renamed from: b */
    public final MetroEntityType mo21357b() {
        return MetroEntityType.SHAPE_SEGMENT;
    }

    /* renamed from: d */
    public final boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z) {
        Set<ShapeSegment> h = ((C19840k) dVar.mo51794a(C19840k.class)).mo52141h(context, set);
        arrayList.addAll(h);
        if (!z) {
            return false;
        }
        HashSet hashSet = new HashSet(h.size() * 2);
        for (ShapeSegment next : h) {
            hashSet.add(next.f23667c);
            hashSet.add(next.f23668d);
        }
        return eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, hashSet);
    }
}
