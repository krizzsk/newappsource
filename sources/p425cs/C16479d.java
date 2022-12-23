package p425cs;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.editing.transit.EditorChangeState;
import com.moovit.app.editing.transit.EditorTransitStop;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorChangesState;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopResponse;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorStopMetaData;
import java.io.IOException;
import org.apache.thrift.TBase;
import p449ds.C16698a;
import p449ds.C16699b;

/* renamed from: cs.d */
public final class C16479d extends C13780t<C16478c, C16479d, MVMobileEditorGetStopResponse> {

    /* renamed from: m */
    public EditorTransitStop f43074m;

    /* renamed from: n */
    public EditorChangeState f43075n;

    public C16479d() {
        super(MVMobileEditorGetStopResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        EditorChangeState editorChangeState;
        MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) tBase;
        ServerId serverId = ((C16478c) aVar).f43073w;
        MVMobileEditorStopMetaData mVMobileEditorStopMetaData = mVMobileEditorGetStopResponse.stopMetaData;
        this.f43074m = new EditorTransitStop(serverId, mVMobileEditorStopMetaData.stopName, C13749c.m34322h(mVMobileEditorStopMetaData.stopLocation), C13720d.m34273c(mVMobileEditorStopMetaData.entrancesAndExits, (C13722f) null, new C16699b(serverId)), C16028g.m40828f(mVMobileEditorStopMetaData.imageRefSet), mVMobileEditorStopMetaData.moreInfo, mVMobileEditorStopMetaData.deletePending);
        MVMobileEditorChangesState mVMobileEditorChangesState = mVMobileEditorGetStopResponse.changesState;
        int i = C16698a.f43488a[mVMobileEditorChangesState.ordinal()];
        if (i == 1) {
            editorChangeState = EditorChangeState.NONE;
        } else if (i == 2) {
            editorChangeState = EditorChangeState.PENDING;
        } else if (i == 3) {
            editorChangeState = EditorChangeState.LOADED;
        } else if (i == 4) {
            editorChangeState = EditorChangeState.APPROVED;
        } else {
            throw new IllegalArgumentException("Unknown value: " + mVMobileEditorChangesState);
        }
        this.f43075n = editorChangeState;
    }
}
