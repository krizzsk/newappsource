package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.factories.C2751a;
import com.fyber.inneractive.sdk.factories.C2757c;
import com.fyber.inneractive.sdk.flow.C2780m;
import com.fyber.inneractive.sdk.flow.C2786p;
import com.fyber.inneractive.sdk.flow.C2795v;
import com.fyber.inneractive.sdk.flow.C2806x;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InneractiveAdViewUnitController extends C2806x<InneractiveAdViewEventsListener> implements C2780m.C2783c, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a */
    public Set<InneractiveAdRenderer> f9500a;

    /* renamed from: b */
    public boolean f9501b;

    /* renamed from: c */
    public View f9502c;

    /* renamed from: d */
    public int f9503d;
    public int mAdContentHeight;
    public int mAdContentWidth;

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController$a */
    public class C2747a implements Runnable {
        public C2747a() {
        }

        public void run() {
            InneractiveAdViewUnitController.this.mo13441a();
        }
    }

    public InneractiveAdViewUnitController() {
        this.f9501b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f9503d = 0;
        this.f9500a = new HashSet();
    }

    /* renamed from: a */
    public final void mo13441a() {
        this.f9501b = true;
        Iterator it = new HashSet(this.f9500a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f9500a.clear();
        this.f9502c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        C2811b bVar;
        IAlog.m9902a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m9906e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.m9902a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.f9500a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C2811b) {
                C2811b bVar2 = (C2811b) inneractiveAdRenderer;
                if (bVar2.mo13307a((View) viewGroup)) {
                    bVar2.mo13311n();
                    IAlog.m9902a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar2);
                    return;
                }
            }
        }
        this.f9502c = viewGroup;
        Iterator<C2751a.C2752a> it2 = C2751a.C2753b.f9533a.f9532a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            C2751a.C2752a next = it2.next();
            if (next.mo13321a(adSpot)) {
                bVar = next.mo13322b(adSpot);
                break;
            }
        }
        int i = this.f9503d;
        if (i != 0) {
            bVar.mo13305a(i);
        }
        if (bVar != null) {
            bVar.initialize(adSpot);
            selectContentController();
            bVar.mo13306a(viewGroup);
            this.f9500a.add(bVar);
            IAlog.m9902a("%sPPPP bindView created renderer %s", logPrefix(), bVar);
            return;
        }
        IAlog.m9906e("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        for (InneractiveAdRenderer canRefreshAd : this.f9500a) {
            if (!canRefreshAd.canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C3714n.f12902b.post(new C2747a());
        } else {
            mo13441a();
        }
    }

    public int getAdContentHeight() {
        int p;
        for (InneractiveAdRenderer next : this.f9500a) {
            if ((next instanceof C2811b) && (p = ((C2811b) next).mo13312p()) > 0) {
                return p;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int f;
        for (InneractiveAdRenderer next : this.f9500a) {
            if ((next instanceof C2811b) && (f = ((C2811b) next).mo13310f()) > 0) {
                return f;
            }
        }
        return this.mAdContentWidth;
    }

    public C2812c getFullscreenRenderer() {
        C2812c a = C2757c.C2759b.f9537a.mo13510a((InneractiveAdSpot) C3727s.m9987a(this.mAdSpot));
        this.f9500a.add(a);
        return a;
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.f9500a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C2811b) {
                ((C2811b) inneractiveAdRenderer).mo13313q();
                return;
            }
        }
    }

    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        C2811b bVar;
        Iterator it = new HashSet(this.f9500a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C2811b) {
                bVar = (C2811b) inneractiveAdRenderer;
                if (bVar.mo13308a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.mo13306a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof C2780m) {
                int i = IAlog.f12814a;
                IAlog.m9900a(1, (Exception) null, "%s %s", "AD_REFRESH", ((C2780m) inneractiveAdSpot).f9616h.f9560g.f9974f.mo13664a());
            }
        } catch (Exception unused) {
        }
        IAlog.m9902a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.m9902a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C3727s.m9987a(this.mAdSpot);
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C2795v)) {
            ((C2795v) inneractiveAdSpot).mo13561a(this);
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C2702y yVar = (C2702y) inneractiveAdSpot.getAdContent().f9593d;
        if (yVar.f9426e != null) {
            return false;
        }
        C2684r rVar = yVar.f9424c;
        if (rVar != null) {
            if (UnitDisplayType.BANNER.equals(rVar.f9368b) || UnitDisplayType.MRECT.equals(rVar.f9368b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(rVar.f9368b)) {
                return !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        C2619a0 a0Var = yVar.f9427f;
        if (a0Var == null || (!UnitDisplayType.LANDSCAPE.equals(a0Var.f9256j) && !UnitDisplayType.SQUARE.equals(a0Var.f9256j) && !UnitDisplayType.MRECT.equals(a0Var.f9256j))) {
            return false;
        }
        return true;
    }

    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(C2812c cVar) {
        WeakReference<C2786p> weakReference;
        IAlog.m9902a("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.f9500a;
        if (set != null) {
            set.remove(cVar);
        }
        if (!this.f9501b) {
            Iterator it = new HashSet(this.f9500a).iterator();
            while (it.hasNext()) {
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof C2811b) {
                    ((C2811b) inneractiveAdRenderer).mo13304a();
                    if (!(this.mEventsListener == null || (weakReference = this.mAdSpot) == null || weakReference.get() == null)) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f9502c != view) {
            IAlog.m9906e("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f9502c, view);
        } else {
            this.f9502c = null;
        }
        IAlog.m9902a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.m9902a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.f9500a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C2811b) {
                C2811b bVar = (C2811b) inneractiveAdRenderer;
                if (bVar.mo13307a(view)) {
                    IAlog.m9902a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.mo13314t();
                    this.f9500a.remove(bVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.m9902a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.f9503d = i;
            return;
        }
        IAlog.m9902a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.f9503d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.f9503d = -1;
        }
    }
}
