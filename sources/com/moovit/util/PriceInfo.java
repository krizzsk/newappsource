package com.moovit.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/util/PriceInfo;", "Landroid/os/Parcelable;", "BaseApp_worldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class PriceInfo implements Parcelable {
    public static final Parcelable.Creator<PriceInfo> CREATOR = new C7893b();

    /* renamed from: e */
    public static final C7892a f23864e = new C7892a(PriceInfo.class);

    /* renamed from: b */
    public final CurrencyAmount f23865b;

    /* renamed from: c */
    public final CurrencyAmount f23866c;

    /* renamed from: d */
    public final String f23867d;

    /* renamed from: com.moovit.util.PriceInfo$a */
    public static final class C7892a extends C19619s<PriceInfo> {
        public C7892a(Class<PriceInfo> cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) {
            C24362h.m61211f(pVar, "source");
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            CurrencyAmount currencyAmount = (CurrencyAmount) bVar.read(pVar);
            CurrencyAmount currencyAmount2 = (CurrencyAmount) pVar.mo51962q(bVar);
            String t = pVar.mo51948t();
            C24362h.m61210e(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
            C24362h.m61210e(currencyAmount2, "fullPrice");
            return new PriceInfo(currencyAmount, currencyAmount2, t);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) {
            PriceInfo priceInfo = (PriceInfo) obj;
            C24362h.m61211f(priceInfo, "obj");
            C24362h.m61211f(qVar, "target");
            CurrencyAmount currencyAmount = priceInfo.f23865b;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            qVar.mo51967q(priceInfo.f23866c, bVar);
            qVar.mo51955t(priceInfo.f23867d);
        }
    }

    /* renamed from: com.moovit.util.PriceInfo$b */
    public static final class C7893b implements Parcelable.Creator<PriceInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new PriceInfo((CurrencyAmount) parcel.readParcelable(PriceInfo.class.getClassLoader()), (CurrencyAmount) parcel.readParcelable(PriceInfo.class.getClassLoader()), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PriceInfo[i];
        }
    }

    public PriceInfo(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, String str) {
        C24362h.m61211f(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        C24362h.m61211f(currencyAmount2, "fullPrice");
        this.f23865b = currencyAmount;
        this.f23866c = currencyAmount2;
        this.f23867d = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceInfo)) {
            return false;
        }
        PriceInfo priceInfo = (PriceInfo) obj;
        return C24362h.m61206a(this.f23865b, priceInfo.f23865b) && C24362h.m61206a(this.f23866c, priceInfo.f23866c) && C24362h.m61206a(this.f23867d, priceInfo.f23867d);
    }

    public final int hashCode() {
        int hashCode = (this.f23866c.hashCode() + (this.f23865b.hashCode() * 31)) * 31;
        String str = this.f23867d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PriceInfo(price=");
        k.append(this.f23865b);
        k.append(", fullPrice=");
        k.append(this.f23866c);
        k.append(", label=");
        return C0017h.m57N(k, this.f23867d, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f23865b, i);
        parcel.writeParcelable(this.f23866c, i);
        parcel.writeString(this.f23867d);
    }
}
