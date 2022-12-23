package com.moovit.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ads.banner.html.BannerAdCreativeHtml;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/HtmlBannerAd;", "Lcom/moovit/ads/BannerAd;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class HtmlBannerAd extends BannerAd {
    public static final Parcelable.Creator<HtmlBannerAd> CREATOR = new C14702a();

    /* renamed from: c */
    public final String f37368c;

    /* renamed from: d */
    public final String f37369d;

    /* renamed from: e */
    public final BannerAdCreativeHtml f37370e;

    /* renamed from: com.moovit.ads.HtmlBannerAd$a */
    public static final class C14702a implements Parcelable.Creator<HtmlBannerAd> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new HtmlBannerAd(parcel.readString(), parcel.readString(), BannerAdCreativeHtml.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new HtmlBannerAd[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HtmlBannerAd(String str, String str2, BannerAdCreativeHtml bannerAdCreativeHtml) {
        super(str2);
        C24362h.m61211f(str, "id");
        C24362h.m61211f(str2, "placementId");
        C24362h.m61211f(bannerAdCreativeHtml, "creativeHtml");
        this.f37368c = str;
        this.f37369d = str2;
        this.f37370e = bannerAdCreativeHtml;
    }

    /* renamed from: b */
    public final String mo44629b() {
        return this.f37369d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HtmlBannerAd)) {
            return false;
        }
        HtmlBannerAd htmlBannerAd = (HtmlBannerAd) obj;
        if (C24362h.m61206a(this.f37368c, htmlBannerAd.f37368c) && C24362h.m61206a(this.f37369d, htmlBannerAd.f37369d) && C24362h.m61206a(this.f37370e, htmlBannerAd.f37370e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37370e.hashCode() + C13715c.m34238d(this.f37369d, this.f37368c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("HtmlBannerAd(id=");
        k.append(this.f37368c);
        k.append(", placementId=");
        k.append(this.f37369d);
        k.append(", creativeHtml=");
        k.append(this.f37370e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f37368c);
        parcel.writeString(this.f37369d);
        this.f37370e.writeToParcel(parcel, i);
    }
}
