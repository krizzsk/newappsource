package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;
import p977zz.C20944i0;

public class WondoFullScreenDisplayInfo implements Parcelable {
    public static final Parcelable.Creator<WondoFullScreenDisplayInfo> CREATOR = new C15656a();

    /* renamed from: b */
    public final Image f40710b;

    /* renamed from: c */
    public final String f40711c;

    /* renamed from: d */
    public final String f40712d;

    /* renamed from: e */
    public final C20944i0<String, AppDeepLink> f40713e;

    /* renamed from: f */
    public final C20944i0<String, AppDeepLink> f40714f;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo$a */
    public class C15656a implements Parcelable.Creator<WondoFullScreenDisplayInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoFullScreenDisplayInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoFullScreenDisplayInfo[i];
        }
    }

    public WondoFullScreenDisplayInfo(UriImage uriImage, String str, String str2, C20944i0 i0Var, C20944i0 i0Var2) {
        this.f40710b = uriImage;
        C21100e.m49373x(str, "title");
        this.f40711c = str;
        C21100e.m49373x(str2, "subtitle");
        this.f40712d = str2;
        this.f40713e = i0Var;
        this.f40714f = i0Var2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40710b, i);
        parcel.writeString(this.f40711c);
        parcel.writeString(this.f40712d);
        if (this.f40713e != null) {
            parcel.writeInt(1);
            parcel.writeString((String) this.f40713e.f52692a);
            parcel.writeParcelable((Parcelable) this.f40713e.f52693b, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.f40714f != null) {
            parcel.writeInt(1);
            parcel.writeString((String) this.f40714f.f52692a);
            parcel.writeParcelable((Parcelable) this.f40714f.f52693b, i);
            return;
        }
        parcel.writeInt(0);
    }

    public WondoFullScreenDisplayInfo(Parcel parcel) {
        this.f40710b = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40711c = parcel.readString();
        this.f40712d = parcel.readString();
        C20944i0<String, AppDeepLink> i0Var = null;
        this.f40713e = parcel.readInt() == 1 ? new C20944i0<>(parcel.readString(), (AppDeepLink) parcel.readParcelable(AppDeepLink.class.getClassLoader())) : null;
        this.f40714f = parcel.readInt() == 1 ? new C20944i0<>(parcel.readString(), (AppDeepLink) parcel.readParcelable(AppDeepLink.class.getClassLoader())) : i0Var;
    }
}
