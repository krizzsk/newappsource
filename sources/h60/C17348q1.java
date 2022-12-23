package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVVeriffCompletedRequest;
import v40.C25754i;

/* renamed from: h60.q1 */
public final class C17348q1 extends C13778r<C17348q1, C17351r1, MVVeriffCompletedRequest> {
    public C17348q1(C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_veriff_step_completed, C17351r1.class);
        C21100e.m49373x(str, "paymentContext");
        RO mVVeriffCompletedRequest = new MVVeriffCompletedRequest();
        mVVeriffCompletedRequest.paymentContext = str;
        this.f33922v = mVVeriffCompletedRequest;
    }
}
