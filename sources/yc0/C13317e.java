package yc0;

import androidx.appcompat.app.C0262r;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import pc0.C13007b;

/* renamed from: yc0.e */
public final class C13317e extends C0262r {

    /* renamed from: d */
    public final C13316d f33061d;

    /* renamed from: e */
    public final ScarRewardedAdHandler f33062e;

    /* renamed from: f */
    public final C13318a f33063f = new C13318a();

    /* renamed from: g */
    public final C13319b f33064g = new C13319b();

    /* renamed from: h */
    public final C13320c f33065h = new C13320c();

    /* renamed from: yc0.e$a */
    public class C13318a extends RewardedAdLoadCallback {
        public C13318a() {
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            C13317e.this.f33062e.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        public final void onAdLoaded(Object obj) {
            T t = (RewardedAd) obj;
            super.onAdLoaded(t);
            C13317e.this.f33062e.onAdLoaded();
            t.setFullScreenContentCallback(C13317e.this.f33065h);
            C13317e eVar = C13317e.this;
            eVar.f33061d.f33049a = t;
            C13007b bVar = (C13007b) eVar.f761c;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* renamed from: yc0.e$b */
    public class C13319b implements OnUserEarnedRewardListener {
        public C13319b() {
        }

        public final void onUserEarnedReward(RewardItem rewardItem) {
            C13317e.this.f33062e.onUserEarnedReward();
        }
    }

    /* renamed from: yc0.e$c */
    public class C13320c extends FullScreenContentCallback {
        public C13320c() {
        }

        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            C13317e.this.f33062e.onAdClosed();
        }

        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            C13317e.this.f33062e.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        public final void onAdImpression() {
            super.onAdImpression();
            C13317e.this.f33062e.onAdImpression();
        }

        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            C13317e.this.f33062e.onAdOpened();
        }
    }

    public C13317e(ScarRewardedAdHandler scarRewardedAdHandler, C13316d dVar) {
        this.f33062e = scarRewardedAdHandler;
        this.f33061d = dVar;
    }
}
