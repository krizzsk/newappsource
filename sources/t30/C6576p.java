package t30;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: t30.p */
public final class C6576p extends C13780t<C6575o, C6576p, MVMicroMobilityPurchaseCompleteStepResponse> {

    /* renamed from: m */
    public MicroMobilityPurchaseStep f20392m;

    public C6576p() {
        super(MVMicroMobilityPurchaseCompleteStepResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C6575o oVar = (C6575o) aVar;
        MVMicroMobilityPurchaseCompleteStepResponse mVMicroMobilityPurchaseCompleteStepResponse = (MVMicroMobilityPurchaseCompleteStepResponse) tBase;
        this.f20392m = C6569j.m15500a(mVMicroMobilityPurchaseCompleteStepResponse.contextId, mVMicroMobilityPurchaseCompleteStepResponse.analyticKey, mVMicroMobilityPurchaseCompleteStepResponse.nextStep);
    }
}
