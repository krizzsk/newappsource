package k30;

import android.content.Context;
import com.moovit.metroentities.MetroEntityType;
import i30.C5269e;
import java.util.ArrayList;
import java.util.Set;
import s00.C19391d;
import u00.C19846n;

/* renamed from: k30.e */
public final class C5470e extends C5466a {
    /* renamed from: b */
    public final MetroEntityType mo21357b() {
        return MetroEntityType.TRANSIT_FREQUENCIES;
    }

    /* renamed from: d */
    public final boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z) {
        arrayList.addAll(((C19846n) dVar.mo51794a(C19846n.class)).mo52147h(context, set));
        return false;
    }
}
