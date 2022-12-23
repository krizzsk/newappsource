package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: h60.t */
public final class C17356t extends C13780t<C17352s, C17356t, MVGetWebInstructionsResponse> {

    /* renamed from: m */
    public String f44756m;

    /* renamed from: n */
    public WebInstruction f44757n;

    public C17356t() {
        super(MVGetWebInstructionsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17352s sVar = (C17352s) aVar;
        MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) tBase;
        String str = mVGetWebInstructionsResponse.url;
        this.f44756m = str;
        if (!C20964s0.m49092j(str)) {
            this.f44757n = C17353s0.m43402p(mVGetWebInstructionsResponse.returnUrls);
            return;
        }
        StringBuilder k = C13555b.m33972k("Missing url: ");
        k.append(this.f44756m);
        throw new BadResponseException(k.toString());
    }
}
