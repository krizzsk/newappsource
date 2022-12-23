package com.moovit.app.ridesharing.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;

public final class RideSharingRegistrationInfo implements Parcelable {
    public static final Parcelable.Creator<RideSharingRegistrationInfo> CREATOR = new C15261a();

    /* renamed from: b */
    public RideSharingRegistrationType f39386b;

    /* renamed from: c */
    public RideSharingRegistrationSteps f39387c;

    /* renamed from: d */
    public String f39388d;

    /* renamed from: e */
    public int f39389e;

    /* renamed from: f */
    public String f39390f;

    /* renamed from: g */
    public String f39391g;

    /* renamed from: h */
    public String f39392h;

    /* renamed from: i */
    public boolean f39393i;

    /* renamed from: j */
    public WondoFullScreenDisplayInfo f39394j;

    /* renamed from: k */
    public String f39395k;

    /* renamed from: l */
    public String f39396l;

    /* renamed from: m */
    public String f39397m;

    /* renamed from: n */
    public String f39398n;

    /* renamed from: o */
    public String f39399o;

    /* renamed from: p */
    public String f39400p;

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo$a */
    public class C15261a implements Parcelable.Creator<RideSharingRegistrationInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new RideSharingRegistrationInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new RideSharingRegistrationInfo[i];
        }
    }

    public RideSharingRegistrationInfo() {
        this.f39386b = RideSharingRegistrationType.CONNECT;
        this.f39387c = null;
        this.f39388d = null;
        this.f39389e = -1;
        this.f39390f = null;
        this.f39391g = null;
        this.f39392h = null;
        this.f39393i = false;
        this.f39395k = null;
        this.f39396l = null;
        this.f39397m = null;
        this.f39398n = null;
        this.f39399o = null;
        this.f39400p = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f39386b, i);
        parcel.writeParcelable(this.f39387c, i);
        parcel.writeString(this.f39388d);
        parcel.writeInt(this.f39389e);
        parcel.writeString(this.f39390f);
        parcel.writeString(this.f39391g);
        parcel.writeString(this.f39392h);
        parcel.writeInt(this.f39393i ? 1 : 0);
        parcel.writeString(this.f39395k);
        parcel.writeString(this.f39396l);
        parcel.writeString(this.f39397m);
        parcel.writeString(this.f39398n);
        parcel.writeString(this.f39399o);
        parcel.writeString(this.f39400p);
    }

    public RideSharingRegistrationInfo(Parcel parcel) {
        this.f39386b = (RideSharingRegistrationType) parcel.readParcelable(RideSharingRegistrationType.class.getClassLoader());
        this.f39387c = (RideSharingRegistrationSteps) parcel.readParcelable(RideSharingRegistrationSteps.class.getClassLoader());
        this.f39388d = parcel.readString();
        this.f39389e = parcel.readInt();
        this.f39390f = parcel.readString();
        this.f39391g = parcel.readString();
        this.f39392h = parcel.readString();
        this.f39393i = parcel.readInt() != 1 ? false : true;
        this.f39395k = parcel.readString();
        this.f39396l = parcel.readString();
        this.f39397m = parcel.readString();
        this.f39398n = parcel.readString();
        this.f39399o = parcel.readString();
        this.f39400p = parcel.readString();
    }
}
