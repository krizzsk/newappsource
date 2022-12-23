package p973zv;

import aa0.C7553r;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.moovit.protocol.share.MVGetSharedItineraryResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: zv.d */
public final class C20914d extends C13780t<C20913c, C20914d, MVGetSharedItineraryResponse> {

    /* renamed from: m */
    public Itinerary f52661m;

    public C20914d() {
        super(MVGetSharedItineraryResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C20913c cVar = (C20913c) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C16080a.m40942C(aVar2, ((MVGetSharedItineraryResponse) tBase).itinerary);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C20913c cVar = (C20913c) aVar;
        MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) tBase;
        this.f52661m = C16080a.m40947c(C7553r.f23033b.mo23812b(cVar.f51759b, mVGetSharedItineraryResponse.originalRequest), cVar.f52659w, cVar.f52660x, mVGetSharedItineraryResponse.itinerary, dVar);
    }
}
