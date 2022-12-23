package p596jx;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.tod.model.TodRideUpdateOffer;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationResponse;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideUpdateOffer;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: jx.q */
public final class C17969q extends C13780t<C17968p, C17969q, MVTodChangeRideDestinationResponse> {

    /* renamed from: m */
    public TodRideUpdateOffer f46051m;

    public C17969q() {
        super(MVTodChangeRideDestinationResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17968p pVar = (C17968p) aVar;
        MVTodRideUpdateOffer mVTodRideUpdateOffer = ((MVTodChangeRideDestinationResponse) tBase).offer;
        this.f46051m = new TodRideUpdateOffer(mVTodRideUpdateOffer.offerId, C13749c.m34324j(mVTodRideUpdateOffer.newDropoff, (MVLocationSourceType) null), C13749c.m34324j(mVTodRideUpdateOffer.newDestination, (MVLocationSourceType) null), mVTodRideUpdateOffer.newEta, mVTodRideUpdateOffer.previousEta, C13749c.m34318d(mVTodRideUpdateOffer.newPrice), C13749c.m34318d(mVTodRideUpdateOffer.previousPrice));
    }
}
