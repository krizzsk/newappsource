package com.moovit.ads.mapitem.html;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ads.AdSize;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/mapitem/html/MapItemAdCreativeHtml;", "Landroid/os/Parcelable;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MapItemAdCreativeHtml implements Parcelable {
    public static final Parcelable.Creator<MapItemAdCreativeHtml> CREATOR = new C14711a();

    /* renamed from: b */
    public final String f37402b;

    /* renamed from: c */
    public final AdSize f37403c;

    /* renamed from: d */
    public final String f37404d;

    /* renamed from: com.moovit.ads.mapitem.html.MapItemAdCreativeHtml$a */
    public static final class C14711a implements Parcelable.Creator<MapItemAdCreativeHtml> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new MapItemAdCreativeHtml(AdSize.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new MapItemAdCreativeHtml[i];
        }
    }

    public MapItemAdCreativeHtml(AdSize adSize, String str, String str2) {
        C24362h.m61211f(str, "html");
        C24362h.m61211f(adSize, "adSize");
        this.f37402b = str;
        this.f37403c = adSize;
        this.f37404d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapItemAdCreativeHtml)) {
            return false;
        }
        MapItemAdCreativeHtml mapItemAdCreativeHtml = (MapItemAdCreativeHtml) obj;
        return C24362h.m61206a(this.f37402b, mapItemAdCreativeHtml.f37402b) && C24362h.m61206a(this.f37403c, mapItemAdCreativeHtml.f37403c) && C24362h.m61206a(this.f37404d, mapItemAdCreativeHtml.f37404d);
    }

    public final int hashCode() {
        int hashCode = (this.f37403c.hashCode() + (this.f37402b.hashCode() * 31)) * 31;
        String str = this.f37404d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MapItemAdCreativeHtml(html=");
        k.append(this.f37402b);
        k.append(", adSize=");
        k.append(this.f37403c);
        k.append(", redirectCloseUrl=");
        return C0017h.m57N(k, this.f37404d, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f37402b);
        this.f37403c.writeToParcel(parcel, i);
        parcel.writeString(this.f37404d);
    }
}
