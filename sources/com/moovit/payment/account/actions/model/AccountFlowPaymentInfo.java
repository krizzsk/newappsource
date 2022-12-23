package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/AccountFlowPaymentInfo;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountFlowPaymentInfo implements Parcelable {
    public static final Parcelable.Creator<AccountFlowPaymentInfo> CREATOR = new C25615a();

    /* renamed from: b */
    public final String f63870b;

    /* renamed from: c */
    public final String f63871c;

    /* renamed from: d */
    public final String f63872d;

    /* renamed from: com.moovit.payment.account.actions.model.AccountFlowPaymentInfo$a */
    public static final class C25615a implements Parcelable.Creator<AccountFlowPaymentInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new AccountFlowPaymentInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new AccountFlowPaymentInfo[i];
        }
    }

    public AccountFlowPaymentInfo(String str, String str2, String str3) {
        C24362h.m61211f(str, "paymentContext");
        C24362h.m61211f(str2, "paymentDescription");
        this.f63870b = str;
        this.f63871c = str2;
        this.f63872d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountFlowPaymentInfo)) {
            return false;
        }
        AccountFlowPaymentInfo accountFlowPaymentInfo = (AccountFlowPaymentInfo) obj;
        return C24362h.m61206a(this.f63870b, accountFlowPaymentInfo.f63870b) && C24362h.m61206a(this.f63871c, accountFlowPaymentInfo.f63871c) && C24362h.m61206a(this.f63872d, accountFlowPaymentInfo.f63872d);
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f63871c, this.f63870b.hashCode() * 31, 31);
        String str = this.f63872d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return d + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AccountFlowPaymentInfo(paymentContext=");
        k.append(this.f63870b);
        k.append(", paymentDescription=");
        k.append(this.f63871c);
        k.append(", discountContextId=");
        return C0017h.m57N(k, this.f63872d, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63870b);
        parcel.writeString(this.f63871c);
        parcel.writeString(this.f63872d);
    }
}
