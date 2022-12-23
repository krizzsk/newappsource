package k80;

import c70.C13746a;
import c70.C13752e;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetAllServiceAlertDigestsResponse;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertsForAgency;
import com.tranzmate.moovit.protocol.users.MVPhoneOsTypes;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import q00.C19047a;
import q00.C19053d;

/* renamed from: k80.a */
public final class C12806a extends C13746a<C12806a, C12807b> {

    /* renamed from: v */
    public final C19047a f31670v;

    /* renamed from: w */
    public final C19728f f31671w;

    public C12806a(C19728f fVar, C19047a aVar, C13752e eVar) {
        super(eVar, C19746x.server_path_cdn_server_url, C19746x.api_path_all_service_alert_digests, false, C12807b.class);
        this.f31670v = aVar;
        this.f31671w = fVar;
        mo52629r("metroAreaId", fVar.f50165a.f16126a.mo19751c());
        mo52628q(fVar.f50165a.f16127b);
        mo52629r("langId", eVar.f33852a.getString(C19746x.lang_id));
        mo52629r("osTypeId", String.valueOf(MVPhoneOsTypes.Android.getValue()));
        mo52627p(C19731i.m47197a(eVar.f33852a).f50171a.f50157h, "userType");
    }

    /* renamed from: E */
    public final List<C12807b> mo21059E() throws IOException, ServerException {
        if (((Integer) this.f31670v.mo51505b(C19053d.f48485x)).intValue() != 0) {
            return Collections.emptyList();
        }
        List<MVServiceAlertDigest> emptyList = Collections.emptyList();
        List<MVServiceAlertsForAgency> emptyList2 = Collections.emptyList();
        MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = new MVGetAllServiceAlertDigestsResponse();
        mVGetAllServiceAlertDigestsResponse.metroAlerts = emptyList;
        mVGetAllServiceAlertDigestsResponse.alertsForAgency = emptyList2;
        C12807b bVar = (C12807b) mo40056C();
        bVar.mo5816m(this, mVGetAllServiceAlertDigestsResponse);
        this.f51765h = true;
        return Collections.singletonList(bVar);
    }
}
