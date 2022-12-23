package p10;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: p10.f */
public final class C18871f extends C13780t<C18870e, C18871f, MVGetCertificateImageUploadUrlResponse> {

    /* renamed from: m */
    public String f48040m;

    public C18871f() {
        super(MVGetCertificateImageUploadUrlResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18870e eVar = (C18870e) aVar;
        this.f48040m = ((MVGetCertificateImageUploadUrlResponse) tBase).url;
    }
}
