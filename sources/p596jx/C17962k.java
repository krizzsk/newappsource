package p596jx;

import android.location.Location;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.itinerary.C16080a;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTime;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderRequest;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget;
import java.util.ArrayList;
import java.util.Map;
import p531he.C17399f0;

/* renamed from: jx.k */
public final class C17962k extends C13778r<C17962k, C17963l, MVTodOrderRequest> {

    /* renamed from: B */
    public static final /* synthetic */ int f46034B = 0;

    /* renamed from: A */
    public final String f46035A;

    /* renamed from: w */
    public final LocationDescriptor f46036w;

    /* renamed from: x */
    public final LocationDescriptor f46037x;

    /* renamed from: y */
    public final TripPlannerTime f46038y;

    /* renamed from: z */
    public final String f46039z;

    public C17962k(C13752e eVar, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, TripPlannerTime tripPlannerTime, int i, int i2, String str, Location location, Map<ServerId, Integer> map, String str2, String str3) {
        super(eVar, R.string.api_path_tod_order_request, C17963l.class);
        this.f46036w = locationDescriptor;
        this.f46037x = locationDescriptor2;
        this.f46038y = tripPlannerTime;
        this.f46039z = str;
        this.f46035A = str2;
        MVLocationTarget r = C16080a.m40962r(locationDescriptor);
        MVLocationTarget r2 = C16080a.m40962r(locationDescriptor2);
        RO mVTodOrderRequest = new MVTodOrderRequest();
        mVTodOrderRequest.origin = r;
        mVTodOrderRequest.destination = r2;
        mVTodOrderRequest.numberOfPassengers = i;
        mVTodOrderRequest.mo33491E();
        mVTodOrderRequest.numberOfAccessiblePassengers = i2;
        mVTodOrderRequest.mo33490D();
        if (location != null) {
            mVTodOrderRequest.userLocation = C13749c.m34334t(location);
        }
        if (str != null) {
            mVTodOrderRequest.providerCustomerId = str;
        }
        if (!tripPlannerTime.mo24489d()) {
            mVTodOrderRequest.time = tripPlannerTime.mo24487b();
            mVTodOrderRequest.mo33493G();
            mVTodOrderRequest.timeType = C16080a.m40967w(tripPlannerTime.f23799b);
        }
        if (!C13717b.m34259f(map)) {
            ArrayList arrayList = new ArrayList(map.size());
            C13720d.m34276f(map.entrySet(), (C13722f) null, new C17399f0(this, 1), arrayList);
            mVTodOrderRequest.additionalPassengersProfiles = arrayList;
        }
        if (str2 != null) {
            mVTodOrderRequest.discountContextId = str2;
        }
        if (str3 != null) {
            mVTodOrderRequest.additionalData = str3;
        }
        this.f33922v = mVTodOrderRequest;
    }
}
