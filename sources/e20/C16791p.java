package e20;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.TripPlanResult;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: e20.p */
public final class C16791p extends C13780t<C16790o, C16791p, MVTripPlanSectionedResponse> {

    /* renamed from: m */
    public TripPlanResult f43709m = null;

    public C16791p() {
        super(MVTripPlanSectionedResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C16080a.m40943D(aVar2, (MVTripPlanSectionedResponse) tBase, ((C16790o) aVar).f43708y.f43719J);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C16790o oVar = (C16790o) aVar;
        TripPlanResult l = C16080a.m40956l((String) null, oVar.f43706w, oVar.f43707x, (MVTripPlanSectionedResponse) tBase, oVar.f43708y.f43719J, dVar);
        this.f43709m = l;
        if (l.mo48273b()) {
            C16792q qVar = oVar.f43708y;
            if (qVar.f43718I == null) {
                qVar.f43718I = new C16779i(qVar.f51759b);
            }
            qVar.f43718I.mo49471a(this.f43709m.f41852c);
        }
    }
}
