package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum RideRequestStatus implements Parcelable {
    WAITING,
    CANCELED_BY_PASSENGER,
    FULFILLED,
    NOT_FULFILLED;
    
    public static final C19577c<RideRequestStatus> CODER = null;
    public static final Parcelable.Creator<RideRequestStatus> CREATOR = null;

    /* renamed from: com.moovit.carpool.RideRequestStatus$a */
    public class C15724a implements Parcelable.Creator<RideRequestStatus> {
        public final Object createFromParcel(Parcel parcel) {
            return (RideRequestStatus) C19612n.m46981v(parcel, RideRequestStatus.CODER);
        }

        public final Object[] newArray(int i) {
            return new RideRequestStatus[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        RideRequestStatus rideRequestStatus;
        RideRequestStatus rideRequestStatus2;
        RideRequestStatus rideRequestStatus3;
        RideRequestStatus rideRequestStatus4;
        CREATOR = new C15724a();
        CODER = new C19577c<>(RideRequestStatus.class, rideRequestStatus, rideRequestStatus2, rideRequestStatus3, rideRequestStatus4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
