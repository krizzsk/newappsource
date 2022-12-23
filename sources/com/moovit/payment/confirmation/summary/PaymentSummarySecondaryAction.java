package com.moovit.payment.confirmation.summary;

import android.os.Parcel;
import android.os.Parcelable;

public enum PaymentSummarySecondaryAction implements Parcelable {
    ADD_VOUCHER;
    
    public static final Parcelable.Creator<PaymentSummarySecondaryAction> CREATOR = null;

    /* renamed from: com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction$a */
    public class C16315a implements Parcelable.Creator<PaymentSummarySecondaryAction> {
        public final Object createFromParcel(Parcel parcel) {
            return PaymentSummarySecondaryAction.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PaymentSummarySecondaryAction[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C16315a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
