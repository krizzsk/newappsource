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

public class DocklessMopedLeg implements Leg {
    public static final Parcelable.Creator<DocklessMopedLeg> CREATOR = new C16134a();

    /* renamed from: k */
    public static final C16135b f42038k = new C16135b();

    /* renamed from: l */
    public static final C16136c f42039l = new C16136c(DocklessMopedLeg.class);

    /* renamed from: b */
    public final Time f42040b;

    /* renamed from: c */
    public final Time f42041c;

    /* renamed from: d */
    public final LocationDescriptor f42042d;

    /* renamed from: e */
    public final LocationDescriptor f42043e;

    /* renamed from: f */
    public final Polyline f42044f;

    /* renamed from: g */
    public final List<TurnInstruction> f42045g;

    /* renamed from: h */
    public final DocklessMopedLegInfo f42046h;

    /* renamed from: i */
    public final AppDeepLink f42047i;

    /* renamed from: j */
    public final MicroMobilityIntegrationItem f42048j;

    public static class DocklessMopedLegInfo implements Parcelable {
        public static final Parcelable.Creator<DocklessMopedLegInfo> CREATOR = new C16132a();

        /* renamed from: l */
        public static final C16133b f42049l = new C16133b(DocklessMopedLegInfo.class);

        /* renamed from: b */
        public final String f42050b;

        /* renamed from: c */
        public final String f42051c;

        /* renamed from: d */
        public final String f42052d;

        /* renamed from: e */
        public final Image f42053e;

        /* renamed from: f */
        public final Image f42054f;

        /* renamed from: g */
        public final Image f42055g;

        /* renamed from: h */
        public final boolean f42056h;

        /* renamed from: i */
        public final int f42057i;

        /* renamed from: j */
        public final int f42058j;

        /* renamed from: k */
        public final String f42059k;

        /* renamed from: com.moovit.itinerary.model.leg.DocklessMopedLeg$DocklessMopedLegInfo$a */
        public class C16132a implements Parcelable.Creator<DocklessMopedLegInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (DocklessMopedLegInfo) C19612n.m46981v(parcel, DocklessMopedLegInfo.f42049l);
            }

            public final Object[] newArray(int i) {
                return new DocklessMopedLegInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.DocklessMopedLeg$DocklessMopedLegInfo$b */
        public class C16133b extends C19619s<DocklessMopedLegInfo> {
            public C16133b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new DocklessMopedLegInfo(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                DocklessMopedLegInfo docklessMopedLegInfo = (DocklessMopedLegInfo) obj;
                qVar.mo51954p(docklessMopedLegInfo.f42050b);
                qVar.mo51954p(docklessMopedLegInfo.f42051c);
                qVar.mo51954p(docklessMopedLegInfo.f42052d);
                C16019d.m40803a().f41718d.write(docklessMopedLegInfo.f42053e, qVar);
                C16019d.m40803a().f41718d.write(docklessMopedLegInfo.f42054f, qVar);
                C16019d.m40803a().f41718d.write(docklessMopedLegInfo.f42055g, qVar);
                qVar.mo51934b(docklessMopedLegInfo.f42056h);
                qVar.mo51939l(docklessMopedLegInfo.f42057i);
                qVar.mo51939l(docklessMopedLegInfo.f42058j);
                qVar.mo51955t(docklessMopedLegInfo.f42059k);
            }
        }

        public DocklessMopedLegInfo(String str, String str2, String str3, Image image, Image image2, Image image3, boolean z, int i, int i2, String str4) {
            C21100e.m49373x(str, "id");
            this.f42050b = str;
            C21100e.m49373x(str2, "operatorName");
            this.f42051c = str2;
            C21100e.m49373x(str3, "name");
            this.f42052d = str3;
            C21100e.m49373x(image, "smallIcon");
            this.f42053e = image;
            C21100e.m49373x(image2, "largeIcon");
            this.f42054f = image2;
            C21100e.m49373x(image3, "mapIcon");
            this.f42055g = image3;
            this.f42056h = z;
            this.f42057i = i;
            this.f42058j = i2;
            this.f42059k = str4;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DocklessMopedLegInfo)) {
                return false;
            }
            return this.f42050b.equals(((DocklessMopedLegInfo) obj).f42050b);
        }

        public final int hashCode() {
            return this.f42050b.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f42049l);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessMopedLeg$a */
    public class C16134a implements Parcelable.Creator<DocklessMopedLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessMopedLeg) C19612n.m46981v(parcel, DocklessMopedLeg.f42039l);
        }

        public final Object[] newArray(int i) {
            return new DocklessMopedLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessMopedLeg$b */
    public class C16135b extends C19621u<DocklessMopedLeg> {
        public C16135b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            DocklessMopedLeg docklessMopedLeg = (DocklessMopedLeg) obj;
            Time time = docklessMopedLeg.f42040b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = docklessMopedLeg.f42041c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = docklessMopedLeg.f42042d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = docklessMopedLeg.f42043e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = docklessMopedLeg.f42044f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(docklessMopedLeg.f42045g, TurnInstruction.f41934c);
            DocklessMopedLegInfo docklessMopedLegInfo = docklessMopedLeg.f42046h;
            DocklessMopedLegInfo.C16133b bVar3 = DocklessMopedLegInfo.f42049l;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(docklessMopedLegInfo, qVar);
            qVar.mo51967q(docklessMopedLeg.f42047i, AppDeepLink.f40996d);
            qVar.mo51967q(docklessMopedLeg.f42048j, MicroMobilityIntegrationItem.f14811f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessMopedLeg$c */
    public class C16136c extends C19620t<DocklessMopedLeg> {
        public C16136c(Class cls) {
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
            DocklessMopedLegInfo docklessMopedLegInfo = (DocklessMopedLegInfo) DocklessMopedLegInfo.f42049l.read(pVar);
            AppDeepLink appDeepLink = (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d);
            if (i >= 1) {
                microMobilityIntegrationItem = (MicroMobilityIntegrationItem) pVar.mo51962q(MicroMobilityIntegrationItem.f14811f);
            } else {
                microMobilityIntegrationItem = null;
            }
            return new DocklessMopedLeg(time, time2, locationDescriptor, locationDescriptor2, polyline, g, docklessMopedLegInfo, appDeepLink, microMobilityIntegrationItem);
        }
    }

    public DocklessMopedLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, List<TurnInstruction> list, DocklessMopedLegInfo docklessMopedLegInfo, AppDeepLink appDeepLink, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49373x(time, "startTime");
        this.f42040b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42041c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f42042d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f42043e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f42044f = polyline;
        C21100e.m49373x(list, "instructions");
        this.f42045g = list;
        C21100e.m49373x(docklessMopedLegInfo, "info");
        this.f42046h = docklessMopedLegInfo;
        this.f42047i = appDeepLink;
        this.f42048j = microMobilityIntegrationItem;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42041c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f42042d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f42043e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DocklessMopedLeg)) {
            return false;
        }
        DocklessMopedLeg docklessMopedLeg = (DocklessMopedLeg) obj;
        if (!this.f42040b.equals(docklessMopedLeg.f42040b) || !this.f42041c.equals(docklessMopedLeg.f42041c) || !this.f42042d.equals(docklessMopedLeg.f42042d) || !this.f42043e.equals(docklessMopedLeg.f42043e) || !this.f42045g.equals(docklessMopedLeg.f42045g) || !this.f42046h.equals(docklessMopedLeg.f42046h) || !C20975x0.m49118e(this.f42047i, docklessMopedLeg.f42047i) || !C20975x0.m49118e(this.f42048j, docklessMopedLeg.f42048j)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 16;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42040b), C17884p.m44335F(this.f42041c), C17884p.m44335F(this.f42042d), C17884p.m44335F(this.f42043e), C17884p.m44335F(this.f42045g), C17884p.m44335F(this.f42046h), C17884p.m44335F(this.f42047i), C17884p.m44335F(this.f42048j));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39926r(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42040b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42044f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42038k);
    }
}
