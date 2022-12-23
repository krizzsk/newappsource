package p425cs;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopRequest;

/* renamed from: cs.c */
public final class C16478c extends C13778r<C16478c, C16479d, MVMobileEditorGetStopRequest> {

    /* renamed from: w */
    public ServerId f43073w;

    public C16478c(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_editor_get_stop, C16479d.class);
        this.f43073w = serverId;
        int i = serverId.f15142b;
        RO mVMobileEditorGetStopRequest = new MVMobileEditorGetStopRequest();
        mVMobileEditorGetStopRequest.stopId = i;
        mVMobileEditorGetStopRequest.mo29119g();
        this.f33922v = mVMobileEditorGetStopRequest;
    }
}
