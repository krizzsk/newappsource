package com.moovit.ticketing.purchase.storedvalue;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseStoredValueAmount implements Parcelable {
    public static final Parcelable.Creator<PurchaseStoredValueAmount> CREATOR = new C7722a();

    /* renamed from: f */
    public static final C7723b f23429f = new C7723b(PurchaseStoredValueAmount.class);

    /* renamed from: b */
    public final CurrencyAmount f23430b;

    /* renamed from: c */
    public final String f23431c;

    /* renamed from: d */
    public final String f23432d;

    /* renamed from: e */
    public final boolean f23433e;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount$a */
    public class C7722a implements Parcelable.Creator<PurchaseStoredValueAmount> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStoredValueAmount) C19612n.m46981v(parcel, PurchaseStoredValueAmount.f23429f);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueAmount[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount$b */
    public class C7723b extends C19619s<PurchaseStoredValueAmount> {
        public C7723b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            pVar.getClass();
            CurrencyAmount currencyAmount = (CurrencyAmount) bVar.read(pVar);
            String t = pVar.mo51948t();
            boolean b = pVar.mo51919b();
            if (i >= 1) {
                str = pVar.mo51947p();
            } else {
                str = "";
            }
            return new PurchaseStoredValueAmount(currencyAmount, str, t, b);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStoredValueAmount purchaseStoredValueAmount = (PurchaseStoredValueAmount) obj;
            CurrencyAmount currencyAmount = purchaseStoredValueAmount.f23430b;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            qVar.mo51955t(purchaseStoredValueAmount.f23432d);
            qVar.mo51934b(purchaseStoredValueAmount.f23433e);
            qVar.mo51954p(purchaseStoredValueAmount.f23431c);
        }
    }

    public PurchaseStoredValueAmount(CurrencyAmount currencyAmount, String str, String str2, boolean z) {
        C21100e.m49373x(currencyAmount, "amount");
        this.f23430b = currencyAmount;
        C21100e.m49373x(str, "name");
        this.f23431c = str;
        this.f23432d = str2;
        this.f23433e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23429f);
    }
}
