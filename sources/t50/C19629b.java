package t50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.clearance.tokenization.TokenizeStatus;
import com.tranzmate.moovit.protocol.payments.MVTokenizeStatus;
import com.tranzmate.moovit.protocol.payments.MVTokenizeStatusResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;
import p810sz.C19617r;

/* renamed from: t50.b */
public final class C19629b extends C13780t<C19628a, C19629b, MVTokenizeStatusResponse> {

    /* renamed from: m */
    public TokenizeStatus f49806m;

    public C19629b() {
        super(MVTokenizeStatusResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        TokenizeStatus tokenizeStatus;
        C19628a aVar2 = (C19628a) aVar;
        MVTokenizeStatus mVTokenizeStatus = ((MVTokenizeStatusResponse) tBase).status;
        C19617r rVar = C17353s0.f44739a;
        int i = C17353s0.C17354a.f44740a[mVTokenizeStatus.ordinal()];
        if (i == 1) {
            tokenizeStatus = TokenizeStatus.SUCCESS;
        } else if (i == 2) {
            tokenizeStatus = TokenizeStatus.REJECTED;
        } else if (i == 3) {
            tokenizeStatus = TokenizeStatus.FAILED;
        } else if (i == 4) {
            tokenizeStatus = TokenizeStatus.CANCELLED;
        } else if (i == 5) {
            tokenizeStatus = TokenizeStatus.NOT_PROCESSED;
        } else {
            throw new IllegalStateException("no such tokenize status exists.");
        }
        this.f49806m = tokenizeStatus;
    }
}
