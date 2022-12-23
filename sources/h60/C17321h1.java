package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationGenerateVerificationCodeRequest;
import v40.C25754i;

/* renamed from: h60.h1 */
public final class C17321h1 extends C13778r<C17321h1, C17324i1, MVPaymentRegistrationGenerateVerificationCodeRequest> {

    /* renamed from: w */
    public final String f44707w;

    /* renamed from: x */
    public final String f44708x;

    /* renamed from: y */
    public final String f44709y;

    public C17321h1(C13752e eVar, String str, String str2, String str3) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_phone_number, C17324i1.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44707w = str;
        C21100e.m49373x(str2, "callingCode");
        this.f44708x = str2;
        C21100e.m49373x(str3, "phoneNumber");
        this.f44709y = str3;
        RO mVPaymentRegistrationGenerateVerificationCodeRequest = new MVPaymentRegistrationGenerateVerificationCodeRequest();
        mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber = str3;
        mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode = str2;
        mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext = str;
        this.f33922v = mVPaymentRegistrationGenerateVerificationCodeRequest;
    }

    /* renamed from: O */
    public final String mo49832O() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17321h1.class, sb, "_");
        sb.append(this.f44707w.hashCode());
        sb.append(this.f44708x.hashCode());
        sb.append(this.f44709y.hashCode());
        return sb.toString();
    }
}
