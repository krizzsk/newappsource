package com.fyber.inneractive.sdk.p048dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.C2527a;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p048dv.C2708b;
import com.fyber.inneractive.sdk.p048dv.C2717d;
import com.fyber.inneractive.sdk.p048dv.C2720f;
import com.fyber.inneractive.sdk.p048dv.enums.C2719a;
import com.fyber.inneractive.sdk.p048dv.handler.C2725c;
import com.fyber.inneractive.sdk.p048dv.interstitial.C2728a;
import com.fyber.inneractive.sdk.util.C3707l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b */
public class C2740b extends C2527a<RewardedAd> {

    /* renamed from: k */
    public final RewardedAdLoadCallback f9470k = new C2741a();

    /* renamed from: l */
    public final RewardedAdCallback f9471l = new C2742b();

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$a */
    public class C2741a extends RewardedAdLoadCallback {
        public C2741a() {
        }

        public void onRewardedAdFailedToLoad(int i) {
            String str;
            C2717d dVar = C2740b.this.f9431g;
            if (dVar != null) {
                ((C2708b) dVar).mo13298f();
                InneractiveAdRequest inneractiveAdRequest = C2740b.this.f9590a;
                if (inneractiveAdRequest != null) {
                    str = inneractiveAdRequest.getSpotId();
                } else {
                    str = null;
                }
                C2719a aVar = C2719a.Load;
                C2740b bVar = C2740b.this;
                C2725c.m6814a(str, aVar, bVar.f9590a, (C2720f) bVar.f9591b, String.format("errorCode - %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void onRewardedAdLoaded() {
            C2740b bVar = C2740b.this;
            if (bVar.f9431g != null) {
                bVar.mo12758f();
                ((C2708b) C2740b.this.f9431g).mo13520d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$b */
    public class C2742b extends RewardedAdCallback {
        public C2742b() {
        }

        public void onRewardedAdClosed() {
            C2728a aVar = C2740b.this.f8994j;
            if (aVar != null) {
                aVar.mo13335i();
            }
        }

        public void onRewardedAdFailedToShow(int i) {
        }

        public void onRewardedAdOpened() {
            C2728a aVar = C2740b.this.f8994j;
            if (aVar != null) {
                aVar.mo13337v();
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C2728a aVar = C2740b.this.f8994j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public C2740b(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo13292a(AdRequest adRequest, C2717d dVar) {
        this.f9431g = dVar;
        T rewardedAd = new RewardedAd(C3707l.f12893a, "FyberRewarded");
        this.f9433i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f9470k);
    }

    /* renamed from: d */
    public boolean mo13299d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo13294e() {
        T t = this.f9433i;
        if (t != null) {
            return ((RewardedAd) t).isLoaded();
        }
        return false;
    }

    /* renamed from: a */
    public void mo12757a(C2728a aVar, Activity activity) {
        this.f8994j = aVar;
        ((RewardedAd) this.f9433i).show(activity, this.f9471l);
    }
}
