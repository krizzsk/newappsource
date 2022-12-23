package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/share/model/ShareVideo;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/ShareVideo$a;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareVideo extends ShareMedia<ShareVideo, C2511a> {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C2512b();

    /* renamed from: c */
    public final Uri f8957c;

    /* renamed from: d */
    public final ShareMedia.Type f8958d = ShareMedia.Type.VIDEO;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C2511a extends ShareMedia.C2503a<ShareVideo, C2511a> {

        /* renamed from: b */
        public Uri f8959b;
    }

    /* renamed from: com.facebook.share.model.ShareVideo$b */
    public static final class C2512b implements Parcelable.Creator<ShareVideo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new ShareVideo(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    public ShareVideo(C2511a aVar) {
        super(aVar);
        this.f8957c = aVar.f8959b;
    }

    /* renamed from: b */
    public final ShareMedia.Type mo12736b() {
        return this.f8958d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8957c, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "parcel");
        this.f8957c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
