package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13419f;

@SafeParcelable.Class(creator = "GoogleAuthCredentialCreator")
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new C13419f();
    @SafeParcelable.Field(getter = "getIdToken", mo65739id = 1)

    /* renamed from: b */
    public final String f36396b;
    @SafeParcelable.Field(getter = "getAccessToken", mo65739id = 2)

    /* renamed from: c */
    public final String f36397c;

    @SafeParcelable.Constructor
    public GoogleAuthCredential(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f36396b = str;
            this.f36397c = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "google.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36396b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36397c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
