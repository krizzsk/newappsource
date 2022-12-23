package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.h */
public class C2647h extends C2644e {
    public C2647h() {
        super("omsdk");
    }

    /* renamed from: b */
    public C2644e mo13234b() {
        C2647h hVar = new C2647h();
        mo13238a((C2644e) hVar);
        return hVar;
    }

    /* renamed from: c */
    public boolean mo13244c() {
        boolean a = mo13239a("enable", false);
        IAlog.m9902a("OMSDK AB %s", String.valueOf(a));
        return a;
    }
}
