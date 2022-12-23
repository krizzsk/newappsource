package com.fyber.inneractive.sdk.renderers;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2778l;
import com.fyber.inneractive.sdk.flow.C2794u;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C3649f;
import com.fyber.inneractive.sdk.util.C3671b0;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3724q0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: com.fyber.inneractive.sdk.renderers.g */
public class C3631g extends C2778l<C2794u, InneractiveAdViewEventsListener> implements C2811b, C3671b0.C3673b {

    /* renamed from: k */
    public long f12661k = 0;

    /* renamed from: l */
    public InneractiveAdViewUnitController f12662l;

    /* renamed from: m */
    public IAmraidWebViewController f12663m;

    /* renamed from: n */
    public C3764d.C3770f f12664n;

    /* renamed from: o */
    public boolean f12665o = false;

    /* renamed from: p */
    public ViewGroup f12666p;

    /* renamed from: q */
    public FrameLayout f12667q;

    /* renamed from: r */
    public long f12668r = 0;

    /* renamed from: s */
    public Runnable f12669s;

    /* renamed from: t */
    public int f12670t = 0;

    /* renamed from: u */
    public long f12671u = 0;

    /* renamed from: v */
    public boolean f12672v = false;

    /* renamed from: w */
    public boolean f12673w = true;

    /* renamed from: x */
    public boolean f12674x = false;

    /* renamed from: y */
    public C3623b f12675y;

    /* renamed from: com.fyber.inneractive.sdk.renderers.g$a */
    public static class C3632a extends FrameLayout {

        /* renamed from: a */
        public final float f12676a;

        public C3632a(Context context, float f) {
            super(context);
            this.f12676a = f;
        }

        public void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > 0)) {
                int size = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                float f = this.f12676a;
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            } else {
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            super.onMeasure(i3, i2);
        }
    }

    /* renamed from: E */
    public final void mo15269E() {
        if (this.f12669s != null) {
            IAlog.m9902a("%scancelling refreen runnable", IAlog.m9899a((Object) this));
            C3714n.f12902b.removeCallbacks(this.f12669s);
            this.f12669s = null;
        }
    }

    /* renamed from: F */
    public final void mo15270F() {
        C3623b bVar = this.f12675y;
        if (bVar != null) {
            bVar.mo15263c();
        }
        if (this.f12663m != null) {
            mo15269E();
            AdContent adcontent = this.f9598b;
            if (adcontent != null) {
                ((C2794u) adcontent).mo13291a();
            }
            this.f12663m = null;
            this.f9598b = null;
            ViewGroup viewGroup = this.f12666p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f12667q);
            }
        }
        this.f12672v = false;
    }

    /* renamed from: G */
    public final int mo15271G() {
        C2684r rVar;
        int intValue;
        int i = this.f12670t;
        if (i == -1) {
            IAlog.m9902a("%sreturning disable value for banner refresh", IAlog.m9899a((Object) this));
            return 0;
        }
        if (i > 0) {
            IAlog.m9902a("%sreturning overriden refresh interval = %d", IAlog.m9899a((Object) this), Integer.valueOf(this.f12670t));
            intValue = this.f12670t;
        } else {
            C2703z zVar = this.f9597a.getAdContent().f9593d;
            if (!(zVar == null || (rVar = ((C2702y) zVar).f9424c) == null)) {
                Integer num = rVar.f9367a;
                IAlog.m9902a("%sreturning refreshConfig = %d", IAlog.m9899a((Object) this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.m9902a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.m9899a((Object) this));
            return 0;
        }
        return intValue * 1000;
    }

    /* renamed from: H */
    public final void mo15272H() {
        IAmraidWebViewController iAmraidWebViewController = this.f12663m;
        if (iAmraidWebViewController != null && iAmraidWebViewController.f12957b != null) {
            IAlog.m9902a("%srefreshing ad", IAlog.m9899a((Object) this));
            if (!this.f12663m.mo15461h() || this.f12663m.mo15462i()) {
                this.f12668r = 0;
                this.f12662l.refreshAd();
            }
        }
    }

    /* renamed from: I */
    public final void mo15273I() {
        C3762c cVar;
        IAmraidWebViewController iAmraidWebViewController = this.f12663m;
        if (iAmraidWebViewController != null && (cVar = iAmraidWebViewController.f12957b) != null && cVar.getIsVisible() && this.f12668r != 0 && !this.f12663m.mo15461h() && !this.f12663m.mo15462i()) {
            if (!this.f12673w) {
                if (this.f12661k < System.currentTimeMillis() - this.f12668r) {
                    this.f12671u = 1;
                } else {
                    this.f12671u = this.f12661k - (System.currentTimeMillis() - this.f12668r);
                }
            }
            IAlog.m9902a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.m9899a((Object) this), Long.valueOf(this.f12671u));
            mo15274a(this.f12671u, false);
        }
    }

    /* renamed from: a */
    public void mo13304a() {
    }

    /* renamed from: b */
    public void mo15276b(boolean z) {
        IAlog.m9902a("%sgot onLockScreenStateChanged with: %s", IAlog.m9899a((Object) this), Boolean.valueOf(z));
        if (z) {
            mo15277d(false);
            C3623b bVar = this.f12675y;
            if (bVar != null && bVar.f12652h) {
                bVar.mo15263c();
                return;
            }
            return;
        }
        mo15273I();
        C3623b bVar2 = this.f12675y;
        if (bVar2 != null) {
            bVar2.mo15262b();
        }
    }

    public boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f12663m;
        if (iAmraidWebViewController != null) {
            return !iAmraidWebViewController.mo15461h() && !this.f12663m.mo15462i();
        }
        return true;
    }

    /* renamed from: d */
    public final void mo15277d(boolean z) {
        if (this.f12669s != null) {
            this.f12673w = z;
            mo15269E();
            this.f12671u = this.f12661k - (System.currentTimeMillis() - this.f12668r);
            IAlog.m9902a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.m9899a((Object) this), Long.valueOf(this.f12671u), Long.valueOf(this.f12661k));
        }
    }

    public void destroy() {
        mo15269E();
        mo15270F();
        this.f12664n = null;
        C3671b0.C3672a.f12828a.f12824a.remove(this);
        Runnable runnable = this.f12669s;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
        }
        super.destroy();
    }

    /* renamed from: f */
    public int mo13310f() {
        return this.f12663m.f13011O;
    }

    /* renamed from: n */
    public void mo13311n() {
    }

    /* renamed from: p */
    public int mo13312p() {
        return this.f12663m.f13012P;
    }

    /* renamed from: q */
    public void mo13313q() {
        C3762c cVar;
        IAlog.m9902a("%sgot onAdRefreshFailed", IAlog.m9899a((Object) this));
        IAmraidWebViewController iAmraidWebViewController = this.f12663m;
        if (iAmraidWebViewController != null && (cVar = iAmraidWebViewController.f12957b) != null) {
            if (!cVar.getIsVisible() || C3671b0.C3672a.f12828a.f12825b || this.f12663m.mo15461h() || this.f12663m.mo15462i()) {
                IAlog.m9902a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.m9899a((Object) this));
                this.f12671u = 1;
                return;
            }
            IAlog.m9902a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.m9899a((Object) this));
            long G = (long) mo15271G();
            this.f12661k = G;
            if (G != 0) {
                mo15274a(10000, false);
            }
        }
    }

    /* renamed from: t */
    public void mo13314t() {
        C3623b bVar = this.f12675y;
        if (bVar != null) {
            bVar.mo15263c();
        }
        FrameLayout frameLayout = this.f12667q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f12666p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f12666p = null;
        }
    }

    /* renamed from: w */
    public int mo13555w() {
        IAmraidWebViewController iAmraidWebViewController = this.f12663m;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.f12957b == null || !iAmraidWebViewController.mo15461h()) {
            return C3707l.m9968c(this.f12663m.f13012P);
        }
        return C3707l.m9968c(this.f12663m.f12957b.getHeight());
    }

    /* renamed from: x */
    public int mo13556x() {
        IAmraidWebViewController iAmraidWebViewController = this.f12663m;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.f12957b == null || !iAmraidWebViewController.mo15461h()) {
            return C3707l.m9968c(this.f12663m.f13011O);
        }
        return C3707l.m9968c(this.f12663m.f12957b.getWidth());
    }

    /* renamed from: a */
    public boolean mo13308a(C2776j jVar) {
        return jVar instanceof C2794u;
    }

    /* renamed from: a */
    public void mo13306a(ViewGroup viewGroup) {
        Application application;
        boolean z;
        C2684r rVar;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.f9597a;
        if (inneractiveAdSpot == null) {
            IAlog.m9906e("%sYou must set the spot to render before calling renderAd", IAlog.m9899a((Object) this));
            return;
        }
        this.f12665o = false;
        this.f9602f = false;
        if (viewGroup != null) {
            this.f12666p = viewGroup;
            this.f12662l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f12674x) {
            mo15270F();
            if (this.f9597a.getAdContent() instanceof C2794u) {
                this.f9598b = (C2794u) this.f9597a.getAdContent();
                this.f9601e = false;
                mo13546C();
            } else {
                IAlog.m9906e("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f9597a.getAdContent());
                return;
            }
        }
        AdContent adcontent = this.f9598b;
        C3649f fVar = null;
        IAmraidWebViewController iAmraidWebViewController = adcontent != null ? ((C2794u) adcontent).f9648g : null;
        this.f12663m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f12664n == null) {
                this.f12664n = new C3629e(this);
            }
            iAmraidWebViewController.setListener(this.f12664n);
            C2794u uVar = (C2794u) this.f9598b;
            InneractiveAdRequest inneractiveAdRequest = uVar.f9590a;
            C2703z zVar = uVar.f9593d;
            if (zVar == null || (rVar = ((C2702y) zVar).f9424c) == null || (unitDisplayType = rVar.f9368b) == null || !unitDisplayType.isFullscreenUnit()) {
                this.f12667q = new C3632a(this.f12666p.getContext(), BitmapDescriptorFactory.HUE_RED);
                C2794u uVar2 = (C2794u) this.f9598b;
                C3649f fVar2 = (C3649f) uVar2.f9591b;
                C3724q0 a = m9669a(fVar2.f12747e, fVar2.f12748f, uVar2.f9593d);
                this.f12663m.setAdDefaultSize(a.f12915a, a.f12916b);
                IAmraidWebViewController iAmraidWebViewController2 = this.f12663m;
                C3762c cVar = iAmraidWebViewController2.f12957b;
                if (cVar != null || (application = C3707l.f12893a) == null) {
                    ViewParent parent = cVar != null ? cVar.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(cVar);
                    }
                    this.f12663m.mo15407a(this.f12667q, new FrameLayout.LayoutParams(a.f12915a, a.f12916b, 17));
                    this.f12666p.addView(this.f12667q, new ViewGroup.LayoutParams(-2, -2));
                } else if (!this.f12674x) {
                    this.f12674x = true;
                    iAmraidWebViewController2.f12957b = new C3762c(application);
                    try {
                        iAmraidWebViewController2.mo15412b();
                        iAmraidWebViewController2.f12957b.loadDataWithBaseURL(iAmraidWebViewController2.f12974s, iAmraidWebViewController2.f12975t, "text/html", "utf-8", (String) null);
                        iAmraidWebViewController2.mo15415e();
                        z = true;
                    } catch (Throwable unused) {
                        z = false;
                    }
                    if (!z) {
                        mo15275a(a);
                    }
                } else {
                    mo15275a(a);
                }
            } else {
                C3632a aVar = new C3632a(this.f12666p.getContext(), 1.5f);
                this.f12667q = aVar;
                this.f12663m.mo15407a(aVar, new ViewGroup.LayoutParams(-1, -1));
                this.f12666p.addView(this.f12667q, new ViewGroup.LayoutParams(-2, -2));
            }
            AdContent adcontent2 = this.f9598b;
            if (adcontent2 != null) {
                fVar = (C3649f) ((C2794u) adcontent2).f9591b;
            }
            if (fVar != null) {
                C3623b bVar = new C3623b(fVar, this.f12667q, new C3628d(this));
                this.f12675y = bVar;
                bVar.f12653i = false;
                bVar.f12649e = 1;
                bVar.f12650f = BitmapDescriptorFactory.HUE_RED;
                int i = fVar.f12762t;
                if (i >= 1) {
                    bVar.f12649e = Math.min(i, 100);
                }
                float f = fVar.f12763u;
                if (f >= -1.0f) {
                    bVar.f12650f = f;
                }
                if (bVar.f12650f >= BitmapDescriptorFactory.HUE_RED) {
                    IAlog.m9902a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    bVar.f12648d = BitmapDescriptorFactory.HUE_RED;
                    bVar.f12651g = System.currentTimeMillis();
                    bVar.f12652h = true;
                    bVar.mo15261a();
                }
            }
        } else {
            IAlog.m9906e("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", adcontent);
        }
        C3671b0 b0Var = C3671b0.C3672a.f12828a;
        if (!b0Var.f12824a.contains(this)) {
            b0Var.f12824a.add(this);
        }
    }

    /* renamed from: a */
    public final void mo15274a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        C3762c cVar;
        if (TextUtils.isEmpty(this.f9597a.getMediationNameString()) && j != 0 && !(this.f9597a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) && this.f12670t != -1 && (iAmraidWebViewController = this.f12663m) != null && (cVar = iAmraidWebViewController.f12957b) != null) {
            if (!cVar.getIsVisible()) {
                IAlog.m9902a("%sstartRefreshTimer called but ad is not visible", IAlog.m9899a((Object) this));
                return;
            }
            this.f12668r = System.currentTimeMillis();
            this.f12661k = z ? this.f12661k : j;
            IAlog.m9902a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.m9899a((Object) this), Long.valueOf(j), Long.valueOf(this.f12661k));
            if (j > 1) {
                Runnable runnable = this.f12669s;
                if (runnable != null) {
                    C3714n.f12902b.removeCallbacks(runnable);
                }
                mo15269E();
                C3630f fVar = new C3630f(this);
                this.f12669s = fVar;
                C3714n.f12902b.postDelayed(fVar, j);
                return;
            }
            mo15272H();
        }
    }

    /* renamed from: a */
    public static C3724q0 m9669a(int i, int i2, C2703z zVar) {
        int i3;
        int i4;
        C2684r rVar;
        IAlog.m9902a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0) {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (!(zVar == null || (rVar = ((C2702y) zVar).f9424c) == null)) {
                unitDisplayType = rVar.f9368b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                i4 = C3707l.m9955a((float) Strategy.TTL_SECONDS_DEFAULT);
                i3 = C3707l.m9955a((float) 250);
            } else if (C3705k.m9953o()) {
                i4 = C3707l.m9955a((float) 728);
                i3 = C3707l.m9955a((float) 90);
            } else {
                i4 = C3707l.m9955a((float) 320);
                i3 = C3707l.m9955a((float) 50);
            }
        } else {
            i4 = C3707l.m9955a((float) i);
            i3 = C3707l.m9955a((float) i2);
        }
        IAlog.m9905d("View layout params: final scaled width and height: %d, %d", Integer.valueOf(i4), Integer.valueOf(i3));
        return new C3724q0(i4, i3);
    }

    /* renamed from: a */
    public boolean mo13307a(View view) {
        return view.equals(this.f12666p);
    }

    /* renamed from: a */
    public void mo13305a(int i) {
        this.f12670t = i;
    }

    /* renamed from: a */
    public final void mo15275a(C3724q0 q0Var) {
        FrameLayout frameLayout = new FrameLayout(this.f12666p.getContext());
        frameLayout.setBackgroundResource(C2524R.color.blank_background);
        this.f12666p.removeAllViews();
        this.f12666p.addView(frameLayout, new FrameLayout.LayoutParams(q0Var.f12915a, q0Var.f12916b, 17));
    }
}
