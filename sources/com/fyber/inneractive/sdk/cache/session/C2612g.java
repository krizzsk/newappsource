package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.cache.session.g */
public class C2612g implements Comparator<C2606e> {
    public C2612g(C2613h hVar) {
    }

    public int compare(Object obj, Object obj2) {
        C2606e eVar = (C2606e) obj;
        C2606e eVar2 = (C2606e) obj2;
        if (eVar == null || eVar2 == null) {
            return 0;
        }
        if (eVar2.f9183d - eVar.f9183d > 0) {
            return 1;
        }
        return -1;
    }
}
