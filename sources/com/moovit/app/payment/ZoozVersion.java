package com.moovit.app.payment;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum ZoozVersion implements Parcelable {
    ZOOZ,
    PAYMENTOS;
    
    public static final C19577c<ZoozVersion> CODER = null;
    public static final Parcelable.Creator<ZoozVersion> CREATOR = null;

    /* renamed from: com.moovit.app.payment.ZoozVersion$a */
    public class C15199a implements Parcelable.Creator<ZoozVersion> {
        public final Object createFromParcel(Parcel parcel) {
            return (ZoozVersion) C19612n.m46981v(parcel, ZoozVersion.CODER);
        }

        public final Object[] newArray(int i) {
            return new ZoozVersion[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        ZoozVersion zoozVersion;
        ZoozVersion zoozVersion2;
        CODER = new C19577c<>(ZoozVersion.class, zoozVersion, zoozVersion2);
        CREATOR = new C15199a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
