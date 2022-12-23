package com.moovit.payment.account.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum PaymentMethodStatus implements Parcelable {
    f64058OK,
    EXPIRED;
    
    public static final C19577c<PaymentMethodStatus> CODER = null;
    public static final Parcelable.Creator<PaymentMethodStatus> CREATOR = null;

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentMethodStatus$a */
    public class C25691a implements Parcelable.Creator<PaymentMethodStatus> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentMethodStatus) C19612n.m46981v(parcel, PaymentMethodStatus.CODER);
        }

        public final Object[] newArray(int i) {
            return new PaymentMethodStatus[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        PaymentMethodStatus paymentMethodStatus;
        PaymentMethodStatus paymentMethodStatus2;
        CREATOR = new C25691a();
        CODER = new C19577c<>(PaymentMethodStatus.class, paymentMethodStatus, paymentMethodStatus2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
