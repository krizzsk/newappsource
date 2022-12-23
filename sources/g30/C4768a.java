package g30;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.metroinfo.MVFindMetroByLocationRequest;
import p824tp.C19746x;

/* renamed from: g30.a */
public final class C4768a extends C13778r<C4768a, C4769b, MVFindMetroByLocationRequest> {

    /* renamed from: w */
    public final LatLonE6 f16113w;

    public C4768a(C13752e eVar, LatLonE6 latLonE6) {
        super(eVar, C19746x.api_path_find_metro, C4769b.class);
        this.f16113w = latLonE6;
        MVLatLon r = C13749c.m34332r(latLonE6);
        RO mVFindMetroByLocationRequest = new MVFindMetroByLocationRequest();
        mVFindMetroByLocationRequest.userLocation = r;
        this.f33922v = mVFindMetroByLocationRequest;
    }
}
