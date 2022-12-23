package h30;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.users.MVChangeUserMetroAreaRequest;
import k40.C5479c;
import p824tp.C19746x;

/* renamed from: h30.a */
public final class C5047a extends C13778r<C5047a, C5048b, MVChangeUserMetroAreaRequest> {

    /* renamed from: w */
    public final ServerId f17041w;

    public C5047a(ServerId serverId, C13752e eVar) {
        super(eVar, C19746x.api_path_change_metro, C5048b.class);
        C21100e.m49373x(serverId, "targetMetroId");
        this.f17041w = serverId;
        short d = C5479c.m13667d(serverId);
        RO mVChangeUserMetroAreaRequest = new MVChangeUserMetroAreaRequest();
        mVChangeUserMetroAreaRequest.newMetroAreaId = d;
        mVChangeUserMetroAreaRequest.mo35013g();
        this.f33922v = mVChangeUserMetroAreaRequest;
    }

    /* renamed from: O */
    public final String mo20772O() {
        return C5047a.class.getSimpleName() + "_" + this.f17041w;
    }
}
