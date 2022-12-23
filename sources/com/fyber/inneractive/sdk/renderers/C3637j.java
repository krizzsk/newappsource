package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2790s;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2841h;
import com.fyber.inneractive.sdk.player.controller.C3020s;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3682e;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.j */
public class C3637j extends C2790s implements C3020s {

    /* renamed from: w */
    public boolean f12692w = false;

    /* renamed from: E */
    public boolean mo13345E() {
        return false;
    }

    /* renamed from: G */
    public int mo13346G() {
        return 0;
    }

    /* renamed from: H */
    public int mo13347H() {
        return 0;
    }

    /* renamed from: I */
    public long mo13348I() {
        return 0;
    }

    /* renamed from: J */
    public boolean mo13349J() {
        return false;
    }

    /* renamed from: L */
    public final void mo15282L() {
        C2703z zVar;
        C2608b bVar;
        AdContent adcontent = this.f9598b;
        if (adcontent != null && (zVar = ((C2807y) adcontent).f9593d) != null && ((C2702y) zVar).f9424c != null) {
            UnitDisplayType unitDisplayType = ((C2702y) zVar).f9424c.f9368b;
            C2628d0 d0Var = IAConfigManager.f9202J.f9236x;
            if (unitDisplayType == UnitDisplayType.REWARDED) {
                bVar = C2608b.REWARDED_VIDEO;
            } else {
                bVar = C2608b.INTERSTITIAL_VIDEO;
            }
            d0Var.mo13211a(bVar, C2607a.CLICK);
        }
    }

    /* renamed from: a */
    public long mo13350a(long j) {
        return 0;
    }

    /* renamed from: a */
    public C3677d0.C3678a mo13938a(C3721p0 p0Var, C3682e eVar) {
        mo15282L();
        throw null;
    }

    /* renamed from: a */
    public void mo13352a(C2812c.C2814b bVar) {
    }

    /* renamed from: a */
    public void mo13942a(boolean z) {
    }

    /* renamed from: a */
    public void mo13943a(boolean z, Orientation orientation) {
    }

    /* renamed from: b */
    public void mo13353b() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo13354b(C2776j jVar) {
        C2807y yVar = (C2807y) jVar;
        return false;
    }

    public void destroy() {
        if (!this.f12692w) {
            mo13355m();
        }
        this.f9598b = null;
        super.destroy();
    }

    /* renamed from: e */
    public void mo13944e() {
    }

    /* renamed from: g */
    public void mo13945g() {
        T t;
        C2836c cVar;
        C2841h hVar;
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            C2807y yVar = (C2807y) adcontent;
            if (yVar.f9590a != null && (t = yVar.f9591b) != null) {
                String str = null;
                C2835b bVar = ((C3650g) t).f12771C;
                if (!(bVar == null || (cVar = bVar.f9743g) == null || (hVar = cVar.f9747b) == null)) {
                    str = hVar.toString();
                }
                mo13552a(str);
            }
        }
    }

    /* renamed from: h */
    public void mo13946h() {
        IAlog.m9902a("%snShownCloseButton", IAlog.m9899a((Object) this));
    }

    /* renamed from: j */
    public void mo13947j() {
        mo13550a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: k */
    public void mo13948k() {
    }

    /* renamed from: l */
    public void mo13949l() {
    }

    /* renamed from: m */
    public void mo13355m() {
        this.f12692w = true;
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            C2807y yVar = (C2807y) adcontent;
        }
        IAlog.m9902a("%sunit controller is null!", IAlog.m9899a((Object) this));
    }

    /* renamed from: o */
    public void mo13578o() {
    }

    public void onCompleted() {
    }

    public void onPlayerError() {
    }

    public void onProgress(int i, int i2) {
    }

    /* renamed from: r */
    public void mo13953r() {
        mo13558z();
    }

    /* renamed from: s */
    public void mo13579s() {
    }

    /* renamed from: u */
    public boolean mo13356u() {
        return false;
    }

    /* renamed from: a */
    public void mo13941a(String str, String str2) {
        IAlog.m9902a(IAlog.m9899a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2 = (r2 = r2.f9743g).f9747b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.util.C3677d0.C3678a mo13939a(java.lang.String r2, com.fyber.inneractive.sdk.util.C3721p0 r3) {
        /*
            r1 = this;
            AdContent r2 = r1.f9598b
            r3 = 0
            if (r2 == 0) goto L_0x002f
            com.fyber.inneractive.sdk.flow.y r2 = (com.fyber.inneractive.sdk.flow.C2807y) r2
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r2.f9590a
            if (r0 == 0) goto L_0x002f
            T r2 = r2.f9591b
            if (r2 == 0) goto L_0x002f
            r1.mo15282L()
            AdContent r2 = r1.f9598b
            com.fyber.inneractive.sdk.flow.y r2 = (com.fyber.inneractive.sdk.flow.C2807y) r2
            T r2 = r2.f9591b
            com.fyber.inneractive.sdk.response.g r2 = (com.fyber.inneractive.sdk.response.C3650g) r2
            com.fyber.inneractive.sdk.model.vast.b r2 = r2.f12771C
            if (r2 == 0) goto L_0x002b
            com.fyber.inneractive.sdk.model.vast.c r2 = r2.f9743g
            if (r2 == 0) goto L_0x002b
            com.fyber.inneractive.sdk.model.vast.h r2 = r2.f9747b
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r2.toString()
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r1.mo13552a((java.lang.String) r2)
        L_0x002f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C3637j.mo13939a(java.lang.String, com.fyber.inneractive.sdk.util.p0):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: a */
    public void mo13940a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo13558z();
        }
    }
}
