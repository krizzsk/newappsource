package t50;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.clearance.tokenization.TokenizeStatus;
import com.tranzmate.moovit.protocol.payments.MVTokenizeStatusRequest;
import java.util.concurrent.Callable;
import v40.C25754i;

/* renamed from: t50.a */
public final class C19628a extends C13778r<C19628a, C19629b, MVTokenizeStatusRequest> implements Callable<TokenizeStatus> {
    public C19628a(C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_tokenize_status, C19629b.class);
        RO mVTokenizeStatusRequest = new MVTokenizeStatusRequest();
        mVTokenizeStatusRequest.paymentToken = str;
        this.f33922v = mVTokenizeStatusRequest;
    }

    public final Object call() throws Exception {
        return ((C19629b) mo52626J()).f49806m;
    }
}
