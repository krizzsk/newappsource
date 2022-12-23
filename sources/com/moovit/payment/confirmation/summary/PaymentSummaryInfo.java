package com.moovit.payment.confirmation.summary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.LinkedText;
import com.moovit.payment.confirmation.summary.discounts.DiscountInfo;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.util.CurrencyAmount;
import java.util.List;
import p977zz.C20946j0;

public class PaymentSummaryInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentSummaryInfo> CREATOR = new C16314a();

    /* renamed from: b */
    public final PaymentGatewayInstructions f42635b;

    /* renamed from: c */
    public final DiscountInfo f42636c;

    /* renamed from: d */
    public final CurrencyAmount f42637d;

    /* renamed from: e */
    public final CurrencyAmount f42638e;

    /* renamed from: f */
    public final boolean f42639f;

    /* renamed from: g */
    public final List<PaymentSummarySecondaryAction> f42640g;

    /* renamed from: h */
    public final LinkedText f42641h;

    /* renamed from: com.moovit.payment.confirmation.summary.PaymentSummaryInfo$a */
    public class C16314a implements Parcelable.Creator<PaymentSummaryInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentSummaryInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentSummaryInfo[i];
        }
    }

    public PaymentSummaryInfo(PaymentGatewayInstructions paymentGatewayInstructions, DiscountInfo discountInfo, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, boolean z, List<PaymentSummarySecondaryAction> list, LinkedText linkedText) {
        this.f42635b = paymentGatewayInstructions;
        this.f42636c = discountInfo;
        this.f42637d = currencyAmount;
        this.f42638e = currencyAmount2;
        this.f42639f = z;
        C21100e.m49373x(list, "secondaryActions");
        this.f42640g = list;
        this.f42641h = linkedText;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42635b, i);
        parcel.writeParcelable(this.f42636c, i);
        parcel.writeParcelable(this.f42637d, i);
        parcel.writeParcelable(this.f42638e, i);
        parcel.writeInt(this.f42639f ? 1 : 0);
        C20946j0.m49055b(i, parcel, this.f42640g);
        parcel.writeParcelable(this.f42641h, i);
    }

    public PaymentSummaryInfo(Parcel parcel) {
        PaymentGatewayInstructions paymentGatewayInstructions = (PaymentGatewayInstructions) parcel.readParcelable(PaymentGatewayInstructions.class.getClassLoader());
        C21100e.m49371w(paymentGatewayInstructions);
        this.f42635b = paymentGatewayInstructions;
        this.f42636c = (DiscountInfo) parcel.readParcelable(DiscountInfo.class.getClassLoader());
        this.f42637d = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        this.f42638e = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        this.f42639f = parcel.readInt() != 1 ? false : true;
        this.f42640g = C20946j0.m49054a(parcel, PaymentSummarySecondaryAction.class);
        this.f42641h = (LinkedText) parcel.readParcelable(LinkedText.class.getClassLoader());
    }
}
