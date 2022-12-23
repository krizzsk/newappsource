package p974zw;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoRequest;
import java.util.concurrent.Callable;

/* renamed from: zw.a */
public final class C20915a extends C13778r<C20915a, C20916b, MVTodGetZoneDropoffInfoRequest> implements Callable<TodBookingDropOffInformation> {
    public C20915a(C13752e eVar, LocationDescriptor locationDescriptor, Long l, String str) {
        super(eVar, R.string.api_path_tod_get_zone_drop_off_info_request, C20916b.class);
        MVLocationDescriptor u = C13749c.m34335u(locationDescriptor);
        RO mVTodGetZoneDropoffInfoRequest = new MVTodGetZoneDropoffInfoRequest();
        mVTodGetZoneDropoffInfoRequest.providerId = str;
        mVTodGetZoneDropoffInfoRequest.pickup = u;
        if (l != null) {
            mVTodGetZoneDropoffInfoRequest.pickupTime = l.longValue();
            mVTodGetZoneDropoffInfoRequest.mo33425i();
        }
        this.f33922v = mVTodGetZoneDropoffInfoRequest;
    }

    public final Object call() throws Exception {
        return ((C20916b) mo52626J()).f52662m;
    }
}
