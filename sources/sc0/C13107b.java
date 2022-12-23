package sc0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13007b;
import pc0.C13008c;
import tc0.C13133b;

/* renamed from: sc0.b */
public final class C13107b extends C13106a {

    /* renamed from: e */
    public InterstitialAd f32560e;

    /* renamed from: f */
    public C13108c f32561f;

    public C13107b(Context context, C13133b bVar, C13008c cVar, C12982b bVar2, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        super(context, cVar, bVar, bVar2);
        InterstitialAd interstitialAd = new InterstitialAd(this.f32556a);
        this.f32560e = interstitialAd;
        interstitialAd.setAdUnitId(this.f32557b.mo39897a());
        this.f32561f = new C13108c(scarInterstitialAdHandler);
    }

    /* renamed from: a */
    public final void mo39895a(Activity activity) {
        if (this.f32560e.isLoaded()) {
            this.f32560e.show();
        } else {
            this.f32559d.handleError(C12981a.m32861a(this.f32557b));
        }
    }

    /* renamed from: c */
    public final void mo40010c(AdRequest adRequest, C13007b bVar) {
        this.f32560e.setAdListener(this.f32561f.mo40011a());
        this.f32561f.mo40012b(bVar);
        this.f32560e.loadAd(adRequest);
    }
}
