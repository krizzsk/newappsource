package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum RequestedNavigationMode implements Parcelable {
    REGULAR,
    ACCURATE;
    
    public static C19584i<RequestedNavigationMode> CODER;
    public static final Parcelable.Creator<RequestedNavigationMode> CREATOR = null;

    /* renamed from: com.moovit.navigation.RequestedNavigationMode$a */
    public class C4225a implements Parcelable.Creator<RequestedNavigationMode> {
        public final Object createFromParcel(Parcel parcel) {
            return (RequestedNavigationMode) C19612n.m46981v(parcel, RequestedNavigationMode.CODER);
        }

        public final Object[] newArray(int i) {
            return new RequestedNavigationMode[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        RequestedNavigationMode requestedNavigationMode;
        RequestedNavigationMode requestedNavigationMode2;
        CREATOR = new C4225a();
        CODER = new C19577c(RequestedNavigationMode.class, requestedNavigationMode, requestedNavigationMode2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
