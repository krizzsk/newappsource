package p638lr;

import c70.C13746a;
import c70.C13780t;
import com.moovit.carpool.CarpoolRegistrationSteps;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.carpool.MVCarpoolRegistrationSteps;
import com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: lr.r */
public final class C18271r extends C13780t<C18270q, C18271r, MVPassengerUpdateInterestResponse> {

    /* renamed from: m */
    public CarpoolRegistrationSteps f46601m;

    public C18271r() {
        super(MVPassengerUpdateInterestResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        CarpoolRegistrationSteps carpoolRegistrationSteps;
        C18270q qVar = (C18270q) aVar;
        MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) tBase;
        if (mVPassengerUpdateInterestResponse.mo25826f()) {
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = mVPassengerUpdateInterestResponse.steps;
            if (mVCarpoolRegistrationSteps == null) {
                carpoolRegistrationSteps = null;
            } else {
                carpoolRegistrationSteps = new CarpoolRegistrationSteps(mVCarpoolRegistrationSteps.phoneVerification, mVCarpoolRegistrationSteps.facebookLogin, mVCarpoolRegistrationSteps.creditCardInformation);
            }
            this.f46601m = carpoolRegistrationSteps;
        }
    }
}
