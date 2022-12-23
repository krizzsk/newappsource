package com.moovit.app.taxi.providers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p879vw.C20240b;
import p879vw.C20241c;
import p879vw.C20242d;
import p977zz.C20943i;
import p977zz.C20975x0;

public class TaxiAppInfo implements Parcelable {
    public static final Parcelable.Creator<TaxiAppInfo> CREATOR = new C15417a();

    /* renamed from: f */
    public static final C15418b f39922f = new C15418b(TaxiAppInfo.class);

    /* renamed from: b */
    public final String f39923b;

    /* renamed from: c */
    public final String f39924c;

    /* renamed from: d */
    public final String f39925d;

    /* renamed from: e */
    public final String f39926e;

    /* renamed from: com.moovit.app.taxi.providers.TaxiAppInfo$a */
    public class C15417a implements Parcelable.Creator<TaxiAppInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiAppInfo) C19612n.m46981v(parcel, TaxiAppInfo.f39922f);
        }

        public final Object[] newArray(int i) {
            return new TaxiAppInfo[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiAppInfo$b */
    public class C15418b extends C19619s<TaxiAppInfo> {
        public C15418b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TaxiAppInfo(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiAppInfo taxiAppInfo = (TaxiAppInfo) obj;
            qVar.mo51954p(taxiAppInfo.f39923b);
            qVar.mo51954p(taxiAppInfo.f39924c);
            qVar.mo51954p(taxiAppInfo.f39925d);
            qVar.mo51954p(taxiAppInfo.f39926e);
        }
    }

    public TaxiAppInfo(String str, String str2, String str3, String str4) {
        C21100e.m49373x(str, "applicationId");
        this.f39923b = str;
        C21100e.m49373x(str2, "deepLinkUriFormat");
        this.f39924c = str2;
        C21100e.m49373x(str3, "currentLocationDeepLinkUriFormat");
        this.f39925d = str3;
        C21100e.m49373x(str4, "downloadUriLink");
        this.f39926e = str4;
    }

    /* renamed from: b */
    public final C20241c mo46102b() {
        boolean z;
        String str = this.f39923b;
        if (!C20943i.m49051d(19) || !str.equals("com.ubercab")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C20242d();
        }
        return new C20240b();
    }

    /* renamed from: c */
    public final boolean mo46103c(Context context) {
        return C20975x0.m49121h(context, this.f39923b);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiAppInfo{applicationId='");
        C25541a.m63890u(k, this.f39923b, '\'', ", deepLinkUriFormat='");
        C25541a.m63890u(k, this.f39924c, '\'', ", currentLocationDeepLinkUriFormat='");
        C25541a.m63890u(k, this.f39925d, '\'', ", downloadUriLink='");
        k.append(this.f39926e);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39922f);
    }
}
