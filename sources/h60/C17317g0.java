package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVEmailCodeVerificationRequest;
import v40.C25754i;

/* renamed from: h60.g0 */
public final class C17317g0 extends C13778r<C17317g0, C17320h0, MVEmailCodeVerificationRequest> {

    /* renamed from: w */
    public final String f44703w;

    /* renamed from: x */
    public final String f44704x;

    public C17317g0(C13752e eVar, String str, String str2) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_email_verification, C17320h0.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44703w = str;
        C21100e.m49373x(str2, "code");
        this.f44704x = str2;
        RO mVEmailCodeVerificationRequest = new MVEmailCodeVerificationRequest();
        mVEmailCodeVerificationRequest.paymentContext = str;
        mVEmailCodeVerificationRequest.code = str2;
        this.f33922v = mVEmailCodeVerificationRequest;
    }
}
