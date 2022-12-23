package p369aq;

import android.content.Context;
import com.moovit.ads.AdTargeting;
import com.tranzmate.moovit.protocol.directsales.MVAdTargeting;
import com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdRequest;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p447dq.C16695a;
import p584jl.C17886b;
import p896wp.C20391k;

/* renamed from: aq.a */
public final class C13504a extends C16695a<C13504a, C13505b, MVGetInterstitialAdRequest> {

    /* renamed from: r */
    public final String f33419r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13504a(Context context, String str, AdTargeting adTargeting) {
        super(context, C13505b.class, C20391k.server_path_app_server_url, C20391k.api_path_ads_get_interstitial);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, "placementId");
        C24362h.m61211f(adTargeting, "targeting");
        this.f33419r = str;
        MVAdTargeting i = C17886b.m44483i(adTargeting);
        RO mVGetInterstitialAdRequest = new MVGetInterstitialAdRequest();
        mVGetInterstitialAdRequest.placementId = str;
        mVGetInterstitialAdRequest.targeting = i;
        this.f17996q = mVGetInterstitialAdRequest;
    }
}
