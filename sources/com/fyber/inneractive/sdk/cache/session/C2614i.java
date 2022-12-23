package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.cache.session.i */
public class C2614i implements Comparator<C2606e> {
    public int compare(Object obj, Object obj2) {
        C2606e eVar = (C2606e) obj;
        C2606e eVar2 = (C2606e) obj2;
        if (eVar == null || eVar2 == null) {
            return 0;
        }
        if (eVar.f9183d < eVar2.f9183d) {
            return -1;
        }
        return 1;
    }
}
