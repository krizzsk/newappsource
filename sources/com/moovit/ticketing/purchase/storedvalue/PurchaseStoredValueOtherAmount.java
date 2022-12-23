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

public class PurchaseStoredValueOtherAmount implements Parcelable {
    public static final Parcelable.Creator<PurchaseStoredValueOtherAmount> CREATOR = new C7726a();

    /* renamed from: f */
    public static final C7727b f23438f = new C7727b(PurchaseStoredValueOtherAmount.class);

    /* renamed from: b */
    public final CurrencyAmount f23439b;

    /* renamed from: c */
    public final CurrencyAmount f23440c;

    /* renamed from: d */
    public final String f23441d;

    /* renamed from: e */
    public final String f23442e;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount$a */
    public class C7726a implements Parcelable.Creator<PurchaseStoredValueOtherAmount> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStoredValueOtherAmount) C19612n.m46981v(parcel, PurchaseStoredValueOtherAmount.f23438f);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueOtherAmount[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount$b */
    public class C7727b extends C19619s<PurchaseStoredValueOtherAmount> {
        public C7727b(Class cls) {
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
            CurrencyAmount currencyAmount2 = (CurrencyAmount) bVar.read(pVar);
            String t = pVar.mo51948t();
            if (i >= 1) {
                str = pVar.mo51947p();
            } else {
                str = "";
            }
            return new PurchaseStoredValueOtherAmount(currencyAmount, currencyAmount2, str, t);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount = (PurchaseStoredValueOtherAmount) obj;
            CurrencyAmount currencyAmount = purchaseStoredValueOtherAmount.f23439b;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = purchaseStoredValueOtherAmount.f23440c;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount2, qVar);
            qVar.mo51955t(purchaseStoredValueOtherAmount.f23442e);
            qVar.mo51954p(purchaseStoredValueOtherAmount.f23441d);
        }
    }

    public PurchaseStoredValueOtherAmount(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, String str, String str2) {
        C21100e.m49373x(currencyAmount, "minimum");
        this.f23439b = currencyAmount;
        C21100e.m49373x(currencyAmount2, "maximum");
        this.f23440c = currencyAmount2;
        C21100e.m49373x(str, "name");
        this.f23441d = str;
        this.f23442e = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23438f);
    }
}
