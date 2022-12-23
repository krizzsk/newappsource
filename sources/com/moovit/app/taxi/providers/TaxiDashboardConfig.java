package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiButtonSpec;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiDashboardConfig implements Parcelable {
    public static final Parcelable.Creator<TaxiDashboardConfig> CREATOR = new C15421a();

    /* renamed from: h */
    public static final C15422b f39931h = new C15422b(TaxiDashboardConfig.class);

    /* renamed from: b */
    public final String f39932b;

    /* renamed from: c */
    public final String f39933c;

    /* renamed from: d */
    public final String f39934d;

    /* renamed from: e */
    public final TaxiVisibility f39935e;

    /* renamed from: f */
    public final TaxiButtonSpec f39936f;

    /* renamed from: g */
    public final String f39937g;

    /* renamed from: com.moovit.app.taxi.providers.TaxiDashboardConfig$a */
    public class C15421a implements Parcelable.Creator<TaxiDashboardConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiDashboardConfig) C19612n.m46981v(parcel, TaxiDashboardConfig.f39931h);
        }

        public final Object[] newArray(int i) {
            return new TaxiDashboardConfig[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiDashboardConfig$b */
    public class C15422b extends C19619s<TaxiDashboardConfig> {
        public C15422b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            String str2;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            TaxiVisibility taxiVisibility = (TaxiVisibility) C13555b.m33968g(TaxiVisibility.CODER, pVar);
            TaxiButtonSpec taxiButtonSpec = (TaxiButtonSpec) TaxiButtonSpec.f39927e.read(pVar);
            if (i >= 1) {
                str = pVar.mo51947p();
            } else {
                str = "TAXI";
            }
            if (i >= 1) {
                str2 = pVar.mo51948t();
            } else {
                str2 = null;
            }
            return new TaxiDashboardConfig(str, p, p2, taxiVisibility, taxiButtonSpec, str2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiDashboardConfig taxiDashboardConfig = (TaxiDashboardConfig) obj;
            qVar.mo51954p(taxiDashboardConfig.f39933c);
            qVar.mo51954p(taxiDashboardConfig.f39934d);
            TaxiVisibility.CODER.write(taxiDashboardConfig.f39935e, qVar);
            TaxiButtonSpec taxiButtonSpec = taxiDashboardConfig.f39936f;
            TaxiButtonSpec.C15420b bVar = TaxiButtonSpec.f39927e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(taxiButtonSpec, qVar);
            qVar.mo51954p(taxiDashboardConfig.f39932b);
            qVar.mo51955t(taxiDashboardConfig.f39937g);
        }
    }

    public TaxiDashboardConfig(String str, String str2, String str3, TaxiVisibility taxiVisibility, TaxiButtonSpec taxiButtonSpec, String str4) {
        C21100e.m49373x(str, "host");
        this.f39932b = str;
        C21100e.m49373x(str2, "title");
        this.f39933c = str2;
        C21100e.m49373x(str3, "subtitle");
        this.f39934d = str3;
        C21100e.m49373x(taxiVisibility, "visibility");
        this.f39935e = taxiVisibility;
        C21100e.m49373x(taxiButtonSpec, "buttonSpec");
        this.f39936f = taxiButtonSpec;
        this.f39937g = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiDashboardConfig{host='");
        C25541a.m63890u(k, this.f39932b, '\'', ", title='");
        C25541a.m63890u(k, this.f39933c, '\'', ", subtitle='");
        C25541a.m63890u(k, this.f39934d, '\'', ", visibility=");
        k.append(this.f39935e);
        k.append(", buttonSpec=");
        k.append(this.f39936f);
        k.append(", deeplink='");
        k.append(this.f39937g);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39931h);
    }
}
