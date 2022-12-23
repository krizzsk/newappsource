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

public class DocklessBicycleLeg implements Leg {
    public static final Parcelable.Creator<DocklessBicycleLeg> CREATOR = new C16124a();

    /* renamed from: k */
    public static final C16125b f41994k = new C16125b();

    /* renamed from: l */
    public static final C16126c f41995l = new C16126c(DocklessBicycleLeg.class);

    /* renamed from: b */
    public final Time f41996b;

    /* renamed from: c */
    public final Time f41997c;

    /* renamed from: d */
    public final LocationDescriptor f41998d;

    /* renamed from: e */
    public final LocationDescriptor f41999e;

    /* renamed from: f */
    public final Polyline f42000f;

    /* renamed from: g */
    public final List<TurnInstruction> f42001g;

    /* renamed from: h */
    public final DocklessBicycleLegInfo f42002h;

    /* renamed from: i */
    public final AppDeepLink f42003i;

    /* renamed from: j */
    public final MicroMobilityIntegrationItem f42004j;

    public static class DocklessBicycleLegInfo implements Parcelable {
        public static final Parcelable.Creator<DocklessBicycleLegInfo> CREATOR = new C16122a();

        /* renamed from: l */
        public static final C16123b f42005l = new C16123b(DocklessBicycleLegInfo.class);

        /* renamed from: b */
        public final String f42006b;

        /* renamed from: c */
        public final String f42007c;

        /* renamed from: d */
        public final String f42008d;

        /* renamed from: e */
        public final Image f42009e;

        /* renamed from: f */
        public final Image f42010f;

        /* renamed from: g */
        public final Image f42011g;

        /* renamed from: h */
        public final boolean f42012h;

        /* renamed from: i */
        public final int f42013i;

        /* renamed from: j */
        public final int f42014j;

        /* renamed from: k */
        public final String f42015k;

        /* renamed from: com.moovit.itinerary.model.leg.DocklessBicycleLeg$DocklessBicycleLegInfo$a */
        public class C16122a implements Parcelable.Creator<DocklessBicycleLegInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (DocklessBicycleLegInfo) C19612n.m46981v(parcel, DocklessBicycleLegInfo.f42005l);
            }

            public final Object[] newArray(int i) {
                return new DocklessBicycleLegInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.DocklessBicycleLeg$DocklessBicycleLegInfo$b */
        public class C16123b extends C19619s<DocklessBicycleLegInfo> {
            public C16123b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new DocklessBicycleLegInfo(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                DocklessBicycleLegInfo docklessBicycleLegInfo = (DocklessBicycleLegInfo) obj;
                qVar.mo51954p(docklessBicycleLegInfo.f42006b);
                qVar.mo51954p(docklessBicycleLegInfo.f42007c);
                qVar.mo51954p(docklessBicycleLegInfo.f42008d);
                C16019d.m40803a().f41718d.write(docklessBicycleLegInfo.f42009e, qVar);
                C16019d.m40803a().f41718d.write(docklessBicycleLegInfo.f42010f, qVar);
                C16019d.m40803a().f41718d.write(docklessBicycleLegInfo.f42011g, qVar);
                qVar.mo51934b(docklessBicycleLegInfo.f42012h);
                qVar.mo51939l(docklessBicycleLegInfo.f42013i);
                qVar.mo51939l(docklessBicycleLegInfo.f42014j);
                qVar.mo51955t(docklessBicycleLegInfo.f42015k);
            }
        }

        public DocklessBicycleLegInfo(String str, String str2, String str3, Image image, Image image2, Image image3, boolean z, int i, int i2, String str4) {
            C21100e.m49373x(str, "id");
            this.f42006b = str;
            C21100e.m49373x(str2, "operatorName");
            this.f42007c = str2;
            C21100e.m49373x(str3, "name");
            this.f42008d = str3;
            C21100e.m49373x(image, "smallIcon");
            this.f42009e = image;
            C21100e.m49373x(image2, "largeIcon");
            this.f42010f = image2;
            C21100e.m49373x(image3, "mapIcon");
            this.f42011g = image3;
            this.f42012h = z;
            this.f42013i = i;
            this.f42014j = i2;
            this.f42015k = str4;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DocklessBicycleLegInfo)) {
                return false;
            }
            return this.f42006b.equals(((DocklessBicycleLegInfo) obj).f42006b);
        }

        public final int hashCode() {
            return this.f42006b.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f42005l);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessBicycleLeg$a */
    public class C16124a implements Parcelable.Creator<DocklessBicycleLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessBicycleLeg) C19612n.m46981v(parcel, DocklessBicycleLeg.f41995l);
        }

        public final Object[] newArray(int i) {
            return new DocklessBicycleLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessBicycleLeg$b */
    public class C16125b extends C19621u<DocklessBicycleLeg> {
        public C16125b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            DocklessBicycleLeg docklessBicycleLeg = (DocklessBicycleLeg) obj;
            Time time = docklessBicycleLeg.f41996b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = docklessBicycleLeg.f41997c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            LocationDescriptor locationDescriptor = docklessBicycleLeg.f41998d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = docklessBicycleLeg.f41999e;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            Polyline polyline = docklessBicycleLeg.f42000f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51965h(docklessBicycleLeg.f42001g, TurnInstruction.f41934c);
            DocklessBicycleLegInfo docklessBicycleLegInfo = docklessBicycleLeg.f42002h;
            DocklessBicycleLegInfo.C16123b bVar3 = DocklessBicycleLegInfo.f42005l;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(docklessBicycleLegInfo, qVar);
            qVar.mo51967q(docklessBicycleLeg.f42003i, AppDeepLink.f40996d);
            qVar.mo51967q(docklessBicycleLeg.f42004j, MicroMobilityIntegrationItem.f14811f);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.DocklessBicycleLeg$c */
    public class C16126c extends C19620t<DocklessBicycleLeg> {
        public C16126c(Class cls) {
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
            DocklessBicycleLegInfo docklessBicycleLegInfo = (DocklessBicycleLegInfo) DocklessBicycleLegInfo.f42005l.read(pVar);
            AppDeepLink appDeepLink = (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d);
            if (i >= 1) {
                microMobilityIntegrationItem = (MicroMobilityIntegrationItem) pVar.mo51962q(MicroMobilityIntegrationItem.f14811f);
            } else {
                microMobilityIntegrationItem = null;
            }
            return new DocklessBicycleLeg(time, time2, locationDescriptor, locationDescriptor2, polyline, g, docklessBicycleLegInfo, appDeepLink, microMobilityIntegrationItem);
        }
    }

    public DocklessBicycleLeg(Time time, Time time2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Polyline polyline, List<TurnInstruction> list, DocklessBicycleLegInfo docklessBicycleLegInfo, AppDeepLink appDeepLink, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49373x(time, "startTime");
        this.f41996b = time;
        C21100e.m49373x(time2, "endTime");
        this.f41997c = time2;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f41998d = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f41999e = locationDescriptor2;
        C21100e.m49373x(polyline, "shape");
        this.f42000f = polyline;
        C21100e.m49373x(list, "instructions");
        this.f42001g = list;
        C21100e.m49373x(docklessBicycleLegInfo, "info");
        this.f42002h = docklessBicycleLegInfo;
        this.f42003i = appDeepLink;
        this.f42004j = microMobilityIntegrationItem;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f41997c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f41998d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f41999e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DocklessBicycleLeg)) {
            return false;
        }
        DocklessBicycleLeg docklessBicycleLeg = (DocklessBicycleLeg) obj;
        if (!this.f41996b.equals(docklessBicycleLeg.f41996b) || !this.f41997c.equals(docklessBicycleLeg.f41997c) || !this.f41998d.equals(docklessBicycleLeg.f41998d) || !this.f41999e.equals(docklessBicycleLeg.f41999e) || !this.f42001g.equals(docklessBicycleLeg.f42001g) || !this.f42002h.equals(docklessBicycleLeg.f42002h) || !C20975x0.m49118e(this.f42003i, docklessBicycleLeg.f42003i) || !C20975x0.m49118e(this.f42004j, docklessBicycleLeg.f42004j)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 17;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41996b), C17884p.m44335F(this.f41997c), C17884p.m44335F(this.f41998d), C17884p.m44335F(this.f41999e), C17884p.m44335F(this.f42001g), C17884p.m44335F(this.f42002h), C17884p.m44335F(this.f42003i), C17884p.m44335F(this.f42004j));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39919k(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f41996b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42000f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41994k);
    }
}
