package t30;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityCancelRideRequest;
import java.util.concurrent.Callable;
import l30.C5570c0;

/* renamed from: t30.c */
public final class C6561c extends C13778r<C6561c, C6562d, MVMicroMobilityCancelRideRequest> implements Callable<C6562d> {
    public C6561c(C13752e eVar, String str, String str2, ServerId serverId) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_cancel_ride, C6562d.class);
        C21100e.m49373x(str, "serviceId");
        C21100e.m49373x(str2, "itemId");
        C21100e.m49373x(serverId, "rideId");
        int i = serverId.f15142b;
        RO mVMicroMobilityCancelRideRequest = new MVMicroMobilityCancelRideRequest();
        mVMicroMobilityCancelRideRequest.serviceId = str;
        mVMicroMobilityCancelRideRequest.itemId = str2;
        mVMicroMobilityCancelRideRequest.rideId = i;
        mVMicroMobilityCancelRideRequest.mo28658i();
        this.f33922v = mVMicroMobilityCancelRideRequest;
    }

    public final Object call() throws Exception {
        return (C6562d) mo52626J();
    }
}
