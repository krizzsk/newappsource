package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.TurnInstruction;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20944i0;
import p977zz.C20975x0;

public class BicycleRentalLeg implements Leg {
    public static final Parcelable.Creator<BicycleRentalLeg> CREATOR = new C16106a();

    /* renamed from: k */
    public static final C16107b f41945k = new C16107b();

    /* renamed from: l */
    public static final C16108c f41946l = new C16108c(BicycleRentalLeg.class);

    /* renamed from: b */
    public final Time f41947b;

    /* renamed from: c */
    public final Time f41948c;

    /* renamed from: d */
    public final C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> f41949d;

    /* renamed from: e */
    public final List<DbEntityRef<BicycleStop>> f41950e;

    /* renamed from: f */
    public final C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> f41951f;

    /* renamed from: g */
    public final List<DbEntityRef<BicycleStop>> f41952g;

    /* renamed from: h */
    public final Polyline f41953h;

    /* renamed from: i */
    public final List<TurnInstruction> f41954i;

    /* renamed from: j */
    public final MicroMobilityIntegrationItem f41955j;

    /* renamed from: com.moovit.itinerary.model.leg.BicycleRentalLeg$a */
    public class C16106a implements Parcelable.Creator<BicycleRentalLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (BicycleRentalLeg) C19612n.m46981v(parcel, BicycleRentalLeg.f41946l);
        }

        public final Object[] newArray(int i) {
            return new BicycleRentalLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.BicycleRentalLeg$b */
    public class C16107b extends C19621u<BicycleRentalLeg> {
        public C16107b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            BicycleRentalLeg bicycleRentalLeg = (BicycleRentalLeg) obj;
            Time time = bicycleRentalLeg.f41947b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = bicycleRentalLeg.f41948c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> i0Var = bicycleRentalLeg.f41949d;
            C19584i<DbEntityRef<BicycleStop>> iVar = DbEntityRef.BICYCLE_STOP_REF_CODER;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            C21100e.m49373x(iVar, "firstWriter");
            qVar.mo51967q(i0Var.f52692a, iVar);
            qVar.mo51967q(i0Var.f52693b, bVar2);
            qVar.mo51965h(bicycleRentalLeg.f41950e, DbEntityRef.BICYCLE_STOP_REF_CODER);
            C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> i0Var2 = bicycleRentalLeg.f41951f;
            C19584i<DbEntityRef<BicycleStop>> iVar2 = DbEntityRef.BICYCLE_STOP_REF_CODER;
            C21100e.m49373x(iVar2, "firstWriter");
            qVar.mo51967q(i0Var2.f52692a, iVar2);
            qVar.mo51967q(i0Var2.f52693b, bVar2);
            qVar.mo51965h(bicycleRentalLeg.f41952g, DbEntityRef.BICYCLE_STOP_REF_CODER);
            Polyline polyline = bicycleRentalLeg.f41953h;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(bicycleRentalLeg.f41954i, TurnInstruction.f41934c);
            qVar.mo51967q(bicycleRentalLeg.f41955j, MicroMobilityIntegrationItem.f14811f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.BicycleRentalLeg$c */
    public class C16108c extends C19620t<BicycleRentalLeg> {
        public C16108c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            MicroMobilityIntegrationItem microMobilityIntegrationItem;
            Time.C7914c cVar = Time.f23900p;
            pVar.getClass();
            Time time = (Time) cVar.read(pVar);
            Time time2 = (Time) cVar.read(pVar);
            C19584i iVar = DbEntityRef.BICYCLE_STOP_REF_CODER;
            LocationDescriptor.C7795c cVar2 = LocationDescriptor.f23646m;
            C21100e.m49373x(iVar, "firstReader");
            C21100e.m49373x(cVar2, "secondReader");
            C20944i0 i0Var = new C20944i0(pVar.mo51962q(iVar), pVar.mo51962q(cVar2));
            ArrayList<DbEntityRef<BicycleStop>> g = pVar.mo51959g(DbEntityRef.BICYCLE_STOP_REF_CODER);
            C19584i iVar2 = DbEntityRef.BICYCLE_STOP_REF_CODER;
            C21100e.m49373x(iVar2, "firstReader");
            C20944i0 i0Var2 = new C20944i0(pVar.mo51962q(iVar2), pVar.mo51962q(cVar2));
            ArrayList<DbEntityRef<BicycleStop>> g2 = pVar.mo51959g(DbEntityRef.BICYCLE_STOP_REF_CODER);
            Polyline polyline = (Polyline) Polylon.f40988k.read(pVar);
            ArrayList g3 = pVar.mo51959g(TurnInstruction.f41934c);
            if (i >= 1) {
                microMobilityIntegrationItem = (MicroMobilityIntegrationItem) pVar.mo51962q(MicroMobilityIntegrationItem.f14811f);
            } else {
                microMobilityIntegrationItem = null;
            }
            return new BicycleRentalLeg(time, time2, i0Var, g, i0Var2, g2, polyline, g3, microMobilityIntegrationItem);
        }
    }

    public BicycleRentalLeg(Time time, Time time2, C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> i0Var, List<DbEntityRef<BicycleStop>> list, C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> i0Var2, List<DbEntityRef<BicycleStop>> list2, Polyline polyline, List<TurnInstruction> list3, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49373x(time, "startTime");
        this.f41947b = time;
        C21100e.m49373x(time2, "endTime");
        this.f41948c = time2;
        C21100e.m49373x(i0Var, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f41949d = i0Var;
        C21100e.m49373x(list, "originNearbyBicycleStops");
        this.f41950e = list;
        C21100e.m49373x(i0Var2, "destination");
        this.f41951f = i0Var2;
        C21100e.m49373x(list2, "destinationNearbyBicycleStops");
        this.f41952g = list2;
        C21100e.m49373x(polyline, "shape");
        this.f41953h = polyline;
        C21100e.m49373x(list3, "instructions");
        this.f41954i = list3;
        this.f41955j = microMobilityIntegrationItem;
        F f = i0Var.f52692a;
        if (f == null && i0Var.f52693b == null) {
            throw new IllegalStateException("Origin bicycle stop/location descriptor must be set!");
        }
        F f2 = i0Var2.f52692a;
        if (f2 == null && i0Var2.f52693b == null) {
            throw new IllegalStateException("Destination bicycle stop/location descriptor must be set!");
        } else if (f == null && f2 == null) {
            throw new IllegalStateException("At least one origin/destination bicycle stop must be set!");
        }
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f41948c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> i0Var = this.f41949d;
        F f = i0Var.f52692a;
        if (f != null) {
            return LocationDescriptor.m17768b((BicycleStop) ((DbEntityRef) f).get());
        }
        return (LocationDescriptor) i0Var.f52693b;
    }

    /* renamed from: b */
    public final DbEntityRef<BicycleStop> mo48344b() {
        return (DbEntityRef) this.f41951f.f52692a;
    }

    /* renamed from: c */
    public final DbEntityRef<BicycleStop> mo48345c() {
        return (DbEntityRef) this.f41949d.f52692a;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        C20944i0<DbEntityRef<BicycleStop>, LocationDescriptor> i0Var = this.f41951f;
        F f = i0Var.f52692a;
        if (f != null) {
            return LocationDescriptor.m17768b((BicycleStop) ((DbEntityRef) f).get());
        }
        return (LocationDescriptor) i0Var.f52693b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BicycleRentalLeg)) {
            return false;
        }
        BicycleRentalLeg bicycleRentalLeg = (BicycleRentalLeg) obj;
        if (!this.f41947b.equals(bicycleRentalLeg.f41947b) || !this.f41948c.equals(bicycleRentalLeg.f41948c) || !this.f41949d.equals(bicycleRentalLeg.f41949d) || !this.f41951f.equals(bicycleRentalLeg.f41951f) || !this.f41954i.equals(bicycleRentalLeg.f41954i) || !C20975x0.m49118e(this.f41955j, bicycleRentalLeg.f41955j)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 12;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41947b), C17884p.m44335F(this.f41948c), C17884p.m44335F(this.f41949d), C17884p.m44335F(this.f41951f), C17884p.m44335F(this.f41954i), C17884p.m44335F(this.f41955j));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39914f(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f41947b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f41953h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41945k);
    }
}
