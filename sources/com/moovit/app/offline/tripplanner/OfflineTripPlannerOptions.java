package com.moovit.app.offline.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTime;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class OfflineTripPlannerOptions implements TripPlannerOptions {
    public static final Parcelable.Creator<OfflineTripPlannerOptions> CREATOR = new C15192a();

    /* renamed from: c */
    public static final C15193b f39161c = new C15193b();

    /* renamed from: d */
    public static final C15194c f39162d = new C15194c(OfflineTripPlannerOptions.class);

    /* renamed from: b */
    public final TripPlannerTime f39163b;

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions$a */
    public class C15192a implements Parcelable.Creator<OfflineTripPlannerOptions> {
        public final Object createFromParcel(Parcel parcel) {
            return (OfflineTripPlannerOptions) C19612n.m46981v(parcel, OfflineTripPlannerOptions.f39162d);
        }

        public final Object[] newArray(int i) {
            return new OfflineTripPlannerOptions[i];
        }
    }

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions$b */
    public class C15193b extends C19621u<OfflineTripPlannerOptions> {
        public C15193b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlannerTime tripPlannerTime = ((OfflineTripPlannerOptions) obj).f39163b;
            TripPlannerTime.C7858b bVar = TripPlannerTime.f23797d;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(tripPlannerTime, qVar);
        }
    }

    /* renamed from: com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions$c */
    public class C15194c extends C19620t<OfflineTripPlannerOptions> {
        public C15194c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            TripPlannerTime.C7859c cVar = TripPlannerTime.f23798e;
            pVar.getClass();
            return new OfflineTripPlannerOptions((TripPlannerTime) cVar.read(pVar));
        }
    }

    public OfflineTripPlannerOptions(TripPlannerTime tripPlannerTime) {
        C21100e.m49373x(tripPlannerTime, "time");
        this.f39163b = tripPlannerTime;
    }

    /* renamed from: V */
    public final TripPlannerTime mo24463V() {
        return this.f39163b;
    }

    /* renamed from: Y */
    public final /* synthetic */ TripPlannerSortType mo24464Y() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OfflineTripPlannerOptions)) {
            return false;
        }
        return this.f39163b.equals(((OfflineTripPlannerOptions) obj).f39163b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f39163b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39161c);
    }
}
