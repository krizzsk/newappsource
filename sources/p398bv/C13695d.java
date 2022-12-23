package p398bv;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.home.stops.search.SearchStopItem;
import com.moovit.home.stops.search.SearchStopPagerActivity;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;

/* renamed from: bv.d */
public class C13695d extends C15578a {
    /* renamed from: B2 */
    public static C13695d m34207B2(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        Bundle bundle = new Bundle();
        if (locationDescriptor != null) {
            bundle.putParcelable("extra_location_origin_params_request", locationDescriptor);
        }
        if (locationDescriptor2 != null) {
            bundle.putParcelable("extra_location_destination_param_request", locationDescriptor2);
        }
        C13695d dVar = new C13695d();
        dVar.setArguments(bundle);
        return dVar;
    }

    /* renamed from: n2 */
    public final Intent mo40559n2(Context context) {
        String string = context.getString(R.string.offline_trip_plan_destination_hint);
        int i = SearchStopPagerActivity.f41692U;
        Intent intent = new Intent(context, SearchStopPagerActivity.class);
        if (string != null) {
            intent.putExtra("title", string);
        }
        return intent;
    }

    /* renamed from: o2 */
    public final Intent mo40560o2(Context context) {
        String string = context.getString(R.string.offline_trip_plan_origin_hint);
        int i = SearchStopPagerActivity.f41692U;
        Intent intent = new Intent(context, SearchStopPagerActivity.class);
        if (string != null) {
            intent.putExtra("title", string);
        }
        return intent;
    }

    /* renamed from: p2 */
    public final int mo40561p2() {
        return R.string.offline_trip_plan_destination_hint;
    }

    /* renamed from: q2 */
    public final int mo40562q2() {
        return R.string.offline_trip_plan_origin_hint;
    }

    /* renamed from: r2 */
    public final LocationDescriptor mo40563r2(Intent intent) {
        int i = SearchStopPagerActivity.f41692U;
        return LocationDescriptor.m17769c(((SearchStopItem) intent.getParcelableExtra("item")).f41688b.get());
    }
}
