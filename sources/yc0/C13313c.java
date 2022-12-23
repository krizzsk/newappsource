package yc0;

import androidx.appcompat.app.C0262r;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import pc0.C13007b;

/* renamed from: yc0.c */
public final class C13313c extends C0262r {

    /* renamed from: d */
    public final C13312b f33055d;

    /* renamed from: e */
    public final ScarInterstitialAdHandler f33056e;

    /* renamed from: f */
    public final C13314a f33057f = new C13314a();

    /* renamed from: g */
    public final C13315b f33058g = new C13315b();

    /* renamed from: yc0.c$a */
    public class C13314a extends InterstitialAdLoadCallback {
        public C13314a() {
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            C13313c.this.f33056e.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        public final void onAdLoaded(Object obj) {
            T t = (InterstitialAd) obj;
            super.onAdLoaded(t);
            C13313c.this.f33056e.onAdLoaded();
            t.setFullScreenContentCallback(C13313c.this.f33058g);
            C13313c cVar = C13313c.this;
            cVar.f33055d.f33049a = t;
            C13007b bVar = (C13007b) cVar.f761c;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* renamed from: yc0.c$b */
    public class C13315b extends FullScreenContentCallback {
        public C13315b() {
        }

        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            C13313c.this.f33056e.onAdClosed();
        }

        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            C13313c.this.f33056e.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        public final void onAdImpression() {
            super.onAdImpression();
            C13313c.this.f33056e.onAdImpression();
        }

        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            C13313c.this.f33056e.onAdOpened();
        }
    }

    public C13313c(ScarInterstitialAdHandler scarInterstitialAdHandler, C13312b bVar) {
        this.f33056e = scarInterstitialAdHandler;
        this.f33055d = bVar;
    }
}
