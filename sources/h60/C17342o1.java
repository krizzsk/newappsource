package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVGetVeriffSessionUrlRequest;
import v40.C25754i;

/* renamed from: h60.o1 */
public final class C17342o1 extends C13778r<C17342o1, C17345p1, MVGetVeriffSessionUrlRequest> {
    public C17342o1(C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_veriff_get_session_url, C17345p1.class);
        RO mVGetVeriffSessionUrlRequest = new MVGetVeriffSessionUrlRequest();
        C21100e.m49373x(str, "paymentContext");
        mVGetVeriffSessionUrlRequest.paymentContext = str;
        this.f33922v = mVGetVeriffSessionUrlRequest;
    }
}
