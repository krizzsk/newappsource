package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.cache.session.a */
public class C2600a extends HashMap<C2608b, C2613h> {

    /* renamed from: a */
    public final /* synthetic */ int f9168a;

    public C2600a(C2604d dVar, int i) {
        this.f9168a = i;
        for (C2608b bVar : C2608b.values()) {
            if (bVar != C2608b.NONE) {
                put(bVar, new C2613h(this.f9168a));
            }
        }
    }
}
