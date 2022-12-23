package com.moovit.ads.interstitial.html;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/interstitial/html/InterstitialAdCreativeHtml;", "Landroid/os/Parcelable;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class InterstitialAdCreativeHtml implements Parcelable {
    public static final Parcelable.Creator<InterstitialAdCreativeHtml> CREATOR = new C14708a();

    /* renamed from: b */
    public final String f37393b;

    /* renamed from: c */
    public final String f37394c;

    /* renamed from: com.moovit.ads.interstitial.html.InterstitialAdCreativeHtml$a */
    public static final class C14708a implements Parcelable.Creator<InterstitialAdCreativeHtml> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new InterstitialAdCreativeHtml(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new InterstitialAdCreativeHtml[i];
        }
    }

    public InterstitialAdCreativeHtml(String str, String str2) {
        C24362h.m61211f(str, "html");
        C24362h.m61211f(str2, "redirectUrl");
        this.f37393b = str;
        this.f37394c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterstitialAdCreativeHtml)) {
            return false;
        }
        InterstitialAdCreativeHtml interstitialAdCreativeHtml = (InterstitialAdCreativeHtml) obj;
        return C24362h.m61206a(this.f37393b, interstitialAdCreativeHtml.f37393b) && C24362h.m61206a(this.f37394c, interstitialAdCreativeHtml.f37394c);
    }

    public final int hashCode() {
        return this.f37394c.hashCode() + (this.f37393b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("InterstitialAdCreativeHtml(html=");
        k.append(this.f37393b);
        k.append(", redirectUrl=");
        return C0017h.m57N(k, this.f37394c, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f37393b);
        parcel.writeString(this.f37394c);
    }
}
