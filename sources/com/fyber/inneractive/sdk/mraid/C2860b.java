package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.b */
public abstract class C2860b {

    /* renamed from: a */
    public String f9839a;

    /* renamed from: b */
    public Map<String, String> f9840b;

    /* renamed from: c */
    public C3764d f9841c;

    /* renamed from: d */
    public C3721p0 f9842d;

    public C2860b(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        this.f9840b = map;
        this.f9842d = p0Var;
        this.f9841c = dVar;
    }

    /* renamed from: a */
    public int mo13658a(String str) {
        String str2 = this.f9840b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public abstract void mo13659a();

    /* renamed from: b */
    public abstract boolean mo13655b();
}
