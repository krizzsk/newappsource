package l50;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderType;
import com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodRequest;
import com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls;
import h60.C17353s0;
import java.util.concurrent.Callable;
import p977zz.C20964s0;
import v40.C25754i;

/* renamed from: l50.d */
public final class C18174d extends C13778r<C18174d, C18175e, MVTokenizeExternalPaymentMethodRequest> implements Callable<C18175e> {

    /* renamed from: w */
    public final ClearanceProviderPaymentInstructions f46412w;

    public C18174d(C13752e eVar, ClearanceProviderType clearanceProviderType, WebInstruction webInstruction, String str, ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, boolean z) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_tokenize_external, C18175e.class);
        this.f46412w = clearanceProviderPaymentInstructions;
        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls(webInstruction.f42777b, webInstruction.f42778c, webInstruction.f42779d, webInstruction.f42780e);
        MVClearanceProviderType q = C17353s0.m43403q(clearanceProviderType);
        String x = C20964s0.m49106x(str);
        RO mVTokenizeExternalPaymentMethodRequest = new MVTokenizeExternalPaymentMethodRequest();
        mVTokenizeExternalPaymentMethodRequest.clearanceProvider = q;
        mVTokenizeExternalPaymentMethodRequest.returnUrls = mVTokenizeReturnUrls;
        mVTokenizeExternalPaymentMethodRequest.paymentMethodType = x;
        if (clearanceProviderPaymentInstructions != null) {
            mVTokenizeExternalPaymentMethodRequest.paymentProperties = C17353s0.m43406t(clearanceProviderPaymentInstructions, z);
        }
        this.f33922v = mVTokenizeExternalPaymentMethodRequest;
    }

    public final Object call() throws Exception {
        return (C18175e) mo52626J();
    }
}
