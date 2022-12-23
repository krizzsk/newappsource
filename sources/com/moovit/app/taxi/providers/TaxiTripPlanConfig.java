package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiButtonSpec;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiTripPlanConfig implements Parcelable {
    public static final Parcelable.Creator<TaxiTripPlanConfig> CREATOR = new C15443a();

    /* renamed from: h */
    public static final C15444b f39987h = new C15444b(TaxiTripPlanConfig.class);

    /* renamed from: b */
    public final String f39988b;

    /* renamed from: c */
    public final String f39989c;

    /* renamed from: d */
    public final String f39990d;

    /* renamed from: e */
    public final Image f39991e;

    /* renamed from: f */
    public final TaxiButtonSpec f39992f;

    /* renamed from: g */
    public final Image f39993g;

    /* renamed from: com.moovit.app.taxi.providers.TaxiTripPlanConfig$a */
    public class C15443a implements Parcelable.Creator<TaxiTripPlanConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiTripPlanConfig) C19612n.m46981v(parcel, TaxiTripPlanConfig.f39987h);
        }

        public final Object[] newArray(int i) {
            return new TaxiTripPlanConfig[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiTripPlanConfig$b */
    public class C15444b extends C19619s<TaxiTripPlanConfig> {
        public C15444b(Class cls) {
            super(3, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 3;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            int i2 = i;
            if (i2 == 3) {
                return new TaxiTripPlanConfig(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), (TaxiButtonSpec) TaxiButtonSpec.f39927e.read(pVar2), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d));
            }
            if (i2 == 2) {
                return new TaxiTripPlanConfig(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), (TaxiButtonSpec) TaxiButtonSpec.f39927e.read(pVar2), (Image) null);
            }
            if (i2 == 1) {
                return new TaxiTripPlanConfig(pVar.mo51947p(), pVar.mo51947p(), (String) null, (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), (TaxiButtonSpec) TaxiButtonSpec.f39927e.read(pVar2), (Image) null);
            }
            return new TaxiTripPlanConfig(pVar.mo51947p(), pVar.mo51947p(), (String) null, (Image) null, (TaxiButtonSpec) TaxiButtonSpec.f39927e.read(pVar2), (Image) null);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiTripPlanConfig taxiTripPlanConfig = (TaxiTripPlanConfig) obj;
            qVar.mo51954p(taxiTripPlanConfig.f39988b);
            qVar.mo51954p(taxiTripPlanConfig.f39989c);
            qVar.mo51955t(taxiTripPlanConfig.f39990d);
            qVar.mo51967q(taxiTripPlanConfig.f39991e, C16019d.m40803a().f41718d);
            TaxiButtonSpec taxiButtonSpec = taxiTripPlanConfig.f39992f;
            TaxiButtonSpec.C15420b bVar = TaxiButtonSpec.f39927e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(taxiButtonSpec, qVar);
            qVar.mo51967q(taxiTripPlanConfig.f39993g, C16019d.m40803a().f41718d);
        }
    }

    public TaxiTripPlanConfig(String str, String str2, String str3, Image image, TaxiButtonSpec taxiButtonSpec, Image image2) {
        C21100e.m49373x(str, "label");
        this.f39988b = str;
        C21100e.m49373x(str2, "pickupTimeFormat");
        this.f39989c = str2;
        this.f39990d = str3;
        this.f39991e = image;
        C21100e.m49373x(taxiButtonSpec, "buttonSpec");
        this.f39992f = taxiButtonSpec;
        this.f39993g = image2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiTripPlanConfig{label='");
        C25541a.m63890u(k, this.f39988b, '\'', ", imminentPickupTimeFormat='");
        C25541a.m63890u(k, this.f39989c, '\'', ", futurePickupTimeFormat='");
        C25541a.m63890u(k, this.f39990d, '\'', ", backdropImage=");
        k.append(this.f39991e);
        k.append(", buttonSpec=");
        k.append(this.f39992f);
        k.append(", mapMarkerImage=");
        k.append(this.f39993g);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39987h);
    }
}
