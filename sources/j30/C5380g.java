package j30;

import android.content.Context;
import com.moovit.transit.TransitPattern;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19850p;

/* renamed from: j30.g */
public final class C5380g extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((TransitPattern) aVar);
        }
        C19850p f = dVar.mo51804f();
        new C19850p.C19851a(context, f.mo52107d(), f.mo52109f(), hashSet).run();
    }
}
