package p732pq;

import a30.C0068a;
import c00.C13722f;
import c00.C13723g;
import com.moovit.app.stopdetail.C15339b;
import com.moovit.app.tod.bookingflow.model.TodZoneShape;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.StopRealTimeInformation;
import h90.C12739a;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import ka0.C12822a;
import m80.C12887v;
import p584jl.C17885a;
import p798sn.C19493a;
import p952yy.C20787c;

/* renamed from: pq.h */
public final /* synthetic */ class C18947h implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f48243b;

    /* renamed from: c */
    public final /* synthetic */ Object f48244c;

    public /* synthetic */ C18947h(Object obj, int i) {
        this.f48243b = i;
        this.f48244c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        StopRealTimeInformation stopRealTimeInformation;
        boolean z = false;
        switch (this.f48243b) {
            case 0:
                C18951l lVar = (C18951l) this.f48244c;
                TransitStop transitStop = (TransitStop) obj;
                lVar.getClass();
                if (transitStop != null) {
                    z = C13723g.m34280a(transitStop.f23735g, new C18950k(lVar, 0));
                }
                return !z;
            case 1:
                return ((C15339b) this.f48244c).f39642l.f39729e.contains(((DbEntityRef) obj).getServerId());
            case 2:
                return ((TodZoneShape) obj).f40103c.mo46935h((LatLonE6) this.f48244c);
            case 3:
                HashMap hashMap = C0068a.f142d;
                return ((Date) this.f48244c).before(C17885a.m44394D(((C19493a) obj).f49565j));
            case 4:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                if (C13723g.m34286g((List) this.f48244c, new C18950k((Ticket) obj, 6)) != null) {
                    return true;
                }
                return false;
            case 5:
                return ((TicketingErrorAction) obj).name().equals((String) this.f48244c);
            case 6:
                return ((TicketAgency) this.f48244c).equals(((C12739a) obj).f31468b);
            case 7:
                C20787c cVar = (C20787c) obj;
                int i = C7843b.f23777a;
                if (!((ServerId) this.f48244c).equals(cVar.f52457b) || (stopRealTimeInformation = cVar.f52459d) == null || stopRealTimeInformation.f23898b.get((Object) null) == null) {
                    return false;
                }
                return true;
            default:
                int i2 = C12822a.f31697e;
                return Boolean.TRUE.equals(((Map) this.f48244c).get((String) obj));
        }
    }
}
