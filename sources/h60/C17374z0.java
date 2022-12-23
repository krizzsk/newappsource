package h60;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetBirthDateRequest;
import v40.C25754i;

/* renamed from: h60.z0 */
public final class C17374z0 extends C13778r<C17374z0, C17300a1, MVPaymentRegistrationSetBirthDateRequest> {

    /* renamed from: w */
    public final long f44762w;

    public C17374z0(C13752e eVar, long j) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_birth_date, C17300a1.class);
        this.f44762w = j;
        RO mVPaymentRegistrationSetBirthDateRequest = new MVPaymentRegistrationSetBirthDateRequest();
        mVPaymentRegistrationSetBirthDateRequest.birthDate = j;
        mVPaymentRegistrationSetBirthDateRequest.mo30353g();
        this.f33922v = mVPaymentRegistrationSetBirthDateRequest;
    }
}
