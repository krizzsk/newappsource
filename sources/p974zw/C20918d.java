package p974zw;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p054d0.C4303q;
import p900wt.C20415e;

/* renamed from: zw.d */
public final class C20918d extends C13780t<C20917c, C20918d, MVTodGetZonePickupInfoResponse> {

    /* renamed from: m */
    public TodBookingPickupInformation f52664m;

    public C20918d() {
        super(MVTodGetZonePickupInfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) tBase;
        this.f52664m = new TodBookingPickupInformation(((C20917c) aVar).f52663w, C13720d.m34273c(mVTodGetZonePickupInfoResponse.pickupShapes, (C13722f) null, new C4303q(7)), C13720d.m34273c(mVTodGetZonePickupInfoResponse.pickupStops, (C13722f) null, new C20415e(3)), mVTodGetZonePickupInfoResponse.hasServiceAreas, mVTodGetZonePickupInfoResponse.pickupExplanationURL);
    }
}
