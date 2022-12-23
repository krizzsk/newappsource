package p715ox;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderRequest;

/* renamed from: ox.c */
public final class C18853c extends C13778r<C18853c, C18854d, MVTodGetTripOrderRequest> {

    /* renamed from: A */
    public final int f47999A;

    /* renamed from: w */
    public final ServerId f48000w;

    /* renamed from: x */
    public final String f48001x;

    /* renamed from: y */
    public final int f48002y;

    /* renamed from: z */
    public final int f48003z;

    public C18853c(C13752e eVar, ServerId serverId, String str, int i, int i2, int i3) {
        super(eVar, R.string.api_path_tod_shuttles_get_trip_order_request, C18854d.class);
        C21100e.m49373x(serverId, UnityMediationAdapter.KEY_PLACEMENT_ID);
        this.f48000w = serverId;
        C21100e.m49373x(str, "tripId");
        this.f48001x = str;
        this.f48002y = i;
        this.f48003z = i2;
        this.f47999A = i3;
        int i4 = serverId.f15142b;
        RO mVTodGetTripOrderRequest = new MVTodGetTripOrderRequest();
        mVTodGetTripOrderRequest.zoneId = i4;
        mVTodGetTripOrderRequest.mo33968o();
        mVTodGetTripOrderRequest.tripId = str;
        mVTodGetTripOrderRequest.originStopIndex = i;
        mVTodGetTripOrderRequest.mo33967m();
        mVTodGetTripOrderRequest.destinationStopIndex = i2;
        mVTodGetTripOrderRequest.mo33965k();
        mVTodGetTripOrderRequest.numPassengers = i3;
        mVTodGetTripOrderRequest.mo33966l();
        this.f33922v = mVTodGetTripOrderRequest;
    }
}
