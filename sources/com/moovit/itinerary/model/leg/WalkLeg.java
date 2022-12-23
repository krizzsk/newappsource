package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.itinerary.model.TurnInstruction;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class WalkLeg implements Leg {
    public static final Parcelable.Creator<WalkLeg> CREATOR = new C16168a();

    /* renamed from: h */
    public static final C16169b f42145h = new C16169b();

    /* renamed from: i */
    public static final C16170c f42146i = new C16170c(WalkLeg.class);

    /* renamed from: b */
    public final Time f42147b;

    /* renamed from: c */
    public final Time f42148c;

    /* renamed from: d */
    public final LocationDescriptor f42149d;

    /* renamed from: e */
    public final LocationDescriptor f42150e;

    /* renamed from: f */
    public final Polyline f42151f;

    /* renamed from: g */
    public final List<TurnInstruction> f42152g;

    /* renamed from: com.moovit.itinerary.model.leg.WalkLeg$a */
    public class C16168a implements Parcelable.Creator<WalkLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (WalkLeg) C19612n.m46981v(parcel, WalkLeg.f42146i);
        }

        public final Object[] newArray(int i) {
            return new WalkLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WalkLeg$b */
    public class C16169b extends C19621u<WalkLeg> {
        public C16169b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            WalkLeg walkLeg = (WalkLeg) obj;
            Time time = walkLeg.f42147b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = walkLeg.f42148c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = walkLeg.f42149d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = walkLeg.f42150e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = walkLeg.f42151f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(walkLeg.f42152g, TurnInstruction.f41934c);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WalkLeg$c */
    public class C16170c extends C19620t<WalkLeg> {
        public C16170c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            Time.C7914c cVar = Time.f23900p;
            pVar.getClass();
            LocationDescriptor.C7795c cVar2 = LocationDescriptor.f23646m;
            return new WalkLeg((Time) cVar.read(pVar), (Time) cVar.read(pVar), (LocationDescriptor) cVar2.read(pVar), (LocationDescriptor) cVar2.read(pVar), (Polyline) Polylon.f40988k.read(pVar), pVar.mo51959g(TurnInstruction.f41934c));
        }
    }

    public WalkLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, List<TurnInstruction> list) {
        C21100e.m49373x(time, "startTime");
        this.f42147b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42148c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f42149d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f42150e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f42151f = polyline;
        C21100e.m49373x(list, "instructions");
        this.f42152g = list;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42148c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f42149d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f42150e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WalkLeg)) {
            return false;
        }
        WalkLeg walkLeg = (WalkLeg) obj;
        if (!this.f42147b.equals(walkLeg.f42147b) || !this.f42148c.equals(walkLeg.f42148c) || !this.f42149d.equals(walkLeg.f42149d) || !this.f42150e.equals(walkLeg.f42150e) || !this.f42152g.equals(walkLeg.f42152g)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 1;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f42147b.hashCode(), this.f42148c.hashCode(), this.f42149d.hashCode(), this.f42150e.hashCode(), this.f42152g.hashCode());
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39913e(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42147b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42151f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42145h);
    }
}
