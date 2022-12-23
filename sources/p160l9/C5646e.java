package p160l9;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* renamed from: l9.e */
public final class C5646e implements InneractiveAdSpot.RequestListener {

    /* renamed from: a */
    public final /* synthetic */ FyberMediationAdapter f18398a;

    public C5646e(FyberMediationAdapter fyberMediationAdapter) {
        this.f18398a = fyberMediationAdapter;
    }

    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        AdError a = C5642b.m13923a(inneractiveErrorCode);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
        a.getMessage();
        FyberMediationAdapter fyberMediationAdapter = this.f18398a;
        fyberMediationAdapter.f13299e.onAdFailedToLoad((MediationInterstitialAdapter) fyberMediationAdapter, a);
    }

    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        if (!(this.f18398a.f13300f.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
            AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", new Object[]{InneractiveUnitController.class.getName(), this.f18398a.f13296b.getSelectedUnitController().getClass().getName()}), FyberMediationAdapter.ERROR_DOMAIN);
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
            adError.getMessage();
            FyberMediationAdapter fyberMediationAdapter = this.f18398a;
            fyberMediationAdapter.f13299e.onAdFailedToLoad((MediationInterstitialAdapter) fyberMediationAdapter, adError);
            this.f18398a.f13300f.destroy();
        }
        FyberMediationAdapter fyberMediationAdapter2 = this.f18398a;
        fyberMediationAdapter2.getClass();
        ((InneractiveFullscreenUnitController) this.f18398a.f13300f.getSelectedUnitController()).setEventsListener(new C5647f(fyberMediationAdapter2));
        FyberMediationAdapter fyberMediationAdapter3 = this.f18398a;
        fyberMediationAdapter3.f13299e.onAdLoaded(fyberMediationAdapter3);
    }
}
