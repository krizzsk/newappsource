package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.usebutton.sdk.internal.models.Configuration;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/SharePhoto$a;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class SharePhoto extends ShareMedia<SharePhoto, C2506a> {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C2507b();

    /* renamed from: c */
    public final Bitmap f8942c;

    /* renamed from: d */
    public final Uri f8943d;

    /* renamed from: e */
    public final boolean f8944e;

    /* renamed from: f */
    public final String f8945f;

    /* renamed from: g */
    public final ShareMedia.Type f8946g = ShareMedia.Type.PHOTO;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C2506a extends ShareMedia.C2503a<SharePhoto, C2506a> {

        /* renamed from: b */
        public Bitmap f8947b;

        /* renamed from: c */
        public Uri f8948c;

        /* renamed from: d */
        public boolean f8949d;

        /* renamed from: e */
        public String f8950e;

        /* renamed from: a */
        public final C2506a mo12745a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                Bundle bundle = sharePhoto.f8934b;
                C24362h.m61211f(bundle, Configuration.KEY_PARAMETERS);
                this.f8935a.putAll(bundle);
                this.f8947b = sharePhoto.f8942c;
                this.f8948c = sharePhoto.f8943d;
                this.f8949d = sharePhoto.f8944e;
                this.f8950e = sharePhoto.f8945f;
            }
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$b */
    public static final class C2507b implements Parcelable.Creator<SharePhoto> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new SharePhoto(parcel);
        }

        public final Object[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    public SharePhoto(C2506a aVar) {
        super(aVar);
        this.f8942c = aVar.f8947b;
        this.f8943d = aVar.f8948c;
        this.f8944e = aVar.f8949d;
        this.f8945f = aVar.f8950e;
    }

    /* renamed from: b */
    public final ShareMedia.Type mo12736b() {
        return this.f8946g;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8942c, 0);
        parcel.writeParcelable(this.f8943d, 0);
        parcel.writeByte(this.f8944e ? (byte) 1 : 0);
        parcel.writeString(this.f8945f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "parcel");
        this.f8942c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f8943d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8944e = parcel.readByte() != 0;
        this.f8945f = parcel.readString();
    }
}
