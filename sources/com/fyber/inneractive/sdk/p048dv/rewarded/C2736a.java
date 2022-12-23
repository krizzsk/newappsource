package com.fyber.inneractive.sdk.p048dv.rewarded;

import android.app.Activity;
import android.content.Context;
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
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a */
public class C2736a extends C2527a<RewardedAd> {

    /* renamed from: k */
    public final RewardedAdLoadCallback f9464k = new C2737a();

    /* renamed from: l */
    public final FullScreenContentCallback f9465l = new C2738b();

    /* renamed from: m */
    public final OnUserEarnedRewardListener f9466m = new C2739c();

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$a */
    public class C2737a extends RewardedAdLoadCallback {
        public C2737a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            String str;
            C2717d dVar = C2736a.this.f9431g;
            if (dVar != null) {
                ((C2708b) dVar).mo13298f();
                InneractiveAdRequest inneractiveAdRequest = C2736a.this.f9590a;
                if (inneractiveAdRequest != null) {
                    str = inneractiveAdRequest.getSpotId();
                } else {
                    str = null;
                }
                C2719a aVar = C2719a.Load;
                C2736a aVar2 = C2736a.this;
                C2725c.m6814a(str, aVar, aVar2.f9590a, (C2720f) aVar2.f9591b, loadAdError.getMessage());
            }
        }

        public void onAdLoaded(Object obj) {
            T t = (RewardedAd) obj;
            C2736a aVar = C2736a.this;
            if (aVar.f9431g != null) {
                aVar.f9433i = t;
                aVar.mo12758f();
                ((C2708b) C2736a.this.f9431g).mo13520d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$b */
    public class C2738b extends FullScreenContentCallback {
        public C2738b() {
        }

        public void onAdDismissedFullScreenContent() {
            C2728a aVar = C2736a.this.f8994j;
            if (aVar != null) {
                aVar.mo13335i();
            }
        }

        public void onAdImpression() {
            C2728a aVar = C2736a.this.f8994j;
            if (aVar != null) {
                aVar.mo13337v();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$c */
    public class C2739c implements OnUserEarnedRewardListener {
        public C2739c() {
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C2728a aVar = C2736a.this.f8994j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public C2736a(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo13292a(AdRequest adRequest, C2717d dVar) {
        this.f9431g = dVar;
        RewardedAd.load((Context) C3707l.f12893a, "FyberRewarded", adRequest, this.f9464k);
    }

    /* renamed from: d */
    public boolean mo13299d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo13294e() {
        return this.f9433i != null;
    }

    /* renamed from: a */
    public void mo12757a(C2728a aVar, Activity activity) {
        this.f8994j = aVar;
        T t = this.f9433i;
        if (t != null) {
            ((RewardedAd) t).setFullScreenContentCallback(this.f9465l);
            ((RewardedAd) this.f9433i).show(activity, this.f9466m);
        }
    }
}
