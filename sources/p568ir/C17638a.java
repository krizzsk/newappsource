package p568ir;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVCalculatePriceRequest;
import com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVLatLon;

/* renamed from: ir.a */
public final class C17638a extends C13778r<C17638a, C17639b, MVCalculatePriceRequest> {
    public C17638a(C13752e eVar, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, long j) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_ride_request_calculate_price, C17639b.class);
        RO mVCalculatePriceRequest = new MVCalculatePriceRequest();
        String str = locationDescriptor.f23651f;
        String g = locationDescriptor.mo24314g();
        MVLatLon r = C13749c.m34332r(locationDescriptor.mo24310d());
        MVRideLocationDescriptor mVRideLocationDescriptor = new MVRideLocationDescriptor();
        mVRideLocationDescriptor.latlon = r;
        mVRideLocationDescriptor.name = str;
        mVRideLocationDescriptor.address = g;
        mVCalculatePriceRequest.pickup = mVRideLocationDescriptor;
        String str2 = locationDescriptor2.f23651f;
        String g2 = locationDescriptor2.mo24314g();
        MVLatLon r2 = C13749c.m34332r(locationDescriptor2.mo24310d());
        MVRideLocationDescriptor mVRideLocationDescriptor2 = new MVRideLocationDescriptor();
        mVRideLocationDescriptor2.latlon = r2;
        mVRideLocationDescriptor2.name = str2;
        mVRideLocationDescriptor2.address = g2;
        mVCalculatePriceRequest.dropoff = mVRideLocationDescriptor2;
        mVCalculatePriceRequest.rideTime = j;
        mVCalculatePriceRequest.mo25398i();
        this.f33922v = mVCalculatePriceRequest;
    }
}
