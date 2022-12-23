package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class CarLeg implements Leg {
    public static final Parcelable.Creator<CarLeg> CREATOR = new C16109a();

    /* renamed from: h */
    public static final C16110b f41956h = new C16110b();

    /* renamed from: i */
    public static final C16111c f41957i = new C16111c(CarLeg.class);

    /* renamed from: b */
    public final Time f41958b;

    /* renamed from: c */
    public final Time f41959c;

    /* renamed from: d */
    public final LocationDescriptor f41960d;

    /* renamed from: e */
    public final LocationDescriptor f41961e;

    /* renamed from: f */
    public final Polyline f41962f;

    /* renamed from: g */
    public final MicroMobilityIntegrationItem f41963g;

    /* renamed from: com.moovit.itinerary.model.leg.CarLeg$a */
    public class C16109a implements Parcelable.Creator<CarLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarLeg) C19612n.m46981v(parcel, CarLeg.f41957i);
        }

        public final Object[] newArray(int i) {
            return new CarLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.CarLeg$b */
    public class C16110b extends C19621u<CarLeg> {
        public C16110b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarLeg carLeg = (CarLeg) obj;
            Time time = carLeg.f41958b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = carLeg.f41959c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = carLeg.f41960d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = carLeg.f41961e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = carLeg.f41962f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51967q(carLeg.f41963g, MicroMobilityIntegrationItem.f14811f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.CarLeg$c */
    public class C16111c extends C19620t<CarLeg> {
        public C16111c(Class cls) {
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
            LocationDescriptor.C7795c cVar2 = LocationDescriptor.f23646m;
            LocationDescriptor locationDescriptor = (LocationDescriptor) cVar2.read(pVar);
            LocationDescriptor locationDescriptor2 = (LocationDescriptor) cVar2.read(pVar);
            Polyline polyline = (Polyline) Polylon.f40988k.read(pVar);
            if (i >= 1) {
                microMobilityIntegrationItem = (MicroMobilityIntegrationItem) pVar.mo51962q(MicroMobilityIntegrationItem.f14811f);
            } else {
                microMobilityIntegrationItem = null;
            }
            return new CarLeg(time, time2, locationDescriptor, locationDescriptor2, polyline, microMobilityIntegrationItem);
        }
    }

    public CarLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49373x(time, "startTime");
        this.f41958b = time;
        C21100e.m49373x(time2, "endTime");
        this.f41959c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f41960d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f41961e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f41962f = polyline;
        this.f41963g = microMobilityIntegrationItem;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f41959c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f41960d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f41961e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarLeg)) {
            return false;
        }
        CarLeg carLeg = (CarLeg) obj;
        if (!this.f41958b.equals(carLeg.f41958b) || !this.f41959c.equals(carLeg.f41959c) || !this.f41960d.equals(carLeg.f41960d) || !this.f41961e.equals(carLeg.f41961e) || !C20975x0.m49118e(this.f41963g, carLeg.f41963g)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 18;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f41958b.hashCode(), this.f41959c.hashCode(), this.f41960d.hashCode(), this.f41961e.hashCode(), C17884p.m44335F(this.f41963g));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39909a(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f41958b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f41962f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41956h);
    }
}
