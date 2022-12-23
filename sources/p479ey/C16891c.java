package p479ey;

import c70.C13746a;
import c70.C13752e;
import com.moovit.app.MoovitAppApplication;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: ey.c */
public final class C16891c extends C13746a<C16891c, C16892d> {
    public C16891c(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_ride_sharing_campaign, false, C16892d.class);
        if (serverId != null) {
            mo52627p(serverId.f15142b, "account_id");
        }
    }

    /* renamed from: E */
    public final List<C16892d> mo21059E() throws IOException, ServerException {
        if (((Boolean) ((C19047a) MoovitAppApplication.m37038x().f37321e.mo50695h("CONFIGURATION", false)).mo51505b(C20199a.f51303u0)).booleanValue()) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList((C16892d) mo40056C());
    }
}
