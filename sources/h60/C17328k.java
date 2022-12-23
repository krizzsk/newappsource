package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVCompleteWebStepRequest;
import v40.C25754i;

/* renamed from: h60.k */
public final class C17328k extends C13778r<C17328k, C17331l, MVCompleteWebStepRequest> {

    /* renamed from: w */
    public final String f44717w;

    /* renamed from: x */
    public final String f44718x;

    public C17328k(C13752e eVar, String str, String str2) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_complete_web_step, C17331l.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44717w = str;
        C21100e.m49373x(str2, "successUrl");
        this.f44718x = str2;
        RO mVCompleteWebStepRequest = new MVCompleteWebStepRequest();
        mVCompleteWebStepRequest.paymentContext = str;
        mVCompleteWebStepRequest.successUrl = str2;
        this.f33922v = mVCompleteWebStepRequest;
    }
}
