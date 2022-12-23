package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.display.C2704a;
import com.fyber.inneractive.sdk.display.C2705b;
import com.fyber.inneractive.sdk.display.C2706c;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.C2757c;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2786p;
import com.fyber.inneractive.sdk.flow.C2806x;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.p048dv.C2707a;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

public class InneractiveFullscreenUnitController extends C2806x<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* renamed from: a */
    public boolean f9510a = false;

    /* renamed from: b */
    public InneractiveFullScreenAdRewardedListener f9511b;

    /* renamed from: c */
    public final C2812c.C2814b f9512c = new C2748a();
    public C2812c mRenderer;

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController$a */
    public class C2748a implements C2812c.C2814b {
        public C2748a() {
        }

        /* renamed from: a */
        public void mo13474a() {
            C2786p pVar = (C2786p) C3727s.m9987a(InneractiveFullscreenUnitController.this.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = InneractiveFullscreenUnitController.this.f9511b;
            if (inneractiveFullScreenAdRewardedListener != null && pVar != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(pVar);
            }
        }
    }

    public void destroy() {
        C2812c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    public C2812c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f9511b;
    }

    public boolean isAvailable() {
        C2786p pVar = (C2786p) C3727s.m9987a(this.mAdSpot);
        if (pVar == null || !pVar.isReady()) {
            return false;
        }
        return true;
    }

    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f9510a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f9511b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        C2704a aVar;
        if (activity == null) {
            IAlog.m9906e("show() called with a null activity", new Object[0]);
        } else if (!this.f9510a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.m9906e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            C2776j adContent = adSpot.getAdContent();
            if (adContent != null) {
                C2924p pVar = C2924p.IA_PUBLISHER_REQUESTED_SHOW;
                InneractiveAdRequest inneractiveAdRequest = adContent.f9590a;
                C3648e c = adContent.mo13293c();
                JSONArray c2 = adContent.f9592c.mo13268c();
                C2926q.C2927a aVar2 = new C2926q.C2927a(c);
                aVar2.f10042c = pVar;
                aVar2.f10040a = inneractiveAdRequest;
                aVar2.f10043d = c2;
                aVar2.mo13717a((String) null);
            }
            if (!adSpot.isReady()) {
                EL el = this.mEventsListener;
                if (el != null) {
                    ((InneractiveFullscreenAdEventsListener) el).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
                    return;
                }
                return;
            }
            if (this.mRenderer == null) {
                this.mRenderer = C2757c.C2759b.f9537a.mo13510a(getAdSpot());
            }
            selectContentController();
            if (adContent instanceof C2707a) {
                aVar = new C2705b();
            } else {
                aVar = new C2706c();
            }
            aVar.mo13290a(activity, adSpot, adSpot.getLocalUniqueId());
            this.f9510a = true;
            C2812c cVar = this.mRenderer;
            if (cVar != null) {
                cVar.mo13352a(this.f9512c);
            }
        } else {
            IAlog.m9906e("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C2702y yVar = (C2702y) inneractiveAdSpot.getAdContent().f9593d;
        if (yVar.f9426e != null) {
            return false;
        }
        C2684r rVar = yVar.f9424c;
        if (rVar != null && UnitDisplayType.INTERSTITIAL.equals(rVar.f9368b)) {
            return true;
        }
        C2619a0 a0Var = yVar.f9427f;
        if (a0Var == null || (!UnitDisplayType.REWARDED.equals(a0Var.f9256j) && !UnitDisplayType.INTERSTITIAL.equals(a0Var.f9256j) && !UnitDisplayType.VERTICAL.equals(a0Var.f9256j))) {
            return false;
        }
        return true;
    }

    public boolean supportsRefresh() {
        return false;
    }
}
