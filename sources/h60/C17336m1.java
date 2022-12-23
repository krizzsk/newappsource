package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetPangoRequest;
import v40.C25754i;

/* renamed from: h60.m1 */
public final class C17336m1 extends C13778r<C17336m1, C17339n1, MVPaymentRegistrationSetPangoRequest> {

    /* renamed from: w */
    public final String f44723w;

    public C17336m1(C13752e eVar, String str, String str2) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_use_pango_card, C17339n1.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44723w = str;
        RO mVPaymentRegistrationSetPangoRequest = new MVPaymentRegistrationSetPangoRequest();
        mVPaymentRegistrationSetPangoRequest.paymentContext = str;
        mVPaymentRegistrationSetPangoRequest.cvv = str2;
        this.f33922v = mVPaymentRegistrationSetPangoRequest;
    }
}
