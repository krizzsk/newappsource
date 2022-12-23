package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.payment.registration.steps.p420id.PaymentAccountId;
import com.moovit.view.address.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20964s0;
import q00.C19047a;
import v50.C20101a;

public class PersonalDetails implements Parcelable {
    public static final Parcelable.Creator<PersonalDetails> CREATOR = new C25683a();

    /* renamed from: i */
    public static final C25684b f64037i = new C25684b(PersonalDetails.class);

    /* renamed from: b */
    public final String f64038b;

    /* renamed from: c */
    public final String f64039c;

    /* renamed from: d */
    public final String f64040d;

    /* renamed from: e */
    public final String f64041e;

    /* renamed from: f */
    public final List<PaymentAccountId> f64042f;

    /* renamed from: g */
    public final long f64043g;

    /* renamed from: h */
    public final Address f64044h;

    /* renamed from: com.moovit.payment.account.model.PersonalDetails$a */
    public class C25683a implements Parcelable.Creator<PersonalDetails> {
        public final Object createFromParcel(Parcel parcel) {
            return (PersonalDetails) C19612n.m46981v(parcel, PersonalDetails.f64037i);
        }

        public final Object[] newArray(int i) {
            return new PersonalDetails[i];
        }
    }

    /* renamed from: com.moovit.payment.account.model.PersonalDetails$b */
    public class C25684b extends C19619s<PersonalDetails> {
        public C25684b(Class cls) {
            super(2, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            Address address;
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            String t3 = pVar.mo51948t();
            ArrayList f = pVar.mo51958f(PaymentAccountId.f42786d);
            long m = pVar.mo51925m();
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i >= 2) {
                address = (Address) pVar.mo51962q(Address.f24016h);
            } else {
                address = null;
            }
            return new PersonalDetails(t, t2, t3, str, f, m, address);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PersonalDetails personalDetails = (PersonalDetails) obj;
            qVar.mo51955t(personalDetails.f64038b);
            qVar.mo51955t(personalDetails.f64039c);
            qVar.mo51955t(personalDetails.f64040d);
            qVar.mo51964g(personalDetails.f64042f, PaymentAccountId.f42786d);
            qVar.mo51940m(personalDetails.f64043g);
            qVar.mo51955t(personalDetails.f64041e);
            qVar.mo51967q(personalDetails.f64044h, Address.f24016h);
        }
    }

    public PersonalDetails(String str, String str2, String str3, String str4, List<PaymentAccountId> list, long j, Address address) {
        this.f64038b = str;
        this.f64039c = str2;
        this.f64040d = str3;
        this.f64041e = str4;
        this.f64042f = list;
        this.f64043g = j;
        this.f64044h = address;
    }

    /* renamed from: b */
    public static String m64189b(C19047a aVar, PersonalDetails personalDetails) {
        String str = personalDetails.f64038b;
        String str2 = personalDetails.f64039c;
        if (str == null && str2 == null) {
            return null;
        }
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        if (((Boolean) aVar.mo51505b(C20101a.f51014a0)).booleanValue()) {
            return C20964s0.m49102t(" ", str2, str);
        }
        return C20964s0.m49102t(" ", str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64037i);
    }
}
