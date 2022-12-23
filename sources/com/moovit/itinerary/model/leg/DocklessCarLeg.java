package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.TurnInstruction;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
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
import p810sz.C19619s;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class DocklessCarLeg implements Leg {
    public static final Parcelable.Creator<DocklessCarLeg> CREATOR = new C16129a();

    /* renamed from: k */
    public static final C16130b f42016k = new C16130b();

    /* renamed from: l */
    public static final C16131c f42017l = new C16131c(DocklessCarLeg.class);

    /* renamed from: b */
    public final Time f42018b;

    /* renamed from: c */
    public final Time f42019c;

    /* renamed from: d */
    public final LocationDescriptor f42020d;

    /* renamed from: e */
    public final LocationDescriptor f42021e;

    /* renamed from: f */
    public final Polyline f42022f;

    /* renamed from: g */
    public final List<TurnInstruction> f42023g;

    /* renamed from: h */
    public final DocklessCarLegInfo f42024h;

    /* renamed from: i */
    public final AppDeepLink f42025i;

    /* renamed from: j */
    public final MicroMobilityIntegrationItem f42026j;

    public static class DocklessCarLegInfo implements Parcelable {
        public static final Parcelable.Creator<DocklessCarLegInfo> CREATOR = new C16127a();

        /* renamed from: l */
        public static final C16128b f42027l = new C16128b(DocklessCarLegInfo.class);

        /* renamed from: b */
        public final String f42028b;

        /* renamed from: c */
        public final String f42029c;

        /* renamed from: d */
        public final String f42030d;

        /* renamed from: e */
        public final Image f42031e;

        /* renamed from: f */
        public final Image f42032f;

        /* renamed from: g */
        public final Image f42033g;

        /* renamed from: h */
        public final int f42034h;

        /* renamed from: i */
        public final int f42035i;

        /* renamed from: j */
        public final int f42036j;

        /* renamed from: k */
        public final String f42037k;

        /* renamed from: com.moovit.itinerary.model.leg.DocklessCarLeg$DocklessCarLegInfo$a */
        public class C16127a implements Parcelable.Creator<DocklessCarLegInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (DocklessCarLegInfo) C19612n.m46981v(parcel, DocklessCarLegInfo.f42027l);
            }

            public final Object[] newArray(int i) {
                return new DocklessCarLegInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.DocklessCarLeg$DocklessCarLegInfo$b */
        public class C16128b extends C19619s<DocklessCarLegInfo> {
            public C16128b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new DocklessCarLegInfo(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                DocklessCarLegInfo docklessCarLegInfo = (DocklessCarLegInfo) obj;
                qVar.mo51954p(docklessCarLegInfo.f42028b);
                qVar.mo51954p(docklessCarLegInfo.f42029c);
                qVar.mo51954p(docklessCarLegInfo.f42030d);
                C16019d.m40803a().f41718d.write(docklessCarLegInfo.f42031e, qVar);
                C16019d.m40803a().f41718d.write(docklessCarLegInfo.f42032f, qVar);
                C16019d.m40803a().f41718d.write(docklessCarLegInfo.f42033g, qVar);
                qVar.mo51939l(docklessCarLegInfo.f42034h);
                qVar.mo51939l(docklessCarLegInfo.f42035i);
                qVar.mo51939l(docklessCarLegInfo.f42036j);
                qVar.mo51955t(docklessCarLegInfo.f42037k);
            }
        }

        public DocklessCarLegInfo(String str, String str2, String str3, Image image, Image image2, Image image3, int i, int i2, int i3, String str4) {
            C21100e.m49373x(str, "id");
            this.f42028b = str;
            C21100e.m49373x(str2, "operatorName");
            this.f42029c = str2;
            C21100e.m49373x(str3, "name");
            this.f42030d = str3;
            C21100e.m49373x(image, "smallIcon");
            this.f42031e = image;
            C21100e.m49373x(image2, "largeIcon");
            this.f42032f = image2;
            C21100e.m49373x(image3, "mapIcon");
            this.f42033g = image3;
            this.f42034h = i;
            this.f42035i = i2;
            this.f42036j = i3;
            this.f42037k = str4;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DocklessCarLegInfo)) {
                return false;
            }
            return this.f42028b.equals(((DocklessCarLegInfo) obj).f42028b);
        }

        public final int hashCode() {
            return this.f42028b.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f42027l);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessCarLeg$a */
    public class C16129a implements Parcelable.Creator<DocklessCarLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessCarLeg) C19612n.m46981v(parcel, DocklessCarLeg.f42017l);
        }

        public final Object[] newArray(int i) {
            return new DocklessCarLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessCarLeg$b */
    public class C16130b extends C19621u<DocklessCarLeg> {
        public C16130b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            DocklessCarLeg docklessCarLeg = (DocklessCarLeg) obj;
            Time time = docklessCarLeg.f42018b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = docklessCarLeg.f42019c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = docklessCarLeg.f42020d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = docklessCarLeg.f42021e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = docklessCarLeg.f42022f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(docklessCarLeg.f42023g, TurnInstruction.f41934c);
            DocklessCarLegInfo docklessCarLegInfo = docklessCarLeg.f42024h;
            DocklessCarLegInfo.C16128b bVar3 = DocklessCarLegInfo.f42027l;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(docklessCarLegInfo, qVar);
            qVar.mo51967q(docklessCarLeg.f42025i, AppDeepLink.f40996d);
            qVar.mo51967q(docklessCarLeg.f42026j, MicroMobilityIntegrationItem.f14811f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessCarLeg$c */
    public class C16131c extends C19620t<DocklessCarLeg> {
        public C16131c(Class cls) {
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
            ArrayList g = pVar.mo51959g(TurnInstruction.f41934c);
            DocklessCarLegInfo docklessCarLegInfo = (DocklessCarLegInfo) DocklessCarLegInfo.f42027l.read(pVar);
            AppDeepLink appDeepLink = (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d);
            if (i >= 1) {
                microMobilityIntegrationItem = (MicroMobilityIntegrationItem) pVar.mo51962q(MicroMobilityIntegrationItem.f14811f);
            } else {
                microMobilityIntegrationItem = null;
            }
            return new DocklessCarLeg(time, time2, locationDescriptor, locationDescriptor2, polyline, g, docklessCarLegInfo, appDeepLink, microMobilityIntegrationItem);
        }
    }

    public DocklessCarLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, List<TurnInstruction> list, DocklessCarLegInfo docklessCarLegInfo, AppDeepLink appDeepLink, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49373x(time, "startTime");
        this.f42018b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42019c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f42020d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f42021e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f42022f = polyline;
        C21100e.m49373x(list, "instructions");
        this.f42023g = list;
        C21100e.m49373x(docklessCarLegInfo, "info");
        this.f42024h = docklessCarLegInfo;
        this.f42025i = appDeepLink;
        this.f42026j = microMobilityIntegrationItem;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42019c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f42020d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f42021e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DocklessCarLeg)) {
            return false;
        }
        DocklessCarLeg docklessCarLeg = (DocklessCarLeg) obj;
        if (!this.f42018b.equals(docklessCarLeg.f42018b) || !this.f42019c.equals(docklessCarLeg.f42019c) || !this.f42020d.equals(docklessCarLeg.f42020d) || !this.f42021e.equals(docklessCarLeg.f42021e) || !this.f42023g.equals(docklessCarLeg.f42023g) || !this.f42024h.equals(docklessCarLeg.f42024h) || !C20975x0.m49118e(this.f42025i, docklessCarLeg.f42025i) || !C20975x0.m49118e(this.f42026j, docklessCarLeg.f42026j)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 14;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42018b), C17884p.m44335F(this.f42019c), C17884p.m44335F(this.f42020d), C17884p.m44335F(this.f42021e), C17884p.m44335F(this.f42023g), C17884p.m44335F(this.f42024h), C17884p.m44335F(this.f42025i), C17884p.m44335F(this.f42026j));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39921m(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42018b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42022f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42016k);
    }
}
