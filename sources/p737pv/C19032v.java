package p737pv;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationStepsResponse;
import d70.C16536a;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: pv.v */
public final class C19032v extends C13780t<C19031u, C19032v, MVEventRegistrationStepsResponse> {

    /* renamed from: m */
    public RideSharingRegistrationSteps f48401m = null;

    public C19032v() {
        super(MVEventRegistrationStepsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19031u uVar = (C19031u) aVar;
        MVEventRegistrationStepsResponse mVEventRegistrationStepsResponse = (MVEventRegistrationStepsResponse) tBase;
        if (mVEventRegistrationStepsResponse.mo31157f()) {
            this.f48401m = C16536a.m42036h(mVEventRegistrationStepsResponse.steps);
        }
    }
}
