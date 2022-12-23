package p425cs;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteEntranceRequest;

/* renamed from: cs.g */
public final class C16482g extends C13778r<C16482g, C16483h, MVMobileEditorDeleteEntranceRequest> {
    public C16482g(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_editor_remove_stop_pathway, C16483h.class);
        int i = serverId.f15142b;
        RO mVMobileEditorDeleteEntranceRequest = new MVMobileEditorDeleteEntranceRequest();
        mVMobileEditorDeleteEntranceRequest.entranceId = i;
        mVMobileEditorDeleteEntranceRequest.mo29093g();
        this.f33922v = mVMobileEditorDeleteEntranceRequest;
    }
}
