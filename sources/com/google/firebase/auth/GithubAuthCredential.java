package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13433t;

@SafeParcelable.Class(creator = "GithubAuthCredentialCreator")
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new C13433t();
    @SafeParcelable.Field(getter = "getToken", mo65739id = 1)

    /* renamed from: b */
    public String f36395b;

    @SafeParcelable.Constructor
    public GithubAuthCredential(@SafeParcelable.Param(mo65742id = 1) String str) {
        this.f36395b = Preconditions.checkNotEmpty(str);
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "github.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36395b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
