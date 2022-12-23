package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.MessageButton;
import com.moovit.network.model.ServerId;
import com.moovit.tripplanner.TripPlannerSortType;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19746x;

public class ItinerarySection implements Parcelable {
    public static final Parcelable.Creator<ItinerarySection> CREATOR = new C16091a();

    /* renamed from: j */
    public static final C16092b f41911j = new C16092b();

    /* renamed from: k */
    public static final C16093c f41912k = new C16093c(ItinerarySection.class);

    /* renamed from: b */
    public final ServerId f41913b;

    /* renamed from: c */
    public final Type f41914c;

    /* renamed from: d */
    public final TripPlannerSortType f41915d;

    /* renamed from: e */
    public final String f41916e;

    /* renamed from: f */
    public final int f41917f;

    /* renamed from: g */
    public int f41918g;

    /* renamed from: h */
    public final boolean f41919h;

    /* renamed from: i */
    public final ItinerarySectionBranding f41920i;

    public enum Type {
        UNSPECIFIED(C19746x.suggested_routes_more_button),
        CARPOOL(C19746x.carpool_suggest_ride_section_action),
        BICYCLE(C19746x.suggested_routes_bike_view_more_button),
        BICYCLE_RENTAL(C19746x.suggested_routes_rental_bike_view_more_button),
        GO_GREEN(0),
        EVENTS(0),
        NO_GROUPING(0);
        
        public static C19577c<Type> CODER;
        private final int showMoreResId;

        /* access modifiers changed from: public */
        static {
            Type type;
            Type type2;
            Type type3;
            Type type4;
            Type type5;
            Type type6;
            Type type7;
            CODER = new C19577c<>(Type.class, type, type2, type3, type4, type5, type6, type7);
        }

        private Type(int i) {
            this.showMoreResId = i;
        }

        public int getShowMoreResId() {
            return this.showMoreResId;
        }

        public boolean isShowMoreSupported() {
            return this.showMoreResId != 0;
        }
    }

    /* renamed from: com.moovit.itinerary.model.ItinerarySection$a */
    public class C16091a implements Parcelable.Creator<ItinerarySection> {
        public final Object createFromParcel(Parcel parcel) {
            return (ItinerarySection) C19612n.m46981v(parcel, ItinerarySection.f41912k);
        }

        public final Object[] newArray(int i) {
            return new ItinerarySection[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.ItinerarySection$b */
    public class C16092b extends C19621u<ItinerarySection> {
        public C16092b() {
            super(5);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ItinerarySection itinerarySection = (ItinerarySection) obj;
            ServerId serverId = itinerarySection.f41913b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            Type.CODER.write(itinerarySection.f41914c, qVar);
            qVar.mo51967q(itinerarySection.f41915d, TripPlannerSortType.CODER);
            qVar.mo51954p(itinerarySection.f41916e);
            qVar.mo51939l(itinerarySection.f41917f);
            qVar.mo51939l(itinerarySection.f41918g);
            qVar.mo51934b(itinerarySection.f41919h);
            qVar.mo51967q(itinerarySection.f41920i, ItinerarySectionBranding.f41921f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.ItinerarySection$c */
    public class C16093c extends C19620t<ItinerarySection> {
        public C16093c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 5;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 0) {
                pVar.getClass();
                return new ItinerarySection(new ServerId(pVar.mo51924l()), Type.UNSPECIFIED, (TripPlannerSortType) null, pVar.mo51947p(), pVar.mo51924l(), -1, false, (ItinerarySectionBranding) null);
            } else if (i == 1) {
                pVar.getClass();
                return new ItinerarySection(new ServerId(pVar.mo51924l()), Type.UNSPECIFIED, (TripPlannerSortType) null, pVar.mo51947p(), pVar.mo51924l(), pVar.mo51924l(), false, (ItinerarySectionBranding) null);
            } else if (i == 2) {
                pVar.getClass();
                return new ItinerarySection(new ServerId(pVar.mo51924l()), Type.UNSPECIFIED, (TripPlannerSortType) null, pVar.mo51947p(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51919b(), (ItinerarySectionBranding) null);
            } else if (i == 3) {
                pVar.getClass();
                return new ItinerarySection(new ServerId(pVar.mo51924l()), (Type) C13555b.m33968g(Type.CODER, pVar), (TripPlannerSortType) null, pVar.mo51947p(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51919b(), (ItinerarySectionBranding) null);
            } else if (i == 4) {
                pVar.getClass();
                return new ItinerarySection(new ServerId(pVar.mo51924l()), (Type) C13555b.m33968g(Type.CODER, pVar), (TripPlannerSortType) pVar.mo51962q(TripPlannerSortType.CODER), pVar.mo51947p(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51919b(), (ItinerarySectionBranding) null);
            } else if (i == 5) {
                pVar.getClass();
                return new ItinerarySection(new ServerId(pVar.mo51924l()), (Type) C13555b.m33968g(Type.CODER, pVar), (TripPlannerSortType) pVar.mo51962q(TripPlannerSortType.CODER), pVar.mo51947p(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51919b(), (ItinerarySectionBranding) pVar.mo51962q(ItinerarySectionBranding.f41921f));
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unsupported version: ", i));
            }
        }
    }

    public /* synthetic */ ItinerarySection() {
        throw null;
    }

    public ItinerarySection(ServerId serverId, Type type, TripPlannerSortType tripPlannerSortType, String str, int i, boolean z, ItinerarySectionBranding itinerarySectionBranding) {
        this(serverId, type, tripPlannerSortType, str, i, -1, z, itinerarySectionBranding);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ItinerarySection)) {
            return false;
        }
        return this.f41913b.equals(((ItinerarySection) obj).f41913b);
    }

    public final int hashCode() {
        return this.f41913b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41911j);
    }

    public ItinerarySection(ServerId serverId, Type type, TripPlannerSortType tripPlannerSortType, String str, int i, int i2, boolean z, ItinerarySectionBranding itinerarySectionBranding) {
        C21100e.m49373x(serverId, "id");
        this.f41913b = serverId;
        C21100e.m49373x(str, MessageButton.TEXT);
        this.f41916e = str;
        C21100e.m49365t(i, "maxItemsToDisplay");
        this.f41917f = i;
        this.f41918g = i2;
        this.f41919h = z;
        this.f41914c = type;
        this.f41915d = tripPlannerSortType;
        this.f41920i = itinerarySectionBranding;
    }
}
