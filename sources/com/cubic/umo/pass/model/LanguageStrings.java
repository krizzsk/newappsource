package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/LanguageStrings;", "Landroid/os/Parcelable;", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class LanguageStrings implements Parcelable {
    public static final Parcelable.Creator<LanguageStrings> CREATOR = new C2251a();

    /* renamed from: b */
    public final String f8120b;

    /* renamed from: c */
    public final String f8121c;

    /* renamed from: d */
    public final String f8122d;

    /* renamed from: e */
    public final String f8123e;

    /* renamed from: com.cubic.umo.pass.model.LanguageStrings$a */
    public static final class C2251a implements Parcelable.Creator<LanguageStrings> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new LanguageStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new LanguageStrings[i];
        }
    }

    public LanguageStrings(String str, String str2, String str3, String str4) {
        this.f8120b = str;
        this.f8121c = str2;
        this.f8122d = str3;
        this.f8123e = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageStrings)) {
            return false;
        }
        LanguageStrings languageStrings = (LanguageStrings) obj;
        return C24362h.m61206a(this.f8120b, languageStrings.f8120b) && C24362h.m61206a(this.f8121c, languageStrings.f8121c) && C24362h.m61206a(this.f8122d, languageStrings.f8122d) && C24362h.m61206a(this.f8123e, languageStrings.f8123e);
    }

    public final int hashCode() {
        String str = this.f8120b;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8121c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8122d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8123e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LanguageStrings(buySV=");
        k.append(this.f8120b);
        k.append(", buySVDesc=");
        k.append(this.f8121c);
        k.append(", ownedSV=");
        k.append(this.f8122d);
        k.append(", buySVShortDesc=");
        return C0016g.m30n(k, this.f8123e, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f8120b);
        parcel.writeString(this.f8121c);
        parcel.writeString(this.f8122d);
        parcel.writeString(this.f8123e);
    }
}
