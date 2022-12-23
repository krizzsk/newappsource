package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13429p;

@SafeParcelable.Class(creator = "FacebookAuthCredentialCreator")
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new C13429p();
    @SafeParcelable.Field(getter = "getAccessToken", mo65739id = 1)

    /* renamed from: b */
    public final String f36380b;

    @SafeParcelable.Constructor
    public FacebookAuthCredential(@SafeParcelable.Param(mo65742id = 1) String str) {
        this.f36380b = Preconditions.checkNotEmpty(str);
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "facebook.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36380b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
