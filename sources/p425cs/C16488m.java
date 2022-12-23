package p425cs;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.editing.entity.EditableEntityInfo;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorUpdateStopRequest;

/* renamed from: cs.m */
public final class C16488m extends C13778r<C16488m, C16489n, MVMobileEditorUpdateStopRequest> {
    public C16488m(C13752e eVar, EditableEntityInfo editableEntityInfo) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_editor_update_stop, C16489n.class);
        int i = editableEntityInfo.f37988b.f15142b;
        RO mVMobileEditorUpdateStopRequest = new MVMobileEditorUpdateStopRequest();
        mVMobileEditorUpdateStopRequest.stopId = i;
        mVMobileEditorUpdateStopRequest.mo29159j();
        mVMobileEditorUpdateStopRequest.stopLocation = C13749c.m34332r(editableEntityInfo.f37990d);
        mVMobileEditorUpdateStopRequest.stopName = editableEntityInfo.f37989c;
        mVMobileEditorUpdateStopRequest.moreInfo = editableEntityInfo.f37992f;
        this.f33922v = mVMobileEditorUpdateStopRequest;
    }
}
