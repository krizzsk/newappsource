package e20;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.common.MVEmptyRequest;
import p824tp.C19728f;
import p824tp.C19746x;
import q00.C19047a;

/* renamed from: e20.o */
public final class C16790o extends C13778r<C16790o, C16791p, MVEmptyRequest> {

    /* renamed from: w */
    public final C19728f f43706w;

    /* renamed from: x */
    public final C19047a f43707x;

    /* renamed from: y */
    public final C16792q f43708y;

    public C16790o(C13752e eVar, C19728f fVar, C19047a aVar, C16792q qVar) {
        super(eVar, C19746x.api_path_trip_planner_fetch_more_request_path, C16791p.class);
        C21100e.m49373x(fVar, "metroContext");
        this.f43706w = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f43707x = aVar;
        C21100e.m49373x(qVar, "tripPlanRequest");
        this.f43708y = qVar;
        this.f33922v = new MVEmptyRequest();
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return true;
    }
}
