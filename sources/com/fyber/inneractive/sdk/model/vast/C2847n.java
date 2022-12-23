package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.n */
public enum C2847n {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    UNKNOWN("unknown");
    

    /* renamed from: f */
    public static final Map<String, C2847n> f9799f = null;

    /* renamed from: a */
    public final String f9801a;

    /* access modifiers changed from: public */
    static {
        int i;
        f9799f = new HashMap();
        for (C2847n nVar : values()) {
            ((HashMap) f9799f).put(nVar.f9801a, nVar);
        }
    }

    /* access modifiers changed from: public */
    C2847n(String str) {
        this.f9801a = str;
    }
}
