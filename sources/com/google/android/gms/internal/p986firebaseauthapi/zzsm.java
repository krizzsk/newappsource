package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;

@SafeParcelable.Class(creator = "OnFailedIdpSignInAidlResponseCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsm */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new zzsn();
    @SafeParcelable.Field(getter = "getStatus", mo65739id = 1)
    private final Status zza;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", mo65739id = 2)
    private final zze zzb;
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getTenantId", mo65739id = 4)
    private final String zzd;

    @SafeParcelable.Constructor
    public zzsm(@SafeParcelable.Param(mo65742id = 1) Status status, @SafeParcelable.Param(mo65742id = 2) zze zze, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2) {
        this.zza = status;
        this.zzb = zze;
        this.zzc = str;
        this.zzd = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Status zza() {
        return this.zza;
    }

    public final zze zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
