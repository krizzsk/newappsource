package p736pu;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: pu.f */
public final class C18997f extends C13780t<C18996e, C18997f, MVPTBGetStationInfoResponse> {

    /* renamed from: m */
    public MotNearestStationInfo f48343m;

    /* renamed from: n */
    public MotActivationPrice f48344n;

    public C18997f() {
        super(MVPTBGetStationInfoResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C18996e eVar = (C18996e) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        aVar2.mo21076c(((MVPTBGetStationInfoResponse) tBase).stopId);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        MotActivationPrice motActivationPrice;
        C18996e eVar = (C18996e) aVar;
        MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) tBase;
        this.f48343m = new MotNearestStationInfo(dVar.mo21064c(new ServerId(mVPTBGetStationInfoResponse.stopId)), C16028g.m40829g(mVPTBGetStationInfoResponse.agencyImage));
        if (mVPTBGetStationInfoResponse.mo31014f()) {
            motActivationPrice = C19000i.m46111b(mVPTBGetStationInfoResponse.activationPrice);
        } else {
            motActivationPrice = null;
        }
        this.f48344n = motActivationPrice;
    }
}
