package com.moovit.app.wondo.tickets.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;

public class WondoCodeDisplayInfo implements Parcelable {
    public static final Parcelable.Creator<WondoCodeDisplayInfo> CREATOR = new C15654a();

    /* renamed from: b */
    public final String f40701b;

    /* renamed from: c */
    public final Image f40702c;

    /* renamed from: d */
    public final Image f40703d;

    /* renamed from: e */
    public final String f40704e;

    /* renamed from: f */
    public final String f40705f;

    /* renamed from: g */
    public final String f40706g;

    /* renamed from: h */
    public final String f40707h;

    /* renamed from: i */
    public final String f40708i;

    /* renamed from: j */
    public final Uri f40709j;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoCodeDisplayInfo$a */
    public class C15654a implements Parcelable.Creator<WondoCodeDisplayInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoCodeDisplayInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoCodeDisplayInfo[i];
        }
    }

    public WondoCodeDisplayInfo(String str, UriImage uriImage, UriImage uriImage2, String str2, String str3, String str4, String str5, String str6, Uri uri) {
        C21100e.m49373x(str, "providerName");
        this.f40701b = str;
        this.f40702c = uriImage;
        this.f40703d = uriImage2;
        C21100e.m49373x(str2, "previewDescription");
        this.f40704e = str2;
        C21100e.m49373x(str3, "title");
        this.f40705f = str3;
        C21100e.m49373x(str4, "codeDescription");
        this.f40706g = str4;
        C21100e.m49373x(str5, "availabilityDescription");
        this.f40707h = str5;
        C21100e.m49373x(str6, "expirationDescription");
        this.f40708i = str6;
        C21100e.m49373x(uri, "legalUri");
        this.f40709j = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40701b);
        parcel.writeParcelable(this.f40702c, i);
        parcel.writeParcelable(this.f40703d, i);
        parcel.writeString(this.f40704e);
        parcel.writeString(this.f40705f);
        parcel.writeString(this.f40706g);
        parcel.writeString(this.f40707h);
        parcel.writeString(this.f40708i);
        parcel.writeParcelable(this.f40709j, i);
    }

    public WondoCodeDisplayInfo(Parcel parcel) {
        this.f40701b = parcel.readString();
        this.f40702c = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40703d = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40704e = parcel.readString();
        this.f40705f = parcel.readString();
        this.f40706g = parcel.readString();
        this.f40707h = parcel.readString();
        this.f40708i = parcel.readString();
        this.f40709j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
