package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class Itinerary implements Parcelable {
    public static final Parcelable.Creator<Itinerary> CREATOR = new C16085a();

    /* renamed from: f */
    public static final C16086b f41892f = new C16086b();

    /* renamed from: g */
    public static final C16087c f41893g = new C16087c(Itinerary.class);

    /* renamed from: b */
    public final String f41894b;

    /* renamed from: c */
    public final ItineraryMetadata f41895c;

    /* renamed from: d */
    public final List<Leg> f41896d;

    /* renamed from: e */
    public Polylon f41897e = null;

    /* renamed from: com.moovit.itinerary.model.Itinerary$a */
    public class C16085a implements Parcelable.Creator<Itinerary> {
        public final Object createFromParcel(Parcel parcel) {
            return (Itinerary) C19612n.m46981v(parcel, Itinerary.f41893g);
        }

        public final Object[] newArray(int i) {
            return new Itinerary[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.Itinerary$b */
    public class C16086b extends C19621u<Itinerary> {
        public C16086b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Itinerary itinerary = (Itinerary) obj;
            qVar.mo51954p(itinerary.f41894b);
            ItineraryMetadata itineraryMetadata = itinerary.f41895c;
            ItineraryMetadata.C16089b bVar = ItineraryMetadata.f41898m;
            qVar.mo51939l(4);
            bVar.mo19622a(itineraryMetadata, qVar);
            qVar.mo51965h(itinerary.f41896d, C16080a.f41870a);
        }
    }

    /* renamed from: com.moovit.itinerary.model.Itinerary$c */
    public class C16087c extends C19620t<Itinerary> {
        public C16087c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new Itinerary(pVar.mo51947p(), (ItineraryMetadata) ItineraryMetadata.f41899n.read(pVar), pVar.mo51959g(C16080a.f41870a));
        }
    }

    public Itinerary(String str, ItineraryMetadata itineraryMetadata, List<Leg> list) {
        C21100e.m49373x(str, "id");
        this.f41894b = str;
        C21100e.m49373x(itineraryMetadata, "metadata");
        this.f41895c = itineraryMetadata;
        C21100e.m49373x(list, "legs");
        this.f41896d = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("legs may not be empty!");
        }
    }

    /* renamed from: K1 */
    public final Time mo48288K1() {
        return mo48290c().mo48331K1();
    }

    /* renamed from: b */
    public final Leg mo48289b() {
        return this.f41896d.get(0);
    }

    /* renamed from: c */
    public final Leg mo48290c() {
        List<Leg> list = this.f41896d;
        return list.get(list.size() - 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Itinerary)) {
            return false;
        }
        return this.f41894b.equals(((Itinerary) obj).f41894b);
    }

    public final int hashCode() {
        return this.f41894b.hashCode();
    }

    /* renamed from: o1 */
    public final Time mo48294o1() {
        return mo48289b().mo48339o1();
    }

    /* renamed from: u0 */
    public final List<Leg> mo48295u0() {
        return Collections.unmodifiableList(this.f41896d);
    }

    /* renamed from: w1 */
    public final Polyline mo48296w1() {
        if (this.f41897e == null) {
            ArrayList arrayList = new ArrayList();
            for (Leg w1 : this.f41896d) {
                Polyline w12 = w1.mo48340w1();
                if (w12 != null) {
                    arrayList.addAll(w12.getPoints());
                }
            }
            this.f41897e = new Polylon(arrayList, true);
        }
        return this.f41897e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41892f);
    }
}
