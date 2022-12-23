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
import p810sz.C19617r;
import p810sz.C19619s;

public class TaxiPopupConfig implements Parcelable {
    public static final Parcelable.Creator<TaxiPopupConfig> CREATOR = new C15437a();

    /* renamed from: g */
    public static final C15438b f39960g = new C15438b(TaxiPopupConfig.class);

    /* renamed from: b */
    public final Image f39961b;

    /* renamed from: c */
    public final String f39962c;

    /* renamed from: d */
    public final String f39963d;

    /* renamed from: e */
    public final TaxiButtonSpec f39964e;

    /* renamed from: f */
    public final String f39965f;

    /* renamed from: com.moovit.app.taxi.providers.TaxiPopupConfig$a */
    public class C15437a implements Parcelable.Creator<TaxiPopupConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiPopupConfig) C19612n.m46981v(parcel, TaxiPopupConfig.f39960g);
        }

        public final Object[] newArray(int i) {
            return new TaxiPopupConfig[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiPopupConfig$b */
    public class C15438b extends C19619s<TaxiPopupConfig> {
        public C15438b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19617r rVar = C16019d.m40803a().f41718d;
            pVar.getClass();
            return new TaxiPopupConfig((Image) rVar.read(pVar), pVar.mo51947p(), pVar.mo51947p(), (TaxiButtonSpec) TaxiButtonSpec.f39927e.read(pVar), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiPopupConfig taxiPopupConfig = (TaxiPopupConfig) obj;
            Image image = taxiPopupConfig.f39961b;
            C19617r rVar = C16019d.m40803a().f41718d;
            qVar.getClass();
            rVar.write(image, qVar);
            qVar.mo51954p(taxiPopupConfig.f39962c);
            qVar.mo51954p(taxiPopupConfig.f39963d);
            TaxiButtonSpec taxiButtonSpec = taxiPopupConfig.f39964e;
            TaxiButtonSpec.C15420b bVar = TaxiButtonSpec.f39927e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(taxiButtonSpec, qVar);
            qVar.mo51955t(taxiPopupConfig.f39965f);
        }
    }

    public TaxiPopupConfig(Image image, String str, String str2, TaxiButtonSpec taxiButtonSpec, String str3) {
        C21100e.m49373x(image, "image");
        this.f39961b = image;
        C21100e.m49373x(str, "title");
        this.f39962c = str;
        C21100e.m49373x(str2, "subtitle");
        this.f39963d = str2;
        C21100e.m49373x(taxiButtonSpec, "buttonSpec");
        this.f39964e = taxiButtonSpec;
        this.f39965f = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiPopupConfig{image=");
        k.append(this.f39961b);
        k.append(", title='");
        C25541a.m63890u(k, this.f39962c, '\'', ", subtitle='");
        C25541a.m63890u(k, this.f39963d, '\'', ", buttonSpec=");
        k.append(this.f39964e);
        k.append(", promoCode='");
        k.append(this.f39965f);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39960g);
    }
}
