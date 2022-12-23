package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.f */
public class C2632f {

    /* renamed from: a */
    public final Map<String, String> f9286a = new HashMap();

    /* renamed from: a */
    public boolean mo13228a(String str, boolean z) {
        try {
            if (this.f9286a.containsKey(str)) {
                return Boolean.parseBoolean(this.f9286a.get(str));
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
