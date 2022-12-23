package p423cq;

import com.moovit.ads.AdSize;
import com.moovit.ads.HtmlMapItemAd;
import com.moovit.ads.mapitem.html.MapItemAdCreativeHtml;
import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.directsales.MVAdSize;
import com.tranzmate.moovit.protocol.directsales.MVGetMapItemAdResponse;
import com.tranzmate.moovit.protocol.directsales.MVMapItemAd;
import com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreative;
import com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreativeHtml;
import java.net.HttpURLConnection;
import k40.C5481e;
import mf0.C24362h;
import org.apache.thrift.TBase;
import p906wz.C20431c;

/* renamed from: cq.b */
public final class C16472b extends C5481e<C16471a, C16472b, MVGetMapItemAdResponse> {

    /* renamed from: g */
    public HtmlMapItemAd f43065g;

    public C16472b() {
        super(MVGetMapItemAdResponse.class);
    }

    /* renamed from: e */
    public final void mo21366e(C20431c cVar, HttpURLConnection httpURLConnection, TBase tBase) {
        boolean z;
        String str;
        C16471a aVar = (C16471a) cVar;
        C24362h.m61211f(aVar, "request");
        C24362h.m61211f(httpURLConnection, "connection");
        String str2 = aVar.f43064r;
        MVMapItemAd mVMapItemAd = ((MVGetMapItemAdResponse) tBase).mapItemAd;
        C24362h.m61210e(mVMapItemAd, "responseObj.mapItemAd");
        C24362h.m61211f(str2, "placementId");
        MVMapItemAdCreative mVMapItemAdCreative = mVMapItemAd.creative;
        F f = mVMapItemAdCreative.setField_;
        F f2 = MVMapItemAdCreative._Fields.HTML;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str3 = mVMapItemAd.f25566id;
            C24362h.m61210e(str3, "mvMapItemAd.id");
            if (mVMapItemAdCreative.setField_ == f2) {
                MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) mVMapItemAdCreative.value_;
                C24362h.m61210e(mVMapItemAdCreativeHtml, "creative.html");
                if (mVMapItemAdCreativeHtml.mo27115g()) {
                    str = mVMapItemAdCreativeHtml.redirectCloseUrl;
                } else {
                    str = null;
                }
                String str4 = mVMapItemAdCreativeHtml.html;
                C24362h.m61210e(str4, "htmlCreative.html");
                MVAdSize mVAdSize = mVMapItemAdCreativeHtml.size;
                C24362h.m61210e(mVAdSize, "htmlCreative.size");
                this.f43065g = new HtmlMapItemAd(str3, str2, new MapItemAdCreativeHtml(new AdSize(mVAdSize.width, mVAdSize.height), str4, str));
                return;
            }
            MVMapItemAdCreative.m20725k((MVMapItemAdCreative._Fields) mVMapItemAdCreative.setField_);
            throw new RuntimeException("Cannot get field 'html' because union is currently set to html");
        }
        throw new BadResponseException("No banner creative exist.");
    }
}
