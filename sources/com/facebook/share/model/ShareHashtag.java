package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/ShareHashtag;", "Lcom/facebook/share/model/ShareModel;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C2500b();

    /* renamed from: b */
    public final String f8931b;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static final class C2499a {

        /* renamed from: a */
        public String f8932a;
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    public static final class C2500b implements Parcelable.Creator<ShareHashtag> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new ShareHashtag(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    public ShareHashtag(C2499a aVar) {
        this.f8931b = aVar.f8932a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeString(this.f8931b);
    }

    public ShareHashtag(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8931b = parcel.readString();
    }
}
