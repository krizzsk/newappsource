package p736pu;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.C7841a;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoRequest;

/* renamed from: pu.e */
public final class C18996e extends C13778r<C18996e, C18997f, MVPTBGetStationInfoRequest> {

    /* renamed from: w */
    public final LatLonE6 f48342w;

    public C18996e(C13752e eVar, LatLonE6 latLonE6, TransitType.VehicleType vehicleType) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_get_station_info, C18997f.class);
        C21100e.m49373x(latLonE6, "userLocation");
        this.f48342w = latLonE6;
        C21100e.m49373x(vehicleType, "vehicleType");
        MVLatLon r = C13749c.m34332r(latLonE6);
        MVRouteType k = C7841a.m17873k(vehicleType);
        RO mVPTBGetStationInfoRequest = new MVPTBGetStationInfoRequest();
        mVPTBGetStationInfoRequest.userLocation = r;
        mVPTBGetStationInfoRequest.transitType = k;
        this.f33922v = mVPTBGetStationInfoRequest;
    }
}
