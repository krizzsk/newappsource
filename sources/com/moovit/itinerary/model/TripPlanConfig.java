package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TripPlanConfig implements Parcelable {
    public static final Parcelable.Creator<TripPlanConfig> CREATOR = new C16099a();

    /* renamed from: d */
    public static final C16100b f41930d = new C16100b();

    /* renamed from: e */
    public static final C16101c f41931e = new C16101c(TripPlanConfig.class);

    /* renamed from: b */
    public final List<ItinerarySection> f41932b;

    /* renamed from: c */
    public final boolean f41933c;

    /* renamed from: com.moovit.itinerary.model.TripPlanConfig$a */
    public class C16099a implements Parcelable.Creator<TripPlanConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanConfig) C19612n.m46981v(parcel, TripPlanConfig.f41931e);
        }

        public final Object[] newArray(int i) {
            return new TripPlanConfig[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.TripPlanConfig$b */
    public class C16100b extends C19621u<TripPlanConfig> {
        public C16100b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlanConfig tripPlanConfig = (TripPlanConfig) obj;
            qVar.mo51965h(tripPlanConfig.f41932b, ItinerarySection.f41911j);
            qVar.mo51934b(tripPlanConfig.f41933c);
        }
    }

    /* renamed from: com.moovit.itinerary.model.TripPlanConfig$c */
    public class C16101c extends C19620t<TripPlanConfig> {
        public C16101c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ArrayList g = pVar.mo51959g(ItinerarySection.f41912k);
            boolean z = true;
            if (i != 1 || !pVar.mo51919b()) {
                z = false;
            }
            return new TripPlanConfig(g, z);
        }
    }

    public TripPlanConfig(List<ItinerarySection> list, boolean z) {
        C21100e.m49373x(list, "itinerarySections");
        this.f41932b = Collections.unmodifiableList(list);
        this.f41933c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TripPlanConfig)) {
            return false;
        }
        TripPlanConfig tripPlanConfig = (TripPlanConfig) obj;
        if (!this.f41932b.equals(tripPlanConfig.f41932b) || this.f41933c != tripPlanConfig.f41933c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41932b), this.f41933c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41930d);
    }
}
