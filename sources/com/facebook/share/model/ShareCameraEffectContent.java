package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/ShareCameraEffectContent;", "Lcom/facebook/share/model/ShareContent;", "", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C2497a();

    /* renamed from: h */
    public String f8916h;

    /* renamed from: i */
    public CameraEffectArguments f8917i;

    /* renamed from: j */
    public CameraEffectTextures f8918j;

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    public static final class C2497a implements Parcelable.Creator<ShareCameraEffectContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ShareCameraEffectContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "parcel");
        this.f8916h = parcel.readString();
        CameraEffectArguments.C2492a aVar = new CameraEffectArguments.C2492a();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            aVar.f8904a.putAll(cameraEffectArguments.f8903b);
        }
        this.f8917i = new CameraEffectArguments(aVar);
        CameraEffectTextures.C2494a aVar2 = new CameraEffectTextures.C2494a();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            aVar2.f8906a.putAll(cameraEffectTextures.f8905b);
        }
        this.f8918j = new CameraEffectTextures(aVar2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8916h);
        parcel.writeParcelable(this.f8917i, 0);
        parcel.writeParcelable(this.f8918j, 0);
    }
}
