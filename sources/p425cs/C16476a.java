package p425cs;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.editing.entity.EditableEntityInfo;
import com.moovit.transit.C7841a;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.gtfs.MVPathwayType;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorAddEntranceRequest;

/* renamed from: cs.a */
public final class C16476a extends C13778r<C16476a, C16477b, MVMobileEditorAddEntranceRequest> {
    public C16476a(C13752e eVar, EditableEntityInfo editableEntityInfo, int i) {
        super(eVar, R.string.server_path_app_server_url, R.string.api_path_editor_add_stop_pathway, C16477b.class);
        int i2 = editableEntityInfo.f37988b.f15142b;
        MVLatLon r = C13749c.m34332r(editableEntityInfo.f37990d);
        MVPathwayType j = C7841a.m17872j(i);
        String str = editableEntityInfo.f37989c;
        RO mVMobileEditorAddEntranceRequest = new MVMobileEditorAddEntranceRequest();
        mVMobileEditorAddEntranceRequest.parentStopId = i2;
        mVMobileEditorAddEntranceRequest.mo29077h();
        mVMobileEditorAddEntranceRequest.location = r;
        mVMobileEditorAddEntranceRequest.entranceOrExit = j;
        mVMobileEditorAddEntranceRequest.name = str;
        mVMobileEditorAddEntranceRequest.moreInfo = editableEntityInfo.f37992f;
        this.f33922v = mVMobileEditorAddEntranceRequest;
    }
}
