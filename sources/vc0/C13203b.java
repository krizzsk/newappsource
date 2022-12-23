package vc0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13007b;
import pc0.C13008c;
import wc0.C13235b;

/* renamed from: vc0.b */
public final class C13203b extends C13202a {

    /* renamed from: e */
    public InterstitialAd f32772e;

    /* renamed from: f */
    public C13204c f32773f;

    public C13203b(Context context, C13235b bVar, C13008c cVar, C12982b bVar2, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        super(context, cVar, bVar, bVar2);
        InterstitialAd interstitialAd = new InterstitialAd(this.f32768a);
        this.f32772e = interstitialAd;
        interstitialAd.setAdUnitId(this.f32769b.mo39897a());
        this.f32773f = new C13204c(scarInterstitialAdHandler);
    }

    /* renamed from: a */
    public final void mo39895a(Activity activity) {
        if (this.f32772e.isLoaded()) {
            this.f32772e.show();
        } else {
            this.f32771d.handleError(C12981a.m32861a(this.f32769b));
        }
    }

    /* renamed from: c */
    public final void mo40083c(AdRequest adRequest, C13007b bVar) {
        this.f32772e.setAdListener(this.f32773f.mo40084a());
        this.f32773f.mo40085b(bVar);
        this.f32772e.loadAd(adRequest);
    }
}
