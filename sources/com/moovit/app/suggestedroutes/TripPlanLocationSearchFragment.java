package com.moovit.app.suggestedroutes;

import android.content.Context;
import android.content.Intent;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;

public class TripPlanLocationSearchFragment extends C15578a {

    /* renamed from: x */
    public static final /* synthetic */ int f39800x = 0;

    /* renamed from: n2 */
    public final Intent mo40559n2(Context context) {
        String str;
        LocationDescriptor locationDescriptor = this.f40529u;
        if (locationDescriptor == null || mo46533t2()) {
            str = null;
        } else {
            str = locationDescriptor.f23651f;
        }
        return SearchLocationActivity.m17347y2(context, new AppSearchLocationCallback(R.string.trip_plan_destination_hint, 0, !mo46534u2(), true, true), "suggested_routes_dest", str);
    }

    /* renamed from: o2 */
    public final Intent mo40560o2(Context context) {
        String str;
        LocationDescriptor locationDescriptor = this.f40528t;
        if (locationDescriptor == null || mo46534u2()) {
            str = null;
        } else {
            str = locationDescriptor.f23651f;
        }
        return SearchLocationActivity.m17347y2(context, new AppSearchLocationCallback(R.string.trip_plan_source_hint, 0, !mo46533t2(), true, true), "suggested_routes_origin", str);
    }

    /* renamed from: p2 */
    public final int mo40561p2() {
        return R.string.trip_plan_destination_hint;
    }

    /* renamed from: q2 */
    public final int mo40562q2() {
        return R.string.trip_plan_source_hint;
    }

    /* renamed from: r2 */
    public final LocationDescriptor mo40563r2(Intent intent) {
        return (LocationDescriptor) intent.getParcelableExtra("search_result");
    }
}
