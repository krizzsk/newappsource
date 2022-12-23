package com.moovit.ticketing.purchase.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TicketItineraryLegPurchasableFare extends TicketItineraryLegFare {
    public static final Parcelable.Creator<TicketItineraryLegPurchasableFare> CREATOR = new C7705a();

    /* renamed from: d */
    public static final C7706b f23401d = new C7706b(TicketItineraryLegPurchasableFare.class);

    /* renamed from: b */
    public final TicketFare f23402b;

    /* renamed from: c */
    public final Type f23403c;

    public enum Type {
        PURCHASABLE,
        INCLUDED;
        
        public static final C19584i<Type> CODER = null;

        /* access modifiers changed from: public */
        static {
            Type type;
            Type type2;
            CODER = new C19577c(Type.class, type, type2);
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.TicketItineraryLegPurchasableFare$a */
    public class C7705a implements Parcelable.Creator<TicketItineraryLegPurchasableFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketItineraryLegPurchasableFare) C19612n.m46981v(parcel, TicketItineraryLegPurchasableFare.f23401d);
        }

        public final Object[] newArray(int i) {
            return new TicketItineraryLegPurchasableFare[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.TicketItineraryLegPurchasableFare$b */
    public class C7706b extends C19619s<TicketItineraryLegPurchasableFare> {
        public C7706b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            TicketFare.C7677b bVar = TicketFare.f23325n;
            pVar.getClass();
            return new TicketItineraryLegPurchasableFare((TicketFare) bVar.read(pVar), (Type) pVar.mo51962q(Type.CODER));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TicketItineraryLegPurchasableFare ticketItineraryLegPurchasableFare = (TicketItineraryLegPurchasableFare) obj;
            TicketFare ticketFare = ticketItineraryLegPurchasableFare.f23402b;
            TicketFare.C7677b bVar = TicketFare.f23325n;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketFare, qVar);
            qVar.mo51967q(ticketItineraryLegPurchasableFare.f23403c, Type.CODER);
        }
    }

    public TicketItineraryLegPurchasableFare(TicketFare ticketFare, Type type) {
        C21100e.m49373x(ticketFare, "ticketFare");
        this.f23402b = ticketFare;
        C21100e.m49373x(type, "type");
        this.f23403c = type;
    }

    /* renamed from: b */
    public final <V, R> R mo24133b(TicketItineraryLegFare.C7702a<V, R> aVar, V v) {
        return aVar.mo24135i(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23401d);
    }
}
