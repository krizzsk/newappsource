package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p810sz.C19577c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001j\u0002\b\u000e¨\u0006\u000f"}, mo59060d2 = {"Lcom/moovit/payment/account/model/PaymentAccountProductType;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "SUBSCRIPTION", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public enum PaymentAccountProductType implements Parcelable {
    SUBSCRIPTION;
    
    public static final Parcelable.Creator<PaymentAccountProductType> CREATOR = null;
    public static final C25679a Companion = null;
    /* access modifiers changed from: private */
    public static final C19577c<PaymentAccountProductType> coder = null;

    /* renamed from: com.moovit.payment.account.model.PaymentAccountProductType$a */
    public static final class C25679a {
    }

    /* renamed from: com.moovit.payment.account.model.PaymentAccountProductType$b */
    public static final class C25680b implements Parcelable.Creator<PaymentAccountProductType> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return PaymentAccountProductType.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountProductType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        PaymentAccountProductType paymentAccountProductType;
        Companion = new C25679a();
        CREATOR = new C25680b();
        coder = new C19577c<>(PaymentAccountProductType.class, paymentAccountProductType);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(name());
    }
}
