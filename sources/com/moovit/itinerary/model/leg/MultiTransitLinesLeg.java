package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class MultiTransitLinesLeg implements Leg {
    public static final Parcelable.Creator<MultiTransitLinesLeg> CREATOR = new C16145a();

    /* renamed from: d */
    public static final C16146b f42084d = new C16146b();

    /* renamed from: e */
    public static final C16147c f42085e = new C16147c(MultiTransitLinesLeg.class);

    /* renamed from: b */
    public final List<TransitLineLeg> f42086b;

    /* renamed from: c */
    public int f42087c;

    /* renamed from: com.moovit.itinerary.model.leg.MultiTransitLinesLeg$a */
    public class C16145a implements Parcelable.Creator<MultiTransitLinesLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (MultiTransitLinesLeg) C19612n.m46981v(parcel, MultiTransitLinesLeg.f42085e);
        }

        public final Object[] newArray(int i) {
            return new MultiTransitLinesLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.MultiTransitLinesLeg$b */
    public class C16146b extends C19621u<MultiTransitLinesLeg> {
        public C16146b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) obj;
            qVar.mo51965h(multiTransitLinesLeg.f42086b, TransitLineLeg.f42106i);
            qVar.mo51939l(multiTransitLinesLeg.f42087c);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.MultiTransitLinesLeg$c */
    public class C16147c extends C19620t<MultiTransitLinesLeg> {
        public C16147c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new MultiTransitLinesLeg(pVar.mo51959g(TransitLineLeg.f42107j), pVar.mo51924l());
        }
    }

    public MultiTransitLinesLeg(ArrayList arrayList, int i) {
        C21100e.m49373x(arrayList, "lineLegs");
        this.f42086b = arrayList;
        this.f42087c = i;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return mo48440b().f42109c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return mo48440b().mo48332W();
    }

    /* renamed from: b */
    public final TransitLineLeg mo48440b() {
        return this.f42086b.get(this.f42087c);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return mo48440b().mo48334e2();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MultiTransitLinesLeg)) {
            return false;
        }
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) obj;
        if (!this.f42086b.equals(multiTransitLinesLeg.f42086b) || this.f42087c != multiTransitLinesLeg.f42087c) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 9;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42086b), this.f42087c);
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39912d(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return mo48440b().f42108b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return mo48440b().f42112f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42084d);
    }
}
