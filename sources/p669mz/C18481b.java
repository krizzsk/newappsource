package p669mz;

import com.moovit.commons.utils.collections.CollectionHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: mz.b */
public final class C18481b {

    /* renamed from: a */
    public CollectionHashMap.HashSetHashMap<C18480a, Object> f47084a;

    /* renamed from: b */
    public boolean f47085b = false;

    /* renamed from: a */
    public final void mo50905a() {
        CollectionHashMap.HashSetHashMap<C18480a, Object> hashSetHashMap = this.f47084a;
        if (hashSetHashMap != null) {
            for (Map.Entry next : hashSetHashMap.entrySet()) {
                C18480a aVar = (C18480a) next.getKey();
                Iterator it = ((HashSet) next.getValue()).iterator();
                while (it.hasNext()) {
                    aVar.mo50903a(it.next());
                }
            }
        }
        this.f47085b = true;
    }

    /* renamed from: b */
    public final void mo50906b() {
        CollectionHashMap.HashSetHashMap<C18480a, Object> hashSetHashMap = this.f47084a;
        if (hashSetHashMap != null) {
            for (Map.Entry next : hashSetHashMap.entrySet()) {
                C18480a aVar = (C18480a) next.getKey();
                Iterator it = ((HashSet) next.getValue()).iterator();
                while (it.hasNext()) {
                    aVar.mo50904b(it.next());
                }
            }
        }
        this.f47085b = false;
    }
}
