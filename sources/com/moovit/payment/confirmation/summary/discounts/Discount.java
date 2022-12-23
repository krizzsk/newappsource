package com.moovit.payment.confirmation.summary.discounts;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import p583jk.C17884p;

public class Discount implements Parcelable {
    public static final Parcelable.Creator<Discount> CREATOR = new C16316a();

    /* renamed from: b */
    public final String f42642b;

    /* renamed from: c */
    public final String f42643c;

    /* renamed from: d */
    public final String f42644d;

    /* renamed from: e */
    public final CurrencyAmount f42645e;

    /* renamed from: f */
    public final boolean f42646f;

    /* renamed from: com.moovit.payment.confirmation.summary.discounts.Discount$a */
    public class C16316a implements Parcelable.Creator<Discount> {
        public final Object createFromParcel(Parcel parcel) {
            return new Discount(parcel);
        }

        public final Object[] newArray(int i) {
            return new Discount[i];
        }
    }

    public Discount(String str, String str2, String str3, CurrencyAmount currencyAmount, boolean z) {
        C21100e.m49373x(str, "id");
        this.f42642b = str;
        C21100e.m49373x(str2, "tag");
        this.f42643c = str2;
        C21100e.m49373x(str3, "label");
        this.f42644d = str3;
        C21100e.m49373x(currencyAmount, "amount");
        this.f42645e = currencyAmount;
        this.f42646f = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        if (!this.f42642b.equals(discount.f42642b) || !this.f42643c.equals(discount.f42643c) || !this.f42644d.equals(discount.f42644d) || !this.f42645e.equals(discount.f42645e) || this.f42646f != discount.f42646f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42642b), C17884p.m44335F(this.f42643c), C17884p.m44335F(this.f42644d), C17884p.m44335F(this.f42645e), this.f42646f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42642b);
        parcel.writeString(this.f42643c);
        parcel.writeString(this.f42644d);
        parcel.writeParcelable(this.f42645e, i);
        parcel.writeInt(this.f42646f ? 1 : 0);
    }

    public Discount(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "id");
        this.f42642b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "tag");
        this.f42643c = readString2;
        String readString3 = parcel.readString();
        C21100e.m49373x(readString3, "label");
        this.f42644d = readString3;
        CurrencyAmount currencyAmount = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        C21100e.m49373x(currencyAmount, "amount");
        this.f42645e = currencyAmount;
        this.f42646f = parcel.readInt() != 1 ? false : true;
    }
}
