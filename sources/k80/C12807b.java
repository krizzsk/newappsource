package k80;

import c00.C13720d;
import c00.C13722f;
import c70.C13780t;
import com.facebook.appevents.C2342l;
import com.moovit.commons.request.BadResponseException;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.util.ServerIdMap;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetAllServiceAlertDigestsResponse;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertsForAgency;
import g30.C4776h;
import j80.C12773b;
import j80.C12776e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p638lr.C18262i;
import p824tp.C19731i;

/* renamed from: k80.b */
public final class C12807b extends C13780t<C12806a, C12807b, MVGetAllServiceAlertDigestsResponse> {

    /* renamed from: m */
    public C12773b f31672m;

    public C12807b() {
        super(MVGetAllServiceAlertDigestsResponse.class);
    }

    /* renamed from: q */
    public final void mo5816m(C12806a aVar, MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse) throws BadResponseException {
        ArrayList<O> c = C13720d.m34273c(mVGetAllServiceAlertDigestsResponse.metroAlerts, (C13722f) null, new C2342l(22));
        ArrayList arrayList = new ArrayList();
        ServerIdMap serverIdMap = new ServerIdMap();
        ServerIdMap serverIdMap2 = new ServerIdMap();
        List<MVServiceAlertsForAgency> list = mVGetAllServiceAlertDigestsResponse.alertsForAgency;
        if (list != null) {
            for (MVServiceAlertsForAgency next : list) {
                ServerId serverId = new ServerId(next.agencyId);
                List<LineServiceAlertDigest> f = C12776e.m32582f(next.lineAlerts);
                ArrayList<O> c2 = C13720d.m34273c(next.agencyAlerts, (C13722f) null, new C18262i(23));
                arrayList.add(serverId);
                serverIdMap.put(serverId, Collections.unmodifiableList(f));
                serverIdMap2.put(serverId, Collections.unmodifiableList(c2));
            }
        }
        HashSet hashSet = new HashSet();
        ServerIdMap serverIdMap3 = new ServerIdMap();
        for (List<LineServiceAlertDigest> it : serverIdMap.values()) {
            for (LineServiceAlertDigest lineServiceAlertDigest : it) {
                ServerId serverId2 = lineServiceAlertDigest.f23185b.f23206d;
                if (serverId2 != null) {
                    hashSet.add(serverId2);
                    List list2 = (List) serverIdMap3.get(serverId2);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        serverIdMap3.put(serverId2, list2);
                    }
                    list2.add(lineServiceAlertDigest);
                }
            }
        }
        HashMap j = C19731i.m47197a(this.f51773b.f51759b).mo52086d(aVar.f31671w).mo51805g().mo52130j(this.f51773b.f51759b, hashSet);
        C4776h hVar = aVar.f31671w.f50165a;
        this.f31672m = new C12773b(hVar.f16126a, hVar.f16127b, c, arrayList, serverIdMap, serverIdMap2, serverIdMap3, j);
    }
}
