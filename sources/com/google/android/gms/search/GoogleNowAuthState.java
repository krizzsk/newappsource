package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "GoogleNowAuthStateCreator")
@SafeParcelable.Reserved({1000})
public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new zza();
    @SafeParcelable.Field(getter = "getAuthCode", mo65739id = 1)
    public String zza;
    @SafeParcelable.Field(getter = "getAccessToken", mo65739id = 2)
    public String zzb;
    @SafeParcelable.Field(getter = "getNextAllowedTimeMillis", mo65739id = 3)
    public long zzc;

    @SafeParcelable.Constructor
    public GoogleNowAuthState(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    public String getAccessToken() {
        return this.zzb;
    }

    public String getAuthCode() {
        return this.zza;
    }

    public long getNextAllowedTimeMillis() {
        return this.zzc;
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74 + String.valueOf(str2).length());
        C0017h.m61R(sb, "mAuthCode = ", str, "\nmAccessToken = ", str2);
        sb.append("\nmNextAllowedTimeMillis = ");
        sb.append(j);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAuthCode(), false);
        SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        SafeParcelWriter.writeLong(parcel, 3, getNextAllowedTimeMillis());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
