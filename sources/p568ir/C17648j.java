package p568ir;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.carpool.CarpoolRegistrationSteps;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice;
import com.tranzmate.moovit.protocol.carpool.MVCarpoolRegistrationSteps;
import com.tranzmate.moovit.protocol.carpool.MVSetRideRequestResponse;
import com.tranzmate.moovit.protocol.carpool.MVSetRideRequestResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: ir.j */
public final class C17648j extends C13780t<C17647i, C17648j, MVSetRideRequestResponse> {

    /* renamed from: m */
    public ServerId f45368m = null;

    /* renamed from: n */
    public CarpoolRegistrationSteps f45369n = null;

    /* renamed from: o */
    public CurrencyAmount f45370o = null;

    public C17648j() {
        super(MVSetRideRequestResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        boolean z2;
        CarpoolRegistrationSteps carpoolRegistrationSteps;
        C17647i iVar = (C17647i) aVar;
        MVSetRideRequestResult mVSetRideRequestResult = ((MVSetRideRequestResponse) tBase).result;
        if (mVSetRideRequestResult != null) {
            F f = mVSetRideRequestResult.setField_;
            F f2 = MVSetRideRequestResult._Fields.STEPS;
            boolean z3 = true;
            if (f == f2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                F f3 = MVSetRideRequestResult._Fields.PRICE_CHANGED;
                if (f == f3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    F f4 = MVSetRideRequestResult._Fields.NEW_REQUEST_ID;
                    if (f != f4) {
                        z3 = false;
                    }
                    if (!z3) {
                        return;
                    }
                    if (f == f4) {
                        this.f45368m = new ServerId(((Integer) mVSetRideRequestResult.value_).intValue());
                        return;
                    }
                    StringBuilder k = C13555b.m33972k("Cannot get field 'newRequestId' because union is currently set to ");
                    k.append(MVSetRideRequestResult.m19307k((MVSetRideRequestResult._Fields) mVSetRideRequestResult.setField_).f63355a);
                    throw new RuntimeException(k.toString());
                } else if (f == f3) {
                    this.f45370o = C13749c.m34317c((MVCarPoolPrice) mVSetRideRequestResult.value_);
                } else {
                    StringBuilder k2 = C13555b.m33972k("Cannot get field 'priceChanged' because union is currently set to ");
                    k2.append(MVSetRideRequestResult.m19307k((MVSetRideRequestResult._Fields) mVSetRideRequestResult.setField_).f63355a);
                    throw new RuntimeException(k2.toString());
                }
            } else if (f == f2) {
                MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = (MVCarpoolRegistrationSteps) mVSetRideRequestResult.value_;
                if (mVCarpoolRegistrationSteps == null) {
                    carpoolRegistrationSteps = null;
                } else {
                    carpoolRegistrationSteps = new CarpoolRegistrationSteps(mVCarpoolRegistrationSteps.phoneVerification, mVCarpoolRegistrationSteps.facebookLogin, mVCarpoolRegistrationSteps.creditCardInformation);
                }
                this.f45369n = carpoolRegistrationSteps;
            } else {
                StringBuilder k3 = C13555b.m33972k("Cannot get field 'steps' because union is currently set to ");
                k3.append(MVSetRideRequestResult.m19307k((MVSetRideRequestResult._Fields) mVSetRideRequestResult.setField_).f63355a);
                throw new RuntimeException(k3.toString());
            }
        }
    }
}
