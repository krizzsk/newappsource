package p973zv;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.share.ShareEntityLink;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkResponse;
import com.tranzmate.moovit.protocol.share.MVShareEntityLink;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: zv.b */
public final class C20912b extends C13780t<C20911a, C20912b, MVGetShareEntityLinkResponse> {

    /* renamed from: m */
    public ShareEntityLink f52658m;

    public C20912b() {
        super(MVGetShareEntityLinkResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C20911a aVar2 = (C20911a) aVar;
        MVShareEntityLink mVShareEntityLink = ((MVGetShareEntityLinkResponse) tBase).entityLink;
        this.f52658m = new ShareEntityLink(mVShareEntityLink.displayTitle, mVShareEntityLink.displayMessage, mVShareEntityLink.url);
    }
}
