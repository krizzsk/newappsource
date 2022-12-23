package com.moovit.app.useraccount.providers;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum ConnectProvider implements Parcelable {
    FACEBOOK,
    GOOGLE,
    MOOVIT;
    
    public static C19584i<ConnectProvider> CODER;
    public static final Parcelable.Creator<ConnectProvider> CREATOR = null;

    /* renamed from: com.moovit.app.useraccount.providers.ConnectProvider$a */
    public class C15636a implements Parcelable.Creator<ConnectProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return (ConnectProvider) C19612n.m46981v(parcel, ConnectProvider.CODER);
        }

        public final Object[] newArray(int i) {
            return new ConnectProvider[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        ConnectProvider connectProvider;
        ConnectProvider connectProvider2;
        ConnectProvider connectProvider3;
        CODER = new C19577c(ConnectProvider.class, connectProvider, connectProvider2, connectProvider3);
        CREATOR = new C15636a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
