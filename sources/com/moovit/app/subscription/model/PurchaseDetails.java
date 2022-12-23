package com.moovit.app.subscription.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDetails implements Parcelable {
    public static final Parcelable.Creator<PurchaseDetails> CREATOR = new C15365a();

    /* renamed from: b */
    public final List<String> f39784b;

    /* renamed from: c */
    public final String f39785c;

    /* renamed from: d */
    public final String f39786d;

    /* renamed from: e */
    public final long f39787e;

    /* renamed from: com.moovit.app.subscription.model.PurchaseDetails$a */
    public class C15365a implements Parcelable.Creator<PurchaseDetails> {
        public final Object createFromParcel(Parcel parcel) {
            return new PurchaseDetails(parcel);
        }

        public final Object[] newArray(int i) {
            return new PurchaseDetails[i];
        }
    }

    public PurchaseDetails(String str, ArrayList arrayList, long j, String str2) {
        this.f39784b = arrayList;
        C21100e.m49373x(str, "orderId");
        this.f39785c = str;
        C21100e.m49373x(str2, "purchaseToken");
        this.f39786d = str2;
        this.f39787e = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f39784b);
        parcel.writeString(this.f39785c);
        parcel.writeString(this.f39786d);
        parcel.writeLong(this.f39787e);
    }

    public PurchaseDetails(Parcel parcel) {
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        C21100e.m49373x(createStringArrayList, "skus");
        this.f39784b = createStringArrayList;
        String readString = parcel.readString();
        C21100e.m49373x(readString, "orderId");
        this.f39785c = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "purchaseToken");
        this.f39786d = readString2;
        this.f39787e = parcel.readLong();
    }
}
