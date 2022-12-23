package p596jx;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodBookOrderResponse;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodBookedRide;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: jx.b */
public final class C17953b extends C13780t<C17951a, C17953b, MVTodBookOrderResponse> {

    /* renamed from: m */
    public String f46022m = null;

    /* renamed from: n */
    public PaymentRegistrationInstructions f46023n = null;

    public C17953b() {
        super(MVTodBookOrderResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        String str;
        C17951a aVar2 = (C17951a) aVar;
        MVTodBookOrderResponse mVTodBookOrderResponse = (MVTodBookOrderResponse) tBase;
        F f = mVTodBookOrderResponse.setField_;
        F f2 = MVTodBookOrderResponse._Fields.RIDE;
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
            str = ((MVTodBookedRide) mVTodBookOrderResponse.value_).rideId;
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'ride' because union is currently set to ");
            k.append(MVTodBookOrderResponse.m28931k((MVTodBookOrderResponse._Fields) mVTodBookOrderResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f46022m = str;
        F f3 = MVTodBookOrderResponse._Fields.MISSING_STEPS;
        if (f != f3) {
            z2 = false;
        }
        if (z2) {
            if (f == f3) {
                paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVTodBookOrderResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
                k2.append(MVTodBookOrderResponse.m28931k((MVTodBookOrderResponse._Fields) mVTodBookOrderResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        }
        this.f46023n = paymentRegistrationInstructions;
        if (this.f46022m == null && paymentRegistrationInstructions == null) {
            throw new BadResponseException("rideId nor missingSteps must not be null!");
        } else if (paymentRegistrationInstructions == null) {
            TodRidesProvider.m39562d(this.f51773b.f51759b, "com.moovit.tod_rides_provider.action.book");
        }
    }
}
