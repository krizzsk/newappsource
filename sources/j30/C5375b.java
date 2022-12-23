package j30;

import android.content.Context;
import com.moovit.transit.BicycleStop;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19810c;

/* renamed from: j30.b */
public final class C5375b extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((BicycleStop) aVar);
        }
        C19810c cVar = (C19810c) dVar.mo51794a(C19810c.class);
        new C19810c.C19811a(context, cVar.mo52107d(), cVar.mo52109f(), hashSet).run();
    }
}
