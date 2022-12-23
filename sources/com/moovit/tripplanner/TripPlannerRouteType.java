package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p824tp.C19739q;
import p824tp.C19746x;

public enum TripPlannerRouteType implements Parcelable {
    LEAST_WALKING(C19746x.least_walking, C19739q.ic_walk_24_on_surface),
    FASTEST(C19746x.fastest, C19739q.ic_trophy_24_on_surface),
    LEAST_TRANSFERS(C19746x.least_transfers, C19739q.ic_transfer_24_on_surface);
    
    public static final C19577c<TripPlannerRouteType> CODER = null;
    public static final Parcelable.Creator<TripPlannerRouteType> CREATOR = null;
    private final int iconResId;
    private final int nameResId;

    /* renamed from: com.moovit.tripplanner.TripPlannerRouteType$a */
    public class C7855a implements Parcelable.Creator<TripPlannerRouteType> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerRouteType) C19612n.m46981v(parcel, TripPlannerRouteType.CODER);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerRouteType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TripPlannerRouteType tripPlannerRouteType;
        TripPlannerRouteType tripPlannerRouteType2;
        TripPlannerRouteType tripPlannerRouteType3;
        CREATOR = new C7855a();
        CODER = new C19577c<>(TripPlannerRouteType.class, tripPlannerRouteType, tripPlannerRouteType2, tripPlannerRouteType3);
    }

    private TripPlannerRouteType(int i, int i2) {
        this.nameResId = i;
        this.iconResId = i2;
    }

    public int describeContents() {
        return 0;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public int getNameResId() {
        return this.nameResId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
