package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/share/model/ShareLinkContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/ShareLinkContent$a;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareLinkContent extends ShareContent<ShareLinkContent, C2501a> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C2502b();

    /* renamed from: h */
    public final String f8933h;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C2501a extends ShareContent.C2498a<ShareLinkContent, C2501a> {
    }

    /* renamed from: com.facebook.share.model.ShareLinkContent$b */
    public static final class C2502b implements Parcelable.Creator<ShareLinkContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new ShareLinkContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    public ShareLinkContent(C2501a aVar) {
        super(aVar);
        this.f8933h = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8933h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
        this.f8933h = parcel.readString();
    }
}
