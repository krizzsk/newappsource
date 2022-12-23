package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C2794u;
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
import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.renderers.e */
public class C3629e implements C3764d.C3770f {

    /* renamed from: a */
    public final /* synthetic */ C3631g f12659a;

    public C3629e(C3631g gVar) {
        this.f12659a = gVar;
    }

    /* renamed from: a */
    public void mo13913a(C3764d dVar) {
        C3631g gVar = this.f12659a;
        gVar.getClass();
        IAlog.m9902a("%sweb view callback: onExpand", IAlog.m9899a((Object) gVar));
        C3631g gVar2 = this.f12659a;
        EventsListener eventslistener = gVar2.f9599c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(gVar2.f9597a);
        }
        C3631g gVar3 = this.f12659a;
        gVar3.getClass();
        IAlog.m9902a("%sweb view callback: onExpand", IAlog.m9899a((Object) gVar3));
        this.f12659a.mo15277d(true);
    }

    /* renamed from: a */
    public void mo13915a(C3764d dVar, boolean z) {
    }

    /* renamed from: a */
    public void mo13916a(C3764d dVar, boolean z, Orientation orientation) {
    }

    /* renamed from: b */
    public void mo13920b(C3764d dVar) {
        this.f12659a.mo15277d(true);
        C3631g gVar = this.f12659a;
        gVar.getClass();
        IAlog.m9902a("%sweb view callback: onResize", IAlog.m9899a((Object) gVar));
        C3631g gVar2 = this.f12659a;
        EventsListener eventslistener = gVar2.f9599c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdResized(gVar2.f9597a);
        }
    }

    /* renamed from: b */
    public void mo13919b() {
        this.f12659a.mo13558z();
        this.f12659a.mo13545B();
    }

    /* renamed from: a */
    public void mo13914a(C3764d dVar, C2859a0 a0Var) {
        C3631g gVar = this.f12659a;
        gVar.getClass();
        IAlog.m9902a("%sweb view callback: onClose", IAlog.m9899a((Object) gVar));
        C3631g gVar2 = this.f12659a;
        EventsListener eventslistener = gVar2.f9599c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdCollapsed(gVar2.f9597a);
        }
        this.f12659a.mo15273I();
        C3631g gVar3 = this.f12659a;
        gVar3.getClass();
        IAlog.m9902a("%sweb view callback: onClose", IAlog.m9899a((Object) gVar3));
    }

    /* renamed from: a */
    public C3677d0.C3678a mo13910a(String str, C3721p0 p0Var) {
        Context context;
        C2703z zVar;
        C2608b bVar;
        C3631g gVar = this.f12659a;
        gVar.getClass();
        IAlog.m9902a("%sweb view callback: onClicked", IAlog.m9899a((Object) gVar));
        ViewGroup viewGroup = this.f12659a.f12666p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            context = C3707l.f12893a;
        } else {
            context = this.f12659a.f12666p.getContext();
        }
        if (context != null) {
            C3631g gVar2 = this.f12659a;
            if (gVar2.f9605i) {
                AdContent adcontent = gVar2.f9598b;
                C3649f fVar = adcontent != null ? (C3649f) ((C2794u) adcontent).f9591b : null;
                if (fVar != null) {
                    gVar2.mo13551a((C3648e) fVar);
                }
                C3631g gVar3 = this.f12659a;
                AdContent adcontent2 = gVar3.f9598b;
                if (!(adcontent2 == null || (zVar = ((C2794u) adcontent2).f9593d) == null || ((C2702y) zVar).f9424c == null)) {
                    C2607a aVar = C2607a.CLICK;
                    if (((C2702y) zVar).f9424c.f9368b == UnitDisplayType.MRECT) {
                        bVar = C2608b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C2608b.BANNER_DISPLAY;
                    }
                    gVar3.mo13549a(aVar, bVar);
                }
                return this.f12659a.mo13548a(context, str, p0Var, C3682e.DISPLAY);
            }
        }
        return new C3677d0.C3678a(C3677d0.C3680c.FAILED, new Exception("No context or no native click detected"), context == null ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : context.getClass().getName());
    }

    /* renamed from: a */
    public void mo13911a() {
        this.f12659a.mo13550a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: a */
    public void mo13917a(String str, String str2) {
        C3631g gVar = this.f12659a;
        gVar.getClass();
        IAlog.m9902a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m9899a((Object) gVar));
        ViewGroup viewGroup = this.f12659a.f12666p;
        if (viewGroup != null && viewGroup.getContext() != null) {
            C3631g gVar2 = this.f12659a;
            if (!gVar2.f12672v) {
                C2932s.m7255a(gVar2.f12666p.getContext(), str, str2, this.f12659a.f9598b);
                boolean unused = this.f12659a.f12672v = true;
                C3631g gVar3 = this.f12659a;
                gVar3.getClass();
                IAlog.m9902a("%sreporting auto redirect", IAlog.m9899a((Object) gVar3));
                return;
            }
            IAlog.m9902a("%sredirect already reported for this ad", IAlog.m9899a((Object) gVar2));
        }
    }

    /* renamed from: a */
    public void mo15267a(boolean z) {
        C2703z zVar;
        C2684r rVar;
        C2608b bVar;
        C3631g gVar = this.f12659a;
        gVar.getClass();
        IAlog.m9902a("%sweb view callback: onVisibilityChanged: %s", IAlog.m9899a((Object) gVar), Boolean.valueOf(z));
        if (z) {
            C3631g gVar2 = this.f12659a;
            if (!gVar2.f12665o) {
                IAlog.m9902a("%sonShownForTheFirstTime called", IAlog.m9899a((Object) gVar2));
                AdContent adcontent = gVar2.f9598b;
                C3649f fVar = adcontent != null ? (C3649f) ((C2794u) adcontent).f9591b : null;
                if (fVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = gVar2.f12663m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.mo15326m();
                    }
                    gVar2.mo13553b((C3648e) fVar);
                }
                long G = (long) gVar2.mo15271G();
                gVar2.f12661k = G;
                if (G != 0) {
                    gVar2.mo15274a(G, true);
                }
                AdContent adcontent2 = gVar2.f9598b;
                if (!(adcontent2 == null || (zVar = ((C2794u) adcontent2).f9593d) == null || (rVar = ((C2702y) zVar).f9424c) == null)) {
                    C2607a aVar = C2607a.IMPRESSION;
                    if (rVar.f9368b == UnitDisplayType.MRECT) {
                        bVar = C2608b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C2608b.BANNER_DISPLAY;
                    }
                    gVar2.mo13549a(aVar, bVar);
                }
                gVar2.mo13544A();
                this.f12659a.f12665o = true;
                return;
            }
            C3623b bVar2 = gVar2.f12675y;
            if (bVar2 != null) {
                bVar2.mo15262b();
            }
            this.f12659a.mo15273I();
            return;
        }
        C3623b bVar3 = this.f12659a.f12675y;
        if (bVar3 != null && bVar3.f12652h) {
            bVar3.mo15263c();
        }
        this.f12659a.mo15277d(false);
    }

    /* renamed from: a */
    public boolean mo13918a(String str) {
        ViewGroup viewGroup = this.f12659a.f12666p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f12659a.f12666p.getContext(), str);
        if (!startRichMediaIntent) {
            return startRichMediaIntent;
        }
        C3631g gVar = this.f12659a;
        if (gVar.f9599c == null) {
            return startRichMediaIntent;
        }
        gVar.mo13558z();
        return startRichMediaIntent;
    }

    /* renamed from: a */
    public void mo13912a(InneractiveUnitController.AdDisplayError adDisplayError) {
        C3631g gVar = this.f12659a;
        EventsListener eventslistener = gVar.f9599c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdEnteredErrorState(gVar.f9597a, adDisplayError);
        }
    }
}
