package p943yp;

import android.content.Context;
import com.moovit.ads.AdSize;
import com.moovit.ads.AdTargeting;
import com.tranzmate.moovit.protocol.directsales.MVAdSize;
import com.tranzmate.moovit.protocol.directsales.MVAdTargeting;
import com.tranzmate.moovit.protocol.directsales.MVGetBannerAdRequest;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p447dq.C16695a;
import p584jl.C17886b;
import p896wp.C20391k;

/* renamed from: yp.a */
public final class C20748a extends C16695a<C20748a, C20749b, MVGetBannerAdRequest> {

    /* renamed from: r */
    public final String f52352r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20748a(Context context, String str, AdSize adSize, AdTargeting adTargeting) {
        super(context, C20749b.class, C20391k.server_path_app_server_url, C20391k.api_path_ads_get_banner);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, "placementId");
        C24362h.m61211f(adSize, "size");
        C24362h.m61211f(adTargeting, "targeting");
        this.f52352r = str;
        int i = adSize.f37357b;
        int i2 = adSize.f37358c;
        MVAdSize mVAdSize = new MVAdSize();
        mVAdSize.width = i;
        mVAdSize.mo27027i();
        mVAdSize.height = i2;
        mVAdSize.mo27025h();
        MVAdTargeting i3 = C17886b.m44483i(adTargeting);
        RO mVGetBannerAdRequest = new MVGetBannerAdRequest();
        mVGetBannerAdRequest.placementId = str;
        mVGetBannerAdRequest.adSize = mVAdSize;
        mVGetBannerAdRequest.targeting = i3;
        this.f17996q = mVGetBannerAdRequest;
    }
}
