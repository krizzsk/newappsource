package com.fyber.inneractive.sdk.p048dv.banner;

import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p048dv.C2707a;
import com.fyber.inneractive.sdk.p048dv.C2708b;
import com.fyber.inneractive.sdk.p048dv.C2717d;
import com.fyber.inneractive.sdk.p048dv.C2720f;
import com.fyber.inneractive.sdk.p048dv.enums.C2719a;
import com.fyber.inneractive.sdk.p048dv.handler.C2725c;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3707l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.fyber.inneractive.sdk.dv.banner.a */
public class C2710a extends C2707a<AdView> {

    /* renamed from: j */
    public boolean f9436j = false;

    /* renamed from: k */
    public boolean f9437k = false;

    /* renamed from: l */
    public final AdListener f9438l = new C2711a();

    /* renamed from: com.fyber.inneractive.sdk.dv.banner.a$a */
    public class C2711a extends AdListener {
        public C2711a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            String str;
            InneractiveAdRequest inneractiveAdRequest = C2710a.this.f9590a;
            if (inneractiveAdRequest != null) {
                str = inneractiveAdRequest.getSpotId();
            } else {
                str = null;
            }
            C2719a aVar = C2719a.Load;
            C2710a aVar2 = C2710a.this;
            C2725c.m6814a(str, aVar, aVar2.f9590a, (C2720f) aVar2.f9591b, loadAdError.getMessage());
        }

        public void onAdImpression() {
            C2710a aVar = C2710a.this;
            C2712b bVar = aVar.f9432h;
            if (bVar != null) {
                bVar.mo13315v();
            } else {
                boolean unused = aVar.f9436j = true;
            }
        }

        public void onAdLoaded() {
            C2710a aVar = C2710a.this;
            if (aVar.f9431g != null) {
                boolean unused = aVar.f9437k = true;
                ((C2708b) C2710a.this.f9431g).mo13520d();
            }
        }

        public void onAdOpened() {
            C2720f fVar;
            C2684r rVar;
            C2608b bVar;
            C2712b bVar2 = C2710a.this.f9432h;
            if (bVar2 != null) {
                bVar2.mo13558z();
                AdContent adcontent = bVar2.f9598b;
                if (adcontent != null && (fVar = (C2720f) ((C2710a) adcontent).f9591b) != null) {
                    bVar2.mo13551a((C3648e) fVar);
                    C2703z zVar = ((C2710a) bVar2.f9598b).f9593d;
                    if (zVar != null && (rVar = ((C2702y) zVar).f9424c) != null) {
                        C2607a aVar = C2607a.CLICK;
                        if (rVar.f9368b == UnitDisplayType.MRECT) {
                            bVar = C2608b.RECTANGLE_DISPLAY;
                        } else {
                            bVar = C2608b.BANNER_DISPLAY;
                        }
                        bVar2.mo13549a(aVar, bVar);
                    }
                }
            }
        }
    }

    public C2710a(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: d */
    public boolean mo13299d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo13294e() {
        return this.f9437k;
    }

    /* renamed from: a */
    public void mo13292a(AdRequest adRequest, C2717d dVar) {
        C2684r rVar;
        this.f9431g = dVar;
        T adView = new AdView(C3707l.f12893a);
        this.f9433i = adView;
        AdSize adSize = AdSize.BANNER;
        C2703z zVar = this.f9593d;
        if (!(zVar == null || (rVar = ((C2702y) zVar).f9424c) == null || rVar.f9368b != UnitDisplayType.MRECT)) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f9433i).setAdUnitId("FyberBanner");
        ((AdView) this.f9433i).setAdListener(this.f9438l);
        ((AdView) this.f9433i).loadAd(adRequest);
    }
}
