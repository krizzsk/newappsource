package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p001a0.C0017h;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiOrderProfile implements Parcelable {
    public static final Parcelable.Creator<TaxiOrderProfile> CREATOR = new C15429a();

    /* renamed from: f */
    public static final C15430b f39950f = new C15430b(TaxiOrderProfile.class);

    /* renamed from: b */
    public final ServerId f39951b;

    /* renamed from: c */
    public final Image f39952c;

    /* renamed from: d */
    public final String f39953d;

    /* renamed from: e */
    public final String f39954e;

    /* renamed from: com.moovit.app.taxi.providers.TaxiOrderProfile$a */
    public class C15429a implements Parcelable.Creator<TaxiOrderProfile> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiOrderProfile) C19612n.m46981v(parcel, TaxiOrderProfile.f39950f);
        }

        public final Object[] newArray(int i) {
            return new TaxiOrderProfile[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiOrderProfile$b */
    public class C15430b extends C19619s<TaxiOrderProfile> {
        public C15430b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new TaxiOrderProfile((Image) pVar.mo51962q(C16019d.m40803a().f41718d), new ServerId(pVar.mo51924l()), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiOrderProfile taxiOrderProfile = (TaxiOrderProfile) obj;
            ServerId serverId = taxiOrderProfile.f39951b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51967q(taxiOrderProfile.f39952c, C16019d.m40803a().f41718d);
            qVar.mo51955t(taxiOrderProfile.f39953d);
            qVar.mo51955t(taxiOrderProfile.f39954e);
        }
    }

    public TaxiOrderProfile(Image image, ServerId serverId, String str, String str2) {
        this.f39951b = serverId;
        this.f39952c = image;
        this.f39953d = str;
        this.f39954e = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiOrderProfile{id=");
        k.append(this.f39951b);
        k.append(", icon=");
        k.append(this.f39952c);
        k.append(", title=");
        k.append(this.f39953d);
        k.append(", subtitle=");
        return C0017h.m57N(k, this.f39954e, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39950f);
    }
}
