package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import p382be.C13590b0;
import p382be.C13605m;

@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new C13590b0();
    @SafeParcelable.Field(getter = "getProviderId", mo65739id = 1)

    /* renamed from: b */
    public final String f36436b;
    @SafeParcelable.Field(getter = "getRawUserInfo", mo65739id = 2)

    /* renamed from: c */
    public final String f36437c;
    @SafeParcelable.Field(getter = "isNewUser", mo65739id = 3)

    /* renamed from: d */
    public final boolean f36438d;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.f36436b = str;
        this.f36437c = str2;
        C13605m.m34020c(str2);
        this.f36438d = z;
    }

    public zzp(boolean z) {
        this.f36438d = z;
        this.f36437c = null;
        this.f36436b = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36436b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36437c, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f36438d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
