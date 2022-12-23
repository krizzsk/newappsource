package com.moovit.app.wondo.tickets.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;

public class WondoRewardDisplayInfo implements Parcelable {
    public static final Parcelable.Creator<WondoRewardDisplayInfo> CREATOR = new C15662a();

    /* renamed from: b */
    public final Image f40739b;

    /* renamed from: c */
    public final String f40740c;

    /* renamed from: d */
    public final String f40741d;

    /* renamed from: e */
    public final String f40742e;

    /* renamed from: f */
    public final String f40743f;

    /* renamed from: g */
    public final Uri f40744g;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo$a */
    public class C15662a implements Parcelable.Creator<WondoRewardDisplayInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoRewardDisplayInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoRewardDisplayInfo[i];
        }
    }

    public WondoRewardDisplayInfo(UriImage uriImage, String str, String str2, String str3, String str4, Uri uri) {
        this.f40739b = uriImage;
        C21100e.m49373x(str, "title");
        this.f40740c = str;
        this.f40741d = str2;
        C21100e.m49373x(str3, "quantityDescription");
        this.f40742e = str3;
        C21100e.m49373x(str4, "expirationDescription");
        this.f40743f = str4;
        C21100e.m49373x(uri, "legalUri");
        this.f40744g = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40739b, i);
        parcel.writeString(this.f40740c);
        parcel.writeString(this.f40741d);
        parcel.writeString(this.f40742e);
        parcel.writeString(this.f40743f);
        parcel.writeParcelable(this.f40744g, i);
    }

    public WondoRewardDisplayInfo(Parcel parcel) {
        this.f40739b = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40740c = parcel.readString();
        this.f40741d = parcel.readString();
        this.f40742e = parcel.readString();
        this.f40743f = parcel.readString();
        this.f40744g = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
