package com.moovit.view.p340cc;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: com.moovit.view.cc.CreditCardPreview */
public class CreditCardPreview implements Parcelable {
    public static final Parcelable.Creator<CreditCardPreview> CREATOR = new C7955a();

    /* renamed from: f */
    public static final C7956b f24081f = new C7956b(CreditCardPreview.class);

    /* renamed from: b */
    public final CreditCardType f24082b;

    /* renamed from: c */
    public final String f24083c;

    /* renamed from: d */
    public final String f24084d;

    /* renamed from: e */
    public final String f24085e;

    /* renamed from: com.moovit.view.cc.CreditCardPreview$a */
    public class C7955a implements Parcelable.Creator<CreditCardPreview> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardPreview) C19612n.m46981v(parcel, CreditCardPreview.f24081f);
        }

        public final Object[] newArray(int i) {
            return new CreditCardPreview[i];
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardPreview$b */
    public class C7956b extends C19619s<CreditCardPreview> {
        public C7956b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                C19577c<CreditCardType> cVar = CreditCardType.CODER;
                pVar.getClass();
                return new CreditCardPreview((CreditCardType) cVar.read(pVar), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t());
            }
            C19577c<CreditCardType> cVar2 = CreditCardType.CODER;
            pVar.getClass();
            return new CreditCardPreview((CreditCardType) cVar2.read(pVar), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CreditCardPreview creditCardPreview = (CreditCardPreview) obj;
            CreditCardType creditCardType = creditCardPreview.f24082b;
            C19577c<CreditCardType> cVar = CreditCardType.CODER;
            qVar.getClass();
            cVar.write(creditCardType, qVar);
            qVar.mo51954p(creditCardPreview.f24083c);
            qVar.mo51955t(creditCardPreview.f24084d);
            qVar.mo51955t(creditCardPreview.f24085e);
        }
    }

    public CreditCardPreview(CreditCardType creditCardType, String str, String str2, String str3) {
        C21100e.m49373x(creditCardType, "type");
        this.f24082b = creditCardType;
        C21100e.m49373x(str, "lastDigits");
        this.f24083c = str;
        this.f24084d = str2;
        this.f24085e = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f24081f);
    }
}
