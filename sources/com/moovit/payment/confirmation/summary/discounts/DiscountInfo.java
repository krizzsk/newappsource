package com.moovit.payment.confirmation.summary.discounts;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p977zz.C20946j0;

public class DiscountInfo implements Parcelable {
    public static final Parcelable.Creator<DiscountInfo> CREATOR = new C16317a();

    /* renamed from: b */
    public final String f42647b;

    /* renamed from: c */
    public final List<Discount> f42648c;

    /* renamed from: com.moovit.payment.confirmation.summary.discounts.DiscountInfo$a */
    public class C16317a implements Parcelable.Creator<DiscountInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new DiscountInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new DiscountInfo[i];
        }
    }

    public DiscountInfo(String str, ArrayList arrayList) {
        C21100e.m49373x(str, "discountContextId");
        this.f42647b = str;
        this.f42648c = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42647b);
        C20946j0.m49055b(i, parcel, this.f42648c);
    }

    public DiscountInfo(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "discountContextId");
        this.f42647b = readString;
        this.f42648c = Collections.unmodifiableList(C20946j0.m49054a(parcel, Discount.class));
    }
}
