package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVPaymentTOSConfirmationRequest;
import v40.C25754i;

/* renamed from: h60.v0 */
public final class C17363v0 extends C13778r<C17363v0, C17366w0, MVPaymentTOSConfirmationRequest> {
    public C17363v0(int i, C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_tos_accepted, C17366w0.class);
        C21100e.m49373x(str, "paymentContext");
        RO mVPaymentTOSConfirmationRequest = new MVPaymentTOSConfirmationRequest();
        mVPaymentTOSConfirmationRequest.paymentContext = str;
        mVPaymentTOSConfirmationRequest.version = i;
        mVPaymentTOSConfirmationRequest.mo30452h();
        this.f33922v = mVPaymentTOSConfirmationRequest;
    }
}
