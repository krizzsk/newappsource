package com.fyber.inneractive.sdk.renderers;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.display.C2705b;
import com.fyber.inneractive.sdk.display.C2706c;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2778l;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2841h;
import com.fyber.inneractive.sdk.network.C2932s;
import com.fyber.inneractive.sdk.p048dv.C2707a;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.player.controller.C3017q;
import com.fyber.inneractive.sdk.player.p050ui.C3451c;
import com.fyber.inneractive.sdk.player.p050ui.C3455g;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3682e;
import com.fyber.inneractive.sdk.util.C3685f0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.renderers.h */
public class C3633h extends C2778l<C2807y, InneractiveAdViewEventsListener> implements C2811b, InneractiveNativeVideoContentController.Renderer, C3685f0.C3690e {

    /* renamed from: k */
    public FrameLayout f12677k;

    /* renamed from: l */
    public C3455g f12678l;

    /* renamed from: m */
    public C3017q f12679m;

    /* renamed from: n */
    public VideoContentListener f12680n;

    /* renamed from: o */
    public final C2948c.C2951c f12681o = new C3634a();

    /* renamed from: p */
    public ViewGroup f12682p;

    /* renamed from: q */
    public C3643n f12683q;

    /* renamed from: r */
    public float f12684r = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: s */
    public Rect f12685s = new Rect();

    /* renamed from: t */
    public Runnable f12686t;

    /* renamed from: u */
    public boolean f12687u = false;

    /* renamed from: v */
    public final C3017q.C3018a f12688v = new C3635b();

    /* renamed from: com.fyber.inneractive.sdk.renderers.h$a */
    public class C3634a implements C2948c.C2951c {
        public C3634a() {
        }

        /* renamed from: a */
        public void mo13751a(C2948c cVar) {
            C3017q qVar = C3633h.this.f12679m;
            if (qVar != null) {
                qVar.mo13829d(false);
                C3633h.this.f12679m.mo13831f();
            }
        }
    }

    /* renamed from: E */
    public final void mo15279E() {
        ViewGroup viewGroup;
        Runnable runnable = this.f12686t;
        if (runnable != null && (viewGroup = this.f12682p) != null) {
            viewGroup.removeCallbacks(runnable);
            this.f12686t = null;
        }
    }

    /* renamed from: a */
    public void mo13305a(int i) {
    }

    public void destroy() {
        mo13314t();
        super.destroy();
    }

    /* renamed from: f */
    public int mo13310f() {
        return 0;
    }

    /* renamed from: n */
    public void mo13311n() {
        C3017q qVar = this.f12679m;
        if (qVar != null) {
            qVar.mo13829d(false);
        }
    }

    /* renamed from: p */
    public int mo13312p() {
        return 0;
    }

    public void pauseVideo() {
        C3017q qVar = this.f12679m;
        if (qVar != null) {
            qVar.pauseVideo();
        }
    }

    public void playVideo() {
        C3017q qVar = this.f12679m;
        if (qVar != null) {
            qVar.mo13826b(0);
        }
    }

    /* renamed from: q */
    public void mo13313q() {
    }

    /* renamed from: t */
    public void mo13314t() {
        mo15279E();
        C3685f0.C3689d.f12862a.mo15351a(this.f12682p);
        IAlog.m9902a("%sunbind called. root is %s", IAlog.m9899a((Object) this), this.f12682p);
        if (this.f12679m != null) {
            IAlog.m9902a("%sdestroying video ui controller", IAlog.m9899a((Object) this));
            this.f12679m.mo13825a(null);
            this.f12679m.destroy();
            this.f12679m = null;
        }
        if (this.f12678l != null) {
            this.f12682p.setLayoutTransition((LayoutTransition) null);
            this.f12682p.removeView(this.f12677k);
            this.f12678l.destroy();
            this.f12678l = null;
        }
    }

    /* renamed from: a */
    public boolean mo13308a(C2776j jVar) {
        return jVar instanceof C2807y;
    }

    /* renamed from: a */
    public void mo13306a(ViewGroup viewGroup) {
        Bitmap bitmap;
        InneractiveAdSpot inneractiveAdSpot = this.f9597a;
        if (inneractiveAdSpot == null) {
            IAlog.m9906e("%sYou must set the spot to render before calling renderAd", IAlog.m9899a((Object) this));
            return;
        }
        this.f12682p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.m9906e("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.m9899a((Object) this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.f12680n = (VideoContentListener) ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.m9906e("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m9899a((Object) this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.f12687u = false;
        this.f12677k = new FrameLayout(viewGroup.getContext());
        C3430i iVar = ((C2807y) this.f9598b).f9675g;
        Context context = viewGroup.getContext();
        if (iVar != null) {
            ((C3423f) iVar.f12252f).getClass();
            C3622a aVar = new C3622a(iVar);
            this.f12683q = aVar;
            this.f12678l = aVar.mo15258a(context);
            this.f12679m = (C3017q) this.f12683q.mo15257a(this.f9597a, (C2807y) this.f9598b);
            this.f12682p.addView(this.f12677k, new ViewGroup.LayoutParams(-1, -2));
            this.f12682p.setLayoutTransition((LayoutTransition) null);
            this.f12677k.addView((View) this.f12678l, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f12679m.mo13825a(this.f12688v);
            this.f12679m.mo13829d(this.f12683q.mo15260a());
            this.f12683q.mo15259a(this.f12681o);
            if ((this.f12683q instanceof C3622a) && (bitmap = ((C3423f) iVar.f12252f).f10093l) != null) {
                this.f12679m.mo13824a(bitmap);
            }
            C3685f0 f0Var = C3685f0.C3689d.f12862a;
            ViewGroup viewGroup2 = this.f12682p;
            f0Var.getClass();
            f0Var.mo15349a(viewGroup2.getContext(), (View) viewGroup2, (C3685f0.C3690e) this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.h$b */
    public class C3635b implements C3017q.C3018a {
        public C3635b() {
        }

        /* renamed from: a */
        public void mo13941a(String str, String str2) {
            C3633h hVar = C3633h.this;
            hVar.getClass();
            IAlog.m9902a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.m9899a((Object) hVar));
            ViewGroup viewGroup = C3633h.this.f12682p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C3633h hVar2 = C3633h.this;
                if (!hVar2.f12687u) {
                    C2932s.m7255a(hVar2.f12682p.getContext(), str, str2, C3633h.this.f9598b);
                    boolean unused = C3633h.this.f12687u = true;
                    C3633h hVar3 = C3633h.this;
                    hVar3.getClass();
                    IAlog.m9902a("%s reporting auto redirect", IAlog.m9899a((Object) hVar3));
                    return;
                }
                IAlog.m9902a("%s redirect already reported for this ad", IAlog.m9899a((Object) hVar2));
            }
        }

        /* renamed from: a */
        public void mo13942a(boolean z) {
        }

        /* renamed from: a */
        public void mo13943a(boolean z, Orientation orientation) {
        }

        /* renamed from: c */
        public void mo13922c() {
            Object obj;
            C3633h hVar = C3633h.this;
            EventsListener eventslistener = hVar.f9599c;
            if (eventslistener != null) {
                ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(hVar.f9597a);
            }
            ViewGroup viewGroup = C3633h.this.f12682p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C3633h hVar2 = C3633h.this;
                if (hVar2.f9598b instanceof C2707a) {
                    obj = new C2705b();
                } else {
                    obj = new C2706c();
                }
                if (obj instanceof C2706c) {
                    C2706c cVar = (C2706c) obj;
                    Context context = hVar2.f12682p.getContext();
                    InneractiveAdSpot inneractiveAdSpot = C3633h.this.f9597a;
                    Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                    intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    try {
                        IAlog.m9902a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m9899a((Object) context), inneractiveAdSpot.getLocalUniqueId());
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        IAlog.m9904c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m9899a((Object) context));
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo13944e() {
        }

        /* renamed from: g */
        public void mo13945g() {
            T t;
            C2836c cVar;
            C2841h hVar;
            AdContent adcontent = C3633h.this.f9598b;
            if (adcontent != null) {
                C2807y yVar = (C2807y) adcontent;
                if (yVar.f9590a != null && (t = yVar.f9591b) != null) {
                    String str = null;
                    C2835b bVar = ((C3650g) t).f12771C;
                    if (!(bVar == null || (cVar = bVar.f9743g) == null || (hVar = cVar.f9747b) == null)) {
                        str = hVar.toString();
                    }
                    C3633h.this.mo13552a(str);
                }
            }
        }

        /* renamed from: h */
        public void mo13946h() {
        }

        /* renamed from: j */
        public void mo13947j() {
            C3633h.this.mo13550a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        }

        /* renamed from: k */
        public void mo13948k() {
        }

        /* renamed from: l */
        public void mo13949l() {
            C3633h hVar = C3633h.this;
            C2807y yVar = (C2807y) hVar.f9598b;
            if (!yVar.f9676h) {
                yVar.f9676h = true;
                hVar.mo13544A();
            }
        }

        public void onCompleted() {
            C3455g gVar;
            C3633h hVar = C3633h.this;
            VideoContentListener videoContentListener = hVar.f12680n;
            if (videoContentListener != null && (gVar = hVar.f12678l) != null && ((C3451c) gVar).f12319e) {
                videoContentListener.onCompleted();
            }
        }

        public void onPlayerError() {
            C3455g gVar;
            C3633h hVar = C3633h.this;
            VideoContentListener videoContentListener = hVar.f12680n;
            if (videoContentListener != null && (gVar = hVar.f12678l) != null && ((C3451c) gVar).f12319e) {
                videoContentListener.onPlayerError();
            }
        }

        public void onProgress(int i, int i2) {
            C3455g gVar;
            C3633h hVar = C3633h.this;
            VideoContentListener videoContentListener = hVar.f12680n;
            if (videoContentListener != null && (gVar = hVar.f12678l) != null && ((C3451c) gVar).f12319e) {
                videoContentListener.onProgress(i, i2);
            }
        }

        /* renamed from: r */
        public void mo13953r() {
            C3633h hVar = C3633h.this;
            if (hVar.f9599c != null) {
                hVar.mo13558z();
            }
        }

        /* renamed from: a */
        public void mo13940a(View view, String str) {
            if (view != null && view.getContext() != null) {
                InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
                C3633h.this.mo13558z();
            }
        }

        /* renamed from: a */
        public C3677d0.C3678a mo13938a(C3721p0 p0Var, C3682e eVar) {
            Context context;
            C3633h hVar = C3633h.this;
            if (hVar.f12678l.getContext() == null) {
                context = C3707l.f12893a;
            } else {
                context = C3633h.this.f12678l.getContext();
            }
            AdContent adcontent = C3633h.this.f9598b;
            return hVar.mo13548a(context, adcontent != null ? ((C2807y) adcontent).mo13597f() : null, p0Var, eVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r0 = (r0 = r0.f9743g).f9747b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fyber.inneractive.sdk.util.C3677d0.C3678a mo13939a(java.lang.String r4, com.fyber.inneractive.sdk.util.C3721p0 r5) {
            /*
                r3 = this;
                com.fyber.inneractive.sdk.renderers.h r0 = com.fyber.inneractive.sdk.renderers.C3633h.this
                AdContent r0 = r0.f9598b
                r1 = 0
                if (r0 == 0) goto L_0x002a
                com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.C2807y) r0
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r0.f9590a
                if (r2 == 0) goto L_0x002a
                T r0 = r0.f9591b
                if (r0 == 0) goto L_0x002a
                com.fyber.inneractive.sdk.response.g r0 = (com.fyber.inneractive.sdk.response.C3650g) r0
                com.fyber.inneractive.sdk.model.vast.b r0 = r0.f12771C
                if (r0 == 0) goto L_0x0024
                com.fyber.inneractive.sdk.model.vast.c r0 = r0.f9743g
                if (r0 == 0) goto L_0x0024
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f9747b
                if (r0 == 0) goto L_0x0024
                java.lang.String r0 = r0.toString()
                goto L_0x0025
            L_0x0024:
                r0 = r1
            L_0x0025:
                com.fyber.inneractive.sdk.renderers.h r2 = com.fyber.inneractive.sdk.renderers.C3633h.this
                r2.mo13552a((java.lang.String) r0)
            L_0x002a:
                android.app.Application r0 = com.fyber.inneractive.sdk.util.C3707l.f12893a
                com.fyber.inneractive.sdk.renderers.h r2 = com.fyber.inneractive.sdk.renderers.C3633h.this
                android.view.ViewGroup r2 = r2.f12682p
                if (r2 == 0) goto L_0x0040
                android.content.Context r2 = r2.getContext()
                if (r2 == 0) goto L_0x0040
                com.fyber.inneractive.sdk.renderers.h r0 = com.fyber.inneractive.sdk.renderers.C3633h.this
                android.view.ViewGroup r0 = r0.f12682p
                android.content.Context r0 = r0.getContext()
            L_0x0040:
                boolean r2 = android.text.TextUtils.isEmpty(r4)
                if (r2 == 0) goto L_0x0062
                com.fyber.inneractive.sdk.renderers.h r4 = com.fyber.inneractive.sdk.renderers.C3633h.this
                AdContent r4 = r4.f9598b
                com.fyber.inneractive.sdk.flow.y r4 = (com.fyber.inneractive.sdk.flow.C2807y) r4
                T r2 = r4.f9591b
                if (r2 == 0) goto L_0x0061
                com.fyber.inneractive.sdk.response.g r2 = (com.fyber.inneractive.sdk.response.C3650g) r2
                com.fyber.inneractive.sdk.model.vast.b r2 = r2.f12771C
                com.fyber.inneractive.sdk.model.vast.c r2 = r2.f9743g
                if (r2 == 0) goto L_0x005a
                java.lang.String r1 = r2.f9752g
            L_0x005a:
                if (r1 != 0) goto L_0x0061
                java.lang.String r4 = r4.mo13597f()
                goto L_0x0062
            L_0x0061:
                r4 = r1
            L_0x0062:
                com.fyber.inneractive.sdk.renderers.h r1 = com.fyber.inneractive.sdk.renderers.C3633h.this
                com.fyber.inneractive.sdk.util.e r2 = com.fyber.inneractive.sdk.util.C3682e.VAST_ENDCARD
                com.fyber.inneractive.sdk.util.d0$a r4 = r1.mo13548a(r0, r4, r5, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C3633h.C3635b.mo13939a(java.lang.String, com.fyber.inneractive.sdk.util.p0):com.fyber.inneractive.sdk.util.d0$a");
        }
    }

    /* renamed from: a */
    public void mo15280a(View view, float f, Rect rect) {
        if (this.f12684r != f || !this.f12685s.equals(rect)) {
            this.f12684r = f;
            this.f12685s.set(rect);
            C3017q qVar = this.f12679m;
            if (qVar != null) {
                qVar.mo13875b(false);
                ((C3451c) this.f12678l).mo14676b();
                this.f12679m.mo13874a(f);
            }
            if (f > BitmapDescriptorFactory.HUE_RED) {
                mo15279E();
                C3636i iVar = new C3636i(this);
                this.f12686t = iVar;
                this.f12682p.postDelayed(iVar, 100);
                return;
            }
            mo15279E();
        }
    }

    /* renamed from: a */
    public boolean mo13307a(View view) {
        return view.equals(this.f12682p);
    }

    /* renamed from: a */
    public void mo13304a() {
        C3017q qVar = this.f12679m;
        if (qVar != null) {
            qVar.mo13873a();
        }
    }
}
