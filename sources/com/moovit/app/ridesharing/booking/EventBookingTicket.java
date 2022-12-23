package com.moovit.app.ridesharing.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.transit.LocationDescriptor;

public final class EventBookingTicket implements Parcelable {
    public static final Parcelable.Creator<EventBookingTicket> CREATOR = new C15254a();

    /* renamed from: b */
    public int f39357b;

    /* renamed from: c */
    public LocationDescriptor f39358c;

    /* renamed from: d */
    public EventBookingOption f39359d;

    /* renamed from: com.moovit.app.ridesharing.booking.EventBookingTicket$a */
    public class C15254a implements Parcelable.Creator<EventBookingTicket> {
        public final Object createFromParcel(Parcel parcel) {
            return new EventBookingTicket(parcel);
        }

        public final Object[] newArray(int i) {
            return new EventBookingTicket[i];
        }
    }

    public EventBookingTicket() {
        this.f39357b = 0;
        this.f39358c = null;
        this.f39359d = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f39357b);
        parcel.writeParcelable(this.f39358c, i);
        parcel.writeParcelable(this.f39359d, i);
    }

    public EventBookingTicket(Parcel parcel) {
        this.f39357b = parcel.readInt();
        this.f39358c = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
        this.f39359d = (EventBookingOption) parcel.readParcelable(EventBookingOption.class.getClassLoader());
    }
}
