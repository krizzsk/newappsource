package p736pu;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainActivationRequest;
import p824tp.C19728f;

/* renamed from: pu.n */
public final class C19006n extends C13778r<C19006n, C19007o, MVPTBFinishTrainActivationRequest> {

    /* renamed from: w */
    public final C19728f f48360w;

    public C19006n(C13752e eVar, C19728f fVar, LatLonE6 latLonE6, ServerId serverId, String str, boolean z) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_end_train_activation, C19007o.class);
        this.f48360w = fVar;
        MVLatLon r = C13749c.m34332r(latLonE6);
        int i = serverId.f15142b;
        RO mVPTBFinishTrainActivationRequest = new MVPTBFinishTrainActivationRequest();
        mVPTBFinishTrainActivationRequest.context = "IsraelMot";
        mVPTBFinishTrainActivationRequest.userLocation = r;
        mVPTBFinishTrainActivationRequest.fromStopId = i;
        mVPTBFinishTrainActivationRequest.mo30942k();
        mVPTBFinishTrainActivationRequest.priceReference = str;
        mVPTBFinishTrainActivationRequest.manualClosing = z;
        mVPTBFinishTrainActivationRequest.mo30943l();
        this.f33922v = mVPTBFinishTrainActivationRequest;
    }
}
