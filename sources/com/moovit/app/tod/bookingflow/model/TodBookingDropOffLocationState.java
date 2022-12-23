package com.moovit.app.tod.bookingflow.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import p583jk.C17884p;
import p977zz.C20975x0;

public class TodBookingDropOffLocationState implements Parcelable {
    public static final Parcelable.Creator<TodBookingDropOffLocationState> CREATOR = new C15469a();

    /* renamed from: b */
    public final LocationDescriptor f40091b;

    /* renamed from: c */
    public final LocationDescriptor f40092c;

    /* renamed from: d */
    public final FailureReason f40093d;

    /* renamed from: com.moovit.app.tod.bookingflow.model.TodBookingDropOffLocationState$a */
    public class C15469a implements Parcelable.Creator<TodBookingDropOffLocationState> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodBookingDropOffLocationState(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodBookingDropOffLocationState[i];
        }
    }

    public TodBookingDropOffLocationState(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, FailureReason failureReason) {
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f40091b = locationDescriptor;
        this.f40092c = locationDescriptor2;
        C21100e.m49373x(failureReason, "failureReason");
        this.f40093d = failureReason;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TodBookingDropOffLocationState)) {
            return false;
        }
        TodBookingDropOffLocationState todBookingDropOffLocationState = (TodBookingDropOffLocationState) obj;
        if (!this.f40091b.equals(todBookingDropOffLocationState.f40091b) || !C20975x0.m49118e(this.f40092c, todBookingDropOffLocationState.f40092c) || !this.f40093d.equals(todBookingDropOffLocationState.f40093d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40091b), C17884p.m44335F(this.f40092c), C17884p.m44335F(this.f40093d));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodBookingDropOffLocationState[pickupLocation=");
        k.append(this.f40091b);
        k.append("dropOffLocation=");
        k.append(this.f40092c);
        k.append(", failureReason=");
        k.append(this.f40093d);
        k.append(']');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40091b, i);
        parcel.writeParcelable(this.f40092c, i);
        parcel.writeInt(this.f40093d.ordinal());
    }

    public TodBookingDropOffLocationState(Parcel parcel) {
        LocationDescriptor locationDescriptor = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f40091b = locationDescriptor;
        this.f40092c = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
        this.f40093d = FailureReason.values()[parcel.readInt()];
    }
}
