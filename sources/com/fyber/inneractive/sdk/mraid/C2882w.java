package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.mraid.w */
public class C2882w extends C2879t {

    /* renamed from: a */
    public final C3764d.C3771g f9863a;

    public C2882w(C3764d.C3771g gVar) {
        this.f9863a = gVar;
    }

    /* renamed from: a */
    public String mo13660a() {
        StringBuilder k = C13555b.m33972k("placementType: '");
        k.append(this.f9863a.toString().toLowerCase());
        k.append("'");
        return k.toString();
    }
}
