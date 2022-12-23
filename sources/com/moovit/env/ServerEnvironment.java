package com.moovit.env;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum ServerEnvironment implements Parcelable {
    PROD,
    STG,
    QA,
    DEV;
    
    public static final C19577c<ServerEnvironment> CODER = null;
    public static final Parcelable.Creator<ServerEnvironment> CREATOR = null;

    /* renamed from: com.moovit.env.ServerEnvironment$a */
    public class C15874a implements Parcelable.Creator<ServerEnvironment> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServerEnvironment) C19612n.m46981v(parcel, ServerEnvironment.CODER);
        }

        public final Object[] newArray(int i) {
            return new ServerEnvironment[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        ServerEnvironment serverEnvironment;
        ServerEnvironment serverEnvironment2;
        ServerEnvironment serverEnvironment3;
        ServerEnvironment serverEnvironment4;
        CREATOR = new C15874a();
        CODER = new C19577c<>(ServerEnvironment.class, serverEnvironment, serverEnvironment2, serverEnvironment3, serverEnvironment4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
