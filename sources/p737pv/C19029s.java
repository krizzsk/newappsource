package p737pv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVPassengerRidesRequest;

/* renamed from: pv.s */
public final class C19029s extends C13778r<C19029s, C19030t, MVPassengerRidesRequest> {

    /* renamed from: w */
    public final int f48395w;

    public C19029s(C13752e eVar, int i) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_events_request, C19030t.class);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f48395w = i;
        RO mVPassengerRidesRequest = new MVPassengerRidesRequest();
        boolean z6 = true;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        mVPassengerRidesRequest.includeFutureRides = z;
        mVPassengerRidesRequest.mo25773q();
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        mVPassengerRidesRequest.includeActiveRides = z2;
        mVPassengerRidesRequest.mo25771o();
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        mVPassengerRidesRequest.includeRecentlyCompletedRides = z3;
        mVPassengerRidesRequest.mo25775s();
        if ((i & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        mVPassengerRidesRequest.includeHistoricalRides = z4;
        mVPassengerRidesRequest.mo25774r();
        if ((i & 1) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        mVPassengerRidesRequest.includeRideRequests = z5;
        mVPassengerRidesRequest.mo25776t();
        mVPassengerRidesRequest.includeEventRequests = (i & 1) == 0 ? false : z6;
        mVPassengerRidesRequest.mo25772p();
        this.f33922v = mVPassengerRidesRequest;
    }
}
