package com.moovit.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ads.mapitem.html.MapItemAdCreativeHtml;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/HtmlMapItemAd;", "Lcom/moovit/ads/MapItemAd;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class HtmlMapItemAd extends MapItemAd {
    public static final Parcelable.Creator<HtmlMapItemAd> CREATOR = new C14704a();

    /* renamed from: c */
    public final String f37374c;

    /* renamed from: d */
    public final String f37375d;

    /* renamed from: e */
    public final MapItemAdCreativeHtml f37376e;

    /* renamed from: com.moovit.ads.HtmlMapItemAd$a */
    public static final class C14704a implements Parcelable.Creator<HtmlMapItemAd> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new HtmlMapItemAd(parcel.readString(), parcel.readString(), MapItemAdCreativeHtml.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new HtmlMapItemAd[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HtmlMapItemAd(String str, String str2, MapItemAdCreativeHtml mapItemAdCreativeHtml) {
        super(str2);
        C24362h.m61211f(str, "id");
        C24362h.m61211f(str2, "placementId");
        C24362h.m61211f(mapItemAdCreativeHtml, "creativeHtml");
        this.f37374c = str;
        this.f37375d = str2;
        this.f37376e = mapItemAdCreativeHtml;
    }

    /* renamed from: b */
    public final String mo44644b() {
        return this.f37375d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HtmlMapItemAd)) {
            return false;
        }
        HtmlMapItemAd htmlMapItemAd = (HtmlMapItemAd) obj;
        if (C24362h.m61206a(this.f37374c, htmlMapItemAd.f37374c) && C24362h.m61206a(this.f37375d, htmlMapItemAd.f37375d) && C24362h.m61206a(this.f37376e, htmlMapItemAd.f37376e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37376e.hashCode() + C13715c.m34238d(this.f37375d, this.f37374c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("HtmlMapItemAd(id=");
        k.append(this.f37374c);
        k.append(", placementId=");
        k.append(this.f37375d);
        k.append(", creativeHtml=");
        k.append(this.f37376e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f37374c);
        parcel.writeString(this.f37375d);
        this.f37376e.writeToParcel(parcel, i);
    }
}
