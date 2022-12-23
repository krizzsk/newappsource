package j30;

import android.content.Context;
import com.moovit.transit.ShapeSegment;
import j40.C5384a;
import java.util.Collection;
import java.util.HashSet;
import s00.C19391d;
import u00.C19840k;

/* renamed from: j30.c */
public final class C5376c extends C5374a {
    /* renamed from: a */
    public final void mo21153a(Context context, C19391d dVar, Collection<? extends C5384a> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (C5384a aVar : collection) {
            hashSet.add((ShapeSegment) aVar);
        }
        C19840k kVar = (C19840k) dVar.mo51794a(C19840k.class);
        new C19840k.C19841a(context, kVar.mo52107d(), kVar.mo52109f(), hashSet).run();
    }
}
