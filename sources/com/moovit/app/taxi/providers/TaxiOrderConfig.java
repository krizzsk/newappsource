package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiOrderConfig implements Parcelable {
    public static final Parcelable.Creator<TaxiOrderConfig> CREATOR = new C15427a();

    /* renamed from: d */
    public static final C15428b f39947d = new C15428b(TaxiOrderConfig.class);

    /* renamed from: b */
    public final List<TaxiOrderProfile> f39948b;

    /* renamed from: c */
    public final int f39949c;

    /* renamed from: com.moovit.app.taxi.providers.TaxiOrderConfig$a */
    public class C15427a implements Parcelable.Creator<TaxiOrderConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiOrderConfig) C19612n.m46981v(parcel, TaxiOrderConfig.f39947d);
        }

        public final Object[] newArray(int i) {
            return new TaxiOrderConfig[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiOrderConfig$b */
    public class C15428b extends C19619s<TaxiOrderConfig> {
        public C15428b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TaxiOrderConfig(pVar.mo51959g(TaxiOrderProfile.f39950f), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiOrderConfig taxiOrderConfig = (TaxiOrderConfig) obj;
            qVar.mo51965h(taxiOrderConfig.f39948b, TaxiOrderProfile.f39950f);
            qVar.mo51939l(taxiOrderConfig.f39949c);
        }
    }

    public TaxiOrderConfig(ArrayList arrayList, int i) {
        C21100e.m49373x(arrayList, "additionalPassengersProfiles");
        this.f39948b = arrayList;
        C21100e.m49375y(1, Integer.MAX_VALUE, "maxNumberOfPassengers", i);
        this.f39949c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiOrderConfig{additionalPassengersProfiles=");
        k.append(this.f39948b);
        k.append(", maxNumberOfPassengers=");
        return C16530d.m42014g(k, this.f39949c, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39947d);
    }
}
