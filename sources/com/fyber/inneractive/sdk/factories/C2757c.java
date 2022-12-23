package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.factories.c */
public final class C2757c {

    /* renamed from: a */
    public final Set<C2758a> f9536a = new HashSet();

    /* renamed from: com.fyber.inneractive.sdk.factories.c$a */
    public interface C2758a {
        /* renamed from: a */
        boolean mo13319a(InneractiveAdSpot inneractiveAdSpot);

        /* renamed from: b */
        C2812c mo13320b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.c$b */
    public static class C2759b {

        /* renamed from: a */
        public static C2757c f9537a = new C2757c();
    }

    /* renamed from: a */
    public C2812c mo13510a(InneractiveAdSpot inneractiveAdSpot) {
        for (C2758a next : this.f9536a) {
            if (next.mo13319a(inneractiveAdSpot)) {
                return next.mo13320b(inneractiveAdSpot);
            }
        }
        return null;
    }
}
