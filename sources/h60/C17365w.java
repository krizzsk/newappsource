package h60;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationProfilesListRequest;
import java.util.concurrent.Callable;
import v40.C25754i;

/* renamed from: h60.w */
public final class C17365w extends C13778r<C17365w, C17368x, MVPaymentRegistrationProfilesListRequest> implements Callable<C17368x> {
    public C17365w(C13752e eVar) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_account_get_available_profiles, C17368x.class);
        RO mVPaymentRegistrationProfilesListRequest = new MVPaymentRegistrationProfilesListRequest();
        mVPaymentRegistrationProfilesListRequest.filterDefaultProfiles = true;
        mVPaymentRegistrationProfilesListRequest.mo30334g();
        this.f33922v = mVPaymentRegistrationProfilesListRequest;
    }

    public final Object call() throws Exception {
        return (C17368x) mo52626J();
    }
}
