package t30;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest;
import java.util.concurrent.Callable;
import l30.C5570c0;
import n30.C5847a;

/* renamed from: t30.a */
public final class C6559a extends C13778r<C6559a, C6560b, MVMicroMobilityActionRequest> implements C5847a.C5848a<MVMicroMobilityActionAdditionalInfo>, Callable<C6560b> {
    public C6559a(LatLonE6 latLonE6, C5847a aVar, ServerId serverId, C13752e eVar, String str) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_purchase_action, C6560b.class);
        int i = serverId.f15142b;
        RO mVMicroMobilityActionRequest = new MVMicroMobilityActionRequest();
        mVMicroMobilityActionRequest.rideId = i;
        mVMicroMobilityActionRequest.mo28627j();
        mVMicroMobilityActionRequest.actionId = str;
        if (aVar != null) {
            mVMicroMobilityActionRequest.additionalInfo = aVar.mo21719a(this);
        }
        if (latLonE6 != null) {
            mVMicroMobilityActionRequest.currentUserLocation = C13749c.m34332r(latLonE6);
        }
        this.f33922v = mVMicroMobilityActionRequest;
    }

    public final Object call() throws Exception {
        return (C6560b) mo52626J();
    }
}
