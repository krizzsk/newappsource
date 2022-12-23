package t30;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationRequest;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import h60.C17353s0;
import java.util.concurrent.Callable;
import l30.C5570c0;

/* renamed from: t30.k */
public final class C6571k extends C13778r<C6571k, C6572l, MVMicroMobilityPurchaseConfirmationRequest> implements Callable<C6572l>, PaymentGatewayToken.C16326a<MVMicroMobilityPurchaseConfirmationRequest, Void> {
    public C6571k(LatLonE6 latLonE6, PaymentGatewayToken paymentGatewayToken, C13752e eVar, String str, String str2) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_purchase_confirmation, C6572l.class);
        RO mVMicroMobilityPurchaseConfirmationRequest = new MVMicroMobilityPurchaseConfirmationRequest();
        mVMicroMobilityPurchaseConfirmationRequest.contextId = str;
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVMicroMobilityPurchaseConfirmationRequest);
        }
        if (str2 != null) {
            mVMicroMobilityPurchaseConfirmationRequest.discountContextId = str2;
        }
        if (latLonE6 != null) {
            mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation = C13749c.m34332r(latLonE6);
        }
        this.f33922v = mVMicroMobilityPurchaseConfirmationRequest;
        this.f51770m = new C14291m0(eVar, "micro_mobility_purchase");
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVMicroMobilityPurchaseConfirmationRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    public final Object call() throws Exception {
        return (C6572l) mo52626J();
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVMicroMobilityPurchaseConfirmationRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        ((MVMicroMobilityPurchaseConfirmationRequest) obj).paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVMicroMobilityPurchaseConfirmationRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
