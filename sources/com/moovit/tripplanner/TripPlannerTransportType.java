package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum TripPlannerTransportType implements Parcelable {
    TRAM,
    SUBWAY,
    TRAIN,
    BUS,
    FERRY,
    CABLE,
    GONDOLA,
    FUNICULAR,
    PERSONAL_CAR,
    BICYCLE,
    SCOOTER,
    MOPED,
    CAR;
    
    public static final C19577c<TripPlannerTransportType> CODER = null;
    public static final Parcelable.Creator<TripPlannerTransportType> CREATOR = null;

    /* renamed from: com.moovit.tripplanner.TripPlannerTransportType$a */
    public class C7860a implements Parcelable.Creator<TripPlannerTransportType> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerTransportType) C19612n.m46981v(parcel, TripPlannerTransportType.CODER);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerTransportType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TripPlannerTransportType tripPlannerTransportType;
        TripPlannerTransportType tripPlannerTransportType2;
        TripPlannerTransportType tripPlannerTransportType3;
        TripPlannerTransportType tripPlannerTransportType4;
        TripPlannerTransportType tripPlannerTransportType5;
        TripPlannerTransportType tripPlannerTransportType6;
        TripPlannerTransportType tripPlannerTransportType7;
        TripPlannerTransportType tripPlannerTransportType8;
        TripPlannerTransportType tripPlannerTransportType9;
        TripPlannerTransportType tripPlannerTransportType10;
        TripPlannerTransportType tripPlannerTransportType11;
        TripPlannerTransportType tripPlannerTransportType12;
        TripPlannerTransportType tripPlannerTransportType13;
        CREATOR = new C7860a();
        CODER = new C19577c<>(TripPlannerTransportType.class, tripPlannerTransportType, tripPlannerTransportType2, tripPlannerTransportType3, tripPlannerTransportType4, tripPlannerTransportType5, tripPlannerTransportType6, tripPlannerTransportType7, tripPlannerTransportType8, tripPlannerTransportType10, tripPlannerTransportType11, tripPlannerTransportType12, tripPlannerTransportType13, tripPlannerTransportType9);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
