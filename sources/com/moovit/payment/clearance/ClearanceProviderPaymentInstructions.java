package com.moovit.payment.clearance;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Map;
import p977zz.C20946j0;

public class ClearanceProviderPaymentInstructions implements Parcelable {
    public static final Parcelable.Creator<ClearanceProviderPaymentInstructions> CREATOR = new C16294a();

    /* renamed from: b */
    public final String f42584b;

    /* renamed from: c */
    public final String f42585c;

    /* renamed from: d */
    public final Map<String, String> f42586d;

    /* renamed from: e */
    public final CreditCardInstructions f42587e;

    /* renamed from: f */
    public final CurrencyAmount f42588f;

    /* renamed from: g */
    public final boolean f42589g;

    /* renamed from: com.moovit.payment.clearance.ClearanceProviderPaymentInstructions$a */
    public class C16294a implements Parcelable.Creator<ClearanceProviderPaymentInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return new ClearanceProviderPaymentInstructions(parcel);
        }

        public final Object[] newArray(int i) {
            return new ClearanceProviderPaymentInstructions[i];
        }
    }

    public ClearanceProviderPaymentInstructions(String str, String str2, Map map, CreditCardInstructions creditCardInstructions, CurrencyAmount currencyAmount) {
        C21100e.m49373x(str, "paymentContext");
        this.f42584b = str;
        C21100e.m49373x(str2, "paymentDescription");
        this.f42585c = str2;
        C21100e.m49373x(map, "paymentProperties");
        this.f42586d = map;
        C21100e.m49373x(creditCardInstructions, "instructions");
        this.f42587e = creditCardInstructions;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f42588f = currencyAmount;
        this.f42589g = true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42584b);
        parcel.writeString(this.f42585c);
        parcel.writeMap(this.f42586d);
        parcel.writeParcelable(this.f42587e, i);
        parcel.writeParcelable(this.f42588f, i);
        parcel.writeInt(this.f42589g ? 1 : 0);
    }

    public ClearanceProviderPaymentInstructions(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentContext");
        this.f42584b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "paymentDescription");
        this.f42585c = readString2;
        HashMap readHashMap = parcel.readHashMap(C20946j0.class.getClassLoader());
        C21100e.m49373x(readHashMap, "paymentProperties");
        this.f42586d = readHashMap;
        CreditCardInstructions creditCardInstructions = (CreditCardInstructions) parcel.readParcelable(CreditCardInstructions.class.getClassLoader());
        C21100e.m49373x(creditCardInstructions, "instructions");
        this.f42587e = creditCardInstructions;
        CurrencyAmount currencyAmount = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f42588f = currencyAmount;
        this.f42589g = parcel.readInt() != 1 ? false : true;
    }
}
