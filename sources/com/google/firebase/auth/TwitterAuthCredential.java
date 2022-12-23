package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13423j;

@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new C13423j();
    @SafeParcelable.Field(getter = "getToken", mo65739id = 1)

    /* renamed from: b */
    public String f36410b;
    @SafeParcelable.Field(getter = "getSecret", mo65739id = 2)

    /* renamed from: c */
    public String f36411c;

    @SafeParcelable.Constructor
    public TwitterAuthCredential(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2) {
        this.f36410b = Preconditions.checkNotEmpty(str);
        this.f36411c = Preconditions.checkNotEmpty(str2);
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "twitter.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36410b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36411c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
