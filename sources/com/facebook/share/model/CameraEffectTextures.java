package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/CameraEffectTextures;", "Lcom/facebook/share/model/ShareModel;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C2495b();

    /* renamed from: b */
    public final Bundle f8905b;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static final class C2494a {

        /* renamed from: a */
        public final Bundle f8906a = new Bundle();
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$b */
    public static final class C2495b implements Parcelable.Creator<CameraEffectTextures> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        public final Object[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    public CameraEffectTextures(C2494a aVar) {
        this.f8905b = aVar.f8906a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeBundle(this.f8905b);
    }

    public CameraEffectTextures(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8905b = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
