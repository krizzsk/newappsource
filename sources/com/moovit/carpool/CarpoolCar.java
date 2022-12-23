package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class CarpoolCar implements Parcelable {
    public static final Parcelable.Creator<CarpoolCar> CREATOR = new C15694a();

    /* renamed from: e */
    public static final C15695b f40863e = new C15695b(CarpoolCar.class);

    /* renamed from: b */
    public final String f40864b;

    /* renamed from: c */
    public final String f40865c;

    /* renamed from: d */
    public final String f40866d;

    /* renamed from: com.moovit.carpool.CarpoolCar$a */
    public class C15694a implements Parcelable.Creator<CarpoolCar> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolCar) C19612n.m46981v(parcel, CarpoolCar.f40863e);
        }

        public final Object[] newArray(int i) {
            return new CarpoolCar[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolCar$b */
    public class C15695b extends C19619s<CarpoolCar> {
        public C15695b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CarpoolCar(pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolCar carpoolCar = (CarpoolCar) obj;
            qVar.mo51955t(carpoolCar.f40864b);
            qVar.mo51955t(carpoolCar.f40865c);
            qVar.mo51955t(carpoolCar.f40866d);
        }
    }

    public CarpoolCar(String str, String str2, String str3) {
        this.f40864b = str;
        this.f40865c = str2;
        this.f40866d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarpoolCar)) {
            return false;
        }
        CarpoolCar carpoolCar = (CarpoolCar) obj;
        if (!C20975x0.m49118e(this.f40864b, carpoolCar.f40864b) || !C20975x0.m49118e(this.f40865c, carpoolCar.f40865c) || !C20975x0.m49118e(this.f40866d, carpoolCar.f40866d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40864b), C17884p.m44335F(this.f40865c), C17884p.m44335F(this.f40866d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40863e);
    }
}
