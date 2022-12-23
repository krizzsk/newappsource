package p900wt;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVGetTripPlanInformationRequest;
import java.util.HashMap;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: wt.g */
public final class C20417g extends C13778r<C20417g, C20418h, MVGetTripPlanInformationRequest> {

    /* renamed from: w */
    public final C19728f f51728w;

    /* renamed from: x */
    public final C19047a f51729x;

    /* renamed from: y */
    public final HashMap f51730y = new HashMap();

    public C20417g(C13752e eVar, C19728f fVar, C19047a aVar, String str) {
        super(eVar, R.string.api_path_itinerary_request_path, C20418h.class);
        this.f51728w = fVar;
        this.f51729x = aVar;
        RO mVGetTripPlanInformationRequest = new MVGetTripPlanInformationRequest();
        mVGetTripPlanInformationRequest.guid = str;
        this.f33922v = mVGetTripPlanInformationRequest;
    }
}
