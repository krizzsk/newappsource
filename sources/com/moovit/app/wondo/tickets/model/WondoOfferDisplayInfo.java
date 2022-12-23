package com.moovit.app.wondo.tickets.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p977zz.C20942h0;
import p977zz.C20944i0;

public class WondoOfferDisplayInfo implements Parcelable {
    public static final Parcelable.Creator<WondoOfferDisplayInfo> CREATOR = new C15658a();

    /* renamed from: k */
    public static final C20942h0 f40721k;

    /* renamed from: b */
    public final Image f40722b;

    /* renamed from: c */
    public final Image f40723c;

    /* renamed from: d */
    public final String f40724d;

    /* renamed from: e */
    public final String f40725e;

    /* renamed from: f */
    public final String f40726f;

    /* renamed from: g */
    public final String f40727g;

    /* renamed from: h */
    public final Uri f40728h;

    /* renamed from: i */
    public final boolean f40729i;

    /* renamed from: j */
    public final C20944i0<String, String> f40730j;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoOfferDisplayInfo$a */
    public class C15658a implements Parcelable.Creator<WondoOfferDisplayInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoOfferDisplayInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoOfferDisplayInfo[i];
        }
    }

    static {
        C19584i.C19588d dVar = C19584i.f49770b;
        f40721k = new C20942h0(dVar, dVar, dVar, dVar);
    }

    public WondoOfferDisplayInfo(UriImage uriImage, UriImage uriImage2, String str, String str2, String str3, String str4, Uri uri, boolean z, C20944i0 i0Var) {
        this.f40722b = uriImage;
        this.f40723c = uriImage2;
        C21100e.m49373x(str, "title");
        this.f40724d = str;
        C21100e.m49373x(str2, "shortDescription");
        this.f40725e = str2;
        C21100e.m49373x(str3, "longDescription");
        this.f40726f = str3;
        C21100e.m49373x(str4, "availabilityDescription");
        this.f40727g = str4;
        C21100e.m49373x(uri, "legalUri");
        this.f40728h = uri;
        this.f40729i = z;
        this.f40730j = i0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40722b, i);
        parcel.writeParcelable(this.f40723c, i);
        parcel.writeString(this.f40724d);
        parcel.writeString(this.f40725e);
        parcel.writeString(this.f40726f);
        parcel.writeString(this.f40727g);
        parcel.writeParcelable(this.f40728h, i);
        parcel.writeInt(this.f40729i ? 1 : 0);
        C19613o.m46994v(parcel, this.f40730j, f40721k);
    }

    public WondoOfferDisplayInfo(Parcel parcel) {
        this.f40722b = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40723c = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40724d = parcel.readString();
        this.f40725e = parcel.readString();
        this.f40726f = parcel.readString();
        this.f40727g = parcel.readString();
        this.f40728h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f40729i = parcel.readInt() != 1 ? false : true;
        this.f40730j = (C20944i0) C19612n.m46981v(parcel, f40721k);
    }
}
