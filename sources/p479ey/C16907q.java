package p479ey;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVEmptyRequest;

/* renamed from: ey.q */
public final class C16907q extends C13778r<C16907q, C16908r, MVEmptyRequest> {
    public C16907q(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_get_user_profile, C16908r.class);
        if (serverId != null) {
            mo52627p(serverId.f15142b, "account_id");
        }
        this.f33922v = new MVEmptyRequest();
    }
}
