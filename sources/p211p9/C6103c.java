package p211p9;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23135f0;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* renamed from: p9.c */
public final class C6103c implements MediationInterstitialAd {

    /* renamed from: a */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f19368a;

    /* renamed from: b */
    public MediationInterstitialAdCallback f19369b;

    /* renamed from: c */
    public AdConfig f19370c;

    /* renamed from: d */
    public String f19371d;

    /* renamed from: e */
    public String f19372e;

    /* renamed from: p9.c$a */
    public class C6104a implements C23135f0 {
        public C6104a() {
        }

        public final void creativeId(String str) {
        }

        public final void onAdClick(String str) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = C6103c.this.f19369b;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.reportAdClicked();
            }
        }

        public final void onAdEnd(String str) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = C6103c.this.f19369b;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdClosed();
            }
        }

        public final void onAdEnd(String str, boolean z, boolean z2) {
        }

        public final void onAdLeftApplication(String str) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = C6103c.this.f19369b;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdLeftApplication();
            }
        }

        public final void onAdRewarded(String str) {
        }

        public final void onAdStart(String str) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = C6103c.this.f19369b;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdOpened();
            }
        }

        public final void onAdViewed(String str) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = C6103c.this.f19369b;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.reportAdImpression();
            }
        }

        public final void onError(String str, VungleException vungleException) {
            AdError adError = VungleMediationAdapter.getAdError(vungleException);
            String str2 = VungleMediationAdapter.TAG;
            adError.getMessage();
            MediationInterstitialAdCallback mediationInterstitialAdCallback = C6103c.this.f19369b;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdClosed();
            }
        }
    }

    public C6103c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f19368a = mediationAdLoadCallback;
    }

    public final void showAd(Context context) {
        Vungle.playAd(this.f19371d, this.f19372e, this.f19370c, new C6104a());
    }
}
