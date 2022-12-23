package p160l9;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;

/* renamed from: l9.g */
public final class C5648g implements InneractiveAdSpot.RequestListener {

    /* renamed from: a */
    public final /* synthetic */ C5651j f18400a;

    public C5648g(C5651j jVar) {
        this.f18400a = jVar;
    }

    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        AdError a = C5642b.m13923a(inneractiveErrorCode);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
        a.getMessage();
        this.f18400a.f18404a.onFailure(a);
    }

    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        C5651j jVar = this.f18400a;
        jVar.f18405b = jVar.f18404a.onSuccess(jVar);
        C5651j jVar2 = this.f18400a;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = jVar2.f18407d;
        jVar2.getClass();
        C5649h hVar = new C5649h(jVar2, inneractiveFullscreenUnitController);
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        inneractiveFullscreenUnitController.setEventsListener(hVar);
        inneractiveFullscreenUnitController.setRewardedListener(new C5650i(jVar2));
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
    }
}
