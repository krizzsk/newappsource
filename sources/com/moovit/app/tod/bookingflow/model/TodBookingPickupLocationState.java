package com.moovit.app.tod.bookingflow.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import p583jk.C17884p;

public class TodBookingPickupLocationState implements Parcelable {
    public static final Parcelable.Creator<TodBookingPickupLocationState> CREATOR = new C15471a();

    /* renamed from: b */
    public final LocationDescriptor f40099b;

    /* renamed from: c */
    public final FailureReason f40100c;

    /* renamed from: com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState$a */
    public class C15471a implements Parcelable.Creator<TodBookingPickupLocationState> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodBookingPickupLocationState(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodBookingPickupLocationState[i];
        }
    }

    public TodBookingPickupLocationState(LocationDescriptor locationDescriptor, FailureReason failureReason) {
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f40099b = locationDescriptor;
        C21100e.m49373x(failureReason, "failureReason");
        this.f40100c = failureReason;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TodBookingPickupLocationState)) {
            return false;
        }
        TodBookingPickupLocationState todBookingPickupLocationState = (TodBookingPickupLocationState) obj;
        if (!this.f40099b.equals(todBookingPickupLocationState.f40099b) || !this.f40100c.equals(todBookingPickupLocationState.f40100c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40099b), C17884p.m44335F(this.f40100c));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodBookingDropOffLocationState[pickupLocation=");
        k.append(this.f40099b);
        k.append(", failureReason=");
        k.append(this.f40100c);
        k.append(']');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40099b, i);
        parcel.writeInt(this.f40100c.ordinal());
    }

    public TodBookingPickupLocationState(Parcel parcel) {
        LocationDescriptor locationDescriptor = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f40099b = locationDescriptor;
        this.f40100c = FailureReason.values()[parcel.readInt()];
    }
}
