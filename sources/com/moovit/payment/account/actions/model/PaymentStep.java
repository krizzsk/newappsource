package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.CurrencyAmount;
import java.util.ArrayList;
import java.util.List;
import je0.C23715f;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/PaymentStep;", "Lje0/f;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class PaymentStep extends C23715f implements Parcelable {
    public static final Parcelable.Creator<PaymentStep> CREATOR = new C25623a();

    /* renamed from: b */
    public final String f63909b;

    /* renamed from: c */
    public final String f63910c;

    /* renamed from: d */
    public final String f63911d;

    /* renamed from: e */
    public final String f63912e;

    /* renamed from: f */
    public final List<PaymentProduct> f63913f;

    /* renamed from: g */
    public final String f63914g;

    /* renamed from: h */
    public final String f63915h;

    /* renamed from: i */
    public final AccountFlowPaymentInfo f63916i;

    /* renamed from: j */
    public final CurrencyAmount f63917j;

    /* renamed from: com.moovit.payment.account.actions.model.PaymentStep$a */
    public static final class C25623a implements Parcelable.Creator<PaymentStep> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PaymentProduct.CREATOR.createFromParcel(parcel));
            }
            return new PaymentStep(readString, readString2, readString3, readString4, arrayList, parcel.readString(), parcel.readString(), AccountFlowPaymentInfo.CREATOR.createFromParcel(parcel), (CurrencyAmount) parcel.readParcelable(PaymentStep.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new PaymentStep[i];
        }
    }

    public PaymentStep(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, AccountFlowPaymentInfo accountFlowPaymentInfo, CurrencyAmount currencyAmount) {
        C24362h.m61211f(str, "contextId");
        C24362h.m61211f(str2, "analyticKey");
        C24362h.m61211f(str3, "identifier");
        C24362h.m61211f(str6, "confirmButtonCaption");
        C24362h.m61211f(accountFlowPaymentInfo, "paymentInfo");
        this.f63909b = str;
        this.f63910c = str2;
        this.f63911d = str3;
        this.f63912e = str4;
        this.f63913f = arrayList;
        this.f63914g = str5;
        this.f63915h = str6;
        this.f63916i = accountFlowPaymentInfo;
        this.f63917j = currencyAmount;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStep)) {
            return false;
        }
        PaymentStep paymentStep = (PaymentStep) obj;
        if (C24362h.m61206a(this.f63909b, paymentStep.f63909b) && C24362h.m61206a(this.f63910c, paymentStep.f63910c) && C24362h.m61206a(this.f63911d, paymentStep.f63911d) && C24362h.m61206a(this.f63912e, paymentStep.f63912e) && C24362h.m61206a(this.f63913f, paymentStep.f63913f) && C24362h.m61206a(this.f63914g, paymentStep.f63914g) && C24362h.m61206a(this.f63915h, paymentStep.f63915h) && C24362h.m61206a(this.f63916i, paymentStep.f63916i) && C24362h.m61206a(this.f63917j, paymentStep.f63917j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int d = C13715c.m34238d(this.f63911d, C13715c.m34238d(this.f63910c, this.f63909b.hashCode() * 31, 31), 31);
        String str = this.f63912e;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (this.f63913f.hashCode() + ((d + i) * 31)) * 31;
        String str2 = this.f63914g;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int hashCode2 = (this.f63916i.hashCode() + C13715c.m34238d(this.f63915h, (hashCode + i2) * 31, 31)) * 31;
        CurrencyAmount currencyAmount = this.f63917j;
        if (currencyAmount != null) {
            i3 = currencyAmount.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PaymentStep(contextId=");
        k.append(this.f63909b);
        k.append(", analyticKey=");
        k.append(this.f63910c);
        k.append(", identifier=");
        k.append(this.f63911d);
        k.append(", header=");
        k.append(this.f63912e);
        k.append(", products=");
        k.append(this.f63913f);
        k.append(", disclaimerHtml=");
        k.append(this.f63914g);
        k.append(", confirmButtonCaption=");
        k.append(this.f63915h);
        k.append(", paymentInfo=");
        k.append(this.f63916i);
        k.append(", totalPrice=");
        k.append(this.f63917j);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63909b);
        parcel.writeString(this.f63910c);
        parcel.writeString(this.f63911d);
        parcel.writeString(this.f63912e);
        List<PaymentProduct> list = this.f63913f;
        parcel.writeInt(list.size());
        for (PaymentProduct writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f63914g);
        parcel.writeString(this.f63915h);
        this.f63916i.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f63917j, i);
    }
}
