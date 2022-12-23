package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p057d3.C4339c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/OptionSelectionStepResult;", "Ld3/c;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class OptionSelectionStepResult extends C4339c implements Parcelable {
    public static final Parcelable.Creator<OptionSelectionStepResult> CREATOR = new C25621a();

    /* renamed from: b */
    public final String f63902b;

    /* renamed from: c */
    public final String f63903c;

    /* renamed from: d */
    public final String f63904d;

    /* renamed from: e */
    public final String f63905e;

    /* renamed from: com.moovit.payment.account.actions.model.OptionSelectionStepResult$a */
    public static final class C25621a implements Parcelable.Creator<OptionSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new OptionSelectionStepResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new OptionSelectionStepResult[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionSelectionStepResult(String str, String str2, String str3, String str4) {
        super(str, str2);
        C24362h.m61211f(str, "contextId");
        C24362h.m61211f(str2, "analyticKey");
        C24362h.m61211f(str3, "type");
        C24362h.m61211f(str4, "selectedOptionId");
        this.f63902b = str;
        this.f63903c = str2;
        this.f63904d = str3;
        this.f63905e = str4;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: s */
    public final String mo19843s() {
        return this.f63903c;
    }

    /* renamed from: t */
    public final String mo19844t() {
        return this.f63902b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63902b);
        parcel.writeString(this.f63903c);
        parcel.writeString(this.f63904d);
        parcel.writeString(this.f63905e);
    }
}
