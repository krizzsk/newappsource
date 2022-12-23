package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/LanguageSettings;", "Landroid/os/Parcelable;", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class LanguageSettings implements Parcelable {
    public static final Parcelable.Creator<LanguageSettings> CREATOR = new C2250a();

    /* renamed from: b */
    public final LanguageStrings f8115b;

    /* renamed from: c */
    public final String f8116c;

    /* renamed from: com.cubic.umo.pass.model.LanguageSettings$a */
    public static final class C2250a implements Parcelable.Creator<LanguageSettings> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new LanguageSettings(LanguageStrings.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new LanguageSettings[i];
        }
    }

    public LanguageSettings(LanguageStrings languageStrings, String str) {
        C24362h.m61211f(languageStrings, "strings");
        this.f8115b = languageStrings;
        this.f8116c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageSettings)) {
            return false;
        }
        LanguageSettings languageSettings = (LanguageSettings) obj;
        return C24362h.m61206a(this.f8115b, languageSettings.f8115b) && C24362h.m61206a(this.f8116c, languageSettings.f8116c);
    }

    public final int hashCode() {
        int hashCode = this.f8115b.hashCode() * 31;
        String str = this.f8116c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LanguageSettings(strings=");
        k.append(this.f8115b);
        k.append(", defaultLanguage=");
        return C0016g.m30n(k, this.f8116c, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        this.f8115b.writeToParcel(parcel, i);
        parcel.writeString(this.f8116c);
    }
}
