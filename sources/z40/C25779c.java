package z40;

import c70.C13746a;
import c70.C13780t;
import com.appsflyer.internal.referrer.Payload;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowIntentResponse;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep;
import je0.C23715f;
import mf0.C24362h;
import org.apache.thrift.TBase;

/* renamed from: z40.c */
public final class C25779c extends C13780t<C25778b, C25779c, MVAccountFlowIntentResponse> {

    /* renamed from: m */
    public C23715f f64303m;

    public C25779c() {
        super(MVAccountFlowIntentResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) {
        MVAccountFlowIntentResponse mVAccountFlowIntentResponse = (MVAccountFlowIntentResponse) tBase;
        C24362h.m61211f((C25778b) aVar, "request");
        C24362h.m61211f(mVAccountFlowIntentResponse, Payload.RESPONSE);
        MVAccountFlowStep mVAccountFlowStep = mVAccountFlowIntentResponse.accountFlowStep;
        C24362h.m61210e(mVAccountFlowStep, "response.getAccountFlowStep()");
        this.f64303m = C25776a.m64332a(mVAccountFlowStep);
    }
}
