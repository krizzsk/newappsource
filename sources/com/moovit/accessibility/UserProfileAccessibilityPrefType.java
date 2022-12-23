package com.moovit.accessibility;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum UserProfileAccessibilityPrefType implements Parcelable {
    TRIP_PLAN_ACCESSIBILITY_ROUTES,
    TRIP_PLAN_HIDE_MICRO_MOBILITY,
    TRIP_PLAN_TRAIN_ASSISTANCE,
    SERVICES_NOTIFY_DRIVER;
    
    public static C19577c<UserProfileAccessibilityPrefType> CODER;
    public static final Parcelable.Creator<UserProfileAccessibilityPrefType> CREATOR = null;

    /* renamed from: com.moovit.accessibility.UserProfileAccessibilityPrefType$a */
    public class C14694a implements Parcelable.Creator<UserProfileAccessibilityPrefType> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserProfileAccessibilityPrefType) C19612n.m46981v(parcel, UserProfileAccessibilityPrefType.CODER);
        }

        public final Object[] newArray(int i) {
            return new UserProfileAccessibilityPrefType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        UserProfileAccessibilityPrefType userProfileAccessibilityPrefType;
        UserProfileAccessibilityPrefType userProfileAccessibilityPrefType2;
        UserProfileAccessibilityPrefType userProfileAccessibilityPrefType3;
        UserProfileAccessibilityPrefType userProfileAccessibilityPrefType4;
        CREATOR = new C14694a();
        CODER = new C19577c<>(UserProfileAccessibilityPrefType.class, userProfileAccessibilityPrefType, userProfileAccessibilityPrefType2, userProfileAccessibilityPrefType3, userProfileAccessibilityPrefType4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
