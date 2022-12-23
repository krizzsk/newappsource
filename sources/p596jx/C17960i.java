package p596jx;

import android.location.Location;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.facebook.appevents.C2342l;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRouteRequest;
import java.util.ArrayList;
import java.util.List;
import p502fx.C17124i;

/* renamed from: jx.i */
public final class C17960i extends C13778r<C17960i, C17961j, MVTodRideRouteRequest> {

    /* renamed from: A */
    public static final /* synthetic */ int f46028A = 0;

    /* renamed from: w */
    public final String f46029w;

    /* renamed from: x */
    public final Location f46030x;

    /* renamed from: y */
    public final List<C17124i> f46031y;

    /* renamed from: z */
    public final boolean f46032z = true;

    public C17960i(C13752e eVar, String str, Location location, List list) {
        super(eVar, R.string.api_path_tod_ride_shape, C17961j.class);
        C21100e.m49373x(str, "rideId");
        this.f46029w = str;
        C21100e.m49373x(location, "vehicleLocation");
        this.f46030x = location;
        this.f46031y = list;
        MVGpsLocation t = C13749c.m34334t(location);
        ArrayList c = C13720d.m34273c(list, (C13722f) null, new C2342l(9));
        RO mVTodRideRouteRequest = new MVTodRideRouteRequest();
        mVTodRideRouteRequest.rideId = str;
        mVTodRideRouteRequest.location = t;
        mVTodRideRouteRequest.futureWayPoints = c;
        mVTodRideRouteRequest.isOutOfShape = true;
        mVTodRideRouteRequest.mo33744j();
        this.f33922v = mVTodRideRouteRequest;
    }
}
