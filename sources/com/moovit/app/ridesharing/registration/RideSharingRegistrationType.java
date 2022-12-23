package com.moovit.app.ridesharing.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.tranzmate.R;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum RideSharingRegistrationType implements Parcelable {
    CONNECT(R.string.ride_sharing_registration_connect_activity_title),
    PURCHASE(R.string.ride_sharing_registration_purchase_activity_title);
    
    public static final C19584i<RideSharingRegistrationType> CODER = null;
    public static final Parcelable.Creator<RideSharingRegistrationType> CREATOR = null;
    public final int titleResId;

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingRegistrationType$a */
    public class C15262a implements Parcelable.Creator<RideSharingRegistrationType> {
        public final Object createFromParcel(Parcel parcel) {
            return (RideSharingRegistrationType) C19612n.m46981v(parcel, RideSharingRegistrationType.CODER);
        }

        public final Object[] newArray(int i) {
            return new RideSharingRegistrationType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        RideSharingRegistrationType rideSharingRegistrationType;
        RideSharingRegistrationType rideSharingRegistrationType2;
        CREATOR = new C15262a();
        CODER = new C19577c(RideSharingRegistrationType.class, rideSharingRegistrationType, rideSharingRegistrationType2);
    }

    private RideSharingRegistrationType(int i) {
        this.titleResId = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
