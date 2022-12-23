package com.moovit.ticketing.ticket;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.ParcelableMemRef;

public class TicketRef implements Parcelable {
    public static final Parcelable.Creator<TicketRef> CREATOR = new C7751a();

    /* renamed from: b */
    public final TicketId f23516b;

    /* renamed from: c */
    public final ParcelableMemRef<Ticket> f23517c;

    /* renamed from: com.moovit.ticketing.ticket.TicketRef$a */
    public class C7751a implements Parcelable.Creator<TicketRef> {
        public final Object createFromParcel(Parcel parcel) {
            return new TicketRef(parcel);
        }

        public final Object[] newArray(int i) {
            return new TicketRef[i];
        }
    }

    public TicketRef(Ticket ticket, TicketId ticketId) {
        C21100e.m49373x(ticketId, "ticketId");
        this.f23516b = ticketId;
        this.f23517c = ticket != null ? new ParcelableMemRef<>(ticket) : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f23516b, i);
        parcel.writeParcelable(this.f23517c, i);
    }

    public TicketRef(Parcel parcel) {
        TicketId ticketId = (TicketId) parcel.readParcelable(TicketId.class.getClassLoader());
        C21100e.m49373x(ticketId, "ticketId");
        this.f23516b = ticketId;
        this.f23517c = (ParcelableMemRef) parcel.readParcelable(ParcelableMemRef.class.getClassLoader());
    }
}
