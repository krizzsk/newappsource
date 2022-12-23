package p737pv;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsRequest;

/* renamed from: pv.c */
public final class C19012c extends C13778r<C19012c, C19013d, MVRSEventBookingBucketsRequest> {

    /* renamed from: w */
    public final ServerId f48367w;

    public C19012c(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_booking_buckets_request, C19013d.class);
        C21100e.m49373x(serverId, "eventId");
        this.f48367w = serverId;
        int i = serverId.f15142b;
        RO mVRSEventBookingBucketsRequest = new MVRSEventBookingBucketsRequest();
        mVRSEventBookingBucketsRequest.superEventId = i;
        mVRSEventBookingBucketsRequest.mo31238h();
        this.f33922v = mVRSEventBookingBucketsRequest;
    }
}
