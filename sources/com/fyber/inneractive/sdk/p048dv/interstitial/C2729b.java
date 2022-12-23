package com.fyber.inneractive.sdk.p048dv.interstitial;

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
import com.fyber.inneractive.sdk.util.C3707l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b */
public class C2729b extends C2527a<InterstitialAd> {

    /* renamed from: k */
    public final InterstitialAdLoadCallback f9455k = new C2730a();

    /* renamed from: l */
    public final FullScreenContentCallback f9456l = new C2731b();

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$a */
    public class C2730a extends InterstitialAdLoadCallback {
        public C2730a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            String str;
            C2717d dVar = C2729b.this.f9431g;
            if (dVar != null) {
                ((C2708b) dVar).mo13298f();
                InneractiveAdRequest inneractiveAdRequest = C2729b.this.f9590a;
                if (inneractiveAdRequest != null) {
                    str = inneractiveAdRequest.getSpotId();
                } else {
                    str = null;
                }
                C2719a aVar = C2719a.Load;
                C2729b bVar = C2729b.this;
                C2725c.m6814a(str, aVar, bVar.f9590a, (C2720f) bVar.f9591b, loadAdError.getMessage());
            }
        }

        public void onAdLoaded(Object obj) {
            T t = (InterstitialAd) obj;
            C2729b bVar = C2729b.this;
            if (bVar.f9431g != null) {
                bVar.f9433i = t;
                bVar.mo12758f();
                ((C2708b) C2729b.this.f9431g).mo13520d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$b */
    public class C2731b extends FullScreenContentCallback {
        public C2731b() {
        }

        public void onAdDismissedFullScreenContent() {
            C2728a aVar = C2729b.this.f8994j;
            if (aVar != null) {
                aVar.mo13335i();
            }
        }

        public void onAdShowedFullScreenContent() {
            C2728a aVar = C2729b.this.f8994j;
            if (aVar != null) {
                aVar.mo13337v();
            }
        }
    }

    public C2729b(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo13292a(AdRequest adRequest, C2717d dVar) {
        this.f9431g = dVar;
        InterstitialAd.load(C3707l.f12893a, "FyberInterstitial", adRequest, this.f9455k);
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
            ((InterstitialAd) t).setFullScreenContentCallback(this.f9456l);
            ((InterstitialAd) this.f9433i).show(activity);
        }
    }
}
