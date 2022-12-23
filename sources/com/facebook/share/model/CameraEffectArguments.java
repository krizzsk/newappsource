package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/CameraEffectArguments;", "Lcom/facebook/share/model/ShareModel;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C2493b();

    /* renamed from: b */
    public final Bundle f8903b;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static final class C2492a {

        /* renamed from: a */
        public final Bundle f8904a = new Bundle();
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$b */
    public static final class C2493b implements Parcelable.Creator<CameraEffectArguments> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        public final Object[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    public CameraEffectArguments(C2492a aVar) {
        this.f8903b = aVar.f8904a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeBundle(this.f8903b);
    }

    public CameraEffectArguments(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8903b = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
