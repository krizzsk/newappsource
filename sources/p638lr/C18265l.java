package p638lr;

import android.location.Location;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVPassegerRideReportRequest;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;

/* renamed from: lr.l */
public final class C18265l extends C13778r<C18265l, C18266m, MVPassegerRideReportRequest> {
    public C18265l(C13752e eVar, ServerId serverId, boolean z, byte b, Location location) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_ride_report_path, C18266m.class);
        RO mVPassegerRideReportRequest = new MVPassegerRideReportRequest();
        mVPassegerRideReportRequest.rideId = serverId.f15142b;
        mVPassegerRideReportRequest.mo25686k();
        mVPassegerRideReportRequest.wasPickedUp = z;
        mVPassegerRideReportRequest.mo25687l();
        mVPassegerRideReportRequest.driverRating = b;
        mVPassegerRideReportRequest.mo25685j();
        MVGpsLocation t = C13749c.m34334t(location);
        if (t != null) {
            mVPassegerRideReportRequest.userLocation = t;
        }
        this.f33922v = mVPassegerRideReportRequest;
    }
}
