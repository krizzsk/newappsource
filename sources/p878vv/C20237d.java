package p878vv;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.app.search.locations.C15300b;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.user.LocaleInfo;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.search.MVSearchRequest;
import org.apache.thrift.TBase;
import p977zz.C20930c;

/* renamed from: vv.d */
public final class C20237d extends C13778r<C20237d, C15300b, TBase<?, ?>> {

    /* renamed from: w */
    public final C20238e f51342w;

    /* renamed from: x */
    public final LatLonE6 f51343x;

    public C20237d(C13752e eVar, C20238e eVar2, LatLonE6 latLonE6) {
        super(eVar, R.string.server_path_search_server_url, R.string.api_path_search_request_search_path, C15300b.class);
        C21100e.m49373x(eVar2, "searchPageToken");
        this.f51342w = eVar2;
        this.f51343x = latLonE6;
        RO mVSearchRequest = new MVSearchRequest(eVar2.f51344a, eVar.f33853b.f50160a.f32927c.f15142b, eVar2.f51345b);
        if (latLonE6 != null) {
            mVSearchRequest.userLocation = C13749c.m34332r(latLonE6);
        }
        if (C20930c.m49020b(eVar.f33852a) != null) {
            mVSearchRequest.locale = C13749c.m34333s(LocaleInfo.m17919b(eVar.f33852a));
        }
        this.f33922v = mVSearchRequest;
    }
}
