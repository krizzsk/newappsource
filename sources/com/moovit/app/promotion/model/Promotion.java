package com.moovit.app.promotion.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;

public class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new C15200a();

    /* renamed from: b */
    public final Image f39168b;

    /* renamed from: c */
    public final String f39169c;

    /* renamed from: d */
    public final String f39170d;

    /* renamed from: e */
    public final String f39171e;

    /* renamed from: f */
    public final AppDeepLink f39172f;

    /* renamed from: com.moovit.app.promotion.model.Promotion$a */
    public class C15200a implements Parcelable.Creator<Promotion> {
        public final Object createFromParcel(Parcel parcel) {
            return new Promotion(parcel);
        }

        public final Object[] newArray(int i) {
            return new Promotion[i];
        }
    }

    public Promotion(UriImage uriImage, String str, String str2, String str3, AppDeepLink appDeepLink) {
        this.f39168b = uriImage;
        C21100e.m49373x(str, "title");
        this.f39169c = str;
        C21100e.m49373x(str2, "subtitle");
        this.f39170d = str2;
        C21100e.m49373x(str3, "actionText");
        this.f39171e = str3;
        this.f39172f = appDeepLink;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f39168b, i);
        parcel.writeString(this.f39169c);
        parcel.writeString(this.f39170d);
        parcel.writeString(this.f39171e);
        parcel.writeParcelable(this.f39172f, i);
    }

    public Promotion(Parcel parcel) {
        this.f39168b = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f39169c = parcel.readString();
        this.f39170d = parcel.readString();
        this.f39171e = parcel.readString();
        this.f39172f = (AppDeepLink) parcel.readParcelable(AppDeepLink.class.getClassLoader());
    }
}
