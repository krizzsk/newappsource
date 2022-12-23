package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C2794u;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.mraid.C2859a0;
import com.fyber.inneractive.sdk.network.C2932s;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.response.C3649f;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3682e;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.renderers.l */
public class C3640l implements C3764d.C3770f {

    /* renamed from: a */
    public final /* synthetic */ C3638k f12708a;

    public C3640l(C3638k kVar) {
        this.f12708a = kVar;
    }

    /* renamed from: a */
    public void mo13913a(C3764d dVar) {
        C3638k kVar = this.f12708a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onExpand", IAlog.m9899a((Object) kVar));
        boolean unused = this.f12708a.f12695C = true;
        this.f12708a.mo15284M();
    }

    /* renamed from: b */
    public void mo13920b(C3764d dVar) {
        C3638k kVar = this.f12708a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onResize", IAlog.m9899a((Object) kVar));
    }

    /* renamed from: b */
    public void mo13919b() {
        this.f12708a.mo13558z();
    }

    /* renamed from: a */
    public void mo13914a(C3764d dVar, C2859a0 a0Var) {
        C3638k kVar = this.f12708a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onClose", IAlog.m9899a((Object) kVar));
        C3638k kVar2 = this.f12708a;
        if (kVar2.f12695C) {
            boolean unused = kVar2.f12695C = false;
            this.f12708a.mo15284M();
            return;
        }
        if (kVar2.f12698F == UnitDisplayType.REWARDED) {
            kVar2.mo15283L();
        }
        C2812c.C2813a aVar = this.f12708a.f9633k;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: a */
    public C3677d0.C3678a mo13910a(String str, C3721p0 p0Var) {
        C3649f fVar;
        C2608b bVar;
        C3638k kVar = this.f12708a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onClicked", IAlog.m9899a((Object) kVar));
        Context context = C3707l.f12893a;
        C2812c.C2813a aVar = this.f12708a.f9633k;
        if (!(aVar == null || aVar.getLayout() == null || this.f12708a.f9633k.getLayout().getContext() == null)) {
            context = this.f12708a.f9633k.getLayout().getContext();
        }
        if (context != null) {
            C3638k kVar2 = this.f12708a;
            if (kVar2.f9605i) {
                AdContent adcontent = kVar2.f9598b;
                if (adcontent == null) {
                    fVar = null;
                } else {
                    fVar = (C3649f) ((C2794u) adcontent).f9591b;
                }
                if (fVar != null) {
                    kVar2.mo13551a((C3648e) fVar);
                }
                C3638k kVar3 = this.f12708a;
                C2607a aVar2 = C2607a.CLICK;
                if (kVar3.f12698F == UnitDisplayType.REWARDED) {
                    bVar = C2608b.REWARDED_DISPLAY;
                } else {
                    bVar = C2608b.INTERSTITIAL_DISPLAY;
                }
                kVar3.mo13549a(aVar2, bVar);
                return this.f12708a.mo13548a(context, str, p0Var, C3682e.DISPLAY);
            }
        }
        return new C3677d0.C3678a(C3677d0.C3680c.FAILED, new Exception("No context or no native click detected"), context == null ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : context.getClass().getName());
    }

    /* renamed from: a */
    public void mo13911a() {
        this.f12708a.mo13550a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        this.f12708a.destroy();
    }

    /* renamed from: a */
    public void mo13917a(String str, String str2) {
        C3638k kVar = this.f12708a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m9899a((Object) kVar));
        C2812c.C2813a aVar = this.f12708a.f9633k;
        if (aVar != null && aVar.getLayout() != null) {
            C3638k kVar2 = this.f12708a;
            if (!kVar2.f12696D) {
                C2932s.m7255a(kVar2.f9633k.getLayout().getContext(), str, str2, this.f12708a.f9598b);
                boolean unused = this.f12708a.f12696D = true;
                C3638k kVar3 = this.f12708a;
                kVar3.getClass();
                IAlog.m9902a("%sreporting auto redirect", IAlog.m9899a((Object) kVar3));
                return;
            }
            IAlog.m9902a("%sredirect already reported for this ad", IAlog.m9899a((Object) kVar2));
        }
    }

    /* renamed from: a */
    public void mo15267a(boolean z) {
        C2608b bVar;
        String str;
        if (z) {
            C3638k kVar = this.f12708a;
            if (!kVar.f12704x) {
                kVar.f12704x = true;
                if (kVar.f9598b != null) {
                    IAmraidWebViewController iAmraidWebViewController = kVar.f12705y;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.mo15326m();
                    }
                    T t = ((C2794u) kVar.f9598b).f9591b;
                    if (!(t == null || (str = t.f12753k) == null || str.trim().length() <= 0)) {
                        IAlog.m9905d("%sfiring impression!", IAlog.m9899a((Object) kVar));
                        IAlog.m9900a(1, (Exception) null, "AD_IMPRESSION", new Object[0]);
                        kVar.mo13554b(str);
                    }
                    C3762c cVar = kVar.f12705y.f12957b;
                    if (cVar != null) {
                        cVar.mo15429a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    C2607a aVar = C2607a.IMPRESSION;
                    if (kVar.f12698F == UnitDisplayType.REWARDED) {
                        bVar = C2608b.REWARDED_DISPLAY;
                    } else {
                        bVar = C2608b.INTERSTITIAL_DISPLAY;
                    }
                    kVar.mo13549a(aVar, bVar);
                    kVar.mo13544A();
                    kVar.mo13573F();
                }
            }
        }
        C3638k kVar2 = this.f12708a;
        kVar2.getClass();
        IAlog.m9902a("%sweb view callback: onVisibilityChanged: %s", IAlog.m9899a((Object) kVar2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo13916a(C3764d dVar, boolean z, Orientation orientation) {
        C2812c.C2813a aVar = this.f12708a.f9633k;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public boolean mo13918a(String str) {
        C2812c.C2813a aVar = this.f12708a.f9633k;
        if (aVar == null || aVar.getLayout() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f12708a.f9633k.getLayout().getContext(), str);
        if (!startRichMediaIntent) {
            return startRichMediaIntent;
        }
        this.f12708a.mo13558z();
        return startRichMediaIntent;
    }

    /* renamed from: a */
    public void mo13915a(C3764d dVar, boolean z) {
        if (z) {
            C3638k kVar = this.f12708a;
            if (!kVar.f9641s) {
                boolean unused = kVar.f9641s = true;
                C3638k kVar2 = this.f12708a;
                C2812c.C2813a aVar = kVar2.f9633k;
                if (aVar != null) {
                    kVar2.mo13576d(aVar.isCloseButtonDisplay());
                }
            }
            this.f12708a.mo13574K();
            C2812c.C2813a aVar2 = this.f12708a.f9633k;
            if (aVar2 != null && aVar2.isCloseButtonDisplay()) {
                C3638k kVar3 = this.f12708a;
                kVar3.f9638p = false;
                C2812c.C2813a aVar3 = kVar3.f9633k;
                if (aVar3 != null) {
                    aVar3.disableCloseButton();
                }
                kVar3.f9643u.mo15341a();
            }
        }
    }

    /* renamed from: a */
    public void mo13912a(InneractiveUnitController.AdDisplayError adDisplayError) {
        this.f12708a.mo13577e(false);
        C3638k kVar = this.f12708a;
        EventsListener eventslistener = kVar.f9599c;
        if (eventslistener != null) {
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdEnteredErrorState(kVar.f9597a, adDisplayError);
        }
    }
}
