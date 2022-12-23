package p828tt;

import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.tranzmate.R;
import java.util.List;

/* renamed from: tt.j */
public class C19769j extends C19760b {
    /* renamed from: m2 */
    public final List<TripPlannerTransportTypeInfo> mo52088m2() {
        return ((C19764e) mo46776J1("ONBOARDING_CONFIGURATION")).f50249a;
    }

    /* renamed from: n2 */
    public final String mo52089n2() {
        return "transit_types";
    }

    /* renamed from: o2 */
    public final int mo52090o2() {
        return 2;
    }

    /* renamed from: p2 */
    public final int mo52091p2() {
        return this.f50239n ? R.string.onboarding_tt_preferences_optout_subtitle : R.string.onboarding_tt_preferences_subtitle;
    }

    /* renamed from: q2 */
    public final int mo52092q2() {
        return R.string.onboarding_tt_preferences_title;
    }
}
