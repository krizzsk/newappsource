package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiPolygonSettings;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polylon;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiPolygon implements Parcelable {
    public static final Parcelable.Creator<TaxiPolygon> CREATOR = new C15431a();

    /* renamed from: d */
    public static final C15432b f39955d = new C15432b(TaxiPolygon.class);

    /* renamed from: b */
    public final Polygon f39956b;

    /* renamed from: c */
    public final TaxiPolygonSettings f39957c;

    /* renamed from: com.moovit.app.taxi.providers.TaxiPolygon$a */
    public class C15431a implements Parcelable.Creator<TaxiPolygon> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiPolygon) C19612n.m46981v(parcel, TaxiPolygon.f39955d);
        }

        public final Object[] newArray(int i) {
            return new TaxiPolygon[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiPolygon$b */
    public class C15432b extends C19619s<TaxiPolygon> {
        public C15432b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Polylon.C15747c cVar = Polylon.f40985h;
            pVar.getClass();
            return new TaxiPolygon((Polygon) cVar.read(pVar), (TaxiPolygonSettings) TaxiPolygonSettings.f39958c.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiPolygon taxiPolygon = (TaxiPolygon) obj;
            Polygon polygon = taxiPolygon.f39956b;
            Polylon.C15748d dVar = Polylon.f40986i;
            qVar.getClass();
            qVar.mo51939l(dVar.f49804u);
            dVar.mo19622a(polygon, qVar);
            TaxiPolygonSettings taxiPolygonSettings = taxiPolygon.f39957c;
            TaxiPolygonSettings.C15434b bVar = TaxiPolygonSettings.f39958c;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(taxiPolygonSettings, qVar);
        }
    }

    public TaxiPolygon(Polygon polygon, TaxiPolygonSettings taxiPolygonSettings) {
        C21100e.m49373x(polygon, "polygon");
        this.f39956b = polygon;
        C21100e.m49373x(taxiPolygonSettings, "polygonSettings");
        this.f39957c = taxiPolygonSettings;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiPolygonSettings{polygon=");
        k.append(this.f39956b);
        k.append("polygonSettings=");
        k.append(this.f39957c);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39955d);
    }
}
