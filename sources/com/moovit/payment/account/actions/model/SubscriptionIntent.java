package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/SubscriptionIntent;", "Lcom/moovit/payment/account/actions/model/AccountActionIntent;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class SubscriptionIntent extends AccountActionIntent {
    public static final Parcelable.Creator<SubscriptionIntent> CREATOR = new C25626a();

    /* renamed from: com.moovit.payment.account.actions.model.SubscriptionIntent$a */
    public static final class C25626a implements Parcelable.Creator<SubscriptionIntent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            parcel.readInt();
            return new SubscriptionIntent();
        }

        public final Object[] newArray(int i) {
            return new SubscriptionIntent[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(1);
    }
}
