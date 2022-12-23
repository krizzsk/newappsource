package k30;

import android.content.Context;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import i30.C5269e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import s00.C19391d;

/* renamed from: k30.i */
public final class C5474i extends C5466a {
    /* renamed from: b */
    public final MetroEntityType mo21357b() {
        return MetroEntityType.TRANSIT_STOP;
    }

    /* renamed from: d */
    public final boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z) {
        Set<TransitStop> i = dVar.mo51806h().mo52153i(context, set);
        arrayList.addAll(i);
        if (!z) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (TransitStop next : i) {
            ServerId.m11394f(next.f23735g, hashSet);
            ServerId.m11394f(next.f23737i, hashSet);
        }
        return eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_LINE, hashSet);
    }
}
