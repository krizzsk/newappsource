package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
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

public class WaitToTaxiLeg implements Leg {
    public static final Parcelable.Creator<WaitToTaxiLeg> CREATOR = new C16160a();

    /* renamed from: i */
    public static final C16161b f42120i = new C16161b();

    /* renamed from: j */
    public static final C16162c f42121j = new C16162c(WaitToTaxiLeg.class);

    /* renamed from: b */
    public final ServerId f42122b;

    /* renamed from: c */
    public final Time f42123c;

    /* renamed from: d */
    public final Time f42124d;

    /* renamed from: e */
    public final LocationDescriptor f42125e;

    /* renamed from: f */
    public final TaxiPrice f42126f;

    /* renamed from: g */
    public final int f42127g;

    /* renamed from: h */
    public final Map<String, String> f42128h;

    /* renamed from: com.moovit.itinerary.model.leg.WaitToTaxiLeg$a */
    public class C16160a implements Parcelable.Creator<WaitToTaxiLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (WaitToTaxiLeg) C19612n.m46981v(parcel, WaitToTaxiLeg.f42121j);
        }

        public final Object[] newArray(int i) {
            return new WaitToTaxiLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToTaxiLeg$b */
    public class C16161b extends C19621u<WaitToTaxiLeg> {
        public C16161b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) obj;
            Time time = waitToTaxiLeg.f42123c;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = waitToTaxiLeg.f42124d;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = waitToTaxiLeg.f42125e;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            qVar.mo51967q(waitToTaxiLeg.f42126f, TaxiPrice.f23226g);
            qVar.mo51939l(waitToTaxiLeg.f42127g);
            qVar.mo51939l(waitToTaxiLeg.f42122b.f15142b);
            Map<String, String> map = waitToTaxiLeg.f42128h;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, iVar, iVar);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToTaxiLeg$c */
    public class C16162c extends C19620t<WaitToTaxiLeg> {
        public C16162c(Class cls) {
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
            LocationDescriptor locationDescriptor = (LocationDescriptor) LocationDescriptor.f23646m.read(pVar);
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
            return new WaitToTaxiLeg(serverId, time, time2, locationDescriptor, taxiPrice, l, map);
        }
    }

    public WaitToTaxiLeg(ServerId serverId, Time time, Time time2, LocationDescriptor locationDescriptor, TaxiPrice taxiPrice, int i, Map<String, String> map) {
        C21100e.m49373x(serverId, "providerId");
        this.f42122b = serverId;
        C21100e.m49373x(time, "startTime");
        this.f42123c = time;
        C21100e.m49373x(time2, "endTime");
        this.f42124d = time2;
        C21100e.m49373x(locationDescriptor, "waitAtLocation");
        this.f42125e = locationDescriptor;
        this.f42126f = taxiPrice;
        this.f42127g = i;
        this.f42128h = map;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42124d;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f42125e;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f42125e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WaitToTaxiLeg)) {
            return false;
        }
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) obj;
        if (!this.f42122b.equals(waitToTaxiLeg.f42122b) || !this.f42123c.equals(waitToTaxiLeg.f42123c) || !this.f42124d.equals(waitToTaxiLeg.f42124d) || !this.f42125e.equals(waitToTaxiLeg.f42125e)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 6;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f42122b.f15142b, this.f42123c.hashCode(), this.f42124d.hashCode(), this.f42125e.hashCode());
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39920l(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42123c;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return Polylon.m40193b(this.f42125e.mo24310d());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42120i);
    }
}
