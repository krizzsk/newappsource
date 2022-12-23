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

public class DocklessScooterLeg implements Leg {
    public static final Parcelable.Creator<DocklessScooterLeg> CREATOR = new C16139a();

    /* renamed from: k */
    public static final C16140b f42060k = new C16140b();

    /* renamed from: l */
    public static final C16141c f42061l = new C16141c(DocklessScooterLeg.class);

    /* renamed from: b */
    public final Time f42062b;

    /* renamed from: c */
    public final Time f42063c;

    /* renamed from: d */
    public final LocationDescriptor f42064d;

    /* renamed from: e */
    public final LocationDescriptor f42065e;

    /* renamed from: f */
    public final Polyline f42066f;

    /* renamed from: g */
    public final List<TurnInstruction> f42067g;

    /* renamed from: h */
    public final DocklessScooterLegInfo f42068h;

    /* renamed from: i */
    public final AppDeepLink f42069i;

    /* renamed from: j */
    public final MicroMobilityIntegrationItem f42070j;

    public static class DocklessScooterLegInfo implements Parcelable {
        public static final Parcelable.Creator<DocklessScooterLegInfo> CREATOR = new C16137a();

        /* renamed from: l */
        public static final C16138b f42071l = new C16138b(DocklessScooterLegInfo.class);

        /* renamed from: b */
        public final String f42072b;

        /* renamed from: c */
        public final String f42073c;

        /* renamed from: d */
        public final String f42074d;

        /* renamed from: e */
        public final Image f42075e;

        /* renamed from: f */
        public final Image f42076f;

        /* renamed from: g */
        public final Image f42077g;

        /* renamed from: h */
        public final boolean f42078h;

        /* renamed from: i */
        public final int f42079i;

        /* renamed from: j */
        public final int f42080j;

        /* renamed from: k */
        public final String f42081k;

        /* renamed from: com.moovit.itinerary.model.leg.DocklessScooterLeg$DocklessScooterLegInfo$a */
        public class C16137a implements Parcelable.Creator<DocklessScooterLegInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (DocklessScooterLegInfo) C19612n.m46981v(parcel, DocklessScooterLegInfo.f42071l);
            }

            public final Object[] newArray(int i) {
                return new DocklessScooterLegInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.DocklessScooterLeg$DocklessScooterLegInfo$b */
        public class C16138b extends C19619s<DocklessScooterLegInfo> {
            public C16138b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new DocklessScooterLegInfo(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                DocklessScooterLegInfo docklessScooterLegInfo = (DocklessScooterLegInfo) obj;
                qVar.mo51954p(docklessScooterLegInfo.f42072b);
                qVar.mo51954p(docklessScooterLegInfo.f42073c);
                qVar.mo51954p(docklessScooterLegInfo.f42074d);
                C16019d.m40803a().f41718d.write(docklessScooterLegInfo.f42075e, qVar);
                C16019d.m40803a().f41718d.write(docklessScooterLegInfo.f42076f, qVar);
                C16019d.m40803a().f41718d.write(docklessScooterLegInfo.f42077g, qVar);
                qVar.mo51934b(docklessScooterLegInfo.f42078h);
                qVar.mo51939l(docklessScooterLegInfo.f42079i);
                qVar.mo51939l(docklessScooterLegInfo.f42080j);
                qVar.mo51955t(docklessScooterLegInfo.f42081k);
            }
        }

        public DocklessScooterLegInfo(String str, String str2, String str3, Image image, Image image2, Image image3, boolean z, int i, int i2, String str4) {
            C21100e.m49373x(str, "id");
            this.f42072b = str;
            C21100e.m49373x(str2, "operatorName");
            this.f42073c = str2;
            C21100e.m49373x(str3, "name");
            this.f42074d = str3;
            C21100e.m49373x(image, "smallIcon");
            this.f42075e = image;
            C21100e.m49373x(image2, "largeIcon");
            this.f42076f = image2;
            C21100e.m49373x(image3, "mapIcon");
            this.f42077g = image3;
            this.f42078h = z;
            this.f42079i = i;
            this.f42080j = i2;
            this.f42081k = str4;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DocklessScooterLegInfo)) {
                return false;
            }
            return this.f42072b.equals(((DocklessScooterLegInfo) obj).f42072b);
        }

        public final int hashCode() {
            return this.f42072b.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f42071l);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessScooterLeg$a */
    public class C16139a implements Parcelable.Creator<DocklessScooterLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessScooterLeg) C19612n.m46981v(parcel, DocklessScooterLeg.f42061l);
        }

        public final Object[] newArray(int i) {
            return new DocklessScooterLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessScooterLeg$b */
    public class C16140b extends C19621u<DocklessScooterLeg> {
        public C16140b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            DocklessScooterLeg docklessScooterLeg = (DocklessScooterLeg) obj;
            Time time = docklessScooterLeg.f42062b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = docklessScooterLeg.f42063c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = docklessScooterLeg.f42064d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = docklessScooterLeg.f42065e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = docklessScooterLeg.f42066f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(docklessScooterLeg.f42067g, TurnInstruction.f41934c);
            DocklessScooterLegInfo docklessScooterLegInfo = docklessScooterLeg.f42068h;
            DocklessScooterLegInfo.C16138b bVar3 = DocklessScooterLegInfo.f42071l;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(docklessScooterLegInfo, qVar);
            qVar.mo51967q(docklessScooterLeg.f42069i, AppDeepLink.f40996d);
            qVar.mo51967q(docklessScooterLeg.f42070j, MicroMobilityIntegrationItem.f14811f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessScooterLeg$c */
    public class C16141c extends C19620t<DocklessScooterLeg> {
        public C16141c(Class cls) {
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
            DocklessScooterLegInfo docklessScooterLegInfo = (DocklessScooterLegInfo) DocklessScooterLegInfo.f42071l.read(pVar);
            AppDeepLink appDeepLink = (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d);
            if (i >= 1) {
                microMobilityIntegrationItem = (MicroMobilityIntegrationItem) pVar.mo51962q(MicroMobilityIntegrationItem.f14811f);
            } else {
                microMobilityIntegrationItem = null;
            }
            return new DocklessScooterLeg(time, time2, locationDescriptor, locationDescriptor2, polyline, g, docklessScooterLegInfo, appDeepLink, microMobilityIntegrationItem);
        }
    }

    public DocklessScooterLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, List<TurnInstruction> list, DocklessScooterLegInfo docklessScooterLegInfo, AppDeepLink appDeepLink, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49373x(time, "startTime");
        this.f42062b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42063c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f42064d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f42065e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f42066f = polyline;
        C21100e.m49373x(list, "instructions");
        this.f42067g = list;
        C21100e.m49373x(docklessScooterLegInfo, "info");
        this.f42068h = docklessScooterLegInfo;
        this.f42069i = appDeepLink;
        this.f42070j = microMobilityIntegrationItem;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42063c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f42064d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f42065e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DocklessScooterLeg)) {
            return false;
        }
        DocklessScooterLeg docklessScooterLeg = (DocklessScooterLeg) obj;
        if (!this.f42062b.equals(docklessScooterLeg.f42062b) || !this.f42063c.equals(docklessScooterLeg.f42063c) || !this.f42064d.equals(docklessScooterLeg.f42064d) || !this.f42065e.equals(docklessScooterLeg.f42065e) || !this.f42067g.equals(docklessScooterLeg.f42067g) || !this.f42068h.equals(docklessScooterLeg.f42068h) || !C20975x0.m49118e(this.f42069i, docklessScooterLeg.f42069i) || !C20975x0.m49118e(this.f42070j, docklessScooterLeg.f42070j)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 15;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42062b), C17884p.m44335F(this.f42063c), C17884p.m44335F(this.f42064d), C17884p.m44335F(this.f42065e), C17884p.m44335F(this.f42067g), C17884p.m44335F(this.f42068h), C17884p.m44335F(this.f42069i), C17884p.m44335F(this.f42070j));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39924p(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42062b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42066f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42060k);
    }
}
