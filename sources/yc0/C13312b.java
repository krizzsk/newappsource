package yc0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13008c;
import zc0.C13379b;

/* renamed from: yc0.b */
public final class C13312b extends C13311a<InterstitialAd> {
    public C13312b(Context context, C13379b bVar, C13008c cVar, C12982b bVar2, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        super(context, cVar, bVar, bVar2);
        this.f33053e = new C13313c(scarInterstitialAdHandler, this);
    }

    /* renamed from: a */
    public final void mo39895a(Activity activity) {
        T t = this.f33049a;
        if (t != null) {
            ((InterstitialAd) t).show(activity);
        } else {
            this.f33054f.handleError(C12981a.m32861a(this.f33051c));
        }
    }

    /* renamed from: c */
    public final void mo40219c(AdRequest adRequest) {
        InterstitialAd.load(this.f33050b, this.f33051c.f32195c, adRequest, ((C13313c) this.f33053e).f33057f);
    }
}
