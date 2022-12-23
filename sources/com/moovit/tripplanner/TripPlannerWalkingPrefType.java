package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum TripPlannerWalkingPrefType implements Parcelable {
    SLOW_WALKING,
    MAX_WALKING_MINUTES;
    
    public static C19577c<TripPlannerWalkingPrefType> CODER;
    public static final Parcelable.Creator<TripPlannerWalkingPrefType> CREATOR = null;

    /* renamed from: com.moovit.tripplanner.TripPlannerWalkingPrefType$a */
    public class C7863a implements Parcelable.Creator<TripPlannerWalkingPrefType> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerWalkingPrefType) C19612n.m46981v(parcel, TripPlannerWalkingPrefType.CODER);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerWalkingPrefType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TripPlannerWalkingPrefType tripPlannerWalkingPrefType;
        TripPlannerWalkingPrefType tripPlannerWalkingPrefType2;
        CREATOR = new C7863a();
        CODER = new C19577c<>(TripPlannerWalkingPrefType.class, tripPlannerWalkingPrefType, tripPlannerWalkingPrefType2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
