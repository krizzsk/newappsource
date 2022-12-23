package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p001a0.C0017h;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiPolygonSettings implements Parcelable {
    public static final Parcelable.Creator<TaxiPolygonSettings> CREATOR = new C15433a();

    /* renamed from: c */
    public static final C15434b f39958c = new C15434b(TaxiPolygonSettings.class);

    /* renamed from: b */
    public final String f39959b;

    /* renamed from: com.moovit.app.taxi.providers.TaxiPolygonSettings$a */
    public class C15433a implements Parcelable.Creator<TaxiPolygonSettings> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiPolygonSettings) C19612n.m46981v(parcel, TaxiPolygonSettings.f39958c);
        }

        public final Object[] newArray(int i) {
            return new TaxiPolygonSettings[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiPolygonSettings$b */
    public class C15434b extends C19619s<TaxiPolygonSettings> {
        public C15434b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TaxiPolygonSettings(pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51955t(((TaxiPolygonSettings) obj).f39959b);
        }
    }

    public TaxiPolygonSettings(String str) {
        this.f39959b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return C0017h.m57N(C13555b.m33972k("TaxiPolygonSettings{dashBoardDeeplink="), this.f39959b, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39958c);
    }
}
