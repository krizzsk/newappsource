package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.carpool.CarpoolCar;
import com.moovit.carpool.CarpoolCompany;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.Time;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19746x;
import p977zz.C20975x0;

public class CarpoolLeg implements Leg {
    public static final Parcelable.Creator<CarpoolLeg> CREATOR = new C16119a();

    /* renamed from: t */
    public static final C16120b f41964t = new C16120b();

    /* renamed from: u */
    public static final C16121c f41965u = new C16121c(CarpoolLeg.class);

    /* renamed from: b */
    public final Time f41966b;

    /* renamed from: c */
    public final Time f41967c;

    /* renamed from: d */
    public final boolean f41968d;

    /* renamed from: e */
    public final LocationDescriptor f41969e;

    /* renamed from: f */
    public final LocationDescriptor f41970f;

    /* renamed from: g */
    public final CarpoolProvider f41971g;

    /* renamed from: h */
    public final CarpoolType f41972h;

    /* renamed from: i */
    public final Image f41973i;

    /* renamed from: j */
    public final CurrencyAmount f41974j;

    /* renamed from: k */
    public final CurrencyAmount f41975k;

    /* renamed from: l */
    public final CarpoolDriverInfo f41976l;

    /* renamed from: m */
    public final List<CarpoolAttribute> f41977m;

    /* renamed from: n */
    public final AppDeepLink f41978n;

    /* renamed from: o */
    public final AppDeepLink f41979o;

    /* renamed from: p */
    public final CarpoolRide f41980p;

    /* renamed from: q */
    public final PassengerRideStops f41981q;

    /* renamed from: r */
    public final CarpoolLegDetourInfo f41982r;

    /* renamed from: s */
    public Polyline f41983s;

    public enum CarpoolAttribute implements Parcelable {
        INSTANT_BOOKING(C19746x.carpool_instantly_bookable, C19735m.colorInfo, C19739q.ic_lightning_16_info);
        
        public static final C19577c<CarpoolAttribute> CODER = null;
        public static final Parcelable.Creator<CarpoolAttribute> CREATOR = null;
        public final int colorAttrId;
        public final int iconResId;
        public final int textResId;

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolAttribute$a */
        public class C16112a implements Parcelable.Creator<CarpoolAttribute> {
            public final Object createFromParcel(Parcel parcel) {
                return (CarpoolAttribute) C19612n.m46981v(parcel, CarpoolAttribute.CODER);
            }

            public final Object[] newArray(int i) {
                return new CarpoolAttribute[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            CarpoolAttribute carpoolAttribute;
            CREATOR = new C16112a();
            CODER = new C19577c<>(CarpoolAttribute.class, carpoolAttribute);
        }

        private CarpoolAttribute(int i, int i2, int i3) {
            this.textResId = i;
            this.colorAttrId = i2;
            this.iconResId = i3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public static class CarpoolDriverInfo implements Parcelable {
        public static final Parcelable.Creator<CarpoolDriverInfo> CREATOR = new C16113a();

        /* renamed from: h */
        public static final C16114b f41984h = new C16114b(CarpoolDriverInfo.class);

        /* renamed from: b */
        public final String f41985b;

        /* renamed from: c */
        public final Image f41986c;

        /* renamed from: d */
        public final float f41987d;

        /* renamed from: e */
        public final int f41988e;

        /* renamed from: f */
        public final CarpoolCar f41989f;

        /* renamed from: g */
        public final CarpoolCompany f41990g;

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo$a */
        public class C16113a implements Parcelable.Creator<CarpoolDriverInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (CarpoolDriverInfo) C19612n.m46981v(parcel, CarpoolDriverInfo.f41984h);
            }

            public final Object[] newArray(int i) {
                return new CarpoolDriverInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo$b */
        public class C16114b extends C19619s<CarpoolDriverInfo> {
            public C16114b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new CarpoolDriverInfo(pVar.mo51948t(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51923j(), pVar.mo51924l(), (CarpoolCar) pVar.mo51962q(CarpoolCar.f40863e), (CarpoolCompany) pVar.mo51962q(CarpoolCompany.f40867d));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                CarpoolDriverInfo carpoolDriverInfo = (CarpoolDriverInfo) obj;
                qVar.mo51955t(carpoolDriverInfo.f41985b);
                qVar.mo51967q(carpoolDriverInfo.f41986c, C16019d.m40803a().f41718d);
                qVar.mo51938j(carpoolDriverInfo.f41987d);
                qVar.mo51939l(carpoolDriverInfo.f41988e);
                qVar.mo51967q(carpoolDriverInfo.f41989f, CarpoolCar.f40863e);
                qVar.mo51967q(carpoolDriverInfo.f41990g, CarpoolCompany.f40867d);
            }
        }

        public CarpoolDriverInfo(String str, Image image, float f, int i, CarpoolCar carpoolCar, CarpoolCompany carpoolCompany) {
            this.f41985b = str;
            this.f41986c = image;
            this.f41987d = f;
            this.f41988e = i;
            this.f41989f = carpoolCar;
            this.f41990g = carpoolCompany;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CarpoolDriverInfo)) {
                return false;
            }
            CarpoolDriverInfo carpoolDriverInfo = (CarpoolDriverInfo) obj;
            if (this.f41987d != carpoolDriverInfo.f41987d || this.f41988e != carpoolDriverInfo.f41988e || !C20975x0.m49118e(this.f41985b, carpoolDriverInfo.f41985b) || !C20975x0.m49118e(this.f41986c, carpoolDriverInfo.f41986c) || !C20975x0.m49118e(this.f41989f, carpoolDriverInfo.f41989f) || !C20975x0.m49118e(this.f41990g, carpoolDriverInfo.f41990g)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(Float.floatToIntBits(this.f41987d), this.f41988e, C17884p.m44335F(this.f41985b), C17884p.m44335F(this.f41986c), C17884p.m44335F(this.f41989f), C17884p.m44335F(this.f41990g));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f41984h);
        }
    }

    public static class CarpoolLegDetourInfo implements Parcelable {
        public static final Parcelable.Creator<CarpoolLegDetourInfo> CREATOR = new C16115a();

        /* renamed from: d */
        public static C16116b f41991d = new C16116b(CarpoolLegDetourInfo.class);

        /* renamed from: b */
        public final CurrencyAmount f41992b;

        /* renamed from: c */
        public final CurrencyAmount f41993c;

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolLegDetourInfo$a */
        public class C16115a implements Parcelable.Creator<CarpoolLegDetourInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (CarpoolLegDetourInfo) C19612n.m46981v(parcel, CarpoolLegDetourInfo.f41991d);
            }

            public final Object[] newArray(int i) {
                return new CarpoolLegDetourInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolLegDetourInfo$b */
        public class C16116b extends C19619s<CarpoolLegDetourInfo> {
            public C16116b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
                pVar.getClass();
                return new CarpoolLegDetourInfo((CurrencyAmount) bVar.read(pVar), (CurrencyAmount) bVar.read(pVar));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                CarpoolLegDetourInfo carpoolLegDetourInfo = (CarpoolLegDetourInfo) obj;
                CurrencyAmount currencyAmount = carpoolLegDetourInfo.f41992b;
                CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
                qVar.getClass();
                qVar.mo51939l(bVar.f49802v);
                bVar.mo179c(currencyAmount, qVar);
                CurrencyAmount currencyAmount2 = carpoolLegDetourInfo.f41993c;
                qVar.mo51939l(bVar.f49802v);
                bVar.mo179c(currencyAmount2, qVar);
            }
        }

        public CarpoolLegDetourInfo(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
            C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
            this.f41992b = currencyAmount;
            C21100e.m49373x(currencyAmount2, "actualPrice");
            this.f41993c = currencyAmount2;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CarpoolLegDetourInfo)) {
                return false;
            }
            CarpoolLegDetourInfo carpoolLegDetourInfo = (CarpoolLegDetourInfo) obj;
            if (!this.f41992b.equals(carpoolLegDetourInfo.f41992b) || !this.f41993c.equals(carpoolLegDetourInfo.f41993c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(this.f41992b.hashCode(), this.f41993c.hashCode());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f41991d);
        }
    }

    public enum CarpoolProvider implements Parcelable {
        MOOVIT,
        WAZE,
        KLAXIT,
        KAROS,
        BLABLALINES,
        BLABLA;
        
        public static final C19577c<CarpoolProvider> CODER = null;
        public static final Parcelable.Creator<CarpoolProvider> CREATOR = null;

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider$a */
        public class C16117a implements Parcelable.Creator<CarpoolProvider> {
            public final Object createFromParcel(Parcel parcel) {
                return (CarpoolProvider) C19612n.m46981v(parcel, CarpoolProvider.CODER);
            }

            public final Object[] newArray(int i) {
                return new CarpoolProvider[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            CarpoolProvider carpoolProvider;
            CarpoolProvider carpoolProvider2;
            CarpoolProvider carpoolProvider3;
            CarpoolProvider carpoolProvider4;
            CarpoolProvider carpoolProvider5;
            CarpoolProvider carpoolProvider6;
            CREATOR = new C16117a();
            CODER = new C19577c<>(CarpoolProvider.class, carpoolProvider, carpoolProvider2, carpoolProvider3, carpoolProvider4, carpoolProvider5, carpoolProvider6);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public enum CarpoolType implements Parcelable {
        ANONYMOUS,
        SINGLE_DRIVER,
        NEARBY_DRIVERS;
        
        public static final C19577c<CarpoolType> CODER = null;
        public static final Parcelable.Creator<CarpoolType> CREATOR = null;

        /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType$a */
        public class C16118a implements Parcelable.Creator<CarpoolType> {
            public final Object createFromParcel(Parcel parcel) {
                return (CarpoolType) C19612n.m46981v(parcel, CarpoolType.CODER);
            }

            public final Object[] newArray(int i) {
                return new CarpoolType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            CarpoolType carpoolType;
            CarpoolType carpoolType2;
            CarpoolType carpoolType3;
            CREATOR = new C16118a();
            CODER = new C19577c<>(CarpoolType.class, carpoolType, carpoolType2, carpoolType3);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$a */
    public class C16119a implements Parcelable.Creator<CarpoolLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolLeg) C19612n.m46981v(parcel, CarpoolLeg.f41965u);
        }

        public final Object[] newArray(int i) {
            return new CarpoolLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$b */
    public class C16120b extends C19621u<CarpoolLeg> {
        public C16120b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarpoolLeg carpoolLeg = (CarpoolLeg) obj;
            Time time = carpoolLeg.f41966b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = carpoolLeg.f41967c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            qVar.mo51934b(carpoolLeg.f41968d);
            LocationDescriptor locationDescriptor = carpoolLeg.f41969e;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = carpoolLeg.f41970f;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor2, qVar);
            CarpoolProvider.CODER.write(carpoolLeg.f41971g, qVar);
            CarpoolType.CODER.write(carpoolLeg.f41972h, qVar);
            C16019d.m40803a().f41718d.write(carpoolLeg.f41973i, qVar);
            CurrencyAmount currencyAmount = carpoolLeg.f41974j;
            CurrencyAmount.C7881b bVar3 = CurrencyAmount.f23843f;
            qVar.mo51967q(currencyAmount, bVar3);
            qVar.mo51967q(carpoolLeg.f41975k, bVar3);
            CarpoolDriverInfo carpoolDriverInfo = carpoolLeg.f41976l;
            CarpoolDriverInfo.C16114b bVar4 = CarpoolDriverInfo.f41984h;
            qVar.mo51939l(bVar4.f49802v);
            bVar4.mo179c(carpoolDriverInfo, qVar);
            qVar.mo51964g(carpoolLeg.f41977m, CarpoolAttribute.CODER);
            AppDeepLink appDeepLink = carpoolLeg.f41978n;
            AppDeepLink.C15755b bVar5 = AppDeepLink.f40996d;
            qVar.mo51967q(appDeepLink, bVar5);
            qVar.mo51967q(carpoolLeg.f41979o, bVar5);
            qVar.mo51967q(carpoolLeg.f41980p, CarpoolRide.f40909k);
            qVar.mo51967q(carpoolLeg.f41981q, PassengerRideStops.f40950f);
            qVar.mo51967q(carpoolLeg.f41982r, CarpoolLegDetourInfo.f41991d);
            qVar.mo51967q(carpoolLeg.f41983s, Polylon.f40987j);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.CarpoolLeg$c */
    public class C16121c extends C19620t<CarpoolLeg> {
        public C16121c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            Time.C7914c cVar = Time.f23900p;
            pVar.getClass();
            boolean b = pVar.mo51919b();
            LocationDescriptor.C7795c cVar2 = LocationDescriptor.f23646m;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            ArrayList<CarpoolAttribute> f = pVar2.mo51958f(CarpoolAttribute.CODER);
            AppDeepLink.C15755b bVar2 = AppDeepLink.f40996d;
            return new CarpoolLeg((Time) cVar.read(pVar2), (Time) cVar.read(pVar2), b, (LocationDescriptor) cVar2.read(pVar2), (LocationDescriptor) cVar2.read(pVar2), (CarpoolProvider) C13555b.m33968g(CarpoolProvider.CODER, pVar2), (CarpoolType) C13555b.m33968g(CarpoolType.CODER, pVar2), (Image) C16019d.m40803a().f41718d.read(pVar2), (CurrencyAmount) pVar2.mo51962q(bVar), (CurrencyAmount) pVar2.mo51962q(bVar), (CarpoolDriverInfo) CarpoolDriverInfo.f41984h.read(pVar2), f, (AppDeepLink) pVar2.mo51962q(bVar2), (AppDeepLink) pVar2.mo51962q(bVar2), (CarpoolRide) pVar2.mo51962q(CarpoolRide.f40909k), (PassengerRideStops) pVar2.mo51962q(PassengerRideStops.f40950f), (CarpoolLegDetourInfo) pVar2.mo51962q(CarpoolLegDetourInfo.f41991d), (Polyline) pVar2.mo51962q(Polylon.f40988k));
        }
    }

    public CarpoolLeg(Time time, Time time2, boolean z, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, CarpoolProvider carpoolProvider, CarpoolType carpoolType, Image image, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, CarpoolDriverInfo carpoolDriverInfo, List<CarpoolAttribute> list, AppDeepLink appDeepLink, AppDeepLink appDeepLink2, CarpoolRide carpoolRide, PassengerRideStops passengerRideStops, CarpoolLegDetourInfo carpoolLegDetourInfo, Polyline polyline) {
        CarpoolProvider carpoolProvider2 = carpoolProvider;
        CarpoolType carpoolType2 = carpoolType;
        Image image2 = image;
        CarpoolDriverInfo carpoolDriverInfo2 = carpoolDriverInfo;
        C21100e.m49373x(time, "startTime");
        this.f41966b = time;
        C21100e.m49373x(time2, "endTime");
        this.f41967c = time2;
        this.f41968d = z;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f41969e = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f41970f = locationDescriptor2;
        C21100e.m49373x(carpoolProvider2, " provider");
        this.f41971g = carpoolProvider2;
        C21100e.m49373x(carpoolType2, "carpoolType");
        this.f41972h = carpoolType2;
        C21100e.m49373x(image2, "image");
        this.f41973i = image2;
        this.f41974j = currencyAmount;
        this.f41975k = currencyAmount2;
        C21100e.m49373x(carpoolDriverInfo2, "driverInfo");
        this.f41976l = carpoolDriverInfo2;
        this.f41977m = list;
        this.f41978n = appDeepLink;
        this.f41979o = appDeepLink2;
        this.f41980p = carpoolRide;
        this.f41981q = passengerRideStops;
        this.f41982r = carpoolLegDetourInfo;
        this.f41983s = polyline;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f41967c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return this.f41969e;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return this.f41970f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarpoolLeg)) {
            return false;
        }
        CarpoolLeg carpoolLeg = (CarpoolLeg) obj;
        if (!this.f41966b.equals(carpoolLeg.f41966b) || !this.f41967c.equals(carpoolLeg.f41967c) || this.f41968d != carpoolLeg.f41968d || !C20975x0.m49118e(this.f41969e.mo24310d(), carpoolLeg.f41969e.mo24310d()) || !C20975x0.m49118e(this.f41970f.mo24310d(), carpoolLeg.f41970f.mo24310d()) || !this.f41971g.equals(carpoolLeg.f41971g) || !this.f41972h.equals(carpoolLeg.f41972h) || !C20975x0.m49118e(this.f41974j, carpoolLeg.f41974j) || !C20975x0.m49118e(this.f41975k, carpoolLeg.f41975k) || !C20975x0.m49118e(this.f41980p, carpoolLeg.f41980p)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 7;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41966b), C17884p.m44335F(this.f41967c), this.f41968d, C17884p.m44335F(this.f41969e.mo24310d()), C17884p.m44335F(this.f41970f.mo24310d()), C17884p.m44335F(this.f41971g), C17884p.m44335F(this.f41972h), C17884p.m44335F(this.f41974j), C17884p.m44335F(this.f41975k), C17884p.m44335F(this.f41980p));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39916h(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f41966b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        Polyline polyline = this.f41983s;
        if (polyline != null) {
            return polyline;
        }
        return Polylon.m40193b(this.f41969e.mo24310d(), this.f41970f.mo24310d());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41964t);
    }
}
