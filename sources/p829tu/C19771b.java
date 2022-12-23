package p829tu;

import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import g30.C4776h;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p824tp.C19728f;

/* renamed from: tu.b */
public final class C19771b implements Callable<Set<ServerId>> {

    /* renamed from: b */
    public final C13752e f50259b;

    /* renamed from: c */
    public final C19728f f50260c;

    /* renamed from: d */
    public final List<ServerId> f50261d;

    /* renamed from: e */
    public final ServerId f50262e;

    public C19771b(C13752e eVar, C19728f fVar, List<ServerId> list, ServerId serverId) {
        C21100e.m49373x(eVar, "requestContext");
        this.f50259b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f50260c = fVar;
        this.f50261d = list;
        this.f50262e = serverId;
    }

    public final Object call() throws Exception {
        boolean z;
        if (C13717b.m34258e(this.f50261d)) {
            return Collections.emptySet();
        }
        C13752e eVar = this.f50259b;
        C4776h hVar = this.f50260c.f50165a;
        C5269e eVar2 = new C5269e();
        C21100e.m49373x(eVar, "requestContext");
        C21100e.m49373x(hVar, "metroInfo");
        List<ServerId> list = this.f50261d;
        MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
        eVar2.f17412b.mo47002b(metroEntityType, list);
        if (this.f50262e != null) {
            eVar2.mo21067b(metroEntityType);
        }
        C5268d P = new C5267c(eVar, "MotQrCodeFetchLineIdsTask", hVar, eVar2).mo21062P();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ServerId c : this.f50261d) {
            TransitStop c2 = P.mo21064c(c);
            if (c2 != null) {
                for (DbEntityRef next : c2.f23735g) {
                    ServerId serverId = this.f50262e;
                    if (serverId != null) {
                        TransitLine transitLine = (TransitLine) next.get();
                        if (transitLine == null) {
                            z = false;
                        } else {
                            z = serverId.equals(transitLine.mo24369b().f23696d.getServerId());
                        }
                        if (!z) {
                        }
                    }
                    linkedHashSet.add(next.getServerId());
                }
            }
        }
        return linkedHashSet;
    }
}
