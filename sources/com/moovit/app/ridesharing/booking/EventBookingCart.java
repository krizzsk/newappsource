package com.moovit.app.ridesharing.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventBookingBucket;

public final class EventBookingCart implements Parcelable {
    public static final Parcelable.Creator<EventBookingCart> CREATOR = new C15251a();

    /* renamed from: b */
    public Event f39343b;

    /* renamed from: c */
    public EventBookingBucket f39344c;

    /* renamed from: d */
    public boolean f39345d;

    /* renamed from: e */
    public final EventBookingTicket f39346e;

    /* renamed from: f */
    public final EventBookingTicket f39347f;

    /* renamed from: com.moovit.app.ridesharing.booking.EventBookingCart$a */
    public class C15251a implements Parcelable.Creator<EventBookingCart> {
        public final Object createFromParcel(Parcel parcel) {
            return new EventBookingCart(parcel);
        }

        public final Object[] newArray(int i) {
            return new EventBookingCart[i];
        }
    }

    public EventBookingCart() {
        this.f39343b = null;
        this.f39344c = null;
        this.f39345d = false;
        this.f39346e = new EventBookingTicket();
        this.f39347f = new EventBookingTicket();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f39343b, i);
        parcel.writeParcelable(this.f39344c, i);
        parcel.writeInt(this.f39345d ? 1 : 0);
        parcel.writeParcelable(this.f39346e, i);
        parcel.writeParcelable(this.f39347f, i);
    }

    public EventBookingCart(Parcel parcel) {
        this.f39343b = (Event) parcel.readParcelable(Event.class.getClassLoader());
        this.f39344c = (EventBookingBucket) parcel.readParcelable(EventBookingBucket.class.getClassLoader());
        this.f39345d = parcel.readInt() != 1 ? false : true;
        this.f39346e = (EventBookingTicket) parcel.readParcelable(EventBookingTicket.class.getClassLoader());
        this.f39347f = (EventBookingTicket) parcel.readParcelable(EventBookingTicket.class.getClassLoader());
    }
}
