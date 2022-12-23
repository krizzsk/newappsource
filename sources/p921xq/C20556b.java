package p921xq;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.moovit.MoovitApplication;
import p921xq.C20554a;

/* renamed from: xq.b */
public final class C20556b extends C20554a<AppOpenAd> {
    public C20556b(boolean z, String str, String str2, String str3, String str4, AppOpenAd appOpenAd) {
        super(z, str, str2, str3, str4, appOpenAd);
    }

    /* renamed from: a */
    public final <I, O> O mo52755a(MoovitApplication<?, ?, ?> moovitApplication, C20554a.C20555a<I, O> aVar, I i) {
        return aVar.mo44726a(moovitApplication, this, i);
    }

    /* renamed from: b */
    public final String mo52756b() {
        return ((AppOpenAd) this.f51994f).getResponseInfo().getMediationAdapterClassName();
    }

    /* renamed from: c */
    public final String mo52757c() {
        return "app_open_ad_validity_max_time_in_seconds";
    }

    /* renamed from: d */
    public final String mo52758d() {
        return "interval_between_update_app_open_ads_in_seconds";
    }
}
