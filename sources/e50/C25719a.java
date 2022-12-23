package e50;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodInfo;
import com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderType;
import h60.C17353s0;
import p977zz.C20964s0;
import v40.C25754i;

/* renamed from: e50.a */
public final class C25719a extends C13778r<C25719a, C25720b, MVAddPaymentMethodRequest> implements PaymentMethodToken.C16302c<Void, MVAddPaymentMethodInfo> {
    public C25719a(C13752e eVar, ClearanceProviderType clearanceProviderType, PaymentMethodToken paymentMethodToken, boolean z, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_add_payment_method, C25720b.class);
        C21100e.m49373x(clearanceProviderType, "clearanceProviderType");
        C21100e.m49373x(paymentMethodToken, FirebaseMessagingService.EXTRA_TOKEN);
        MVClearanceProviderType q = C17353s0.m43403q(clearanceProviderType);
        String str2 = paymentMethodToken.f42598b;
        MVAddPaymentMethodInfo b = paymentMethodToken.mo48853b(this);
        RO mVAddPaymentMethodRequest = new MVAddPaymentMethodRequest();
        mVAddPaymentMethodRequest.provider = q;
        mVAddPaymentMethodRequest.paymentMethodToken = str2;
        mVAddPaymentMethodRequest.paymentMethod = b;
        mVAddPaymentMethodRequest.makeDefaultPaymentMethod = z;
        mVAddPaymentMethodRequest.mo29481k();
        if (!C20964s0.m49090h(str)) {
            mVAddPaymentMethodRequest.paymentContext = str;
        }
        this.f33922v = mVAddPaymentMethodRequest;
    }
}
