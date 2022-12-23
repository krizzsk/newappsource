package p476ev;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVEmptyRequest;

/* renamed from: ev.a */
public final class C16883a extends C13778r<C16883a, C16884b, MVEmptyRequest> {
    public C16883a(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_promotion_section, C16884b.class);
        if (serverId != null) {
            mo52627p(serverId.f15142b, "account_id");
        }
        this.f33922v = new MVEmptyRequest();
    }
}
