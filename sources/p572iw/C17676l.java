package p572iw;

import android.content.res.Resources;
import c00.C13733n;
import com.moovit.app.suggestedroutes.TripPlanWalkingPrefActivity;
import com.moovit.itinerary.C16080a;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVLineLeg;
import i30.C5268d;

/* renamed from: iw.l */
public final /* synthetic */ class C17676l implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f45424b;

    /* renamed from: c */
    public final /* synthetic */ Object f45425c;

    public /* synthetic */ C17676l(Object obj, int i) {
        this.f45424b = i;
        this.f45425c = obj;
    }

    public final Object convert(Object obj) {
        switch (this.f45424b) {
            case 0:
                int i = TripPlanWalkingPrefActivity.f39818Z;
                return ((Resources) this.f45425c).getString(R.string.units_min, new Object[]{(Short) obj});
            default:
                return C16080a.m40954j((C5268d) this.f45425c, (MVLineLeg) obj);
        }
    }
}
