package j30;

import android.content.Context;
import com.moovit.transit.TransitStop;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19853q;

/* renamed from: j30.h */
public final class C5381h extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((TransitStop) aVar);
        }
        C19853q h = dVar.mo51806h();
        new C19853q.C19854a(context, h.mo52107d(), h.mo52109f(), hashSet).run();
    }
}
