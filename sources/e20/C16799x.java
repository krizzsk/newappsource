package e20;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSuggestionResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;

/* renamed from: e20.x */
public final class C16799x extends C13780t<C16797v, C16799x, MVTripPlanSuggestionResponse> {

    /* renamed from: m */
    public List<Itinerary> f43752m = Collections.emptyList();

    public C16799x() {
        super(MVTripPlanSuggestionResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C16797v vVar = (C16797v) aVar;
        MVTripPlanSuggestionResponse mVTripPlanSuggestionResponse = (MVTripPlanSuggestionResponse) tBase;
        if (!mVTripPlanSuggestionResponse.mo34765f()) {
            return null;
        }
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        for (MVTripPlanItinerary C : mVTripPlanSuggestionResponse.itineraries) {
            C16080a.m40942C(aVar2, C);
        }
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C16797v vVar = (C16797v) aVar;
        MVTripPlanSuggestionResponse mVTripPlanSuggestionResponse = (MVTripPlanSuggestionResponse) tBase;
        if (mVTripPlanSuggestionResponse.mo34765f()) {
            ArrayList<O> c = C13720d.m34273c(mVTripPlanSuggestionResponse.itineraries, (C13722f) null, new C16798w(vVar.f43744H, vVar, dVar));
            this.f43752m = c;
            for (O o : c) {
                if (vVar.f43743G == null) {
                    vVar.f43743G = new C16779i(vVar.f51759b);
                }
                vVar.f43743G.mo49471a(o);
            }
        }
    }
}
