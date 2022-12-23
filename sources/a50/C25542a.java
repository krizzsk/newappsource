package a50;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVCreditCardInstructionsRequest;
import v40.C25754i;

/* renamed from: a50.a */
public final class C25542a extends C13778r<C25542a, C25543b, MVCreditCardInstructionsRequest> {

    /* renamed from: w */
    public final String f63799w;

    public C25542a(C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_get_credit_card_instructions, C25543b.class);
        this.f63799w = str;
        RO mVCreditCardInstructionsRequest = new MVCreditCardInstructionsRequest();
        if (str != null) {
            mVCreditCardInstructionsRequest.paymentContext = str;
        }
        this.f33922v = mVCreditCardInstructionsRequest;
    }
}
