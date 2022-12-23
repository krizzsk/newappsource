package androidx.work;

import androidx.work.C1388b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p081f3.C4654f;

public final class OverwritingInputMerger extends C4654f {
    /* renamed from: a */
    public final C1388b mo5655a(ArrayList arrayList) {
        C1388b.C1389a aVar = new C1388b.C1389a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((C1388b) it.next()).f5152a));
        }
        aVar.mo5695a(hashMap);
        C1388b bVar = new C1388b(aVar.f5153a);
        C1388b.m3716c(bVar);
        return bVar;
    }
}
