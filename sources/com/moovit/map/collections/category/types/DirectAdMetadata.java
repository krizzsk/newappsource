package com.moovit.map.collections.category.types;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/map/collections/category/types/DirectAdMetadata;", "Landroid/os/Parcelable;", "BaseApp_worldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class DirectAdMetadata implements Parcelable {
    public static final Parcelable.Creator<DirectAdMetadata> CREATOR = new C16264a();

    /* renamed from: b */
    public final String f42489b;

    /* renamed from: c */
    public final String f42490c;

    /* renamed from: com.moovit.map.collections.category.types.DirectAdMetadata$a */
    public static final class C16264a implements Parcelable.Creator<DirectAdMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new DirectAdMetadata(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new DirectAdMetadata[i];
        }
    }

    public DirectAdMetadata(String str, String str2) {
        C24362h.m61211f(str, "adId");
        C24362h.m61211f(str2, "analyticsData");
        this.f42489b = str;
        this.f42490c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f42489b);
        parcel.writeString(this.f42490c);
    }
}
