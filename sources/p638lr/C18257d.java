package p638lr;

import c70.C13746a;
import c70.C13780t;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.C15725a;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse;
import com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerRide;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: lr.d */
public final class C18257d extends C13780t<C18256c, C18257d, MVPassengerGetRideResponse> {

    /* renamed from: m */
    public FutureCarpoolRide f46574m = null;

    /* renamed from: n */
    public ActiveCarpoolRide f46575n = null;

    /* renamed from: o */
    public HistoricalCarpoolRide f46576o = null;

    public C18257d() {
        super(MVPassengerGetRideResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        boolean z2;
        C18256c cVar = (C18256c) aVar;
        MVPassengerGetRideResponse mVPassengerGetRideResponse = (MVPassengerGetRideResponse) tBase;
        CarpoolDriver a = C15725a.m40154a(mVPassengerGetRideResponse.driver);
        MVPassengerRide mVPassengerRide = mVPassengerGetRideResponse.ride;
        F f = mVPassengerRide.setField_;
        F f2 = MVPassengerRide._Fields.FUTURE_RIDE;
        boolean z3 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            F f3 = MVPassengerRide._Fields.ACTIVE_RIDE;
            if (f == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                F f4 = MVPassengerRide._Fields.HISTORICAL_RIDE;
                if (f != f4) {
                    z3 = false;
                }
                if (!z3) {
                    StringBuilder k = C13555b.m33972k("No rides were set for ride id ");
                    k.append(cVar.f46573w);
                    throw new BadResponseException(k.toString());
                } else if (f == f4) {
                    MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) mVPassengerRide.value_;
                    this.f46576o = new HistoricalCarpoolRide(C15725a.m40159f(mVPassengerHistoricalRide.ride, a), mVPassengerHistoricalRide.isCanceled, mVPassengerHistoricalRide.canReportMissing, mVPassengerHistoricalRide.canRate, C15725a.m40158e(mVPassengerHistoricalRide.stops));
                } else {
                    StringBuilder k2 = C13555b.m33972k("Cannot get field 'historicalRide' because union is currently set to ");
                    k2.append(MVPassengerRide.m19086k((MVPassengerRide._Fields) mVPassengerRide.setField_).f63355a);
                    throw new RuntimeException(k2.toString());
                }
            } else if (f == f3) {
                MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) mVPassengerRide.value_;
                this.f46575n = new ActiveCarpoolRide(C15725a.m40159f(mVPassengerActiveRide.ride, a), mVPassengerActiveRide.canReportMissing, mVPassengerActiveRide.canRate, C15725a.m40158e(mVPassengerActiveRide.stops));
            } else {
                StringBuilder k3 = C13555b.m33972k("Cannot get field 'activeRide' because union is currently set to ");
                k3.append(MVPassengerRide.m19086k((MVPassengerRide._Fields) mVPassengerRide.setField_).f63355a);
                throw new RuntimeException(k3.toString());
            }
        } else if (f == f2) {
            this.f46574m = C15725a.m40155b((MVPassengerFutureRide) mVPassengerRide.value_, a);
        } else {
            StringBuilder k4 = C13555b.m33972k("Cannot get field 'futureRide' because union is currently set to ");
            k4.append(MVPassengerRide.m19086k((MVPassengerRide._Fields) mVPassengerRide.setField_).f63355a);
            throw new RuntimeException(k4.toString());
        }
    }
}
