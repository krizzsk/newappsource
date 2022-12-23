package j30;

import android.content.Context;
import com.moovit.transit.TransitLineGroup;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19848o;

/* renamed from: j30.f */
public final class C5379f extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((TransitLineGroup) aVar);
        }
        C19848o e = dVar.mo51803e();
        new C19848o.C19849a(context, e.mo52107d(), e.mo52109f(), hashSet).run();
    }
}
