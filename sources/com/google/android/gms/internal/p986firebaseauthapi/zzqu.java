package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetProvidersForEmailAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqu */
public final class zzqu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqu> CREATOR = new zzqv();
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getTenantId", mo65739id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzqu(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
