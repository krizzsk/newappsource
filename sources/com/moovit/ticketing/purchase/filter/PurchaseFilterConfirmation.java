package com.moovit.ticketing.purchase.filter;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseFilterConfirmation implements Parcelable {
    public static final Parcelable.Creator<PurchaseFilterConfirmation> CREATOR = new C7680a();

    /* renamed from: f */
    public static final C7681b f23344f = new C7681b(PurchaseFilterConfirmation.class);

    /* renamed from: b */
    public final String f23345b;

    /* renamed from: c */
    public final String f23346c;

    /* renamed from: d */
    public final String f23347d;

    /* renamed from: e */
    public final String f23348e;

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilterConfirmation$a */
    public class C7680a implements Parcelable.Creator<PurchaseFilterConfirmation> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseFilterConfirmation) C19612n.m46981v(parcel, PurchaseFilterConfirmation.f23344f);
        }

        public final Object[] newArray(int i) {
            return new PurchaseFilterConfirmation[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilterConfirmation$b */
    public class C7681b extends C19619s<PurchaseFilterConfirmation> {
        public C7681b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseFilterConfirmation(pVar.mo51948t(), pVar.mo51948t(), pVar.mo51947p(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseFilterConfirmation purchaseFilterConfirmation = (PurchaseFilterConfirmation) obj;
            qVar.mo51955t(purchaseFilterConfirmation.f23345b);
            qVar.mo51955t(purchaseFilterConfirmation.f23346c);
            qVar.mo51954p(purchaseFilterConfirmation.f23347d);
            qVar.mo51955t(purchaseFilterConfirmation.f23348e);
        }
    }

    public PurchaseFilterConfirmation(String str, String str2, String str3, String str4) {
        C21100e.m49373x(str, "title");
        this.f23345b = str;
        this.f23346c = str2;
        C21100e.m49373x(str3, "positiveConfirmationText");
        this.f23347d = str3;
        this.f23348e = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23344f);
    }
}
