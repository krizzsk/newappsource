package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationRequest;
import v40.C25754i;

/* renamed from: h60.q0 */
public final class C17347q0 extends C13778r<C17347q0, C17350r0, MVPaymentRegistrationVerificationRequest> {

    /* renamed from: w */
    public final String f44731w;

    /* renamed from: x */
    public final String f44732x;

    /* renamed from: y */
    public final boolean f44733y;

    public C17347q0(C13752e eVar, String str, String str2, boolean z) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_verify_phone_number_code, C17350r0.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44731w = str;
        C21100e.m49373x(str2, "code");
        this.f44732x = str2;
        this.f44733y = z;
        RO mVPaymentRegistrationVerificationRequest = new MVPaymentRegistrationVerificationRequest();
        mVPaymentRegistrationVerificationRequest.paymentContext = str;
        mVPaymentRegistrationVerificationRequest.code = str2;
        mVPaymentRegistrationVerificationRequest.leaveIfExist = !z;
        mVPaymentRegistrationVerificationRequest.mo30392i();
        this.f33922v = mVPaymentRegistrationVerificationRequest;
    }
}
