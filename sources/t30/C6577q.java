package t30;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRealTimeInfoRequest;
import l30.C5570c0;

/* renamed from: t30.q */
public final class C6577q extends C13778r<C6577q, C6578r, MVMicroMobilityRealTimeInfoRequest> {

    /* renamed from: w */
    public final ServerId f20393w;

    public C6577q(ServerId serverId, C13752e eVar) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_real_time_info, C6578r.class);
        C21100e.m49373x(serverId, "rideId");
        this.f20393w = serverId;
        int i = serverId.f15142b;
        RO mVMicroMobilityRealTimeInfoRequest = new MVMicroMobilityRealTimeInfoRequest();
        mVMicroMobilityRealTimeInfoRequest.rideId = i;
        mVMicroMobilityRealTimeInfoRequest.mo28944g();
        this.f33922v = mVMicroMobilityRealTimeInfoRequest;
    }
}
