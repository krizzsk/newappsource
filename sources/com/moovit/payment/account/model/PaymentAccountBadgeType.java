package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum PaymentAccountBadgeType implements Parcelable {
    INFO,
    POSITIVE,
    ALERT,
    CRITICAL;
    
    public static final C19577c<PaymentAccountBadgeType> CODER = null;
    public static final Parcelable.Creator<PaymentAccountBadgeType> CREATOR = null;

    /* renamed from: com.moovit.payment.account.model.PaymentAccountBadgeType$a */
    public class C25674a implements Parcelable.Creator<PaymentAccountBadgeType> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccountBadgeType) C19612n.m46981v(parcel, PaymentAccountBadgeType.CODER);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountBadgeType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        PaymentAccountBadgeType paymentAccountBadgeType;
        PaymentAccountBadgeType paymentAccountBadgeType2;
        PaymentAccountBadgeType paymentAccountBadgeType3;
        PaymentAccountBadgeType paymentAccountBadgeType4;
        CREATOR = new C25674a();
        CODER = new C19577c<>(PaymentAccountBadgeType.class, paymentAccountBadgeType, paymentAccountBadgeType2, paymentAccountBadgeType3, paymentAccountBadgeType4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
