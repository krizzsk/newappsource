package p737pv;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingTicket;
import com.moovit.ridesharing.model.EventBookingOption;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEvent;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEventRequest;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption;
import d70.C16536a;

/* renamed from: pv.a */
public final class C19010a extends C13778r<C19010a, C19011b, MVPassengerBookEventRequest> {

    /* renamed from: w */
    public final EventBookingCart f48365w;

    public C19010a(C13752e eVar, EventBookingCart eventBookingCart, String str) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_book_request, C19011b.class);
        C21100e.m49373x(eventBookingCart, "bookingCart");
        this.f48365w = eventBookingCart;
        if (eventBookingCart.f39343b != null) {
            EventBookingTicket eventBookingTicket = eventBookingCart.f39346e;
            EventBookingOption eventBookingOption = eventBookingTicket.f39359d;
            if (eventBookingOption == null && eventBookingCart.f39347f.f39359d == null) {
                throw new IllegalStateException("At least one book option must be non-null!");
            } else if (eventBookingOption == null || eventBookingTicket.f39358c != null) {
                EventBookingTicket eventBookingTicket2 = eventBookingCart.f39347f;
                if (eventBookingTicket2.f39359d == null || eventBookingTicket2.f39358c != null) {
                    RO mVPassengerBookEventRequest = new MVPassengerBookEventRequest();
                    EventBookingTicket eventBookingTicket3 = eventBookingCart.f39346e;
                    if (eventBookingTicket3.f39359d != null) {
                        mVPassengerBookEventRequest.toEvent = m46121O(eventBookingTicket3);
                    }
                    EventBookingTicket eventBookingTicket4 = eventBookingCart.f39347f;
                    if (eventBookingTicket4.f39359d != null) {
                        mVPassengerBookEventRequest.fromEvent = m46121O(eventBookingTicket4);
                    }
                    if (str != null) {
                        mVPassengerBookEventRequest.referredByUser = str;
                    }
                    this.f33922v = mVPassengerBookEventRequest;
                    return;
                }
                throw new IllegalStateException("Return user location must be non-null!");
            } else {
                throw new IllegalStateException("Arrival user location must be non-null!");
            }
        } else {
            throw new IllegalStateException("Booking cart event is missing!");
        }
    }

    /* renamed from: O */
    public static MVPassengerBookEvent m46121O(EventBookingTicket eventBookingTicket) {
        MVLocationDescriptor u = C13749c.m34335u(eventBookingTicket.f39358c);
        MVRSEventTransitOption i = C16536a.m42037i(eventBookingTicket.f39359d);
        int i2 = eventBookingTicket.f39357b;
        MVPassengerBookEvent mVPassengerBookEvent = new MVPassengerBookEvent();
        mVPassengerBookEvent.userLocation = u;
        mVPassengerBookEvent.option = i;
        mVPassengerBookEvent.numberOfSeats = i2;
        mVPassengerBookEvent.mo31168i();
        return mVPassengerBookEvent;
    }
}
