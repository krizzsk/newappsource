package com.moovit.payment.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep;
import java.util.EnumSet;
import java.util.Set;

public enum PaymentRegistrationType implements Parcelable {
    REGISTRATION(EnumSet.complementOf(EnumSet.of(PaymentRegistrationStep.CREDIT_CARD))),
    PURCHASE(EnumSet.allOf(PaymentRegistrationStep.class));
    
    public static final Parcelable.Creator<PaymentRegistrationType> CREATOR = null;
    public final Set<PaymentRegistrationStep> supportedSteps;

    /* renamed from: com.moovit.payment.registration.PaymentRegistrationType$a */
    public class C16360a implements Parcelable.Creator<PaymentRegistrationType> {
        public final Object createFromParcel(Parcel parcel) {
            return PaymentRegistrationType.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PaymentRegistrationType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C16360a();
    }

    private PaymentRegistrationType(Set<PaymentRegistrationStep> set) {
        this.supportedSteps = set;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
