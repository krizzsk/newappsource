package com.fyber.inneractive.sdk.renderers;

import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2642c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2786p;
import com.fyber.inneractive.sdk.flow.C2790s;
import com.fyber.inneractive.sdk.flow.C2794u;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3668a;
import com.fyber.inneractive.sdk.util.C3675c0;
import com.fyber.inneractive.sdk.util.C3710l0;
import com.fyber.inneractive.sdk.util.C3741w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.renderers.k */
public class C3638k extends C2790s {

    /* renamed from: A */
    public boolean f12693A = false;

    /* renamed from: B */
    public boolean f12694B = false;

    /* renamed from: C */
    public boolean f12695C = false;

    /* renamed from: D */
    public boolean f12696D = false;

    /* renamed from: E */
    public C3741w0 f12697E;

    /* renamed from: F */
    public UnitDisplayType f12698F = UnitDisplayType.INTERSTITIAL;

    /* renamed from: G */
    public boolean f12699G = false;

    /* renamed from: H */
    public boolean f12700H = false;

    /* renamed from: I */
    public C2812c.C2814b f12701I;

    /* renamed from: J */
    public C3710l0 f12702J;

    /* renamed from: w */
    public C3764d.C3770f f12703w;

    /* renamed from: x */
    public boolean f12704x = false;

    /* renamed from: y */
    public IAmraidWebViewController f12705y;

    /* renamed from: z */
    public boolean f12706z = false;

    /* renamed from: com.fyber.inneractive.sdk.renderers.k$a */
    public class C3639a implements C3741w0.C3743b {
        public C3639a() {
        }

        /* renamed from: a */
        public void mo13200a(C3741w0 w0Var) {
            boolean unused = C3638k.this.f12699G = true;
        }
    }

    /* renamed from: E */
    public boolean mo13345E() {
        if (this.f12694B || !this.f12705y.f13005I) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public int mo13346G() {
        C2666s sVar;
        Integer b;
        Class cls = C2642c.class;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (sVar = ((C2794u) adcontent).f9592c) == null || sVar.mo13264a(cls) == null || (b = ((C2642c) ((C2794u) this.f9598b).f9592c.mo13264a(cls)).mo13240b("close_clickable_area_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: H */
    public int mo13347H() {
        C2666s sVar;
        Integer b;
        Class cls = C2642c.class;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (sVar = ((C2794u) adcontent).f9592c) == null || sVar.mo13264a(cls) == null || (b = ((C2642c) ((C2794u) this.f9598b).f9592c.mo13264a(cls)).mo13240b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: I */
    public long mo13348I() {
        int i = 2;
        if (this.f12698F == UnitDisplayType.REWARDED) {
            int a = IAConfigManager.f9202J.f9234v.f9337b.mo13271a("rewarded_mraid_delay", 31, 30);
            IAlog.m9902a("%sGetting rewarded total delay of %d seconds", IAlog.m9899a((Object) this), Integer.valueOf(a));
            i = a;
        } else {
            C2667h hVar = IAConfigManager.f9202J.f9234v.f9337b;
            String l = Long.toString(2);
            if (hVar.f9334a.containsKey("mraid_x_delay")) {
                l = hVar.f9334a.get("mraid_x_delay");
            }
            try {
                i = Integer.parseInt(l);
            } catch (Throwable unused) {
            }
        }
        return (long) (i * 1000);
    }

    /* renamed from: J */
    public boolean mo13349J() {
        return false;
    }

    /* renamed from: L */
    public final void mo15283L() {
        IAlog.m9902a("%sprovide reward called", IAlog.m9899a((Object) this));
        if (this.f12700H) {
            IAlog.m9902a("%sreward was already provided", IAlog.m9899a((Object) this));
            return;
        }
        IAlog.m9902a("%sreward sent", IAlog.m9899a((Object) this));
        if (this.f12701I != null) {
            mo13549a(C2607a.COMPLETION, C2608b.REWARDED_DISPLAY);
            ((InneractiveFullscreenUnitController.C2748a) this.f12701I).mo13474a();
        }
        mo13547D();
        this.f12700H = true;
    }

    /* renamed from: M */
    public final void mo15284M() {
        if (this.f9598b == null || this.f12705y == null) {
            IAlog.m9902a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C3762c cVar = this.f12705y.f12957b;
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
    }

    public void destroy() {
        EventsListener eventslistener;
        if (this.f12706z && !this.f12693A && (eventslistener = this.f9599c) != null) {
            this.f12693A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f9597a);
        }
        this.f12703w = null;
        C3741w0 w0Var = this.f12697E;
        if (w0Var != null) {
            w0Var.f12943e = null;
            this.f12697E = null;
        }
        super.destroy();
    }

    /* renamed from: m */
    public void mo13355m() {
        C2776j jVar;
        InneractiveAdRequest inneractiveAdRequest;
        C3648e eVar;
        JSONArray jSONArray;
        C2666s sVar;
        EventsListener eventslistener;
        if (this.f12698F == UnitDisplayType.REWARDED) {
            mo15283L();
        }
        if (!this.f12693A && (eventslistener = this.f9599c) != null) {
            this.f12693A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f9597a);
        }
        C3710l0 l0Var = this.f12702J;
        if (l0Var != null) {
            long j = l0Var.f12897b;
            if (j != 0) {
                String a = C3675c0.m9915a(j, l0Var.f12899d);
                l0Var.f12897b = 0;
                l0Var.f12898c = 0;
                l0Var.f12899d = 0;
                InneractiveAdSpot inneractiveAdSpot = l0Var.f12896a;
                if (inneractiveAdSpot != null) {
                    jVar = inneractiveAdSpot.getAdContent();
                } else {
                    jVar = null;
                }
                C2924p pVar = C2924p.INTERSTITIAL_VIEW_TIME;
                if (jVar != null) {
                    inneractiveAdRequest = jVar.f9590a;
                } else {
                    inneractiveAdRequest = null;
                }
                if (jVar != null) {
                    eVar = jVar.mo13293c();
                } else {
                    eVar = null;
                }
                if (jVar == null || (sVar = jVar.f9592c) == null) {
                    jSONArray = null;
                } else {
                    jSONArray = sVar.mo13268c();
                }
                C2926q.C2927a aVar = new C2926q.C2927a(eVar);
                aVar.f10042c = pVar;
                aVar.f10040a = inneractiveAdRequest;
                aVar.f10043d = jSONArray;
                aVar.mo13716a("time", a);
                aVar.mo13717a((String) null);
            }
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f9597a;
        if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof C2786p)) {
            ((C2786p) inneractiveAdSpot2).mo13559a();
        }
    }

    /* renamed from: o */
    public void mo13578o() {
        C3741w0 w0Var;
        super.mo13578o();
        if (this.f12698F == UnitDisplayType.REWARDED && (w0Var = this.f12697E) != null) {
            w0Var.mo15391b();
        }
        C3710l0 l0Var = this.f12702J;
        if (l0Var != null) {
            if (l0Var.f12897b == 0) {
                l0Var.f12897b = System.currentTimeMillis();
            }
            if (l0Var.f12898c > 0) {
                l0Var.f12899d += System.currentTimeMillis() - l0Var.f12898c;
                l0Var.f12898c = 0;
            }
        }
        this.f9643u.mo15343b();
    }

    /* renamed from: s */
    public void mo13579s() {
        C3741w0 w0Var;
        super.mo13579s();
        if (this.f12698F == UnitDisplayType.REWARDED && (w0Var = this.f12697E) != null) {
            w0Var.mo15389a();
        }
        C3710l0 l0Var = this.f12702J;
        if (l0Var != null) {
            l0Var.f12898c = System.currentTimeMillis();
        }
        C3668a aVar = this.f9643u;
        if (aVar.f12818b) {
            aVar.f12821e = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public boolean mo13356u() {
        boolean z;
        if (this.f9633k == null) {
            z = true;
        } else if (this.f12698F == UnitDisplayType.REWARDED) {
            if (this.f12699G) {
                mo15283L();
            }
            z = this.f12699G;
        } else {
            z = this.f9638p;
        }
        if (!z) {
            return true;
        }
        C2812c.C2813a aVar = this.f9633k;
        if (aVar == null) {
            return false;
        }
        aVar.dismissAd(true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = ((com.fyber.inneractive.sdk.flow.C2794u) r7).f9593d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13351a(com.fyber.inneractive.sdk.interfaces.C2812c.C2813a r6, android.app.Activity r7) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError, android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            super.mo13351a((com.fyber.inneractive.sdk.interfaces.C2812c.C2813a) r6, (android.app.Activity) r7)
            AdContent r7 = r5.f9598b
            r0 = 0
            if (r7 == 0) goto L_0x0014
            r1 = r7
            com.fyber.inneractive.sdk.flow.u r1 = (com.fyber.inneractive.sdk.flow.C2794u) r1
            com.fyber.inneractive.sdk.config.z r1 = r1.f9593d
            if (r1 == 0) goto L_0x0014
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f9424c
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00f3
            if (r7 == 0) goto L_0x0020
            com.fyber.inneractive.sdk.flow.u r7 = (com.fyber.inneractive.sdk.flow.C2794u) r7
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r7 = r7.f9648g
            goto L_0x0021
        L_0x0020:
            r7 = r0
        L_0x0021:
            r5.f12705y = r7
            if (r7 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.web.c r4 = r7.f12957b
            if (r4 == 0) goto L_0x002b
            r4 = 1
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f9368b
            r5.f12698F = r1
            r5.f12706z = r2
            r5.f12693A = r2
            com.fyber.inneractive.sdk.util.l0 r1 = new com.fyber.inneractive.sdk.util.l0
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r4 = r5.f9597a
            r1.<init>(r4)
            r5.f12702J = r1
            r5.f9633k = r6
            android.view.View r6 = r6.getCloseButton()
            if (r6 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.measurement.a$a r7 = r7.f13021x
            if (r7 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.measurement.f r7 = (com.fyber.inneractive.sdk.measurement.C2822f) r7
            oh.b r1 = r7.f9685b     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.CLOSE_AD     // Catch:{ all -> 0x0057 }
            r1.mo51249a(r6, r4)     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r6 = move-exception
            r7.mo13610a(r6)
        L_0x005b:
            AdContent r6 = r5.f9598b
            com.fyber.inneractive.sdk.flow.u r6 = (com.fyber.inneractive.sdk.flow.C2794u) r6
            T r6 = r6.f9591b
            com.fyber.inneractive.sdk.response.f r6 = (com.fyber.inneractive.sdk.response.C3649f) r6
            int r7 = r6.f12747e
            int r6 = r6.f12748f
            r1 = 300(0x12c, float:4.2E-43)
            if (r7 != r1) goto L_0x006f
            r1 = 250(0xfa, float:3.5E-43)
            if (r6 == r1) goto L_0x0077
        L_0x006f:
            r1 = 600(0x258, float:8.41E-43)
            if (r7 != r1) goto L_0x0078
            r1 = 500(0x1f4, float:7.0E-43)
            if (r6 != r1) goto L_0x0078
        L_0x0077:
            r2 = 1
        L_0x0078:
            r5.f12694B = r2
            if (r2 == 0) goto L_0x008b
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r5.f12705y
            float r7 = (float) r7
            int r7 = com.fyber.inneractive.sdk.util.C3707l.m9955a((float) r7)
            float r6 = (float) r6
            int r6 = com.fyber.inneractive.sdk.util.C3707l.m9955a((float) r6)
            r1.setAdDefaultSize(r7, r6)
        L_0x008b:
            com.fyber.inneractive.sdk.web.d$f r6 = r5.f12703w
            if (r6 != 0) goto L_0x0096
            com.fyber.inneractive.sdk.renderers.l r6 = new com.fyber.inneractive.sdk.renderers.l
            r6.<init>(r5)
            r5.f12703w = r6
        L_0x0096:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r5.f12705y
            com.fyber.inneractive.sdk.web.d$f r7 = r5.f12703w
            r6.setListener(r7)
            r5.mo15284M()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r5.f12705y
            com.fyber.inneractive.sdk.interfaces.c$a r7 = r5.f9633k
            android.view.ViewGroup r7 = r7.getLayout()
            AdContent r1 = r5.f9598b
            com.fyber.inneractive.sdk.flow.u r1 = (com.fyber.inneractive.sdk.flow.C2794u) r1
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r1.f9590a
            r6.mo15407a(r7, r0)
            r5.f12706z = r3
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r5.f12698F
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r6 != r7) goto L_0x00dd
            com.fyber.inneractive.sdk.util.w0 r6 = new com.fyber.inneractive.sdk.util.w0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.i r0 = r0.f9234v
            com.fyber.inneractive.sdk.config.h r0 = r0.f9337b
            r1 = 31
            r2 = 30
            java.lang.String r3 = "rewarded_mraid_delay"
            int r0 = r0.mo13271a(r3, r1, r2)
            long r0 = (long) r0
            r6.<init>(r7, r0)
            r5.f12697E = r6
            com.fyber.inneractive.sdk.renderers.k$a r7 = new com.fyber.inneractive.sdk.renderers.k$a
            r7.<init>()
            r6.f12943e = r7
            r6.mo15392c()
        L_0x00dd:
            return
        L_0x00de:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r5)
            r6[r2] = r7
            java.lang.String r7 = "%sWeb view controller content is not valid. Web view might have crashed"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r7, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r6 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r7 = "Web view could not be loaded"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x00f3:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r5)
            r6[r2] = r7
            java.lang.String r7 = "%sNo display config for full screen mraid ad renderer! Cannot render"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r7, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r6 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r7 = "No display config for full screen mraid"
            r6.<init>((java.lang.String) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C3638k.mo13351a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo13354b(C2776j jVar) {
        C2794u uVar = (C2794u) jVar;
        return false;
    }

    /* renamed from: c */
    public void mo13575c(boolean z) {
        if (mo13345E()) {
            return;
        }
        if (z) {
            this.f9643u.mo15344c();
        } else {
            this.f9643u.mo15341a();
        }
    }

    /* renamed from: b */
    public void mo13353b() {
        mo15284M();
    }

    /* renamed from: a */
    public long mo13350a(long j) {
        if (this.f12698F == UnitDisplayType.REWARDED) {
            return 0;
        }
        C2667h hVar = IAConfigManager.f9202J.f9234v.f9337b;
        long j2 = 13;
        String l = Long.toString(13);
        if (hVar.f9334a.containsKey("mraid_x_fallback_delay")) {
            l = hVar.f9334a.get("mraid_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public void mo13352a(C2812c.C2814b bVar) {
        this.f12701I = bVar;
    }
}
