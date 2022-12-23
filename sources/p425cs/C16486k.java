package p425cs;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.editing.entity.EditableEntityInfo;
import com.moovit.transit.C7841a;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorEditEntranceRequest;

/* renamed from: cs.k */
public final class C16486k extends C13778r<C16486k, C16487l, MVMobileEditorEditEntranceRequest> {
    public C16486k(C13752e eVar, EditableEntityInfo editableEntityInfo, int i) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_editor_update_stop_pathway, C16487l.class);
        int i2 = editableEntityInfo.f37988b.f15142b;
        RO mVMobileEditorEditEntranceRequest = new MVMobileEditorEditEntranceRequest();
        mVMobileEditorEditEntranceRequest.entranceId = i2;
        mVMobileEditorEditEntranceRequest.mo29113k();
        mVMobileEditorEditEntranceRequest.location = C13749c.m34332r(editableEntityInfo.f37990d);
        mVMobileEditorEditEntranceRequest.name = editableEntityInfo.f37989c;
        mVMobileEditorEditEntranceRequest.entranceOrExit = C7841a.m17872j(i);
        mVMobileEditorEditEntranceRequest.moreInfo = editableEntityInfo.f37992f;
        this.f33922v = mVMobileEditorEditEntranceRequest;
    }
}
