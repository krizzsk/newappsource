package p477ew;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.stopDetails.MVStopImageRequest;

/* renamed from: ew.a */
public final class C16885a extends C13778r<C16885a, C16886b, MVStopImageRequest> {
    public C16885a(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_stop_images_request_path, C16886b.class);
        int i = serverId.f15142b;
        RO mVStopImageRequest = new MVStopImageRequest();
        mVStopImageRequest.stopId = i;
        mVStopImageRequest.mo31766g();
        this.f33922v = mVStopImageRequest;
    }
}
