package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.o */
public class C2874o extends C2860b {
    public C2874o(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        boolean z;
        Map<String, String> map = this.f9840b;
        if (map == null || !map.containsKey("allowOrientationChange") || !"false".equals(this.f9840b.get("allowOrientationChange"))) {
            z = true;
        } else {
            z = false;
        }
        this.f9841c.setOrientationProperties(z, this.f9840b.get("forceOrientation"));
    }

    /* renamed from: b */
    public boolean mo13655b() {
        return false;
    }
}
