package e20;

import c00.C13721e;
import com.moovit.itinerary.C16080a;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
import i30.C5268d;

/* renamed from: e20.w */
public final /* synthetic */ class C16798w implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ String f43749b;

    /* renamed from: c */
    public final /* synthetic */ C16797v f43750c;

    /* renamed from: d */
    public final /* synthetic */ C5268d f43751d;

    public /* synthetic */ C16798w(String str, C16797v vVar, C5268d dVar) {
        this.f43749b = str;
        this.f43750c = vVar;
        this.f43751d = dVar;
    }

    public final Object convert(Object obj) {
        String str = this.f43749b;
        C16797v vVar = this.f43750c;
        C5268d dVar = this.f43751d;
        return C16080a.m40947c(str, vVar.f43745w, vVar.f43746x, (MVTripPlanItinerary) obj, dVar);
    }
}
