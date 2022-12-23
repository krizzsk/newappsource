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

public class BicycleLeg implements Leg {
    public static final Parcelable.Creator<BicycleLeg> CREATOR = new C16103a();

    /* renamed from: h */
    public static final C16104b f41937h = new C16104b();

    /* renamed from: i */
    public static final C16105c f41938i = new C16105c(BicycleLeg.class);

    /* renamed from: b */
    public final Time f41939b;

    /* renamed from: c */
    public final Time f41940c;

    /* renamed from: d */
    public final LocationDescriptor f41941d;

    /* renamed from: e */
    public final LocationDescriptor f41942e;

    /* renamed from: f */
    public final Polyline f41943f;

    /* renamed from: g */
    public final List<TurnInstruction> f41944g;

    /* renamed from: com.moovit.itinerary.model.leg.BicycleLeg$a */
    public class C16103a implements Parcelable.Creator<BicycleLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (BicycleLeg) C19612n.m46981v(parcel, BicycleLeg.f41938i);
        }

        public final Object[] newArray(int i) {
            return new BicycleLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.BicycleLeg$b */
    public class C16104b extends C19621u<BicycleLeg> {
        public C16104b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            BicycleLeg bicycleLeg = (BicycleLeg) obj;
            Time time = bicycleLeg.f41939b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = bicycleLeg.f41940c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = bicycleLeg.f41941d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = bicycleLeg.f41942e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = bicycleLeg.f41943f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(bicycleLeg.f41944g, TurnInstruction.f41934c);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.BicycleLeg$c */
    public class C16105c extends C19620t<BicycleLeg> {
        public C16105c(Class cls) {
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
            return new BicycleLeg((Time) cVar.read(pVar), (Time) cVar.read(pVar), (LocationDescriptor) cVar2.read(pVar), (LocationDescriptor) cVar2.read(pVar), (Polyline) Polylon.f40988k.read(pVar), pVar.mo51959g(TurnInstruction.f41934c));
        }
    }

    public BicycleLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, List<TurnInstruction> list) {
        C21100e.m49373x(time, "startTime");
        this.f41939b = time;
        C21100e.m49373x(time2, "endTime");
        this.f41940c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f41941d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f41942e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f41943f = polyline;
        C21100e.m49373x(list, "instructions");
        this.f41944g = list;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f41940c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f41941d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f41942e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BicycleLeg)) {
            return false;
        }
        BicycleLeg bicycleLeg = (BicycleLeg) obj;
        if (!this.f41939b.equals(bicycleLeg.f41939b) || !this.f41940c.equals(bicycleLeg.f41940c) || !this.f41941d.equals(bicycleLeg.f41941d) || !this.f41942e.equals(bicycleLeg.f41942e) || !this.f41944g.equals(bicycleLeg.f41944g)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 11;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f41939b.hashCode(), this.f41940c.hashCode(), this.f41941d.hashCode(), this.f41942e.hashCode(), this.f41944g.hashCode());
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39917i(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f41939b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f41943f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41937h);
    }
}
