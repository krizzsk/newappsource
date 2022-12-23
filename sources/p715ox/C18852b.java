package p715ox;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodBookedRide;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: ox.b */
public final class C18852b extends C13780t<C18851a, C18852b, MVTodBookTripOrderResponse> {

    /* renamed from: m */
    public String f47997m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f47998n;

    public C18852b() {
        super(MVTodBookTripOrderResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        String str;
        C18851a aVar2 = (C18851a) aVar;
        MVTodBookTripOrderResponse mVTodBookTripOrderResponse = (MVTodBookTripOrderResponse) tBase;
        F f = mVTodBookTripOrderResponse.setField_;
        F f2 = MVTodBookTripOrderResponse._Fields.RIDE;
        boolean z2 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        PaymentRegistrationInstructions paymentRegistrationInstructions = null;
        if (!z) {
            str = null;
        } else if (f == f2) {
            str = ((MVTodBookedRide) mVTodBookTripOrderResponse.value_).rideId;
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'ride' because union is currently set to ");
            k.append(MVTodBookTripOrderResponse.m29690k((MVTodBookTripOrderResponse._Fields) mVTodBookTripOrderResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f47997m = str;
        F f3 = MVTodBookTripOrderResponse._Fields.MISSING_STEPS;
        if (f != f3) {
            z2 = false;
        }
        if (z2) {
            if (f == f3) {
                paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVTodBookTripOrderResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
                k2.append(MVTodBookTripOrderResponse.m29690k((MVTodBookTripOrderResponse._Fields) mVTodBookTripOrderResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        }
        this.f47998n = paymentRegistrationInstructions;
        if (paymentRegistrationInstructions == null) {
            TodRidesProvider.m39562d(this.f51773b.f51759b, "com.moovit.tod_rides_provider.action.book");
        }
    }
}
