package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RelativeLayout;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.C2633g;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2648i;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C2786p;
import com.fyber.inneractive.sdk.flow.C2790s;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2840g;
import com.fyber.inneractive.sdk.model.vast.C2841h;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.network.C2932s;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.player.controller.C2989b;
import com.fyber.inneractive.sdk.player.controller.C3020s;
import com.fyber.inneractive.sdk.player.p050ui.C3455g;
import com.fyber.inneractive.sdk.player.p050ui.C3457i;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3668a;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3682e;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.renderers.m */
public class C3641m extends C2790s implements C3020s {

    /* renamed from: A */
    public boolean f12709A = false;

    /* renamed from: B */
    public boolean f12710B = false;

    /* renamed from: C */
    public boolean f12711C = false;

    /* renamed from: D */
    public C2812c.C2814b f12712D;

    /* renamed from: E */
    public UnitDisplayType f12713E = UnitDisplayType.INTERSTITIAL;

    /* renamed from: F */
    public C3643n f12714F;

    /* renamed from: G */
    public final C2948c.C2951c f12715G = new C3642a();

    /* renamed from: H */
    public final RelativeLayout.LayoutParams f12716H = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: I */
    public boolean f12717I = false;

    /* renamed from: J */
    public boolean f12718J = false;

    /* renamed from: w */
    public C2812c.C2813a f12719w;

    /* renamed from: x */
    public C3455g f12720x;

    /* renamed from: y */
    public C2989b f12721y;

    /* renamed from: z */
    public WeakReference<InneractiveFullscreenVideoContentController> f12722z;

    /* renamed from: com.fyber.inneractive.sdk.renderers.m$a */
    public class C3642a implements C2948c.C2951c {
        public C3642a() {
        }

        /* renamed from: a */
        public void mo13751a(C2948c cVar) {
            C3641m.this.f12721y.mo13829d(false);
            C3641m.this.f12721y.mo13831f();
        }
    }

    /* renamed from: E */
    public boolean mo13345E() {
        return this.f12717I;
    }

    /* renamed from: G */
    public int mo13346G() {
        C2666s sVar;
        Integer b;
        Class cls = C2648i.class;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (sVar = ((C2807y) adcontent).f9592c) == null || sVar.mo13264a(cls) == null || (b = ((C2648i) ((C2807y) this.f9598b).f9592c.mo13264a(cls)).mo13240b("close_clickable_area_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: H */
    public int mo13347H() {
        C2666s sVar;
        Integer b;
        Class cls = C2648i.class;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (sVar = ((C2807y) adcontent).f9592c) == null || sVar.mo13264a(cls) == null || (b = ((C2648i) ((C2807y) this.f9598b).f9592c.mo13264a(cls)).mo13240b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo13348I() {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.i r1 = r0.f9234v
            com.fyber.inneractive.sdk.config.h r1 = r1.f9337b
            java.lang.String r2 = "endcard"
            com.fyber.inneractive.sdk.config.f r1 = r1.mo13272a((java.lang.String) r2)
            r1.getClass()
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f9286a
            java.lang.String r3 = "endcard_cr"
            boolean r2 = r2.containsKey(r3)
            r4 = 1
            java.lang.String r5 = "endcard_ci"
            r6 = 3
            if (r2 != 0) goto L_0x0097
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f9286a
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0028
            goto L_0x0097
        L_0x0028:
            com.fyber.inneractive.sdk.config.i r0 = r0.f9234v
            com.fyber.inneractive.sdk.config.h r0 = r0.f9337b
            java.lang.String r1 = "vast_endcard_x_delay"
            java.lang.String r2 = java.lang.Long.toString(r6)
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f9334a
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0044
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f9334a
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0044:
            long r6 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            AdContent r0 = r8.f9598b
            if (r0 == 0) goto L_0x00c5
            com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.C2807y) r0
            T r1 = r0.f9591b
            if (r1 == 0) goto L_0x00c5
            com.fyber.inneractive.sdk.response.g r1 = (com.fyber.inneractive.sdk.response.C3650g) r1
            com.fyber.inneractive.sdk.model.vast.b r1 = r1.f12771C
            if (r1 == 0) goto L_0x00c5
            com.fyber.inneractive.sdk.model.vast.c r1 = r1.f9743g
            if (r1 == 0) goto L_0x00c5
            com.fyber.inneractive.sdk.model.vast.g r1 = r1.f9746a
            com.fyber.inneractive.sdk.model.vast.g r2 = com.fyber.inneractive.sdk.model.vast.C2840g.Static
            if (r1 != r2) goto L_0x00c5
            com.fyber.inneractive.sdk.config.global.s r0 = r0.f9592c
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r1 = com.fyber.inneractive.sdk.config.global.features.C2649j.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.mo13264a(r1)
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.C2649j) r0
            if (r0 == 0) goto L_0x008e
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r8.f12713E
            int[] r2 = com.fyber.inneractive.sdk.config.global.features.C2649j.C2650a.f9305a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r4) goto L_0x0087
            r2 = 2
            if (r1 == r2) goto L_0x0080
            goto L_0x008e
        L_0x0080:
            java.lang.String r1 = "endcard_x_btn_delay_iv"
            java.lang.Integer r0 = r0.mo13240b(r1)
            goto L_0x008f
        L_0x0087:
            java.lang.String r1 = "endcard_x_btn_delay_rv"
            java.lang.Integer r0 = r0.mo13240b(r1)
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            if (r0 == 0) goto L_0x00c5
            int r0 = r0.intValue()
            long r6 = (long) r0
            goto L_0x00c5
        L_0x0097:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r8.f12713E
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r2) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r3 = r5
        L_0x009f:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f9286a     // Catch:{ Exception -> 0x00b4 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00b5
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f9286a     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b4 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00b6
        L_0x00b4:
        L_0x00b5:
            r0 = r6
        L_0x00b6:
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            r2 = 5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x00c5
            r8.f9642t = r4
            r6 = r0
        L_0x00c5:
            com.fyber.inneractive.sdk.player.controller.b r0 = r8.f12721y
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x00d0
            long r3 = r6 * r1
            r0.mo13823a((long) r3)
        L_0x00d0:
            long r6 = r6 * r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C3641m.mo13348I():long");
    }

    /* renamed from: J */
    public boolean mo13349J() {
        C3455g gVar = this.f12720x;
        return gVar != null && ((C3457i) gVar).mo14699d();
    }

    /* renamed from: L */
    public void mo15285L() {
        if (!this.f12710B && this.f9599c != null) {
            this.f12710B = true;
            C2812c.C2813a aVar = this.f12719w;
            if (aVar != null && aVar.wasDismissedByUser()) {
                mo15287a(C2850q.EVENT_CLOSE);
                mo15287a(C2850q.EVENT_CLOSE_LINEAR);
            }
            ((InneractiveFullscreenAdEventsListener) this.f9599c).onAdDismissed(this.f9597a);
        }
    }

    /* renamed from: M */
    public final void mo15286M() {
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

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13351a(com.fyber.inneractive.sdk.interfaces.C2812c.C2813a r5, android.app.Activity r6) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        /*
            r4 = this;
            super.mo13351a((com.fyber.inneractive.sdk.interfaces.C2812c.C2813a) r5, (android.app.Activity) r6)
            r4.f12719w = r5
            r5 = 0
            r4.f12709A = r5
            r4.f12710B = r5
            r4.f12718J = r5
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f9597a
            com.fyber.inneractive.sdk.external.InneractiveUnitController r6 = r6.getSelectedUnitController()
            r0 = 1
            if (r6 == 0) goto L_0x0053
            boolean r1 = r6 instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController
            if (r1 != 0) goto L_0x0027
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r4)
            r6[r5] = r1
            java.lang.String r1 = "%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r1, r6)
            goto L_0x0053
        L_0x0027:
            com.fyber.inneractive.sdk.external.InneractiveContentController r6 = r6.getSelectedContentController()
            if (r6 == 0) goto L_0x0053
            boolean r1 = r6 instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController
            if (r1 == 0) goto L_0x003b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController r6 = (com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) r6
            r1.<init>(r6)
            r4.f12722z = r1
            goto L_0x0053
        L_0x003b:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r4)
            r1[r5] = r2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r0] = r6
            java.lang.String r6 = "%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r6, r1)
        L_0x0053:
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f9597a
            com.fyber.inneractive.sdk.flow.j r6 = r6.getAdContent()
            com.fyber.inneractive.sdk.config.z r6 = r6.f9593d
            if (r6 == 0) goto L_0x0067
            com.fyber.inneractive.sdk.config.y r6 = (com.fyber.inneractive.sdk.config.C2702y) r6
            com.fyber.inneractive.sdk.config.a0 r6 = r6.f9427f
            if (r6 == 0) goto L_0x0067
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r6.f9256j
            r4.f12713E = r6
        L_0x0067:
            AdContent r6 = r4.f9598b
            com.fyber.inneractive.sdk.flow.y r6 = (com.fyber.inneractive.sdk.flow.C2807y) r6
            com.fyber.inneractive.sdk.player.i r6 = r6.f9675g
            com.fyber.inneractive.sdk.interfaces.c$a r1 = r4.f12719w
            android.view.ViewGroup r1 = r1.getLayout()
            android.content.Context r1 = r1.getContext()
            if (r6 == 0) goto L_0x00f8
            com.fyber.inneractive.sdk.player.a$a r2 = r6.f12252f
            if (r2 == 0) goto L_0x008b
            r3 = r2
            com.fyber.inneractive.sdk.player.f r3 = (com.fyber.inneractive.sdk.player.C3423f) r3
            com.fyber.inneractive.sdk.player.controller.g r3 = r3.f10083b
            if (r3 == 0) goto L_0x0086
            r3 = 1
            goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            if (r3 == 0) goto L_0x008b
            r3 = 1
            goto L_0x008c
        L_0x008b:
            r3 = 0
        L_0x008c:
            if (r3 == 0) goto L_0x00e3
            com.fyber.inneractive.sdk.player.f r2 = (com.fyber.inneractive.sdk.player.C3423f) r2
            r2.getClass()
            com.fyber.inneractive.sdk.renderers.c r5 = new com.fyber.inneractive.sdk.renderers.c
            r5.<init>(r6)
            r4.f12714F = r5
            com.fyber.inneractive.sdk.player.ui.g r5 = r5.mo15266a((android.content.Context) r1)
            r4.f12720x = r5
            com.fyber.inneractive.sdk.renderers.n r5 = r4.f12714F
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f9597a
            AdContent r1 = r4.f9598b
            com.fyber.inneractive.sdk.flow.y r1 = (com.fyber.inneractive.sdk.flow.C2807y) r1
            com.fyber.inneractive.sdk.player.controller.b r5 = r5.mo15257a(r6, r1)
            r4.f12721y = r5
            com.fyber.inneractive.sdk.renderers.n r6 = r4.f12714F
            boolean r6 = r6.mo15260a()
            r5.mo13829d(r6)
            com.fyber.inneractive.sdk.player.controller.b r5 = r4.f12721y
            r5.mo13825a(r4)
            com.fyber.inneractive.sdk.player.ui.g r5 = r4.f12720x
            com.fyber.inneractive.sdk.player.ui.c r5 = (com.fyber.inneractive.sdk.player.p050ui.C3451c) r5
            r5.mo14676b()
            android.widget.RelativeLayout$LayoutParams r5 = r4.f12716H
            r6 = 13
            r5.addRule(r6)
            com.fyber.inneractive.sdk.interfaces.c$a r5 = r4.f12719w
            android.view.ViewGroup r5 = r5.getLayout()
            com.fyber.inneractive.sdk.player.ui.g r6 = r4.f12720x
            android.view.View r6 = (android.view.View) r6
            android.widget.RelativeLayout$LayoutParams r1 = r4.f12716H
            r5.addView(r6, r1)
            com.fyber.inneractive.sdk.renderers.n r5 = r4.f12714F
            com.fyber.inneractive.sdk.player.c$c r6 = r4.f12715G
            r5.mo15259a(r6)
            r4.f12709A = r0
            goto L_0x00f8
        L_0x00e3:
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r4)
            r6[r5] = r0
            java.lang.String r5 = "%sFull screen video ad renderer is not valid."
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r5, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r5 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r6 = "Full screen video could not be loaded"
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C3641m.mo13351a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    /* renamed from: b */
    public void mo13353b() {
    }

    /* renamed from: c */
    public void mo13575c(boolean z) {
        boolean z2;
        C3455g gVar = this.f12720x;
        if (gVar == null || !((C3457i) gVar).mo14699d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && this.f12717I) {
            return;
        }
        if (z) {
            this.f9643u.mo15344c();
        } else {
            this.f9643u.mo15341a();
        }
    }

    public void destroy() {
        C2812c.C2813a aVar = this.f12719w;
        if (aVar != null) {
            aVar.destroy();
        }
        if (this.f12709A) {
            mo15285L();
        }
        C2989b bVar = this.f12721y;
        if (bVar != null) {
            bVar.destroy();
            this.f12721y = null;
        }
        C3455g gVar = this.f12720x;
        if (gVar != null) {
            gVar.destroy();
            this.f12720x = null;
        }
        this.f12719w = null;
        this.f12722z = null;
        super.destroy();
    }

    /* renamed from: e */
    public void mo13944e() {
        if (!this.f12711C) {
            this.f9643u.mo15342a(true);
        }
        this.f12711C = true;
    }

    /* renamed from: g */
    public void mo13945g() {
        C2836c cVar;
        C2841h hVar;
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            C2807y yVar = (C2807y) adcontent;
            if (yVar.f9590a != null && yVar.f9591b != null) {
                String str = null;
                mo15286M();
                C2835b bVar = ((C3650g) ((C2807y) this.f9598b).f9591b).f12771C;
                if (!(bVar == null || (cVar = bVar.f9743g) == null || (hVar = cVar.f9747b) == null)) {
                    str = hVar.toString();
                }
                mo13552a(str);
            }
        }
    }

    /* renamed from: h */
    public void mo13946h() {
        this.f12717I = true;
        CountDownTimer countDownTimer = this.f9644v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f9644v = null;
        }
        if (!this.f9641s) {
            this.f9641s = true;
            C2812c.C2813a aVar = this.f12719w;
            if (aVar != null) {
                mo13576d(aVar.isCloseButtonDisplay());
            }
        }
        C2812c.C2813a aVar2 = this.f12719w;
        if (aVar2 != null && aVar2.isCloseButtonDisplay()) {
            mo13577e(true);
        }
    }

    /* renamed from: j */
    public void mo13947j() {
        C2812c.C2813a aVar = this.f12719w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        mo13550a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: k */
    public void mo13948k() {
        C2812c.C2813a aVar = this.f12719w;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: l */
    public void mo13949l() {
        C2608b bVar;
        C2628d0 d0Var = IAConfigManager.f9202J.f9236x;
        if (this.f12713E == UnitDisplayType.INTERSTITIAL) {
            bVar = C2608b.INTERSTITIAL_VIDEO;
        } else {
            bVar = C2608b.REWARDED_VIDEO;
        }
        d0Var.mo13211a(bVar, C2607a.IMPRESSION);
        mo13544A();
    }

    /* renamed from: m */
    public void mo13355m() {
        mo15285L();
        InneractiveAdSpot inneractiveAdSpot = this.f9597a;
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C2786p)) {
            ((C2786p) inneractiveAdSpot).mo13559a();
        }
    }

    /* renamed from: o */
    public void mo13578o() {
        super.mo13578o();
        this.f9643u.mo15343b();
    }

    public void onCompleted() {
        C2608b bVar;
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C3727s.m9987a(this.f12722z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        C2628d0 d0Var = IAConfigManager.f9202J.f9236x;
        UnitDisplayType unitDisplayType = this.f12713E;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        if (unitDisplayType == unitDisplayType2) {
            bVar = C2608b.REWARDED_VIDEO;
        } else {
            bVar = C2608b.INTERSTITIAL_VIDEO;
        }
        d0Var.mo13211a(bVar, C2607a.COMPLETION);
        if (this.f12713E == unitDisplayType2) {
            C2812c.C2814b bVar2 = this.f12712D;
            if (bVar2 != null) {
                ((InneractiveFullscreenUnitController.C2748a) bVar2).mo13474a();
            }
            mo13547D();
        }
        AdContent adcontent = this.f9598b;
        if (adcontent != null && ((C2807y) adcontent).f9675g != null) {
            mo13573F();
        }
    }

    public void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C3727s.m9987a(this.f12722z);
        C2812c.C2813a aVar = this.f12719w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    public void onProgress(int i, int i2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C3727s.m9987a(this.f12722z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    /* renamed from: r */
    public void mo13953r() {
        mo13558z();
    }

    /* renamed from: s */
    public void mo13579s() {
        super.mo13579s();
        C3668a aVar = this.f9643u;
        if (aVar.f12818b) {
            aVar.f12821e = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public boolean mo13356u() {
        C3430i iVar;
        C2989b bVar;
        C2812c.C2813a aVar;
        C3455g gVar;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (iVar = ((C2807y) adcontent).f9675g) == null || (bVar = this.f12721y) == null || (aVar = this.f12719w) == null || (gVar = this.f12720x) == null) {
            return false;
        }
        ((C3423f) iVar.f12252f).getClass();
        if (((C3457i) gVar).mo14699d()) {
            if (!this.f9638p) {
                return true;
            }
            aVar.dismissAd(true);
            return true;
        } else if (!bVar.mo13828c()) {
            return true;
        } else {
            bVar.mo13827c(true);
            return true;
        }
    }

    /* renamed from: a */
    public void mo13352a(C2812c.C2814b bVar) {
        this.f12712D = bVar;
    }

    /* renamed from: a */
    public C3677d0.C3678a mo13938a(C3721p0 p0Var, C3682e eVar) {
        Context context;
        mo15286M();
        if (this.f12720x.getContext() == null) {
            context = C3707l.f12893a;
        } else {
            context = this.f12720x.getContext();
        }
        AdContent adcontent = this.f9598b;
        return mo13548a(context, adcontent != null ? ((C2807y) adcontent).mo13597f() : null, p0Var, eVar);
    }

    /* renamed from: a */
    public void mo13943a(boolean z, Orientation orientation) {
        C2812c.C2813a aVar = this.f12719w;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public void mo13941a(String str, String str2) {
        IAlog.m9902a(IAlog.m9899a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        C2812c.C2813a aVar = this.f12719w;
        if (aVar != null && aVar.getLayout() != null && this.f12719w.getLayout().getContext() != null) {
            if (!this.f12718J) {
                C2932s.m7255a(this.f12719w.getLayout().getContext(), str, str2, this.f9598b);
                this.f12718J = true;
                IAlog.m9902a(IAlog.m9899a((Object) this) + "reporting auto redirect", new Object[0]);
                return;
            }
            IAlog.m9902a(IAlog.m9899a((Object) this) + "redirect already reported for this ad", new Object[0]);
        }
    }

    /* renamed from: a */
    public C3677d0.C3678a mo13939a(String str, C3721p0 p0Var) {
        T t;
        Context context;
        C2841h hVar;
        AdContent adcontent = this.f9598b;
        if (!(adcontent == null || (t = ((C2807y) adcontent).f9591b) == null || t == null)) {
            C2835b bVar = ((C3650g) t).f12771C;
            mo15286M();
            if (bVar != null) {
                C2836c cVar = bVar.f9743g;
                String str2 = null;
                if (!(cVar == null || (hVar = cVar.f9747b) == null)) {
                    str2 = hVar.toString();
                }
                mo13552a(str2);
                C3682e eVar = cVar == null ? C3682e.DEFAULT_ENDCARD : C3682e.VAST_ENDCARD;
                if (this.f12720x.getContext() == null) {
                    context = C3707l.f12893a;
                } else {
                    context = this.f12720x.getContext();
                }
                C3677d0.C3678a a = mo13548a(context, str, p0Var, eVar);
                if (!(cVar == null || a.f12835a == C3677d0.C3680c.FAILED)) {
                    C2850q qVar = C2850q.EVENT_IMPRESSION;
                    String[] strArr = {"EVENT_CLICK"};
                    C3430i iVar = ((C2807y) this.f9598b).f9675g;
                    if (iVar != null) {
                        iVar.mo14628a("EVENT_TRACKING", strArr);
                    }
                }
                return a;
            }
        }
        return new C3677d0.C3678a(C3677d0.C3680c.FAILED, new Exception("Internal SDK Error"), StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
    }

    /* renamed from: a */
    public void mo13942a(boolean z) {
        C3430i iVar;
        C2812c.C2813a aVar;
        AdContent adcontent = this.f9598b;
        if (adcontent != null && (iVar = ((C2807y) adcontent).f9675g) != null) {
            iVar.mo14628a("TRACKING_COMPLETED", new String[0]);
            mo13573F();
            String[] strArr = new String[0];
            C3430i iVar2 = ((C2807y) this.f9598b).f9675g;
            if (iVar2 != null) {
                iVar2.mo14628a("TRACKING_COMPLETED", strArr);
            }
            if (!IAConfigManager.f9202J.f9234v.f9337b.mo13272a("endcard").mo13228a("dsos", false) || !z || (aVar = this.f12719w) == null) {
                mo13575c(z);
            } else {
                aVar.dismissAd(true);
            }
        }
    }

    /* renamed from: a */
    public void mo13940a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo13558z();
        }
    }

    /* renamed from: a */
    public boolean mo13354b(C2807y yVar) {
        C2633g gVar;
        T t;
        C2835b bVar;
        C2836c cVar;
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        C2667h hVar = iAConfigManager.f9234v.f9337b;
        hVar.getClass();
        String str = iAConfigManager.f9216d;
        if (hVar.f9335b.containsKey(str)) {
            gVar = hVar.f9335b.get(str);
        } else {
            gVar = new C2633g();
        }
        if (gVar.f9287a.containsKey("endcard") || (t = yVar.f9591b) == null || (bVar = ((C3650g) t).f12771C) == null || (cVar = bVar.f9743g) == null || cVar.f9746a != C2840g.Static) {
            return false;
        }
        C2649j jVar = (C2649j) yVar.f9592c.mo13264a(C2649j.class);
        UnitDisplayType unitDisplayType = this.f12713E;
        jVar.getClass();
        int i = C2649j.C2650a.f9305a[unitDisplayType.ordinal()];
        if (i == 1) {
            return jVar.mo13239a("countdown_rv", false);
        }
        if (i != 2) {
            return false;
        }
        return jVar.mo13239a("countdown_iv", false);
    }

    /* renamed from: a */
    public long mo13350a(long j) {
        if (this.f9642t) {
            return j;
        }
        C2667h hVar = IAConfigManager.f9202J.f9234v.f9337b;
        long j2 = 12;
        String l = Long.toString(12);
        if (hVar.f9334a.containsKey("vast_endcard_x_fallback_delay")) {
            l = hVar.f9334a.get("vast_endcard_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public void mo15287a(C2850q qVar) {
        C3430i iVar;
        AdContent adcontent = this.f9598b;
        if (adcontent != null && (iVar = ((C2807y) adcontent).f9675g) != null) {
            iVar.mo14628a("EVENT_TRACKING", qVar.f9827a);
        }
    }
}
