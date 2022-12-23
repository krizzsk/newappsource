package p804st;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: st.g */
public final class C19536g extends C13780t<C19535f, C19536g, MVEmployeeRegistrationStepsResponse> {

    /* renamed from: m */
    public boolean f49647m = false;

    /* renamed from: n */
    public boolean f49648n = false;

    public C19536g() {
        super(MVEmployeeRegistrationStepsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19535f fVar = (C19535f) aVar;
        MVEmployeeRegistrationStepsResponse mVEmployeeRegistrationStepsResponse = (MVEmployeeRegistrationStepsResponse) tBase;
        if (mVEmployeeRegistrationStepsResponse.mo31135f()) {
            MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = mVEmployeeRegistrationStepsResponse.steps;
            this.f49647m = mVEmployeeRegistrationSteps.phoneVerification;
            this.f49648n = mVEmployeeRegistrationSteps.freeformInformation;
        }
    }
}
