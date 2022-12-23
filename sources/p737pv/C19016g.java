package p737pv;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdRequest;

/* renamed from: pv.g */
public final class C19016g extends C13778r<C19016g, C19017h, MVRSGetEventByIdRequest> {

    /* renamed from: w */
    public final ServerId f48377w;

    public C19016g(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_by_id_request, C19017h.class);
        C21100e.m49373x(serverId, "eventId");
        this.f48377w = serverId;
        int i = serverId.f15142b;
        RO mVRSGetEventByIdRequest = new MVRSGetEventByIdRequest();
        mVRSGetEventByIdRequest.superEventId = i;
        mVRSGetEventByIdRequest.mo31341g();
        this.f33922v = mVRSGetEventByIdRequest;
    }
}
