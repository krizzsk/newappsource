package l50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: l50.e */
public final class C18175e extends C13780t<C18174d, C18175e, MVTokenizeExternalPaymentMethodResponse> {

    /* renamed from: m */
    public String f46413m;

    /* renamed from: n */
    public String f46414n;

    /* renamed from: o */
    public WebInstruction f46415o;

    /* renamed from: p */
    public String f46416p;

    public C18175e() {
        super(MVTokenizeExternalPaymentMethodResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) tBase;
        this.f46413m = mVTokenizeExternalPaymentMethodResponse.token;
        this.f46414n = mVTokenizeExternalPaymentMethodResponse.redirectUrl;
        this.f46415o = C17353s0.m43402p(mVTokenizeExternalPaymentMethodResponse.returnUrls);
        String str = mVTokenizeExternalPaymentMethodResponse.paymentToken;
        this.f46416p = str;
        if (((C18174d) aVar).f46412w != null && str == null) {
            throw new BadResponseException("Payment token can't be null when payment properties not null");
        }
    }
}
