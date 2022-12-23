package com.moovit.ticketing.purchase.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TicketItineraryLegMissingFare extends TicketItineraryLegFare {
    public static final Parcelable.Creator<TicketItineraryLegMissingFare> CREATOR = new C7703a();

    /* renamed from: c */
    public static final C7704b f23399c = new C7704b(TicketItineraryLegMissingFare.class);

    /* renamed from: b */
    public final String f23400b;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.TicketItineraryLegMissingFare$a */
    public class C7703a implements Parcelable.Creator<TicketItineraryLegMissingFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketItineraryLegMissingFare) C19612n.m46981v(parcel, TicketItineraryLegMissingFare.f23399c);
        }

        public final Object[] newArray(int i) {
            return new TicketItineraryLegMissingFare[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.TicketItineraryLegMissingFare$b */
    public class C7704b extends C19619s<TicketItineraryLegMissingFare> {
        public C7704b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TicketItineraryLegMissingFare(pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((TicketItineraryLegMissingFare) obj).f23400b);
        }
    }

    public TicketItineraryLegMissingFare(String str) {
        C21100e.m49373x(str, "name");
        this.f23400b = str;
    }

    /* renamed from: b */
    public final <V, R> R mo24133b(TicketItineraryLegFare.C7702a<V, R> aVar, V v) {
        return aVar.mo24134c(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23399c);
    }
}
