package p638lr;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
import e20.C16779i;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: lr.p */
public final class C18269p extends C13780t<C18268o, C18269p, MVTripPlanItinerary> {

    /* renamed from: m */
    public Itinerary f46600m = null;

    public C18269p() {
        super(MVTripPlanItinerary.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C18268o oVar = (C18268o) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C16080a.m40942C(aVar2, (MVTripPlanItinerary) tBase);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C18268o oVar = (C18268o) aVar;
        this.f46600m = C16080a.m40947c((String) null, oVar.f46596w, oVar.f46597x, (MVTripPlanItinerary) tBase, dVar);
        if (oVar.f46595D == null) {
            oVar.f46595D = new C16779i(oVar.f51759b);
        }
        oVar.f46595D.mo49471a(this.f46600m);
    }
}
