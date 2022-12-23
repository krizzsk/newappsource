package com.moovit.app.useraccount.campaigns.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;
import p977zz.C20944i0;

public class OnBoardingCampaignScreenInfo implements Parcelable {
    public static final Parcelable.Creator<OnBoardingCampaignScreenInfo> CREATOR = new C15591a();

    /* renamed from: b */
    public final Image f40561b;

    /* renamed from: c */
    public final String f40562c;

    /* renamed from: d */
    public final String f40563d;

    /* renamed from: e */
    public final C20944i0<String, AppDeepLink> f40564e;

    /* renamed from: f */
    public final C20944i0<String, AppDeepLink> f40565f;

    /* renamed from: com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignScreenInfo$a */
    public class C15591a implements Parcelable.Creator<OnBoardingCampaignScreenInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new OnBoardingCampaignScreenInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new OnBoardingCampaignScreenInfo[i];
        }
    }

    public OnBoardingCampaignScreenInfo(UriImage uriImage, String str, String str2, C20944i0 i0Var, C20944i0 i0Var2) {
        this.f40561b = uriImage;
        C21100e.m49373x(str, "title");
        this.f40562c = str;
        C21100e.m49373x(str2, "subtitle");
        this.f40563d = str2;
        this.f40564e = i0Var;
        this.f40565f = i0Var2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40561b, i);
        parcel.writeString(this.f40562c);
        parcel.writeString(this.f40563d);
        parcel.writeString((String) this.f40564e.f52692a);
        parcel.writeParcelable((Parcelable) this.f40564e.f52693b, i);
        if (this.f40565f != null) {
            parcel.writeInt(1);
            parcel.writeString((String) this.f40565f.f52692a);
            parcel.writeParcelable((Parcelable) this.f40565f.f52693b, i);
            return;
        }
        parcel.writeInt(0);
    }

    public OnBoardingCampaignScreenInfo(Parcel parcel) {
        this.f40561b = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f40562c = parcel.readString();
        this.f40563d = parcel.readString();
        this.f40564e = new C20944i0<>(parcel.readString(), (AppDeepLink) parcel.readParcelable(AppDeepLink.class.getClassLoader()));
        this.f40565f = parcel.readInt() == 1 ? new C20944i0<>(parcel.readString(), (AppDeepLink) parcel.readParcelable(AppDeepLink.class.getClassLoader())) : null;
    }
}
