package q80;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusRequest;
import java.util.ArrayList;
import m80.C12873i;

/* renamed from: q80.r */
public final class C13029r extends C13778r<C13029r, C13030s, MVUserRefreshTicketsStatusRequest> {
    public C13029r(C13752e eVar, ServerId serverId, ArrayList arrayList) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_refresh_status, C13030s.class);
        int i = serverId.f15142b;
        RO mVUserRefreshTicketsStatusRequest = new MVUserRefreshTicketsStatusRequest();
        mVUserRefreshTicketsStatusRequest.ticketIds = arrayList;
        mVUserRefreshTicketsStatusRequest.providerId = i;
        mVUserRefreshTicketsStatusRequest.mo33275h();
        this.f33922v = mVUserRefreshTicketsStatusRequest;
    }
}
