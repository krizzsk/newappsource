package p160l9;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;

/* renamed from: l9.h */
public final class C5649h extends InneractiveFullscreenAdEventsListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InneractiveFullscreenUnitController f18401a;

    /* renamed from: b */
    public final /* synthetic */ C5651j f18402b;

    public C5649h(C5651j jVar, InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        this.f18402b = jVar;
        this.f18401a = inneractiveFullscreenUnitController;
    }

    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        this.f18402b.f18405b.reportAdClicked();
    }

    public final void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        this.f18402b.f18405b.onAdClosed();
    }

    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        boolean z;
        this.f18402b.f18405b.onAdOpened();
        C5651j jVar = this.f18402b;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.f18401a;
        jVar.getClass();
        if (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f18402b.f18405b.onVideoStart();
        }
        this.f18402b.f18405b.reportAdImpression();
    }
}
