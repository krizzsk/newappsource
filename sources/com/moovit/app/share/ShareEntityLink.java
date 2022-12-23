package com.moovit.app.share;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareEntityLink implements Parcelable {
    public static final Parcelable.Creator<ShareEntityLink> CREATOR = new C15312a();

    /* renamed from: b */
    public final String f39584b;

    /* renamed from: c */
    public final String f39585c;

    /* renamed from: d */
    public final String f39586d;

    /* renamed from: com.moovit.app.share.ShareEntityLink$a */
    public class C15312a implements Parcelable.Creator<ShareEntityLink> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareEntityLink(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareEntityLink[i];
        }
    }

    public ShareEntityLink(String str, String str2, String str3) {
        this.f39584b = str;
        this.f39585c = str2;
        this.f39586d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39584b);
        parcel.writeString(this.f39585c);
        parcel.writeString(this.f39586d);
    }

    public ShareEntityLink(Parcel parcel) {
        this.f39586d = parcel.readString();
        this.f39584b = parcel.readString();
        this.f39585c = parcel.readString();
    }
}
