package com.moovit.payment.gateway;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum PaymentGatewayType implements Parcelable {
    PAYMENT_METHOD("payment_method", 1),
    GOOGLE_PAY("google_pay", 1),
    CLEARANCE_PROVIDER("clearance_provider", 2),
    CASH("payment_method_cash", 1);
    
    public static final C19577c<PaymentGatewayType> CODER = null;
    public static final Parcelable.Creator<PaymentGatewayType> CREATOR = null;
    public final String analyticsName;
    public final Set<Integer> capabilities;

    /* renamed from: com.moovit.payment.gateway.PaymentGatewayType$a */
    public class C16327a implements Parcelable.Creator<PaymentGatewayType> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentGatewayType) C19612n.m46981v(parcel, PaymentGatewayType.CODER);
        }

        public final Object[] newArray(int i) {
            return new PaymentGatewayType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        PaymentGatewayType paymentGatewayType;
        PaymentGatewayType paymentGatewayType2;
        PaymentGatewayType paymentGatewayType3;
        PaymentGatewayType paymentGatewayType4;
        CREATOR = new C16327a();
        CODER = new C19577c<>(PaymentGatewayType.class, paymentGatewayType, paymentGatewayType2, paymentGatewayType3, paymentGatewayType4);
    }

    private PaymentGatewayType(String str, Integer... numArr) {
        C21100e.m49373x(str, "analyticsName");
        this.analyticsName = str;
        this.capabilities = Collections.unmodifiableSet(new HashSet(Arrays.asList(numArr)));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
