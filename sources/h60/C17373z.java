package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVResendVerificationTokenRequest;
import v40.C25754i;

/* renamed from: h60.z */
public final class C17373z extends C13778r<C17373z, C17299a0, MVResendVerificationTokenRequest> {

    /* renamed from: w */
    public final String f44761w;

    public C17373z(C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_account_resend_verification_token, C17299a0.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44761w = str;
        RO mVResendVerificationTokenRequest = new MVResendVerificationTokenRequest();
        mVResendVerificationTokenRequest.paymentContext = str;
        this.f33922v = mVResendVerificationTokenRequest;
    }

    /* renamed from: O */
    public final String mo49839O() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17373z.class, sb, "_");
        sb.append(this.f44761w.hashCode());
        return sb.toString();
    }
}
