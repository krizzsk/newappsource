package com.moovit.payment.registration;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum AccountAuthType implements Parcelable {
    PHONE,
    EXTERNAL,
    EMAIL;
    
    public static final C19577c<AccountAuthType> CODER = null;
    public static final Parcelable.Creator<AccountAuthType> CREATOR = null;

    /* renamed from: com.moovit.payment.registration.AccountAuthType$a */
    public class C16357a implements Parcelable.Creator<AccountAuthType> {
        public final Object createFromParcel(Parcel parcel) {
            return (AccountAuthType) C19612n.m46981v(parcel, AccountAuthType.CODER);
        }

        public final Object[] newArray(int i) {
            return new AccountAuthType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        AccountAuthType accountAuthType;
        AccountAuthType accountAuthType2;
        AccountAuthType accountAuthType3;
        CREATOR = new C16357a();
        CODER = new C19577c<>(AccountAuthType.class, accountAuthType, accountAuthType2, accountAuthType3);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
