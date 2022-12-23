package p160l9;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter;
import com.google.ads.mediation.fyber.FyberMediationAdapter;

/* renamed from: l9.d */
public final class C5645d extends InneractiveAdViewEventsListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ FyberMediationAdapter f18397a;

    public C5645d(FyberMediationAdapter fyberMediationAdapter) {
        this.f18397a = fyberMediationAdapter;
    }

    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18397a;
        fyberMediationAdapter.f13298d.onAdClicked(fyberMediationAdapter);
        FyberMediationAdapter fyberMediationAdapter2 = this.f18397a;
        fyberMediationAdapter2.f13298d.onAdOpened(fyberMediationAdapter2);
    }

    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18397a;
        fyberMediationAdapter.f13298d.onAdClosed(fyberMediationAdapter);
    }

    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18397a;
        fyberMediationAdapter.f13298d.onAdLeftApplication(fyberMediationAdapter);
    }
}
