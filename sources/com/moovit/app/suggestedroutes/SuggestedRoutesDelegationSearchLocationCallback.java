package com.moovit.app.suggestedroutes;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.search.SearchAction;
import com.moovit.search.SearchLocationActivity;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;

public class SuggestedRoutesDelegationSearchLocationCallback extends AppSearchLocationCallback {
    public static final Parcelable.Creator<SuggestedRoutesDelegationSearchLocationCallback> CREATOR = new C15368a();

    /* renamed from: com.moovit.app.suggestedroutes.SuggestedRoutesDelegationSearchLocationCallback$a */
    public class C15368a implements Parcelable.Creator<SuggestedRoutesDelegationSearchLocationCallback> {
        public final Object createFromParcel(Parcel parcel) {
            return new SuggestedRoutesDelegationSearchLocationCallback(parcel);
        }

        public final Object[] newArray(int i) {
            return new SuggestedRoutesDelegationSearchLocationCallback[i];
        }
    }

    public SuggestedRoutesDelegationSearchLocationCallback() {
        super(0, 0, false, true, true);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: h1 */
    public final void mo23885h1(SearchLocationActivity searchLocationActivity, String str, LocationDescriptor locationDescriptor, SearchAction searchAction) {
        boolean z;
        if (SearchAction.DEFAULT.equals(searchAction)) {
            TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
            dVar.f23791b = locationDescriptor;
            TripPlanParams a = dVar.mo23958a();
            if ("favorite_locations".equals(str) || "recent_locations".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            searchLocationActivity.startActivity(SuggestRoutesActivity.m39325M2(searchLocationActivity, a, z));
            searchLocationActivity.finish();
            return;
        }
        super.mo23885h1(searchLocationActivity, str, locationDescriptor, searchAction);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public SuggestedRoutesDelegationSearchLocationCallback(Parcel parcel) {
        super(parcel);
    }
}
