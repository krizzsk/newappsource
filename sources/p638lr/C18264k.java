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

/* renamed from: lr.k */
public final class C18264k extends C13780t<C18263j, C18264k, MVTripPlanItinerary> {

    /* renamed from: m */
    public Itinerary f46590m = null;

    public C18264k() {
        super(MVTripPlanItinerary.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C18263j jVar = (C18263j) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C16080a.m40942C(aVar2, (MVTripPlanItinerary) tBase);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C18263j jVar = (C18263j) aVar;
        this.f46590m = C16080a.m40947c((String) null, jVar.f46587w, jVar.f46588x, (MVTripPlanItinerary) tBase, dVar);
        new C16779i(jVar.f51759b).mo49471a(this.f46590m);
    }
}
