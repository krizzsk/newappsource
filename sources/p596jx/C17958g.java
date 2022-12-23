package p596jx;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodGetCancelFeeRequest;

/* renamed from: jx.g */
public final class C17958g extends C13778r<C17958g, C17959h, MVTodGetCancelFeeRequest> {

    /* renamed from: w */
    public final String f46025w;

    public C17958g(C13752e eVar, String str) {
        super(eVar, R.string.api_path_tod_get_cancel_fee_request, C17959h.class);
        C21100e.m49373x(str, "rideId");
        this.f46025w = str;
        RO mVTodGetCancelFeeRequest = new MVTodGetCancelFeeRequest();
        mVTodGetCancelFeeRequest.rideId = str;
        this.f33922v = mVTodGetCancelFeeRequest;
    }
}
