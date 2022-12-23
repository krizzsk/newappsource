package p638lr;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVGetCancelFeeRequest;

/* renamed from: lr.a */
public final class C18254a extends C13778r<C18254a, C18255b, MVGetCancelFeeRequest> {
    public C18254a(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_get_cancellation_fee_path, C18255b.class);
        int i = serverId.f15142b;
        RO mVGetCancelFeeRequest = new MVGetCancelFeeRequest();
        mVGetCancelFeeRequest.rideId = i;
        mVGetCancelFeeRequest.mo25615g();
        this.f33922v = mVGetCancelFeeRequest;
    }
}
