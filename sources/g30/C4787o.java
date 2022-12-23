package g30;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.sync.MVMetroRevisionRequest;
import k40.C5479c;
import p824tp.C19746x;

/* renamed from: g30.o */
public final class C4787o extends C13778r<C4787o, C4788p, MVMetroRevisionRequest> {

    /* renamed from: w */
    public final ServerId f16166w;

    public C4787o(ServerId serverId, C13752e eVar) {
        super(eVar, C19746x.api_path_metro_revision_request_path, C4788p.class);
        C21100e.m49373x(serverId, "metroId");
        this.f16166w = serverId;
        short d = C5479c.m13667d(serverId);
        RO mVMetroRevisionRequest = new MVMetroRevisionRequest();
        mVMetroRevisionRequest.metroAreaId = d;
        mVMetroRevisionRequest.mo32012g();
        this.f33922v = mVMetroRevisionRequest;
    }

    /* renamed from: L */
    public final boolean mo20305L() {
        return false;
    }
}
