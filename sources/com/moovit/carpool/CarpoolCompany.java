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

public class CarpoolCompany implements Parcelable {
    public static final Parcelable.Creator<CarpoolCompany> CREATOR = new C15696a();

    /* renamed from: d */
    public static C15697b f40867d = new C15697b(CarpoolCompany.class);

    /* renamed from: b */
    public final String f40868b;

    /* renamed from: c */
    public final String f40869c;

    /* renamed from: com.moovit.carpool.CarpoolCompany$a */
    public class C15696a implements Parcelable.Creator<CarpoolCompany> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolCompany) C19612n.m46981v(parcel, CarpoolCompany.f40867d);
        }

        public final Object[] newArray(int i) {
            return new CarpoolCompany[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolCompany$b */
    public class C15697b extends C19619s<CarpoolCompany> {
        public C15697b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CarpoolCompany(pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolCompany carpoolCompany = (CarpoolCompany) obj;
            qVar.mo51955t(carpoolCompany.f40868b);
            qVar.mo51955t(carpoolCompany.f40869c);
        }
    }

    public CarpoolCompany(String str, String str2) {
        this.f40868b = str;
        this.f40869c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarpoolCompany)) {
            return false;
        }
        CarpoolCompany carpoolCompany = (CarpoolCompany) obj;
        if (!C20975x0.m49118e(this.f40868b, carpoolCompany.f40868b) || !C20975x0.m49118e(this.f40869c, carpoolCompany.f40869c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40868b), C17884p.m44335F(this.f40869c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40867d);
    }
}
