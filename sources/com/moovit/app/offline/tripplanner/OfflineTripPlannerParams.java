package com.moovit.app.offline.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerParams;
import com.moovit.tripplanner.TripPlannerTime;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class OfflineTripPlannerParams extends TripPlannerParams {
    public static final Parcelable.Creator<OfflineTripPlannerParams> CREATOR = new C15195a();

    /* renamed from: e */
    public static final C15196b f39164e = new C15196b();

    /* renamed from: f */
    public static final C15197c f39165f = new C15197c(OfflineTripPlannerParams.class);

    /* renamed from: d */
    public final TripPlannerTime f39166d;

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerParams$a */
    public class C15195a implements Parcelable.Creator<OfflineTripPlannerParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (OfflineTripPlannerParams) C19612n.m46981v(parcel, OfflineTripPlannerParams.f39165f);
        }

        public final Object[] newArray(int i) {
            return new OfflineTripPlannerParams[i];
        }
    }

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerParams$b */
    public class C15196b extends C19621u<OfflineTripPlannerParams> {
        public C15196b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            OfflineTripPlannerParams offlineTripPlannerParams = (OfflineTripPlannerParams) obj;
            Parcelable.Creator<OfflineTripPlannerParams> creator = OfflineTripPlannerParams.CREATOR;
            LocationDescriptor locationDescriptor = offlineTripPlannerParams.f23788b;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51967q(locationDescriptor, bVar);
            qVar.mo51967q(offlineTripPlannerParams.f23789c, bVar);
            qVar.mo51967q(offlineTripPlannerParams.f39166d, TripPlannerTime.f23797d);
        }
    }

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerParams$c */
    public class C15197c extends C19620t<OfflineTripPlannerParams> {
        public C15197c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            return new OfflineTripPlannerParams((LocationDescriptor) pVar.mo51962q(cVar), (LocationDescriptor) pVar.mo51962q(cVar), (TripPlannerTime) pVar.mo51962q(TripPlannerTime.f23798e));
        }
    }

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerParams$d */
    public static class C15198d extends TripPlannerParams.C7851a<OfflineTripPlannerParams, C15198d> {
    }

    public OfflineTripPlannerParams(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, TripPlannerTime tripPlannerTime) {
        super(locationDescriptor, locationDescriptor2);
        this.f39166d = tripPlannerTime;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39164e);
    }
}
