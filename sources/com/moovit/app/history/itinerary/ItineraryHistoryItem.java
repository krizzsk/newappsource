package com.moovit.app.history.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.itinerary.model.Itinerary;
import kotlin.Metadata;
import mf0.C24362h;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/history/itinerary/ItineraryHistoryItem;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class ItineraryHistoryItem implements Parcelable {
    public static final Parcelable.Creator<ItineraryHistoryItem> CREATOR = new C14911b();

    /* renamed from: e */
    public static final C14910a f38128e = new C14910a(ItineraryHistoryItem.class);

    /* renamed from: b */
    public final TripPlanOptions f38129b;

    /* renamed from: c */
    public final Itinerary f38130c;

    /* renamed from: d */
    public final long f38131d;

    /* renamed from: com.moovit.app.history.itinerary.ItineraryHistoryItem$a */
    public static final class C14910a extends C19619s<ItineraryHistoryItem> {
        public C14910a(Class<ItineraryHistoryItem> cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) {
            C24362h.m61208c(pVar);
            TripPlanOptions tripPlanOptions = (TripPlanOptions) pVar.mo51962q(TripPlanOptions.f39802i);
            Itinerary itinerary = (Itinerary) pVar.mo51962q(Itinerary.f41893g);
            long m = pVar.mo51925m();
            C24362h.m61210e(tripPlanOptions, "options");
            C24362h.m61210e(itinerary, "itinerary");
            return new ItineraryHistoryItem(tripPlanOptions, itinerary, m);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) {
            ItineraryHistoryItem itineraryHistoryItem = (ItineraryHistoryItem) obj;
            C24362h.m61211f(itineraryHistoryItem, "obj");
            C24362h.m61208c(qVar);
            qVar.mo51967q(itineraryHistoryItem.f38129b, TripPlanOptions.f39801h);
            qVar.mo51967q(itineraryHistoryItem.f38130c, Itinerary.f41892f);
            qVar.mo51940m(itineraryHistoryItem.f38131d);
        }
    }

    /* renamed from: com.moovit.app.history.itinerary.ItineraryHistoryItem$b */
    public static final class C14911b implements Parcelable.Creator<ItineraryHistoryItem> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ItineraryHistoryItem((TripPlanOptions) parcel.readParcelable(ItineraryHistoryItem.class.getClassLoader()), (Itinerary) parcel.readParcelable(ItineraryHistoryItem.class.getClassLoader()), parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new ItineraryHistoryItem[i];
        }
    }

    public ItineraryHistoryItem(TripPlanOptions tripPlanOptions, Itinerary itinerary, long j) {
        C24362h.m61211f(tripPlanOptions, "options");
        C24362h.m61211f(itinerary, "itinerary");
        this.f38129b = tripPlanOptions;
        this.f38130c = itinerary;
        this.f38131d = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryHistoryItem)) {
            return false;
        }
        ItineraryHistoryItem itineraryHistoryItem = (ItineraryHistoryItem) obj;
        return C24362h.m61206a(this.f38129b, itineraryHistoryItem.f38129b) && C24362h.m61206a(this.f38130c, itineraryHistoryItem.f38130c) && this.f38131d == itineraryHistoryItem.f38131d;
    }

    public final int hashCode() {
        int hashCode = this.f38130c.hashCode();
        long j = this.f38131d;
        return ((hashCode + (this.f38129b.hashCode() * 31)) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ItineraryHistoryItem(options=");
        k.append(this.f38129b);
        k.append(", itinerary=");
        k.append(this.f38130c);
        k.append(", creationTime=");
        k.append(this.f38131d);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f38129b, i);
        parcel.writeParcelable(this.f38130c, i);
        parcel.writeLong(this.f38131d);
    }
}
