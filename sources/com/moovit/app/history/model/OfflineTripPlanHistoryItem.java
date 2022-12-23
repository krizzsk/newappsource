package com.moovit.app.history.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.transit.Journey;
import e20.C16783l;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class OfflineTripPlanHistoryItem implements JourneyHistoryItem {
    public static final Parcelable.Creator<OfflineTripPlanHistoryItem> CREATOR = new C14913a();

    /* renamed from: g */
    public static final long f38132g = TimeUnit.DAYS.toMillis(3);

    /* renamed from: h */
    public static final C14914b f38133h = new C14914b();

    /* renamed from: i */
    public static final C14915c f38134i = new C14915c(OfflineTripPlanHistoryItem.class);

    /* renamed from: b */
    public final String f38135b;

    /* renamed from: c */
    public final long f38136c;

    /* renamed from: d */
    public final Journey f38137d;

    /* renamed from: e */
    public final OfflineTripPlannerOptions f38138e;

    /* renamed from: f */
    public final List<Itinerary> f38139f;

    /* renamed from: com.moovit.app.history.model.OfflineTripPlanHistoryItem$a */
    public class C14913a implements Parcelable.Creator<OfflineTripPlanHistoryItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (OfflineTripPlanHistoryItem) C19612n.m46981v(parcel, OfflineTripPlanHistoryItem.f38134i);
        }

        public final Object[] newArray(int i) {
            return new OfflineTripPlanHistoryItem[i];
        }
    }

    /* renamed from: com.moovit.app.history.model.OfflineTripPlanHistoryItem$b */
    public class C14914b extends C19621u<OfflineTripPlanHistoryItem> {
        public C14914b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            OfflineTripPlanHistoryItem offlineTripPlanHistoryItem = (OfflineTripPlanHistoryItem) obj;
            qVar.mo51954p(offlineTripPlanHistoryItem.f38135b);
            qVar.mo51940m(offlineTripPlanHistoryItem.f38136c);
            Journey journey = offlineTripPlanHistoryItem.f38137d;
            Journey.C7791b bVar = Journey.f23641d;
            qVar.mo51939l(0);
            bVar.mo19622a(journey, qVar);
            OfflineTripPlannerOptions offlineTripPlannerOptions = offlineTripPlanHistoryItem.f38138e;
            OfflineTripPlannerOptions.C15193b bVar2 = OfflineTripPlannerOptions.f39161c;
            qVar.mo51939l(0);
            bVar2.mo19622a(offlineTripPlannerOptions, qVar);
            qVar.mo51965h(offlineTripPlanHistoryItem.f38139f, Itinerary.f41892f);
        }
    }

    /* renamed from: com.moovit.app.history.model.OfflineTripPlanHistoryItem$c */
    public class C14915c extends C19620t<OfflineTripPlanHistoryItem> {
        public C14915c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            if (i != 1) {
                return new OfflineTripPlanHistoryItem(UUID.randomUUID().toString(), pVar.mo51925m(), (Journey) Journey.f23642e.read(pVar2), (OfflineTripPlannerOptions) OfflineTripPlannerOptions.f39162d.read(pVar2), pVar2.mo51959g(Itinerary.f41893g));
            }
            return new OfflineTripPlanHistoryItem(pVar.mo51947p(), pVar.mo51925m(), (Journey) Journey.f23642e.read(pVar2), (OfflineTripPlannerOptions) OfflineTripPlannerOptions.f39162d.read(pVar2), pVar2.mo51959g(Itinerary.f41893g));
        }
    }

    public OfflineTripPlanHistoryItem() {
        throw null;
    }

    public OfflineTripPlanHistoryItem(String str, long j, Journey journey, OfflineTripPlannerOptions offlineTripPlannerOptions, List<Itinerary> list) {
        C21100e.m49373x(str, "id");
        this.f38135b = str;
        C21100e.m49367u(j, "creationTime");
        this.f38136c = j;
        C21100e.m49373x(journey, "journey");
        this.f38137d = journey;
        C21100e.m49373x(offlineTripPlannerOptions, "options");
        this.f38138e = offlineTripPlannerOptions;
        C21100e.m49373x(list, "itineraries");
        this.f38139f = list;
    }

    /* renamed from: Z1 */
    public final <T> T mo45080Z1(HistoryItem.C14912a<T> aVar) {
        return aVar.mo40413e1(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final long getCreationTime() {
        return this.f38136c;
    }

    public final String getId() {
        return this.f38135b;
    }

    public final boolean isExpired() {
        if (System.currentTimeMillis() - C16783l.m42466C(this.f38139f) >= f38132g) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    public final Journey mo45084s0() {
        return this.f38137d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38133h);
    }
}
