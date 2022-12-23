package p736pu;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPriceRequest;

/* renamed from: pu.a */
public final class C18992a extends C13778r<C18992a, C18995d, MVPTBFinishTrainEstimatedPriceRequest> {

    /* renamed from: w */
    public final LatLonE6 f48337w;

    public C18992a(C13752e eVar, LatLonE6 latLonE6) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_get_train_estimated_price, C18995d.class);
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f48337w = latLonE6;
        MVLatLon r = C13749c.m34332r(latLonE6);
        RO mVPTBFinishTrainEstimatedPriceRequest = new MVPTBFinishTrainEstimatedPriceRequest();
        mVPTBFinishTrainEstimatedPriceRequest.context = "IsraelMot";
        mVPTBFinishTrainEstimatedPriceRequest.userLocation = r;
        this.f33922v = mVPTBFinishTrainEstimatedPriceRequest;
    }

    /* renamed from: O */
    public final LatLonE6 mo51490O() {
        return this.f48337w;
    }
}
