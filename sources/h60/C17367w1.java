package h60;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVUpdatePaymentAccountSettingsRequest;
import v40.C25754i;

/* renamed from: h60.w1 */
public final class C17367w1 extends C13778r<C17367w1, C17370x1, MVUpdatePaymentAccountSettingsRequest> {

    /* renamed from: w */
    public final Boolean f44759w;

    public C17367w1(C13752e eVar, Boolean bool) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_settings, C17370x1.class);
        this.f44759w = bool;
        RO mVUpdatePaymentAccountSettingsRequest = new MVUpdatePaymentAccountSettingsRequest();
        if (bool != null) {
            mVUpdatePaymentAccountSettingsRequest.marketingConsent = bool.booleanValue();
            mVUpdatePaymentAccountSettingsRequest.mo30721g();
        }
        this.f33922v = mVUpdatePaymentAccountSettingsRequest;
    }
}
