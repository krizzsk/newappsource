package com.moovit.app.tod.bookingflow.model;

import android.os.Parcel;
import android.os.Parcelable;

public class TodZoneDropOffRestrictions implements Parcelable {
    public static final Parcelable.Creator<TodZoneDropOffRestrictions> CREATOR = new C15472a();

    /* renamed from: b */
    public final int f40101b;

    /* renamed from: com.moovit.app.tod.bookingflow.model.TodZoneDropOffRestrictions$a */
    public class C15472a implements Parcelable.Creator<TodZoneDropOffRestrictions> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodZoneDropOffRestrictions(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodZoneDropOffRestrictions[i];
        }
    }

    public TodZoneDropOffRestrictions(int i) {
        this.f40101b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TodZoneDropOffRestrictions) && this.f40101b == ((TodZoneDropOffRestrictions) obj).f40101b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40101b;
    }

    public final String toString() {
        return C16530d.m42014g(C13555b.m33972k("TodZoneShape{minDistanceToPickup="), this.f40101b, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40101b);
    }

    public TodZoneDropOffRestrictions(Parcel parcel) {
        this.f40101b = parcel.readInt();
    }
}
