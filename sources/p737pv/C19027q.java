package p737pv;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVSuggestionRequest;

/* renamed from: pv.q */
public final class C19027q extends C13778r<C19027q, C19028r, MVSuggestionRequest> {

    /* renamed from: w */
    public final LatLonE6 f48393w;

    public C19027q(C13752e eVar, LatLonE6 latLonE6) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_suggestions_request, C19028r.class);
        this.f48393w = latLonE6;
        RO mVSuggestionRequest = new MVSuggestionRequest();
        if (latLonE6 != null) {
            mVSuggestionRequest.userLocation = C13749c.m34332r(latLonE6);
        }
        this.f33922v = mVSuggestionRequest;
    }
}
