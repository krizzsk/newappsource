package k30;

import android.content.Context;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import i30.C5269e;
import j40.C5384a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import s00.C19391d;
import u00.C19848o;

/* renamed from: k30.f */
public final class C5471f extends C5466a {
    /* renamed from: a */
    public final Set mo21356a(C5384a aVar, HashSet hashSet) {
        ServerId.m11394f(((TransitLineGroup) aVar).f23700h, hashSet);
        return hashSet;
    }

    /* renamed from: b */
    public final MetroEntityType mo21357b() {
        return MetroEntityType.TRANSIT_LINE;
    }

    /* renamed from: d */
    public final boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z) {
        C19848o e = dVar.mo51803e();
        arrayList.addAll(e.mo52149h(context, e.mo52150i(context, set)));
        return false;
    }
}
