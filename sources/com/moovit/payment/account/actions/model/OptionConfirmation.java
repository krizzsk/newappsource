package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.model.Image;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/OptionConfirmation;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class OptionConfirmation implements Parcelable {
    public static final Parcelable.Creator<OptionConfirmation> CREATOR = new C25619a();

    /* renamed from: b */
    public final Image f63888b;

    /* renamed from: c */
    public final String f63889c;

    /* renamed from: d */
    public final String f63890d;

    /* renamed from: e */
    public final String f63891e;

    /* renamed from: f */
    public final String f63892f;

    /* renamed from: com.moovit.payment.account.actions.model.OptionConfirmation$a */
    public static final class C25619a implements Parcelable.Creator<OptionConfirmation> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new OptionConfirmation((Image) parcel.readParcelable(OptionConfirmation.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new OptionConfirmation[i];
        }
    }

    public OptionConfirmation(Image image, String str, String str2, String str3, String str4) {
        C24362h.m61211f(str3, "positiveText");
        this.f63888b = image;
        this.f63889c = str;
        this.f63890d = str2;
        this.f63891e = str3;
        this.f63892f = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionConfirmation)) {
            return false;
        }
        OptionConfirmation optionConfirmation = (OptionConfirmation) obj;
        return C24362h.m61206a(this.f63888b, optionConfirmation.f63888b) && C24362h.m61206a(this.f63889c, optionConfirmation.f63889c) && C24362h.m61206a(this.f63890d, optionConfirmation.f63890d) && C24362h.m61206a(this.f63891e, optionConfirmation.f63891e) && C24362h.m61206a(this.f63892f, optionConfirmation.f63892f);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Image image = this.f63888b;
        int i4 = 0;
        if (image == null) {
            i = 0;
        } else {
            i = image.hashCode();
        }
        int i5 = i * 31;
        String str = this.f63889c;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str2 = this.f63890d;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int d = C13715c.m34238d(this.f63891e, (i6 + i3) * 31, 31);
        String str3 = this.f63892f;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return d + i4;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("OptionConfirmation(image=");
        k.append(this.f63888b);
        k.append(", title=");
        k.append(this.f63889c);
        k.append(", text=");
        k.append(this.f63890d);
        k.append(", positiveText=");
        k.append(this.f63891e);
        k.append(", negativeText=");
        return C0017h.m57N(k, this.f63892f, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f63888b, i);
        parcel.writeString(this.f63889c);
        parcel.writeString(this.f63890d);
        parcel.writeString(this.f63891e);
        parcel.writeString(this.f63892f);
    }
}
