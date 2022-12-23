package com.moovit.app.tod.shuttle.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.app.tod.shuttle.model.TodZone;

public final class TodShuttleBookingState implements Parcelable {
    public static final Parcelable.Creator<TodShuttleBookingState> CREATOR = new C15540a();

    /* renamed from: b */
    public TodZone f40399b;

    /* renamed from: c */
    public long f40400c;

    /* renamed from: d */
    public TodShuttleTrip f40401d;

    /* renamed from: e */
    public int f40402e;

    /* renamed from: f */
    public int f40403f;

    /* renamed from: g */
    public int f40404g;

    /* renamed from: com.moovit.app.tod.shuttle.booking.TodShuttleBookingState$a */
    public class C15540a implements Parcelable.Creator<TodShuttleBookingState> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodShuttleBookingState(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodShuttleBookingState[i];
        }
    }

    public TodShuttleBookingState() {
        this.f40399b = null;
        this.f40401d = null;
        this.f40400c = -1;
        this.f40402e = -1;
        this.f40403f = -1;
        this.f40404g = -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40399b, i);
        parcel.writeParcelable(this.f40401d, i);
        parcel.writeLong(this.f40400c);
        parcel.writeInt(this.f40402e);
        parcel.writeInt(this.f40403f);
        parcel.writeInt(this.f40404g);
    }

    public TodShuttleBookingState(Parcel parcel) {
        this.f40399b = (TodZone) parcel.readParcelable(TodZone.class.getClassLoader());
        this.f40401d = (TodShuttleTrip) parcel.readParcelable(TodShuttleTrip.class.getClassLoader());
        this.f40400c = parcel.readLong();
        this.f40402e = parcel.readInt();
        this.f40403f = parcel.readInt();
        this.f40404g = parcel.readInt();
    }
}
