package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/share/model/ShareVideoContent;", "Lcom/facebook/share/model/ShareContent;", "", "Lcom/facebook/share/model/ShareModel;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new C2513a();

    /* renamed from: h */
    public final String f8960h;

    /* renamed from: i */
    public final String f8961i;

    /* renamed from: j */
    public final SharePhoto f8962j;

    /* renamed from: k */
    public final ShareVideo f8963k;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C2513a implements Parcelable.Creator<ShareVideoContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ShareVideoContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        SharePhoto sharePhoto;
        C24362h.m61211f(parcel, "parcel");
        this.f8960h = parcel.readString();
        this.f8961i = parcel.readString();
        SharePhoto.C2506a a = new SharePhoto.C2506a().mo12745a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        if (a.f8948c == null && a.f8947b == null) {
            sharePhoto = null;
        } else {
            sharePhoto = new SharePhoto(a);
        }
        this.f8962j = sharePhoto;
        ShareVideo.C2511a aVar = new ShareVideo.C2511a();
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            aVar.f8959b = shareVideo.f8957c;
        }
        this.f8963k = new ShareVideo(aVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8960h);
        parcel.writeString(this.f8961i);
        parcel.writeParcelable(this.f8962j, 0);
        parcel.writeParcelable(this.f8963k, 0);
    }
}
