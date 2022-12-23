package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum EventVehicleType implements Parcelable {
    BUS,
    MINIBUS,
    TAXI;
    
    public static final C19577c<EventVehicleType> CODER = null;
    public static final Parcelable.Creator<EventVehicleType> CREATOR = null;

    /* renamed from: com.moovit.ridesharing.model.EventVehicleType$a */
    public class C16439a implements Parcelable.Creator<EventVehicleType> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventVehicleType) C19612n.m46981v(parcel, EventVehicleType.CODER);
        }

        public final Object[] newArray(int i) {
            return new EventVehicleType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        EventVehicleType eventVehicleType;
        EventVehicleType eventVehicleType2;
        EventVehicleType eventVehicleType3;
        CODER = new C19577c<>(EventVehicleType.class, eventVehicleType, eventVehicleType2, eventVehicleType3);
        CREATOR = new C16439a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
