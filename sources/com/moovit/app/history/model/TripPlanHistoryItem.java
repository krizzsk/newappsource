package com.moovit.app.history.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.transit.Journey;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import e20.C16783l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TripPlanHistoryItem implements JourneyHistoryItem {
    public static final Parcelable.Creator<TripPlanHistoryItem> CREATOR = new C14916a();

    /* renamed from: h */
    public static final long f38140h = TimeUnit.DAYS.toMillis(30);

    /* renamed from: i */
    public static final C14917b f38141i = new C14917b();

    /* renamed from: j */
    public static final C14918c f38142j = new C14918c(TripPlanHistoryItem.class);

    /* renamed from: b */
    public final String f38143b;

    /* renamed from: c */
    public final long f38144c;

    /* renamed from: d */
    public final Journey f38145d;

    /* renamed from: e */
    public final TripPlanConfig f38146e;

    /* renamed from: f */
    public final TripPlanOptions f38147f;

    /* renamed from: g */
    public final List<Itinerary> f38148g;

    /* renamed from: com.moovit.app.history.model.TripPlanHistoryItem$a */
    public class C14916a implements Parcelable.Creator<TripPlanHistoryItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanHistoryItem) C19612n.m46981v(parcel, TripPlanHistoryItem.f38142j);
        }

        public final Object[] newArray(int i) {
            return new TripPlanHistoryItem[i];
        }
    }

    /* renamed from: com.moovit.app.history.model.TripPlanHistoryItem$b */
    public class C14917b extends C19621u<TripPlanHistoryItem> {
        public C14917b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlanHistoryItem tripPlanHistoryItem = (TripPlanHistoryItem) obj;
            qVar.mo51954p(tripPlanHistoryItem.f38143b);
            Journey journey = tripPlanHistoryItem.f38145d;
            Journey.C7791b bVar = Journey.f23641d;
            qVar.mo51939l(0);
            bVar.mo19622a(journey, qVar);
            TripPlanConfig tripPlanConfig = tripPlanHistoryItem.f38146e;
            TripPlanConfig.C16100b bVar2 = TripPlanConfig.f41930d;
            qVar.mo51939l(1);
            bVar2.mo19622a(tripPlanConfig, qVar);
            qVar.mo51965h(tripPlanHistoryItem.f38148g, Itinerary.f41892f);
            qVar.mo51940m(tripPlanHistoryItem.f38144c);
            TripPlanOptions tripPlanOptions = tripPlanHistoryItem.f38147f;
            TripPlanOptions.C15370b bVar3 = TripPlanOptions.f39801h;
            qVar.mo51939l(4);
            bVar3.mo19622a(tripPlanOptions, qVar);
        }
    }

    /* renamed from: com.moovit.app.history.model.TripPlanHistoryItem$c */
    public class C14918c extends C19620t<TripPlanHistoryItem> {
        public C14918c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            int i2 = i;
            if (i2 == 1) {
                String uuid = UUID.randomUUID().toString();
                Journey.C7792c cVar = Journey.f23642e;
                pVar.getClass();
                ArrayList g = pVar2.mo51959g(Itinerary.f41893g);
                return new TripPlanHistoryItem(uuid, pVar.mo51925m(), (Journey) cVar.read(pVar2), (TripPlanConfig) TripPlanConfig.f41931e.read(pVar2), (TripPlanOptions) TripPlanOptions.f39802i.read(pVar2), g);
            } else if (i2 != 2) {
                String uuid2 = UUID.randomUUID().toString();
                Journey.C7792c cVar2 = Journey.f23642e;
                pVar.getClass();
                ArrayList g2 = pVar2.mo51959g(Itinerary.f41893g);
                return new TripPlanHistoryItem(uuid2, pVar.mo51925m(), (Journey) cVar2.read(pVar2), (TripPlanConfig) TripPlanConfig.f41931e.read(pVar2), new TripPlanOptions(TripPlannerTime.m17899f(), TripPlannerRouteType.FASTEST, EnumSet.allOf(TripPlannerTransportType.class), (TripPlannerSortType) null, new TripPlannerPersonalPrefs(false, -1), new AccessibilityPersonalPrefs()), g2);
            } else {
                ArrayList g3 = pVar2.mo51959g(Itinerary.f41893g);
                return new TripPlanHistoryItem(pVar.mo51947p(), pVar.mo51925m(), (Journey) Journey.f23642e.read(pVar2), (TripPlanConfig) TripPlanConfig.f41931e.read(pVar2), (TripPlanOptions) TripPlanOptions.f39802i.read(pVar2), g3);
            }
        }
    }

    public TripPlanHistoryItem() {
        throw null;
    }

    public TripPlanHistoryItem(String str, long j, Journey journey, TripPlanConfig tripPlanConfig, TripPlanOptions tripPlanOptions, List<Itinerary> list) {
        C21100e.m49373x(str, "id");
        this.f38143b = str;
        C21100e.m49367u(j, "creationTime");
        this.f38144c = j;
        C21100e.m49373x(journey, "journey");
        this.f38145d = journey;
        C21100e.m49373x(tripPlanConfig, "config");
        this.f38146e = tripPlanConfig;
        C21100e.m49373x(tripPlanOptions, "options");
        this.f38147f = tripPlanOptions;
        C21100e.m49373x(list, "itineraries");
        this.f38148g = list;
    }

    /* renamed from: Z1 */
    public final <T> T mo45080Z1(HistoryItem.C14912a<T> aVar) {
        return aVar.mo40412D(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final long getCreationTime() {
        return this.f38144c;
    }

    public final String getId() {
        return this.f38143b;
    }

    public final boolean isExpired() {
        if (System.currentTimeMillis() - C16783l.m42466C(this.f38148g) >= f38140h) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    public final Journey mo45084s0() {
        return this.f38145d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38141i);
    }
}
