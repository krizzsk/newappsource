package p737pv;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventBookingOption;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVDirection;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsRequest;
import d70.C16536a;

/* renamed from: pv.e */
public final class C19014e extends C13778r<C19014e, C19015f, MVRSEventBookingStepsRequest> {

    /* renamed from: A */
    public final EventBookingOption f48370A;

    /* renamed from: B */
    public final int f48371B;

    /* renamed from: w */
    public final ServerId f48372w;

    /* renamed from: x */
    public final LatLonE6 f48373x;

    /* renamed from: y */
    public final boolean f48374y;

    /* renamed from: z */
    public final ServerId f48375z;

    public C19014e(C13752e eVar, ServerId serverId, LatLonE6 latLonE6, boolean z, ServerId serverId2, EventBookingOption eventBookingOption, int i) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_booking_options_request, C19015f.class);
        MVDirection mVDirection;
        C21100e.m49373x(serverId, "eventId");
        this.f48372w = serverId;
        C21100e.m49373x(latLonE6, "userLocation");
        this.f48373x = latLonE6;
        this.f48374y = z;
        this.f48375z = serverId2;
        this.f48370A = eventBookingOption;
        this.f48371B = i;
        int i2 = serverId.f15142b;
        MVLatLon r = C13749c.m34332r(latLonE6);
        if (z) {
            mVDirection = MVDirection.Forward;
        } else {
            mVDirection = MVDirection.Backward;
        }
        RO mVRSEventBookingStepsRequest = new MVRSEventBookingStepsRequest();
        mVRSEventBookingStepsRequest.superEventId = i2;
        mVRSEventBookingStepsRequest.mo31260o();
        mVRSEventBookingStepsRequest.userLocation = r;
        mVRSEventBookingStepsRequest.direction = mVDirection;
        mVRSEventBookingStepsRequest.numberOfTickets = i;
        mVRSEventBookingStepsRequest.mo31259m();
        if (serverId2 != null) {
            mVRSEventBookingStepsRequest.bucketId = serverId2.f15142b;
            mVRSEventBookingStepsRequest.mo31258l();
        }
        if (eventBookingOption != null) {
            mVRSEventBookingStepsRequest.toEventTransition = C16536a.m42037i(eventBookingOption);
        }
        this.f33922v = mVRSEventBookingStepsRequest;
    }
}
