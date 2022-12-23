package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsRequest;
import com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls;
import java.util.concurrent.Callable;
import p810sz.C19617r;
import v40.C25754i;

/* renamed from: h60.s */
public final class C17352s extends C13778r<C17352s, C17356t, MVGetWebInstructionsRequest> implements Callable<C17356t> {
    public C17352s(C13752e eVar, String str, WebInstruction webInstruction) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_get_web_instructions, C17356t.class);
        C21100e.m49373x(webInstruction, "webInstructions");
        C19617r rVar = C17353s0.f44739a;
        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls(webInstruction.f42777b, webInstruction.f42778c, webInstruction.f42779d, webInstruction.f42780e);
        C21100e.m49373x(str, "paymentContext");
        RO mVGetWebInstructionsRequest = new MVGetWebInstructionsRequest();
        mVGetWebInstructionsRequest.paymentContext = str;
        mVGetWebInstructionsRequest.returnUrls = mVTokenizeReturnUrls;
        this.f33922v = mVGetWebInstructionsRequest;
    }

    public final Object call() throws Exception {
        return (C17356t) mo52626J();
    }
}
