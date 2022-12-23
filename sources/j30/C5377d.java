package j30;

import android.content.Context;
import com.moovit.transit.Shape;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19842l;

/* renamed from: j30.d */
public final class C5377d extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((Shape) aVar);
        }
        C19842l lVar = (C19842l) dVar.mo51794a(C19842l.class);
        new C19842l.C19843a(context, lVar.mo52107d(), lVar.mo52109f(), hashSet).run();
    }
}
