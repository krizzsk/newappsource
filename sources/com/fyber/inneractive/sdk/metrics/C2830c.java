package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.metrics.c */
public class C2830c {

    /* renamed from: c */
    public static final C2830c f9722c = new C2830c();

    /* renamed from: a */
    public final Map<String, C2833f> f9723a = new HashMap();

    /* renamed from: b */
    public final C2833f f9724b = new C2832e();

    /* renamed from: a */
    public C2833f mo13620a(String str) {
        if (str == null) {
            try {
                return this.f9724b;
            } catch (Exception unused) {
                return this.f9724b;
            }
        } else {
            C2833f fVar = this.f9723a.get(str);
            if (fVar != null) {
                return fVar;
            }
            C2831d dVar = new C2831d();
            this.f9723a.put(str, dVar);
            return dVar;
        }
    }
}
