package p398bv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ga0.C12699d;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;
import p297w5.C6996c;
import p543hq.C17474b;
import q00.C19047a;
import q00.C19053d;

/* renamed from: bv.b */
public class C13692b extends C15581b<OfflineTripPlannerOptions> {

    /* renamed from: t */
    public static final /* synthetic */ int f33750t = 0;

    /* renamed from: s */
    public TextView f33751s;

    /* renamed from: Z1 */
    public final void mo40440Z1(int i, String str) {
        TripPlannerTime tripPlannerTime;
        if ("trip_plan_time_tag".equals(str)) {
            if (i == -1) {
                C12699d dVar = (C12699d) getFragmentManager().mo3923A(str);
                if (dVar.f31361z) {
                    tripPlannerTime = null;
                } else {
                    tripPlannerTime = new TripPlannerTime(TripPlannerTime.Type.CODER.mo51916a(dVar.getArguments().getShort("time_type")), dVar.mo39477W1());
                }
                if (tripPlannerTime == null) {
                    tripPlannerTime = TripPlannerTime.m17899f();
                }
                mo46541p2(new OfflineTripPlannerOptions(tripPlannerTime), 0);
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.EDIT_TIME_DIALOG);
            aVar.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, C0016g.m17G(i));
            mo46797j2(aVar.mo49933a());
        }
    }

    /* renamed from: n2 */
    public final TripPlannerOptions mo40550n2() {
        return new OfflineTripPlannerOptions(TripPlannerTime.m17899f());
    }

    /* renamed from: o2 */
    public final void mo40551o2(View view) {
        View findViewById = view.findViewById(R.id.time_picker_container);
        findViewById.setOnClickListener(new C6996c(this, 22));
        this.f33751s = (TextView) findViewById.findViewById(R.id.time_picker);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.offline_trip_planner_options_fragment, viewGroup, false);
    }

    /* renamed from: q2 */
    public final void mo40552q2(TripPlannerOptions tripPlannerOptions, long j) {
        Context requireContext = requireContext();
        TripPlannerTime tripPlannerTime = ((OfflineTripPlannerOptions) tripPlannerOptions).f39163b;
        if (tripPlannerTime.mo24489d()) {
            this.f33751s.setText(R.string.trip_plan_time);
        } else if (tripPlannerTime.mo24488c()) {
            this.f33751s.setText(R.string.last_available_transit);
        } else {
            this.f33751s.setText(C7925b.m18018f(requireContext, tripPlannerTime.mo24487b(), false));
        }
        TextView textView = this.f33751s;
        textView.setContentDescription(C15581b.m39816m2(requireContext, tripPlannerTime, textView.getText()));
    }

    /* renamed from: r2 */
    public final void mo40553r2(TripPlannerTime.Type type) {
        TripPlannerTime tripPlannerTime = ((OfflineTripPlannerOptions) this.f40537p).f39163b;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.mo3923A("trip_plan_time_tag") == null) {
            C12699d.C12701b bVar = new C12699d.C12701b((Context) this.f40822c);
            bVar.mo39494d("trip_plan_time_tag");
            bVar.f31375b.putShort("time_type", TripPlannerTime.Type.CODER.mo51917b(type));
            bVar.mo39488j();
            bVar.f31375b.putLong("minTime", System.currentTimeMillis());
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f31375b.putLong("maxTime", TimeUnit.DAYS.toMillis((long) ((Integer) C19047a.m46164a(requireContext()).mo51505b(C19053d.f48452D)).intValue()) + currentTimeMillis);
            bVar.mo39483e(0);
            bVar.mo39484f(2);
            bVar.mo39485g();
            if (!tripPlannerTime.mo24488c() && !tripPlannerTime.mo24489d()) {
                bVar.mo39487i(tripPlannerTime.mo24487b());
            }
            C12699d k = bVar.mo39489k();
            k.setTargetFragment(this, 0);
            k.show(fragmentManager, "trip_plan_time_tag");
        }
    }
}
