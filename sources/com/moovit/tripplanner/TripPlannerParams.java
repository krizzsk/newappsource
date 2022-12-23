package com.moovit.tripplanner;

import android.os.Parcelable;
import com.moovit.transit.LocationDescriptor;

public abstract class TripPlannerParams implements Parcelable {

    /* renamed from: b */
    public final LocationDescriptor f23788b;

    /* renamed from: c */
    public final LocationDescriptor f23789c;

    /* renamed from: com.moovit.tripplanner.TripPlannerParams$a */
    public static abstract class C7851a<P extends TripPlannerParams, B extends C7851a<P, B>> {

        /* renamed from: a */
        public LocationDescriptor f23790a = null;

        /* renamed from: b */
        public LocationDescriptor f23791b = null;
    }

    public TripPlannerParams(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        this.f23788b = locationDescriptor;
        this.f23789c = locationDescriptor2;
    }
}
