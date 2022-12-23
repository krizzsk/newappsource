package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3683e0;

/* renamed from: com.fyber.inneractive.sdk.flow.y */
public class C2807y extends C2776j<C3650g> {

    /* renamed from: g */
    public C3430i f9675g;

    /* renamed from: h */
    public boolean f9676h = false;

    public C2807y(C2703z zVar, C2666s sVar, C3650g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(zVar, sVar);
        mo13541a(gVar);
        mo13540a(inneractiveAdRequest);
    }

    /* renamed from: a */
    public void mo13291a() {
        C3430i iVar = this.f9675g;
        if (iVar != null) {
            iVar.mo14626a();
            this.f9675g = null;
        }
    }

    /* renamed from: d */
    public boolean mo13299d() {
        C2619a0 a0Var = ((C2702y) this.f9593d).f9427f;
        if (a0Var == null) {
            return false;
        }
        return C3683e0.m9926a(a0Var.f9256j);
    }

    /* renamed from: e */
    public boolean mo13294e() {
        return this.f9675g != null;
    }

    /* renamed from: f */
    public String mo13597f() {
        C2835b bVar;
        T t = this.f9591b;
        if (t == null || (bVar = ((C3650g) t).f12771C) == null) {
            return null;
        }
        return bVar.f9738b;
    }

    public boolean isVideoAd() {
        return true;
    }
}
