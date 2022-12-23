package p425cs;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteStopRequest;

/* renamed from: cs.i */
public final class C16484i extends C13778r<C16484i, C16485j, MVMobileEditorDeleteStopRequest> {
    public C16484i(LatLonE6 latLonE6, ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_editor_remove_stop, C16485j.class);
        RO mVMobileEditorDeleteStopRequest = new MVMobileEditorDeleteStopRequest();
        mVMobileEditorDeleteStopRequest.stopId = serverId.f15142b;
        mVMobileEditorDeleteStopRequest.mo29101h();
        if (latLonE6 != null) {
            mVMobileEditorDeleteStopRequest.userLocation = C13749c.m34332r(latLonE6);
        }
        this.f33922v = mVMobileEditorDeleteStopRequest;
    }
}
