package com.moovit.app.tripplanner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import java.util.UUID;
import p977zz.C20975x0;

public abstract class TripPlannerResultsFragment<O extends TripPlannerOptions> extends C15682c<MoovitActivity> {

    /* renamed from: n */
    public C15577a<O> f40515n = null;

    /* renamed from: o */
    public SearchParams<O> f40516o = null;

    /* renamed from: com.moovit.app.tripplanner.TripPlannerResultsFragment$a */
    public interface C15577a<O extends TripPlannerOptions> {
    }

    public TripPlannerResultsFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public final void mo46523m2(TripPlannerLocations tripPlannerLocations, O o) {
        TripPlannerLocations tripPlannerLocations2;
        O o2;
        boolean z;
        LatLonE6 latLonE6;
        boolean z2;
        LatLonE6 latLonE62;
        boolean z3;
        LatLonE6 latLonE63;
        SearchParams<O> searchParams = this.f40516o;
        LatLonE6 latLonE64 = null;
        if (searchParams != null) {
            tripPlannerLocations2 = searchParams.f40518c;
        } else {
            tripPlannerLocations2 = null;
        }
        if (searchParams != null) {
            o2 = searchParams.f40519d;
        } else {
            o2 = null;
        }
        boolean z4 = true;
        if (tripPlannerLocations2 != null) {
            LocationDescriptor locationDescriptor = tripPlannerLocations2.f23786b;
            boolean z5 = false;
            if (locationDescriptor != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                latLonE6 = locationDescriptor.mo24310d();
            } else {
                latLonE6 = null;
            }
            LocationDescriptor locationDescriptor2 = tripPlannerLocations.f23786b;
            if (locationDescriptor2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                latLonE62 = locationDescriptor2.mo24310d();
            } else {
                latLonE62 = null;
            }
            if (C20975x0.m49118e(latLonE6, latLonE62)) {
                LocationDescriptor locationDescriptor3 = tripPlannerLocations2.f23787c;
                if (locationDescriptor3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    latLonE63 = locationDescriptor3.mo24310d();
                } else {
                    latLonE63 = null;
                }
                LocationDescriptor locationDescriptor4 = tripPlannerLocations.f23787c;
                if (locationDescriptor4 != null) {
                    z5 = true;
                }
                if (z5) {
                    latLonE64 = locationDescriptor4.mo24310d();
                }
                if (C20975x0.m49118e(latLonE63, latLonE64) && !o.mo24463V().mo24489d() && o2 != null) {
                    z4 = mo46525p2(o2, o);
                }
            }
        }
        if (z4) {
            mo46524n2(tripPlannerLocations, o);
        }
    }

    /* renamed from: n2 */
    public final void mo46524n2(TripPlannerLocations tripPlannerLocations, O o) {
        this.f40516o = new SearchParams<>(tripPlannerLocations, o);
        mo40556o2(tripPlannerLocations, o);
        C15577a<O> aVar = this.f40515n;
        if (aVar != null) {
            SearchParams<O> searchParams = this.f40516o;
            C15581b E2 = ((TripPlannerActivity) aVar).mo46520E2();
            if (E2 != null) {
                long j = searchParams.f40520e;
                if (!C20975x0.m49118e(Long.valueOf(E2.f40538q), Long.valueOf(j))) {
                    E2.f40538q = j;
                    O o2 = E2.f40537p;
                    if (o2 != null) {
                        E2.mo40552q2(o2, j);
                    }
                }
            }
        }
    }

    /* renamed from: o2 */
    public abstract void mo40556o2(TripPlannerLocations tripPlannerLocations, O o);

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("latestSearchParams", this.f40516o);
    }

    public void onViewCreated(View view, Bundle bundle) {
        TripPlannerLocations tripPlannerLocations;
        TripPlannerOptions tripPlannerOptions;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f40516o = (SearchParams) bundle.getParcelable("latestSearchParams");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null && (tripPlannerLocations = (TripPlannerLocations) arguments.getParcelable("locations")) != null && (tripPlannerOptions = (TripPlannerOptions) arguments.getParcelable("options")) != null) {
            mo46523m2(tripPlannerLocations, tripPlannerOptions);
        }
    }

    /* renamed from: p2 */
    public boolean mo46525p2(O o, O o2) {
        return !C20975x0.m49118e(o, o2);
    }

    public static class SearchParams<O extends TripPlannerOptions> implements Parcelable {
        public static final Parcelable.Creator<SearchParams<? extends TripPlannerOptions>> CREATOR = new C15576a();

        /* renamed from: b */
        public final String f40517b;

        /* renamed from: c */
        public final TripPlannerLocations f40518c;

        /* renamed from: d */
        public final O f40519d;

        /* renamed from: e */
        public final long f40520e;

        /* renamed from: com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams$a */
        public class C15576a implements Parcelable.Creator<SearchParams<? extends TripPlannerOptions>> {
            public final Object createFromParcel(Parcel parcel) {
                return new SearchParams(parcel);
            }

            public final Object[] newArray(int i) {
                return new SearchParams[i];
            }
        }

        public SearchParams() {
            throw null;
        }

        public SearchParams(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
            this.f40517b = UUID.randomUUID().toString();
            C21100e.m49373x(tripPlannerLocations, "locations");
            this.f40518c = tripPlannerLocations;
            C21100e.m49373x(tripPlannerOptions, "options");
            this.f40519d = tripPlannerOptions;
            this.f40520e = tripPlannerOptions.mo24463V().mo24487b();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f40517b);
            parcel.writeParcelable(this.f40518c, i);
            parcel.writeParcelable(this.f40519d, i);
            parcel.writeLong(this.f40520e);
        }

        public SearchParams(Parcel parcel) {
            String readString = parcel.readString();
            C21100e.m49373x(readString, "searchId");
            this.f40517b = readString;
            TripPlannerLocations tripPlannerLocations = (TripPlannerLocations) parcel.readParcelable(TripPlannerLocations.class.getClassLoader());
            C21100e.m49373x(tripPlannerLocations, "locations");
            this.f40518c = tripPlannerLocations;
            O o = (TripPlannerOptions) parcel.readParcelable(TripPlannerOptions.class.getClassLoader());
            C21100e.m49373x(o, "options");
            this.f40519d = o;
            this.f40520e = parcel.readLong();
        }
    }
}
