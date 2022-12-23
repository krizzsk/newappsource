package p921xq;

import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.moovit.MoovitApplication;
import p921xq.C20554a;

/* renamed from: xq.c */
public final class C20557c extends C20554a<InterstitialAd> {
    public C20557c(boolean z, String str, String str2, String str3, String str4, InterstitialAd interstitialAd) {
        super(z, str, str2, str3, str4, interstitialAd);
    }

    /* renamed from: a */
    public final <I, O> O mo52755a(MoovitApplication<?, ?, ?> moovitApplication, C20554a.C20555a<I, O> aVar, I i) {
        return aVar.mo44728c(moovitApplication, this, i);
    }

    /* renamed from: b */
    public final String mo52756b() {
        return ((InterstitialAd) this.f51994f).getResponseInfo().getMediationAdapterClassName();
    }

    /* renamed from: c */
    public final String mo52757c() {
        return "interstitial_ad_validity_max_time_in_seconds";
    }

    /* renamed from: d */
    public final String mo52758d() {
        return "interval_between_update_interstitial_ads_in_seconds";
    }
}
