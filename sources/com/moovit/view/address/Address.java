package com.moovit.view.address;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new C7932a();

    /* renamed from: h */
    public static final C7933b f24016h = new C7933b(Address.class);

    /* renamed from: b */
    public final String f24017b;

    /* renamed from: c */
    public final String f24018c;

    /* renamed from: d */
    public final String f24019d;

    /* renamed from: e */
    public final String f24020e;

    /* renamed from: f */
    public final String f24021f;

    /* renamed from: g */
    public final String f24022g;

    /* renamed from: com.moovit.view.address.Address$a */
    public class C7932a implements Parcelable.Creator<Address> {
        public final Object createFromParcel(Parcel parcel) {
            return (Address) C19612n.m46981v(parcel, Address.f24016h);
        }

        public final Object[] newArray(int i) {
            return new Address[i];
        }
    }

    /* renamed from: com.moovit.view.address.Address$b */
    public class C7933b extends C19619s<Address> {
        public C7933b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new Address(pVar.mo51947p(), pVar.mo51948t(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Address address = (Address) obj;
            qVar.mo51954p(address.f24017b);
            qVar.mo51955t(address.f24018c);
            qVar.mo51954p(address.f24019d);
            qVar.mo51954p(address.f24022g);
            qVar.mo51955t(address.f24020e);
            qVar.mo51954p(address.f24021f);
        }
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        C21100e.m49373x(str, "stringAddress");
        this.f24017b = str;
        this.f24018c = str2;
        C21100e.m49373x(str3, "city");
        this.f24019d = str3;
        C21100e.m49373x(str4, "countryCode");
        this.f24022g = str4;
        this.f24020e = str5;
        C21100e.m49373x(str6, "postalCode");
        this.f24021f = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        if (!this.f24017b.equals(address.f24017b) || !C20975x0.m49118e(this.f24018c, address.f24018c) || !this.f24019d.equals(address.f24019d) || !C20975x0.m49118e(this.f24022g, address.f24022g) || !C20975x0.m49118e(this.f24020e, address.f24020e) || !this.f24021f.equals(address.f24021f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f24017b), C17884p.m44335F(this.f24018c), C17884p.m44335F(this.f24019d), C17884p.m44335F(this.f24022g), C17884p.m44335F(this.f24020e), C17884p.m44335F(this.f24021f));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f24016h);
    }
}
