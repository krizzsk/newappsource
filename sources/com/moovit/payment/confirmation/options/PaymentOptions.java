package com.moovit.payment.confirmation.options;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;

public class PaymentOptions implements Parcelable {
    public static final Parcelable.Creator<PaymentOptions> CREATOR = new C16310a();

    /* renamed from: b */
    public final int f42620b;

    /* renamed from: com.moovit.payment.confirmation.options.PaymentOptions$a */
    public class C16310a implements Parcelable.Creator<PaymentOptions> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentOptions(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentOptions[i];
        }
    }

    public PaymentOptions(int i) {
        C21100e.m49375y(1, Integer.MAX_VALUE, "quantity", i);
        this.f42620b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PaymentOptions) && this.f42620b == ((PaymentOptions) obj).f42620b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42620b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42620b);
    }

    public PaymentOptions(Parcel parcel) {
        this.f42620b = parcel.readInt();
    }
}
