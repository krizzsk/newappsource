package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.h */
public enum C2841h {
    Gif("image/gif");
    

    /* renamed from: c */
    public static final Map<String, C2841h> f9776c = null;

    /* renamed from: a */
    public String f9778a;

    /* access modifiers changed from: public */
    static {
        int i;
        f9776c = new HashMap();
        for (C2841h hVar : values()) {
            ((HashMap) f9776c).put(hVar.f9778a, hVar);
        }
    }

    /* access modifiers changed from: public */
    C2841h(String str) {
        this.f9778a = str;
    }
}
