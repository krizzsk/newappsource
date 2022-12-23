package p369aq;

import com.moovit.ads.HtmlInterstitialAd;
import com.moovit.ads.interstitial.html.InterstitialAdCreativeHtml;
import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.directsales.MVAdInterstitalCreative;
import com.tranzmate.moovit.protocol.directsales.MVAdInterstitialCreativeHtml;
import com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdResponse;
import com.tranzmate.moovit.protocol.directsales.MVInterstitialAd;
import java.net.HttpURLConnection;
import k40.C5481e;
import mf0.C24362h;
import org.apache.thrift.TBase;
import p906wz.C20431c;

/* renamed from: aq.b */
public final class C13505b extends C5481e<C13504a, C13505b, MVGetInterstitialAdResponse> {

    /* renamed from: g */
    public HtmlInterstitialAd f33420g;

    public C13505b() {
        super(MVGetInterstitialAdResponse.class);
    }

    /* renamed from: e */
    public final void mo21366e(C20431c cVar, HttpURLConnection httpURLConnection, TBase tBase) {
        boolean z;
        C13504a aVar = (C13504a) cVar;
        C24362h.m61211f(aVar, "request");
        C24362h.m61211f(httpURLConnection, "connection");
        String str = aVar.f33419r;
        MVInterstitialAd mVInterstitialAd = ((MVGetInterstitialAdResponse) tBase).interstitial;
        C24362h.m61210e(mVInterstitialAd, "responseObj.interstitial");
        C24362h.m61211f(str, "placementId");
        MVAdInterstitalCreative mVAdInterstitalCreative = mVInterstitialAd.creative;
        F f = mVAdInterstitalCreative.setField_;
        F f2 = MVAdInterstitalCreative._Fields.HTML;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str2 = mVInterstitialAd.f25559id;
            C24362h.m61210e(str2, "mvInterstitialAd.id");
            if (mVAdInterstitalCreative.setField_ == f2) {
                MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) mVAdInterstitalCreative.value_;
                C24362h.m61210e(mVAdInterstitialCreativeHtml, "creative.html");
                String str3 = mVAdInterstitialCreativeHtml.html;
                C24362h.m61210e(str3, "htmlCreative.html");
                String str4 = mVAdInterstitialCreativeHtml.redirectCloseUrl;
                C24362h.m61210e(str4, "htmlCreative.redirectCloseUrl");
                this.f33420g = new HtmlInterstitialAd(str2, str, new InterstitialAdCreativeHtml(str3, str4));
                return;
            }
            MVAdInterstitalCreative.m20586k((MVAdInterstitalCreative._Fields) mVAdInterstitalCreative.setField_);
            throw new RuntimeException("Cannot get field 'html' because union is currently set to html");
        }
        throw new BadResponseException("No banner creative exist.");
    }
}
