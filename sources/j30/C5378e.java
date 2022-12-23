package j30;

import android.content.Context;
import com.moovit.transit.TransitFrequency;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19846n;

/* renamed from: j30.e */
public final class C5378e extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((TransitFrequency) aVar);
        }
        C19846n nVar = (C19846n) dVar.mo51794a(C19846n.class);
        new C19846n.C19847a(context, nVar.mo52107d(), nVar.mo52109f(), hashSet).run();
    }
}
