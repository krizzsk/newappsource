package n50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.tranzmate.moovit.protocol.payments.MVTokenizeBankResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: n50.c */
public final class C18524c extends C13780t<C18523b, C18524c, MVTokenizeBankResponse> {

    /* renamed from: m */
    public String f47144m;

    /* renamed from: n */
    public String f47145n;

    /* renamed from: o */
    public WebInstruction f47146o;

    /* renamed from: p */
    public String f47147p;

    public C18524c() {
        super(MVTokenizeBankResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVTokenizeBankResponse mVTokenizeBankResponse = (MVTokenizeBankResponse) tBase;
        this.f47144m = mVTokenizeBankResponse.token;
        this.f47145n = mVTokenizeBankResponse.redirectUrl;
        this.f47146o = C17353s0.m43402p(mVTokenizeBankResponse.returnUrls);
        String str = mVTokenizeBankResponse.paymentToken;
        this.f47147p = str;
        if (((C18523b) aVar).f47143w != null && str == null) {
            throw new BadResponseException("Payment token can't be null when payment instructions not null");
        }
    }
}
