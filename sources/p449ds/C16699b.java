package p449ds;

import c00.C13733n;
import com.moovit.app.editing.transit.EditorTransitStopPathway;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorPathwayMetaData;

/* renamed from: ds.b */
public final class C16699b implements C13733n<MVMobileEditorPathwayMetaData, EditorTransitStopPathway> {

    /* renamed from: b */
    public ServerId f43489b;

    public C16699b(ServerId serverId) {
        this.f43489b = serverId;
    }

    public final Object convert(Object obj) throws Exception {
        MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) obj;
        return new EditorTransitStopPathway(this.f43489b, C7841a.m17868f(mVMobileEditorPathwayMetaData.pathway), mVMobileEditorPathwayMetaData.moreInfo, mVMobileEditorPathwayMetaData.deletePending);
    }
}
