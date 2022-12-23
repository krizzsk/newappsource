package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
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

public class WaitToMultiTransitLinesLeg implements Leg {
    public static final Parcelable.Creator<WaitToMultiTransitLinesLeg> CREATOR = new C16157a();

    /* renamed from: e */
    public static final C16158b f42115e = new C16158b();

    /* renamed from: f */
    public static final C16159c f42116f = new C16159c(WaitToMultiTransitLinesLeg.class);

    /* renamed from: b */
    public final List<WaitToTransitLineLeg> f42117b;

    /* renamed from: c */
    public int f42118c;

    /* renamed from: d */
    public final Image f42119d;

    /* renamed from: com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg$a */
    public class C16157a implements Parcelable.Creator<WaitToMultiTransitLinesLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (WaitToMultiTransitLinesLeg) C19612n.m46981v(parcel, WaitToMultiTransitLinesLeg.f42116f);
        }

        public final Object[] newArray(int i) {
            return new WaitToMultiTransitLinesLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg$b */
    public class C16158b extends C19621u<WaitToMultiTransitLinesLeg> {
        public C16158b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) obj;
            qVar.mo51965h(waitToMultiTransitLinesLeg.f42117b, WaitToTransitLineLeg.f42129l);
            qVar.mo51939l(waitToMultiTransitLinesLeg.f42118c);
            qVar.mo51967q(waitToMultiTransitLinesLeg.f42119d, C16019d.m40803a().f41718d);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg$c */
    public class C16159c extends C19620t<WaitToMultiTransitLinesLeg> {
        public C16159c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new WaitToMultiTransitLinesLeg(pVar.mo51959g(WaitToTransitLineLeg.f42130m), pVar.mo51924l(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
        }
    }

    public WaitToMultiTransitLinesLeg(ArrayList arrayList, int i, Image image) {
        C21100e.m49373x(arrayList, "waitLegs");
        this.f42117b = arrayList;
        this.f42118c = i;
        this.f42119d = image;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return mo48467b().f42132c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return mo48467b().mo48332W();
    }

    /* renamed from: b */
    public final WaitToTransitLineLeg mo48467b() {
        return this.f42117b.get(this.f42118c);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return mo48467b().mo48334e2();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WaitToMultiTransitLinesLeg)) {
            return false;
        }
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) obj;
        if (!this.f42117b.equals(waitToMultiTransitLinesLeg.f42117b) || this.f42118c != waitToMultiTransitLinesLeg.f42118c) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 10;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42117b), this.f42118c);
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39910b(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return mo48467b().f42131b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return mo48467b().mo48340w1();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42115e);
    }
}
