package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: h60.d */
public final class C17307d extends C13780t<C17304c, C17307d, MVAddCreditCardWebUrlResponse> {

    /* renamed from: m */
    public String f44691m;

    /* renamed from: n */
    public WebInstruction f44692n;

    public C17307d() {
        super(MVAddCreditCardWebUrlResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17304c cVar = (C17304c) aVar;
        MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) tBase;
        String str = mVAddCreditCardWebUrlResponse.webViewUrl;
        this.f44691m = str;
        String str2 = mVAddCreditCardWebUrlResponse.completeUrl;
        String str3 = mVAddCreditCardWebUrlResponse.errorUrl;
        if (C20964s0.m49092j(str)) {
            StringBuilder k = C13555b.m33972k("Missing url: ");
            k.append(this.f44691m);
            throw new BadResponseException(k.toString());
        } else if (C20964s0.m49092j(str2)) {
            throw new BadResponseException(C25541a.m63881k("Missing successUrl: ", str2));
        } else if (!C20964s0.m49092j(str3)) {
            this.f44692n = new WebInstruction(str2, str3, str3, str3);
        } else {
            throw new BadResponseException(C25541a.m63881k("Missing failureUrl: ", str3));
        }
    }
}
