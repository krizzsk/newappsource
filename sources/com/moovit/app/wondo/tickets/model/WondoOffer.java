package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.network.model.ServerId;

public class WondoOffer implements Parcelable {
    public static final Parcelable.Creator<WondoOffer> CREATOR = new C15657a();

    /* renamed from: b */
    public final String f40715b;

    /* renamed from: c */
    public final ServerId f40716c;

    /* renamed from: d */
    public final String f40717d;

    /* renamed from: e */
    public final WondoOfferDisplayInfo f40718e;

    /* renamed from: f */
    public final WondoOfferPrice f40719f;

    /* renamed from: g */
    public final AppDeepLink f40720g;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoOffer$a */
    public class C15657a implements Parcelable.Creator<WondoOffer> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoOffer(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoOffer[i];
        }
    }

    public WondoOffer(String str, ServerId serverId, String str2, WondoOfferDisplayInfo wondoOfferDisplayInfo, WondoOfferPrice wondoOfferPrice, AppDeepLink appDeepLink) {
        C21100e.m49373x(str, "providerName");
        this.f40715b = str;
        this.f40716c = serverId;
        C21100e.m49373x(str2, "name");
        this.f40717d = str2;
        this.f40718e = wondoOfferDisplayInfo;
        this.f40719f = wondoOfferPrice;
        C21100e.m49373x(appDeepLink, "appDeepLink");
        this.f40720g = appDeepLink;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40715b);
        parcel.writeParcelable(this.f40716c, i);
        parcel.writeString(this.f40717d);
        parcel.writeParcelable(this.f40718e, i);
        parcel.writeParcelable(this.f40719f, i);
        parcel.writeParcelable(this.f40720g, i);
    }

    public WondoOffer(Parcel parcel) {
        this.f40715b = parcel.readString();
        this.f40716c = (ServerId) parcel.readParcelable(ServerId.class.getClassLoader());
        this.f40717d = parcel.readString();
        this.f40718e = (WondoOfferDisplayInfo) parcel.readParcelable(WondoOfferDisplayInfo.class.getClassLoader());
        this.f40719f = (WondoOfferPrice) parcel.readParcelable(WondoOfferPrice.class.getClassLoader());
        this.f40720g = (AppDeepLink) parcel.readParcelable(AppDeepLink.class.getClassLoader());
    }
}
