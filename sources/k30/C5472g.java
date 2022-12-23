package k30;

import android.content.Context;
import com.moovit.metroentities.MetroEntityType;
import i30.C5269e;
import java.util.ArrayList;
import java.util.Set;
import s00.C19391d;

/* renamed from: k30.g */
public final class C5472g extends C5466a {
    /* renamed from: b */
    public final MetroEntityType mo21357b() {
        return MetroEntityType.TRANSIT_LINE_GROUP;
    }

    /* renamed from: d */
    public final boolean mo21359d(Context context, C19391d dVar, Set set, ArrayList arrayList, C5269e eVar, boolean z) {
        arrayList.addAll(dVar.mo51803e().mo52149h(context, set));
        return false;
    }
}
