package p160l9;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.google.ads.mediation.fyber.FyberMediationAdapter;

/* renamed from: l9.f */
public final class C5647f extends InneractiveFullscreenAdEventsListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ FyberMediationAdapter f18399a;

    public C5647f(FyberMediationAdapter fyberMediationAdapter) {
        this.f18399a = fyberMediationAdapter;
    }

    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18399a;
        fyberMediationAdapter.f13299e.onAdClicked(fyberMediationAdapter);
    }

    public final void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18399a;
        fyberMediationAdapter.f13299e.onAdClosed(fyberMediationAdapter);
    }

    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18399a;
        fyberMediationAdapter.f13299e.onAdOpened(fyberMediationAdapter);
    }

    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        FyberMediationAdapter fyberMediationAdapter = this.f18399a;
        fyberMediationAdapter.f13299e.onAdLeftApplication(fyberMediationAdapter);
    }
}
