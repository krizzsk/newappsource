package e20;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVSingleTripPlanResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: e20.n */
public final class C16789n extends C13780t<C16788m, C16789n, MVSingleTripPlanResponse> {

    /* renamed from: m */
    public Itinerary f43705m = null;

    public C16789n() {
        super(MVSingleTripPlanResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C16788m mVar = (C16788m) aVar;
        MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) tBase;
        if (!mVSingleTripPlanResponse.mo34540f()) {
            return null;
        }
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C16080a.m40942C(aVar2, mVSingleTripPlanResponse.itinerary);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C16788m mVar = (C16788m) aVar;
        MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) tBase;
        if (mVSingleTripPlanResponse.mo34540f()) {
            this.f43705m = C16080a.m40947c(mVar.f43700F, mVar.f43701w, mVar.f43702x, mVSingleTripPlanResponse.itinerary, dVar);
            if (mVar.f43699E == null) {
                mVar.f43699E = new C16779i(mVar.f51759b);
            }
            mVar.f43699E.mo49471a(this.f43705m);
        }
    }
}
