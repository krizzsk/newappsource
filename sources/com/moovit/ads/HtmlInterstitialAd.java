package com.moovit.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ads.interstitial.html.InterstitialAdCreativeHtml;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/HtmlInterstitialAd;", "Lcom/moovit/ads/InterstitialAd;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class HtmlInterstitialAd extends InterstitialAd {
    public static final Parcelable.Creator<HtmlInterstitialAd> CREATOR = new C14703a();

    /* renamed from: b */
    public final String f37371b;

    /* renamed from: c */
    public final String f37372c;

    /* renamed from: d */
    public final InterstitialAdCreativeHtml f37373d;

    /* renamed from: com.moovit.ads.HtmlInterstitialAd$a */
    public static final class C14703a implements Parcelable.Creator<HtmlInterstitialAd> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new HtmlInterstitialAd(parcel.readString(), parcel.readString(), InterstitialAdCreativeHtml.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new HtmlInterstitialAd[i];
        }
    }

    public HtmlInterstitialAd(String str, String str2, InterstitialAdCreativeHtml interstitialAdCreativeHtml) {
        C24362h.m61211f(str, "id");
        C24362h.m61211f(str2, "placementId");
        C24362h.m61211f(interstitialAdCreativeHtml, "creativeHtml");
        this.f37371b = str;
        this.f37372c = str2;
        this.f37373d = interstitialAdCreativeHtml;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HtmlInterstitialAd)) {
            return false;
        }
        HtmlInterstitialAd htmlInterstitialAd = (HtmlInterstitialAd) obj;
        if (C24362h.m61206a(this.f37371b, htmlInterstitialAd.f37371b) && C24362h.m61206a(this.f37372c, htmlInterstitialAd.f37372c) && C24362h.m61206a(this.f37373d, htmlInterstitialAd.f37373d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37373d.hashCode() + C13715c.m34238d(this.f37372c, this.f37371b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("HtmlInterstitialAd(id=");
        k.append(this.f37371b);
        k.append(", placementId=");
        k.append(this.f37372c);
        k.append(", creativeHtml=");
        k.append(this.f37373d);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f37371b);
        parcel.writeString(this.f37372c);
        this.f37373d.writeToParcel(parcel, i);
    }
}
