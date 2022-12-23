package p974zw;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.facebook.appevents.C2342l;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation;
import com.moovit.app.tod.bookingflow.model.TodZoneDropOffRestrictions;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p826tr.C19752b;

/* renamed from: zw.b */
public final class C20916b extends C13780t<C20915a, C20916b, MVTodGetZoneDropoffInfoResponse> {

    /* renamed from: m */
    public TodBookingDropOffInformation f52662m;

    public C20916b() {
        super(MVTodGetZoneDropoffInfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C20915a aVar2 = (C20915a) aVar;
        MVTodGetZoneDropoffInfoResponse mVTodGetZoneDropoffInfoResponse = (MVTodGetZoneDropoffInfoResponse) tBase;
        this.f52662m = new TodBookingDropOffInformation(C13720d.m34273c(mVTodGetZoneDropoffInfoResponse.dropoffShapes, (C13722f) null, new C19752b(6)), C13720d.m34273c(mVTodGetZoneDropoffInfoResponse.dropOffStops, (C13722f) null, new C2342l(8)), new TodZoneDropOffRestrictions(mVTodGetZoneDropoffInfoResponse.restrictions.minDistanceToPickup), mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL);
    }
}
