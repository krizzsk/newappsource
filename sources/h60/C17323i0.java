package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVEmailVerificationRequest;
import v40.C25754i;

/* renamed from: h60.i0 */
public final class C17323i0 extends C13778r<C17323i0, C17326j0, MVEmailVerificationRequest> {

    /* renamed from: w */
    public final String f44713w;

    /* renamed from: x */
    public final String f44714x;

    public C17323i0(C13752e eVar, String str, String str2) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_email_generate_verification_code, C17326j0.class);
        C21100e.m49373x(str2, "email");
        this.f44714x = str2;
        C21100e.m49373x(str, "paymentContext");
        this.f44713w = str;
        RO mVEmailVerificationRequest = new MVEmailVerificationRequest();
        mVEmailVerificationRequest.email = str2;
        mVEmailVerificationRequest.paymentContext = str;
        this.f33922v = mVEmailVerificationRequest;
    }

    /* renamed from: O */
    public final String mo49833O() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17323i0.class, sb, "_");
        sb.append(this.f44713w);
        sb.append(this.f44714x);
        return sb.toString();
    }
}
