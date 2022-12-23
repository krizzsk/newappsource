package com.moovit.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.tripplanner.TripPlannerTime;
import java.io.IOException;
import java.util.UUID;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TripPlanFlexTimeBanner implements Parcelable {
    public static final Parcelable.Creator<TripPlanFlexTimeBanner> CREATOR = new C16071a();

    /* renamed from: f */
    public static final C16072b f41844f = new C16072b(TripPlanFlexTimeBanner.class);

    /* renamed from: b */
    public final ServerId f41845b;

    /* renamed from: c */
    public final String f41846c;

    /* renamed from: d */
    public final int f41847d;

    /* renamed from: e */
    public final TripPlannerTime f41848e;

    /* renamed from: com.moovit.itinerary.TripPlanFlexTimeBanner$a */
    public class C16071a implements Parcelable.Creator<TripPlanFlexTimeBanner> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanFlexTimeBanner) C19612n.m46981v(parcel, TripPlanFlexTimeBanner.f41844f);
        }

        public final Object[] newArray(int i) {
            return new TripPlanFlexTimeBanner[i];
        }
    }

    /* renamed from: com.moovit.itinerary.TripPlanFlexTimeBanner$b */
    public class C16072b extends C19619s<TripPlanFlexTimeBanner> {
        public C16072b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            int l = pVar.mo51924l();
            TripPlannerTime tripPlannerTime = (TripPlannerTime) TripPlannerTime.f23798e.read(pVar);
            if (i >= 1) {
                str = pVar.mo51947p();
            } else {
                str = UUID.randomUUID().toString();
            }
            return new TripPlanFlexTimeBanner(serverId, str, l, tripPlannerTime);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TripPlanFlexTimeBanner tripPlanFlexTimeBanner = (TripPlanFlexTimeBanner) obj;
            ServerId serverId = tripPlanFlexTimeBanner.f41845b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(tripPlanFlexTimeBanner.f41847d);
            TripPlannerTime tripPlannerTime = tripPlanFlexTimeBanner.f41848e;
            TripPlannerTime.C7858b bVar = TripPlannerTime.f23797d;
            qVar.mo51939l(0);
            bVar.mo19622a(tripPlannerTime, qVar);
            qVar.mo51954p(tripPlanFlexTimeBanner.f41846c);
        }
    }

    public TripPlanFlexTimeBanner(ServerId serverId, String str, int i, TripPlannerTime tripPlannerTime) {
        this.f41845b = serverId;
        C21100e.m49373x(str, "bannerId");
        this.f41846c = str;
        this.f41847d = i;
        this.f41848e = tripPlannerTime;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41844f);
    }
}
