package a50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.tranzmate.moovit.protocol.payments.MVCreditCardInstructionsResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: a50.b */
public final class C25543b extends C13780t<C25542a, C25543b, MVCreditCardInstructionsResponse> {

    /* renamed from: m */
    public CreditCardInstructions f63800m;

    public C25543b() {
        super(MVCreditCardInstructionsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        this.f63800m = C17353s0.m43389c(((C25542a) aVar).f63799w, ((MVCreditCardInstructionsResponse) tBase).creditCardInstructions);
    }
}
