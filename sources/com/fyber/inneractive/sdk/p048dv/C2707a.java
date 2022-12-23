package com.fyber.inneractive.sdk.p048dv;

import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.p048dv.banner.C2712b;
import com.fyber.inneractive.sdk.response.C3648e;
import com.google.android.gms.ads.AdRequest;

/* renamed from: com.fyber.inneractive.sdk.dv.a */
public abstract class C2707a<T> extends C2776j<C2720f> {

    /* renamed from: g */
    public C2717d f9431g;

    /* renamed from: h */
    public C2712b f9432h;

    /* renamed from: i */
    public T f9433i;

    public C2707a(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar);
        mo13541a(fVar);
    }

    /* renamed from: a */
    public void mo13291a() {
        this.f9431g = null;
        this.f9433i = null;
    }

    /* renamed from: c */
    public C3648e mo13293c() {
        return (C2720f) this.f9591b;
    }

    /* renamed from: e */
    public boolean mo13294e() {
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }

    /* renamed from: a */
    public void mo13292a(AdRequest adRequest, C2717d dVar) {
        this.f9431g = dVar;
    }
}
