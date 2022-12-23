package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.payment.registration.steps.p420id.PaymentAccountId;
import com.tranzmate.moovit.protocol.payments.MVIdentificationType;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetIdRequest;
import h60.C17353s0;
import p810sz.C19617r;
import v40.C25754i;

/* renamed from: h60.b1 */
public final class C17303b1 extends C13778r<C17303b1, C17306c1, MVPaymentRegistrationSetIdRequest> {

    /* renamed from: w */
    public final PaymentAccountId f44689w;

    public C17303b1(C13752e eVar, PaymentAccountId paymentAccountId) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_id, C17306c1.class);
        MVIdentificationType mVIdentificationType;
        C21100e.m49373x(paymentAccountId, "id");
        this.f44689w = paymentAccountId;
        PaymentAccountId.IdType idType = paymentAccountId.f42788c;
        C19617r rVar = C17353s0.f44739a;
        int i = C17353s0.C17354a.f44748i[idType.ordinal()];
        if (i == 1) {
            mVIdentificationType = MVIdentificationType.LOCAL_ID;
        } else if (i == 2) {
            mVIdentificationType = MVIdentificationType.LOCAL_PASSPORT;
        } else {
            throw new IllegalStateException("Unknown id type: " + idType);
        }
        String str = paymentAccountId.f42787b;
        RO mVPaymentRegistrationSetIdRequest = new MVPaymentRegistrationSetIdRequest();
        mVPaymentRegistrationSetIdRequest.idType = mVIdentificationType;
        mVPaymentRegistrationSetIdRequest.idNumber = str;
        this.f33922v = mVPaymentRegistrationSetIdRequest;
    }
}
