package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum ArrivalState implements Parcelable {
    TRAVELLING,
    ARRIVING_SOON,
    ARRIVAL_IMMINENT,
    DISEMBARK,
    ARRIVED;
    
    public static C19584i<ArrivalState> CODER;
    public static final Parcelable.Creator<ArrivalState> CREATOR = null;

    /* renamed from: com.moovit.navigation.ArrivalState$a */
    public class C4200a implements Parcelable.Creator<ArrivalState> {
        public final Object createFromParcel(Parcel parcel) {
            return (ArrivalState) C19612n.m46981v(parcel, ArrivalState.CODER);
        }

        public final Object[] newArray(int i) {
            return new ArrivalState[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        ArrivalState arrivalState;
        ArrivalState arrivalState2;
        ArrivalState arrivalState3;
        ArrivalState arrivalState4;
        ArrivalState arrivalState5;
        CREATOR = new C4200a();
        CODER = new C19577c(ArrivalState.class, arrivalState, arrivalState2, arrivalState3, arrivalState4, arrivalState5);
    }

    public static ArrivalState getFromBooleanStates(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return ARRIVED;
        }
        if (z3) {
            return DISEMBARK;
        }
        if (z2) {
            return ARRIVAL_IMMINENT;
        }
        if (z) {
            return ARRIVING_SOON;
        }
        return TRAVELLING;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
