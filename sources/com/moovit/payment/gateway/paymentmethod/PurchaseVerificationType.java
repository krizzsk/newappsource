package com.moovit.payment.gateway.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum PurchaseVerificationType implements Parcelable {
    NONE,
    CVV;
    
    public static C19584i<PurchaseVerificationType> CODER;
    public static final Parcelable.Creator<PurchaseVerificationType> CREATOR = null;

    /* renamed from: com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType$a */
    public class C16347a implements Parcelable.Creator<PurchaseVerificationType> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseVerificationType) C19612n.m46981v(parcel, PurchaseVerificationType.CODER);
        }

        public final Object[] newArray(int i) {
            return new PurchaseVerificationType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        PurchaseVerificationType purchaseVerificationType;
        PurchaseVerificationType purchaseVerificationType2;
        CREATOR = new C16347a();
        CODER = new C19577c(PurchaseVerificationType.class, purchaseVerificationType, purchaseVerificationType2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
