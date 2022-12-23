package com.moovit.app.tod.shuttle.booking;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.network.model.ServerId;

public final class TodShuttleBookingInfo implements Parcelable {
    public static final Parcelable.Creator<TodShuttleBookingInfo> CREATOR = new C15539a();

    /* renamed from: b */
    public final ServerId f40394b;

    /* renamed from: c */
    public final long f40395c;

    /* renamed from: d */
    public final TodShuttleTrip f40396d;

    /* renamed from: e */
    public final int f40397e;

    /* renamed from: f */
    public final int f40398f;

    /* renamed from: com.moovit.app.tod.shuttle.booking.TodShuttleBookingInfo$a */
    public class C15539a implements Parcelable.Creator<TodShuttleBookingInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodShuttleBookingInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodShuttleBookingInfo[i];
        }
    }

    public TodShuttleBookingInfo(ServerId serverId, long j, TodShuttleTrip todShuttleTrip, int i, int i2) {
        C21100e.m49373x(serverId, "selectedZoneId");
        this.f40394b = serverId;
        C21100e.m49361r(j, "selectedDay");
        this.f40395c = j;
        this.f40396d = todShuttleTrip;
        C21100e.m49359q(i, "selectedOriginStopIndex");
        this.f40397e = i;
        C21100e.m49359q(i2, "selectedDestinationStopIndex");
        this.f40398f = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40394b, i);
        parcel.writeLong(this.f40395c);
        parcel.writeParcelable(this.f40396d, i);
        parcel.writeInt(this.f40397e);
        parcel.writeInt(this.f40398f);
    }

    public TodShuttleBookingInfo(Parcel parcel) {
        ServerId serverId = (ServerId) parcel.readParcelable(ServerId.class.getClassLoader());
        C21100e.m49373x(serverId, "selectedZoneId");
        this.f40394b = serverId;
        long readLong = parcel.readLong();
        C21100e.m49361r(readLong, "selectedDay");
        this.f40395c = readLong;
        TodShuttleTrip todShuttleTrip = (TodShuttleTrip) parcel.readParcelable(TodShuttleTrip.class.getClassLoader());
        C21100e.m49373x(todShuttleTrip, "selectedTrip");
        this.f40396d = todShuttleTrip;
        int readInt = parcel.readInt();
        C21100e.m49359q(readInt, "selectedOriginStopIndex");
        this.f40397e = readInt;
        int readInt2 = parcel.readInt();
        C21100e.m49359q(readInt2, "selectedDestinationStopIndex");
        this.f40398f = readInt2;
    }
}
