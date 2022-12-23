package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TripPlannerLocations implements Parcelable {
    public static final Parcelable.Creator<TripPlannerLocations> CREATOR = new C7848a();

    /* renamed from: d */
    public static final C7849b f23784d = new C7849b();

    /* renamed from: e */
    public static final C7850c f23785e = new C7850c(TripPlannerLocations.class);

    /* renamed from: b */
    public final LocationDescriptor f23786b;

    /* renamed from: c */
    public final LocationDescriptor f23787c;

    /* renamed from: com.moovit.tripplanner.TripPlannerLocations$a */
    public class C7848a implements Parcelable.Creator<TripPlannerLocations> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerLocations) C19612n.m46981v(parcel, TripPlannerLocations.f23785e);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerLocations[i];
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerLocations$b */
    public class C7849b extends C19621u<TripPlannerLocations> {
        public C7849b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlannerLocations tripPlannerLocations = (TripPlannerLocations) obj;
            LocationDescriptor locationDescriptor = tripPlannerLocations.f23786b;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51967q(locationDescriptor, bVar);
            qVar.mo51967q(tripPlannerLocations.f23787c, bVar);
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerLocations$c */
    public class C7850c extends C19620t<TripPlannerLocations> {
        public C7850c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            return new TripPlannerLocations((LocationDescriptor) pVar.mo51962q(cVar), (LocationDescriptor) pVar.mo51962q(cVar));
        }
    }

    public TripPlannerLocations(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        this.f23786b = locationDescriptor;
        this.f23787c = locationDescriptor2;
    }

    /* renamed from: b */
    public final boolean mo24458b() {
        boolean z;
        boolean z2;
        if (this.f23786b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f23787c != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23784d);
    }
}
