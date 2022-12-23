package p974zw;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoRequest;
import java.util.concurrent.Callable;

/* renamed from: zw.c */
public final class C20917c extends C13778r<C20917c, C20918d, MVTodGetZonePickupInfoRequest> implements Callable<TodBookingPickupInformation> {

    /* renamed from: w */
    public final String f52663w;

    public C20917c(C13752e eVar, Long l, String str) {
        super(eVar, R.string.api_path_tod_get_zone_pickup_info_request, C20918d.class);
        C21100e.m49373x(str, "providerId");
        this.f52663w = str;
        RO mVTodGetZonePickupInfoRequest = new MVTodGetZonePickupInfoRequest();
        mVTodGetZonePickupInfoRequest.providerId = str;
        if (l != null) {
            mVTodGetZonePickupInfoRequest.pickupTime = l.longValue();
            mVTodGetZonePickupInfoRequest.mo33441h();
        }
        this.f33922v = mVTodGetZonePickupInfoRequest;
    }

    public final Object call() throws Exception {
        return ((C20918d) mo52626J()).f52664m;
    }
}
