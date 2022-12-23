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
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationByLocationRequest;
import p824tp.C19728f;

/* renamed from: pu.l */
public final class C19004l extends C13778r<C19004l, C19005m, MVPTBSetActivationByLocationRequest> {

    /* renamed from: w */
    public final C19728f f48355w;

    /* renamed from: x */
    public final LatLonE6 f48356x;

    /* renamed from: y */
    public final TransitType.VehicleType f48357y;

    /* renamed from: z */
    public final int f48358z;

    public C19004l(C13752e eVar, C19728f fVar, LatLonE6 latLonE6, TransitType.VehicleType vehicleType, int i) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_set_activation_by_location, C19005m.class);
        this.f48355w = fVar;
        C21100e.m49373x(latLonE6, "scanLocation");
        this.f48356x = latLonE6;
        C21100e.m49373x(vehicleType, "vehicleType");
        this.f48357y = vehicleType;
        this.f48358z = i;
        MVLatLon r = C13749c.m34332r(latLonE6);
        MVRouteType k = C7841a.m17873k(vehicleType);
        RO mVPTBSetActivationByLocationRequest = new MVPTBSetActivationByLocationRequest();
        mVPTBSetActivationByLocationRequest.context = "IsraelMot";
        mVPTBSetActivationByLocationRequest.userLocation = r;
        mVPTBSetActivationByLocationRequest.numberOfTickets = i;
        mVPTBSetActivationByLocationRequest.mo31055k();
        mVPTBSetActivationByLocationRequest.transitType = k;
        this.f33922v = mVPTBSetActivationByLocationRequest;
    }

    /* renamed from: O */
    public final String mo51491O() {
        return C19004l.class.getName() + this.f48356x + this.f48357y + this.f48358z;
    }
}
