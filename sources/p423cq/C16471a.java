package p423cq;

import android.content.Context;
import com.moovit.ads.AdSize;
import com.moovit.ads.AdTargeting;
import com.tranzmate.moovit.protocol.directsales.MVAdSize;
import com.tranzmate.moovit.protocol.directsales.MVAdTargeting;
import com.tranzmate.moovit.protocol.directsales.MVGetMapItemAdRequest;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p447dq.C16695a;
import p584jl.C17886b;
import p896wp.C20391k;

/* renamed from: cq.a */
public final class C16471a extends C16695a<C16471a, C16472b, MVGetMapItemAdRequest> {

    /* renamed from: r */
    public final String f43064r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16471a(Context context, String str, String str2, AdSize adSize, AdTargeting adTargeting) {
        super(context, C16472b.class, C20391k.server_path_app_server_url, C20391k.api_path_ads_get_map_item);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, "placementId");
        C24362h.m61211f(str2, "adId");
        C24362h.m61211f(adSize, "size");
        C24362h.m61211f(adTargeting, "targeting");
        this.f43064r = str;
        int i = adSize.f37357b;
        int i2 = adSize.f37358c;
        MVAdSize mVAdSize = new MVAdSize();
        mVAdSize.width = i;
        mVAdSize.mo27027i();
        mVAdSize.height = i2;
        mVAdSize.mo27025h();
        MVAdTargeting i3 = C17886b.m44483i(adTargeting);
        RO mVGetMapItemAdRequest = new MVGetMapItemAdRequest();
        mVGetMapItemAdRequest.placementId = str;
        mVGetMapItemAdRequest.adId = str2;
        mVGetMapItemAdRequest.adSize = mVAdSize;
        mVGetMapItemAdRequest.targeting = i3;
        this.f17996q = mVGetMapItemAdRequest;
    }
}
