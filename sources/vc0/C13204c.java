package vc0;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import pc0.C13007b;

/* renamed from: vc0.c */
public final class C13204c {

    /* renamed from: a */
    public ScarInterstitialAdHandler f32774a;

    /* renamed from: b */
    public C13007b f32775b;

    /* renamed from: c */
    public C13205a f32776c = new C13205a();

    /* renamed from: vc0.c$a */
    public class C13205a extends AdListener {
        public C13205a() {
        }

        public final void onAdClicked() {
            C13204c.this.f32774a.onAdClicked();
        }

        public final void onAdClosed() {
            C13204c.this.f32774a.onAdClosed();
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            C13204c.this.f32774a.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        public final void onAdLoaded() {
            C13204c.this.f32774a.onAdLoaded();
            C13007b bVar = C13204c.this.f32775b;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public final void onAdOpened() {
            C13204c.this.f32774a.onAdOpened();
        }
    }

    public C13204c(ScarInterstitialAdHandler scarInterstitialAdHandler) {
        this.f32774a = scarInterstitialAdHandler;
    }

    /* renamed from: a */
    public final C13205a mo40084a() {
        return this.f32776c;
    }

    /* renamed from: b */
    public final void mo40085b(C13007b bVar) {
        this.f32775b = bVar;
    }
}
