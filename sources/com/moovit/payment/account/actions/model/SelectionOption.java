package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.model.Image;
import com.moovit.util.PriceInfo;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/SelectionOption;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class SelectionOption implements Parcelable {
    public static final Parcelable.Creator<SelectionOption> CREATOR = new C25625a();

    /* renamed from: b */
    public final String f63918b;

    /* renamed from: c */
    public final Image f63919c;

    /* renamed from: d */
    public final String f63920d;

    /* renamed from: e */
    public final String f63921e;

    /* renamed from: f */
    public final OptionConfirmation f63922f;

    /* renamed from: g */
    public final PriceInfo f63923g;

    /* renamed from: h */
    public final String f63924h;

    /* renamed from: com.moovit.payment.account.actions.model.SelectionOption$a */
    public static final class C25625a implements Parcelable.Creator<SelectionOption> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new SelectionOption(parcel.readString(), (Image) parcel.readParcelable(SelectionOption.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OptionConfirmation.CREATOR.createFromParcel(parcel), (PriceInfo) parcel.readParcelable(SelectionOption.class.getClassLoader()), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new SelectionOption[i];
        }
    }

    public SelectionOption(String str, Image image, String str2, String str3, OptionConfirmation optionConfirmation, PriceInfo priceInfo, String str4) {
        C24362h.m61211f(str, "optionId");
        this.f63918b = str;
        this.f63919c = image;
        this.f63920d = str2;
        this.f63921e = str3;
        this.f63922f = optionConfirmation;
        this.f63923g = priceInfo;
        this.f63924h = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionOption)) {
            return false;
        }
        SelectionOption selectionOption = (SelectionOption) obj;
        return C24362h.m61206a(this.f63918b, selectionOption.f63918b) && C24362h.m61206a(this.f63919c, selectionOption.f63919c) && C24362h.m61206a(this.f63920d, selectionOption.f63920d) && C24362h.m61206a(this.f63921e, selectionOption.f63921e) && C24362h.m61206a(this.f63922f, selectionOption.f63922f) && C24362h.m61206a(this.f63923g, selectionOption.f63923g) && C24362h.m61206a(this.f63924h, selectionOption.f63924h);
    }

    public final int hashCode() {
        int hashCode = this.f63918b.hashCode() * 31;
        Image image = this.f63919c;
        int i = 0;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f63920d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63921e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OptionConfirmation optionConfirmation = this.f63922f;
        int hashCode5 = (hashCode4 + (optionConfirmation == null ? 0 : optionConfirmation.hashCode())) * 31;
        PriceInfo priceInfo = this.f63923g;
        int hashCode6 = (hashCode5 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        String str3 = this.f63924h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SelectionOption(optionId=");
        k.append(this.f63918b);
        k.append(", icon=");
        k.append(this.f63919c);
        k.append(", title=");
        k.append(this.f63920d);
        k.append(", subtitle=");
        k.append(this.f63921e);
        k.append(", confirmation=");
        k.append(this.f63922f);
        k.append(", priceInfo=");
        k.append(this.f63923g);
        k.append(", descriptionHtml=");
        return C0017h.m57N(k, this.f63924h, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63918b);
        parcel.writeParcelable(this.f63919c, i);
        parcel.writeString(this.f63920d);
        parcel.writeString(this.f63921e);
        OptionConfirmation optionConfirmation = this.f63922f;
        if (optionConfirmation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            optionConfirmation.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f63923g, i);
        parcel.writeString(this.f63924h);
    }
}
