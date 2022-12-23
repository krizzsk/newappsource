package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.network.model.ServerId;
import com.moovit.taxi.TaxiPrice;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.Map;
import p241s0.C6302b;
import p583jk.C17884p;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TaxiLeg implements Leg {
    public static final Parcelable.Creator<TaxiLeg> CREATOR = new C16151a();

    /* renamed from: k */
    public static final C16152b f42095k = new C16152b();

    /* renamed from: l */
    public static final C16153c f42096l = new C16153c(TaxiLeg.class);

    /* renamed from: b */
    public final ServerId f42097b;

    /* renamed from: c */
    public final Time f42098c;

    /* renamed from: d */
    public final Time f42099d;

    /* renamed from: e */
    public final LocationDescriptor f42100e;

    /* renamed from: f */
    public final LocationDescriptor f42101f;

    /* renamed from: g */
    public final Polyline f42102g;

    /* renamed from: h */
    public final TaxiPrice f42103h;

    /* renamed from: i */
    public final int f42104i;

    /* renamed from: j */
    public final Map<String, String> f42105j;

    /* renamed from: com.moovit.itinerary.model.leg.TaxiLeg$a */
    public class C16151a implements Parcelable.Creator<TaxiLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiLeg) C19612n.m46981v(parcel, TaxiLeg.f42096l);
        }

        public final Object[] newArray(int i) {
            return new TaxiLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.TaxiLeg$b */
    public class C16152b extends C19621u<TaxiLeg> {
        public C16152b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TaxiLeg taxiLeg = (TaxiLeg) obj;
            Time time = taxiLeg.f42098c;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = taxiLeg.f42099d;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = taxiLeg.f42100e;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = taxiLeg.f42101f;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = taxiLeg.f42102g;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51967q(taxiLeg.f42103h, TaxiPrice.f23226g);
            qVar.mo51939l(taxiLeg.f42104i);
            qVar.mo51939l(taxiLeg.f42097b.f15142b);
            Map<String, String> map = taxiLeg.f42105j;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, iVar, iVar);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.TaxiLeg$c */
    public class C16153c extends C19620t<TaxiLeg> {
        public C16153c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            Map map;
            Time.C7914c cVar = Time.f23900p;
            pVar.getClass();
            Time time = (Time) cVar.read(pVar);
            Time time2 = (Time) cVar.read(pVar);
            LocationDescriptor.C7795c cVar2 = LocationDescriptor.f23646m;
            LocationDescriptor locationDescriptor = (LocationDescriptor) cVar2.read(pVar);
            LocationDescriptor locationDescriptor2 = (LocationDescriptor) cVar2.read(pVar);
            Polyline polyline = (Polyline) Polylon.f40988k.read(pVar);
            TaxiPrice taxiPrice = (TaxiPrice) pVar.mo51962q(TaxiPrice.f23227h);
            int l = pVar.mo51924l();
            if (i >= 1) {
                serverId = new ServerId(pVar.mo51924l());
            } else {
                serverId = new ServerId(-1);
            }
            if (i >= 2) {
                C19589j.C19598i iVar = C19589j.f49779k;
                map = pVar.mo51961o(iVar, iVar, new C6302b());
            } else {
                map = null;
            }
            return new TaxiLeg(serverId, time, time2, locationDescriptor, locationDescriptor2, polyline, taxiPrice, l, map);
        }
    }

    public TaxiLeg(ServerId serverId, Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, TaxiPrice taxiPrice, int i, Map<String, String> map) {
        C21100e.m49373x(serverId, "providerId");
        this.f42097b = serverId;
        C21100e.m49373x(time, "startTime");
        this.f42098c = time;
        C21100e.m49373x(time2, "endTime");
        this.f42099d = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f42100e = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f42101f = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f42102g = polyline;
        this.f42103h = taxiPrice;
        this.f42104i = i;
        this.f42105j = map;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42099d;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f42100e;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f42101f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TaxiLeg)) {
            return false;
        }
        TaxiLeg taxiLeg = (TaxiLeg) obj;
        if (!this.f42097b.equals(taxiLeg.f42097b) || !this.f42098c.equals(taxiLeg.f42098c) || !this.f42099d.equals(taxiLeg.f42099d) || !this.f42100e.equals(taxiLeg.f42100e) || !this.f42101f.equals(taxiLeg.f42101f)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 5;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f42097b.f15142b, this.f42098c.hashCode(), this.f42099d.hashCode(), this.f42100e.hashCode(), this.f42101f.hashCode());
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39911c(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42098c;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42102g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42095k);
    }
}
