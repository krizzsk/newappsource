package k30;

import android.content.Context;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPattern;
import i30.C5269e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import s00.C19391d;

/* renamed from: k30.h */
public final class C5473h extends C5466a {
    /* renamed from: b */
    public final MetroEntityType mo21357b() {
        return MetroEntityType.TRANSIT_PATTERN;
    }

    /* renamed from: d */
    public final boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z) {
        Set<TransitPattern> h = dVar.mo51804f().mo52151h(context, set);
        arrayList.addAll(h);
        if (!z) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (TransitPattern transitPattern : h) {
            ServerId.m11394f(transitPattern.f23709c, hashSet);
        }
        return eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, hashSet);
    }
}
