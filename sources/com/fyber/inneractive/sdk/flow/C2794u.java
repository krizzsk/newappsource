package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C3649f;

/* renamed from: com.fyber.inneractive.sdk.flow.u */
public class C2794u extends C2776j<C3649f> {

    /* renamed from: g */
    public IAmraidWebViewController f9648g;

    public C2794u(C2703z zVar, C2666s sVar) {
        super(zVar, sVar);
    }

    /* renamed from: a */
    public void mo13291a() {
        IAmraidWebViewController iAmraidWebViewController = this.f9648g;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.mo15464k();
            this.f9648g.mo15325l();
            this.f9648g = null;
        }
    }

    /* renamed from: d */
    public boolean mo13299d() {
        C2684r rVar;
        UnitDisplayType unitDisplayType;
        C2703z zVar = this.f9593d;
        if (zVar == null || (rVar = ((C2702y) zVar).f9424c) == null || (unitDisplayType = rVar.f9368b) == null) {
            return false;
        }
        return unitDisplayType.isFullscreenUnit();
    }

    /* renamed from: e */
    public boolean mo13294e() {
        boolean z;
        IAmraidWebViewController iAmraidWebViewController = this.f9648g;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f12957b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }
}
