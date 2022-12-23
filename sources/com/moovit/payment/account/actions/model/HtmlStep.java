package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import je0.C23715f;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/HtmlStep;", "Lje0/f;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class HtmlStep extends C23715f implements Parcelable {
    public static final Parcelable.Creator<HtmlStep> CREATOR = new C25617a();

    /* renamed from: b */
    public final String f63874b;

    /* renamed from: c */
    public final String f63875c;

    /* renamed from: d */
    public final String f63876d;

    /* renamed from: e */
    public final String f63877e;

    /* renamed from: f */
    public final String f63878f;

    /* renamed from: g */
    public final String f63879g;

    /* renamed from: com.moovit.payment.account.actions.model.HtmlStep$a */
    public static final class C25617a implements Parcelable.Creator<HtmlStep> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new HtmlStep(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new HtmlStep[i];
        }
    }

    public HtmlStep(String str, String str2, String str3, String str4, String str5, String str6) {
        C24362h.m61211f(str, "contextId");
        C24362h.m61211f(str2, "analyticKey");
        C24362h.m61211f(str3, "identifier");
        C24362h.m61211f(str5, "html");
        C24362h.m61211f(str6, "confirmButtonCaption");
        this.f63874b = str;
        this.f63875c = str2;
        this.f63876d = str3;
        this.f63877e = str4;
        this.f63878f = str5;
        this.f63879g = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HtmlStep)) {
            return false;
        }
        HtmlStep htmlStep = (HtmlStep) obj;
        if (C24362h.m61206a(this.f63874b, htmlStep.f63874b) && C24362h.m61206a(this.f63875c, htmlStep.f63875c) && C24362h.m61206a(this.f63876d, htmlStep.f63876d) && C24362h.m61206a(this.f63877e, htmlStep.f63877e) && C24362h.m61206a(this.f63878f, htmlStep.f63878f) && C24362h.m61206a(this.f63879g, htmlStep.f63879g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f63876d, C13715c.m34238d(this.f63875c, this.f63874b.hashCode() * 31, 31), 31);
        String str = this.f63877e;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return this.f63879g.hashCode() + C13715c.m34238d(this.f63878f, (d + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("HtmlStep(contextId=");
        k.append(this.f63874b);
        k.append(", analyticKey=");
        k.append(this.f63875c);
        k.append(", identifier=");
        k.append(this.f63876d);
        k.append(", title=");
        k.append(this.f63877e);
        k.append(", html=");
        k.append(this.f63878f);
        k.append(", confirmButtonCaption=");
        return C0017h.m57N(k, this.f63879g, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63874b);
        parcel.writeString(this.f63875c);
        parcel.writeString(this.f63876d);
        parcel.writeString(this.f63877e);
        parcel.writeString(this.f63878f);
        parcel.writeString(this.f63879g);
    }
}
