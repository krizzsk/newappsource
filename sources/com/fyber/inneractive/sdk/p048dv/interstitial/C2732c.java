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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c */
public class C2732c extends C2527a<InterstitialAd> {

    /* renamed from: k */
    public final AdListener f9459k = new C2733a();

    /* renamed from: l */
    public final AdListener f9460l = new C2734b();

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c$a */
    public class C2733a extends AdListener {
        public C2733a() {
        }

        public void onAdFailedToLoad(int i) {
            String str;
            C2717d dVar = C2732c.this.f9431g;
            if (dVar != null) {
                ((C2708b) dVar).mo13298f();
                InneractiveAdRequest inneractiveAdRequest = C2732c.this.f9590a;
                if (inneractiveAdRequest != null) {
                    str = inneractiveAdRequest.getSpotId();
                } else {
                    str = null;
                }
                C2719a aVar = C2719a.Load;
                C2732c cVar = C2732c.this;
                C2725c.m6814a(str, aVar, cVar.f9590a, (C2720f) cVar.f9591b, String.format("errorCode - %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void onAdLoaded() {
            C2732c cVar = C2732c.this;
            if (cVar.f9431g != null) {
                cVar.mo12758f();
                ((C2708b) C2732c.this.f9431g).mo13520d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c$b */
    public class C2734b extends AdListener {
        public C2734b() {
        }

        public void onAdClicked() {
            C2728a aVar = C2732c.this.f8994j;
            if (aVar != null) {
                aVar.mo13334d();
            }
        }

        public void onAdClosed() {
            C2728a aVar = C2732c.this.f8994j;
            if (aVar != null) {
                aVar.mo13335i();
            }
        }

        public void onAdImpression() {
            C2728a aVar = C2732c.this.f8994j;
            if (aVar != null) {
                aVar.mo13337v();
            }
        }

        public void onAdOpened() {
            C2728a aVar = C2732c.this.f8994j;
            if (aVar != null) {
                aVar.mo13337v();
            }
        }
    }

    public C2732c(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo13292a(AdRequest adRequest, C2717d dVar) {
        this.f9431g = dVar;
        T interstitialAd = new InterstitialAd(C3707l.f12893a);
        this.f9433i = interstitialAd;
        interstitialAd.setAdListener(this.f9459k);
        ((InterstitialAd) this.f9433i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f9433i).loadAd(adRequest);
    }

    /* renamed from: d */
    public boolean mo13299d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo13294e() {
        T t = this.f9433i;
        return t != null && ((InterstitialAd) t).isLoaded();
    }

    /* renamed from: a */
    public void mo12757a(C2728a aVar, Activity activity) {
        this.f8994j = aVar;
        T t = this.f9433i;
        if (t != null) {
            ((InterstitialAd) t).setAdListener(this.f9460l);
            ((InterstitialAd) this.f9433i).show();
        }
    }
}
