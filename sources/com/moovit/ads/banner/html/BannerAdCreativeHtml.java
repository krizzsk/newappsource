package com.moovit.ads.banner.html;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ads.AdSize;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/banner/html/BannerAdCreativeHtml;", "Landroid/os/Parcelable;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class BannerAdCreativeHtml implements Parcelable {
    public static final Parcelable.Creator<BannerAdCreativeHtml> CREATOR = new C14705a();

    /* renamed from: b */
    public final String f37381b;

    /* renamed from: c */
    public final AdSize f37382c;

    /* renamed from: com.moovit.ads.banner.html.BannerAdCreativeHtml$a */
    public static final class C14705a implements Parcelable.Creator<BannerAdCreativeHtml> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new BannerAdCreativeHtml(parcel.readString(), AdSize.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new BannerAdCreativeHtml[i];
        }
    }

    public BannerAdCreativeHtml(String str, AdSize adSize) {
        C24362h.m61211f(str, "html");
        C24362h.m61211f(adSize, "adSize");
        this.f37381b = str;
        this.f37382c = adSize;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdCreativeHtml)) {
            return false;
        }
        BannerAdCreativeHtml bannerAdCreativeHtml = (BannerAdCreativeHtml) obj;
        return C24362h.m61206a(this.f37381b, bannerAdCreativeHtml.f37381b) && C24362h.m61206a(this.f37382c, bannerAdCreativeHtml.f37382c);
    }

    public final int hashCode() {
        return this.f37382c.hashCode() + (this.f37381b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BannerAdCreativeHtml(html=");
        k.append(this.f37381b);
        k.append(", adSize=");
        k.append(this.f37382c);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f37381b);
        this.f37382c.writeToParcel(parcel, i);
    }
}
