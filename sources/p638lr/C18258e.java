package p638lr;

import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.facebook.appevents.C2342l;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVPassengerRidesRequest;
import java.util.ArrayList;

/* renamed from: lr.e */
public final class C18258e extends C13778r<C18258e, C18259f, MVPassengerRidesRequest> {

    /* renamed from: w */
    public final int f46577w;

    public C18258e(C13752e eVar, int i, LatLonE6 latLonE6, ArrayList arrayList) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_get_passenger_rides_path, C18259f.class);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f46577w = i;
        RO mVPassengerRidesRequest = new MVPassengerRidesRequest();
        boolean z5 = true;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        mVPassengerRidesRequest.includeFutureRides = z;
        mVPassengerRidesRequest.mo25773q();
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        mVPassengerRidesRequest.includeActiveRides = z2;
        mVPassengerRidesRequest.mo25771o();
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        mVPassengerRidesRequest.includeRecentlyCompletedRides = z3;
        mVPassengerRidesRequest.mo25775s();
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        mVPassengerRidesRequest.includeHistoricalRides = z4;
        mVPassengerRidesRequest.mo25774r();
        mVPassengerRidesRequest.includeRideRequests = (i & 16) == 0 ? false : z5;
        mVPassengerRidesRequest.mo25776t();
        mVPassengerRidesRequest.includeEventRequests = false;
        mVPassengerRidesRequest.mo25772p();
        if (latLonE6 != null) {
            mVPassengerRidesRequest.currentLocation = C13749c.m34332r(latLonE6);
        }
        if (arrayList != null) {
            mVPassengerRidesRequest.locationsOfInterest = C13720d.m34273c(arrayList, (C13722f) null, new C2342l(0));
        }
        this.f33922v = mVPassengerRidesRequest;
    }
}
