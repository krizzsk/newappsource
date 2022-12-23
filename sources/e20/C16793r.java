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

/* renamed from: e20.r */
public final class C16793r extends C13780t<C16792q, C16793r, MVTripPlanSectionedResponse> {

    /* renamed from: m */
    public TripPlanResult f43725m = null;

    public C16793r() {
        super(MVTripPlanSectionedResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C16080a.m40943D(aVar2, (MVTripPlanSectionedResponse) tBase, ((C16792q) aVar).f43719J);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C16792q qVar = (C16792q) aVar;
        TripPlanResult l = C16080a.m40956l(qVar.f43720K, qVar.f43721w, qVar.f43722x, (MVTripPlanSectionedResponse) tBase, qVar.f43719J, dVar);
        this.f43725m = l;
        if (l.mo48273b()) {
            if (qVar.f43718I == null) {
                qVar.f43718I = new C16779i(qVar.f51759b);
            }
            qVar.f43718I.mo49471a(this.f43725m.f41852c);
        }
    }
}
