package p828tt;

import android.widget.Button;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.tranzmate.R;
import java.util.List;
import p297w5.C6996c;

/* renamed from: tt.i */
public class C19768i extends C19760b {

    /* renamed from: r */
    public static final /* synthetic */ int f50257r = 0;

    /* renamed from: m2 */
    public final List<TripPlannerTransportTypeInfo> mo52088m2() {
        return ((C19764e) mo46776J1("ONBOARDING_CONFIGURATION")).f50250b;
    }

    /* renamed from: n2 */
    public final String mo52089n2() {
        return "micro_mobility_types";
    }

    /* renamed from: o2 */
    public final int mo52090o2() {
        return 0;
    }

    /* renamed from: p2 */
    public final int mo52091p2() {
        return this.f50239n ? R.string.onboarding_mm_preferences_optout_subtitle : R.string.onboarding_mm_preferences_subtitle;
    }

    /* renamed from: q2 */
    public final int mo52092q2() {
        return R.string.onboarding_mm_preferences_title;
    }

    /* renamed from: r2 */
    public final void mo52093r2() {
        super.mo52093r2();
        Button button = (Button) mo46799l2(R.id.skip_button);
        button.setVisibility(0);
        button.setOnClickListener(new C6996c(this, 16));
    }
}
