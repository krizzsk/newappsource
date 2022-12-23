package p160l9;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import java.util.ArrayList;

/* renamed from: l9.c */
public final class C5644c implements InneractiveAdSpot.RequestListener {

    /* renamed from: a */
    public final /* synthetic */ FyberMediationAdapter f18396a;

    public C5644c(FyberMediationAdapter fyberMediationAdapter) {
        this.f18396a = fyberMediationAdapter;
    }

    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        AdError a = C5642b.m13923a(inneractiveErrorCode);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
        a.getMessage();
        FyberMediationAdapter fyberMediationAdapter = this.f18396a;
        fyberMediationAdapter.f13298d.onAdFailedToLoad((MediationBannerAdapter) fyberMediationAdapter, a);
    }

    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        if (!(this.f18396a.f13296b.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
            AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", new Object[]{InneractiveUnitController.class.getName(), this.f18396a.f13296b.getSelectedUnitController().getClass().getName()}), FyberMediationAdapter.ERROR_DOMAIN);
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
            adError.getMessage();
            FyberMediationAdapter fyberMediationAdapter = this.f18396a;
            fyberMediationAdapter.f13298d.onAdFailedToLoad((MediationBannerAdapter) fyberMediationAdapter, adError);
            this.f18396a.f13296b.destroy();
        }
        InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) this.f18396a.f13296b.getSelectedUnitController();
        FyberMediationAdapter fyberMediationAdapter2 = this.f18396a;
        fyberMediationAdapter2.getClass();
        inneractiveAdViewUnitController.setEventsListener(new C5645d(fyberMediationAdapter2));
        inneractiveAdViewUnitController.bindView(this.f18396a.f13297c);
        Context context = this.f18396a.f13297c.getContext();
        float f = context.getResources().getDisplayMetrics().density;
        int round = Math.round(((float) inneractiveAdViewUnitController.getAdContentWidth()) / f);
        int round2 = Math.round(((float) inneractiveAdViewUnitController.getAdContentHeight()) / f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(round, round2));
        if (MediationUtils.findClosestSize(context, this.f18396a.f13295a, arrayList) == null) {
            AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", new Object[]{Integer.valueOf(Math.round(((float) this.f18396a.f13295a.getWidthInPixels(context)) / f)), Integer.valueOf(Math.round(((float) this.f18396a.f13295a.getHeightInPixels(context)) / f)), Integer.valueOf(round), Integer.valueOf(round2)}), FyberMediationAdapter.ERROR_DOMAIN);
            InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.f13294g;
            adError2.getMessage();
            FyberMediationAdapter fyberMediationAdapter3 = this.f18396a;
            fyberMediationAdapter3.f13298d.onAdFailedToLoad((MediationBannerAdapter) fyberMediationAdapter3, adError2);
            return;
        }
        FyberMediationAdapter fyberMediationAdapter4 = this.f18396a;
        fyberMediationAdapter4.f13298d.onAdLoaded(fyberMediationAdapter4);
    }
}
