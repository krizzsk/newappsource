package com.moovit.carpool;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class CarpoolPassenger implements Parcelable {
    public static final Parcelable.Creator<CarpoolPassenger> CREATOR = new C15705a();

    /* renamed from: g */
    public static final C15706b f40899g = new C15706b(CarpoolPassenger.class);

    /* renamed from: b */
    public final String f40900b;

    /* renamed from: c */
    public final String f40901c;

    /* renamed from: d */
    public final Uri f40902d;

    /* renamed from: e */
    public final float f40903e;

    /* renamed from: f */
    public final String f40904f;

    /* renamed from: com.moovit.carpool.CarpoolPassenger$a */
    public class C15705a implements Parcelable.Creator<CarpoolPassenger> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolPassenger) C19612n.m46981v(parcel, CarpoolPassenger.f40899g);
        }

        public final Object[] newArray(int i) {
            return new CarpoolPassenger[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolPassenger$b */
    public class C15706b extends C19619s<CarpoolPassenger> {
        public C15706b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CarpoolPassenger(pVar.mo51947p(), pVar.mo51947p(), (Uri) pVar.mo51962q(C19794a.f50326d), pVar.mo51923j(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolPassenger carpoolPassenger = (CarpoolPassenger) obj;
            qVar.mo51954p(carpoolPassenger.f40900b);
            qVar.mo51954p(carpoolPassenger.f40901c);
            qVar.mo51967q(carpoolPassenger.f40902d, C19794a.f50326d);
            qVar.mo51938j(carpoolPassenger.f40903e);
            qVar.mo51955t(carpoolPassenger.f40904f);
        }
    }

    public CarpoolPassenger(String str, String str2, Uri uri, float f, String str3) {
        C21100e.m49373x(str, "firstName");
        this.f40900b = str;
        C21100e.m49373x(str2, "lastName");
        this.f40901c = str2;
        this.f40902d = uri;
        this.f40903e = f;
        this.f40904f = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40899g);
    }
}
