package p943yp;

import com.moovit.ads.AdSize;
import com.moovit.ads.HtmlBannerAd;
import com.moovit.ads.banner.html.BannerAdCreativeHtml;
import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.directsales.MVAdBannerCreative;
import com.tranzmate.moovit.protocol.directsales.MVAdBannerCreativeHtml;
import com.tranzmate.moovit.protocol.directsales.MVAdSize;
import com.tranzmate.moovit.protocol.directsales.MVBannerAd;
import com.tranzmate.moovit.protocol.directsales.MVGetBannerAdResponse;
import java.net.HttpURLConnection;
import k40.C5481e;
import mf0.C24362h;
import org.apache.thrift.TBase;
import p906wz.C20431c;

/* renamed from: yp.b */
public final class C20749b extends C5481e<C20748a, C20749b, MVGetBannerAdResponse> {

    /* renamed from: g */
    public HtmlBannerAd f52353g;

    public C20749b() {
        super(MVGetBannerAdResponse.class);
    }

    /* renamed from: e */
    public final void mo21366e(C20431c cVar, HttpURLConnection httpURLConnection, TBase tBase) {
        boolean z;
        C20748a aVar = (C20748a) cVar;
        C24362h.m61211f(aVar, "request");
        C24362h.m61211f(httpURLConnection, "connection");
        String str = aVar.f52352r;
        MVBannerAd mVBannerAd = ((MVGetBannerAdResponse) tBase).banner;
        C24362h.m61210e(mVBannerAd, "responseObj.banner");
        C24362h.m61211f(str, "placementId");
        MVAdBannerCreative mVAdBannerCreative = mVBannerAd.creative;
        F f = mVAdBannerCreative.setField_;
        F f2 = MVAdBannerCreative._Fields.HTML;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str2 = mVBannerAd.f25528id;
            C24362h.m61210e(str2, "mvBannerAd.id");
            if (mVAdBannerCreative.setField_ == f2) {
                MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) mVAdBannerCreative.value_;
                C24362h.m61210e(mVAdBannerCreativeHtml, "creative.html");
                String str3 = mVAdBannerCreativeHtml.html;
                C24362h.m61210e(str3, "htmlCreative.html");
                MVAdSize mVAdSize = mVAdBannerCreativeHtml.size;
                C24362h.m61210e(mVAdSize, "htmlCreative.size");
                this.f52353g = new HtmlBannerAd(str2, str, new BannerAdCreativeHtml(str3, new AdSize(mVAdSize.width, mVAdSize.height)));
                return;
            }
            MVAdBannerCreative.m20568k((MVAdBannerCreative._Fields) mVAdBannerCreative.setField_);
            throw new RuntimeException("Cannot get field 'html' because union is currently set to html");
        }
        throw new BadResponseException("No banner creative exist.");
    }
}
