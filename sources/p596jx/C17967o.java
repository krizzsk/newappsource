package p596jx;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodAcceptRideUpdateOfferResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: jx.o */
public final class C17967o extends C13780t<C17966n, C17967o, MVTodAcceptRideUpdateOfferResponse> {

    /* renamed from: m */
    public String f46048m = null;

    public C17967o() {
        super(MVTodAcceptRideUpdateOfferResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        String str;
        C17966n nVar = (C17966n) aVar;
        MVTodAcceptRideUpdateOfferResponse mVTodAcceptRideUpdateOfferResponse = (MVTodAcceptRideUpdateOfferResponse) tBase;
        if (mVTodAcceptRideUpdateOfferResponse.mo33344f()) {
            str = mVTodAcceptRideUpdateOfferResponse.ride.rideId;
        } else {
            str = null;
        }
        this.f46048m = str;
        if (str != null) {
            TodRidesProvider.m39562d(this.f51773b.f51759b, "com.moovit.tod_rides_provider.action.book");
            return;
        }
        throw new BadResponseException("rideId must not be null!");
    }
}
