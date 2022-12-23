package t30;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: t30.n */
public final class C6574n extends C13780t<C6573m, C6574n, MVMicroMobilityPurchaseIntentResponse> {

    /* renamed from: m */
    public MicroMobilityPurchaseStep f20391m;

    public C6574n() {
        super(MVMicroMobilityPurchaseIntentResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C6573m mVar = (C6573m) aVar;
        MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) tBase;
        this.f20391m = C6569j.m15500a(mVMicroMobilityPurchaseIntentResponse.contextId, mVMicroMobilityPurchaseIntentResponse.analyticKey, mVMicroMobilityPurchaseIntentResponse.step);
    }
}
